import java.util.*;
import java.io.*;

class OMG {

    public static void main(String[] args)
    {
        NavigableSet<String> ts = new TreeSet<String>();

        // Elements are added using add() method
        ts.add("kazuya");
        ts.add("jin");
        ts.add("lee");
        ts.add("kazuya");
        ts.add("feng");

        System.out.println(ts);
    }
}