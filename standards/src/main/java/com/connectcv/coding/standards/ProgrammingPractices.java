/*
 * This class exists solely to demonstrate ConnectCV's standard Java programming practices.
 */

package com.connectcv.coding.standards;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * This class outlines practices for general adoption. In summary form:
 * <ul>
 * <li>Avoid instantiating a {@code String} object initialising to an existing {@code String}. Instead, use the existing
 * {@code String}, or create another reference to the existing {@code String}</li>
 * <li>Avoid publicly exposing member variables without good reason</li>
 * <li>Avoid using an instance to access class (static) members. Use the class (or default context) instead</li>
 * <li>Avoid coding numeric literals, apart from 0, 1 or -1. Create constants or enumerations instead (as appropriate).</li>
 * <li>Avoid using assignment operator in places where it can be confused with the equality operator</li>
 * <li>Avoid using embedded assignments to improve run-time performance</li>
 * <li>Make liberal use of parentheses in expressions involving mixed operators, even when precedence seems clear.</li>
 * <li>Avoid redundant 'else' statements</li>
 * <li>Utility classes should be written in accordance with the example utility class (see
 * {@link com.connectcv.coding.examples.UtilityClass})</li>
 * </ul>
 * </p>
 * <p>
 * There are also many guidelines that are not present as an example (as they are too simple):
 * <ul>
 * <li>Use the non-synchronized {@link java.util.LinkedList}, {@link java.util.ArrayList}, {@link java.util.HashMap} in
 * preference to the sychronized {@link java.util.Vector}, {@link java.util.Hashtable}, etc. If you need a sychronized
 * collection, use the {@code Collections.synchronizedXXX()} factory methods (or manually synchronize).</li>
 * <li>Use {@link Boolean#valueOf(boolean)}) rather than {@code new Boolean()} (as {@code Boolean.valueOf()} does not create a
 * new object).</li>
 * <li>Use {@code String.valueOf()} to create a {@link String} from a primitive data type. </li>
 * <li>Use {@link Integer#parseInt(String)} rather than {@code new Integer(stringValue)).intValue()}.</li>
 * </ul>
 * </p>
 */
// TODO Remove the summary lines that correspond to an example, otherwise that summary list is going to get too long
public class ProgrammingPractices
{
    // Use symbolic constants instead of hard coded literals if appropriate (except for 1, 0, and -1).
    private static final int ONE = 1;

    public static enum EnumWithField
    {
        ONE ("One"),
        TWO ("Two");

        private final String mField;    // Fields of enums must be declared final

        EnumWithField(String inField)
        {
            mField = inField;
        }

        public String getField()
        {
            return(mField);
        }
    }

    public ProgrammingPractices()
    { }

    /**
     * <p>
     * This method demonstrates correct generation of a {@code String} literal.
     * </p>
     * <p>
     * The following should not be used unless there is a specific reason to do so (e.g. to create a lock variable):
     *
     * <pre>
     * new String(&quot;blah&quot;);
     * </pre>
     *
     * </p>
     */
    public String createStringLiteral()
    {
        return("blah" + ONE);
    }

    /**
     * <p>
     * This method shows the use of hard coded numbers (magic numbers) in certain circumstances.
     * </p>
     */
    public String printPlacingSummary(String[] inNames)
    {
        /*
         * Magic numbers are permissible in certain circumstances. Note that one of these circumstances is the Eclipse
         * generated hashCode()
         */

         return(inNames[0] + " was in first place, " +
                inNames[1] + " came second, followed by " +
                inNames[2]);
    }

    /**
     * <p>
     * This method demonstrates {@code String} processing
     * <ul>
     * <li> Avoid use of {@code +=} when appending {@code String} objects. Use {@link java.lang.StringBuilder StringBuilder}
     * instead of {@link java.lang.StringBuffer StringBuffer} unless multiple threads have access to the same instance of
     * {@code StringBuilder}, in which case {@code StringBuffer} can be used. </li>
     * <li>Instead of passing concatenated {@code String} objects into a {@code StringBuilder} constructor, or into a call to
     * {@code StringBuilder.append()}, append each {@code String} separately. </li>
     * <li> Where practical, avoid creating single character {@code String} objects. Eg. Use {@code String.indexOf(';')} instead of
     * Use {@code String.indexOf(";")}. </li>
     * <li> Never use {@code ==} to compare {@code String} objects. Use {@code String.equals()} or {@code Utils.strMatch()} where
     * {@code null} is possible. </li>
     * </ul>
     * </p>
     */
    public String stringProcessing(String inParam1, String inParam2)
    {
        if (!inParam1.equals(inParam2))
        {
            StringBuilder result = new StringBuilder();
            result.append("The first parameter is: ").append(inParam1);
            result.append("The second parameter is: ").append(inParam2);
            return(result.toString());
        }

        return(null);
    }

    public List<String> reusingStringBuilder()
    {
        List<String> strings = new ArrayList<String>(99);

        StringBuilder builder = new StringBuilder();

        for (int idx = 99; idx > 0; idx--)
        {
            builder.append(idx);
            builder.append(" bottles of beer on the wall,");
            builder.append(idx);
            builder.append(" bottles of beer. Take one down and pass it around, ");
            builder.append((idx - 1));
            builder.append(" bottles of beer on the wall.");

            strings.add(builder.toString());
            builder.setLength(0);
        }

        return(strings);
    }

    /**
     * <p>
     * Avoid using an instance to access class (static) members. Use the applicable class (or default) context instead.
     * </p>
     */
    static String classMemberReferences(int inCount)
    {
        if (inCount < 4) return(Declarations.CONSTANT_DECLARATION);

        return(Declarations.staticMethod(true));
    }

    /**
     * <p>
     * Avoid using assignment operator in places where it can be confused with the equality operator. For example:
     *
     * <pre>
     *     if (bool = someMethod())       // Do not do this!
     *     {
     *         ...
     *     }
     * </pre>
     *
     * </p>
     */
    public boolean avoidAssignmentConfusion()
    {
        boolean bool = someMethod();

        if (bool)
        {
            return(!isComplicated());
        }

        return(true);
    }

    private boolean someMethod()
    {
        return(true);
    }

    /**
     * <p>
     * Avoid using embedded assignments to improve run-time performance For example:
     *
     * <pre>
     * e = (a = b + c) + d; // Do not do this!
     * </pre>
     *
     * </p>
     */
    public int avoidNestedAssignment()
    {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e;

        // Alternative to the above.
        a = b + c;
        e = a + d;

        return(e);
    }

    /**
     * <p>
     * Make liberal use of parentheses in expressions involving mixed operators, even when precedence seems clear.
     * </p>
     */
    public boolean isComplicated()
    {
        int a = 1;
        int b = 2;

        return(((a + b) / 2) == ((b * 3) + 1));
    }

    /**
     * <p>
     * Avoid redundant else statements.
     * </p>
     */
    public int redudantElseStatements(int inSomeValue, boolean inBad)
    {
        if (inBad)
        {
            // Bad
            if (inSomeValue == 1)
                return(1);
            else if (inSomeValue == 2)
                throw new RuntimeException("Error");
            else
                return(3);
        }

        // Good
        if (inSomeValue == 1)
            return(1);

        if (inSomeValue == 2)
            throw new RuntimeException("Error");

        return(3);
    }

    public int treatAllParametersAsFinal(int inParameter)
    {
        // Bad
        inParameter = inParameter * 2;

        return(inParameter);

    }

    /**
     * <p>
     * Where exception construction is non-trivial and repeated, having factory methods is useful. However, don't be tempted
     * to have these methods also throw the Exception.
     * </p>
     */
    public int exceptionThrowingHelperMethods(int inValue) throws Exception
    {
        try
        {
            return(100 / inValue);
        }
        catch (ArithmeticException ae)
        {
            // We can't use throwException() as the compiler can't guarantee that throwException will throw  Exception
            throw newException();
        }
    }

    public static Exception newException()
    {
        return(new Exception());
    }

    public static void throwException() throws Exception
    {
        throw new Exception();
    }

    public int codeClarityExample(int inSelector, int inValue)
    {
        if (inSelector == 1)
        {
            // It is not necessarily clear that val should default to 0 when inValue is 4
            int val = 0;

            if (inValue < 4)
            {
                val = inValue - 5;
            }
            else if (inValue > 5)
            {
                val = inValue + 3;
            }

            return(val);
        }
        else
        {
            // This makes it clearer and allows the compiler to catch the case where setting the default was missed
            int val;

            if (inValue < 4)
            {
                val = inValue - 5;
            }
            else if (inValue > 5)
            {
                val = inValue + 3;
            }
            else
            {
                val = 0;
            }

            return(val);
        }
    }

    /**
     * <p>
     * Override {@code equals()} judiciously. As a guide, consider each of the following before overriding {@code equals()} :
     * <ul>
     * <li>Be mindful of Items 8 and 9 in {@code J.Bloch; Effective Java - 2nd Edition}</li>.
     * <li>Is the inherited {@code equals()} method likely to pose problems?</li>
     * <li>Would a customised matching method work instead?</li>
     * <li>Has an {@code equals()} override been discussed with a peer, and is there any doubt whether it will work for all
     *     call scenarios?</li>
     * <li>Make sure that you use the Eclipse "Generate hashCode and equals" tool to write these functions.</li>
     * <li>When adding fields to a class that must override (@code equals()} and {@code hashCode()}, don't update these
     *     methods by hand. Instead, delete them first and re-generate via the Eclipse "Generate hashCode and equals"
     *     tool.</li>
     * </ul>
     * </p>
     */
    public static class MatchingObject
    {
        private int mInt;
        private boolean mBoolean;
        private Object mObject;

        public MatchingObject()
        {
        }

        public boolean matches(MatchingObject inValue)  // Generally preferred.
        {
            if (mInt != inValue.mInt || mBoolean != inValue.mBoolean)
                return(false);

            if (mObject == null)
            {
                if (inValue.mObject != null)
                    return false;
            }
            else if (!mObject.equals(inValue.mObject))
            {
                return false;
            }

            return true;
        }
    }
}