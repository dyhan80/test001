package exam01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Test001 {

	public static void main(String[] args) {
		try {
			URL url;
			//url = new URL("ÇØ´ç URL");
			//URLConnection urlConn = url.openConnection();
			File html = new File("d:/test.html");
			//BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			BufferedWriter out = new BufferedWriter(new FileWriter(html));
			//String str;
			//StringBuffer sb = new StringBuffer();
			//while ((str = in.readLine()) != null) {
			//sb.append(str);
			//}
			//out.write(sb.toString());
			//in.close();
			//out.close();
			System.out.println("123123");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
