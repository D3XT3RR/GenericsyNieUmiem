/**
 *
 *  @author Żarłok Bartosz S20788
 *
 */

package zad1;



import java.util.*;

import static zad1.ListCreator.collectFrom;

public class Main {
    public Main() {
        List<Integer> src1 = Arrays.asList(1, 7, 9, 11, 12);
                System.out.println(test1(src1));

        List<String> src2 = Arrays.asList("a", "zzzz", "vvvvvvv" );
                System.out.println(test2(src2));
    }

    public List<Integer> test1(List<Integer> src) {
        Selector<?> sel = new Selector(){
                @Override
                public boolean select(Object o) {
                    int temp = (int) o;
                    if(temp < 10){
                        return true;
                    }else
                    return false;
                }
            };
        Mapper<?> map = new Mapper(){

            @Override
            public int map(Object o) {
                int temp = (int) o;
                return temp+10;

            }
        };
        return collectFrom(src).when(sel).mapEvery(map);
    }

    public List<Integer> test2(List<String> src) {
        Selector<?> sel = new Selector(){
            @Override
            public boolean select(Object o) {
                String temp = (String) o;
                if(temp.length() > 3){
                    return true;
                }else
                    return false;
            }
        };
                Mapper<?> map = new Mapper(){

                    @Override
                    public int map(Object o) {
                        String temp = (String) o;
                        return temp.length()+10;

                    }
                };
        return collectFrom(src).when(sel).mapEvery(map);
    }

    public static void main(String[] args) {
        new Main();
    }
}
