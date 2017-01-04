/*
 * This class exists solely to demonstrate ConnectCV's Java statement standards.
 */

package com.connectcv.coding.standards;

/**
 * <p>
 * It is suggested that parameter lists, methods and classes be kept as small as possible. A method with more than 7 parameters, a
 * method longer than 150 lines or class bigger than 2000 lines is probably in need of refactoring.
 * <p>
 */
public class Statements
{
    private int mMember1;

    private int mMember2;

    /**
     * <p>
     * Each statement should appear on a line of its own, i.e. avoid statements like:
     *
     * <pre>
     * mMember1 = inParam1; mMember2 = inParam2;
     * </pre>
     *
     * </p>
     */
    public Statements(int inParam1, int inParam2)
    {
        mMember1 = inParam1;
        mMember2 = inParam2;
    }

    /**
     * <p>
     * This allows omission of whitespace between the {@code return} keyword and its associated statement
     * see the standard for {@link WhitespaceAndIndentation#noWhiteSpaceForReturn() return whitespace}.
     * </p>
     * <p>
     * This facilitates searching for method exit points, as the open parenthesis can be readily included in the search criteria.
     * Note that in Eclipse, highlighting the return value in the method declaration will highlight these.
     * </p>
     */
    public int returnParentheses()
    {
        return(mMember1 + mMember2);
    }

    /**
     * <p>
     * Return statements do not need to be enclosed in parentheses.
     * </p>
     * <p>
     * This facilitates searching for method exit points, as the open parenthesis can be readily included in the search criteria.
     * Note that in Eclipse, highlighting the return value in the method declaration will highlight these.
     * </p>
     */
    public int returnParenthesesNotRequired()
    {
        return mMember1 + mMember2;
    }

    /**
     * <p>
     * Empty {@code for(;;)} statements should be used in preference to {@code while(true)}.
     * </p>
     */
    public void infiniteLoop()
    {
        for (;;)
        {
            try
            {
                returnParentheses();
            }
            catch (ArithmeticException ae)
            {
                break;
            }
        }
    }

    /**
     * <p>
     * Demonstrates throwing an exception. Note there are no parentheses around the exception creation.
     * </p>
     */
    public void throwingExceptions()
    {
        throw new RuntimeException();
    }
}