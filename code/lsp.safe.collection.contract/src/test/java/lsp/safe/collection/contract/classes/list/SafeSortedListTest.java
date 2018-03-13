package lsp.safe.collection.contract.classes.list;

import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.classes.list.SafeSortedList;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeSortedList.class)
public class SafeSortedListTest {

	private IProducer<SafeSortedList<Integer>> producer = new SafeSortedListProducer();
	
	@Contract.Inject
	public IProducer<SafeSortedList<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeSortedListProducer implements ProducerSafeList <SafeSortedList <Integer>, Integer> {

		@Override
		public SafeSortedList<Integer> newInstance() {
			return new SafeSortedList<Integer>();
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
}