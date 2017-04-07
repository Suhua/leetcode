public class lc53 {
    public int maxSubArray(int[] A){
    int n = A.length;
    int[] maxSub = new int[n];
    maxSub[0]=A[0];
    int max = maxSub[0];
   
   for(int i=1; i<n;i++){
     maxSub[i] = A[i]+(maxSub[i-1]>0?maxSub[i-1]:0);
     max=Math.max(max, maxSub[i]);
  }
  return max;
}
 
    
}
