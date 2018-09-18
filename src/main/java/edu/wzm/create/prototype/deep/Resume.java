package edu.wzm.creator.prototype.deep;

public class Resume implements Cloneable {
    private String name;
    private int age;
    private Experience experience;

    public Resume(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setExperience(String date, String company) {
        this.experience = new Experience(date, company);
    }

    public Resume(String name, int age, String date, String company) {
        this.name = name;
        this.age = age;
        this.experience = new Experience(date, company);
    }

    public void setExperienceInfo(String date, String company) {
        this.experience.setDate(date);
        this.experience.setCompany(company);
    }

    public Experience getExperience() {
        return experience;
    }

    @Override
    protected Resume clone() throws CloneNotSupportedException {
        Resume resume = null;
        try {
            resume = (Resume) super.clone();
            resume.experience = this.experience.clone();        // deep-copy
        }catch (CloneNotSupportedException cnse){
            throw new RuntimeException();
        }

        return resume;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience={date=" + experience.getDate() +
                ", company=" + experience.getCompany() +
                "}}";
    }
}
