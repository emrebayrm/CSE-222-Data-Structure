package HW3.HW3;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * The Class HW3_141044019_Emre_Bayram.
 *
 * @param <E> the element type
 */
public class HW3_141044019_Emre_Bayram<E extends Comparable<E>> extends LinkedList<E>
{
	/**
	 * *.
	 *
	 * @param col : collection of list;
	 * @return true or false whether all collection
	 */
	public boolean addAllAtHead (Collection <?extends E> col)
	{
		try{
			Iterator<E> i = (Iterator<E>) col.iterator();
			while(i.hasNext())
			{
				addFirst(i.next());
			}
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	/**
	 * *
	 * Creates a Linked list and Adds the same elements to list.
	 *
	 * @param c the c
	 * @return return intersected list
	 */
	public List<E> getIntersectList(Collection<? extends E>  c)
	{
		Iterator<? extends E> iter = c.iterator();
		LinkedList<E> res = new LinkedList<E>();
		E elem;
		try{
		while(iter.hasNext())
		{
			elem = iter.next();
			if(contains(elem) && !(res.contains(elem)))
				res.add(elem);
		}
		}
		catch(Exception e)
		{
			return null;
		}
		return res;
	}
	
	/**
	 * *
	 *  Sorts List.
	 *
	 * @param increasing the increasing
	 * @return returns sorted list
	 */
	public List<E> sortList(boolean increasing)
	{
		boolean swapped = false;
		if(!increasing)
		{
			do
			{
				for(int i = 0; i < size()-2; ++i)
			  	{
			  		if(get(i).compareTo(get(i+1)) < 0)
			  		{
			  			E temp = get(i);
			  			set(i,get(i+1));
			  			set(i+1,temp);
			  			swapped = true;
			  		}
			  	}
				if(!swapped)
					break;
				
				swapped = false;
				for(int i = size() -2 ; i > 0; --i)
				{
					if(get(i).compareTo(get(i+1)) < 0)
			  		{
			  			E temp = get(i);
			  			set(i,get(i+1));
			  			set(i+1,temp);
			  			swapped = true;
			  		}
				}
			}while(swapped);
		}
		else{
			do
			{
				for(int i = 0; i < size()-2; ++i)
			  	{
			  		if(get(i).compareTo(get(i+1)) < 0)
			  		{
			  			E temp = get(i);
			  			set(i,get(i+1));
			  			set(i+1,temp);
			  			swapped = true;
			  		}
			  	}
				if(!swapped)
					break;
				
				swapped = false;
				for(int i = size() -2 ; i > 0; --i)
				{
					if(get(i).compareTo(get(i+1)) < 0)
			  		{
			  			E temp = get(i);
			  			set(i,get(i+1));
			  			set(i+1,temp);
			  			swapped = true;
			  		}
				}
			}while(swapped);
		}
		return this;
	}
}