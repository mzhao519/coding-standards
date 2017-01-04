package com.connectcv.coding.standards;

/**
 * <p>
 * Generally toString() is intended to be used for debugging/logging purposes. It's usually best just to use
 * {@link ReflectionToStringBuilder} for non-trivial classes.
 * </p>
 * <p>
 * However if the class is a simple value class (like say a product code, or a monetary amount) it's sometimes better to use a more
 * natural toString, such as "HTL/HKG/HYATT" or "1.00 AUD"
 * </p>
 */
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


public final class ToStringMethods
{
    private ToStringMethods()
    {
    };

    public static void main(String[] inArgs)
    {
        System.out.println("Example toString() format for a simple value object with natural form:");
        System.out.println(new SimpleValueObjectWithNaturalForm());

        System.out.println("\nExample toString() format for a simple object:");
        System.out.println(new SimpleObject());

        System.out.println("\nExample toString() format for a complex object:");
        System.out.println(new ComplexObject());
    }

    /**
     * Create a customised toString() for simple value objects that have an inherent format.
     */
    public static class SimpleValueObjectWithNaturalForm
    {
        private String mCurrency;
        private String mAmount;

        public SimpleValueObjectWithNaturalForm()
        {
            mCurrency = "AUD";
            mAmount = "9.95";
        }

        @Override
        public String toString()
        {
            StringBuilder str = new StringBuilder();
            str.append(mCurrency);
            str.append(mAmount);
            return(str.toString());
        }
    }

    /**
     * Use {@link CalypsoToStringStyles.SINGLE_LINE} for simple objects that lack inherent format.
     */
    public static class SimpleObject
    {
        @SuppressWarnings("unused")
        private String mOne;
        @SuppressWarnings("unused")
        private String mTwo;

        public SimpleObject()
        {
            mOne = "Calypso SINGLE_LINE style";
            mTwo = "Some simple data";
        }

        @Override
        public String toString()
        {
            return(ReflectionToStringBuilder.toString(this, ToStringStyle.SIMPLE_STYLE));
        }
    }

    /**
     * Use {@link CalypsoToStringStyles.MULTI_LINE} for complex objects.
     */
    public static class ComplexObject
    {
        @SuppressWarnings("unused")
        private String mOne;
        @SuppressWarnings("unused")
        private String mTwo;

        @SuppressWarnings("unused")
        private SimpleValueObjectWithNaturalForm mThree;
        @SuppressWarnings("unused")
        private SimpleObject mFour;

        public ComplexObject()
        {
            mOne = "Calypso MULTI_LINE style";
            mTwo = "Some complex data";
            mThree = new SimpleValueObjectWithNaturalForm();
            mFour = new SimpleObject();
        }

        @Override
        public String toString()
        {
            return(ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE));
        }
    }
}
