class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        backtrack(candidates, target,0, new ArrayList<>(), res);
        return res;  
    }
    private void backtrack(int[] arr, int target, int index, List<Integer> temp, List<List<Integer>> res){
        if (target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(target<0) return;
        for(int i= index; i<arr.length;i++){
            temp.add(arr[i]);
            backtrack(arr, target- arr[i],i, temp,res);
            temp.remove(temp.size()- 1);
        }
    }
}