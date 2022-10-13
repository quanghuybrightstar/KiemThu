/*
*   Kiểm thử dòng điều khiển với độ phủ C2
* */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestC2 {
    @Test
    public void testCaculateBMI3_1() {
        Person person1 = new Person(0.00, 0.00);
        String output = person1.caculateBMI();
        assertEquals("Input không hợp lệ", output);
    }

    @Test
    public void testCaculateBMI3_2() {
        Person person2 = new Person(45.00, 1.65);
        String output = person2.caculateBMI();
        assertEquals("Thiếu cân", output);
    }

    @Test
    public void testCaculateBMI3_3() {
        Person person3 = new Person(61.00, 1.75);
        String output = person3.caculateBMI();
        assertEquals("Bình thường", output);
    }

    @Test
    public void testCaculateBMI3_4() {
        Person person4 = new Person(72.00, 1.75);
        String output = person4.caculateBMI();
        assertEquals("Thừa cân", output);
    }

    @Test
    public void testCaculateBMI3_5() {
        Person person5 = new Person(200.00, 1.89);
        String output = person5.caculateBMI();
        assertEquals("Béo phì", output);
    }

}
