class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        solve(nums, new ArrayList<>(), res);
        return res;
        
    }
    void solve(int[] nums, List<Integer> temp, List<List<Integer>> res){
        if(temp.size()== nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int x:nums){
            if (temp.contains(x)) continue;
            temp.add(x);
            solve(nums, temp, res);
            temp.remove(temp.size()-1);
        }
    }
}