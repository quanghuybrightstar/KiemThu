/*
*   Kiểm thử dòng dữ liệu theo phủ all-c-uses/ some-p-uses
* */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestAllCSomeP {
    @Test
    public void testCaculateBMI4_1() {
        Person person1 = new Person();
        String output = person1.caculateBMI(48.00, 1.65);
        assertEquals("Thiếu cân", output);
    }

    @Test
    public void testCaculateBMI4_2() {
        Person person1 = new Person();
        String output = person1.caculateBMI(43.00, 1.63);
        assertEquals("Thiếu cân", output);
    }

    @Test
    public void testCaculateBMI4_3() {
        Person person1 = new Person();
        String output = person1.caculateBMI(5.00, 1.21);
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI4_4() {
        Person person2 = new Person();
        String output = person2.caculateBMI(45.00, 1.65);
        assertEquals("Thiếu cân", output);
    }

    @Test
    public void testCaculateBMI4_5() {
        Person person3 = new Person();
        String output = person3.caculateBMI(61.00, 1.75);
        assertEquals("Bình thường", output);
    }

    @Test
    public void testCaculateBMI4_6() {
        Person person4 = new Person();
        String output = person4.caculateBMI(72.00, 1.75);
        assertEquals("Thừa cân", output);
    }

    @Test
    public void testCaculateBMI4_7() {
        Person person5 = new Person();
        String output = person5.caculateBMI(200.00, 1.89);
        assertEquals("Béo phì", output);
    }
}
