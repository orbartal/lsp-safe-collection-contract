package lsp.safe.collection.contract.classes.list;

import java.util.ArrayList;

import lsp.safe.collection.contract.interfaces.list.SafeList;

//https://maxrohde.com/2011/03/09/java-list-equality-and-object-identity/
public class SafeIdentityList<E> extends ArrayList<E> implements SafeList<E> {
	 
	private static final long serialVersionUID = 1L;
	
	public SafeIdentityList() {
		super();
	}
	 
	@Override
	public boolean remove(final Object o) {
		return super.remove(this.indexOf(o)) != null;
	}
	 
	@Override
	public boolean contains(final Object o) {
		return indexOf(o) >= 0;
	}
	 
	@Override
	public int indexOf(final Object o) {
		for (int i = 0; i < size(); i++) {
			if (o == get(i)) {
					return i;
			}
		}
		return -1;
	}
	 
	@Override
	public int lastIndexOf(final Object o) {
	for (int i = size() - 1; i >= 0; i--)
		if (o == get(i)) {
			return i;
		}
		return -1;
	}
}
