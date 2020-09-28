import java.util.*;

/**
 * pop메소드와 push메소드를 구현하는 제너릭한 MyStack 클래스
 * 
 * @author (2019315020 오성빈, 2018210032 김태영) 
 * @version (2020.09.28)
 */
public class MyStack<T> implements Stack<T>
{
    ArrayList<T> li = new ArrayList<T>();
    
    @Override
    public T pop(){
        if (li.size() == 0){
            System.out.println("Stack underflow!");
            return null;
        }
        else{
            return li.remove(0);
        }
    }
    
    @Override
    public boolean push(T obj){
        li.add(0, obj);
        return true;
    }
}
