package tip58;

public class test {
	public static void main(String[] args) {
		Monkey monkey = new Monkey();
		
		try {
			monkey.eat("��");
		} catch (MoneyFoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		monkey.doAction("˵����");
		
	}
}
