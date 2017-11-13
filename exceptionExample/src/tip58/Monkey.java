package tip58;

public class Monkey {
	
	public void eat(Object obj) throws MoneyFoodException{
		if (obj instanceof Fruit){
			System.out.println("水果吃饱了");
		}else{
			throw new MoneyFoodException("Monkey 吃的不是水果");
		}
	}
	
	public void doAction(String str){
		if(str.equals("说汉语")){
			throw new MonkeySpeakException("Monkey 是不会说话的");
		}
		System.out.println(str);
	}

}
