/**
 *
 *  @author Żarłok Bartosz S20788
 *
 */

package zad1;


import java.util.List;

public interface Mapper<T> { // Uwaga: interfejs musi być sparametrtyzowany
    public <T>int map(T t);
}
