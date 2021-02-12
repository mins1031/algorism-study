package algorism;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Test1 {
     
	public static void main(String[] args) {
		/* case1 : 배열의 내용 출력하는 도구는 Arrays.toString을 이용해야된다
		int array[] = {1,2,5,4,6,7,3};
		
		System.out.println(array.toString());
		System.out.print(Arrays.toString(array));

	    List<String> list = new ArrayList<>();
	    
	    list.add("min");
	    list.add("jung");
	    list.add("gii");
	    list.add("pyo");
	    
	    for(int i =0;i < list.size();i++) {
	    	System.out.println(list.get(i));
	    	//list는 그냥 내용 다출력할거면 list만 써주고 하나의 값에 접근할때는 꼭 get(index)를 사용해 줘야함.
	    }
		Map<String,String> student = new HashMap<>();
		
		String boardType = "r002";
		String type;
		String url = null;
		if(boardType == "r001") {
			System.out.println("== 가능");
		    type = "sudo";
		    url = "redirect:/dash/"+type;
		} else if(boardType == "r002") {
			type = "gangwon";
		    url = "redirect:/dash/"+type;
		}
	
		System.out.print(url);*/
		
		Map map = new HashMap();
		map.put("view", "d");
		String view = (String) map.get("view");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		String tt = sdf.format(date);
		File upload = new File(tt);
		System.out.print(sdf.format(date));
	}
}
