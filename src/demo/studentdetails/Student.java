package demo.studentdetails;

public class Student {
    private  int sid;
    private String sname,saddr,scollege;

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public String getSaddr() {
        return saddr;
    }

    public String getScollege() {
        return scollege;
    }

    public Student(int sid, String sname, String saddr) {
        this.sid = sid;
        this.sname = sname;
        this.saddr = saddr;
    }

    public Student(int sid, String sname, String saddr, String scollege) {
        this.sid = sid;
        this.sname = sname;
        this.saddr = saddr;
        this.scollege = scollege;
    }
    void  showNo(){
        System.out.println("id : "+sid+"\nname : "+sname+"\nsaddr : "+saddr+"\nscollege "+scollege);
    }
    void  showYes(){
        System.out.println("id : "+sid+"\nname : "+sname+"\nsaddr : "+saddr+"\nscollege : "+"NIT");
    }

}
