/*
 * This class exists solely to demonstrate ConnectCV's Java naming convention standards.
 */

package com.connectcv.coding.standards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.joda.time.DateTime;

/**
 * <p>
 * Class and interface names should be based upon nouns, and be simple and descriptive. All class names should use UpperLowerCase,
 * even when they include acronyms such as '{@code HtmlParser}' and '{@code WebServiceUrl}'.
 * </p>
 * <p>
 * Member variables use the following naming conventions:
 * <ul>
 * <li>{@code UPPER_CASE} for constants (see below for the definition of 'constant'</li>
 * <li>{@code sUpperLowerCase} for <i>class</i> variables (<i>static</i>)</li>
 * <li>{@code mUpperLowerCase} for <i>instance</i> variables (non-<i>static</i>)</li>
 * <li>Avoid variable names that differ only slightly (such as by a single character)</li>
 * <li>Acronyms in member names should use upper lower e.g. {@code displayHtml}</li>
 * </ul>
 * </p>
 * <p>
 * Method names should be based upon verbs, and be simple and descriptive. All method names should use lowerUpperLowerCase such as
 * {@code parseMessage()}' and '{@code isClientActive()}'. Acronyms in method names should use upper lower e.g. {@code parseHtml()}.
 * </p>
 * <p>
 * Note that a {@code static final} member should only be considered constant if it is immutable. Otherwise it is an ordinary
 * static member that happens to be final.
 * </p>
 */
// TODO Change Eclipse variable name regex to prevent variable names like isURLValid (should be isUrlValid) as long as this
//      doesn't make Eclipse complain about us *using* core classes/methods that break this rule
public class NamingConventions
{
    /*
     * Class variable naming
     */
    public static final int MAX_SIZE = 100000000; // Class constant.
    public static final int MIN_SIZE = 10; // Class constant.

    public static final List<String> Items = new ArrayList<String>(); // Non-constant (mutable) static final member.

    private static StringBuilder sClassVariable = new StringBuilder(MIN_SIZE); // Class variable.

    private static boolean sIsSomeBoolean; // Generally prefix boolean class members with 'sIs', 'sAre', 'sCan', or 'sHas'.

    private static DateTime sSomeDate; // Class reference.

    /*
     * Instance variable naming
     */
    private String mSomeString;

    private boolean mIsSomePrivateBoolean; // Prefix boolean instance members with 'mIs', 'mAre' or 'mCan'.

    /**
     * <p>
     * This method demonstrates correct parameter naming.
     * <ul>
     * <li>All parameters should be prefixed with 'in'.</li>
     * <li>Boolean parameters are prefixed with 'inIs'.</li>
     * <li>Parameters that are not modified by the method appear before those that can be modified in the parameter list.</li>
     * </ul>
     * </p>
     */
    public String methodWithParameters(String inParameter)
    {
        sSomeDate = new DateTime();

        mSomeString = sClassVariable.append(sSomeDate).toString();
        return(mSomeString);
    }

    /**
     * <p>
     * This method demonstrates boolean naming conventions.
     * <ul>
     * <li>Methods returning <code>boolean</code> are generally prefixed with 'is', 'are', 'can' or 'has', so to pose a
     * question.</li>
     * <li>Boolean parameters are generally prefixed with 'inIs', 'inAre', 'inCan', or 'inHas' for the same reason.</li>
     * </ul>
     * </p>
     */
    public boolean isBooleanMethod(boolean inIsBooleanParameter)
    {
        return(inIsBooleanParameter && mIsSomePrivateBoolean && sIsSomeBoolean);
    }

    /**
     * <p>
     * This is an example of how to name modifiable method parameters. Ideally, the name of the method and the parameter will
     * negate the need for a naming prefix (as in this method).
     * </p>
     */
    public <T> void copy(List<? extends T> inSource, List<? super T> inTarget)
    {
       inTarget.addAll(inSource);
    }

    /**
     * <p>
     * If it is <b>not</b> clear from the name of the method or the parameters that a parameter will be modified, the modifiable
     * parameter should be named using the {@code inMd} prefix.
     * </p>
     */
    public void doStuff(String inStringOne, String inStringTwo, List<String> inMdList)
    {
        inMdList.add(inStringOne);
        inMdList.add(inStringTwo);
    }

    /**
     * <p>
     * Methods returning collections should indicate so by using a plural or the word Collection, List, etc as appropriate.
     * </p>
     */
    public Collection<String> getItems()
    {
        return(new ArrayList<String>());
    }

    public void voidCatchBlocks()
    {
        try
        {
            return;
        }
        catch (IllegalArgumentException iae)
        {
            /*
             * Exception variables in catch clauses should be named using the lower case version of each upper case letter in their
             * name.
             */
        }
        catch (IllegalStateException ise)
        {
            // Another example, not that the middle letter is different
            try
            {
                "Foo".length();
            }
            catch (IllegalStateException ise2)
            {
                // If an exception with the same acronym is thrown, add a digit to name the second exception
            }
        }
        catch (RuntimeException re)
        {
            // Yet another example
        }
    }
}