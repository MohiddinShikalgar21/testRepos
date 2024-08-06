package com.hsbc.question1;

public class MultiOwnerJob extends Job {

	private String secondOwner;

    public MultiOwnerJob(String jobname, String owner, String secondOwner) {
        super(jobname, owner); 
        this.secondOwner = secondOwner;
    }

    public MultiOwnerJob(String jobname, String owner, int effortRequired, int monthOfCreation, int yearOfCreation, String status, String secondOwner) {
        super(jobname, owner, effortRequired, monthOfCreation, yearOfCreation, status); // Call the superclass constructor
        this.secondOwner = secondOwner;
    }

    // Override displayInfo to include additional information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Second Owner: " + secondOwner);
    }

    public String getSecondOwner() {
        return secondOwner;
    }

    public void setSecondOwner(String secondOwner) {
        this.secondOwner = secondOwner;
    }
}
