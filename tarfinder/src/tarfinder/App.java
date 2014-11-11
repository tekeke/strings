package tarfinder;

public class App {

	public static void main(String[] args) {
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

}
