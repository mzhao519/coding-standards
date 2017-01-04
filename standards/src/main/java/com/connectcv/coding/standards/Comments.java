/*
 * This class exists solely to demonstrate ConnectCV's Java commenting standards. A beginning comment (such as this) can
 * optionally be used to convey information about the source file such as purpose, author, disclaimers, copyright, legal
 * information, etc. If provided, it must be a block comment (it cannot be a doc comment) and it should be followed by a single
 * blank line.
 */

package com.connectcv.coding.standards;

/**
 * <p>
 * A class doc can optionally appear before the class declaration. It outlines class functionality, avoiding internal
 * implementation details. If the class functions as a design pattern, it desirable to state as much. The pattern name is formatted
 * with italics. For example, this class is an <i>Adapter</i> for some other class (which it isn't by the way!).
 * </p>
 * <p>
 * When referring to other classes in a comment, the first reference should be a link. For example, this class has a method that
 * returns new a {@link String}. However, when we subsequently refer to {@code String}, we can just mark it using the
 * {@code @code} tag (however the {@code @link} tag can be used again if the comment becomes too large and the author deems it
 * appropriate). This rule does not apply when referring to the current class, in this case {@code Comments}, which is always
 * marked with the {@code @code} tag. When referring to class members when using {@code @code}, don't use the hash character i.e.
 * {@code Class.member} is correct, while {@code Class#member} is not.
 * </p>
 * <p>
 * The same rule applies when referring to methods, for example, we use a link for {@link #getStringConstant()} the first time, but
 * the second time we mention {@code getStringConstant()} we use the {@code @code} tag. Note that if a method has a lot of
 * parameters, like {@link #aMethodWithParams(int, int, int) aMethodWithParams()} it is a good idea to provide link text without
 * the parameters (unless the method is overloaded).
 * </p>
 * <p>
 * The use of <b>bold</b> and <i>italic</i> fonts are encouraged for emphasis.
 * </p>
 * <p>
 * Avoid blank lines between the comment block terminator and the class or interface keywords.
 * </p>
 * <p>
 * Note is is preferable to use {@code @code} rather than {@code <code></code>}, as the former is more flexible in what it
 * supports (most notably the use of HTML tags).
 * </p>
 */
public class Comments
{
    /*
     * After the class or interface declaration, any internal details of a general nature can be explained within an implementation
     * comment. A single blank line follows the class implementation comment.
     */

    /**
     * The first sentence of a method comment is a short summary of what the method does. This first sentence appears in the
     * summary section of any generated JavaDocs and so should not be too long. The remainder of the comment outlines method
     * functionality, avoiding implementation details.
     * <p>
     * Note that this method uses the {@code <p>} tag in a different manner to the class comment - either usage style is valid.
     * <p>
     * References to other classes, interfaces, methods, and parameters are formatted in the same manner as in class comments (see
     * above). The current method is always referred to as 'this method'. When we refer to an instance of the enclosing class, we
     * say 'this {@code Comments}'.
     * <p>
     * If the method implements an interface method, its comment should not restate the interface's method comment, unless it does
     * so to expand upon it (consider using the {@code {@inheritDoc}} tag).
     * <p>
     * When referring to the method parameters, prefer referring to the directly by name (i.e. {@code inParameter}) unless it
     * affects readability.
     * <p>
     * While it is a good idea to always use the {@code @throws} tag, only use {@code @param} or {@code return} if it is not
     * obvious what the parameters or return type mean.
     * <p>
     * Always refer to literal values using the {@code @code} tag (such as {@code null}, {@code true}, {@code false}).
     * <p>
     * Avoid blank lines between the comment block terminator and the method declaration.
     *
     * @param inParameter an integer that determines if we throw an {@link IllegalArgumentException}. This comment can be very
     *                long and so required a line break. When a line break is needed, don't worry about indentation, leave that
     *                up to the Eclipse autoformatter.
     * @return a new {@link String} that contains a value that is very interesting it we can do so. Otherwise {@code null}.
     * @throws IllegalArgumentException if {@code inParameter} is zero.
     */
    public String commentExample(int inParameter) throws IllegalArgumentException
    {
        if (inParameter == 0) throw new IllegalArgumentException("'inParameter' must be non-zero");

        // Single line comments are also allowed - avoid trailing blank lines unless it aids readability.
        return(inParameter < 0 ? null : showPrivateMethodCommenting());
    }

    /**
     * <p>
     * This method illustrates the eclipse task tags that we use.
     * </p>
     * <p>
     * The {@code SUGG} tag is a replacement for the 'suggest' file, and the usual rules apply (i.e. address the issue if you in
     * the area and have time).
     * </p>
     * <p>
     * The {@code TODO} tag represents work that is outstanding. You cannot consider submit a task for review if there are
     * outstanding {@code TODO} tags, <b>unless</b> they are flagged to be fixed on an outstanding ticket or SCN, in which case
     * this ticket or SCN number must be included on the {@code TODO} comment.
     * </p>
     * <p>
     * Note that these tags are set up from the Preferences setup (menu 'Window'), at 'Java -> Compiler -> Task Tags'.
     * </p>
     */
    // SUGG This demonstrates a suggestion, as would have appeared in the 'suggest' file
    // TODO This demonstrates an item must be addressed before this class is submitted for review
    // TODO AGWEB-100 - This demonstrates an item that is to be addressed by a ticket
    // TODO SCN1000 - This demonstrates an item that is to be addressed as part of an SCN
    public String showUseOfTaskTags()
    {
        return("blah");
    }

    /**
      * {@code HashMap<Object, Object> map = Maps.newHashMap((Object) "key1", (Object) "value1"); }.
      */
    public void showCheckstyleProblemWithGenericsInComment()
    { }

    /*
     * Commenting is optional for private members. Comments can be either doc or C style. In general, we still avoid the blank line
     * following C style block comments.
     */
    private String showPrivateMethodCommenting()
    {
        return("bar");
    }
}