import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collections;

import java.util.List;

/**
 * AddListt
 */
public class AddListt {
    public static void main(String args[])

    {

        String array[]

            = { "peas", "tomatoes", "water melons" };

        System.out.println("Array: "

                           + Arrays.toString(array));

        List<String> list = convertArrayToList(array);

        System.out.println("List: " + list);

    }

    public static <T> List<T> convertArrayToList(T array[])

    {

        List<T> list = new ArrayList<>();

        Collections.addAll(list, array);

        return list;

    }


}










