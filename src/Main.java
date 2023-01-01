public class Main {
    public static void main(String[] args) {

    int moneyBill = 121;
    int depositAmount = 1001;
    int bonuses = 0;
    int minDepositAmountForFetBonuses = 1000;
    if(depositAmount >minDepositAmountForFetBonuses)

    {
        bonuses = depositAmount / 100;
    }

    moneyBill=bonuses+moneyBill+depositAmount;
    System.out.println("Денег на счету:"+moneyBill+"Размер бонуса:"+bonuses);

}
}
