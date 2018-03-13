package lsp.safe.collection.contract.classes.list;

import java.util.ArrayList;
import java.util.List;
import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.classes.list.SafeListWithDefault;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeListWithDefault.class)
public class SafeListWithDefaultTest {

	private IProducer<SafeListWithDefault<Integer>> producer = new SafeListWithDefaultProducer();
	
	@Contract.Inject
	public IProducer<SafeListWithDefault<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeListWithDefaultProducer implements ProducerSafeList <SafeListWithDefault <Integer>, Integer> {

		@Override
		public SafeListWithDefault<Integer> newInstance() {
			List<Integer> list = new ArrayList<Integer>();
			return new SafeListWithDefault<Integer>(list, 0);
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
}