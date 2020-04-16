import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Median {
    public static void main(String[] args){
        float floatArray[]; 
        floatArray = new float[4]; 
        floatArray[0] = (float) 10.5;
        floatArray[1] = (float) 4.0;
        floatArray[2] = (float) 8.2;
        floatArray[3] = (float) 20.0;
        float m = median(floatArray);
        System.out.println("median is" + m);
    }

    public static float median(float[] floatArray) {
        if (floatArray.length == 1) {
            return floatArray[0];
        }
        Arrays.sort(floatArray);
        int middle = floatArray.length / 2;
        if (floatArray.length == 1) {
            return floatArray[0];
        } else {
            return floatArray[middle - 1] + floatArray[middle] / 2.0f;
        }
    }

    @Test
    public void testMedian1(){
        float testFloat[];
        testFloat = new float[1];
        testFloat[0] = (float) 1.0;
        assertEquals(1.0, median(testFloat));
    }

}