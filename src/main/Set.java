package main;

/**
 * Created by Wojt on 2016-11-22.
 */
public interface Set {

    void addRange(Integer start, Integer end);
    void add(Integer added);
    void remove(Integer removed);
    boolean contains (Integer contained);
}
