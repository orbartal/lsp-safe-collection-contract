package lsp.safe.collection.contract.interfaces.list;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.xenei.junit.contract.Contract;
import org.xenei.junit.contract.ContractTest;
import org.xenei.junit.contract.IProducer;
import lsp.safe.collection.contract.interfaces.list.SafeList;

@Contract(SafeList.class)
public class SafeListTest {
	private IProducer<SafeList<Integer>> producer;
	private SafeList<Integer> fixure;

	@Contract.Inject
	public void setIterable(IProducer<SafeList<Integer>> producer) {
		this.producer = producer;
	}

	@Before
	public void setup() {
		fixure = producer.newInstance();
	}

	@After
	public void cleanup() {
		producer.cleanUp();
	}
	
	@ContractTest
	public void test1() throws Exception {
		Assert.assertNotNull(fixure);
	}
}
