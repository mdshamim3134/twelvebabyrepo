import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class D3 {
	D2 x;
	public void instantiated() {
		 x =new D2();
		List<WebElement> elements=x.Elements(By.xpath(""));
		for(WebElement e:elements) {
			System.out.println(e);
			
		}}
	@Test
		public void arrayChec() {
			
		
		ArrayList a=new ArrayList();
		a.add(200);
		a.add("asma");
		a.add("shamama");
		System.out.println(a);
		
	}
	@Test
	public void max() {
		int [] a= {1500,88,99,1500};
	List list=	Arrays.asList(a);
	//Iterator i=list.iterator();
	//System.out.println(i);
		
		
		int max1=0;
		int max2=0;
		for(int s:a) {
		if(max1<s) {
			
		
			
			max2=max1;
				max1=s;
				
		}
		else if(max2<s) {
			
				max2=s;
			
		}
			
		}
		System.out.println(max1);
		System.out.println(max2);
		
			
	}
	
	

}
