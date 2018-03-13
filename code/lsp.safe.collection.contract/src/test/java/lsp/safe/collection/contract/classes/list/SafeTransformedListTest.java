package lsp.safe.collection.contract.classes.list;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.Transformer;
import org.junit.runner.RunWith;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractImpl;
import org.xenei.junit.contract.ContractSuite;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.classes.list.SafeTransformedList;
import lsp.safe.collection.contract.interfaces.list.ProducerSafeList;

@RunWith(ContractSuite.class)
@ContractImpl(SafeTransformedList.class)
public class SafeTransformedListTest {

	private IProducer<SafeTransformedList<Integer>> producer = new SafeTransformedListProducer();
	
	@Contract.Inject
	public IProducer<SafeTransformedList<Integer>> getIProducer() {
		return producer;
	}
	
	class SafeTransformedListProducer implements ProducerSafeList <SafeTransformedList <Integer>, Integer> {

		@Override
		public SafeTransformedList<Integer> newInstance() {
			Transformer<Integer, Integer> transformer = new IntAbsTransformer ();
			List<Integer> list = new ArrayList<Integer>();
			return new SafeTransformedList<Integer>(list, transformer);
		}

		@Override
		public void cleanUp() {
			// TODO Auto-generated method stub
		}
	}
	
	class IntAbsTransformer implements Transformer<Integer, Integer>{

		@Override
		public Integer transform(Integer input) {
			return Math.abs(input);
		}
		
	}
}