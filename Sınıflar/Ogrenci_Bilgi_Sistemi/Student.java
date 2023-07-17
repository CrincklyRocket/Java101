package Java.Sınıflar.Öğrenci_Bilgi_Sistemi.src;

public class Student {
    Course Tarih;
    Course Matematik;
    Course Fizik;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course Tarih,Course Matematik ,Course Fizik){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.Tarih = Tarih;
        this.Matematik = Matematik;
        this.Fizik = Fizik;
        this.avarage = 0.0;
        this.isPass = false;
    }

    public void addBulkExam_Quiz(int noteT, int noteM, int noteF,int quizT, int quizM, int quizF){
        if (noteT >= 0 && noteT <= 100)
            Tarih.note = noteT;
        if (noteM >= 0 && noteM <= 100)
            Matematik.note = noteM;
        if (noteF >= 0 && noteF <= 100)
            Fizik.note = noteF;

        if (quizT >= 0 && quizT <= 100)
            Tarih.quiz = quizT;
        if (quizM >= 0 && quizM <= 100)
            Matematik.quiz = quizM;
        if (quizF >= 0 && quizF <= 100)
            Fizik.quiz = quizF;
    }
   

    public void printNote(){
        System.out.println("=================================" );
        System.out.println("Tarih Notu: " + this.Tarih.finAvarage);
        System.out.println("Matematik Notu: " + this.Matematik.finAvarage);
        System.out.println("Fizik Notu: " + this.Fizik.finAvarage);
    }

    public void calcAvarage(){
        Tarih.finAvarage = (int)(Tarih.note * Tarih.meanPercentageOfNote) + (int)(Tarih.quiz *(1-Tarih.meanPercentageOfNote));
        Matematik.finAvarage = (int)(Matematik.note * Matematik.meanPercentageOfNote) + (int)(Matematik.quiz *(1-Matematik.meanPercentageOfNote));
        Fizik.finAvarage = (int)(Fizik.note * Fizik.meanPercentageOfNote) + (int)(Fizik.quiz *(1-Fizik.meanPercentageOfNote));

        this.avarage = (Tarih.finAvarage + Matematik.finAvarage + Fizik.finAvarage)/3 ;
    }

    public boolean isCheckPass(){
        calcAvarage();
        return this.avarage > 55;
    }
    
    public void isPass(){
        if (this.Matematik.note == 0 || this.Fizik.note == 0 || this.Tarih.note == 0) 
            System.out.println("Notlar tam olarak girilmemiş");

        else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) 
                System.out.println(this.name + " Sınıfı Geçti. ");
            else 
                System.out.println(this.name +" Sınıfta Kaldı.");
        }   
    }

    
    
    

 
}
