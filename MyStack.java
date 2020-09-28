import java.util.*;

/**
 * pop메소드와 push메소드를 구현하는 제너릭한 MyStack 클래스
 * 
 * @author (2019315020 오성빈, 2018210032 김태영) 
 * @version (2020.09.28)
 */
public class MyStack<T> implements Stack<T>
{
    private int top;
    ArrayList<T> s;
    
    public MyStack(){
        top = -1;
        s = new ArrayList<T>();
    }
    
    @Override
    public T pop(){
        if (top < 0){
            System.out.println("Stack underflow!");
            return null;
        }
        else{
            T result = (T)s.get(top);
            top -= 1;
            return result;
        }
    }
    
    @Override
    public boolean push(T obj){
        top += 1;
        return s.add(obj);
    }
}
