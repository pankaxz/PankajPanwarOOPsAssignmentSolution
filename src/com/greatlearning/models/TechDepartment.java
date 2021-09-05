package com.greatlearning.models;

public class TechDepartment extends SuperDepartment{

    public TechDepartment(){
        System.out.println(GetTechStackInformation());
    }

    @Override
    protected String DepartmentName() {
        return "Tech Department";
    }

    @Override
    protected String GetTodayWork() {
        return "Complete coding of module 1";
    }

    @Override
    protected String GetWorkDeadline() {
        return "Complete by EOD";
    }

    private String GetTechStackInformation(){
        return "Core Java";
    }
}
