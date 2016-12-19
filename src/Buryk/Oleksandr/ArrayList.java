package Buryk.Oleksandr;

import java.util.Arrays;

public class ArrayList<T> {
	private Object element[]={};
	private int size=0;

	//constructor
	public ArrayList() {
		element = new Object[10];
	}

	
	
	
	
	//Getter to Size();
	public int Size() {
		return size;
	}







	//Check size of Array (n * 3) / 2 + 1
	private void increaseSize(){
		int newSize = (element.length * 3) / 2  + 1;
		element=Arrays.copyOf(element, newSize); // i can copy array in loop(will show it in method remove), but this realization is faster; 
		
	}
	
	//
	
	//Generate Method add(value), first i have to check size of array, if size equals previous array, i increase it. Than it's easy to add element into end of array;
	public <T> void add(T e){
		if (size == element.length) {
			increaseSize();
		}
		element[size++]=e;

		
	}
	
	
	// Service Method to check outOfBound Index
	private boolean checkIndex(int index){
		if (index< 0 || index>=size){
			return false;
		}
		return true;
	}
	//Method remove. Need to check index, after that to copy array. Such copy is faster because if you remove element from the end Loop work's only once.
	public Object remove(int index){
		if (checkIndex(index)){
			Object removedElem= element[index];
			/*for (int i = index; i < size; i++) {
				element[i]= element[i+1];
			}*/
			int numMoved = size - index - 1;
			System.arraycopy(element, index + 1, element, index, numMoved);
			
			
			
			element[--size] = null;
			return removedElem;
		}
		else {return new IndexOutOfBoundsException("wrong index"+index);
		}
	}
	
	// Method Get.
	
	public T get(int index){
		
		if (checkIndex(index)){
			return (T) element[index];
		}
		else {
			return null;
		}
		
	} 
	
	
	// method is empty
	public boolean isEmpty(){
		
		if (size==0) {
			return true;
		}
		
		
		return false;
	}
	
	
	
	  public void showList() {
	      System.out.print("Displaying list : ");
	      for(int i=0;i<size;i++){
	             System.out.print(element[i]+" ");
	      }
	  }
	
/*	public <T> get(int index){
		return (T)element;
	}*/
	
	
	
	
	
}
