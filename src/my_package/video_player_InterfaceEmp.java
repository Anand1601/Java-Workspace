package my_package;
//best use of interfaces
import java.util.Scanner;

interface VideoPlayer{
void play();
	
}

class Mp4Player implements VideoPlayer{

	@Override
	public void play() {
		System.out.println("Playing MP4 file");
		
	}
	
}



class MOVPlayer implements VideoPlayer{

	@Override
	public void play() {
		System.out.println("Playing Mov file");
	}
	
}

class playFactory{
	public static VideoPlayer getPlayer(String s) {
		if(s.endsWith("mp4"))
			return new Mp4Player();
		else if(s.endsWith("MOV"))
			return new MOVPlayer();
		
		return null;
	}
}


public class video_player_InterfaceEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("Which file U wanna play??");
String s=scn.next();

VideoPlayer ob=playFactory.getPlayer(s);

if(ob==null)
	System.out.println("we can't play this file");
else 
	ob.play();

scn.close();
	}

}
