package lsp.safe.collection.contract.interfaces.list;

import java.util.Iterator;
import org.junit.After;
import org.junit.Before;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractTest;
import org.xenei.junit.contract.IProducer;

@Contract(Iterable.class)
public class IterableTest {
	private IProducer<Iterable<Integer>> producer;
	private Iterable<Integer> fixure;

	@Contract.Inject
	public void setIterable(IProducer<Iterable<Integer>> producer) {
		this.producer = producer;
	}

	@Before
	public void populate() {
		fixure = producer.newInstance(); 
	}

	@After
	public void cleanup() {
		producer.cleanUp();
	}

	@ContractTest
	public void testHasNextMax1000() throws Exception {
		int counter = 1000; //Not to run for infinity
		Iterator<Integer> it = fixure.iterator();
		while (it.hasNext() && counter>0) {
			it.next();
			counter--;
		}
	}

	@ContractTest
	public void doubleIterator() throws Exception {
		fixure.iterator();
		fixure.iterator();
	}
}