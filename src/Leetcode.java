import javax.swing.undo.AbstractUndoableEdit;
import java.util.Scanner;

public class Leetcode {
    public static void main(String[] args) {
        int arr[]={12, 34, 64,99,66};
        System.out.println(digits(0));
    }

    static int findnumber(int[] arr) {
        int count = 0;
        for (int nums : arr) {
            if (even(nums)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int arr) {
        int intgit = digits(arr);
        if (intgit % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int arr) {
        if(arr<0){
            arr=arr*-1;
        }
        if(arr==0){
            return 1;
        }
        int count = 0;
        while (arr >0) {
            count++;
            arr = arr / 10;
        }
        return count;
    }
}

