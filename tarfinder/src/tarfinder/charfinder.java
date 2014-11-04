package tarfinder;

public class charfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		charfinder cf = new charfinder();
		
		String s = "Praktikum"; //man fängt immer ab Null an zu zählen also P ist "0"
		
		//char t = s.charAt(0); 
		//System.out.println(t + s.length());
		
		//Character l = s.charAt(s.length() - 1);
		//System.out.println(l);
		
		System.out.println("the first character of" + s + "is" + cf.getFristChar(s));
		System.out.println("the lasr character of" + s + "is" + cf.getLastChar(s));
		System.out.println(s + "length is" + s.length());
		
		cf.printAllCharPositions(s);
		
		cf.getCharPos(s, 'k');

	}
	
	Character getFristChar(String s) {
		
		Character ch = s.charAt(0);
		
		//return null; schreibt mann wenn man eine Methode schreibt und die Fehlermeldung wegen leere weghaben möchte
		return ch;
	}
	
	Character getLastChar(String s) {
		
		Character ch = s.charAt(s.length() -1); // -1 benutzt man um an die letze Stelle eines Strings zu kommen
		
		return ch;
	}
	
	void printAllCharPositions(String s) {
		
		Integer currentPosition = 0;
		Integer lastPosition = s.length() -1;
		
		while(currentPosition <= lastPosition) //Bedingung solange die Schleife weiter gehen soll, also die Abbruchbedingung 
			{
			
			System.out.println(s.charAt(currentPosition) + "is at position " + currentPosition);
			
		    currentPosition++;
			
		}}
		
	void getCharPos(String s, Character tofind) {
		
		Integer currentPosition = 0;
		Integer lastPosition = s.length() -1;
		
		Boolean found = false;
		
		while(currentPosition <= lastPosition) {
			
			if (s.charAt(currentPosition) == tofind) {
				
				System.out.println(tofind + "is at position" + currentPosition + "of" + s);
				
				found = true; //wenn die if Schleife bis hierhin gekommen ist ändert man den boolean Wert von false auf true
			}
			
			currentPosition++;
		}
		
		if (found == false) {
			
			System.out.println(tofind + "was not found");
			
		}
		
		
		
		
	}	
		
	

}
