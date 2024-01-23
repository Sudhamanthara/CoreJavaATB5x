package src.oopsbasic;

public class Bankaccount {
    String Bankname;
    int balance ;
    String bankcode;

Bankaccount() {
    Bankname = "SBI";
    //System.out.println("Default Constructor");
}


Bankaccount (String bname , String bankcode){
    this.Bankname = bname;
    this.bankcode = bankcode;
    System.out.println("Param Constructor");
}

    void printDetails(){
        System.out.println(this.Bankname);
        System.out.println(this.bankcode);
        //System.out.println(balance);
    }

}
