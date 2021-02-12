package algorism;

import java.util.Scanner;

public class NightTour {
       
    static NightBoard [][] nb = new NightBoard[6][6];
    static Scanner scan = new Scanner(System.in);
    static int count =6;
    
    public static void naming() {
    	for(int i=0;i<6;i++) {   		 
      	    for(int j=0;j<6;j++) {    	    	
      	       if(j==0) {
      		     nb[i][j].setName("A"+count);
      	       }
      	       else if(j==1) {
        		 nb[i][j].setName("B"+count);
      	       }
      	       else if(j==2) {
          		 nb[i][j].setName("C"+count);
      	       }
      	       else if(j==3) {
          		 nb[i][j].setName("D"+count);
      	       }
      	       else if(j==4) {
          		 nb[i][j].setName("E"+count);
      	       }
      	       else if(j==5) {
          		 nb[i][j].setName("F"+count);
      	       }
      	    }
     	     count--;
      	}
    }
    
    public static String compare(String name) {
    	String result;
    	boolean check =false;
    	for(int i=0;i<6;i++) {
    		for(int j=0;j<6;j++) {
    			if(name.equals(nb[i][j].getName())) {
    			   if(nb[i][j].checked==false) {
    				   nb[i][j].setChecked(true);
    			      
    			   }
    			   else if(nb[i][j].checked==true) {
      				    check =true;
      				    break;
    			   }
    			}  				
    		}
    		if(check == true)
    			break;
    	}
    	if(check == true)
    	    result = "Invalid";
    	else
    		result = "valid";
    	
    	return result;
    }
    public static String go() {
    	System.out.println("체스판은 A1~A6식으로 F6까지 있습니다. 총 36개 있습니다.");
    	naming();
    	System.out.println("경로를 입력하시오");
    	String result = "";
    	for(int i=1;i<37;i++) {  		
    		System.out.print(i+":");
    		String path = scan.next();
    		 result = compare(path);
    		 if(result=="Invalid")
    			 break;
    	}
    	
    	return result;
    }
    //10/14일 일단은 여기까지 값을 입력하면 valid가 잘 나오긴하는데 거기까지임...아마 경로입력하고 체크ed로 바꾸고
    /*11/02 시험끝낸후 완료함 equals와 == 의 활용법을 익히고 구별할 필요가 있을듯 '=='는 둘의 주소값을 비교하고
     * equals는 객체간의 내용물을 비교하기 때문에 위의 name과 해당 배열의 값 둘다 객체이기에 둘의 내용을 비교하는데에는 
     * equals가 적합함. 이제 리팩토링해며 구글링으로 다른사람 어떻게 했는지 찾아보고 비교할 예정*/
    
    public static void main(String[] args) {
    	 for(int i=0;i<6;i++) {
        	 for(int j=0;j<6;j++) {  
        		nb[i][j] = new NightBoard(); 
        	 }
    	  } 
    	System.out.println(go());  
    }
}


