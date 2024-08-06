package com.hsbc.question1;

public class PriorityJob extends Job {

    public enum Priority {
        LOW,
        MEDIUM,
        HIGH
    }

    private Priority priority;
    private String monitoredBy;

    public PriorityJob(String jobname, String owner, Priority priority, String monitoredBy) {
        super(jobname, owner);
        this.priority = priority;
        this.monitoredBy = monitoredBy;
    }

    public PriorityJob(String jobname, String owner, int effortRequired, int monthOfCreation, int yearOfCreation, String status, Priority priority, String monitoredBy) {
        super(jobname, owner, effortRequired, monthOfCreation, yearOfCreation, status);
        this.priority = priority;
        this.monitoredBy = monitoredBy;
    }

    @Override
    public String showDetails() {
        return super.showDetails() + String.format("\nPriority: %s\nMonitored By: %s", priority, monitoredBy);
    }

    @Override
    public void displayInfo() {
        System.out.println(showDetails());
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getMonitoredBy() {
        return monitoredBy;
    }

    public void setMonitoredBy(String monitoredBy) {
        this.monitoredBy = monitoredBy;
    }
}
