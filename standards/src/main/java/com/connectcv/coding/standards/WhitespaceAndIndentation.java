/*
 * This class exists solely to demonstrate ConnectCV's Java indentation and whitespace standards. These match those
 */

package com.connectcv.coding.standards;

import java.util.Map;

/**
 * <p>
 * The general indentation standards are as follows:
 * <ul>
 * <li>The package, import, and class declarations each begin at the start of a line.</li>
 * <li>The unit of indentation is four spaces, and tabs are set to eight spaces.</li>
 * <li>Each line of code cannot exceed 132 characters in length.</li>
 * <li>Comments cannot continue beyond the 131st character.</li>
 * </ul>
 * </p>
 */
public class WhitespaceAndIndentation
{
    private static final String STRING_CONSTANT = "When breaking a sentence, any needed space and the plus stays on this line, " +
                                                  "and the sentence continues here. Note that the autoformatter will fight you " +
                                                  "on this so you may need to correct it.";

    private FitnessMotivation mFitnessMotivation;

    /**
     * <p>
     * Either of the following enum declaration is OK, but the vertical style must be used if the line is longer than 132
     * characters.
     * </p>
     * <p>
     * For placement, treat enums as you would inner classes and declare them near where they are used.
     * </p>
     */
    public static enum Weather
    {
        /**
         * Enum values can have comments if required.
         */
        OVERCAST,

        /**
         * If we have comments, normal spacing rules apply before comments.
         */
        PLEASANTLY_SUNNY,
        STINKING_HOT,
        RAINING_CATS_AND_DOGS,
        GOLFBALL_SIZED_HAILSTONES,
        FREEZING,
        WINDY,
        THUNDERSTORM,
        HURRICANE; // Be sure to include closing semicolon (although it will not always generate a compiler error without it)
    };

    public static enum FitnessMotivation
    {
        COUCH_POTATO, INTERESTED_BUT_LAZY, SOCIAL_RUNNER, KEEN, SUPER_KEEN, DAVO;
    };

    public WhitespaceAndIndentation(FitnessMotivation inFitnessMotivation, Weather inWeather)
    {
        mFitnessMotivation = (inWeather == Weather.PLEASANTLY_SUNNY) ? inFitnessMotivation : FitnessMotivation.COUCH_POTATO;
    }

    /**
     * <p>
     * This method shows use of whitespace around a method.
     * <ul>
     * <li>There is no whitespace between the method name and its opening parentheses.</li>
     * <li>For methods that take no parameters, there is no whitespace between parentheses.</li>
     * </ul>
     * </p>
     */
    public String whiteSpaceMethodParentheses()
    {
        return(STRING_CONSTANT);
    }

    /**
     * <p>
     * This method demonstrates the indenting that applies to empty blocks.
     * </p>
     * <p>
     * For empty blocks, the opening and closing braces occur adjacent to one another, separated from the associated entity by a
     * single space.
     * </p>
     * <p>
     * Use of empty blocks should be limited to constructor and method declarations.
     * </p>
     */
    public void indentingEmptyBlocks()
    { }

    /**
     * <p>
     * This method demonstrates the indenting that applies to blocks that are not empty.
     * </p>
     * <p>
     * Blocks that contain statements occur on a new line indented to the same level as the previous statement. The indentation of
     * the next line (following the start of block) is increased by one level. The corresponding close brace occurs on a new line
     * indented to the same level as the open brace.
     * </p>
     * <p>
     * Use of curly braces is optional for singleton statement blocks.
     * </p>
     * <p>
     * Completely empty statement blocks are not permitted.
     * </p>
     */
    public void indentingNonEmptyBlocks(boolean inCondition)
    {
        if (inCondition)
        {
            System.out.println("Non-empty blocks start on a new line");
        }
        else
        {
            // At least put some comments in!
        }
    }

    /**
     * <p>
     * This method demonstrates the ban on whitespace between the return keyword and its associated expression
     * </p>
     * <p>
     * This facilitates searching for method exit points, as the open parenthesis can be readily included in the search criteria.
     * </p>
     */
    public String noWhiteSpaceForReturn()
    {
        return("blah");
    }

    /**
     * <p>
     * Use a single space between binary operators and each of their operands.
     * </p>
     * <p>
     * The only exception to this is the {@code .} operator.
     * </p>
     */
    public String whiteSpaceForBinaryOperators(int inOperand1, int inOperand2)
    {
        int result = ((inOperand1 + inOperand2) / (inOperand1 - inOperand2)) >> (inOperand1 * inOperand2);

        return(Integer.toBinaryString(result));
    }

