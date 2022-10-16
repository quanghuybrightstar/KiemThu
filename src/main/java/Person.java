public class Person {

    /*
    *   Constructor 0 parameters.
    * */
    public Person() {

    }

    /*
    *   Caculate BMI Method and return a result.
    * */
    public static String caculateBMI(double weight, double height) {
        String result = "";
        if(weight < 10.00 || weight > 1000.00 || height < 0.80 || height > 5.00) {
            result = "Input không hợp lệ";
        } else {
            double BMI = weight / (height * height);
            BMI = (double) Math.round(BMI * 10) / 10;
            if(BMI <= 18.49) {
                result = "Thiếu cân";
            } else if(BMI >= 18.50 && BMI <= 22.99) {
                result = "Bình thường";
            } else if(BMI >= 23.00 && BMI <= 24.99) {
                result = "Thừa cân";
            } else if(BMI >= 25.00) {
                result = "Béo phì";
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
