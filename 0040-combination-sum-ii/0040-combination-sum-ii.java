class Solution
{
    public List<List<Integer>> combinationSum2(int[] candidates, int target)
    {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        Arrays.sort(candidates);
        fun(0,arr,candidates,target,ans);
        return ans;
    }
    public void fun(int n,List<Integer> arr,int[] candidates,int target,List<List<Integer>> ans)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=n;i<candidates.length;i++)
        {
            if(i!=n && candidates[i]==candidates[i-1])
                continue;
            if(candidates[i]>target)
                break;
            arr.add(candidates[i]);
            fun(i+1,arr,candidates,target-candidates[i],ans);
            arr.remove(arr.size()-1);
        }
    }
}