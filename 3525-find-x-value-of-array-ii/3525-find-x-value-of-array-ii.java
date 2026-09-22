class Solution {
    class Node {
        int prod;
        int[] cnt;

        Node(int k) {
            cnt = new int[k];
        }
    }

    int k;
    Node[] tree;

    Node merge(Node a, Node b) {
        Node res = new Node(k);
        res.prod = (int)((long)a.prod * b.prod % k);

        for (int r = 0; r < k; r++) {
            res.cnt[r] = a.cnt[r];
        }

        for (int r = 0; r < k; r++) {
            int nr = (int)((long)a.prod * r % k);
            res.cnt[nr] += b.cnt[r];
        }

        return res;
    }

    void build(int idx, int l, int r, int[] nums) {
        if (l == r) {
            tree[idx] = new Node(k);
            tree[idx].prod = nums[l] % k;
            tree[idx].cnt[tree[idx].prod] = 1;
            return;
        }

        int mid = (l + r) >>> 1;
        build(idx << 1, l, mid, nums);
        build(idx << 1 | 1, mid + 1, r, nums);
        tree[idx] = merge(tree[idx << 1], tree[idx << 1 | 1]);
    }

    void update(int idx, int l, int r, int pos, int val) {
        if (l == r) {
            tree[idx] = new Node(k);
            tree[idx].prod = val % k;
            tree[idx].cnt[tree[idx].prod] = 1;
            return;
        }

        int mid = (l + r) >>> 1;

        if (pos <= mid)
            update(idx << 1, l, mid, pos, val);
        else
            update(idx << 1 | 1, mid + 1, r, pos, val);

        tree[idx] = merge(tree[idx << 1], tree[idx << 1 | 1]);
    }

    Node query(int idx, int l, int r, int ql, int qr) {
        if (ql <= l && r <= qr)
            return tree[idx];

        int mid = (l + r) >>> 1;

        if (qr <= mid)
            return query(idx << 1, l, mid, ql, qr);

        if (ql > mid)
            return query(idx << 1 | 1, mid + 1, r, ql, qr);

        return merge(
            query(idx << 1, l, mid, ql, qr),
            query(idx << 1 | 1, mid + 1, r, ql, qr)
        );
    }

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.k = k;
        int n = nums.length;
        tree = new Node[4 * n];

        build(1, 0, n - 1, nums);

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0];
            int value = queries[i][1];
            int start = queries[i][2];
            int x = queries[i][3];

            update(1, 0, n - 1, index, value);

            Node res = query(1, 0, n - 1, start, n - 1);
            ans[i] = res.cnt[x];
        }

        return ans;
    }
}