package Week2Patika;

public class Employee {
    // Nitelikler (Fields)
    String name;
    double salary;
    int workHours;
    int hireYear;

    // Kurucu (Constructor)
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi Hesaplama
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Bonus Hesaplama
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    // Maaş Artışı Hesaplama
    public double raiseSalary() {
        int currentYear = 2021;
        int workYears = currentYear - hireYear;

        if (workYears < 10) {
            return salary * 0.05;
        } else if (workYears < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    // Bilgileri ekrana yazdırma
    public String toString() {
        double tax = tax(); // çalışanın maaşından alınacak vergi
        double bonus = bonus(); //fazla mesai varsa eklenen para
        double raise = raiseSalary(); //zam miktarı
        double salaryWithTaxAndBonus = salary - tax + bonus;
        double totalSalary = salaryWithTaxAndBonus + raise;

        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax +
                "\nBonus: " + bonus +
                "\nMaaş Artışı: " + raise +
                "\nVergi ve Bonuslarla Maaş: " + salaryWithTaxAndBonus +
                "\nToplam Maaş: " + totalSalary;
    }
}
