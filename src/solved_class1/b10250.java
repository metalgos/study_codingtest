package solved_class1;

import java.util.Scanner;

public class b10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int step = sc.nextInt();

        for (int i = 0; i < step; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int[][] arr = new int[w][h];

            int count = n;
            loop1:
            for (int k = 0; k < w; k++) {


                for (int j = 0; j < h; j++) {
                    arr[k][j] = 1;
                    count--;
                    if (count < 1) {
                        if(k+1<10) {
                            System.out.println((j + 1) + "0" + (k + 1));
                            break loop1;
                        }else {
                            System.out.println((j + 1) + "" + (k + 1));
                            break loop1;
                        }
                    }

                }


            }

        }
    }
}