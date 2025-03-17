package GK;

import HJ.C15850p;
import HJ.C15854t;
import HK.C15861a;
import HK.C15864d;
import WK.C16770e;
import YH.C16877v;
import com.adjust.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17972h;
import tI.C17978n;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b$\u0018\u0000 \u001c2\u00020\u0001:\u0002'*Bc\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b\u0004\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b\u0005\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0007¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001e\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b\f\u0010\u0017R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010(R\u0017\u0010:\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R\u0011\u0010;\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b5\u0010\u0017R\u0011\u0010<\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b+\u0010\u0017R\u0011\u0010=\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\t8G¢\u0006\u0006\u001a\u0004\b.\u00104R\u0013\u0010?\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R\u0013\u0010A\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b@\u0010\u0017R\u0011\u0010C\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bB\u0010%R\u0013\u0010D\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b*\u0010\u0017¨\u0006E"}, d2 = {"LGK/v;", "", "", "scheme", "username", "password", "host", "", "port", "", "pathSegments", "queryNamesAndValues", "fragment", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/net/URL;", "v", "()Ljava/net/URL;", "Ljava/net/URI;", "u", "()Ljava/net/URI;", "r", "()Ljava/lang/String;", "link", "s", "(Ljava/lang/String;)LGK/v;", "LGK/v$a;", "k", "()LGK/v$a;", "l", "(Ljava/lang/String;)LGK/v$a;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "a", "Ljava/lang/String;", "t", "b", "c", "d", "i", "e", "I", "o", "f", "Ljava/util/List;", "n", "()Ljava/util/List;", "g", "h", "j", "Z", "()Z", "isHttps", "encodedUsername", "encodedPassword", "encodedPath", "encodedPathSegments", "encodedQuery", "p", "query", "q", "querySize", "encodedFragment", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.v  reason: case insensitive filesystem */
public final class C15803v {

    /* renamed from: k  reason: collision with root package name */
    public static final b f135109k = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f135110l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    private final String f135111a;

    /* renamed from: b  reason: collision with root package name */
    private final String f135112b;

    /* renamed from: c  reason: collision with root package name */
    private final String f135113c;

    /* renamed from: d  reason: collision with root package name */
    private final String f135114d;

    /* renamed from: e  reason: collision with root package name */
    private final int f135115e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f135116f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f135117g;

    /* renamed from: h  reason: collision with root package name */
    private final String f135118h;

