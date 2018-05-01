import mypackage.Parent;

public class CallParent extends Parent {
	void caller() {
		super.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallParent p = new CallParent();
		p.caller();
		//Parent p = new Parent();
		//p.show();
	}

}
