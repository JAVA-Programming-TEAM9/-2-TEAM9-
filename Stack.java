
/**
 *   pop과 push메소드가 실행되는 제너릭한 인터페이스 스택 클래스
 * 
 * @author (2019315020 오성빈, 2018210032 김태영) 
 * @version (2020.09.28)
 */

public interface Stack<T>
{
    public abstract T pop();
    public abstract boolean push(T obj);
}
