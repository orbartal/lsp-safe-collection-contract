package lsp.safe.collection.contract.classes.list;

import java.util.List;
import java.util.Set;
import org.apache.commons.collections4.list.SetUniqueList;
import lsp.safe.collection.contract.interfaces.list.SafeList;

@SuppressWarnings("serial")
public class SafeSetUniqueList <E> extends SetUniqueList<E> implements SafeList<E> {
	public SafeSetUniqueList(List<E> list, Set<E> set) {
		super(list, set);
	}
}
