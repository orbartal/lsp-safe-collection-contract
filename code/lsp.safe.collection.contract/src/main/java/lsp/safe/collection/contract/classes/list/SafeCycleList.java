package lsp.safe.collection.contract.classes.list;

import java.util.Collection;
import java.util.List;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

public class SafeCycleList<E> extends ForwardingSafeList<E> {
	
	private int m_maxSize = 0;
	
	public SafeCycleList(int size, List<E> list) throws NullPointerException {
		super(list);
		m_maxSize = size;
	}
	
	 @Override
	 public void add(int index, E element) {
		int indexMod = index % m_maxSize;
		this.delegate().add(indexMod, element);
		if (this.delegate().size()==m_maxSize) {
			this.remove(0);
		}
	  }
	 
	 public E get(int index) {
		 int indexMod = index % m_maxSize;
		 return this.delegate().get(indexMod);
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
