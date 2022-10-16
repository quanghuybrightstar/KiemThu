/*
    Kiểm Thử Giá Trị Biên
* */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest2 {

    @Test
    public void testCaculateBMI2_1() {
        Person person1 = new Person();
        String output = person1.caculateBMI(500.00, 2.10);
        assertEquals("Béo phì", output);
    }

    @Test
    public void testCaculateBMI2_2() {
        Person person2 = new Person();
        String output = person2.caculateBMI(500.00, 0.80);
        assertEquals("Béo phì", output);
    }

    @Test
    public void testCaculateBMI2_3() {
        Person person3 = new Person();
        String output = person3.caculateBMI(500.00, 0.85);
        assertEquals("Béo phì", output);
    }

    @Test
    public void testCaculateBMI2_4() {
        Person person4 = new Person();
        String output = person4.caculateBMI(500.00, 4.95);
        assertEquals("Bình thường", output);
    }

    @Test
    public void testCaculateBMI2_5() {
        Person person5 = new Person();
        String output = person5.caculateBMI(500.00, 5.00);
        assertEquals("Bình thường", output);
    }

    @Test
    public void testCaculateBMI2_6() {
        Person person6 = new Person();
        String output = person6.caculateBMI(10.00, 2.10);
        assertEquals("Thiếu cân", output);
    }

    @Test
    public void testCaculateBMI2_7() {
        Person person7 = new Person();
        String output = person7.caculateBMI(15.00, 2.10);
        assertEquals("Thiếu cân", output);
    }

    @Test
    public void testCaculateBMI2_8() {
        Person person8 = new Person();
        String output = person8.caculateBMI(995.00, 2.10);
        assertEquals("Béo phì", output);
    }

    @Test
    public void testCaculateBMI2_9() {
        Person person9 = new Person();
        String output = person9.caculateBMI(1000.00, 2.10);
        assertEquals("Béo phì", output);
    }

}
