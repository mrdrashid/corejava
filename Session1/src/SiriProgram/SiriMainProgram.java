package SiriProgram;



public class SiriMainProgram {

	//private static final StringArray ClassAssignment = null;
//int elementId;

//this.elementId= elementId;
	
		public void AddNewCallOut(String message, Boolean ismsgResponse, int elementId) {
			
			 elementId = elementId + 1;
			StringBuilder messageBuilder = new StringBuilder();

			if (!message.contentEquals("")) {

				if (!ismsgResponse) {
					messageBuilder
							.append("<table class='bubble-gray' cellspacing='0' cellpadding='0'><tr><td class='head'></td></tr>");
					messageBuilder
							.append("<tr><td class='mid'><div class='txt shadow'>"
									+ message + "</div></td></tr>");
					messageBuilder
							.append("<tr><td class='foot'></td></tr></table>");
				} else {
					messageBuilder
							.append("<table class='bubble-blue' cellspacing='0' cellpadding='0'><tr><td class='bhead'></td></tr>");
					messageBuilder
							.append("<tr><td class='bmid'><div class='txt shadow'>"
									+ message + "</div></td></tr>");
					messageBuilder
							.append("<tr><td class='bfoot'></td></tr></table>");
				}

				loadUrl("javascript:document.getElementById(\"div" + elementId
						+ "\").innerHTML=\"" + messageBuilder.toString() + "\";");
			}
			StringBuilder jvscr = new StringBuilder();
			if (!ismsgResponse) {
				if (elementId != 1) {
					if (!ismsgResponse) {
						jvscr.append("var elem = document.getElementById('div"
								+ (elementId - 1)
								+ "');     var x = 0;     var y = 0;     while (elem != null) {         x += elem.offsetLeft;         y += elem.offsetTop;         elem = elem.offsetParent;     } ");
						jvscr.append("var endj=500; var i=window.scrollY; for(i=window.scrollY;i<y;i++){ var j=0; var a=0; for(j=0;j<endj;j++) {a=a+1; }  window.scrollTo(x, i); } ");
						loadUrl("javascript:" + jvscr.toString());
					}
				}
			}
		}

		public void loadUrl(String string) {
			// TODO Auto-generated method stub
			
		} 
		
		
	}
	
		
		
		
		



