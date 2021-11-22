import java.util.*;
//class
public class Str {
	public String str; //field
	//constructor
	public Str() {
		str = "Hello to the world"; //assign an initial value to str
	}
	//method
	public void ReverseString() {
		/*creates an array wordArray.
		 * We fill it with the individual words of the array.
		 * Example: [Hello, to, the, world]
		 */
		String [] wordArray = str.split(" ");
		/*reverses the array filled with words
		 * Example: [world, to, the, Hello]
		 */
		Collections.reverse(Arrays.asList(wordArray));
		/*Joins the individual words 
		 * with space in between.
		 * And assigns the joined string 
		 * to str.
		 */
		str = String.join(" ", wordArray);	
	}

}
