package StutendInfoSystem;

public class Teacher {
    String name;
    String mpNo;
    String branch;

    Teacher(String name,String mpNo,String branch){
        this.branch=branch;
        this.mpNo=mpNo;
        this.name=name;

    }

    void print(){
        System.out.println("Öğretmenin Adı: "+this.name);
        System.out.println("Öğretmenin Branşı: "+this.branch);
        System.out.println("Öğretmenin Telefon Numarası: "+this.mpNo);
    }
}
