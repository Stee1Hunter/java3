package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите первое значение");
        int a = cs.nextInt();
        System.out.println("Введите второе значение");
        int b = cs.nextInt();
        System.out.println("Введите третье значение");
        int c = cs.nextInt();
        if(a*a + b*b == c*c || c*c + b*b == a*a || c*c + a*a == b*b)
        {
            System.out.println("стороны a,b и c являетсю сторонами прямоугольного треугольника");
        }
        else if(a==b || a==c || b==c)
        {
            System.out.println("стороны a,b и c являетсю сторонами равнобедренного треугольника");
        }
        else if(a==b && a==c)
        {
            System.out.println("стороны a,b и c являетсю сторонами равностороннего треугольника треугольника");
        }
        else if(a+b<=c || b+c<=a || a+c<=b)
        {
            System.out.println("стороны a,b и c не являетсю сторонами треугольника");
        }
        else{
            System.out.println("стороны a,b и c являетсю сторонами обычного треугольника");
        }
    }
}