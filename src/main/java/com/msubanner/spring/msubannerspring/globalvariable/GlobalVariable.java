package com.msubanner.spring.msubannerspring.globalvariable;

import javax.persistence.*;

/**
 * @author Christian Kendall
 */

@Entity
public class GlobalVariable {

    private static final String SCHOOLNAME = ("Metropolitan State University of Denver");
    private static final int FRESHMAN = 29;
    private static final int SOPHOMORE = 59;
    private static final int JUNIOR = 89;
    private static final int SENIOR = 120;

    public GlobalVariable() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getSCHOOLNAME() {

        return SCHOOLNAME;
    }

    public void setSCHOOLNAME(String school) {

        school = SCHOOLNAME;
    }

    public int getFRESHMAN() {

        return FRESHMAN;
    }

    public void setFRESHMAN(int freshman) {

        freshman = FRESHMAN;
    }

    public int getSOPHOMORE() {

        return SOPHOMORE;
    }

    public void setSOPHOMORE(int sophomore) {

        sophomore = SOPHOMORE;
    }

    public int getJUNIOR() {

        return JUNIOR;
    }

    public void setJUNIOR(int junior) {

        junior = JUNIOR;
    }

    public int getSENIOR() {

        return SENIOR;
    }


    public void setSENIOR(int senior) {
        senior = SENIOR;
    }

    public String findSchoolYear(int studentCredits) {

        if (studentCredits <= FRESHMAN) {

            return "Freshmen";
        } else if (studentCredits <= SOPHOMORE) {

            return "Sophomore";
        } else if (studentCredits <= JUNIOR) {

            return "Junior";
        } else if (studentCredits <= SENIOR) {

            return "Senior";
        } else {

            return "Graduate";
        }
    }
}
