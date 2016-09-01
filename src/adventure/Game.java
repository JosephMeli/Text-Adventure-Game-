package adventure;
import java.util.*;

public class Game {

	public static String entry;
	static int currentLocation= 105;
	static int moves = 0 ;
	static int people = 0;
	static Room[] RoomArray = new Room[24];
	public static void main(String[] args) {
		
	int choice = 0;
	
		Scanner input = new Scanner(System.in);
		
		// Into
		System.out.println("Welcome To BG. It is The Year 2064, BG's 100th Year anniversary and a tragic earthquake struck.\nThe Building is crumbling, But there are Still 9 Survivors inside!\n");
		System.out.println("This isnt the BG you knew it to be, the Earthquake destroyed the entire lower level\nand you must bring the survivors to the field house to wint the Game.\nEnter the field house through the lower level odd wing and go down the hall into the Gym. ");
		System.out.println("\n");
		System.out.println("Your misson if you choose to accept it will be to venture into the crumbling building,\nlocate and save the remaining survivors.\n1:Accept\n2:Reject\nSelect 1 or 2.");
		int a = input.nextInt();
		switch (a)
		{
		case 1:
			System.out.println("Congratulations you Have chosen wisely!\nHopefully you are up for the Challenge!\n\n");
			break;
		case 2:
			System.out.println("Thats Not a option, You are the chosen hero, to save these lives!\nYou Automatically Accept! ");
		}
		
		System.out.println("Choose Your Hero Name:");
		System.out.println(input.nextLine());
		System.out.println("Super" + " " + input.nextLine()+"!!!!");
		String SuperName = "Super" + input.nextLine();
		System.out.println("Excellent Choice");
		System.out.println("You Shall Begin here: You are Now in the Center of the Main Lobby.\n There are several options to choose from to start exploring\n You can SouthEast to the Main Office.\n Travel SouthWest towards Brother Marks Office\n Venture Down the Lower Odd Wing NorthWest\nGo Northeast to Lower Even Wing\nFinally can go up into the library");
		setup();
	
		
		// loop that will monitor the amount of move and display move choices until 75 moves
		while(moves < 75){
			choice = Menu();
			switch(choice) {
			case 1: North();
			Display();
			break;
			case 2: South();
			Display();
			break;
			case 3: East();
			Display();
			break;
			case 4: West();
			Display();
			break;
			case 5: Northwest();
			Display();
			break;
			case 6: Northeast();
			Display();
			break;
			case 7: Southeast();
			Display();
			break;
			case 8: Southwest();
			Display();
			break;
			case 9 : up();
			Display();
			break;
			case 10: down();
			Display();
			break;
			}
	
		}
		// the game will end after this many moves
		System.out.println("\n\n\nYou took to long the building collasped and you have died along with the remiang survivors");
		System.exit(0);
		
	}
	public static int Menu(){
		// the menu for all the directions and choices for the possible moves
		Scanner Direction = new Scanner(System.in);
		int D;
		System.out.println("\nPlease Enter the Number of the Direction You want to Go.");
		System.out.println("1: North");
		System.out.println("2: South");
		System.out.println("3: East");
		System.out.println("4: West");
		System.out.println("5: Northwest");
		System.out.println("6: Northeast");
		System.out.println("7: Southeast");
		System.out.println("8: Southwest");
		System.out.println("9: up");
		System.out.println("10: down");
		D = Direction.nextInt();
		return D;
	}
// the mathematical way to go about moving as if the rooms where laid out in a 3 by 6 grid 
	public static void North() {
		if (currentLocation == 107|| currentLocation == 110|| currentLocation == 113|| currentLocation == 116|| currentLocation == 109 || currentLocation == 112 || currentLocation == 115 || currentLocation == 209||currentLocation == 212||currentLocation == 215||currentLocation == 207||currentLocation == 210 || currentLocation == 213|| currentLocation == 216 || currentLocation ==  19 ){
		currentLocation = currentLocation + 3;
		moves++;
		}
		else{
			System.out.println("Cannot move in that Direction");
		}
	}

