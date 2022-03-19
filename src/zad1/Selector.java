/**
 *
 *  @author Żarłok Bartosz S20788
 *
 */

package zad1;


import java.util.List;

public interface Selector <T>{ // Uwaga: interfejs musi być sparametrtyzowany
    public <T>boolean select(T t);
}
