package jsoupJMS;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Caller {
	
	public static void main(String[] args) throws IOException {
		Document document = Jsoup.connect("http://localhost:8080/RESTfulDemoApplication/user-management/users").ignoreContentType(true).get();
		System.out.println(document.toString());
	}

}
