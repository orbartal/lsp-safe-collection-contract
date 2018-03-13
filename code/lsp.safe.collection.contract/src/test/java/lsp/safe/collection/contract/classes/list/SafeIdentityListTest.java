package lsp.safe.collection.contract.classes.list;

import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.classes.list.SafeIdentityList;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeIdentityList.class)
public class SafeIdentityListTest {

	private IProducer<SafeIdentityList<Integer>> producer = new SafeIdentityListProducer();
	
	@Contract.Inject
	public IProducer<SafeIdentityList<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeIdentityListProducer implements ProducerSafeList <SafeIdentityList <Integer>, Integer> {

		@Override
		public SafeIdentityList<Integer> newInstance() {
			return new SafeIdentityList<Integer>();
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
}