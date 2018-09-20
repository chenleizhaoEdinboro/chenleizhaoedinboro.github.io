package FactoryAndData.B2B;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

import CommonFunction.Common;
import TestData.PropsUtils;
import TestScript.B2B.NA21963Test;

public class NA21963 {
	@DataProvider(name = "21963")
	public static Object[][] Data21963() {
		return Common.getFactoryData(new Object[][] { 
			{ "US"}
		},PropsUtils.getTargetStore("NA-21963"));
	}

	@Factory(dataProvider = "21963")
	public Object[] createTest(String store) {

		Object[] tests = new Object[1];

		tests[0] = new NA21963Test(store);

		return tests;
	}
}