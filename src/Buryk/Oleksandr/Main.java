package Buryk.Oleksandr;


public class Main {
public static void main(String[] args) {
	
	
	
	
	
	
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
	
		arrayList.add(0);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		arrayList.add(70);
		arrayList.showList();
		
		System.out.println("---------");
		System.out.println("removed element= " +arrayList.remove(5));
		
		arrayList.showList();
		
		System.out.println("---------");
		
		
		System.out.println("geeting element by index(3)=  "+arrayList.get(3));
		System.out.println("---------");
		ArrayList<Integer> arrayRemoving = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arrayRemoving.add(i);
		}

		arrayRemoving.showList();
		
		
		System.out.println("---------");
		System.out.println("removed element=" +arrayRemoving.remove(1));
		System.out.println("---------");
		arrayRemoving.showList();
		
		
}



}
