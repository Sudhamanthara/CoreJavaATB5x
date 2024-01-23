package src.oopsbasic;

public class animal {
    String name ;

    animal(){
        System.out.println("dc");
    }
    animal(String aanimal){
        this.name = aanimal;
            }
    void printDetail(){
        System.out.println(this.name);
    }
}
