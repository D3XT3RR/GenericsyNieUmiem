/**
 *
 *  @author Żarłok Bartosz S20788
 *
 */

package zad1;


import java.util.List;

public interface Mapper<T1, T2> { // Uwaga: interfejs musi być sparametrtyzowany
    public T1 map(T2 arg);
}
