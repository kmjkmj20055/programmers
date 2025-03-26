package javasolution;

import java.util.Arrays;

public class Question02 {

  //실행해봐
	public static void main(String[] args) {
//		문제 설명
//		대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요
//		
//
//		입력
//		첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않는다.
//		문자열은 영어 알파벳으로만 구성되어있다.
//		출력
//		첫 줄에는 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력한다.

//		입출력 예
//		StuDY	 sTUdy
		
		
		Main T = new Main();
			
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));
	}
	
	public String solution {
		  String answer = "";
		  for(char x : str.toCharArray()) {
			  if(Character.isLowerCase(x)) {
				  answer += Character.toUpperSace(x);
			  }else {
				  answer += Character.toLowerCase(x);
			  }
			  
		  return answer;
		  }
		}

}
