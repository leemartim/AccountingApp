import javax.swing.JOptionPane;

public class AccountingApp {

	public static void main(String[] args) {
		
		
		double valueOfSupply = Double.parseDouble(JOptionPane.showInputDialog("금액을 입력하세요."));
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        
       double[] dividendrates = new double[3];
       dividendrates[0] = 0.5;
       dividendrates[1] = 0.3;
       dividendrates[2] = 0.2;
       
       double dividend1 = income * dividendrates[0];
       double dividend2 = income * dividendrates[1];
       double dividend3 = income * dividendrates[2];
       
        System.out.println("판매원가 : " + valueOfSupply);
        System.out.println("부가세 : " + vat);
        System.out.println("합계 : " + total);
        System.out.println("원가 : " + expense);
        System.out.println("이익 : " + income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);
		
	}

}
