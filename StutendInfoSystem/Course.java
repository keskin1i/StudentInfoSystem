package StutendInfoSystem;

public class Course {
    Teacher teacher;
    String name;
    int note;
    String code;
    String prefix;

    Course(String name,String prefix,String code){
        this.code=code;
        this.prefix=prefix;
        this.name=name;
        int note =0;

    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
           PrintTeacher();
        }else{
            System.out.println("Öğretmen ve ders seçimleri uyuşmamakta.");
        }

    }

    void PrintTeacher(){
        this.teacher.print();
    }
    void addTeacher(){

    }
    void printTeacher(){

    }
}
