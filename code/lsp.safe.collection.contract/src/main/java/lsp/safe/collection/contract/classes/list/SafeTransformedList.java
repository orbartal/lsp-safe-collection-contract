package lsp.safe.collection.contract.classes.list;


import java.util.List;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.list.TransformedList;
import lsp.safe.collection.contract.interfaces.list.SafeList;

/**
See: 
https://commons.apache.org/proper/commons-collections/apidocs/org/apache/commons/collections4/list/TransformedList.html
 */
@SuppressWarnings("serial")
public class SafeTransformedList<E> extends TransformedList<E> implements SafeList<E>  {

	public SafeTransformedList(List<E> list, Transformer<? super E, ? extends E> transformer) {
		super(list, transformer);
	}
	
}
