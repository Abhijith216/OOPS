public class trycatchfinally{
	public static void main(String args[]){
		try{
			int result = 10/0;
			System.out.println("result:"+result);
		}
		catch(ArithmeticException e){
			System.out.println("Exception caught:"+e.getMessage());
		}
		finally{
			System.out.println("finally block is finaly executed");
		}
		
		System.out.println("Program still continues");
	}
}	
