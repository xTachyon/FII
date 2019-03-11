// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Gender.java


public final class Gender extends Enum
{

    public static Gender[] values()
    {
        return (Gender[])$VALUES.clone();
    }

    public static Gender valueOf(String s)
    {
        return (Gender)Enum.valueOf(Gender, s);
    }

    private Gender(String s, int i)
    {
        super(s, i);
    }

    public static final Gender Male;
    public static final Gender Female;
    private static final Gender $VALUES[];

    static 
    {
        Male = new Gender("Male", 0);
        Female = new Gender("Female", 1);
        $VALUES = (new Gender[] {
            Male, Female
        });
    }
}
