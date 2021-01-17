package Utils;
// Uitility class
import static java.time.LocalDate.*;
import java.util.HashMap;

import com.app.core.Books;
import static com.app.core.Category.*;

public class BookUtils {
	//method to populate the book details and return hashmap of book details to the caller
	public static HashMap<String, Books> populateBookDetails(){
		HashMap<String, Books>  bookMap  = new HashMap<>();
	
		Books b1 =  new Books("KhuniAunty", 10, 4, 50, FICTION, parse("1989-12-12"));
		b1.linkAuthor("Shalabh Soni","shalabh@gmail.com");
		bookMap.put("KhuniAunty",b1);
		
		Books b2 = new Books("Cosmos", 10, 3, 34, SCIENCE, parse("1998-12-05"));
		b2.linkAuthor("Ryan Renolds", "Ryan@gmail.com");
		bookMap.put("Cosmos", b2);
		
		Books b3 = new Books("YogaAsans", 10, 5, 344, YOGA, parse("1999-11-12"));
		b3.linkAuthor("RamDev", "Ramdev@gmail.com");
		bookMap.put("YogaAsans", b3);
		
		Books b4 = new Books("Peace of Mind", 10, 3, 244, MEDITATION, parse("1992-07-05"));
		b4.linkAuthor("GuruDev Dutt", "Gurudev@gmail.com");
		bookMap.put("Peace of Mind", b4);
	
		Books b5 = new Books("Money IS Every Thing", 10, 5, 249, FINANCE, parse("1999-12-01"));
		b5.linkAuthor("MintuChand gokhe", "mintu@gmail.com");
		bookMap.put("Money IS Every Thing", b5);
		
		Books b6 =  new Books("Avengers", 10, 4, 50, FICTION, parse("1990-01-12"));
		b6.linkAuthor("Shalabh Soni","shalabh@gmail.com");
		bookMap.put("Avengers",b6);
		
		Books b7 = new Books("Life OF Light", 10, 3, 34, SCIENCE, parse("1991-12-12"));
		b7.linkAuthor("Ryan Renolds", "Ryan@gmail.com");
		bookMap.put("Life OF Light", b7);
		
		Books b8 = new Books("Chakrass", 10, 5, 344, YOGA, parse("1999-12-12"));
		b8.linkAuthor("RamDev", "Ramdev@gmail.com");
		bookMap.put("Chakrass", b8);
		
		Books b9 = new Books("Sensational Mind", 10, 3, 244, MEDITATION, parse("1994-09-08"));
		b9.linkAuthor("GuruDev Dutt", "Gurudev@gmail.com");
		bookMap.put("Sensational Mind", b9);
	
		Books b10 = new Books("Bazaar", 10, 5, 249, FINANCE, parse("1984-11-11"));
		b10.linkAuthor("MintuChand gokhe", "mintu@gmail.com");
		bookMap.put("Bazaar", b10);
		
		return bookMap;
	}
	

	
}
