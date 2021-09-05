package com.greatlearning.models;

public class AdminDepartment extends SuperDepartment{

    @Override
    protected String DepartmentName() {
        return "Admin Department";
    }

    @Override
    protected String GetTodayWork() {
        return "Complete your documents Submission";
    }

    @Override
    protected String GetWorkDeadline() {
        return "Complete by EOD";
    }
}
