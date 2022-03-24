package sorting;

import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        MergesSortingInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void MergesSortingInplace(int arr[],int s,int e){
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        MergesSortingInplace(arr,s,mid);
        MergesSortingInplace(arr,mid,e);
        MergesInplace(arr,s,mid,e);
    }
    static void  MergesInplace(int []arr,int s,int mid,int e){
        int mix[]=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while (i<mid&&j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int a = 0; a < mix.length; a++) {
            arr[s+a]=mix[a];
        }
    }
}