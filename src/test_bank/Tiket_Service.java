package test_bank;

import java.util.ArrayList;
import java.util.List;

public class Tiket_Service {
	public String Move_name;
	public String Insert_movie;
	List<String> Insert_List = new ArrayList<String>();
	
	public void Insert_Movie_Service(String Insert_movie) {
		
		
		Insert_List.add(Insert_movie);
		
		
	}
	
	@Override
	public String toString() {
		return Insert_List.toString();
	}
}
