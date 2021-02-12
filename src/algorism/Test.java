package algorism;

public class Test {
      public static void main(String[] args) {
    	  int array[][] = new int[6][6];
    	  NightBoard [][] nb = new NightBoard[6][6];
    	  int count =6;
    	  for(int i=0;i<6;i++) {
        	 for(int j=0;j<6;j++) {  
        		nb[i][j] = new NightBoard(); 
        	 }
    	  } 
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
      	     System.out.print(nb[i][j].getName());
      	     System.out.print("");
      	    }
     	     count--;
      	  System.out.println("");
      	}
    	  /*for(int i=0;i<3;i++) {
      	    for(int j=0;j<3;j++) {  	    	
      	        array[i][j] = 5+j;  
      	       System.out.print(array[i][j]); 
      	    }
      	  System.out.println(""); 
      	  } 
      	  if(i==5) {
      		     nb[j][i].setName("A"+count);
      	         count++;
      	       }
      	       else if(i==4) {
        		 nb[j][i].setName("B"+count);
      	          count++;
      	       }
      	       else if(i==3) {
          		 nb[j][i].setName("C"+count);
          		count++;
      	       }
      	       else if(i==2) {
          		 nb[j][i].setName("D"+count);
          		count++;
      	       }
      	       else if(i==1) {
          		 nb[j][i].setName("E"+count);
          		count++;
      	       }
      	       else if(i==0) {
          		 nb[j][i].setName("F"+count);
          		count++;
      	       }*/
    	  
      }
}
