package com.campusdual.classroom;

import com.campusdual.Utils;

public class Exercise {
    public static int[] createAndInitializeArray(int size) {
        if (size <= 0) {
            return new int[0];
        }

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = Utils.integer("Introduce el elemento " + (i + 1) + " de " + size + ": ");
        }

        return array;
    }


    public static void showInlineArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("(array vacío)");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int size = Utils.integer("¿Cuántos elementos tendrá el array? ");
        int[] miArray = createAndInitializeArray(size);

        System.out.print("Array introducido: ");
        showInlineArray(miArray);
    }

}
