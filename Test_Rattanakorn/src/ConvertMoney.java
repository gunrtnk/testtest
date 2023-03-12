import java.text.NumberFormat;

public class ConvertMoney {
    private int amount;
    private String currencyType;
   // private double result;

    public ConvertMoney(int amount, String currencyType){
        this.amount=amount;
        this.currencyType=currencyType;
    }

    /**
     * @return string
     */
    public String doConvert(){
        double rate;

        if(currencyType.equalsIgnoreCase("WON")){
            rate=33.72;
        }
        else if(currencyType.equalsIgnoreCase("USD")){
            rate=0.028;
        }  
        else if(currencyType.equalsIgnoreCase("YEN")){
              rate=3.4;
        }
        else{
            rate=1.00;
            System.out.println("Currency type is not correct. Please try again.!");
        }
        NumberFormat style = NumberFormat.getNumberInstance();
        return style.format(amount*rate);

    }
}
