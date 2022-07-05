import java.util.ArrayList;
import java.util.Arrays;


/**
 * Класс для выполнения тестов функций
 * Дана квадратная матрица. Отсортировать столбцы, индекс которых
 * кратен числу а (вводимому с клавиатуры), по возрастанию. Для
 * остальных найти среднее значение.
 * @author Чужавко Егор
 */
public class Executor
{
    /**
     * Функция для сортировки колонок, индексы которых кратны вводимому числу
     * @param matrix сама матрица, которая будет сортироваться
     * @param number число, которое будет сравниваться с индексом столбца на кратность
     * @return возвращает отсортированный массив
     */
    public static int[][] SortColumns(int[][] matrix, int number){
        if(matrix==null ||matrix.length==0){
            return null;
        }
        for(int j =0;j<matrix.length;j++){
            if(j%number==0 & j>0){
                for(int e=1;e<=2;e++){
                    for(int i =0;i<matrix.length-1;i++){
                        if(matrix[i][j]>matrix[i+1][j]){
                            int temp=matrix[i][j];
                            matrix[i][j]=matrix[i+1][j];
                            matrix[i+1][j]=temp;
                        }
                    }
                }
            }
        }
        return matrix;
    }

    /**
     * Функция для нахождения среднего числа столбцов, индексы которых не кратны вводимому числу
     * @param matrix сама матрица, хранящая данные
     * @param number число, которое будет сравниваться с индексом столбца на кратность
     * @return возвращает массив средних чисел
     */
    public static int[] FindAvg(int[][] matrix,int number){
        if(matrix==null ||matrix.length==0){
            return null;
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int j =0;j<matrix.length;j++){
            if(j%number!=0 & j>0){
                al.add(j);
            }
        }
        int ch=0;
        int index=0;
        int[]avg=new int[al.size()];
        for(Integer q: al){
            ch=0;
            for(int i =0;i<matrix.length;i++){
                ch+=matrix[q][i];
            }
            avg[index]=ch/matrix.length;
            index++;
        }
        return avg;
    }
}
