package lsp.safe.collection.contract.classes.list;

import jadex.commons.collection.SortedList;
import lsp.safe.collection.contract.interfaces.list.SafeList;

@SuppressWarnings("serial")
public class SafeSortedList<E> extends SortedList<E> implements SafeList<E> {}
