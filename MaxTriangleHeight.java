public class MaxTriangleHeight {
    public static int maxTriangleHeight(int red, int blue) {
        int h = 0;
        while (true) {
            h += 1;
            int color1_balls, color2_balls; 
            if (h % 2 == 0) {
                color1_balls = (h/2) * (h/2);
                color2_balls = (h/2) * (h/2 + 1);
            } else {
                color1_balls = ((h+1)/2) * ((h+1)/2);
                color2_balls = ((h-1)/2) * ((h+1)/2);
            } 
            if ((red >= color1_balls && blue >= color2_balls) || (red >= color2_balls && blue >= color1_balls)) {
                continue;
            } else {
                return h - 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(maxTriangleHeight(2, 3));
        System.out.println(maxTriangleHeight(5, 8));
        System.out.println(maxTriangleHeight(7, 10));
        System.out.println(maxTriangleHeight(2, 1));
    }
}

