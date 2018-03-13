package lsp.safe.collection.contract.classes.list;

import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;

import jadex.commons.collection.WeakList;
import lsp.safe.collection.contract.classes.list.SafeWeakList;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeWeakList.class)
public class SafeWeakListTest {

	private IProducer<SafeWeakList<Integer>> producer = new SafeWeakListProducer();
	
	@Contract.Inject
	public IProducer<SafeWeakList<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeWeakListProducer implements ProducerSafeList <SafeWeakList <Integer>, Integer> {

		@Override
		public SafeWeakList<Integer> newInstance() {
			WeakList list = new WeakList();
			return new SafeWeakList<Integer>(list);
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
}