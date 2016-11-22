package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wojt on 2016-11-21.
 */
public class RangeSet implements main.Set {

    List<Integer> container = new ArrayList<>();

Integer start;
    Integer end;
    boolean withinRange;
    Integer contained;

    @Override
    public void addRange(Integer start, Integer end) {

        container.add(start);
        container.add(end);



    }

    @Override
    public void add(Integer added) {
        container.add(added);
    }

    @Override
    public void remove(Integer removed) {
        container.remove(removed);
    }

    @Override
    public boolean contains(Integer contained) {
        if (container.contains(contained)||(contained<=end&&contained>=start)) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {


        RangeSet set = new RangeSet();
        set.add(2);
        set.addRange(7, 30);

        if(set.contains(2))
        {
            System.out.println("yes");
        }
        if(!set.contains(3))
        {
            System.out.println("no");
        }
        if(set.contains(9))
        {
            System.out.println("yes");
        }


    }

}



