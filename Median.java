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

    public static float median(float[] values) {
        if (values.length == 1) {
            return values[0];
        }
        Arrays.sort(values);
        int middle = values.length / 2;
        if (values.length % 2 == 1) {
            return values[middle];
        } else {
            return (values[middle - 1] + values[middle]) / 2.0f;
        }
    }

    @Test
    public void testMedian1(){
        float testFloat[];
        testFloat = new float[1];
        testFloat[0] = (float) 1.0;
        assertEquals(1.0, median(testFloat));
    }
    @Test
    public void testMedian2(){
        float testFloat[];
        testFloat = new float[2];
        testFloat[0] = (float) (-1.0);
        testFloat[1] = (float) (1.0);
        assertEquals(0, median(testFloat));

    }

    @Test
    public void testMedian3(){
        float testFloat[];
        testFloat = new float[0];
        assertEquals(0, median(testFloat));
    }
    @Test
    public void testMedian4(){
        float testFloat[];
        testFloat = new float[3];
        testFloat[0] = (float) (3.12);
        testFloat[1] = (float) (8.0);
        testFloat[2] = (float) (6.3);
        assertEquals(6.3, median(testFloat));
    }

}