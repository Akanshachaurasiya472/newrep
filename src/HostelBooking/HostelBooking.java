package HostelBooking;
class student{
	String name;
	int rollNo;
	int roomNo=-1;
	public student(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public int setRoomNo(int n) {
		
		return roomNo=n;
	}
}
class hostel{
	boolean roomBooked[]=new boolean[200];
	public String bookhostel(student stud,int roomNo) throws UnavailableRoomExecption,BookedHostelException {
		if(roomBooked[roomNo] ) {
			throw new UnavailableRoomExecption("room is alreday taken");
			
		}else if(stud.getRoomNo()!=-1) {
			throw new BookedHostelException("you cannot book hostel again");
			
		}
		else {
			stud.setRollNo(roomNo);
			roomBooked[roomNo]=true;
		}
		return "hostel booked successfuly";
		
	}
	public int totalAvailableRoom() {
		int count=0;
		for(int i=0;i<200;i++) {
			if(!(roomBooked[i]))
				count++;
		}return count;
	}
}

class UnavailableRoomExecption extends Exception{
	UnavailableRoomExecption(String s){
		super(s);
	}
	
}
class BookedHostelException extends Exception{
	BookedHostelException(String s){
		super(s);
	}
}
public class HostelBooking {
	public static void main(String[] args) throws UnavailableRoomExecption,BookedHostelException{
		hostel h=new hostel();
		student data1=new student("ak",10);
		student data2=new student("aka",1);
		System.out.println(h.bookhostel(data1, 23));
		System.out.println(h.bookhostel(data2, 77));
		System.out.println(h.totalAvailableRoom());

		
	}

}
