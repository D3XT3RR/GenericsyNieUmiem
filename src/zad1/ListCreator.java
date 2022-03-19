/**
 *
 *  @author Żarłok Bartosz S20788
 *
 */

package zad1;


import java.util.ArrayList;
import java.util.List;

public class ListCreator <T>{
    public List<T> createdList;
    public ListCreator(List<T> list){
        createdList = list;
    }

    public static <T>ListCreator<T> collectFrom(List <T> src){
        ListCreator<T> listCreatorToReturn = new ListCreator<T>(src);
        return listCreatorToReturn;
    }

    public <T>ListCreator<T> when(Selector<T> selector){
       List<T> listOfProperValues = new ArrayList<>();
       for(int i=0; i<createdList.size(); i++){
           if(selector.select(createdList.get(i))){
               listOfProperValues.add((T) createdList.get(i));
           }
       }
        List<T> toReturn = new ArrayList<T>(listOfProperValues);
     return new ListCreator<T>(toReturn);
    }

    public <T2> List<T2> mapEvery(Mapper<T2, T> mapper){
        String stringToPrint = "";
        List<T2> listToReturn = new ArrayList<>();

        for (int i =0; i < this.createdList.size(); i++){
            if(i  == 0){
                stringToPrint = "[" + mapper.map((T) createdList.get(i));
                listToReturn.add( mapper.map((T) createdList.get(i)));

            }else if (i == createdList.size()-1){
                stringToPrint += "," + mapper.map((T) createdList.get(i)) + "]";
                listToReturn.add( mapper.map((T) createdList.get(i)));
            }
            else{
                stringToPrint += "," + mapper.map((T) createdList.get(i));
                listToReturn.add((mapper.map((T) createdList.get(i))));
            }
        }
        //                           System.out.println(stringToPrint);
        return listToReturn;
    }
}
