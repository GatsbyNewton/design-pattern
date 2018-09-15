package edu.wzm.creator.prototype.shallow;

public class ShallowCopyMain {
    public static void main(String[] args)throws Exception{
        Resume jimmy = new Resume("jimmy", 24);
        jimmy.setExperience( "2018-08-09", "XXX Company");
        System.out.println(jimmy.getExperience());
        System.out.println(jimmy);

        Resume jimmyBak = jimmy.clone();
        jimmyBak.setExperience( "2017-09-09", "YYY Company");
        System.out.println(jimmyBak.getExperience());
        System.out.println(jimmyBak);

        System.out.println("\n--------------------- Shallow-Copy: Experience ---------------------");
        Resume issac = new Resume("issac", 34, "2018-08-09", "AAA Company");
        System.out.println(issac.getExperience());
        System.out.println(jimmy);

        Resume issacBak = issac.clone();
        issacBak.setExperienceInfo( "2017-09-09", "YYY Company");
        System.out.println(issacBak.getExperience());
        System.out.println(issacBak);
    }
}
