package com.company;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Main {
    static void zadanie2(int[][] Matrix, int n, int m) throws Exception {
        FileWriter fw = new FileWriter("zadanie2.txt");
        if (n != m) {
            System.exit(0);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if (Matrix[i][j] != Matrix[j][i]) {
                    fw.write("Not simmetry matrix");
                    fw.close();
                    System.exit(0);
                }
            }
        }
        fw.write("Simmetry matrix");
        fw.write("\r\n");

        int max=-2147483648;
        for(int i=0, j=n-1;i<n;i++, j--)
            if(Matrix[i][j] > max)
                max = Matrix[i][j];

        fw.write(max);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                fw.write(Integer.toString(Matrix[i][j]) + " ");
            }
            fw.write("\r\n");
        }
        fw.close();
    }
    static void zadanie16(int[][] Matrix, int n, int m) throws Exception {
        FileWriter fw = new FileWriter("zadanie16.txt");
        int[] ar= new int[2*n-1];
        for( int i = 0; i < n; i++ )
            for( int j = 0; j < m; j++ )
                ar[i + j] += Matrix[i][n - 1 - j];
        int maxidx = 0;
        for( int i = 1; i < n * 2 - 1; i++ )
            if( ar[i] > ar[maxidx] )
                maxidx = i;
        fw.write(maxidx);
        fw.write("\r\n");
        fw.write(ar[maxidx]);
        fw.close();
    }
    /*        fw.close();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (Matrix[i][j] == 0) {
                        fw.write("stroka s nulem");
                        fw.write(i);
                        fw.close();
                    }
                }
            }*/
/*        int[] ar = new int[2 * n - 1];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                ar[i + j] += Matrix[i][n - 1 - j];
        int maxidx = 0;
        for (int i = 1; i < n * 2 - 1; i++)
            if (ar[i] > ar[maxidx])
                maxidx = i;
        fw.write("maximum summ");
        fw.write(ar[maxidx]);
        fw.close();*/
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");
        Scanner fin = new Scanner(fr);
        int n = fin.nextInt();
        int m =  fin.nextInt();
        int[][] Matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matrix[i][j] = 0;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++)
                Matrix[i][j] = fin.nextInt();
        }
        zadanie2(Matrix, n, m);
        zadanie16(Matrix, n, m);
        fr.close();
    }
}