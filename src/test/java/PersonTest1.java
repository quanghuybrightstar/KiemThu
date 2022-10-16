/*
    Kiểm Thử Tương Đương Mạnh
* */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest1 {

    @Test
    public void testCaculateBMI1_1() {
        Person person1 = new Person();
        String output = person1.caculateBMI(-100.00, 0.55);
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI1_2() {
        Person person2 = new Person();
        String output = person2.caculateBMI(0.00, 1.68);
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI1_3() {
        Person person3 = new Person();
        String output = person3.caculateBMI(5.00, 5.53);
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI1_4() {
        Person person4 = new Person();
        String output = person4.caculateBMI(20.00, -1.66);
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI1_5() {
        Person person5 = new Person();
        String output = person5.caculateBMI(70.00, 1.60);
        assertEquals("Béo phì", output);
    }

    @Test
    public void testCaculateBMI1_6() {
        Person person6 = new Person();
        String output = person6.caculateBMI(200.00, 6.00);
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI1_7() {
        Person person7 = new Person();
        String output = person7.caculateBMI(1200.00, -2.53);
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI1_8() {
        Person person8 = new Person();
        String output = person8.caculateBMI(2002.00, 1.87);
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI1_9() {
        Person person9 = new Person();
        String output = person9.caculateBMI(1200.00, 5.63);
        assertEquals("Input không hợp lệ", output);
    }

}
