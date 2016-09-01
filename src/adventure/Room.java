package adventure;

import java.util.*;
import java.io.*;

public class Room {

	String RoomTitle;
	String RoomDetails;
	boolean person;
	int Num;
	// constructor for rooms
	public Room(String Room, String RoomDescription, boolean survivor, int Roomnumber) {
		RoomTitle = Room;
		RoomDetails = RoomDescription;
		person = survivor; 
		Num = Roomnumber;
	}


// method for calling all the parameters 
	public String getRoomName() {
		return RoomTitle;
	}

	public String getRoomDetails() {
		return RoomDetails;
	}
	
	public boolean CheckSurvivor(){
		return person; 
		
	}
	public int getRoomNumber(){
		return Num;
	}
}
