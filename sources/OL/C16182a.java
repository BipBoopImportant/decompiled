package OL;

import NL.C16126a;
import NL.C16127b;
import NL.f;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: OL.a  reason: case insensitive filesystem */
public class C16182a implements f, C16127b<C16182a> {

    /* renamed from: n  reason: collision with root package name */
    private static final Pattern f137124n = Pattern.compile("\\s{2,}");

    /* renamed from: a  reason: collision with root package name */
    private Locale f137125a;

    /* renamed from: b  reason: collision with root package name */
    private String f137126b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f137127c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f137128d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f137129e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f137130f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f137131g = "";

    /* renamed from: h  reason: collision with root package name */
    private String f137132h = "";

    /* renamed from: i  reason: collision with root package name */
    private String f137133i = "";

    /* renamed from: j  reason: collision with root package name */
    private String f137134j = "";

    /* renamed from: k  reason: collision with root package name */
    private String f137135k = "";

    /* renamed from: l  reason: collision with root package name */
    private String f137136l = "";

    /* renamed from: m  reason: collision with root package name */
    private int f137137m = 50;

    private String d(String str, String str2, long j10) {
        String replace = h(j10).replace("%s", str);
        Locale locale = this.f137125a;
        return replace.replace("%n", locale != null ? String.format(locale, "%d", new Object[]{Long.valueOf(j10)}) : String.format("%d", new Object[]{Long.valueOf(j10)})).replace("%u", str2);
    }

    private String e(C16126a aVar, boolean z10) {
        return d(k(aVar), f(aVar, z10), j(aVar, z10));
    }

    private String i(C16126a aVar) {
        return (!aVar.b() || this.f137129e == null || this.f137128d.length() <= 0) ? (!aVar.d() || this.f137131g == null || this.f137130f.length() <= 0) ? this.f137127c : this.f137131g : this.f137129e;
    }

    private String k(C16126a aVar) {
        return aVar.e() < 0 ? "-" : "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r2 = r1.f137130f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String l(NL.C16126a r2) {
        /*
            r1 = this;
            boolean r0 = r2.b()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r1.f137128d
            if (r0 == 0) goto L_0x0013
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0013
            java.lang.String r2 = r1.f137128d
            return r2
        L_0x0013:
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x0026
            java.lang.String r2 = r1.f137130f
            if (r2 == 0) goto L_0x0026
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0026
            java.lang.String r2 = r1.f137130f
            return r2
        L_0x0026:
            java.lang.String r2 = r1.f137126b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: OL.C16182a.l(NL.a):java.lang.String");
    }

    public String a(C16126a aVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (aVar.d()) {
            sb2.append(this.f137135k);
            sb2.append(" ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(this.f137136l);
        } else {
            sb2.append(this.f137133i);
            sb2.append(" ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(this.f137134j);
        }
        return f137124n.matcher(sb2).replaceAll(" ").trim();
    }

    public String c(C16126a aVar) {
        return e(aVar, true);
    }

    /* access modifiers changed from: protected */
    public String f(C16126a aVar, boolean z10) {
        return m(aVar, z10) ? i(aVar) : l(aVar);
    }

    public String g() {
        return this.f137132h;
    }

    /* access modifiers changed from: protected */
    public String h(long j10) {
        return this.f137132h;
    }

    /* access modifiers changed from: protected */
    public long j(C16126a aVar, boolean z10) {
        return Math.abs(z10 ? aVar.c(this.f137137m) : aVar.e());
    }

    /* access modifiers changed from: protected */
    public boolean m(C16126a aVar, boolean z10) {
        long abs = Math.abs(j(aVar, z10));
        return abs == 0 || abs > 1;
    }

    public C16182a n(String str) {
        this.f137129e = str;
        return this;
    }

    public C16182a o(String str) {
        this.f137133i = str.trim();
        return this;
    }

    public C16182a p(String str) {
        this.f137128d = str;
        return this;
    }

    public C16182a q(String str) {
        this.f137134j = str.trim();
        return this;
    }

    /* renamed from: r */
    public C16182a b(Locale locale) {
        this.f137125a = locale;
        return this;
    }

    public C16182a s(String str) {
        this.f137131g = str;
        return this;
    }

    public C16182a t(String str) {
        this.f137135k = str.trim();
        return this;
    }

    public String toString() {
        return "SimpleTimeFormat [pattern=" + this.f137132h + ", futurePrefix=" + this.f137133i + ", futureSuffix=" + this.f137134j + ", pastPrefix=" + this.f137135k + ", pastSuffix=" + this.f137136l + ", roundingTolerance=" + this.f137137m + "]";
    }

    public C16182a u(String str) {
        this.f137130f = str;
        return this;
    }

    public C16182a v(String str) {
        this.f137136l = str.trim();
        return this;
    }

    public C16182a w(String str) {
        this.f137132h = str;
        return this;
    }

    public C16182a x(String str) {
        this.f137127c = str;
        return this;
    }

    public C16182a y(String str) {
        this.f137126b = str;
        return this;
    }
}
