package edu.wzm.structure.composite.example;

public class ITDepartment implements Company{
    private String name;

    public ITDepartment(String name) {
        this.name = name;
    }

    @Override
    public void duty() {
        System.out.println(name + " 职责：IT 部门的职责");
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
