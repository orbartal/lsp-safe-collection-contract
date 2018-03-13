package lsp.safe.collection.contract.classes.list;

import org.apache.commons.collections4.list.TreeList;
import lsp.safe.collection.contract.interfaces.list.SafeList;

public class SafeTreeList<E> extends TreeList<E> implements SafeList<E> {}

