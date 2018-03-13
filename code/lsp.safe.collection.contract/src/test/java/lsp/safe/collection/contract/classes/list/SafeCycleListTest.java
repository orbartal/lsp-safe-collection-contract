package lsp.safe.collection.contract.classes.list;

import java.util.ArrayList;

import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.classes.list.SafeCycleList;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeCycleList.class)
public class SafeCycleListTest {

	private IProducer<SafeCycleList<Integer>> producer = new SafeCycleListProducer();
	
	@Contract.Inject
	public IProducer<SafeCycleList<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeCycleListProducer implements ProducerSafeList <SafeCycleList <Integer>, Integer> {

		@Override
		public SafeCycleList<Integer> newInstance() {
			ArrayList<Integer> list = new ArrayList<Integer>();
			return new SafeCycleList<Integer>(100, list);
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
}