package day2;

public class SelectionSortExample {

    public static void printArray(int no, int[] a)
    {
        System.out.printf("Loop %d: ", no);
        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void selectionSorting(int[] a)
    {
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < n ; j++)
            {

                // tìm min[i, n]
                if (a[j] < a[minIndex])
                {
                    minIndex = j;
                }
            } // đổi chỗ
            if (minIndex != i)
            {
                int t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
        printArray(i + 1, a);
        }
    }

    public static void main(String[] args)
    {
        int[] a = {5,3,2,7,8,1,2};
        selectionSorting(a);
    }
}
