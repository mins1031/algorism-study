package algorism;

import java.util.Scanner;

public class arrayarray {
    
	static int array[] = {5,1,3,4,7};
	static int length = 5;
	
	static public int sum(int a[],int length) {
		if(length<=0) {
			return 0;
		} else {
			return sum(a,length-1) + a[length-1];
		}
	}
	public static void main(String[] args) {	  

		int num=sum(array,length);		
	       System.out.println(num);
	}	
}
/*
 
 -삽입정렬 추가 예제
 int i,j,p,temp;
			int n =0;
			int array[] = new int[10];
			Scanner scan = new Scanner(System.in);
			for(p=0;p<10;p++){
			   System.out.printf("저장할 정수를 입력해주세요: \n");
			   array[p]= scan.nextInt();
			}
			for(i=0;i<9;i++){
			     j=i;
			     while(j>=0&&array[j] > array[j+1]){
				 //j가0과 같거나 클떄랑현 배열값이 다음번 배열값보다 큰경우 while실행 
			       temp = array[j];
			       array[j] = array[j+1];
			       array[j+1] = temp;
				   j--;//배열의 j번쨰 수와 그 앞수를 비교한후 바꿔준후 j--하면  바꿔준값과 그전값을 비교하는것임. 
			     }
			     while(n<i){
			    	 System.out.println(array[n]);
			     	n++;
				 }
		     }	
 */