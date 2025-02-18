package javaProgramming.leve1;

public class ProfitLoss {
    public static void main(String[] args) {
        int sellingPrice = 191;
        int costPrice = 129;
        float profit = sellingPrice - costPrice;
        float loss = costPrice - sellingPrice;
        if(loss < 0) loss = 0;
        float profitPer = (profit / costPrice) * 100;
        float lossPer = (loss / costPrice) * 100;

        System.out.printf("%.2f", profitPer);
    }
}
