package algorism;

public class recursion1 {
     public static void main(String[] args) {
    	// func(4);//1) 여기서 제귀함수 트리거로 실행시켜주면
    	 int result = func(4);
    	 System.out.print(result);
        
     }
     
     public static int func(int n) {
    	 
    	 if(n==0)
    		return 0;//return울 하면 항상 자기자신을 호출했던 부분 다음으로 넘어감.
    	 else {
    		 
	    	 System.out.println("Hello...");
	    	 return n+func(n-1);
    	 }//2) 매게변수로 온값이 0이 될때까지 반복됨.
    	/*3) 4번 반복후 return 실행되면 func(4)는 -> func(3)로 -> func(2)로
    	 ->func(1)로 -> func(0)로 가고 마지막엔 main의 func(4)로 가고 다음코드가 없기에 프로그램이 종료됨.*/
    	 
    	 //결론-> 어떤한 메서드를 특정상황에 특정횟수만큼 반복하고 싶은경우사용하는것이 재귀함수 
     }
     
     //재귀함수가 될수 밖에없음.
}
/* 재귀함수가 무한루프에 빠지지 않으려면 'base case'라는 적어도 하나의 recursion에 빠지지
 * 않는 경우가 존재해야 한다 ex) if(k<=0) return; 처럼 다만 base case가 있다고 무한루프 안빠지는게 아님
   recursive case라는것이필요 이것은 순환을반복하다보면 결국 base case에 수렴하게하는 로직을 
   일컫음  ex) func(n-1) */