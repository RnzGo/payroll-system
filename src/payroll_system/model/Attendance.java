package payroll_system.model;
import java.sql.Date;



public class Attendance {
    private int daysWorkedId;
    private int empId;
    private int daysWorked;
    private Date periodStart;
    private Date periodEnd;
    
    //Empty Constructor for Database Operation
    public Attendance(){}
    
    public Attendance(int daysWorkedId, int empId, int daysWorked, Date periodStart, Date periodEnd){
        this.empId = empId;
        this.daysWorkedId = daysWorkedId;
        this.daysWorked = daysWorked;
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
    }
    
    //Getters and Setters
    public int getDaysWorkedId() {
        return daysWorkedId;
    }

    public void setDaysWorkedId(int daysWorkedId) {
        this.daysWorkedId = daysWorkedId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    public Date getPeriodStart() {
        return periodStart;
    }

    public void setPeriodStart(Date periodStart) {
        this.periodStart = periodStart;
    }

    public Date getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(Date periodEnd) {
        this.periodEnd = periodEnd;
    }
    
    
    @Override
    public String toString(){
        return "Attendance [ " + "Days Worked Id = "+ daysWorkedId + ", Employee Id = " + empId +
                ", Days Worked = " + daysWorked + ", Period Start = " + periodStart + ", Period End = " + periodEnd;
    }
}

