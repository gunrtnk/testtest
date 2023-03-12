import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) throws Exception {

        Scanner inputAmount = new Scanner(System.in);
        System.out.print("Number on THB : ");
        int amount = inputAmount.nextInt();

        Scanner inputType = new Scanner(System.in);
        System.out.print("Convert To Currency Type : ");
        String currencyType = inputType.nextLine();

        ConvertMoney convert = new ConvertMoney(amount, currencyType);
        String result = convert.doConvert();
        System.out.println("Number Of Converted ( "+ result +" "+currencyType+" )");

     }
}
