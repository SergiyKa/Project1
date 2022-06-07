package BankTeamOOP;

public class BankTeamMain {

    public static void main(String[] args) {
        BankTeam employee1 = new ManagerRole("Doug Flake","Manager", 111, "01.03.1975", "Toronto", 10000, " hire and fire employees");
        BankTeam employee2 = new ClerkRole("Scott Stewart","Clerk", 211, "15.12.1995", "Hamilton", 3000, " call to the customer and answer incoming calls");
        BankTeam employee3 = new ClerkRole("Ben Fleck","Clerk", 212, "10.11.1992", "Concord", 3000, " call to the customer and answer incoming calls");
        BankTeam employee4 = new ClerkRole("Elon Maple","Clerk", 213, "02.10.1990", "Brampton", 3000, " call to the customer and answer incoming calls");
        BankTeam employee5 = new AccountantRole("Rita Great","Accountant", 510, "12.10.1980", "Brampton", 5000, " open a new account, close account and create reports");
        BankTeam employee6 = new AccountantRole("Inna Jonson","Accountant", 512, "12.10.1985", "Toronto", 5000, " open a new account, close account and create reports");
        BankTeam employee7 = new AccountantRole("Peter Yam","Accountant", 515, "23.04.1990", "Ajax", 5000, " open a new account, close account and create reports");
        BankTeam employee8 = new AccountantRole("Nick Timber","Accountant", 520, "28.02.2000", "Brampton", 5000, " open a new account, close account and create reports");
        BankTeam employee9 = new AccountantRole("Lara Ward","Accountant", 525, "31.12.2002", "Hamilton", 5000, " open a new account, close account and create reports");

        employee1.printEmployeesDetails();
        employee2.printEmployeesDetails();
        employee3.printEmployeesDetails();
        employee4.printEmployeesDetails();
        employee5.printEmployeesDetails();
        employee6.printEmployeesDetails();
        employee7.printEmployeesDetails();
        employee8.printEmployeesDetails();
        employee9.printEmployeesDetails();
    }
}
