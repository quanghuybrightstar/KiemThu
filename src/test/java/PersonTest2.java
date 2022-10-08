/*
    Kiểm Thử Giá Trị Biên
* */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest2 {

    @Test
    public void testCaculateBMI2_1() {
        Person person1 = new Person(500.00, 2.10);
        String output = person1.caculateBMI();
        assertEquals("Béo phì", output);
    }

    @Test
    public void testCaculateBMI2_2() {
        Person person2 = new Person(500.00, 0.80);
        String output = person2.caculateBMI();
        assertEquals("Béo phì", output);
    }

    @Test
    public void testCaculateBMI2_3() {
        Person person3 = new Person(500.00, 0.85);
        String output = person3.caculateBMI();
        assertEquals("Béo phì", output);
    }

    @Test
    public void testCaculateBMI2_4() {
        Person person4 = new Person(500.00, 4.95);
        String output = person4.caculateBMI();
        assertEquals("Bình thường", output);
    }

    @Test
    public void testCaculateBMI2_5() {
        Person person5 = new Person(500.00, 5.00);
        String output = person5.caculateBMI();
        assertEquals("Bình thường", output);
    }

    @Test
    public void testCaculateBMI2_6() {
        Person person6 = new Person(10.00, 2.10);
        String output = person6.caculateBMI();
        assertEquals("Thiếu cân", output);
    }

    @Test
    public void testCaculateBMI2_7() {
        Person person7 = new Person(15.00, 2.10);
        String output = person7.caculateBMI();
        assertEquals("Thiếu cân", output);
    }

    @Test
    public void testCaculateBMI2_8() {
        Person person8 = new Person(995.00, 2.10);
        String output = person8.caculateBMI();
        assertEquals("Béo phì", output);
    }

    @Test
    public void testCaculateBMI2_9() {
        Person person9 = new Person(1000.00, 2.10);
        String output = person9.caculateBMI();
        assertEquals("Béo phì", output);
    }

}
