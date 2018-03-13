package lsp.safe.collection.contract.classes.list;

import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.classes.list.SafeGrowthList;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeGrowthList.class)
public class SafeGrowthListTest {

	private IProducer<SafeGrowthList<Integer>> producer = new SafeGrowthListProducer();
	
	@Contract.Inject
	public IProducer<SafeGrowthList<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeGrowthListProducer implements ProducerSafeList <SafeGrowthList <Integer>, Integer> {

		@Override
		public SafeGrowthList<Integer> newInstance() {
			return new SafeGrowthList<Integer>();
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
}