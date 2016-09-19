package HW3.HW3;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class TestMain.
 */
public class TestMain {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args)
	{
		
		HW3_141044019_Emre_Bayram<Integer> list = new HW3_141044019_Emre_Bayram<Integer>();
		List<Integer> listnew = new HW3_141044019_Emre_Bayram<Integer>();
			
		
		System.out.println("New List\n");
		for(int i = 0; i < 10; ++i)
			System.out.println(listnew.get(i).toString());
		
		
		System.out.println("Other List\n");
		for(int i = 0; i < 20; ++i)
			System.out.println(list.get(i).toString());
		
		
		list.addAllAtHead(listnew);
		System.out.println("adds all at head\n");
		for(int i = 0; i < 30; ++i)
			System.out.println(Integer.toString(i)+": " + list.get(i).toString());
		
		
		list.sortList(true);
		System.out.println("Normal sorting \n");
		for(int i = 0; i < 30; ++i)
			System.out.println(Integer.toString(i)+": " + list.get(i).toString());
		
		
		list.sortList(false);
		System.out.println("Reverse sorting \n");
		for(int i = 0; i < 30; ++i)
			System.out.println(Integer.toString(i)+": " + list.get(i).toString());
		
		
		listnew = list.getIntersectList(listnew);
		System.out.println("InterSection List Testing \n \n");
		for(int i = 0; i < listnew.size(); ++i)
			System.out.println(Integer.toString(i)+": " + listnew.get(i).toString());
		
		
	}
}
