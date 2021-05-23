public class Hosteller extends Student{
    private String hostelName;
    private int roomNumber;
    public String getHostelName(){
        return this.hostelName;
    }
    public void setHostelName(String hname){
        this.hostelName = hname;
    }
    public int getRoomNumber(){
        return this.roomNumber;
    }
    public void setRoomNumber(int rno){
        this.roomNumber=rno;
    }
}