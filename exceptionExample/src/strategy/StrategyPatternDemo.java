package strategy;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		
		Context context = new Context(new OperationAdd());
		System.out.println(" 6 + 6 = "+context.executeStrategy(6, 6));
		
		context = new Context(new OperationSubstract());
		System.out.println(" 6 - 6 = "+context.executeStrategy(6, 6));
		
		context = new Context(new OperationMultiply());
		System.out.println(" 6 * 6 = "+context.executeStrategy(6, 6));
		
//		Strategy strategy = new OperationAdd();
//		System.out.println(" 1 + 1 = "+context.executeStrategy(1, 1));
		
		//����ģʽҪ�����ǶԿ�ܲ��ÿ�ֲ��Ե���;Ҫ��Ϥ
		
	}

}
