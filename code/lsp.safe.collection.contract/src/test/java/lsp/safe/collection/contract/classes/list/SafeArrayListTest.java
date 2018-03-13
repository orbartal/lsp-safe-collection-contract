package lsp.safe.collection.contract.classes.list;

import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeArrayList.class)
public class SafeArrayListTest {

	private IProducer<SafeArrayList<Integer>> producer = new SafeArrayListProducer();
	
	@Contract.Inject
	public IProducer<SafeArrayList<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeArrayListProducer implements ProducerSafeList <SafeArrayList <Integer>, Integer> {

		@Override
		public SafeArrayList<Integer> newInstance() {
			return new SafeArrayList<Integer>();
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
}