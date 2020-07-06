package org.fasttrackit.controller.utils;

import java.util.Scanner;

public class ScannerUtil {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static int readNexSingleInt() {
        int integer = SCANNER.nextInt();
        SCANNER.nextLine();
        return integer;
    }

    public static double readNexSingleDouble() {
        try {
            return SCANNER.nextDouble();
        } finally {
            SCANNER.nextLine();
        }
    }
}
