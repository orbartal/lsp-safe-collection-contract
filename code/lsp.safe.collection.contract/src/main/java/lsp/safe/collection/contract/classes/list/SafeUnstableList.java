package lsp.safe.collection.contract.classes.list;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SafeUnstableList<E> extends ForwardingSafeList<E> {

	private int m_maxSize = 0;
	public SafeUnstableList(List<E> list, int max) throws NullPointerException {
		super(list);
		m_maxSize = max;
	}	
	
	@Override
	 public void add(int index, E element) {
		this.delegate().add(index, element);
		if (m_maxSize < index && index<this.delegate().size()) {
			int randomIndex1 = ThreadLocalRandom.current().nextInt(0, m_maxSize);
			int randomIndex2 = ThreadLocalRandom.current().nextInt(0, m_maxSize);
			replace(randomIndex1, randomIndex2);
		}
	  }

	private void replace(int randomIndex1, int randomIndex2) {
		E element1 = this.delegate().get(randomIndex1);
		E element2 = this.delegate().get(randomIndex2);
		this.delegate().set(randomIndex1, element2);
		this.delegate().set(randomIndex2, element1);
	}

}
