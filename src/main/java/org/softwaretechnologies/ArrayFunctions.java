package org.softwaretechnologies;

public final class ArrayFunctions {

    private ArrayFunctions() {

    }

    /**
     * Функция, меняющая порядок элементов в массиве array на обратный.
     * @param array массив, который будет перевернут.
     */
    public static void reverse(int[] array) {
        int ln = array.length;
        if (ln < 2) return;
        ln--;
        for (int i = 0; i < ln; ln--, i++ ){
            int buf = array[i];
            array[i] = array[ln];
            array[ln] = buf;////////
        }
    }
        // TODO: реализуйте вышеуказанную функцию


    /**
     * Функция, заменяющая строки матрицы на столбцы матрицы. Пример:
       1  2  3     1  4  7
       4  5  6     2  5  8
       7  8  9     3  6  9
     * Функция работает только с квадратными матрицами.
     * Если матрица не квадратная, то выведете на экран сообщение:
       Матрица не квадратная
     * @param matrix матрица, в которой столбцы будут заменены на строки.
     */
    public static void rotateMatrix(int[][] matrix) {
        // TODO: реализуйте вышеуказанную функцию
        int ln = matrix.length;
        int h = matrix[0].length;
        if ( ln != h) {
            System.out.println("Матрица не квадратная");
            return;
        }
        for (int i = 0; i < ln; i++) {
            for (int j = i; j < h; j ++){
                int buf = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = buf;
            }
        }
    }
    }

