package w3;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import q3.x;
import t3.C5950a;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f31433a;

    /* renamed from: b  reason: collision with root package name */
    public final long f31434b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31435c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f31436d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f31437e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public final long f31438f;

    /* renamed from: g  reason: collision with root package name */
    public final long f31439g;

    /* renamed from: h  reason: collision with root package name */
    public final long f31440h;

    /* renamed from: i  reason: collision with root package name */
    public final String f31441i;

    /* renamed from: j  reason: collision with root package name */
    public final int f31442j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f31443k;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f31444a;

        /* renamed from: b  reason: collision with root package name */
        private long f31445b;

        /* renamed from: c  reason: collision with root package name */
        private int f31446c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f31447d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f31448e;

        /* renamed from: f  reason: collision with root package name */
        private long f31449f;

        /* renamed from: g  reason: collision with root package name */
        private long f31450g;

        /* renamed from: h  reason: collision with root package name */
        private String f31451h;

        /* renamed from: i  reason: collision with root package name */
        private int f31452i;

        /* renamed from: j  reason: collision with root package name */
        private Object f31453j;

        public k a() {
            C5950a.j(this.f31444a, "The uri must be set.");
            return new k(this.f31444a, this.f31445b, this.f31446c, this.f31447d, this.f31448e, this.f31449f, this.f31450g, this.f31451h, this.f31452i, this.f31453j);
        }

        public b b(int i10) {
            this.f31452i = i10;
            return this;
        }

        public b c(byte[] bArr) {
            this.f31447d = bArr;
            return this;
        }

        public b d(int i10) {
            this.f31446c = i10;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f31448e = map;
            return this;
        }

        public b f(String str) {
            this.f31451h = str;
            return this;
        }

        public b g(long j10) {
            this.f31450g = j10;
            return this;
        }

        public b h(long j10) {
            this.f31449f = j10;
            return this;
        }

        public b i(Uri uri) {
            this.f31444a = uri;
            return this;
        }

        public b j(String str) {
            this.f31444a = Uri.parse(str);
            return this;
        }

        public b k(long j10) {
            this.f31445b = j10;
            return this;
        }

        public b() {
            this.f31446c = 1;
            this.f31448e = Collections.emptyMap();
            this.f31450g = -1;
        }

        private b(k kVar) {
            this.f31444a = kVar.f31433a;
            this.f31445b = kVar.f31434b;
            this.f31446c = kVar.f31435c;
            this.f31447d = kVar.f31436d;
            this.f31448e = kVar.f31437e;
            this.f31449f = kVar.f31439g;
            this.f31450g = kVar.f31440h;
            this.f31451h = kVar.f31441i;
            this.f31452i = kVar.f31442j;
            this.f31453j = kVar.f31443k;
        }
    }

    static {
        x.a("media3.datasource");
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f31435c);
    }

    public boolean d(int i10) {
        return (this.f31442j & i10) == i10;
    }

    public k e(long j10, long j11) {
        if (j10 == 0 && this.f31440h == j11) {
            return this;
        }
        return new k(this.f31433a, this.f31434b, this.f31435c, this.f31436d, this.f31437e, this.f31439g + j10, j11, this.f31441i, this.f31442j, this.f31443k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.f31433a + ", " + this.f31439g + ", " + this.f31440h + ", " + this.f31441i + ", " + this.f31442j + "]";
    }

    private k(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        long j13 = j10;
        byte[] bArr2 = bArr;
        long j14 = j11;
        long j15 = j12;
        long j16 = j13 + j14;
        boolean z10 = false;
        C5950a.a(j16 >= 0);
        C5950a.a(j14 >= 0);
        C5950a.a((j15 > 0 || j15 == -1) ? true : z10);
        this.f31433a = (Uri) C5950a.e(uri);
        this.f31434b = j13;
        this.f31435c = i10;
        this.f31436d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f31437e = Collections.unmodifiableMap(new HashMap(map));
        this.f31439g = j14;
        this.f31438f = j16;
        this.f31440h = j15;
        this.f31441i = str;
        this.f31442j = i11;
        this.f31443k = obj;
    }
}
