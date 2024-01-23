package src.oopsbasic;

public class lab002 {
    public static void main(String[] args) {
        Bankaccount sbi = new Bankaccount ();
       sbi.Bankname = "SBI";
       sbi.balance = 100;
        Bankaccount hdfc = new Bankaccount ( "HDFC" , "hdfc001" );
        sbi.printDetails();
        hdfc.printDetails();
        Bankaccount icici = new Bankaccount ( "icici", "icici003");
        icici.printDetails();
    }
}
