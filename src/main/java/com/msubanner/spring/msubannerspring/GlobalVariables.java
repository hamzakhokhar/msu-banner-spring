package com.msubanner.spring.msubannerspring;
import javax.persistence.Entity;

@Entity
public class GlobalVariables {
    public final static String SCHOOLNAME = ("Metropolitan State University of Denver");
    public final static int[] FRESHMAN = {0,29};
    public final static int[] SOPHMORE= {30,59};
    public final static int[] JUNIOR = {60,89};
    public final static double[] SENIOR = {90.0, Double.POSITIVE_INFINITY};

}
