public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float result = service.calculate(50, 170);
        System.out.println(result);

        BmiService service1 = new BmiService();
        float result1 = service.calculate(71, 165);
        System.out.println(result1);

        BmiService service2 = new BmiService();
        float result2 = service.calculate(85, 150);
        System.out.println(result2);




    }
}