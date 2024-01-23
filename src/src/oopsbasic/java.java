package src.oopsbasic;

public class java extends programming {
    String newFeature;

    java() {
        System.out.println("Java DC");
    }

    java(String feature){
        this.newFeature = feature;
    }
    void printInfo(){
        System.out.println("Feature is " + this.newFeature);
    }
    void car (){
        System.out.println("I am using my parent car");
    }
}

