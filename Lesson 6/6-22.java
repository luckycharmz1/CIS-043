public class TemperatureConverter {

    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    public static void main(String[] args) {
        double fahrenheitTemp = 98.6;
        double celsiusTemp = celsius(fahrenheitTemp);
        System.out.println(fahrenheitTemp + " Fahrenheit is equal to " + celsiusTemp + " Celsius");

        double celsiusTemp2 = 37;
        double fahrenheitTemp2 = fahrenheit(celsiusTemp2);
        System.out.println(celsiusTemp2 + " Celsius is equal to " + fahrenheitTemp2 + " Fahrenheit");
    }
}