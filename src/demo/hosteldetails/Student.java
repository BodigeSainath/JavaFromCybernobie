package demo.hosteldetails;

public class Student {
    private int sid,did;
    private String name,gender,phone;

    public int getSid() {
        return sid;
    }

    public int setSid(int sid) {
        this.sid = sid;
        return sid;
    }

    public int getDid(int i) {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String setGender(String gender) {
        this.gender = gender;
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String setPhone(String phone) {
        this.phone = phone;
        return phone;
    }

    public Student() {
    }

}
