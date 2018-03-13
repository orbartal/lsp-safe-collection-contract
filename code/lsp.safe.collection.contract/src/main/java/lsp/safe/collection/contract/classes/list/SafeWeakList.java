package lsp.safe.collection.contract.classes.list;

import jadex.commons.collection.WeakList;

public class SafeWeakList<E> extends ForwardingSafeList<E> {

	@SuppressWarnings("unchecked")
	public SafeWeakList(WeakList list) throws NullPointerException {
		super(list);
	}

	
}
