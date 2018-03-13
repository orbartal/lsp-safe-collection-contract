package lsp.safe.collection.contract.classes.list;

import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.classes.list.SafeTreeList;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeTreeList.class)
public class SafeTreeListTest {

	private IProducer<SafeTreeList<Integer>> producer = new SafeTreeListProducer();
	
	@Contract.Inject
	public IProducer<SafeTreeList<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeTreeListProducer implements ProducerSafeList <SafeTreeList <Integer>, Integer> {

		@Override
		public SafeTreeList<Integer> newInstance() {
			return new SafeTreeList<Integer>();
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
}