package Java.Sınıflar.Öğrenci_Bilgi_Sistemi.src;

public class Course {
    Teacher teacher;
    String name;
    String code; 
    String prefix;
    int note;
    int quiz;
    double meanPercentageOfNote;
    int finAvarage;
    
    Course(String name, String code, String prefix, double meanPercentageOfNote){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.meanPercentageOfNote = meanPercentageOfNote;
        int note = 0;
        int quizNote = 0;
    }
    
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            System.out.println("=================================" );
            System.out.println("İşlem Başarılı! Derse Öğretmen Atandı.");
        } else 
            System.out.println("Akademisyenin Branşı İle Ders Uyuşmuyor!");

    }

    void printTeacherInfo(){
        if (teacher != null) {
            System.out.println("=================================" );
            System.out.println(this.name + " dersinin Akademisyeni : " + teacher.name);
            System.out.println("=================================" );
        } else {
            System.out.println("=================================" );
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
    
    public void meanAffect(){
        
    }





}
