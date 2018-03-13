package lsp.safe.collection.contract.classes.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.classes.list.SafeSetUniqueList;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeSetUniqueList.class)
public class SafeSetUniqueListTest {

	private IProducer<SafeSetUniqueList<Integer>> producer = new SafeSetUniqueListProducer();
	
	@Contract.Inject
	public IProducer<SafeSetUniqueList<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeSetUniqueListProducer implements ProducerSafeList <SafeSetUniqueList <Integer>, Integer> {

		@Override
		public SafeSetUniqueList<Integer> newInstance() {
			List<Integer> list = new ArrayList<Integer>();
			Set<Integer> set = new HashSet<Integer>();
			return new SafeSetUniqueList<Integer>(list, set);
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
}