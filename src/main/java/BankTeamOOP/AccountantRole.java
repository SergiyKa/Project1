package BankTeamOOP;

public class AccountantRole extends BankTeam{


    String taskAccount;

    public AccountantRole(String name, String title, int id, String birthDate, String address, int salary, String taskAccount) {
        super(name, title, id, birthDate, address, salary);
        this.taskAccount = taskAccount;
    }

    public String getTaskAccount() {
        return taskAccount;
    }

    public void setTaskAccount(String taskAccount) {
        this.taskAccount = taskAccount;
    }

    @Override
    public void printEmployeesDetails() {
        super.printEmployeesDetails();
        System.out.println("Tasks: " + name + taskAccount);
    }
}
