package lsp.safe.collection.contract.classes.list;

import java.util.LinkedList;

import lsp.safe.collection.contract.interfaces.list.SafeList;

@SuppressWarnings("serial")
public class SafeLinkedList<E> extends LinkedList<E> implements SafeList<E> {}
