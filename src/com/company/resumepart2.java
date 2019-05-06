package com.company;

public class resumepart2  {

        private education myeducation;
        private experience myexperience;
        private skills myskills;
        public String name;
        public String email;

        public resumepart2(){}

        public resumepart2(education myeducation, experience myexperience, skills myskills){
            this.myeducation = myeducation;
            this.myexperience = myexperience;
            this.myskills = myskills;
        }

    public void setMyeducation(education myeducation) {
        this.myeducation = myeducation;
    }

    public void setMyexperience(experience myexperience) {
        this.myexperience = myexperience;
    }

    public void setMyskills(skills myskills) {
        this.myskills = myskills;
    }

    public education getMyeducation(){
            return myeducation;
    }
        public experience getMyexperience(){
            return myexperience;
        }

        public skills getMyskills(){
            return myskills;
        }

        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }

        public String getEmail () {
            return email;
        }
        public void setEmail (String email){
            this.email = email;
        }
        //public String undergradmajor;
        //  public String gradmajor;
        //  public String graduni;
        //  public String jobtitle;
        //  public String company1;
        //  public String montha1;
        //  public String startyear1;
        //  public String montha2;
        //  public String endyear1;
        //  public String duty1;
        //  public String duty2;
        //  public String jobtitle2;
        //  public String company2;
        // public String monthb1;
        //  public String startyear2;
        //  public String monthb2;
        // public String endyear2;
        //  public String duty3;
        //  public String duty4;
        //  public String jobtitle3;
        //  public String company3;
        // public String monthc1;
        //  public String startyear3;
        //  public String monthc2;
        //  public String endyear3;
        // public String duty5;
        //  public String duty6;
        // public String skill1;
        //  public String skilllevel1;
        //  public String skilllevel2;
        //  public String skill3;
        //  public String skilllevel3;
        // public String skill4;
        //  public String skilllevel4;
        //   public String skill2;
        //public String undergraduni;
        //  public String degreetype;
        //  public String undergradyear;
        //  public String degreetype2;
        //  public String gradyear;


        //  public String getUndergradmajor() { return undergradmajor; }
        // public void setUndergradmajor(String undergradmajor){this.undergradmajor = undergradmajor;}

        // public String getUndergraduni() { return undergraduni; }
        // public void setUndergraduni(String undergraduni){this.undergraduni = undergraduni;}

        //public String getUndergradyear() { return undergradyear;}
        // public void setUndergradyear(String undergradyear){this.undergradyear = undergradyear;}

        // public String getDegreetype() { return degreetype; }
        //public void setDegreetype(String degreetype){this.degreetype = degreetype;}


        //  public String getGradmajor() { return gradmajor; }
        // public void setGradmajor(String gradmajor){this.gradmajor = gradmajor;}

        // public String getGraduni() { return graduni; }
        // public void setGraduni(String graduni){this.graduni = graduni;}

        //public String getgradyear() { return gradyear;}
        //public void setGradyear(String gradyear){this.gradyear = gradyear;}

        // public String getDegreetype2() { return degreetype2; }
        // public void setDegreetype2(String degreetype2){this.degreetype2 = degreetype2;}

        //public String getJobtitle() { return jobtitle; }
        // public void setJobtitle(String jobtitle){this.jobtitle = jobtitle;}

        //  public String getCompany1() { return company1; }
        //  public void setCompany1(String company1){this.company1 = company1;}

        //  public String getMontha1() { return montha1; }
        // public void setMontha1(String montha1){this.montha1 = montha1;}

        // public String getStartyear1() { return startyear1; }
        //  public void setStartyear1(String startyear1){this.startyear1 = startyear1;}

        // public String getMontha2() { return montha2; }
        // public void setMontha2(String montha2){this.montha2 = montha2;}

        //  public String getEndyear1() { return endyear1; }
        // public void setEndyear1(String endyear1){this.endyear1 = endyear1;}

        //public String getDuty1() { return duty1; }
        // public void setDuty1(String duty1){this.duty1 = duty1;}

        // public String getDuty2() { return duty2; }
        // public void setDuty2(String duty2){this.duty2 = duty2;}

        // public String getJobtitle2() { return jobtitle2; }
        // public void setJobtitle2(String jobtitle2){this.jobtitle2 = jobtitle2;}

        // public String getCompany2() { return company2; }
        //public void setCompany2(String company2){this.company2 = company2;}

        // public String getMonthb1() { return monthb1; }
        //public void setMonthb1(String monthb1){this.monthb1 = monthb1;}

        // public String getStartyear2() { return startyear2; }
        // public void setStartyear2(String startyear2){this.startyear2 = startyear2;}

        //public String getMonthb2() { return monthb2; }
        //public void setMonthb2(String monthb2){this.monthb2 = monthb2;}

        //public String getEndyear2() { return endyear2; }
        // public void setEndyear2(String endyear2){this.endyear2 = endyear2;}

        // public String getDuty3() { return duty3; }
        // public void setDuty3(String duty3){this.duty3 = duty3;}

        //public String getDuty4() { return duty4; }
        // public void setDuty4(String duty4){this.duty4 = duty4;}

        // public String getJobtitle3() { return jobtitle3; }
        // public void setJobtitle3(String jobtitle3){this.jobtitle3 = jobtitle3;}

        //public String getCompany3() { return company3; }
        // public void setCompany3(String company3){this.company3 = company3;}

        // public String getMonthc1() { return monthc1; }
        //public void setMonthc1(String monthc1){this.monthc1 = monthc1;}

        //  public String getStartyear3() { return startyear3; }
        // public void setStartyear3(String startyear3){this.startyear3 = startyear3;}

        // public String getMonthc2() { return monthc2; }
        //public void setMonthc2(String monthc2){this.monthc2 = monthc2;}

        // public String getEndyear3() { return endyear3; }
        //public void setEndyear3(String endyear3){this.endyear3 = endyear3;}

        //public String getDuty5() { return duty5; }
        //public void setDuty5(String duty5){this.duty5 = duty5;}

        //public String getDuty6() { return duty6; }
        //public void setDuty6(String duty6){this.duty6 = duty6;}


        // public String getSkill1() { return skill1; }
        // public void setSkill1(String skill1){this.skill1 = skill1;}

        //  public String getSkilllevel1() { return skilllevel1; }
        //  public void setSkilllevel1(String skilllevel1){this.skilllevel1 = skilllevel1;}

        //  public String getSkill2() { return skill2; }
        // public void setSkill2(String skill2){this.skill2 = skill2;}

        //  public String getSkilllevel2() { return skilllevel2; }
        // public void setSkilllevel2(String skilllevel2){this.skilllevel2 = skilllevel2;}

        // public String getSkill3() { return skill3; }
        // public void setSkill3(String skill3){this.skill3 = skill3;}

        // public String getSkilllevel3() { return skilllevel3; }
        // public void setSkilllevel3(String skilllevel3){this.skilllevel3 = skilllevel3;}

        // public String getSkill4() { return skill4; }
        // public void setSkill4(String skill4){this.skill4 = skill4;}

        //public String getSkilllevel4() { return skilllevel4; }
        // public void setSkilllevel4(String skilllevel4){this.skilllevel4 = skilllevel4;}


}
