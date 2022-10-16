/*
*   Kiểm thử dòng điều khiển với độ phủ C2
* */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestC2 {
    @Test
    public void testCaculateBMI3_1() {
        Person person1 = new Person();
        String output = person1.caculateBMI(0.00, 0.00);
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI3_2() {
        Person person2 = new Person();
        String output = person2.caculateBMI(45.00, 1.65);
        assertEquals("Thiếu cân", output);
    }

    @Test
    public void testCaculateBMI3_3() {
        Person person3 = new Person();
        String output = person3.caculateBMI(61.00, 1.75);
        assertEquals("Bình thường", output);
    }

    @Test
    public void testCaculateBMI3_4() {
        Person person4 = new Person();
        String output = person4.caculateBMI(72.00, 1.75);
        assertEquals("Thừa cân", output);
    }

    @Test
    public void testCaculateBMI3_5() {
        Person person5 = new Person();
        String output = person5.caculateBMI(200.00, 1.89);
        assertEquals("Béo phì", output);
    }

}
