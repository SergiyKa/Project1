package BankTeamOOP;

public abstract class BankTeam {

    String name;
    String title;
    int id;
    String birthDate;
    String address;
    int salary;

    public BankTeam(String name, String title, int id, String birthDate, String address, int salary) {
        this.name = name;
        this.title = title;
        this.id = id;
        this.birthDate = birthDate;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printEmployeesDetails(){
        System.out.println("**************************");
        System.out.println("Name: " + name);
        System.out.println("Title: " + title);
        System.out.println("ID: " + id);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary + "$");

    }


}
