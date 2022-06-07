package BankTeamOOP;

public class ClerkRole extends BankTeam {


    String taskClerk;

    public ClerkRole(String name, String title, int id, String birthDate, String address, int salary, String taskClerk) {
        super(name, title, id, birthDate, address, salary);
        this.taskClerk = taskClerk;
    }

    public String getTaskClerk() {
        return taskClerk;
    }

    public void setTaskClerk(String taskClerk) {
        this.taskClerk = taskClerk;
    }

    @Override
    public void printEmployeesDetails() {
        super.printEmployeesDetails();
        System.out.println("Tasks: " + name + taskClerk);
    }
}
