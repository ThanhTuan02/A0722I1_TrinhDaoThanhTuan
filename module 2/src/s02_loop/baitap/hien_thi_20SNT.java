package s02_loop.baitap;

public class hien_thi_20SNT {
    public static void main(String[] args) {
        int count = 0, N =2;
        while (N <100 ) {
            boolean kq = true;
            for (int i = 2; i < N;i++){
                if(N % i == 0) {
                    kq = false;
                }
            }
            if (kq) {
                System.out.print(N+" ");
                count++;
            }
            N++;
        }
    }
}
