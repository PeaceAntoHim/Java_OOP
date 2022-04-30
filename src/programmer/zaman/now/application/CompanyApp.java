package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        // This to access inner class
        // Benefit use inner class is we can to access all Outer Class
        Company company = new Company();
        company.setName("To good To be True");

        Company.Employee employee = company.new Employee();
        employee.setName("Frans");

        // This code implements inner class
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        // Example 2
        Company company2 = new Company();
        company2.setName("Thare is good");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("\nBastian");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }

}
