package SiriProgram;


	
	import java.awt.Desktop;
	import java.net.URI;

	public class WebPage {

		public static void main(String[] args) throws Exception
		{
			web();
		}
		
		public static void web() throws Exception
		{
			// TODO Auto-generated method stub
			Desktop d = Desktop.getDesktop();
			d.browse(new URI("http://techfios.com"));
			
			d.browse(new URI("http://techfios.com"));
			
			
		}

	}


