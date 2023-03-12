public class testQ2 {

    public static void main(String[] args) throws Exception {
    int amount = 100;
    String currencyType="WON"; 
    ConvertMoney convert = new ConvertMoney(amount, currencyType);
    String result = convert.doConvert();
    boolean ans = (result.equalsIgnoreCase("3,372"));
    System.out.println(" ans is "+ans);
    }
}
