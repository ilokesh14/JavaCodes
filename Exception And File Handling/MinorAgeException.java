
public class MinorAgeException extends Exception {
	int errorCode;
	String errorMessage;
	MinorAgeException(int age){
		this.errorCode = 100;
		this.errorMessage = "Your Age is Less than 18 , U Enter the Age is "+age+" Can't Apply for DL";
	}
	MinorAgeException(String message){
		this.errorCode = 100;
		this.errorMessage =  message;
	}
	@Override
	public String toString() {
		return errorCode + " :: "+errorMessage;
	}

}
