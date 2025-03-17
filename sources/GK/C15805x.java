package GK;

import HJ.C15854t;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import gI.C17269c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001\u001aB/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"LGK/x;", "", "", "mediaType", "type", "subtype", "", "parameterNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "Ljava/nio/charset/Charset;", "defaultValue", "c", "(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "name", "f", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "b", "g", "d", "[Ljava/lang/String;", "e", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.x  reason: case insensitive filesystem */
public final class C15805x {

    /* renamed from: e  reason: collision with root package name */
    public static final a f135130e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f135131f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f135132g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a  reason: collision with root package name */
    private final String f135133a;

    /* renamed from: b  reason: collision with root package name */
    private final String f135134b;

    /* renamed from: c  reason: collision with root package name */
    private final String f135135c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f135136d;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007R\u001c\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0010\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"LGK/x$a;", "", "<init>", "()V", "", "LGK/x;", "a", "(Ljava/lang/String;)LGK/x;", "b", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.x$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C15805x a(String str) {
            C17542s.j(str, "<this>");
            Matcher matcher = C15805x.f135131f.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                C17542s.i(group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
                String lowerCase = group.toLowerCase(locale);
                C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                C17542s.i(group2, "typeSubtype.group(2)");
                C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
                String lowerCase2 = group2.toLowerCase(locale);
                C17542s.i(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = C15805x.f135132g.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = matcher2.group(3);
                            } else if (C15854t.W(group4, "'", false, 2, (Object) null) && C15854t.G(group4, "'", false, 2, (Object) null) && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                C17542s.i(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        C17542s.i(substring, "this as java.lang.String).substring(startIndex)");
                        sb2.append(substring);
                        sb2.append("\" for: \"");
                        sb2.append(str);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                }
                return new C15805x(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]), (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public final C15805x b(String str) {
            C17542s.j(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ C15805x(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset d(C15805x xVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return xVar.c(charset);
    }

    public static final C15805x e(String str) {
        return f135130e.a(str);
    }

    public final Charset c(Charset charset) {
        String f10 = f("charset");
        if (f10 == null) {
            return charset;
        }
        try {
            return Charset.forName(f10);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C15805x) && C17542s.e(((C15805x) obj).f135133a, this.f135133a);
    }

    public final String f(String str) {
        C17542s.j(str, "name");
        int i10 = 0;
        int c10 = C17269c.c(0, this.f135136d.length - 1, 2);
        if (c10 < 0) {
            return null;
        }
        while (!C15854t.H(this.f135136d[i10], str, true)) {
            if (i10 == c10) {
                return null;
            }
            i10 += 2;
        }
        return this.f135136d[i10 + 1];
    }

    public final String g() {
        return this.f135134b;
    }

    public int hashCode() {
        return this.f135133a.hashCode();
    }

    public String toString() {
        return this.f135133a;
    }

    private C15805x(String str, String str2, String str3, String[] strArr) {
        this.f135133a = str;
        this.f135134b = str2;
        this.f135135c = str3;
        this.f135136d = strArr;
    }
}
