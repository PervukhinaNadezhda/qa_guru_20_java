package org.example;

public class Main {
    public static void main(String[] args) {

//Поупражняться с математическими и логическими операторами,
//добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        float d = 8.5F;
        double f = 8.5;

        System.out.println((byte) (a + 1));
        System.out.println((short) (b + 2));

        System.out.println(c + 1);
        System.out.println(d - 1);
        System.out.println(f * 2);
        System.out.println(c / 70);
        System.out.println(c % 70);
        System.out.println(c % 70);

        int x = 2;
        int y = 2;
        System.out.println(++x);
        System.out.println(--y);

        System.out.println("********************************");
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;


        if (A < B && C > D)
            System.out.println(true);
        else
            System.out.println(false);

        if (A < B || C > D)
            System.out.println(true);
        else
            System.out.println(false);

//попробовать вычисления комбинаций типов данных (int и double)
        System.out.println("********************************");
        int i = 5;
        double j = 5.5;

        System.out.println(i*j);
        System.out.println(i/j);
        System.out.println((int)(i*j));
        System.out.println((double)(i*i));

    }
}