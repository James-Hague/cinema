package cinemas;

import java.util.HashMap;

public class ServiceClass {
	
	HashMap<Integer, Movies> hMap = new HashMap<Integer, Movies>();

 public void addMethod (Integer Key, Movies  film ) {
	 
	 hMap.put(Key, film);
 }
 
 public Movies returnMethod (Integer Key) { 
	 return hMap.get(Key);
 }
	
	
}
