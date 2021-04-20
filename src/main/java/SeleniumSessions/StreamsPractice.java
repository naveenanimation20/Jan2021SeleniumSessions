package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StreamsPractice {

	public static void main(String[] args) {

		//Streams in JDK 8
		//Functional Interface
		
		//launch amazon app --> 
		//get all the links text -- > 
		//no blank text -> only those links having amazon --> final list
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		
//		List<WebElement> linksList = driver.findElements(By.tagName("a"));
//		
//	List<String> amazonLinksList =	linksList
//										.stream()
//											.filter(ele -> !ele.getText().isEmpty())
//												.filter(ele -> ele.getText().contains("Amazon"))
//													.map(ele -> ele.getText())
//														.collect(Collectors.toList());
//						
//		
//	amazonLinksList.stream().forEach(e -> System.out.println(e));	
		
	List<String> namesList = new ArrayList<String>();
	namesList.add("tom IBM");
	namesList.add("peter CTS");
	namesList.add("lisa IBM");
	namesList.add("steve Infosys");
	namesList.add("naveen abc");
	namesList.add("amita IBM");
	
	
	namesList.stream().filter(e -> e.contains("IBM")).forEach(ele -> System.out.println(ele));

	
	int num[] = {10,2,3,4,56,78,21,2};
	List<int[]> numList = Arrays.asList(num);
	numList.stream().forEach(ele -> System.out.println(ele));
	
	IntStream.range(1, 100).filter(ele -> ele%2==0).forEach(ele -> System.out.println(ele));
	IntStream.range(1, 100).filter(ele -> ele%2==1).forEach(ele -> System.out.println(ele));	
	
	String names[] = {"tom", "peter", "lisa", "Raj"};
	Arrays.asList(names).stream().forEach(ele -> System.out.println(ele));
		
	
	}

}
