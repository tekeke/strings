package tarfinder;

public class charfinder {

	
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
			
		}}
		
		void countCharOccALaForLoop(String s, Character toFind){                             //von hier an neu (11.11.14)
			
			s = s.toLowerCase();
			
			Integer stringLength = s.length();
			Integer charOcc= 0;
			
			for(Integer i=0; i<stringLength; i++) {
				
				if (s.charAt(i) !=toFind) {
				continue;
				} else {
					charOcc++;
				}
				
				if (charOcc == 0) {
				System.out.println(" " + toFind + " was not found in " + s);	
				} else {
					
					if (charOcc ==1) {
					
						System.out.println("there is " + charOcc + " occurence of " + toFind + " in " + s);
					} else {
						System.out.println("there are " + charOcc + " occurences of " + toFind + " in " + s);
					}
				}
				}
				
			}
		
       void countCharOccALaWhileLoop(String s, Character toFind){                             //von hier an neu (11.11.14)
			
			s = s.toLowerCase();
			
			Integer currentPosition = 0;
			Integer charOcc= 0;
			
			while(currentPosition < s.length()) {
				if (s.charAt(currentPosition) != toFind){
				continue;
			} else { 
				charOcc++;
			}
			}
			}
			
	
		
		
		
		
	}	
		
	


