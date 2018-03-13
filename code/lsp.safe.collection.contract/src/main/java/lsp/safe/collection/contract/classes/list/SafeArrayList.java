package lsp.safe.collection.contract.classes.list;

import java.util.ArrayList;
import lsp.safe.collection.contract.interfaces.list.SafeList;

@SuppressWarnings("serial")
public class SafeArrayList<E> extends ArrayList<E> implements SafeList<E> {}
