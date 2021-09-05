package com.greatlearning.models;

public class SuperDepartment {

    public SuperDepartment(){
        System.out.print("Welcome to ");
        System.out.println(DepartmentName());
        System.out.println(GetTodayWork());
        System.out.println(GetWorkDeadline());
        System.out.println(IsTodayAHoliday());
    }

    protected String DepartmentName(){
         return "Super Department";
    }

    protected String GetTodayWork(){
         return "No Work as of now";
    }

    protected String GetWorkDeadline(){
         return "Nil";
    }

    protected String IsTodayAHoliday() {
        return "Today is not a holiday";
    }
}