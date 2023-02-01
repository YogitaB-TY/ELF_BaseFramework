package test_Scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.JavaScriptUtil;

public class UsingJavaScript extends Base_Test {
	
	@Test
	public void test() {
		
		JavaScriptUtil javaUtil=new JavaScriptUtil();
		javaUtil.jsScrollBy(300, 400);
	}

}
