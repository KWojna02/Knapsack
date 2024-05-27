package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wprowadz liczbe przedmiotow:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Wprowadz seed:");
        int seed = Integer.parseInt(sc.nextLine());
        System.out.println("Wprowadz dolna granice:");
        int lowerBound = Integer.parseInt(sc.nextLine());
        System.out.println("Wprowadz gorna granice:");
        int upperBound = Integer.parseInt(sc.nextLine());

        Problem problem = new Problem(n, seed, lowerBound, upperBound);

        System.out.println("Wprowadz pojemnosc plecaka:");
        int c = Integer.parseInt(sc.nextLine());
        Result result = problem.solve(c);
        System.out.print(problem);
        System.out.println();
        System.out.print(result);
    }
}
