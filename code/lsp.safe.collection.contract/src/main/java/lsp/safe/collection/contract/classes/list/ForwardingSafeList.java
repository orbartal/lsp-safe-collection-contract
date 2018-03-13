package lsp.safe.collection.contract.classes.list;

import java.util.List;

import com.google.common.collect.ForwardingList;

import lsp.safe.collection.contract.interfaces.list.SafeList;



public class ForwardingSafeList<E> extends ForwardingList<E> implements SafeList<E> {
	
	final private List<E>  m_list;
	
	public ForwardingSafeList (List<E> list) throws NullPointerException {
		if (list==null) {
			throw new NullPointerException ("list cannot be null in ForwardingSafeList constructor");
		}
		m_list = list;
	}
	
	@Override
	protected List<E> delegate() {
		return m_list;
	}

}

