package com.connectcv.coding.examples;

public class ClassWithFewProperties
{
    private String mRequiredImmutableProperty;
    private String mRequiredMutableProperty;
    private String mOptionalImmutableProperty;
    private String mOptionalMutableProperty;

    public ClassWithFewProperties(String inRequiredImmutableProperty,
                                  String inRequiredMutableProperty,
                                  String inOptionalImmutableProperty)
    {
        mRequiredImmutableProperty = inRequiredImmutableProperty;
        mRequiredMutableProperty = inRequiredMutableProperty;
        mOptionalImmutableProperty = inOptionalImmutableProperty;
    }

    public String getRequiredImmutableProperty()
    {
        return(mRequiredImmutableProperty);
    }

    public String getRequiredMutableProperty()
    {
        return(mRequiredMutableProperty);
    }

    public String getOptionalImmutableProperty()
    {
        return(mOptionalImmutableProperty);
    }

    public String getOptionalMutableProperty()
    {
        return(mOptionalMutableProperty);
    }

    public void setRequiredMutableProperty(String inRequiredMutableProperty)
    {
        mRequiredMutableProperty = inRequiredMutableProperty;
    }

    public void setOptionalMutableProperty(String inOptionalMutableProperty)
    {
        mOptionalMutableProperty = inOptionalMutableProperty;
    }
}