	public static void South() {
		if (currentLocation == 119|| currentLocation == 116|| currentLocation == 113|| currentLocation == 110|| currentLocation == 118 || currentLocation == 115 || currentLocation == 112 || currentLocation == 22||currentLocation == 219||currentLocation == 216||currentLocation == 213||currentLocation == 210 || currentLocation == 218|| currentLocation == 215 || currentLocation == 212){
		currentLocation = currentLocation - 3;
		moves++;}
		else{
			System.out.println("Cannot move in that Direction");
		}
	}

	public static void East() {
		System.out.println("Cannot move in that Direction");
		//currentLocation = currentLocation + 1;
		//In current Layout now rooms can go east 
	}

	public static void West() {
		System.out.println("Cannot move in that Direction");
		//currentLocation = currentLocation - 1;
		//In current Layout now rooms can go west 
	}

	public static void Northeast() {
		if( currentLocation ==  101 || currentLocation == 105 || currentLocation ==205){
				currentLocation = currentLocation + 4;
		moves++;}
		else{
			System.out.println("Cannot move in that Direction");
		}
	
	}

	public static void Northwest() {
		if( currentLocation ==  103 || currentLocation == 105 || currentLocation ==205){
			currentLocation = currentLocation + 2;
	moves++;}
	else{
		System.out.println("Cannot move in that Direction");
	}
	}
	public static void Southeast() {
		if(currentLocation == 105|| currentLocation == 107 || currentLocation == 207){
		currentLocation = currentLocation - 2;
		moves++;}
	
	else{
		System.out.println("Cannot move in that Direction");
	}
	}

	public static void Southwest() {
		if(currentLocation == 105 || currentLocation == 109|| currentLocation == 209){
		currentLocation = currentLocation - 4;
		moves++; }
		else{
			System.out.println("Cannot move in that Direction");
		}
	}

	public static void up() {
		if( currentLocation == 118|| currentLocation == 119|| currentLocation== 105|| currentLocation == 19){
		currentLocation = currentLocation + 100;
		moves++;
		}
		else{
			System.out.println("Cannot move in that Direction");
		}
	}

