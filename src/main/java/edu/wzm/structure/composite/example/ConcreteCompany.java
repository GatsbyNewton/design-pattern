package edu.wzm.structure.composite.example;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany implements Company {
    private List<Company> companies = new ArrayList<>();
    private String name;

    public ConcreteCompany(String name) {
        this.name = name;
    }

    @Override
    public void duty() {
        for (Company company : companies){
            company.duty();
        }
    }

    @Override
    public void display(int depth) {
        System.out.println(flag(depth) + name);

        for (Company company : companies){
            company.display(depth + 2);
        }
    }

    @Override
    public void add(Company company) {
        companies.add(company);
    }

    @Override
    public void remove(Company company) {
        companies.remove(company);
    }

    private String flag(int depth){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= depth; i++){
            sb.append('-');
        }

        return sb.toString();
    }
}