    /**
     * <p>
     * No whitespace permitted between any unary operator and its operand.
     * </p>
     */
    public int noWhiteSpaceForUnaryOperators(int inOperand)
    {
        return(--inOperand);
    }

    /**
     * <p>
     * Use a single space between conditional keywords and the opening parenthesis for the expression.
     * </p>
     * <p>
     * The {@code while} statement in a {@code do-while} construct should begin on the next line of the closing curly brace.
     * </p>
     * <p>
     * The expressions in a {@code for} statement should be separated by a single space.
     * </p>
     */
    public void whiteSpaceForConditionals()
    {
        int idx = 0;

        do
        {
            System.out.println("do demo");
        }
        while (idx++ < 5);

        while (idx-- > 0)
        {
            System.out.println("while demo");
        }

        for (idx = 0; idx < 5; idx++)
        {
            System.out.println("for demo");
        }

        try
        {
            noWhiteSpaceForReturn();
        }
        catch (IllegalArgumentException iae)
        {
            System.out.println("catch demo");
        }
        finally
        {
            System.out.println("finally demo");
        }
    }

    /**
     * <p>
     * This method shows use of whitespace around method parameters that are short.
     * <ul>
     * <li>More than one parameter can be declared on the same line.</li>
     * <li>There is a single space after each comma.</li>
     * </ul>
     * </p>
     */
    public String whiteSpaceShortParameters(int inParameter1, int inParameter2)
    {
        return("blah");
    }

    /**
     * <p>
     * This method shows use of whitespace around method parameters that are lengthy.
     * <p>
     * <ul>
     * <li>Declare each parameter on a line of its own.</li>
     * <li>Types and names are <b>not</b> column aligned.</li>
     * <li></li>
     * </ul>
     * </p>
     */
    public String whiteSpaceLengthyParameters(FileOrganisation inFileOrganisation,
                                              NamingConventions inNamingConventions,
                                              Map<String, Statements> inStatements)
    {
        return("blah");
    }

    /**
     * <p>
     * This method shows use of whitespace around a throws clause that is lengthy.
     * <p>
     * <ul>
     * <li>Declare each {@link Exception} on a line of its own.</li>
     * <li>Exceptions are column aligned.</li>
     * </ul>
     * </p>
     */
    public String whiteSpaceLengthyThrowsDeclaration(FileOrganisation inFileOrganisation) throws IllegalArgumentException,
                                                                                                 IllegalStateException
    {
        return("blah");
    }

    /**
     * <p>
     * This method shows use of whitespace around both a parameter list and throws clause that are lengthy, but there
     * is a choice on which to break into multiple lines.
     * <p>
     * <ul>
     * <li>Prefer breaking the parameter list to breaking the throws clause</li>
     * </ul>
     * </p>
     */
    public String whiteSpaceLengthyThrowsDeclaration(String inOne,
                                                     Integer inTwo) throws IllegalArgumentException, IllegalStateException
    {
        return("blah");
    }

    /**
     * <p>
     * This method shows indentation of switch-case blocks. Note there is no space between the case value and the colon.
     * </p>
     * <p>
     * Any fall through terms should be clearly commented.
     * </p>
     */
    public boolean switchIndenting(boolean inHasRunningKit,
                                   Weather inWeather,
                                   boolean inIsBackAching,
                                   int inNumberOfParticipants)
    {
        switch (mFitnessMotivation)
        {
            case DAVO:
                return(true);

            case SUPER_KEEN:
                return(inHasRunningKit && inWeather != Weather.GOLFBALL_SIZED_HAILSTONES);

            case SOCIAL_RUNNER:
                int testInt = 1;

                if (inHasRunningKit)
                {
                    if (inNumberOfParticipants > 5)
                        testInt++;
                    else
                        testInt--;
                }

                return(testInt == 0);

            case INTERESTED_BUT_LAZY:
                return(inHasRunningKit && !inIsBackAching && inWeather == Weather.PLEASANTLY_SUNNY);

            case COUCH_POTATO:
                // Falls through

            default:
                return(false);
        }
    }

    /**
     * <p>
     * This method shows alignment of boolean operators over multiple line.
     * </p>
     */
    public boolean booleanOperatorAlignment(boolean inHasRunningKit,
                                            Weather inWeather,
                                            boolean inIsBackAching,
                                            int inNumberOfParticipants)
    {
        boolean booleanFlagWithAReallyReallyReallyReallyExtensivelyLongNameTooLongInFactReally = (inNumberOfParticipants == 0);

        if (inNumberOfParticipants < 0)
        {
            return(inHasRunningKit && !inIsBackAching && (inWeather == Weather.PLEASANTLY_SUNNY ||
                                                          inWeather == Weather.OVERCAST ||
                                                          inWeather == Weather.STINKING_HOT));

        }
        else if (booleanFlagWithAReallyReallyReallyReallyExtensivelyLongNameTooLongInFactReally ||
                 (inHasRunningKit && !inIsBackAching))
        {
            return(true);
        }

        return(false);
    }

