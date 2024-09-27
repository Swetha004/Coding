class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                sum=sum+mat[i][j];
            }
            map.put(i,sum);
        }
        int[] k1=new int[k];
        int i=0;
        List<Map.Entry<Integer,Integer>> sorts=new ArrayList<>(map.entrySet());
        sorts.sort(Map.Entry.comparingByValue());
        for(Map.Entry<Integer,Integer> e:sorts){
            if(k>0){
                k1[i++]=e.getKey();
                k--;
            }
            else{
                break;
            }
        }
        return k1;
    }
}