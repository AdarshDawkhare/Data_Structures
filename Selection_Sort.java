//---------------------------------------------------------------------  Selection Sort in Java -------------------------------------------------------------------------------

public class SelectionSort 
{
    public static void display(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) 
    {
        int array[] = {70, 30, 50, 10, 20, 40, 60, 100, 90, 80};
        System.out.println("Given array");
        display(array);

        selectionSort(array);

        System.out.println("Sorted array");
        display(array);
    }
}
