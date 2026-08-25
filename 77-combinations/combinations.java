class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        solve(1, n, k, new ArrayList<>(), res);
        return res;
    }

    void solve(int start, int n, int k, List<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i <= n; i++) {
            temp.add(i);
            solve(i + 1, n, k, temp, res);
            temp.remove(temp.size() - 1);
        }
    }
}