package com.greatlearning.main;

import com.greatlearning.models.HRDepartment;
import com.greatlearning.models.SuperDepartment;
import com.greatlearning.models.TechDepartment;
import com.greatlearning.models.AdminDepartment;

public class Main {
    public static void main(String[] args) {

        new SuperDepartment();
        System.out.println();

        new AdminDepartment();
        System.out.println();

        new HRDepartment();
        System.out.println();

        new TechDepartment();
        System.out.println();
    }
}
