package SeleniumSessions;

public class AmazonAppTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		
		br.init_driver("chrome");
		br.launchUrl("http://www.amazon.com");
		String title = br.getPageTitle();
		System.out.println("page title is: " + title);
		
		if(title.contains("Online Shopping")) {
			System.out.println("correct title");
		}
		
		System.out.println(br.getPageUrl());
		br.closeBrowser();
		
		
		
	}

}
