/**
 *
 *  @author Żarłok Bartosz S20788
 *
 */

package zad1;


import java.util.ArrayList;
import java.util.List;

public class ListCreator <T extends List<T>>{ // Uwaga: klasa musi być sparametrtyzowana
    static List<?> createdList;
    List<?> valuesToChange;
    //public static List<?> collectFrom(List <?> src){
    public static ListCreator<?> collectFrom(List <?> src){
        createdList = src;
        return super;
    }

    public ListCreator<T> when(Selector<?> selector){
       List<T> listOfProperValues = new ArrayList<>();
       for(int i=0; i<createdList.size(); i++){
           if(selector.select(createdList.get(i))){
               listOfProperValues.add((T) createdList.get(i));
           }else{
               listOfProperValues = null;
           }
           this.valuesToChange = listOfProperValues;
       }
     return this;
    }

    public List<Integer> mapEvery(Mapper<?> mapper){
        String stringToPrint = "";
        List<Integer> listToReturn = new ArrayList<>();
        for (int i =0; i < this.valuesToChange.size(); i++){
            if(i  == 0){
                stringToPrint = "[" + mapper.map( valuesToChange.get(i));
                listToReturn.add((Integer) valuesToChange.get(i));

            }else if (i == valuesToChange.size()-1){
                stringToPrint += "," + valuesToChange.get(i) + "]";
                listToReturn.add((Integer) valuesToChange.get(i));
            }
            else{
                stringToPrint += "," + valuesToChange.get(i);
                listToReturn.add((Integer) valuesToChange.get(i));
            }
        }
        System.out.println(stringToPrint);
        return listToReturn;
    }
}
