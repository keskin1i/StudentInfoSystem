package StutendInfoSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut","567","KMY");
        Teacher t2 = new Teacher("Graham Bell","654","FZK");
        Teacher t3=new Teacher("Kemal","541","MAT");


        Course kimya=new Course("Kimya","KMY","101");
        kimya.addTeacher(t1);
        Course fizik=new Course("Fizik","FZK","102");
        fizik.addTeacher(t2);
        Course mat=new Course("Matematik","MAT","103");
        mat.addTeacher(t3);

        Student s1=new Student("ali","123",mat ,fizik,kimya);
        s1.examBulkNotes(100,50,70);
        s1.isPass();

        Student s2=new Student("selçuk","146",mat,fizik,kimya);
        s1.examBulkNotes(70,71,77);
        s1.isPass();

    }
}
