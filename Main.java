import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //1 задание
        long[] a = new long[8];
        for (int k = 0; k < 8; k++)
            a[k] = 3 + k * 2;

        //2 задание
        double[] x = new double[13];
        for (int j = 0; j < 13; j++) {
            x[j] = (Math.random() * 16) - 4;
        }

        //3 задание

        //задаём массив и заполняем его
        double[][] array = new double[8][13];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 13; j++) {
                if (a[i] == 9) {
                    array[i][j] = Math.sin(Math.atan(Math.pow((x[j] + 4) / 16, 2)));
                } else if (a[i] == 5 || a[i] == 11 || a[i] == 13 || a[i] == 15) {
                    array[i][j] = Math.tan(Math.pow(Math.sin(x[j]), (Math.log(Math.abs(x[j]))) / 2));
                } else {
                    array[i][j] = Math.atan(Math.pow(Math.E, Math.cbrt(-Math.pow(Math.cos(x[j]), 2))));
                }
            }
        }

        //форматированный вывод
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(String.format("%.5f", array[i][j]) + "\t"); //форматированный вывод строк
            }
            System.out.println();
        }
    }
}