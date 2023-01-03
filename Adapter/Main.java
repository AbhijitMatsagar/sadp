import java.util.*; 
public class Main { 
public static void main (String args[]) { 
Vector<String> v = new Vector<String>(Arrays.asList(args)); 
Iterator<?> iterator = new EnumerationIterator(v.elements());
while (iterator.hasNext()) { 
System.out.println(iterator.next()); 
} 
} 
}