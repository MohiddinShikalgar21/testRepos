package com.hsbc.question1;

public class MultiOwnerJob extends Job {

    private String secondOwner;

    public MultiOwnerJob(String jobname, String owner, String secondOwner) {
        super(jobname, owner); 
        this.secondOwner = secondOwner;
    }

    public MultiOwnerJob(String jobname, String owner, int effortRequired, int monthOfCreation, int yearOfCreation, String status, String secondOwner) {
        super(jobname, owner, effortRequired, monthOfCreation, yearOfCreation, status);
        this.secondOwner = secondOwner;
    }

    @Override
    public String showDetails() {
        return super.showDetails() + String.format("\nSecond Owner: %s", secondOwner);
    }

    @Override
    public void displayInfo() {
        System.out.println(showDetails());
    }

    public String getSecondOwner() {
        return secondOwner;
    }

    public void setSecondOwner(String secondOwner) {
        this.secondOwner = secondOwner;
    }
}
