package week4.day2;

public class APLclient {
	public void sendRequest(String endpoint) {
		System.out.println("endpoint is"+" "+ endpoint);
	}
	public void sendRequest(String endpoint, String requestBody, Boolean requestStatus) {
		System.out.println(endpoint +" "+ requestBody + " "+requestStatus);
		
	}
public static void main(String[] args) {
	APLclient obj=new APLclient();
	obj.sendRequest("Broswer");
	obj.sendRequest("Browser", "Loaded successfully", true);
}

}
