package cinemas;

import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ServiceClass {

	HashMap<Integer, Movies> hMap = new HashMap<Integer, Movies>();

	public void addMethod(Integer Key, Movies film) {

		hMap.put(Key, film);
	}

	public Movies returnMethod(Integer Key) {
		return hMap.get(Key);
	}

	public String convert() {

		String json = null;
		try {
			json = new ObjectMapper().writeValueAsString(hMap);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return json;
	}
	public String convertSingle(int movieNumber) {

		String json = null;
		try {
			json = new ObjectMapper().writeValueAsString(hMap.get(movieNumber));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return json;
	}
}
