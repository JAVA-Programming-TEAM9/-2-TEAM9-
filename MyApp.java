import java.util.*;

/**
 * 오늘 날짜를 입력받아서 token을 생성하여 정수 3개를 push하고, 4번 pop하는 MyApp클래스
 * 
 * @author (2018210032 김태영, 2019315020 오성빈) 
 * @version (2020.09.28)
 */
public class MyApp
{
    public static void main(String[] args){
        Stack<Integer> stack = new MyStack<Integer>();
        
        System.out.print("오늘의 날짜를 입력하시오(년/월/일) : ");
        
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        
        StringTokenizer st = new StringTokenizer(date, "/");
        
        System.out.println("------Push------");
        while(st.hasMoreTokens()){
            Integer i = Integer.valueOf(st.nextToken());
            stack.push(i);
            System.out.println(i);
        }
        
        System.out.println("------Pop------");
        for(int i = 0; i < 4 ; i ++){
            System.out.println(stack.pop());
        }
    }
}
