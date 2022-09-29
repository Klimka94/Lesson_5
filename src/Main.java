public class Main {
    public static void main(String[] args) {

        int[] arr = new int[30];//Задача 1, 2 и 3
        int sum = 0;
        int min = 200000;
        int max = 100000;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int)(Math.random() * 100000) + 100000;
                sum += arr[i];
                if (arr[i]<=min) {
                    min = arr[i];
                }
                if (arr[i]>=max) {
                    max = arr[i];
                }
        }
        System.out.println("Месячная сумма трат равна " + sum + " рублей.");
        System.out.println("Средние затраты в день равны " + sum/30 + " рублей в день.");
        System.out.println("Минимальные расходы за день равны " + min + " рублей.");
        System.out.println("Максимальные расходы за день равны " + max + " рублей.");


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};//Задача 4
            for (int i = reverseFullName.length - 1; i>=0; i--) {
             System.out.print(reverseFullName[i]);
            }
            System.out.println();

        int [][] matrix = new int [3][3];//Задача 5
            for (int[] row : matrix) {
                for (int column : row) {
                    System.out.print(column + " ");
                }
                System.out.println();
        }

        int[] array = {5, 4, 3, 2, 1};// Задача 6
        int[] arrayReversed = new int[4];
            for (int i = array.length-1; i >= 0; i--); {
                
        }

        int[] array1 = {5, 4, 3, 2, 1};// Задача 7
            for (int i = 0; i < array1.length; i++) {
                System.out.print(array1[i] + " ");
            }
        System.out.println();
            for (int j = array1.length-1; j>=0; j--) {
                System.out.print(array1[j] + " ");
            }
            System.out.println();

        int[] arry = new int[10]; //Задача 8 (инициализировал значения массива вручную, ибо идея ругалась :( )
            arry[0] = -6;
            arry[1] = 2;
            arry[2] = 5;
            arry[3] = -8;
            arry[4] = 8;
            arry[5] = 10;
            arry[6] = 4;
            arry[7] = -7;
            arry[8] = 12;
            arry[9] = 1;
            int summa = -2;
                for (int i = 0; i < arry.length; i++) {
                    if (summa-arry[0]==arry[i]){
                        System.out.println("Два элемента массива: " + arry[0] + ", " + arry[i]);
                    }
                }

        int[] arry1 = new int[10]; //Задача 9
        arry1[0] = -6;
        arry1[1] = 2;
        arry1[2] = 5;
        arry1[3] = -8;
        arry1[4] = 8;
        arry1[5] = 10;
        arry1[6] = 4;
        arry1[7] = -7;
        arry1[8] = 12;
        arry1[9] = 1;
            for (int i = 0; i < arry1.length; i++) {

            }
    }
}