package com.hsbc.question1;

public class PriorityJob extends Job {

	public static final String PRIORITY_LOW = "low";
    public static final String PRIORITY_MEDIUM = "medium";
    public static final String PRIORITY_HIGH = "high";

    private String priority;
    private String monitoredBy;

    public PriorityJob(String jobname, String owner, String priority, String monitoredBy) {
        super(jobname, owner); // Call the superclass constructor
        this.priority = priority;
        this.monitoredBy = monitoredBy;
    }

    public PriorityJob(String jobname, String owner, int effortRequired, int monthOfCreation, int yearOfCreation, String status, String priority, String monitoredBy) {
        super(jobname, owner, effortRequired, monthOfCreation, yearOfCreation, status); 
        this.priority = priority;
        this.monitoredBy = monitoredBy;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Priority: " + priority);
        System.out.println("Monitored By: " + monitoredBy);
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getMonitoredBy() {
        return monitoredBy;
    }

    public void setMonitoredBy(String monitoredBy) {
        this.monitoredBy = monitoredBy;
    }
}
