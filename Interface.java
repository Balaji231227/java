package InterfaceJava;
interface ma{
	int briyani=200;//public static final
	public void briyani();
	default void legPiece()//by using default keyword  you will create default method
	{
		System.out.println("You ordered legpiece.");
	}
	static void parcel()
	{
		System.out.println("Your Order is provided");
	}
}
class Interfaces implements ma
{
	public void briyani()
	{
		System.out.println("You ordrerd briyani");
	}
	

}
public class Interface{
	public static void main(String[] args) {
		Interfaces i = new Interfaces();
		i.briyani();
		i.legPiece();
		ma.parcel();
	}
}
