package day2;


public class BubbleSortExample {

    public static void printResult(int no, int[] a) {
        System.out.printf("Loop %d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void bubbleSorting(int[] a) {
        int n = a.length;

        // duyệt mảng từ đầu đến cuối
        for (int i = 0; i < n; i++) {

            //khai báo biến boolean isSorted = true
            boolean isSorted = true;

            // duyệt 2 số cạnh nhau
            for (int j = 0; j < n - i - 1; j++) {
                if(a[j] > a[j+1]) {

                    // đổi chỗ 2 giá trị nếu giá trị trước lớn hơn giá trị sau
                    isSorted = false;
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
            printResult(i + 1, a);

            //kiểm tra xem mảng đã sorted chưa, tránh trường hợp sorted rồi mà vẫn duyệt đi duyệt lại
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5,3,2,7,8,1,2};
//        int[] b = {1,2,3,4,5,7,6};
        bubbleSorting(a);
    }
}
