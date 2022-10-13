/*
    Kiểm Thử Tương Đương Mạnh
* */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest1 {

    @Test
    public void testCaculateBMI1_1() {
        Person person1 = new Person(-100.00, 0.55);
        String output = person1.caculateBMI();
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI1_2() {
        Person person2 = new Person(0.00, 1.68);
        String output = person2.caculateBMI();
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI1_3() {
        Person person3 = new Person(5.00, 5.53);
        String output = person3.caculateBMI();
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI1_4() {
        Person person4 = new Person(20.00, -1.66);
        String output = person4.caculateBMI();
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI1_5() {
        Person person5 = new Person(70.00, 1.60);
        String output = person5.caculateBMI();
        assertEquals("Béo phì", output);
    }

    @Test
    public void testCaculateBMI1_6() {
        Person person6 = new Person(200.00, 6.00);
        String output = person6.caculateBMI();
        assertEquals("Input không hợp lệ", output);
    }
    @Test
    public void testCaculateBMI1_7() {
        Person person7 = new Person(1200.00, -2.53);
        String output = person7.caculateBMI();
        assertEquals("Input không hợp lệ", output);
    }
    @Test
    public void testCaculateBMI1_8() {
        Person person8 = new Person(2002.00, 1.87);
        String output = person8.caculateBMI();
        assertEquals("Input không hợp lệ", output);
    }
    @Test
    public void testCaculateBMI1_9() {
        Person person9 = new Person(1200.00, 5.63);
        String output = person9.caculateBMI();
        assertEquals("Input không hợp lệ", output);
    }


}
