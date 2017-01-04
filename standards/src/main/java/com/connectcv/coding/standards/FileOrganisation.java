/*
 * This class exists solely to demonstrate ConnectCV's Java file organisation standards.
 *
 * If a beginning comment is provided, it should commence on the first line of the file.
 * Otherwise the package keyword should appear on the first line of the file.
 *
 * The beginning comment is separated from the package statement by a single blank line.
 */

package com.connectcv.coding.standards;		// The package directive is followed by a single blank line.

/*
 * Rather than manually organising imports, use the Eclipse 'Organise Imports' shortcut (Ctrl+Shift+O)
 */

import java.util.Collections;
import java.util.List;

import org.joda.time.LocalDateTime;

import com.connectcv.coding.examples.DataClass;

/**
 * Refer to {@link Comments} for standards applicable to class documentation and class implementation comments.
 */
// TODO Add Eclipse import groupings for au.com.tt.util, au.com.tt.utils, and au.com.tt

public class FileOrganisation
{
    /*
     *  Declare class (static) member variables before instance (non-static) member variables, in order of decreasing scope,
     *  with a separating line between scopes.
     */
    public static final String PUBLIC_VARIABLE = "A class variable is a singleton that is shared by all instances of the class";

    static final InnerClass PACKAGE_VARIABLE = new InnerClass();

    private static final LocalDateTime PRIVATE_VARIABLE = new LocalDateTime();

    // Declare instance variables after class variables, in order of decreasing scope.
    private List<Object> mPrivateListMember;
    private DataClass mPrivateDataClassMember;
    private String mPrivateStringMember;

    // Declare constructors.
    public FileOrganisation(String inPrivateMember)
    {
        mPrivateListMember = Collections.emptyList();
        mPrivateDataClassMember = new DataClass();
        mPrivateStringMember = inPrivateMember + mPrivateListMember.size() + mPrivateDataClassMember.toString();
    }

    /**
     * <p>
     * Declare methods and inner classes in whatever sequence best supports readability (rather than by decreasing scope). In the
     * absence of comments, adjacent methods are separated by a single blank line.
     * </p>
     */
    public String getPrivateMember()
    {
        return(mPrivateStringMember);
    }

    public void setPrivateMember(String inPrivateMember)
    {
        mPrivateStringMember = inPrivateMember;
    }

    /*
     * Inner classes can be defined anywhere after the constructors of the enclosing class.
     *
     * Use of doc commenting is optional for private members. Avoid blank lines between the comment block terminator and the method
     * declaration.
     */
    private static class InnerClass
    {
        @SuppressWarnings("unused")
        public String foo()
        {
            return(PRIVATE_VARIABLE.toString());
        }
    }
}