package lsp.safe.collection.contract.classes.list;

import java.util.List;

import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.list.LazyList;

import lsp.safe.collection.contract.interfaces.list.SafeList;

@SuppressWarnings("serial")
public class SafeLazyList<E> extends LazyList<E> implements SafeList<E>{

	public SafeLazyList(List<E> list, Factory<? extends E> factory) {
		super(list, factory);
	}

}
