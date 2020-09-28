import java.util.*;

/**
 * 오늘 날짜를 입력받아서 token을 생성하여 정수 3개를 push하고, 4번 pop하는 MyApp클래스
 * 
 * @author (2018210032 김태영, 2019315020 오성빈) 
 * @version (2020.09.28)
 */
public class MyApp
{
    public static Integer[] makeToken(String data)
    {
        Integer[] array = new Integer[3];
        StringTokenizer st = new StringTokenizer(data, "/");
        int i = 0;       
        while(st.hasMoreTokens())
        {
            array[i] = Integer.valueOf(st.nextToken());
            i++;
        }  
        return array;
    }
    
    public static void main (String[] args)
    {
        Stack<Integer> stack = new MyStack<Integer>();
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("오늘 날짜를 입력하시오(년/월/일) : ");
        String data = scanner.next();
        Integer[] array = makeToken(data);
        
        System.out.println("------ Push ------");
        
        for(int i=0; i<3; i++)
            stack.push(array[i]);
        
        System.out.println("------ Pop ------");
        while(true)
        {
            
        }
        
    }
}
