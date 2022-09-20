package demo.Advance.java.persistemployee;

public class Employee {
    private int eId;
    private String ename;
    private float appraisalRating;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getAppraisalRating() {
        return appraisalRating;
    }

    public void setAppraisalRating(float appraisalRating) {
        this.appraisalRating = appraisalRating;
    }
    public Employee(){

    }
    public Employee(int eId,String ename,float appraisalRating){
        this.eId=eId;
        this.ename=ename;
        this.appraisalRating=appraisalRating;
    }
}