    /**
     * <p>
     * Shows how to avoid multi-line expressions. There is no standard for how to group the expressions, (it is left up to the
     * developer to group them logically) but when a line needs to be broken around an operator, our checkstyle checks prevent
     * operator being placed on the following line. As such, it is best to avoid multi-line expressions, as shown here.
     * </p>
     */
    public int expressionWrapping(int inVeryLongButHighlyMeaningfulNameOne,
                                  int inVeryLongButHighlyMeaningfulNameTwo,
                                  int inVeryLongButHighlyMeaningfulNameThree,
                                  int inVeryLongButHighlyMeaningfulNameFour,
                                  int inVeryLongButHighlyMeaningfulNameFive)
    {
//        int incorrectWay = inVeryLongButHighlyMeaningfulNameOne * (inVeryLongButHighlyMeaningfulNameTwo
//                                                                   + inVeryLongButHighlyMeaningfulNameThree
//                                                                   - inVeryLongButHighlyMeaningfulNameFour)
//                                                                   + (4 * inVeryLongButHighlyMeaningfulNameFive));

        int mutipleOne = 4 * inVeryLongButHighlyMeaningfulNameFive;
        int sumOne = inVeryLongButHighlyMeaningfulNameTwo + inVeryLongButHighlyMeaningfulNameThree + mutipleOne;
        int mutiplier = sumOne - inVeryLongButHighlyMeaningfulNameFour;

        int result = inVeryLongButHighlyMeaningfulNameOne * mutiplier;

        return(result);
    }

    public void callingMethodsWithLongParameterLists()
    {
        int veryLongButHighlyMeaningfulNameOne = 0;
        int veryLongButHighlyMeaningfulNameTwo = 1;
        int veryLongButHighlyMeaningfulNameThree = 2;
        int veryLongButHighlyMeaningfulNameFour = 3;
        int veryLongButHighlyMeaningfulNameFive = 4;

        // The default wrapping for long parameter lists is one parameter per line
        expressionWrapping(veryLongButHighlyMeaningfulNameOne,
                           veryLongButHighlyMeaningfulNameTwo,
                           veryLongButHighlyMeaningfulNameThree,
                           veryLongButHighlyMeaningfulNameFour,
                           veryLongButHighlyMeaningfulNameFive);

        int nameOneInGroup = 5;
        int nameTwoInGroup = 6;
        int nameThreeInGroup = 7;

        // However, if there is a logical grouping, this can be expressed by putting multiple parameters on a line
        expressionWrapping(veryLongButHighlyMeaningfulNameOne,
                           veryLongButHighlyMeaningfulNameTwo,
                           nameOneInGroup, nameTwoInGroup, nameThreeInGroup);
    }

    /**
     * <p>
     * When presented with method signatures that will not easily fit on a single line, it is suggested that one of the following
     * be done.
     * <ol>
     * <li>Separate parameters onto separate lines</li>
     * <li>Consider shortening the method name (<b>without sacrificing readability</b>)</li>
     * <li>Move throws clause to the next line (indented one tab)</li>
     * <li>If the return type is to long (not shown here), move the method name to a new line</li>
     * <li>If the first parameter declaration is too long, move it to a new line near the right hand margin (aligning other
     * parameters with it if possible)</li>
     * </ol>
     * </p>
     */
    public IllegalArgumentException createIllegalArgumentExceptionFromAnotherIllegalArgumentException
                                                                        (IllegalArgumentException inIllegalArgumentException,
                                                                         IllegalStateException inIllegalStateException)
        throws IllegalArgumentException
    {
        if (inIllegalStateException != null)
            throw inIllegalStateException;

        throw new IllegalArgumentException(inIllegalArgumentException.getMessage());
    }

    /**
     * <p>We can only leave braces of when the inner loop is just a single statement and this has a transitive quality back up the
     * tree.
     * </p>
     */
    public void loops()
    {
        // Good
        for (int i = 0; i < 100; i++)
            for (int j = i; j < 100; j--)
                System.out.println("i: " + i + " j:" + j);

        // Bad
        for (int i = 0; i < 100; i++)
            for (int j = i; j > 0; j--)
            {
                System.out.println("i: " + i + " j:" + j);
                System.out.println("j + i: " + (j + i));
            }

        // Also Bad
        for (int i = 0; i < 100; i++)
            for (int j = 0; j > 0; j++)
                System.out.println("i: " + i + " j:" + j);
    }
}