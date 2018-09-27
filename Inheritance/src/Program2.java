class WhatsAppv1{	//multiple inheritance
	void messaging(){
		System.out.println("messaging");
	}
}
class WhatsAppv2 extends WhatsAppv1{
	void voicecall(){
		System.out.println("calling...");
	}
}
class WhatsAppv3 extends WhatsAppv2{
	void videocall(){
		System.out.println("video calling...");
	}
}

public class Program2 {
	public static void main(String[] args) {
		WhatsAppv3 ref =new WhatsAppv3();
		ref.messaging();
		ref.voicecall();
		ref.videocall();

	}
}
