// Autor : Rhuan 
package ExercicioDivisaoEConquista;
import java.util.Arrays;

public class MinMax {

    public static int[][] DivideArray(int[] array) {
        //0   1  2 3 4  5  6  7
        //28,14,6,24,18,22,12,4
        int[] part1 = new int[(array.length + 1) / 2];
        int[] part2 = new int[array.length - part1.length];

        for (int i = 0;i < array.length; i++) {
            if(i < part1.length) {
                part1[i] = array[i];
            } else {
                part2[i - part1.length] = array[i];
            }
        }

        return new int[][]{part1,part2};
    }
@SuppressWarnings("ManualMinMaxCalculation")
    public static int Max(int num1, int num2) {return num1 > num2 ? num1 : num2;};

    @SuppressWarnings("ManualMinMaxCalculation")
    public static int Min(int num1, int num2) {return num1 < num2 ? num1 : num2;}

    public static int[] MaxMin(int[] array) {
        System.out.println(array.length);
        System.out.println(array[0]);

        if(array.length == 1) return new int[]{array[0],array[0]};
        if (array.length <= 2) return new int[]{Max(array[0],array[1]),Min(array[0],array[1])};
        
        int[][] divided = DivideArray(array);
        int[] part1 = MaxMin(divided[0]);
        int[] part2 = MaxMin(divided[1]);

        return new int[]{Max(part1[0],part2[0]),Min(part1[1],part2[1])};
    }

    public static void main(String[] args) {
        int[] array = new int[]{28,14,6,24,18,22,12,4,26};

        System.out.println(Arrays.toString(MaxMin(array)));
    }
}