/*
 * This class exists solely to demonstrate ConnectCV's Java declaration standards.
 */

package com.connectcv.coding.standards;

import java.util.LinkedList;
import java.util.List;

import org.joda.time.DateTime;

/**
 * <p>
 * Generally, declarations should:
 * <ul>
 * <li>appear one per line</li>
 * <li>hold the minimum necessary scope</li>
 * <li>avoid hiding variables belonging to the enclosing scope</li>
 * <li>avoid initialising instance variables during declaration. This may be relaxed if they are declared as {@code final} and
 * their construction does not depend on any variables. Otherwise, defer initialisation to the class constructor, or to the class's
 * methods.</li>
 * <li>avoid declaring {@code final} variables conditionally</li>
 * <li>initialising fields to their default values (e.g. 0 for int, false for boolean) is not required, but can be done so for
 * clarity</li>
 * </ul>
 * </p>
 * <p>
 * Keywords for members should appear in the order:
 *
 * <pre>
 *  public | protected | private
 *  static
 *  final
 *  transient
 *  volatile
 *  strictfp
 * </pre>
 *
 * </p>
 * <p>
 * Keywords for methods should appear in the order:
 *
 * <pre>
 *  public | protected | private
 *  abstract
 *  static
 *  final
 *  synchronized
 *  native
 *  strictfp
 * </pre>
 *
 * </p>
 */
public class Declarations
{
    /*
     * Declare class (static) member constants and variables first in order of decreasing scope.
     */
    public static final String CONSTANT_DECLARATION = "This is a static final String";

    private static List<String> sList = new LinkedList<String>();

    /*
     * Declare instance (non-static) constants and variables after class variables.
     */
    private final DateTime mInitWhenDeclared = new DateTime(); // Can initialise this final immutable variable on declaration.

    private String mSomeString;

    private int[] mArray; // For array declarations, the [] keyword appears just after the type.

    private Integer mInteger; // Note that variable declarations are not lined up in columns.

    private Class<?>[] mParamTypes;

    public Declarations(String inSomeString)
    {
        // Non-final instance members should be initialised in the constructor
        mSomeString = inSomeString + mParamTypes.length;

        boolean someFlag = (mSomeString.length() == sList.size());

        if (someFlag)
            mInteger = mSomeString.length();
        else
            mInteger = 0;
    }

    /**
     * <p>
     * This method shows use of multi-line ternaries.
     * </p>
     * <p>
     * When a condition can fit on one line, it does not have to go on one line. e.g. the ternary condition in this method.
     * </p>
     */
    public String multilineTernaries(boolean inConditionA, boolean inConditionB)
    {
        String foo = (inConditionA == inConditionB) ? "bar"
                                                    : "BAR";
        return(foo);
    }

    /**
     * <p>
     * This method shows use of brace alignment for method declaration.
     * </p>
     * <p>
     * The open brace begins at the start of the line after the declaration parameters.
     * </p>
     */
    public String whiteSpaceMethodParentheses()
    {
        return((mArray.length == mInteger) ? mInitWhenDeclared.toString() : new SomePrivateInnerClass().foo());
    }

    /**
     * <p>
     * This method shows use of brace alignment for method declaration.
     * </p>
     * <p>
     * The open brace begins at the start of the line after the declaration parameters.
     * </p>
     */
    static String staticMethod(boolean inIsSomeFlag)
    {
        return(inIsSomeFlag ? null : new SomePrivateInnerClass().foo());
    }

    /**
     * <p>
     * Inner classes should only be declared non-static when access to the enclosing scope is required.
     * </p>
     * <p>
     * A non-private constructor must be supplied for all private static inner classes. This is to prevent the compiler from
     * creating a dummy class (when it encounters a private static class, it checks that there is a default private constructor, if
     * it is not present it creates a dummy access class).
     * </p>
     */
    private static class SomePrivateInnerClass
    {
        public SomePrivateInnerClass()
        { } // Non-private constructor as required

        public String foo()
        {
            return("bar");
        }
    }
}