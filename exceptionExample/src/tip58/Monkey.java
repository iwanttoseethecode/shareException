package tip58;

public class Monkey {
	
	public void eat(Object obj) throws MoneyFoodException{
		if (obj instanceof Fruit){
			System.out.println("ˮ���Ա���");
		}else{
			throw new MoneyFoodException("Monkey �ԵĲ���ˮ��");
		}
	}
	
	public void doAction(String str){
		if(str.equals("˵����")){
			throw new MonkeySpeakException("Monkey �ǲ���˵����");
		}
		System.out.println(str);
	}

}
