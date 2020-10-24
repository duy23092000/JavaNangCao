package day2;

// thuật toán sắp xếp chèn
public class InsertionSortExample {

    public static void printArray(int no, int[] a) {
        System.out.printf("Loop %d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }


    public static void insertSorting(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            // chèn a[i] vào dãy 0 -> i - 1;
            int ai = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > ai) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = ai;
            printArray(i, a);
        }
    }

    public static void main(String[] args) {
        int[] a = {5,3,2,7,8,1,2};
        insertSorting(a);
    }
}
