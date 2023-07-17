package Java.Sınıflar.Maaş_Hesaplayıcı;

public class Employee {
    String name;
    int workHours;
    int hireYear;
    int salary;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary > 1000){
            return this.salary * 0.03;
        }else
            return 0;
    }

    public int bonus(){
        if (this.workHours > 40)
            return (this.workHours-40) * 30;
        else 
            return 0;
    }

    public double raiseSalary(){
        if ((2021 - hireYear) > 0 && (2021 - hireYear) <= 9){
           return this.salary * 0.05; 
        }
        if ((2021 - hireYear) > 9 && (2021 - hireYear) <= 19){
           return this.salary * 0.1; 
        }
        if ((2021 - hireYear) > 19){
           return this.salary * 0.15; 
        } else
            return 0;
    }

    public void employeeInfo(){
        System.out.println("======================================");
        System.out.println("Çalışanın Adı: " + this.name);
        System.out.println("Çalışanın Maaşı: " + this.salary);
        System.out.println("İşe Başlangıç Yılı: " + this.hireYear);
        System.out.println("Haftalık Çalışma saati: " + this.workHours);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Zam: " + raiseSalary());
        System.out.println("Toplam Maaş: " + (this.salary + raiseSalary() + bonus() - tax()));
        System.out.println("======================================");


    }
}
