package Testing;

import Buryk.Oleksandr.ArrayList;

public class JunitTesting {
 
 
 
 
 public int adding(int a){

	 ArrayList<Integer> array = new ArrayList<Integer>();
	 array.add(a);
	 return array.get(array.Size()-1);
	 
 }
 
 
 
 

 
 
 
 public int removing(ArrayList<Integer> array1, int index){
	 	return (int) array1.remove(index);
	 	
	 
 }
 
 
 
 public int getting(ArrayList<Integer> array1, int index)
 {
	 return array1.get(index);
 }
 
 
 
}
