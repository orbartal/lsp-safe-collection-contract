package lsp.safe.collection.contract.classes.list;

import java.util.Iterator;
import java.util.List;

import com.google.common.collect.ForwardingIterator;

public class SafeListWithDefault<E> extends ForwardingSafeList<E> {
    final E m_defaultElement;

    public SafeListWithDefault(List<E> list, E value) {
    	super(list);
    	m_defaultElement = value;
    }

    @Override 
    public E get(int index) {
        E v = super.get(index);
        return (v == null ? m_defaultElement : v);
    }
    
    @Override 
    public Iterator<E> iterator() {
        final Iterator<E> iter = super.iterator();
        return new ForwardingIterator<E>() {
            @Override protected Iterator<E> delegate() {
                return iter;
            }
            @Override public E next() {
                E v = super.next();
                return (v == null ? m_defaultElement : v); 
            }
        };
    }
}
