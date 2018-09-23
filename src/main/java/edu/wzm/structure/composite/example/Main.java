package edu.wzm.structure.composite.example;

public class Main {

    public static void main(String[] args){
        Company company = new ConcreteCompany("总公司");

        Company eastCompany = new ConcreteCompany("东部子公司");
        eastCompany.add(new ITDepartment("东部子公司 - IT 技术部"));
        eastCompany.add(new FinanceDepartment("东部子公司 - 财务部"));

        company.add(eastCompany);

        Company westCompany = new ConcreteCompany("西部子公司");
        westCompany.add(new HRDepartment("西部子公司 - HR 部"));

        company.add(westCompany);

        company.display(1);
        company.duty();
    }
}
