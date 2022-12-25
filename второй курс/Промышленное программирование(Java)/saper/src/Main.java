import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)  throws Exception {
        FileWriter fr = new FileWriter("output.txt");
        FileReader gr = new FileReader("input.txt");
        Scanner scan = new Scanner(gr);
        int n = scan.nextInt();
        int x,y;
        int m = scan.nextInt();
        int kolvo = scan.nextInt();
        int[][] Matrix = new int[n+2][m+2];
        for (int i = 0; i < n+2; i++) {
            for (int j = 0; j < m + 2; j++) {
                Matrix[i][j] = 0;
            }
        }
        while(kolvo != 0){
            x = scan.nextInt();
            y = scan.nextInt();
            Matrix[x][y] =-1;
            kolvo--;
        }
        int b=0;
        for (int i = 1; i < n+1; i++)
            for (int j = 1; j < m+1; j++)
            {
                if(Matrix[i][j] == -1)
                {
                    b=0;
                }
                else {
                    if (Matrix[i - 1][j - 1] == -1) {
                        b++;
                    }
                    if (Matrix[i - 1][j] == -1) {
                        b++;
                    }
                    if (Matrix[i - 1][j + 1] == -1) {
                        b++;
                    }
                    if (Matrix[i][j - 1] == -1) {
                        b++;
                    }
                    if (Matrix[i][j + 1] == -1) {
                        b++;
                    }
                    if (Matrix[i + 1][j - 1] == -1) {
                        b++;
                    }
                    if (Matrix[i + 1][j] == -1) {
                        b++;
                    }
                    if (Matrix[i + 1][j + 1] == -1) {
                        b++;
                    }
                    Matrix[i][j] = b;
                    b = 0;
                }
            }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if(Matrix[i][j] != -1){
                    fr.write(Integer.toString(Matrix[i][j]));
                    fr.write(" ");
                }
                else{
                    fr.write("*");
                    fr.write(" ");
                }
            }
            fr.write("\n");
        }
        gr.close();
        fr.close();
    }
}