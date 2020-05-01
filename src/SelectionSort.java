import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array:-");
        Scanner sc = new Scanner(System.in);
        int min,temp = 0;

        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in the Array:-");
        for (int i = 0; i<n; i++){
            a[i] = sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            min = i;
            for(int j= i+1; j<n;j++)
            {
                if(a[j] < a[min])
                {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.println("Sorted Elements are: ");
        for(int i = 0; i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
}
