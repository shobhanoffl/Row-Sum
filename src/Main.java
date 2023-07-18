import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];

        int c=0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int[] sum = new int[size];
        for(int i=0; i<size; i++) {
            for (int j = 0; j < size; j++) {
                sum[i] += matrix[i][j];
            }
        }

        for(int i=0;i<size;i++){
            System.out.println(sum[i]);
        }

    }
}