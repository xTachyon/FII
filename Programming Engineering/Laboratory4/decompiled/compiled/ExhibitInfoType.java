// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ExhibitInfoType.java


public final class ExhibitInfoType extends Enum
{

    public static ExhibitInfoType[] values()
    {
        return (ExhibitInfoType[])$VALUES.clone();
    }

    public static ExhibitInfoType valueOf(String s)
    {
        return (ExhibitInfoType)Enum.valueOf(ExhibitInfoType, s);
    }

    private ExhibitInfoType(String s, int i)
    {
        super(s, i);
    }

    public static final ExhibitInfoType Video;
    public static final ExhibitInfoType Sound;
    public static final ExhibitInfoType Text;
    public static final ExhibitInfoType Images;
    private static final ExhibitInfoType $VALUES[];

    static 
    {
        Video = new ExhibitInfoType("Video", 0);
        Sound = new ExhibitInfoType("Sound", 1);
        Text = new ExhibitInfoType("Text", 2);
        Images = new ExhibitInfoType("Images", 3);
        $VALUES = (new ExhibitInfoType[] {
            Video, Sound, Text, Images
        });
    }
}
