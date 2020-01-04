package delnex4d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class Cars {
	public static void main(String[] args) {
		Showroom s1 = new Showroom("Pride", "Hyderabad", "Punto", "LMV", 6);
		Showroom s2 = new Showroom("Pride", "Bangalore", "Linea", "LMV", 6);
		Showroom s3 = new Showroom("Pride", "Mumbai", "Jeep", "SUV", 6);
		Showroom s4 = new Showroom("Utkal", "Hyderabad", "Swift", "LMV", 6);
		Showroom s5 = new Showroom("Utkal", "Delhi", "Dzire", "LMV", 6);
		ArrayList<Showroom> sw1 = new ArrayList<>();
		sw1.add(s1);
		sw1.add(s2);
		sw1.add(s3);
		
		ArrayList<Showroom> sw2 = new ArrayList<>();
		sw2.add(s4);
		sw2.add(s5);
		
		HashMap<String, ArrayList<Showroom>> hm = new HashMap<>();
		
		hm.put(s1.getsName(), sw1);
		hm.put(s4.getsName(), sw2);
		
		ArrayList<Showroom> al1 = hm.get("Pride");
		ArrayList<Showroom> al2 = hm.get("Utkal");
		
		for(Showroom sw:al1){
			System.out.println(sw);
		}
		for(Showroom sw:al2){
			System.out.println(sw);
		}
	}
	
}
