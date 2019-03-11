// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Style.java


public final class Style extends Enum
{

    public static Style[] values()
    {
        return (Style[])$VALUES.clone();
    }

    public static Style valueOf(String s)
    {
        return (Style)Enum.valueOf(Style, s);
    }

    private Style(String s, int i)
    {
        super(s, i);
    }

    public static final Style Baroque;
    public static final Style Classical;
    public static final Style Modern;
    private static final Style $VALUES[];

    static 
    {
        Baroque = new Style("Baroque", 0);
        Classical = new Style("Classical", 1);
        Modern = new Style("Modern", 2);
        $VALUES = (new Style[] {
            Baroque, Classical, Modern
        });
    }
}
