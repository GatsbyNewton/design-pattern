package edu.wzm.structure.composite.example;

public class FinanceDepartment implements Company{
    private String name;

    public FinanceDepartment(String name) {
        this.name = name;
    }

    @Override
    public void duty() {
        System.out.println(name + " 职责：财务部门的职责");
    }

    @Override
    public void display(int depth) {
        System.out.println(flag(depth) + name);
    }

    private String flag(int depth){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= depth; i++){
            sb.append('-');
        }

        return sb.toString();
    }
}
