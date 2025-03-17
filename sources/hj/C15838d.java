package HJ;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"LHJ/d;", "", "<init>", "()V", "Ljava/nio/charset/Charset;", "b", "Ljava/nio/charset/Charset;", "UTF_8", "c", "UTF_16", "d", "UTF_16BE", "e", "UTF_16LE", "f", "US_ASCII", "g", "ISO_8859_1", "h", "utf_32le", "i", "utf_32be", "()Ljava/nio/charset/Charset;", "UTF_32LE", "a", "UTF_32BE", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: HJ.d  reason: case insensitive filesystem */
public final class C15838d {

    /* renamed from: a  reason: collision with root package name */
    public static final C15838d f135278a = new C15838d();

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f135279b;

    /* renamed from: c  reason: collision with root package name */
    public static final Charset f135280c;

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f135281d;

    /* renamed from: e  reason: collision with root package name */
    public static final Charset f135282e;

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f135283f;

    /* renamed from: g  reason: collision with root package name */
    public static final Charset f135284g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile Charset f135285h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile Charset f135286i;

    static {
        Charset forName = Charset.forName(Constants.ENCODING);
        C17542s.i(forName, "forName(...)");
        f135279b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C17542s.i(forName2, "forName(...)");
        f135280c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C17542s.i(forName3, "forName(...)");
        f135281d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C17542s.i(forName4, "forName(...)");
        f135282e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C17542s.i(forName5, "forName(...)");
        f135283f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C17542s.i(forName6, "forName(...)");
        f135284g = forName6;
    }

    private C15838d() {
    }

    public final Charset a() {
        Charset charset = f135286i;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        C17542s.i(forName, "forName(...)");
        f135286i = forName;
        return forName;
    }

    public final Charset b() {
        Charset charset = f135285h;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        C17542s.i(forName, "forName(...)");
        f135285h = forName;
        return forName;
    }
}
