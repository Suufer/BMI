public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        // Пример с ростом 1.87 метра и весом 98 кг
        double height = 1.87;
        double weight = 98;

        int bmiIndex = bmiService.calculate(weight, height);
        System.out.println("BMI Index: " + bmiIndex); // должно получиться 28
    }
}