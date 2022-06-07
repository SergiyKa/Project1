package BankTeamOOP;

public class ManagerRole extends BankTeam {

    String tasks;


    public ManagerRole(String name, String title, int id, String birthDate, String address, int salary, String tasks) {
        super(name, title, id, birthDate, address, salary);
        this.tasks = tasks;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    @Override
    public void printEmployeesDetails() {
        super.printEmployeesDetails();
        System.out.println("Tasks: " + name +  tasks);
    }
}
