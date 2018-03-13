package lsp.safe.collection.contract.classes.list;

import java.util.ArrayList;
import java.util.List;
import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.classes.list.SafeUnstableList;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeUnstableList.class)
public class SafeUnstableListTest {

	private IProducer<SafeUnstableList<Integer>> producer = new SafeUnstableListProducer();
	
	@Contract.Inject
	public IProducer<SafeUnstableList<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeUnstableListProducer implements ProducerSafeList <SafeUnstableList <Integer>, Integer> {

		@Override
		public SafeUnstableList<Integer> newInstance() {
			List<Integer> list = new ArrayList<Integer>();
			return new SafeUnstableList<Integer>(list, 100);
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
}