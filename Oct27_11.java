import java.util.ArrayList;
import java.util.Iterator;

public class Oct27_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> new_list = new ArrayList<Integer>();
new_list.add(23);
new_list.add(8);
new_list.add(31);
new_list.add(45);
new_list.add(6);
new_list.add(7);
new_list.add(19);
new_list.add(15);
Iterator<Integer> Iter=new_list.iterator();

while(Iter.hasNext())
{
Integer newNumber = Iter.next();
	if(newNumber<10)
		Iter.remove();
	if(newNumber>20)
		Iter.remove();

}
System.out.println(new_list);

	}

}
