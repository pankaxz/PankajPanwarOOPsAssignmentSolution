package com.greatlearning.models;

public class HRDepartment extends SuperDepartment{

    public HRDepartment(){
        System.out.println(DoActivity());
    }

    @Override
    protected String DepartmentName() {
        return "HR Department";
    }

    @Override
    protected String GetTodayWork() {
        return "Fill today’s worksheet and mark your attendance";
    }

    @Override
    protected String GetWorkDeadline() {
        return "Complete by EOD";
    }

    private String DoActivity(){
        return "Team Lunch";
    }
}
