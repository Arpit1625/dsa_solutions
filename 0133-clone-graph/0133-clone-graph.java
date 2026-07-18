/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        HashMap <Node , Node> hm = new HashMap<>();
        if(node == null) return null;
        if(node.neighbors.size() == 0){
            Node ans = new Node (node.val);
            return ans;
        }
        return dfs (node , hm);
    }
    public Node dfs(Node node , HashMap<Node , Node> hm){
        List<Node> li = new ArrayList<>();
        Node curr = new Node(node.val);
        hm.put(node , curr);
        for(Node v : node.neighbors){
            if(hm.get(v) != null){
                li.add(hm.get(v));
            }
            else{
                li.add(dfs(v ,hm));
            }
        }
        curr.neighbors = li;
        return curr;
    }
}