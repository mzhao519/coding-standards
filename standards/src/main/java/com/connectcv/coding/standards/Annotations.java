package com.connectcv.coding.standards;

import java.util.ArrayList;
import java.util.List;

public class Annotations
{
    /**
     * <p>
     * Placing a {@code SuppressWarnings} annotation at too high a level may inadvertently hide other warnings. Even if you are
     * aware that multiple warnings are being suppressed, others may not be.
     * <p>
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<String> innappropriateUseOfSuppressWarnings(int inFlag)
    {
        if (inFlag == 1)
            return(externalMethodThatReturnsAListOfStrings());

        if (inFlag == 2)
        {
            List myList = new ArrayList<Integer>(); // This warning is suppressed when we don't want it to be
            myList.add(1);

            return(myList); // This warning is suppressed when we don't want it to be
        }

        return(null);
    }

    /**
     * <p>
     * It is preferable to place {@code SuppressWarnings} annotations as close as possible to where they are relevant. even if this
     * means creating temporary variables.
     * <p>
     */
    public List<String> appropriateUseOfSuppressWarnings(int inFlag)
    {
        if (inFlag == 1)
        {
            @SuppressWarnings("unchecked")
            List<String> strings = externalMethodThatReturnsAListOfStrings();

            return(strings);
        }

        if (inFlag == 2)
        {
        /*
            List myList = new ArrayList<Integer>(); // This would now come up as a warning
            myList.add(1);

            return(myList); // As would this
        */
        }

        return(null);
    }

    /**
     * <p>
     * This represents an externally controlled method that hasn't been genericized. This often occurs when dealing with
     * pre-1.5 libraries. As an aside, we have no choice but to place the annotation on the method, as we want to suppress
     * the warning about the return type in addition to others. As such, we put a comment on the annotation to indicate what
     * is is supposed to apply to.
     * </p>
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })      // Use of raw List as a return type, creation of raw ArrayList
    private static List externalMethodThatReturnsAListOfStrings()
    {
        List strings = new ArrayList();
        strings.add("one");

        return(strings);
    }
}