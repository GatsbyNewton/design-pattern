package edu.wzm.create.prototype.shallow;

public class Experience {
    private String date;
    private String company;

    public Experience(String date, String company) {
        this.date = date;
        this.company = company;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
