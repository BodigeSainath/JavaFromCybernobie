package demo.hosteldetails;

public class Hostel extends Student{
    private String hostelName;
    private int roomNumber;

    public Hostel(int sid, String sname, int depId, String gen, String phn, String hname, int rno) {

    }

    public String getHostelName() {
        return hostelName;
    }

    public String setHostelName(String hostelName) {
        this.hostelName = hostelName;
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        return roomNumber;
    }
    public Hostel(){

    }
}
