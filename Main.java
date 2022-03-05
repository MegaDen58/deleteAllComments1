package com.company;
import java.util.Scanner;


class XYZ{
    double x;
    double y;

    void Sum(double x, double y){
        double z;
        if(y + 1 != 0){
            z = (x + y) / (y + 1);
            System.out.printf("Ответ: %2f", z);

        }
        else{
            System.out.println("Делитель равен 0");
        }
    }
}
public class Main {

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
    XYZ xyz = new XYZ();
    System.out.print("Введите x: ");
    double x = in.nextDouble();
    System.out.print("Введите y: ");
    double y = in.nextDouble();
    xyz.Sum(x,y);
    }
}
