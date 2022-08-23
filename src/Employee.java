public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;

    double raiseSalary = 0.0;
    double bonus;

    int thisYear = 2021;

    public Employee (String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void tax(){
        if (this.salary > 1000){
            this.tax = salary*0.03;

        } else{
            System.out.println("Calisanin maasi 1000 TL den az vergi uygulanamaz.");
        }
    }


    void bonus(){
        if (this.workHours > 40){
           this.bonus = (this.workHours-40)*30;
        } else {
            this.bonus  = 0;
        }
    }

    void raiseSalary(){
        if (thisYear - this.hireYear < 10 ){
            raiseSalary = salary * 0.05;
        }
        if ((thisYear - this.hireYear > 9) && (thisYear - this.hireYear < 20)){
            raiseSalary = salary * 0.10;
        }
        if (thisYear - this.hireYear > 19){
            raiseSalary = salary * 0.15;
        }
    }


    void toPrint() {
        System.out.println("Adi: " + this.name);
        System.out.println("Maasi: " + this.salary);
        System.out.println("Calisma Saati: " + this.workHours);
        System.out.println("Baslangic Yili: " + this.hireYear);
        System.out.println("Vergi: " + this.tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Maas Artisi: " + this.raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maas: " + (this.salary + this.bonus - this.tax));
        System.out.println("Toplam maas: " + (this.salary + this.raiseSalary));

    }

}
