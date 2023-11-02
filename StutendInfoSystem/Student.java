package StutendInfoSystem;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

Student(String name,String stuNo,Course mat,Course fizik,Course kimya){
    this.fizik=fizik;
    this.mat=mat;
    this.kimya=kimya;
    this.classes=classes;
    this.name=name;
    this.stuNo=stuNo;
    this.avarage=0.0;
    this.isPass=false;

}
void  examBulkNotes(int note1,int note2,int note3){
    if(note1>=0&&note1<=100){
        this.fizik.note=note1;
    } if(note2>=0&&note2<=100){
        this.kimya.note=note2;
    } if(note3>=0&&note3<=100){
        this.mat.note=note3;
    }
}
void printNote(){
    System.out.println("=======================");
    System.out.println(this.fizik.name+" Notu: "+ this.fizik.note);
    System.out.println(this.kimya.name+" Notu: "+ this.kimya.note);
    System.out.println(this.mat.name+" Notu: "+ this.mat.note);
    System.out.println("Ortalamanız: "+this.avarage);
}
void isPass(){
    this.avarage=(this.fizik.note+this.kimya.note+this.mat.note)/3.0;
    if (this.avarage>=55){
        System.out.println("Sınıfı başarılı bir şekilde geçtiniz.");
        this.isPass=true;
    }else{
        System.out.println("Sınıfta kaldınız önümüzdeki sene başarılar dileriz.");
        this.isPass=false;
    }
    printNote();
}


}
