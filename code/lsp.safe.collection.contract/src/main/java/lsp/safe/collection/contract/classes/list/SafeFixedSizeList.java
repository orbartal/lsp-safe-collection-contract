package lsp.safe.collection.contract.classes.list;

import java.util.Arrays;
import java.util.Collection;

import com.google.errorprone.annotations.CanIgnoreReturnValue;


public class SafeFixedSizeList<E> extends ForwardingSafeList<E>  {
	
	private int m_maxSize = 0;
	
	public SafeFixedSizeList(E[] array) {
		super(Arrays.asList(array));
		m_maxSize = array.length-1;
	}
	
	 @Override
	 public void add(int index, E element) {
		if (index<m_maxSize) {
			this.delegate().set(index, element);
		}
	  }
	 
	 public E get (int index) {
		 if (index>m_maxSize) {
			 return null;
		 }
		 return this.delegate().get(index);
	 }

	  @CanIgnoreReturnValue
	  @Override
	  public boolean addAll(int index, Collection<? extends E> elements) {
		  boolean modify= false;
		  for (E element : elements) {
	    	this.add(index, element);
	    	index++;
	    	modify = true;
	    }
		return modify;
	  }
}
