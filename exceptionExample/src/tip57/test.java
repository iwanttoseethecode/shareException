package tip57;

import java.util.Random;

public class test {
	
	public static void main(String[] args){
		long startTime = 0;
		long errorEndTime = 0;
		long normalEndTime = 0;
		
		Book[] range = createArray();
		
		startTime = System.currentTimeMillis();
		errorExample(range);
		errorEndTime = System.currentTimeMillis();
		normalExample(range);
		normalEndTime = System.currentTimeMillis();
		
		System.out.println("异常控制流程的结束："+ (errorEndTime-startTime));
		System.out.println("正常流程控制结束："+ (normalEndTime-errorEndTime));
	}
	
	private static Book[] createArray(){
		
		Random random = new Random();
 
		Book[] num = new Book[5000];
		for(int i = 0; i < 5000; i++){
			num[i] = new Book();
		}
		return num;
	}
	
	//用异常来控制流程结束
	private static void errorExample(Book[] array){
		try{
			int i = 0;
			while(true)
				array[i++].study();
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
	}
	
	private static void normalExample(Book[] array){
		for(Book book : array){
			book.study();
		}
	}
	
}
