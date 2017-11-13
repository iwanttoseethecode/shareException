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
		
		System.out.println("�쳣�������̵Ľ�����"+ (errorEndTime-startTime));
		System.out.println("�������̿��ƽ�����"+ (normalEndTime-errorEndTime));
	}
	
	private static Book[] createArray(){
		
		Random random = new Random();
 
		Book[] num = new Book[5000];
		for(int i = 0; i < 5000; i++){
			num[i] = new Book();
		}
		return num;
	}
	
	//���쳣���������̽���
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