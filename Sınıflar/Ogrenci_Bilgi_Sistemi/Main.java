package Java.Sınıflar.Öğrenci_Bilgi_Sistemi.src;

public class Main {
    public static void main(String[] args) {
        Teacher T1 = new Teacher("Arzu", "TRH", 0537465654);
        Teacher T2 = new Teacher("Ayşegül", "MAT", 05374321111);
        Teacher T3 = new Teacher("Osman", "FZK", 05374321254);
        

        Course Tarih = new Course("Tarih", "150", "TRH", 0.6);
        Course Matematik = new Course("Matematik", "250", "MAT", 0.7);
        Course Fizik = new Course("Fizik", "350", "FZK", 0.7);

        Student s1 = new Student("Arif", "10110", "3", Tarih, Matematik, Fizik);
        Student s2 = new Student("Halil", "10011", "3", Tarih, Matematik, Fizik);
        Student s3 = new Student("Aslı", "10016", "3", Tarih, Matematik, Fizik);
        
        Tarih.addTeacher(T1);
        Matematik.addTeacher(T2);
        Fizik.addTeacher(T3);
        
        s1.addBulkExam_Quiz(100, 50, 100, 60, 50, 90);
        s1.isPass();

    


    }
}
