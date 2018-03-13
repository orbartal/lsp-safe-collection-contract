package lsp.safe.collection.contract.classes.list;

import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.classes.list.SafeFixedSizeList;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeFixedSizeList.class)
public class SafeFixedSizeListTest {

	private IProducer<SafeFixedSizeList<Integer>> producer = new SafeFixedSizeListProducer();
	
	@Contract.Inject
	public IProducer<SafeFixedSizeList<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeFixedSizeListProducer implements ProducerSafeList <SafeFixedSizeList <Integer>, Integer> {

		@Override
		public SafeFixedSizeList<Integer> newInstance() {
			Integer[] arr = new Integer[100];
			return new SafeFixedSizeList<Integer>(arr);
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
}