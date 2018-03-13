package lsp.safe.collection.contract.classes.list;

import org.apache.commons.collections4.list.GrowthList;
import lsp.safe.collection.contract.interfaces.list.SafeList;

@SuppressWarnings("serial")
public class SafeGrowthList<E> extends GrowthList<E> implements SafeList<E> {}
