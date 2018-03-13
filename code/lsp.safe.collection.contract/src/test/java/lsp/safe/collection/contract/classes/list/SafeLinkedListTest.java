package lsp.safe.collection.contract.classes.list;

import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.classes.list.SafeLinkedList;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeLinkedList.class)
public class SafeLinkedListTest {

	private IProducer<SafeLinkedList<Integer>> producer = new SafeLinkedListProducer();
	
	@Contract.Inject
	public IProducer<SafeLinkedList<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeLinkedListProducer implements ProducerSafeList <SafeLinkedList <Integer>, Integer> {

		@Override
		public SafeLinkedList<Integer> newInstance() {
			return new SafeLinkedList<Integer>();
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
}