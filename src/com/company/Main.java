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
        System.out.println("Education");


        System.out.println("Enter an academic major: ");
        String undergradmajor = enterresume.nextLine();
        person1.setUndergradmajor(undergradmajor);
        System.out.println("Enter an undergraduate university name: ");
        String undergraduni = enterresume.nextLine();
        person1.setUndergraduni(undergraduni);

        System.out.println("Enter graduation year: ");
                String undergradyear = enterresume.nextLine();
        person1.setUndergradyear(undergradyear);

        System.out.println("enter degree type:");
        String degreetype = enterresume.nextLine();
        person1.setDegreetype(degreetype);

        System.out.println("enter a graduate degree major:  ");
        String gradmajor = enterresume.nextLine();
        person1.setGradmajor(gradmajor);

        System.out.println(" enter a graduate school name: ");
        String graduni = enterresume.nextLine();
        person1.setGraduni(graduni);

        System.out.println("enter degree type:");
        String degreetype2 = enterresume.nextLine();
        person1.setDegreetype2(degreetype2);

        System.out.println("Enter graduation year: ");
        String gradyear = enterresume.nextLine();
        person1.setGradyear(gradyear);



        System.out.println("Experience");

        System.out.println("Enter job title: ");
        String jobtitle = enterresume.nextLine();
        person1.setJobtitle(jobtitle);

        System.out.println("Enter company name: " );
        String company1 = enterresume.nextLine();
        person1.setCompany1(company1);

        System.out.println("Enter start  month : ");
        String montha1 = enterresume.nextLine();
        person1.setMontha1(montha1);

        System.out.println("enter start year: ");
        String  startyear1 = enterresume.nextLine();
        person1.setStartyear1(startyear1);

        System.out.println("enter end  month : ");
        String montha2 = enterresume.nextLine();
        person1.setMontha2(montha2);

        System.out.println("enter end year:");
        String endyear1 = enterresume.nextLine();
        person1.setEndyear1(endyear1);

        System.out.println(" Enter duty 1: ");
        String duty1 = enterresume.nextLine();
        person1.setDuty1(duty1);

        System.out.println(" enter duty 2:");
        String duty2 = enterresume.nextLine();
        person1.setDuty2(duty2);

        System.out.println("Enter job title: ");
        String jobtitle2 = enterresume.nextLine();
        person1.setJobtitle2(jobtitle2);

        System.out.println("Enter company name: " );
        String company2 = enterresume.nextLine();
        person1.setCompany2(company2);

        System.out.println("Enter start  month : ");
        String monthb1 = enterresume.nextLine();
        person1.setMonthb1(monthb1);

        System.out.println("enter start year: ");
        String  startyear2 = enterresume.nextLine();
        person1.setStartyear2(startyear2);

        System.out.println("enter end  month : ");
        String monthb2 = enterresume.nextLine();
        person1.setMonthb2(monthb2);


        System.out.println("enter end year:");
        String endyear2 = enterresume.nextLine();
        person1.setEndyear2(endyear2);

        System.out.println(" Enter duty 1: ");
        String duty3 = enterresume.nextLine();
        person1.setDuty3(duty3);

        System.out.println(" enter duty 2:");
        String duty4 = enterresume.nextLine();
        person1.setDuty4(duty4);

        System.out.println("Enter job title: ");
        String jobtitle3 = enterresume.nextLine();
        person1.setJobtitle3(jobtitle3);

        System.out.println("Enter company name: " );
        String company3 = enterresume.nextLine();
        person1.setCompany3(company3);

        System.out.println("Enter start  month : ");
        String monthc1 = enterresume.nextLine();
        person1.setMonthc1(monthc1);


        System.out.println("enter start year: ");
        String  startyear3 = enterresume.nextLine();
        person1.setStartyear3(startyear3);

        System.out.println("enter end  month : ");
        String monthc2 = enterresume.nextLine();
        person1.setMonthc2(monthc2);

        System.out.println("enter end year:");
        String endyear3 = enterresume.nextLine();
        person1.setEndyear3(endyear3);

        System.out.println(" Enter duty 1: ");
        String duty5 = enterresume.nextLine();
        person1.setDuty5(duty5);

        System.out.println(" enter duty 2:");
        String duty6 = enterresume.nextLine();
        System.out.println("Skills");
        person1.setDuty6(duty6);


        System.out.println("Enter skill name: ");
        String skill1 = enterresume.nextLine();
        person1.setSkill1(skill1);

        System.out.println("Enter skill level");
        String skilllevel1 = enterresume.nextLine();
        person1.setSkilllevel1(skilllevel1);

        System.out.println("Enter skill name: ");
        String skill2 = enterresume.nextLine();
        person1.setSkill2(skill2);

        System.out.println("Enter skill level");
        String skilllevel2 = enterresume.nextLine();
        person1.setSkilllevel2(skilllevel2);

        System.out.println("Enter skill name: ");
        String skill3 = enterresume.nextLine();
        person1.setSkill3(skill3);


        System.out.println("Enter skill level");
        String skilllevel3 = enterresume.nextLine();
        person1.setSkilllevel3(skilllevel3);

        System.out.println("Enter skill name: ");
        String skill4 = enterresume.nextLine();
        person1.setSkill4(skill4);

        System.out.println("Enter skill level");
        String skilllevel4 = enterresume.nextLine();
        person1.setSkilllevel4(skilllevel4);

        System.out.println(person1.getName());
        System.out.println(person1.getEmail());
        System.out.println("Education");
        System.out.println(person1.getDegreetype()+ "in" +person1.getUndergradmajor()+",");

        System.out.println(person1.getUndergraduni()+ ","+person1.getUndergradyear());
       // System.out.println(person1.getUndergradyear());
        System.out.println(person1.getDegreetype2()+ "in "+person1.getGradmajor()+",");
       // System.out.println(person1.getGradmajor());
        System.out.println(person1.getGraduni()+" ,"+person1.getgradyear());
        //System.out.println(person1.getgradyear());
        System.out.println("Experience");
        System.out.println(person1.getJobtitle());
        System.out.println(person1.getCompany1()+"," +person1.getMontha1()+person1.getStartyear1()+ "-- "+ person1.getMontha2()+person1.getEndyear1() );
      //  System.out.println(person1.getMontha1());
      //  System.out.println(person1.getStartyear1());
       // System.out.println(person1.getMontha2());
       // System.out.println(person1.getEndyear1());
        System.out.println("duty1: "+person1.getDuty1());
        System.out.println("duty2: "+person1.getDuty2());
        System.out.println(person1.getJobtitle2());
        System.out.println(person1.getCompany2()+", "+person1.getMonthb1()+person1.getStartyear2()+"--"+person1.getMonthb2()+person1.getEndyear2());
       // System.out.println(person1.getMonthb1());
        //System.out.println(person1.getStartyear2());
      //  System.out.println(person1.getMonthb2());
       // System.out.println(person1.getEndyear2());
        System.out.println("duty 1: "+person1.getDuty3());
        System.out.println("duty 2: "+person1.getDuty4());
        System.out.println(person1.getJobtitle3());
        System.out.println(person1.getCompany3()+" , "+person1.getMonthc1()+person1.getStartyear3()+"--"+person1.getMonthc2()+person1.getEndyear3());
       // System.out.println(person1.getMonthc1());
        //System.out.println(person1.getStartyear3());
      //  System.out.println(person1.getMonthc2());
       // System.out.println(person1.getEndyear3());
        System.out.println("duty 1: "+person1.getDuty5());
        System.out.println("duty 2: "+person1.getDuty6());
        System.out.println("skills");
        System.out.println(person1.getSkill1()+" ,"+person1.getSkilllevel1());
       // System.out.println(person1.getSkilllevel1());
        System.out.println(person1.getSkill2()+" , "+person1.getSkilllevel2());
      //  System.out.println(person1.getSkilllevel2());
        System.out.println(person1.getSkill3()+" , "+person1.getSkilllevel3());
       // System.out.println(person1.getSkilllevel3());
        System.out.println(person1.getSkill4()+","+person1.getSkilllevel4());
       // System.out.println(person1.getSkilllevel4());

    }
}
