package com.connectcv.coding.examples;

/**
 * <p>
 * A utility class is one that contains only static methods and is never instantiated. All utility classes should have the
 * following features:
 * <ul>
 * <li>The class should be declared <code>final</code>, and should not be declared <code>abstract</code></li>
 * <li>The class should <b>not</b> implement the <code>Serializable</code> interface</li>
 * <li>A single, zero-parameter, private constructor should be defined with a method comment that indicates it should never be
 * called</li>
 * </ul>
 * </p>
 */
public final class UtilityClass
{
    private UtilityClass()
    { }          // Suppress default constructor to prevent instantiation.

    public static boolean utilityMethod(String inString)
    {
        return(inString == null || inString.length() == 0);
    }
}