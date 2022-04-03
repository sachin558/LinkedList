public class LeedCode3 {
    static int majorityElement(int a[], int size)
    {
        // your code here

        int M=size/2;
        int c=0;
        for(int i=0;i<size;i++){
            if(a[i]==a[i+1]){
                c++;
                if(c>=M){
                    return a[i];
                }
            }
            else{
                c=0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[]={1,2,3};
        majorityElement(a,3);
    }
}
