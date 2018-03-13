package lsp.safe.collection.contract.interfaces.list;

import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.interfaces.list.SafeList;

public interface ProducerSafeList<T extends SafeList<E>, E> extends IProducer<T> {}