	public static void down() {
		if( currentLocation == 219|| currentLocation == 119|| currentLocation== 218|| currentLocation == 205){
			currentLocation = currentLocation - 100;
			moves++;
			}
			else{
				System.out.println("Cannot move in that Direction");
			}
		}
	// the method that will call the room number 
	// then from that room number match the current Location int 
	// then get the room name and description and print that 
	public static void Display(){
		for ( int i  = 0; i < 24 ; i++){
			if(RoomArray[i].getRoomNumber() == currentLocation){
				System.out.print( RoomArray[i].getRoomName() + "\n" + RoomArray[i].getRoomDetails());
				// if the player gets to field house before saving at least 5 people 
				// the game wont end  and player must keep looking
				if(i == 23 && people <  5){
					System.out.println( "\nThere are too many survivors still left in the building, keep serching before its too late");
				}
				if(i == 23 && people >= 5){
					System.out.println("\nYou have Won the Game and save the survivors!");
					System.exit(0);
				}
				// if there is a survivor  then it will at one to the people count and display how many survivors you have
				if(RoomArray[i].CheckSurvivor()){
					people ++;
					System.out.println("\nYou Now have Found " + people + " survivors");
				}
			}
		}
	}
	public static void setup() {
		// all the rooms and the parameters that go with them 
		RoomArray[0] = new Room(
				"Main Lobby",
				"You are Now in the Center of the Main Lobby.\nThere are several options to choose from to start exploring\nYou can Southeast to the Main Office.\nTravel SouthWest towards Brother Marks Office\nVenture Down the Lower Odd Wing NorthWest and then Lower even by way of Northeast\nFinally you can go up to the to the library",
				false,105);
		RoomArray[1] = new Room(
				"Main Office",
				"In the Office You have found one Annabelle! Congratulations.\nSave Her!!\n Now leave the Main office by way of Northwest and countinue Searching the Rest of BG",
				true, 103);
		RoomArray[2] = new Room(
				"Brother Mark's Office ",
				" All you Find is and empty office with Broken lights and collasped Shelves\n leave by way of NorthEast",
				false, 101);
		RoomArray[3] = new Room(
				"Library",
				"Look its Tim! Quickly Save Him! Then Leave and Countiue Searhing by Way of Northwest or Northeast heading down the Hallways with Classrooms",
				true, 205);
		RoomArray[4] = new Room(
				"Lit Room 1",
				"A light has fallen in the room casusing anyone that was still alive to leave, Please Keep Searching",
				false, 107);
		RoomArray[5] = new Room(
				"Religon Room 1",
				"Oooo Look John is crouched under the desk trying to stay safe from after shocks\n Save Him and keep Moving",
				true, 110);
		RoomArray[6] = new Room(
				"Lit Room 2 ",
				" in this room a small fire has started and the room is filled with smoke luckily there is no left in this room leave quickly before you are injured.",
				false, 113);
		RoomArray[7] = new Room(
				" Religon Room 2",
				" the room is empty, but theres one more room  a little further down the hall that must be promising",
				false,116);
		RoomArray[8] = new Room(
				"Lit Room 3",
				"Unforntunalty  this room is another dead end but keep serching, you are running out of time",
				false,119);
		RoomArray[9] = new Room(
				"Pysch Room 1",
				" Congrats you have found Sarah, Still keep looking for the others, they are scared and afraid ",
				true,118);
		RoomArray[10] = new Room(
				"Lit Room 4",
				" Venturing Down this hallway might have been a poor decsion but you never know?",
				false, 115);
		RoomArray[11] = new Room(
				"Science Room 1",
				" You are not the best at choosing rooms, I can try to help but that seems pointless...",
				false,112);
		RoomArray[12] = new Room(
				"Chem Room 1",
				"Congrats it seems chemistry and you go together because you found The crazy Science teacher Mr.Smith ",
				true,209);
		RoomArray[13] = new Room(
				"Math Room 1",
				" in this math problem there is only one right answer and that is  0 as in 0 survivors",
				false,109);
		RoomArray[14] = new Room(
				"Math Room 2",
				" Eureka! the mathematical calculation adds up to the coordinates of Victor ",
				true,210);
		RoomArray[15] = new Room(
				"Health Room 1",
				" This room is supposed to teach the healthy was to stay well, but you should leave because it will hurt you",
				false,207);
		RoomArray[16] = new Room(
				"Physics Room 1",
				"ALbert Eistein observed  an apple falling from a tree now I will observe a ceiling hitting you... RUN!!!",
				false,212);
		RoomArray[17] = new Room(
				"Biology Room 1",
				" Bio is the study of Life and you certainly Found one, now you saved Kevin",
				true, 219);
		RoomArray[18] = new Room(
				"Religon Room 4",
				"You are curently putting your life on the line to save another, but not in this room",
				false,213);
		RoomArray[19] = new Room(
				"Geology Room 1",
				" The study of rocks is very boring  no wonder there are no survivors in here",
				false,216);
		RoomArray[20] = new Room(
				"Health Room 2",
				" An apple a day Keeps the doctor away but saves the suvivor today, you saved  Marry ",
				true,215);
		RoomArray[21] = new Room(
				"History Room 1",
				" The past has shown us standing and waitng will never get the job done, so keep moving",
				false,218);
		RoomArray[22] = new Room(
				"Gym",
				"  You have found Another Survivor but this kinda looks like the field House but sadly isnt keep moving you are almost there",
				true,19);
		RoomArray[23] = new Room("Feild House",
				" You made it to the Field House", false,22);
	}
}
