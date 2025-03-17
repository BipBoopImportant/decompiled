package od;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* renamed from: od.g  reason: case insensitive filesystem */
public final class C10110g {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f75694a = Charset.defaultCharset();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f75695b = Charset.forName("SJIS");

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f75696c;

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f75697d;

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f75698e;

    static {
        Charset charset;
        try {
            charset = Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        f75696c = charset;
        Charset forName = Charset.forName("EUC_JP");
        f75697d = forName;
        Charset charset2 = f75695b;
        Charset charset3 = f75694a;
        f75698e = charset2.equals(charset3) || forName.equals(charset3);
    }
}
