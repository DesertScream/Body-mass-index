public class BmiService {
    public float calculate(float weight, float height) {
        float bmi = (100 * 100 * weight) / (height * height);

        if (bmi <= 16) {
            System.out.println("Ваш индекс массы тела (ИМТ) равен: " + bmi + " Выраженный дефицит массы тела");
        } else if (bmi > 17 && bmi <= 18) {
            System.out.println("Ваш индекс массы тела (ИМТ) равен: " + bmi + " Недостаточная масса тела (дефицит)");
        } else if (bmi >= 19 && bmi <= 24) {
            System.out.println("Ваш индекс массы тела (ИМТ) равен: " + bmi + " Нормальная масса тела");
        } else if (bmi >= 25 && bmi <= 30) {
            System.out.println("Ваш индекс массы тела (ИМТ) равен: " + bmi + " Избыточная масса тела (предожирение)");
        } else if (bmi >= 30 && bmi <= 35) {
            System.out.println("Ваш индекс массы тела (ИМТ) равен: " + bmi + " Ожирение I степени");
        } else if (bmi >= 36 && bmi <= 40) {
            System.out.println("Ваш индекс массы тела (ИМТ) равен: " + bmi + " Ожирение II степени");
        } else {
            System.out.println("Ваш индекс массы тела (ИМТ) равен: " + bmi + " Ожирение III степени");
        }
        return bmi;
    }
}
