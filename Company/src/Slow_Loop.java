import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JOptionPane;


public class Slow_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
//		for (int i = 0; i < 25; i++) {
//			try{
//
//				  Thread.sleep(1000);
//				}catch(InterruptedException ex){
//					JOptionPane.showMessageDialog(null, ex);
//				  //do stuff
//				}
//			System.out.println(i);
//			
//		}
	}

	
	public static void openWebpage(URI uri) {
	    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
	    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
	        try {
	            desktop.browse(uri);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

	public static void openWebpage(URL url) {
	    try {
	        openWebpage(url.toURI());
	    } catch (URISyntaxException e) {
	        e.printStackTrace();
	    }
	}

}
