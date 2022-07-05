import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Класс, хранящий тесты класса Executor
 * @author Чужавко Егор
 */
public class Main
{
    /**
     * Тест проверки на правильное возвращаемое значение
     */
    @Test
    public void TestCorrect(){
        var matrix1=Executor.SortColumns(new int[][]{{9,8,7},{6,5,4},{3,2,1}},2);
        int[][] matrix2=new int[][]{{9,8,1},{6,5,4},{3,2,7}};
        Assert.assertArrayEquals(matrix1,matrix2);
    }


    /**
     * Тест проверки на неправильное возвращаемое значение
     */
    @Test
    public void TestIncorrect(){
        var matrix1=Executor.SortColumns(new int[][]{{9,8,7},{6,5,4},{3,2,1}},2);
        int[][] matrix2=new int[][]{{3,3,3},{1,1,1},{2,2,2}};
        Assert.assertNotEquals(matrix1,matrix2);
    }


    /**
     * Тест проверки на возвращаемое значение null
     */
    @Test
    public void TestNull(){
        var matrix1=Executor.SortColumns(null,2);
        int[][] matrix2=null;
        Assert.assertArrayEquals(matrix1,matrix2);
    }

    /**
     * Тест проверки на пустое возвращаемое значение
     */
    @Test
    public void TestEmpty(){
        var matrix1=Executor.SortColumns(new int[][]{},2);
        int[][] matrix2=null;
        Assert.assertArrayEquals(matrix1,matrix2);
    }


    /**
     * Тест проверки на правильное возвращаемое значение
     */
    @Test
    public void TestCorrectAvg(){
        int[] matrix1=Executor.FindAvg(new int[][]{{8,8,7},{6,5,4},{3,2,1}},2);
        int[] matrix2=new int[]{5};
        Assert.assertArrayEquals(matrix1,matrix2);
    }

    /**
     * Тест проверки на неправильное возвращаемое значение
     */
    @Test
    public void TestIncorrectAvg(){
        int[] matrix1=Executor.FindAvg(new int[][]{{8,8,7},{6,5,4},{3,2,1}},2);
        int[] matrix2=new int[]{2};
        Assert.assertNotEquals(matrix1,matrix2);
    }

    /**
     * Тест проверки на возвращаемое значение null
     */
    @Test
    public void TestNull1(){
        var matrix1=Executor.FindAvg(null,2);
        int[] matrix2=null;
        Assert.assertArrayEquals(matrix1,matrix2);
    }

    /**
     * Тест проверки на пустое возвращаемое значение
     */
    @Test
    public void TestEmpty1(){
        var matrix1=Executor.FindAvg(new int[][]{},2);
        int[] matrix2=null;
        Assert.assertArrayEquals(matrix1,matrix2);
    }
}
