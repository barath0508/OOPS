package Polymorphism;

class Notification{
	void receive(String message){
		System.out.println("Message:" + message);
	}
}

class EmailNotification extends Notification{
	void receive(String message){
		System.out.println("Email:"+ message);
	}
}

class SMSNotification extends Notification{
	void receive(String message){
		System.out.println("SMS:"+ message);
	}	
}
public class Overriding {
	public static void main(String[] args){
		Notification n = new Notification();
		SMSNotification y= new SMSNotification();
		EmailNotification e= new EmailNotification();
		n.receive("Message");	
		n.receive("Mail");
		n.receive("SMS");
	}

}
