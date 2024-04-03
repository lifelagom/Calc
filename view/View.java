package view;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public void print(double data, String title) {
        System.out.printf("%.0f%s", data, title);
    }
}
