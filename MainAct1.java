public class MainAct1{
    /*Static Methods*/
    public static double calculateAverage(double[] numbers){
        if(numbers.length==0){
            return 0.0;
        }
        double sum = 0;
        for(double number: numbers){
            sum +=number;
        }
        return sum/numbers.length;
    }
    public static void main(String[] ars){
        double[] data = {10.0, 20.0, 30.0, 40.0, 50.0};
        double average = CalculateAveNumbers.calculateAverage(data);
        System.out.println("Average: "+average);
    }
}