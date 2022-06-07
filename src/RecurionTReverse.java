public class RecurionTReverse {
   public static double findMedianSortedArrays(int[] A, int[] B) {
      int m=A.length;
      int n=B.length;
      int k=0;
      int []c=new int[m+n];
      for(int i=0;i<A.length;i++){
         c[k]=B[i];
         k++;
      }
      k++;
      for (int i=0;i<B.length;i++){
         c[k]=B[i];
         k++;
      }
      if(c.length%2==0){
         int r=(c.length/2)-1;
         int l=r+1;
         int ans=c[r]+c[l];
         System.out.println(ans);
         return (double)ans/2.0;
      }
      else{
         int j=c.length/2;
         return (double) c[j];
      }
   }

   public static void main(String[] args) {
      int A[]={1,3};
      int B[]={2};
      findMedianSortedArrays(A,B);
   }
}
