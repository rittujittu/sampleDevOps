package sampleDevOps;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSample {
	@Test
	public void test() {
		SampleBean bean = new SampleBean();
		bean.setName("Jittu");
		Assert.assertTrue(bean.getName() == "Jittu");
	}
}
