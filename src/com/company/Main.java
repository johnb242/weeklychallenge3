package com.company;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<resumepart2> writeresume = new ArrayList<resumepart2>();

        resumepart2 person1 = new resumepart2();



        Scanner enterresume = new Scanner(System.in);


        System.out.println("enter a name: ");
        String name = enterresume.nextLine();
        person1.setName(name);
        System.out.println("enter an email address:  ");
        String email = enterresume.nextLine();
        person1.setEmail(email);


        education e = new education();

        System.out.println("Education");


        System.out.println("Enter an academic major: ");
        String undergradmajor = enterresume.nextLine();
        e.setUndergradmajor(undergradmajor);


        System.out.println("Enter an undergraduate university name: ");
        String undergraduni = enterresume.nextLine();
        e.setUndergraduni(undergraduni);

        System.out.println("Enter graduation year: ");
                String undergradyear = enterresume.nextLine();
        e.setUndergradyear(undergradyear);

        System.out.println("enter degree type:");
        String degreetype = enterresume.nextLine();
        e.setDegreetype(degreetype);

        System.out.println("enter a graduate degree major:  ");
        String gradmajor = enterresume.nextLine();
        e.setGradmajor(gradmajor);

        System.out.println(" enter a graduate school name: ");
        String graduni = enterresume.nextLine();
        e.setGraduni(graduni);

        System.out.println("enter degree type:");
        String degreetype2 = enterresume.nextLine();
        e.setDegreetype2(degreetype2);

        System.out.println("Enter graduation year: ");
        String gradyear = enterresume.nextLine();
        e.setGradyear(gradyear);

        experience f = new experience();

        System.out.println("Experience");

        System.out.println("Enter job title: ");
        String jobtitle = enterresume.nextLine();
        f.setJobtitle(jobtitle);

        System.out.println("Enter company name: " );
        String company1 = enterresume.nextLine();
        f.setCompany1(company1);

        System.out.println("Enter start  month : ");
        String montha1 = enterresume.nextLine();
        f.setMontha1(montha1);

        System.out.println("enter start year: ");
        String  startyear1 = enterresume.nextLine();
        f.setStartyear1(startyear1);

        System.out.println("enter end  month : ");
        String montha2 = enterresume.nextLine();
        f.setMontha2(montha2);

        System.out.println("enter end year:");
        String endyear1 = enterresume.nextLine();
        f.setEndyear1(endyear1);

        System.out.println(" Enter duty 1: ");
        String duty1 = enterresume.nextLine();
        f.setDuty1(duty1);

        System.out.println(" enter duty 2:");
        String duty2 = enterresume.nextLine();
        f.setDuty2(duty2);

        System.out.println("Enter job title: ");
        String jobtitle2 = enterresume.nextLine();
        f.setJobtitle2(jobtitle2);

        System.out.println("Enter company name: " );
        String company2 = enterresume.nextLine();
        f.setCompany2(company2);

        System.out.println("Enter start  month : ");
        String monthb1 = enterresume.nextLine();
        f.setMonthb1(monthb1);

        System.out.println("enter start year: ");
        String  startyear2 = enterresume.nextLine();
        f.setStartyear2(startyear2);

        System.out.println("enter end  month : ");
        String monthb2 = enterresume.nextLine();
        f.setMonthb2(monthb2);


        System.out.println("enter end year:");
        String endyear2 = enterresume.nextLine();
        f.setEndyear2(endyear2);

        System.out.println(" Enter duty 1: ");
        String duty3 = enterresume.nextLine();
        f.setDuty3(duty3);

        System.out.println(" enter duty 2:");
        String duty4 = enterresume.nextLine();
        f.setDuty4(duty4);

        System.out.println("Enter job title: ");
        String jobtitle3 = enterresume.nextLine();
        f.setJobtitle3(jobtitle3);

        System.out.println("Enter company name: " );
        String company3 = enterresume.nextLine();
        f.setCompany3(company3);

        System.out.println("Enter start  month : ");
        String monthc1 = enterresume.nextLine();
        f.setMonthc1(monthc1);


        System.out.println("enter start year: ");
        String  startyear3 = enterresume.nextLine();
        f.setStartyear3(startyear3);

        System.out.println("enter end  month : ");
        String monthc2 = enterresume.nextLine();
        f.setMonthc2(monthc2);

        System.out.println("enter end year:");
        String endyear3 = enterresume.nextLine();
        f.setEndyear3(endyear3);

        System.out.println(" Enter duty 1: ");
        String duty5 = enterresume.nextLine();
        f.setDuty5(duty5);

        System.out.println(" enter duty 2:");
        String duty6 = enterresume.nextLine();
        System.out.println("Skills");
        f.setDuty6(duty6);

        skills g = new skills();

        System.out.println("Enter skill name: ");
        String skill1 = enterresume.nextLine();
        g.setSkill1(skill1);

        System.out.println("Enter skill level");
        String skilllevel1 = enterresume.nextLine();
        g.setSkilllevel1(skilllevel1);

        System.out.println("Enter skill name: ");
        String skill2 = enterresume.nextLine();
        g.setSkill2(skill2);

        System.out.println("Enter skill level");
        String skilllevel2 = enterresume.nextLine();
        g.setSkilllevel2(skilllevel2);

        System.out.println("Enter skill name: ");
        String skill3 = enterresume.nextLine();
        g.setSkill3(skill3);


        System.out.println("Enter skill level");
        String skilllevel3 = enterresume.nextLine();
        g.setSkilllevel3(skilllevel3);

        System.out.println("Enter skill name: ");
        String skill4 = enterresume.nextLine();
        g.setSkill4(skill4);

        System.out.println("Enter skill level");
        String skilllevel4 = enterresume.nextLine();
        g.setSkilllevel4(skilllevel4);

        System.out.println(person1.getName());
        System.out.println(person1.getEmail()+"\n");
        System.out.println("Education");
        System.out.println(e.getDegreetype()+" "+ "in" +e.getUndergradmajor()+",");

        System.out.println(e.getUndergraduni()+ ","+e.getUndergradyear()+"\n");
       // System.out.println(person1.getUndergradyear());
        System.out.println(e.getDegreetype2()+" "+ "in "+e.getGradmajor()+",");
       // System.out.println(person1.getGradmajor());
        System.out.println(e.getGraduni()+" ,"+e.getgradyear() +"\n");
        //System.out.println(person1.getgradyear());
        System.out.println("Experience");
        System.out.println(f.getJobtitle());
        System.out.println(f.getCompany1()+"," +f.getMontha1()+f.getStartyear1()+ "-- "+ f.getMontha2()+f.getEndyear1() );
      //  System.out.println(person1.getMontha1());
      //  System.out.println(person1.getStartyear1());
       // System.out.println(person1.getMontha2());
       // System.out.println(person1.getEndyear1());
        System.out.println("duty1: "+f.getDuty1());
        System.out.println("duty2: "+f.getDuty2()+"\n");
        System.out.println(f.getJobtitle2());
        System.out.println(f.getCompany2()+", "+f.getMonthb1()+f.getStartyear2()+"--"+f.getMonthb2()+f.getEndyear2());
       // System.out.println(person1.getMonthb1());
        //System.out.println(person1.getStartyear2());
      //  System.out.println(person1.getMonthb2());
       // System.out.println(person1.getEndyear2());
        System.out.println("duty 1: "+f.getDuty3());
        System.out.println("duty 2: "+f.getDuty4()+"\n");
        System.out.println(f.getJobtitle3());
        System.out.println(f.getCompany3()+" , "+f.getMonthc1()+f.getStartyear3()+"--"+f.getMonthc2()+f.getEndyear3());
       // System.out.println(person1.getMonthc1());
        //System.out.println(person1.getStartyear3());
      //  System.out.println(person1.getMonthc2());
       // System.out.println(person1.getEndyear3());
        System.out.println("duty 1: "+f.getDuty5());
        System.out.println("duty 2: "+f.getDuty6()+"\n");
        System.out.println("skills");
        System.out.println(g.getSkill1()+" ,"+g.getSkilllevel1());
       // System.out.println(person1.getSkilllevel1());
        System.out.println(g.getSkill2()+" , "+g.getSkilllevel2());
      //  System.out.println(person1.getSkilllevel2());
        System.out.println(g.getSkill3()+" , "+g.getSkilllevel3());
       // System.out.println(person1.getSkilllevel3());
        System.out.println(g.getSkill4()+","+g.getSkilllevel4());
       // System.out.println(person1.getSkilllevel4());



        resumepart2 resumeorcv1 = new resumepart2(e,f,g);
        resumeorcv1.setMyeducation(e);
        resumeorcv1.setMyexperience(f);
        resumeorcv1.setMyskills(g);


       // for (Closets temp: myMainCloset){
         //   temp.whatisinmycloset();

    }
}
