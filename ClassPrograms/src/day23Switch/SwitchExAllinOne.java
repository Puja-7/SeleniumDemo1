package day23Switch;

public class SwitchExAllinOne {

	public static void main(String[] args) {
		int i=7; //July Aug
		//i=13;
		switch(i)
		{
		case 1:System.out.println("January"); break;
		case 2: System.out.println("Feb"); break;
		case 3: System.out.println("March"); break;
		case 4: System.out.println("April"); break;
		case 5: System.out.println("May"); break;
		case 6: System.out.println("June"); break;
		case 7: System.out.println("July"); //break; if you dont write break; then output will be July Aug
		case 8: System.out.println("Aug"); break;
		case 9: System.out.println("Sep"); break;
		case 10: System.out.println("Oct"); break;
		case 11: System.out.println("Nov"); break;
		case 12: System.out.println("Dec"); break;
		default:System.out.println("Invalid input ");// break;
		}
		
	}
}
