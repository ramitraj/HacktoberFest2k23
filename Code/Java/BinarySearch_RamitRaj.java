import java.util.Scanner;

public class BinarySearch_RamitRaj {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Enter the number to be searched : ");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int result=binarySearch(arr,number);
        if(result==-1)
        {
            System.out.println("Number not found");
        }
        else {
            System.out.println("Number present on index "+result);
        }

    }
    private static int binarySearch(int arr[], int number){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
//            explaination--> low+high/2-low/2 -->low/2+high/2 -->(low+high)/2
            if(arr[mid]==number)return mid;
            else if (arr[mid]<number){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
