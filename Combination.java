class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        combine(list,new ArrayList<>(),1,n,k);
        return list ;
        
    }
    public void combine(List<List<Integer>> combs,List<Integer> comb,int start , int n ,int k)
    {
        if(k==0){
            combs.add(new ArrayList<>(comb));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            comb.add(i);
            combine(combs,comb,i+1,n,k-1);
            
        }
    }
}
