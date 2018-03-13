package lsp.safe.collection.contract.classes.list;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.collections4.Factory;
import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.classes.list.SafeLazyList;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeLazyList.class)
public class SafeLazyListTest {

	private IProducer<SafeLazyList<Integer>> producer = new SafeLazyListProducer();
	
	@Contract.Inject
	public IProducer<SafeLazyList<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeLazyListProducer implements ProducerSafeList <SafeLazyList <Integer>, Integer> {

		@Override
		public SafeLazyList<Integer> newInstance() {
			Factory<Integer> factory = new RandomIntegerFactory ();
			List<Integer> list = new ArrayList<Integer>();
			return new SafeLazyList<Integer>(list, factory);
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
	
	class RandomIntegerFactory implements Factory<Integer> {

		@Override
		public Integer create() {
			return ThreadLocalRandom.current().nextInt(0, 100);
		}
		
	}

}