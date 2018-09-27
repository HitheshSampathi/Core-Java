class WhatsApp1{		//multiple inheritance is not supported
	void message(){
		System.out.println("messaging...");
	}
}
class WhatsApp2{
	void voicecall(){
		System.out.println("calling...");
	}
}
class WhatsApp3 extends WhatsApp2//WhatsApp2,WhatsAppv1
{
	void videocall(){
		System.out.println("video calling...");
	}
	
}
public class Program3 {
public static void main(String[] args) {
	WhatsApp3 ref=new WhatsApp3();
	ref.videocall();
}
}