    /* renamed from: i  reason: collision with root package name */
    private final String f135119i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f135120j;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\b\f\u0018\u0000 Q2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001aJ\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u001aJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\u001aJ\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0007¢\u0006\u0004\b'\u0010\u001aJ\u0017\u0010)\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b)\u0010\u001aJ\u0017\u0010+\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b+\u0010\u001aJ\u001f\u0010.\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b2\u0010/J\u0017\u00104\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b4\u0010\u001aJ\u000f\u00105\u001a\u00020\u0000H\u0000¢\u0006\u0004\b5\u00106J\r\u00108\u001a\u000207¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u0001072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b=\u0010>R$\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b'\u0010?\u001a\u0004\b@\u0010;\"\u0004\bA\u0010BR\"\u0010E\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b2\u0010?\u001a\u0004\bC\u0010;\"\u0004\bD\u0010BR\"\u0010H\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b%\u0010?\u001a\u0004\bF\u0010;\"\u0004\bG\u0010BR$\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b.\u0010?\u001a\u0004\bI\u0010;\"\u0004\bJ\u0010BR\"\u0010!\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b8\u0010K\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010NR \u0010S\u001a\b\u0012\u0004\u0012\u00020\u00070O8\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010P\u001a\u0004\bQ\u0010RR,\u0010W\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010O8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b+\u0010P\u001a\u0004\bT\u0010R\"\u0004\bU\u0010VR$\u0010Z\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b4\u0010?\u001a\u0004\bX\u0010;\"\u0004\bY\u0010B¨\u0006["}, d2 = {"LGK/v$a;", "", "<init>", "()V", "", "f", "()I", "", "input", "startPos", "limit", "LXH/N;", "t", "(Ljava/lang/String;II)V", "pos", "", "addTrailingSlash", "alreadyEncoded", "q", "(Ljava/lang/String;IIZZ)V", "k", "(Ljava/lang/String;)Z", "l", "o", "scheme", "u", "(Ljava/lang/String;)LGK/v$a;", "username", "B", "password", "n", "host", "j", "port", "p", "(I)LGK/v$a;", "pathSegment", "c", "encodedPathSegment", "a", "query", "r", "encodedQuery", "g", "name", "value", "d", "(Ljava/lang/String;Ljava/lang/String;)LGK/v$a;", "encodedName", "encodedValue", "b", "fragment", "h", "s", "()LGK/v$a;", "LGK/v;", "e", "()LGK/v;", "toString", "()Ljava/lang/String;", "base", "m", "(LGK/v;Ljava/lang/String;)LGK/v$a;", "Ljava/lang/String;", "getScheme$okhttp", "A", "(Ljava/lang/String;)V", "getEncodedUsername$okhttp", "x", "encodedUsername", "getEncodedPassword$okhttp", "w", "encodedPassword", "getHost$okhttp", "y", "I", "getPort$okhttp", "z", "(I)V", "", "Ljava/util/List;", "i", "()Ljava/util/List;", "encodedPathSegments", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "getEncodedFragment$okhttp", "v", "encodedFragment", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.v$a */
    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        public static final C3324a f135121i = new C3324a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private String f135122a;

        /* renamed from: b  reason: collision with root package name */
        private String f135123b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f135124c = "";

        /* renamed from: d  reason: collision with root package name */
        private String f135125d;

        /* renamed from: e  reason: collision with root package name */
        private int f135126e = -1;

        /* renamed from: f  reason: collision with root package name */
        private final List<String> f135127f;

        /* renamed from: g  reason: collision with root package name */
        private List<String> f135128g;

        /* renamed from: h  reason: collision with root package name */
        private String f135129h;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LGK/v$a$a;", "", "<init>", "()V", "", "input", "", "pos", "limit", "g", "(Ljava/lang/String;II)I", "h", "f", "e", "INVALID_HOST", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: GK.v$a$a  reason: collision with other inner class name */
        public static final class C3324a {
            public /* synthetic */ C3324a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* access modifiers changed from: private */
            public final int e(String str, int i10, int i11) {
                try {
                    int parseInt = Integer.parseInt(b.b(C15803v.f135109k, str, i10, i11, "", false, false, false, false, (Charset) null, 248, (Object) null));
                    if (1 > parseInt || parseInt >= 65536) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* access modifiers changed from: private */
            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt == '[') {
                        do {
                            i10++;
                            if (i10 >= i11) {
                                break;
                            }
                        } while (str.charAt(i10) == ']');
                    } else if (charAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            /* access modifiers changed from: private */
            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i10);
                if ((C17542s.l(charAt, 97) < 0 || C17542s.l(charAt, 122) > 0) && (C17542s.l(charAt, 65) < 0 || C17542s.l(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i10);
                    if (('a' > charAt2 || charAt2 >= '{') && (('A' > charAt2 || charAt2 >= '[') && !(('0' <= charAt2 && charAt2 < ':') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i10;
                        }
                        return -1;
                    }
                }
            }

            /* access modifiers changed from: private */
            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }

            private C3324a() {
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f135127f = arrayList;
            arrayList.add("");
        }

        private final int f() {
            int i10 = this.f135126e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = C15803v.f135109k;
            String str = this.f135122a;
            C17542s.g(str);
            return bVar.c(str);
        }

        private final boolean k(String str) {
            return C17542s.e(str, ".") || C15854t.H(str, "%2e", true);
        }

        private final boolean l(String str) {
            return C17542s.e(str, "..") || C15854t.H(str, "%2e.", true) || C15854t.H(str, ".%2e", true) || C15854t.H(str, "%2e%2e", true);
        }

        private final void o() {
            List<String> list = this.f135127f;
            if (list.remove(list.size() - 1).length() != 0 || this.f135127f.isEmpty()) {
                this.f135127f.add("");
                return;
            }
            List<String> list2 = this.f135127f;
            list2.set(list2.size() - 1, "");
        }

        private final void q(String str, int i10, int i11, boolean z10, boolean z11) {
            String b10 = b.b(C15803v.f135109k, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, (Charset) null, 240, (Object) null);
            if (!k(b10)) {
                if (l(b10)) {
                    o();
                    return;
                }
                List<String> list = this.f135127f;
                if (list.get(list.size() - 1).length() == 0) {
                    List<String> list2 = this.f135127f;
                    list2.set(list2.size() - 1, b10);
                } else {
                    this.f135127f.add(b10);
                }
                if (z10) {
                    this.f135127f.add("");
                }
            }
        }

        private final void t(String str, int i10, int i11) {
            if (i10 != i11) {
                char charAt = str.charAt(i10);
                if (charAt == '/' || charAt == '\\') {
                    this.f135127f.clear();
                    this.f135127f.add("");
                    i10++;
                } else {
                    List<String> list = this.f135127f;
                    list.set(list.size() - 1, "");
                }
                while (true) {
                    int i12 = i10;
                    while (true) {
                        if (i12 < i11) {
                            i10 = C15864d.q(str, "/\\", i12, i11);
                            boolean z10 = i10 < i11;
                            q(str, i12, i10, z10, true);
                            if (z10) {
                                i12 = i10 + 1;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        public final void A(String str) {
            this.f135122a = str;
        }

        public final a B(String str) {
            C17542s.j(str, "username");
            this.f135123b = b.b(C15803v.f135109k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }

        public final a a(String str) {
            C17542s.j(str, "encodedPathSegment");
            q(str, 0, str.length(), false, true);
            return this;
        }

        public final a b(String str, String str2) {
            C17542s.j(str, "encodedName");
            if (this.f135128g == null) {
                this.f135128g = new ArrayList();
            }
            List<String> list = this.f135128g;
            C17542s.g(list);
            b bVar = C15803v.f135109k;
            list.add(b.b(bVar, str, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null));
            List<String> list2 = this.f135128g;
            C17542s.g(list2);
            list2.add(str2 != null ? b.b(bVar, str2, 0, 0, " \"'<>#&=", true, false, true, false, (Charset) null, 211, (Object) null) : null);
            return this;
        }

        public final a c(String str) {
            C17542s.j(str, "pathSegment");
            q(str, 0, str.length(), false, false);
            return this;
        }

        public final a d(String str, String str2) {
            C17542s.j(str, "name");
            if (this.f135128g == null) {
                this.f135128g = new ArrayList();
            }
            List<String> list = this.f135128g;
            C17542s.g(list);
            b bVar = C15803v.f135109k;
            list.add(b.b(bVar, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null));
            List<String> list2 = this.f135128g;
            C17542s.g(list2);
            list2.add(str2 != null ? b.b(bVar, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, (Charset) null, 219, (Object) null) : null);
            return this;
        }

        public final C15803v e() {
            ArrayList arrayList;
            String str = this.f135122a;
            if (str != null) {
                b bVar = C15803v.f135109k;
                String h10 = b.h(bVar, this.f135123b, 0, 0, false, 7, (Object) null);
                String h11 = b.h(bVar, this.f135124c, 0, 0, false, 7, (Object) null);
                String str2 = this.f135125d;
                if (str2 != null) {
                    int f10 = f();
                    Iterable<String> iterable = this.f135127f;
                    ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
                    for (String h12 : iterable) {
                        arrayList2.add(b.h(C15803v.f135109k, h12, 0, 0, false, 7, (Object) null));
                    }
                    List<String> list = this.f135128g;
                    if (list != null) {
                        Iterable<String> iterable2 = list;
                        arrayList = new ArrayList(C16877v.y(iterable2, 10));
                        for (String str3 : iterable2) {
                            arrayList.add(str3 != null ? b.h(C15803v.f135109k, str3, 0, 0, true, 3, (Object) null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str4 = this.f135129h;
                    return new C15803v(str, h10, h11, str2, f10, arrayList2, arrayList, str4 != null ? b.h(C15803v.f135109k, str4, 0, 0, false, 7, (Object) null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final a g(String str) {
            List<String> list;
            if (str != null) {
                b bVar = C15803v.f135109k;
                String b10 = b.b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, (Charset) null, 211, (Object) null);
                if (b10 != null) {
                    list = bVar.j(b10);
                    this.f135128g = list;
                    return this;
                }
            }
            list = null;
            this.f135128g = list;
            return this;
        }

        public final a h(String str) {
            this.f135129h = str != null ? b.b(C15803v.f135109k, str, 0, 0, "", false, false, false, true, (Charset) null, 187, (Object) null) : null;
            return this;
        }

        public final List<String> i() {
            return this.f135127f;
        }

        public final a j(String str) {
            C17542s.j(str, "host");
            String e10 = C15861a.e(b.h(C15803v.f135109k, str, 0, 0, false, 7, (Object) null));
            if (e10 != null) {
                this.f135125d = e10;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final a m(C15803v vVar, String str) {
            int i10;
            int q10;
            int i11;
            int i12;
            boolean z10;
            boolean z11;
            String str2 = str;
            C17542s.j(str2, "input");
            int A10 = C15864d.A(str2, 0, 0, 3, (Object) null);
            int C10 = C15864d.C(str2, A10, 0, 2, (Object) null);
            C3324a aVar = f135121i;
            int c10 = aVar.g(str2, A10, C10);
            boolean z12 = true;
            char c11 = 65535;
            if (c10 != -1) {
                if (C15854t.T(str2, "https:", A10, true)) {
                    this.f135122a = Constants.SCHEME;
                    A10 += 6;
                } else if (C15854t.T(str2, "http:", A10, true)) {
                    this.f135122a = "http";
                    A10 += 5;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str2.substring(0, c10);
                    C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(substring);
                    sb2.append('\'');
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else if (vVar != null) {
                this.f135122a = vVar.t();
            } else {
                if (str.length() > 6) {
                    str2 = C15854t.K1(str2, 6) + "...";
                }
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
            }
            int d10 = aVar.h(str2, A10, C10);
            char c12 = '?';
            char c13 = '#';
            if (d10 >= 2 || vVar == null || !C17542s.e(vVar.t(), this.f135122a)) {
                boolean z13 = false;
                boolean z14 = false;
                int i13 = A10 + d10;
                while (true) {
                    q10 = C15864d.q(str2, "@/\\?#", i13, C10);
                    char charAt = q10 != C10 ? str2.charAt(q10) : c11;
                    if (charAt == c11 || charAt == c13 || charAt == '/' || charAt == '\\' || charAt == c12) {
                        boolean z15 = z12;
                        i10 = C10;
                        C3324a aVar2 = f135121i;
                        int i14 = q10;
                        int b10 = aVar2.f(str2, i13, i14);
                        int i15 = b10 + 1;
                    } else if (charAt == '@') {
                        if (!z13) {
                            int p10 = C15864d.p(str2, ':', i13, q10);
                            b bVar = C15803v.f135109k;
                            String str3 = "%40";
                            int i16 = q10;
                            int i17 = p10;
                            z10 = z12;
                            String b11 = b.b(bVar, str, i13, p10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                            if (z14) {
                                b11 = this.f135123b + str3 + b11;
                            }
                            this.f135123b = b11;
                            int i18 = i16;
                            int i19 = i17;
                            if (i19 != i18) {
                                i11 = i18;
                                this.f135124c = b.b(bVar, str, i19 + 1, i18, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                z11 = z10;
                            } else {
                                i11 = i18;
                                z11 = z13;
                            }
                            z13 = z11;
                            i12 = C10;
                            z14 = z10;
                        } else {
                            i11 = q10;
                            z10 = z12;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f135124c);
                            sb3.append("%40");
                            i12 = C10;
                            StringBuilder sb4 = sb3;
                            sb4.append(b.b(C15803v.f135109k, str, i13, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null));
                            this.f135124c = sb4.toString();
                        }
                        i13 = i11 + 1;
                        z12 = z10;
                        C10 = i12;
                        c13 = '#';
                        c12 = '?';
                        c11 = 65535;
                    }
                }
                boolean z152 = z12;
                i10 = C10;
                C3324a aVar22 = f135121i;
                int i142 = q10;
                int b102 = aVar22.f(str2, i13, i142);
                int i152 = b102 + 1;
                if (i152 < i142) {
                    this.f135125d = C15861a.e(b.h(C15803v.f135109k, str, i13, b102, false, 4, (Object) null));
                    int a10 = aVar22.e(str2, i152, i142);
                    this.f135126e = a10;
                    if (a10 == -1) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Invalid URL port: \"");
                        String substring2 = str2.substring(i152, i142);
                        C17542s.i(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb5.append(substring2);
                        sb5.append('\"');
                        throw new IllegalArgumentException(sb5.toString().toString());
                    }
                } else {
                    b bVar2 = C15803v.f135109k;
                    this.f135125d = C15861a.e(b.h(bVar2, str, i13, b102, false, 4, (Object) null));
                    String str4 = this.f135122a;
                    C17542s.g(str4);
                    this.f135126e = bVar2.c(str4);
                }
                if (this.f135125d != null) {
                    A10 = i142;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Invalid URL host: \"");
                    String substring3 = str2.substring(i13, b102);
                    C17542s.i(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb6.append(substring3);
                    sb6.append('\"');
                    throw new IllegalArgumentException(sb6.toString().toString());
                }
            } else {
                this.f135123b = vVar.g();
                this.f135124c = vVar.c();
                this.f135125d = vVar.i();
                this.f135126e = vVar.o();
                this.f135127f.clear();
                this.f135127f.addAll(vVar.e());
                if (A10 == C10 || str2.charAt(A10) == '#') {
                    g(vVar.f());
                }
                i10 = C10;
            }
            int i20 = i10;
            int q11 = C15864d.q(str2, "?#", A10, i20);
            t(str2, A10, q11);
            if (q11 < i20 && str2.charAt(q11) == '?') {
                int p11 = C15864d.p(str2, '#', q11, i20);
                b bVar3 = C15803v.f135109k;
                this.f135128g = bVar3.j(b.b(bVar3, str, q11 + 1, p11, " \"'<>#", true, false, true, false, (Charset) null, 208, (Object) null));
                q11 = p11;
            }
            if (q11 < i20 && str2.charAt(q11) == '#') {
                this.f135129h = b.b(C15803v.f135109k, str, q11 + 1, i20, "", true, false, false, true, (Charset) null, 176, (Object) null);
            }
            return this;
        }

        public final a n(String str) {
            C17542s.j(str, "password");
            this.f135124c = b.b(C15803v.f135109k, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }

        public final a p(int i10) {
            if (1 > i10 || i10 >= 65536) {
                throw new IllegalArgumentException(("unexpected port: " + i10).toString());
            }
            this.f135126e = i10;
            return this;
        }

        public final a r(String str) {
            List<String> list;
            if (str != null) {
                b bVar = C15803v.f135109k;
                String b10 = b.b(bVar, str, 0, 0, " \"'<>#", false, false, true, false, (Charset) null, 219, (Object) null);
                if (b10 != null) {
                    list = bVar.j(b10);
                    this.f135128g = list;
                    return this;
                }
            }
            list = null;
            this.f135128g = list;
            return this;
        }

        public final a s() {
            String str = this.f135125d;
            String str2 = null;
            this.f135125d = str != null ? new C15850p("[\"<>^`{|}]").j(str, "") : null;
            int size = this.f135127f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<String> list = this.f135127f;
                list.set(i10, b.b(C15803v.f135109k, list.get(i10), 0, 0, "[]", true, true, false, false, (Charset) null, 227, (Object) null));
            }
            List<String> list2 = this.f135128g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str3 = list2.get(i11);
                    list2.set(i11, str3 != null ? b.b(C15803v.f135109k, str3, 0, 0, "\\^`{|}", true, true, true, false, (Charset) null, 195, (Object) null) : null);
                }
            }
            String str4 = this.f135129h;
            if (str4 != null) {
                str2 = b.b(C15803v.f135109k, str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, (Charset) null, 163, (Object) null);
            }
            this.f135129h = str2;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
            if (r1 != r4.c(r3)) goto L_0x0085;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f135122a
                if (r1 == 0) goto L_0x0012
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L_0x0017
            L_0x0012:
                java.lang.String r1 = "//"
                r0.append(r1)
            L_0x0017:
                java.lang.String r1 = r6.f135123b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L_0x0022
                goto L_0x002a
            L_0x0022:
                java.lang.String r1 = r6.f135124c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0044
            L_0x002a:
                java.lang.String r1 = r6.f135123b
                r0.append(r1)
                java.lang.String r1 = r6.f135124c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x003f
                r0.append(r2)
                java.lang.String r1 = r6.f135124c
                r0.append(r1)
            L_0x003f:
                r1 = 64
                r0.append(r1)
            L_0x0044:
                java.lang.String r1 = r6.f135125d
                if (r1 == 0) goto L_0x0069
                kotlin.jvm.internal.C17542s.g(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = HJ.C15854t.c0(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L_0x0064
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f135125d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0069
            L_0x0064:
                java.lang.String r1 = r6.f135125d
                r0.append(r1)
            L_0x0069:
                int r1 = r6.f135126e
                r3 = -1
                if (r1 != r3) goto L_0x0072
                java.lang.String r1 = r6.f135122a
                if (r1 == 0) goto L_0x008b
            L_0x0072:
                int r1 = r6.f()
                java.lang.String r3 = r6.f135122a
                if (r3 == 0) goto L_0x0085
                GK.v$b r4 = GK.C15803v.f135109k
                kotlin.jvm.internal.C17542s.g(r3)
                int r3 = r4.c(r3)
                if (r1 == r3) goto L_0x008b
            L_0x0085:
                r0.append(r2)
                r0.append(r1)
            L_0x008b:
                GK.v$b r1 = GK.C15803v.f135109k
                java.util.List<java.lang.String> r2 = r6.f135127f
                r1.i(r2, r0)
                java.util.List<java.lang.String> r2 = r6.f135128g
                if (r2 == 0) goto L_0x00a3
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.f135128g
                kotlin.jvm.internal.C17542s.g(r2)
                r1.k(r2, r0)
            L_0x00a3:
                java.lang.String r1 = r6.f135129h
                if (r1 == 0) goto L_0x00b1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f135129h
                r0.append(r1)
            L_0x00b1:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.C17542s.i(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: GK.C15803v.a.toString():java.lang.String");
        }

        public final a u(String str) {
            C17542s.j(str, "scheme");
            if (C15854t.H(str, "http", true)) {
                this.f135122a = "http";
            } else if (C15854t.H(str, Constants.SCHEME, true)) {
                this.f135122a = Constants.SCHEME;
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public final void v(String str) {
            this.f135129h = str;
        }

        public final void w(String str) {
            C17542s.j(str, "<set-?>");
            this.f135124c = str;
        }

        public final void x(String str) {
            C17542s.j(str, "<set-?>");
            this.f135123b = str;
        }

        public final void y(String str) {
            this.f135125d = str;
        }

        public final void z(int i10) {
            this.f135126e = i10;
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0019\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J]\u0010\u0018\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\f*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001d2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0000¢\u0006\u0004\b#\u0010\"J\u001b\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050$*\u00020\u0005H\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020'*\u00020\u0005H\u0007¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u0004\u0018\u00010'*\u00020\u0005H\u0007¢\u0006\u0004\b*\u0010)J1\u0010+\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b+\u0010,Jc\u0010-\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b1\u00100R\u0014\u00102\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00104\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b6\u00100R\u0014\u00107\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b7\u00100R\u0014\u00108\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b8\u00100R\u0014\u00109\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b9\u00100R\u0014\u0010:\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b:\u00100R\u0014\u0010;\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b;\u00100R\u0014\u0010<\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b<\u00100R\u0014\u0010=\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b=\u00100¨\u0006>"}, d2 = {"LGK/v$b;", "", "<init>", "()V", "LWK/e;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "LXH/N;", "m", "(LWK/e;Ljava/lang/String;IIZ)V", "e", "(Ljava/lang/String;II)Z", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "l", "(LWK/e;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)V", "scheme", "c", "(Ljava/lang/String;)I", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "i", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "k", "", "j", "(Ljava/lang/String;)Ljava/util/List;", "LGK/v;", "d", "(Ljava/lang/String;)LGK/v;", "f", "g", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "a", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.v$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            int i13 = i12;
            return bVar.a(str, (i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? str.length() : i11, str2, (i13 & 8) != 0 ? false : z10, (i13 & 16) != 0 ? false : z11, (i13 & 32) != 0 ? false : z12, (i13 & 64) != 0 ? false : z13, (i13 & 128) != 0 ? null : charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && C15864d.I(str.charAt(i10 + 1)) != -1 && C15864d.I(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String h(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.g(str, i10, i11, z10);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
            if (e(r1, r5, r2) == false) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void l(WK.C16770e r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00bc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x0028
                r8 = 9
                if (r7 == r8) goto L_0x0023
                r8 = 10
                if (r7 == r8) goto L_0x0023
                r8 = 12
                if (r7 == r8) goto L_0x0023
                r8 = 13
                if (r7 != r8) goto L_0x0028
            L_0x0023:
                r8 = r14
                r12 = r19
                goto L_0x00b5
            L_0x0028:
                r8 = 43
                if (r7 != r8) goto L_0x0039
                if (r22 == 0) goto L_0x0039
                if (r20 == 0) goto L_0x0033
                java.lang.String r8 = "+"
                goto L_0x0035
            L_0x0033:
                java.lang.String r8 = "%2B"
            L_0x0035:
                r15.D0(r8)
                goto L_0x0023
            L_0x0039:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x004a
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x004a
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x004e
                if (r23 == 0) goto L_0x004a
                goto L_0x004e
            L_0x004a:
                r8 = r14
                r12 = r19
                goto L_0x006f
            L_0x004e:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = HJ.C15854t.c0(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L_0x0069
                if (r7 != r9) goto L_0x0067
                if (r20 == 0) goto L_0x0069
                if (r21 == 0) goto L_0x0067
                r8 = r14
                boolean r10 = r14.e(r1, r5, r2)
                if (r10 != 0) goto L_0x006b
                goto L_0x006f
            L_0x0067:
                r8 = r14
                goto L_0x006b
            L_0x0069:
                r8 = r14
                goto L_0x006f
            L_0x006b:
                r15.N1(r7)
                goto L_0x00b5
            L_0x006f:
                if (r6 != 0) goto L_0x0076
                WK.e r6 = new WK.e
                r6.<init>()
            L_0x0076:
                if (r3 == 0) goto L_0x008a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.C17542s.e(r3, r10)
                if (r10 == 0) goto L_0x0081
                goto L_0x008a
            L_0x0081:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.k1(r1, r5, r10, r3)
                goto L_0x008d
            L_0x008a:
                r6.N1(r7)
            L_0x008d:
                boolean r10 = r6.Y1()
                if (r10 != 0) goto L_0x00b5
                byte r10 = r6.readByte()
                r11 = r10 & 255(0xff, float:3.57E-43)
                r15.Z1(r9)
                char[] r13 = GK.C15803v.f135110l
                int r11 = r11 >> 4
                r11 = r11 & 15
                char r11 = r13[r11]
                r15.Z1(r11)
                char[] r11 = GK.C15803v.f135110l
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.Z1(r10)
                goto L_0x008d
            L_0x00b5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00bc:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: GK.C15803v.b.l(WK.e, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void m(C16770e eVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int codePointAt = str.codePointAt(i10);
                if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int I10 = C15864d.I(str.charAt(i10 + 1));
                    int I11 = C15864d.I(str.charAt(i12));
                    if (!(I10 == -1 || I11 == -1)) {
                        eVar.Z1((I10 << 4) + I11);
                        i10 = Character.charCount(codePointAt) + i12;
                    }
                } else if (codePointAt == 43 && z10) {
                    eVar.Z1(32);
                    i10++;
                }
                eVar.N1(codePointAt);
                i10 += Character.charCount(codePointAt);
            }
        }

        public final String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            String str3 = str;
            int i12 = i11;
            String str4 = str2;
            C17542s.j(str, "<this>");
            C17542s.j(str4, "encodeSet");
            int i13 = i10;
            while (i13 < i12) {
                int codePointAt = str.codePointAt(i13);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z13) && !C15854t.c0(str4, (char) codePointAt, false, 2, (Object) null))) {
                    if (codePointAt == 37) {
                        if (z10) {
                            if (z11) {
                                if (!e(str, i13, i12)) {
                                    C16770e eVar = new C16770e();
                                    int i14 = i10;
                                    eVar.M0(str, i10, i13);
                                    l(eVar, str, i13, i11, str2, z10, z11, z12, z13, charset);
                                    return eVar.l0();
                                }
                                if (codePointAt == 43 || !z12) {
                                    i13 += Character.charCount(codePointAt);
                                } else {
                                    C16770e eVar2 = new C16770e();
                                    int i142 = i10;
                                    eVar2.M0(str, i10, i13);
                                    l(eVar2, str, i13, i11, str2, z10, z11, z12, z13, charset);
                                    return eVar2.l0();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i13 += Character.charCount(codePointAt);
                }
                C16770e eVar22 = new C16770e();
                int i1422 = i10;
                eVar22.M0(str, i10, i13);
                l(eVar22, str, i13, i11, str2, z10, z11, z12, z13, charset);
                return eVar22.l0();
            }
            int i15 = i10;
            String substring = str.substring(i10, i11);
            C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final int c(String str) {
            C17542s.j(str, "scheme");
            if (C17542s.e(str, "http")) {
                return 80;
            }
            return C17542s.e(str, Constants.SCHEME) ? 443 : -1;
        }

        public final C15803v d(String str) {
            C17542s.j(str, "<this>");
            return new a().m((C15803v) null, str).e();
        }

        public final C15803v f(String str) {
            C17542s.j(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i10, int i11, boolean z10) {
            C17542s.j(str, "<this>");
            for (int i12 = i10; i12 < i11; i12++) {
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    C16770e eVar = new C16770e();
                    eVar.M0(str, i10, i12);
                    m(eVar, str, i12, i11, z10);
                    return eVar.l0();
                }
            }
            String substring = str.substring(i10, i11);
            C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void i(List<String> list, StringBuilder sb2) {
            C17542s.j(list, "<this>");
            C17542s.j(sb2, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append(list.get(i10));
            }
        }

        public final List<String> j(String str) {
            C17542s.j(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int r02 = C15854t.r0(str, '&', i10, false, 4, (Object) null);
                if (r02 == -1) {
                    r02 = str.length();
                }
                int i11 = r02;
                int r03 = C15854t.r0(str, '=', i10, false, 4, (Object) null);
                if (r03 == -1 || r03 > i11) {
                    String substring = str.substring(i10, i11);
                    C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add((Object) null);
                } else {
                    String substring2 = str.substring(i10, r03);
                    C17542s.i(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = str.substring(r03 + 1, i11);
                    C17542s.i(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void k(List<String> list, StringBuilder sb2) {
            C17542s.j(list, "<this>");
            C17542s.j(sb2, "out");
            C17972h v10 = C17978n.v(C17978n.w(0, list.size()), 2);
            int p10 = v10.p();
            int q10 = v10.q();
            int s10 = v10.s();
            if ((s10 > 0 && p10 <= q10) || (s10 < 0 && q10 <= p10)) {
                while (true) {
                    String str = list.get(p10);
                    String str2 = list.get(p10 + 1);
                    if (p10 > 0) {
                        sb2.append('&');
                    }
                    sb2.append(str);
                    if (str2 != null) {
                        sb2.append('=');
                        sb2.append(str2);
                    }
                    if (p10 != q10) {
                        p10 += s10;
                    } else {
                        return;
                    }
                }
            }
        }

        private b() {
        }
    }

    public C15803v(String str, String str2, String str3, String str4, int i10, List<String> list, List<String> list2, String str5, String str6) {
        C17542s.j(str, "scheme");
        C17542s.j(str2, "username");
        C17542s.j(str3, "password");
        C17542s.j(str4, "host");
        C17542s.j(list, "pathSegments");
        C17542s.j(str6, "url");
        this.f135111a = str;
        this.f135112b = str2;
        this.f135113c = str3;
        this.f135114d = str4;
        this.f135115e = i10;
        this.f135116f = list;
        this.f135117g = list2;
        this.f135118h = str5;
        this.f135119i = str6;
        this.f135120j = C17542s.e(str, Constants.SCHEME);
    }

    public static final C15803v h(String str) {
        return f135109k.d(str);
    }

    public static final C15803v m(String str) {
        return f135109k.f(str);
    }

    public final String b() {
        if (this.f135118h == null) {
            return null;
        }
        String substring = this.f135119i.substring(C15854t.r0(this.f135119i, '#', 0, false, 6, (Object) null) + 1);
        C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String c() {
        if (this.f135113c.length() == 0) {
            return "";
        }
        int r02 = C15854t.r0(this.f135119i, '@', 0, false, 6, (Object) null);
        String substring = this.f135119i.substring(C15854t.r0(this.f135119i, ':', this.f135111a.length() + 3, false, 4, (Object) null) + 1, r02);
        C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String d() {
        int r02 = C15854t.r0(this.f135119i, '/', this.f135111a.length() + 3, false, 4, (Object) null);
        String str = this.f135119i;
        String substring = this.f135119i.substring(r02, C15864d.q(str, "?#", r02, str.length()));
        C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> e() {
        int r02 = C15854t.r0(this.f135119i, '/', this.f135111a.length() + 3, false, 4, (Object) null);
        String str = this.f135119i;
        int q10 = C15864d.q(str, "?#", r02, str.length());
        ArrayList arrayList = new ArrayList();
        while (r02 < q10) {
            int i10 = r02 + 1;
            int p10 = C15864d.p(this.f135119i, '/', i10, q10);
            String substring = this.f135119i.substring(i10, p10);
            C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            r02 = p10;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15803v) && C17542s.e(((C15803v) obj).f135119i, this.f135119i);
    }

    public final String f() {
        if (this.f135117g == null) {
            return null;
        }
        int r02 = C15854t.r0(this.f135119i, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f135119i;
        String substring = this.f135119i.substring(r02, C15864d.p(str, '#', r02, str.length()));
        C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String g() {
        if (this.f135112b.length() == 0) {
            return "";
        }
        int length = this.f135111a.length() + 3;
        String str = this.f135119i;
        String substring = this.f135119i.substring(length, C15864d.q(str, ":@", length, str.length()));
        C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public int hashCode() {
        return this.f135119i.hashCode();
    }

    public final String i() {
        return this.f135114d;
    }

    public final boolean j() {
        return this.f135120j;
    }

    public final a k() {
        a aVar = new a();
        aVar.A(this.f135111a);
        aVar.x(g());
        aVar.w(c());
        aVar.y(this.f135114d);
        aVar.z(this.f135115e != f135109k.c(this.f135111a) ? this.f135115e : -1);
        aVar.i().clear();
        aVar.i().addAll(e());
        aVar.g(f());
        aVar.v(b());
        return aVar;
    }

    public final a l(String str) {
        C17542s.j(str, "link");
        try {
            return new a().m(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List<String> n() {
        return this.f135116f;
    }

    public final int o() {
        return this.f135115e;
    }

    public final String p() {
        if (this.f135117g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f135109k.k(this.f135117g, sb2);
        return sb2.toString();
    }

    public final int q() {
        List<String> list = this.f135117g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String r() {
        a l10 = l("/...");
        C17542s.g(l10);
        return l10.B("").n("").e().toString();
    }

    public final C15803v s(String str) {
        C17542s.j(str, "link");
        a l10 = l(str);
        if (l10 != null) {
            return l10.e();
        }
        return null;
    }

    public final String t() {
        return this.f135111a;
    }

    public String toString() {
        return this.f135119i;
    }

    public final URI u() {
        String aVar = k().s().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new C15850p("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").j(aVar, ""));
                C17542s.i(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL v() {
        try {
            return new URL(this.f135119i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }
}
