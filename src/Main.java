public class    Main {
    public static void main(String[] args) {
        int[] dom = new int[]{1, 2, 3};
        float[] f1 = new float[]{1.57f, 7.654f, 9.986f};
        int[] x = new int[]{1, 2, 3, 4, 5};
        // Задача 2
        for (int i = 0; i < 3; i++) {
            System.out.println(dom[i] + ",");
        }

        for (int i = 0; i < f1.length; i++) {
            System.out.println(f1[i]);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(x[i] + ",");
        }
        // Задача 3

        for (int i = dom.length - 1; i >= 0; i--) {
            System.out.print(dom[i]);
            if (i > 0) {
                System.out.print(", ");}
            }
            System.out.println(" ");

            for (int i = f1.length - 1; i >= 0; i--) {
                System.out.print(f1[i]);
            if (i > 0) {
                System.out.print(", ");}}

            System.out.println(" ");

        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i]);
            if (i > 0) {
                System.out.print(", ");}
        }
        System.out.println(" ");
        //Задача 4
        for (int i = 0; i < dom.length; i++) {
            if (dom[i] % 2 != 0) {
                dom[i]++;
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(dom[i]);
        }



    }
            }







