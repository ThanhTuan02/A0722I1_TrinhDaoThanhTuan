package s02_loop_array.baitap;

public class snt_nho_100 {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        while (count < 25) {
            boolean kq = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    kq = false;
                }
            }
            if (kq) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }

    }
}