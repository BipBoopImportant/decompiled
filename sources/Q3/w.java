package q3;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kb.C9967v;
import kb.C9968w;
import t3.C5950a;
import t3.N;

public final class w {

    /* renamed from: i  reason: collision with root package name */
    public static final w f28311i = new c().a();

    /* renamed from: j  reason: collision with root package name */
    private static final String f28312j = N.A0(0);

    /* renamed from: k  reason: collision with root package name */
    private static final String f28313k = N.A0(1);

    /* renamed from: l  reason: collision with root package name */
    private static final String f28314l = N.A0(2);

    /* renamed from: m  reason: collision with root package name */
    private static final String f28315m = N.A0(3);

    /* renamed from: n  reason: collision with root package name */
    private static final String f28316n = N.A0(4);

    /* renamed from: o  reason: collision with root package name */
    private static final String f28317o = N.A0(5);

    /* renamed from: a  reason: collision with root package name */
    public final String f28318a;

    /* renamed from: b  reason: collision with root package name */
    public final h f28319b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final h f28320c;

    /* renamed from: d  reason: collision with root package name */
    public final g f28321d;

    /* renamed from: e  reason: collision with root package name */
    public final y f28322e;

    /* renamed from: f  reason: collision with root package name */
    public final d f28323f;
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public final e f28324g;

    /* renamed from: h  reason: collision with root package name */
    public final i f28325h;

    public static final class b {
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private String f28326a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f28327b;

        /* renamed from: c  reason: collision with root package name */
        private String f28328c;

        /* renamed from: d  reason: collision with root package name */
        private d.a f28329d;

        /* renamed from: e  reason: collision with root package name */
        private f.a f28330e;

        /* renamed from: f  reason: collision with root package name */
        private List<Object> f28331f;

        /* renamed from: g  reason: collision with root package name */
        private String f28332g;

        /* renamed from: h  reason: collision with root package name */
        private C9967v<k> f28333h;

        /* renamed from: i  reason: collision with root package name */
        private Object f28334i;

        /* renamed from: j  reason: collision with root package name */
        private long f28335j;

        /* renamed from: k  reason: collision with root package name */
        private y f28336k;

        /* renamed from: l  reason: collision with root package name */
        private g.a f28337l;

        /* renamed from: m  reason: collision with root package name */
        private i f28338m;

        public w a() {
            h hVar;
            C5950a.g(this.f28330e.f28380b == null || this.f28330e.f28379a != null);
            Uri uri = this.f28327b;
            f fVar = null;
            if (uri != null) {
                String str = this.f28328c;
                if (this.f28330e.f28379a != null) {
                    fVar = this.f28330e.i();
                }
                hVar = new h(uri, str, fVar, (b) null, this.f28331f, this.f28332g, this.f28333h, this.f28334i, this.f28335j);
            } else {
                hVar = null;
            }
            String str2 = this.f28326a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            e g10 = this.f28329d.g();
            g f10 = this.f28337l.f();
            y yVar = this.f28336k;
            if (yVar == null) {
                yVar = y.f28453I;
            }
            return new w(str3, g10, hVar, f10, yVar, this.f28338m);
        }

        public c b(g gVar) {
            this.f28337l = gVar.a();
            return this;
        }

        public c c(String str) {
            this.f28326a = (String) C5950a.e(str);
            return this;
        }

        public c d(List<k> list) {
            this.f28333h = C9967v.A(list);
            return this;
        }

        public c e(Object obj) {
            this.f28334i = obj;
            return this;
        }

        public c f(Uri uri) {
            this.f28327b = uri;
            return this;
        }

        public c g(String str) {
            return f(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f28329d = new d.a();
            this.f28330e = new f.a();
            this.f28331f = Collections.emptyList();
            this.f28333h = C9967v.E();
            this.f28337l = new g.a();
            this.f28338m = i.f28420d;
            this.f28335j = -9223372036854775807L;
        }

        private c(w wVar) {
            this();
            f.a aVar;
            this.f28329d = wVar.f28323f.a();
            this.f28326a = wVar.f28318a;
            this.f28336k = wVar.f28322e;
            this.f28337l = wVar.f28321d.a();
            this.f28338m = wVar.f28325h;
            h hVar = wVar.f28319b;
            if (hVar != null) {
                this.f28332g = hVar.f28415e;
                this.f28328c = hVar.f28412b;
                this.f28327b = hVar.f28411a;
                this.f28331f = hVar.f28414d;
                this.f28333h = hVar.f28416f;
                this.f28334i = hVar.f28418h;
                f fVar = hVar.f28413c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f28330e = aVar;
                this.f28335j = hVar.f28419i;
            }
        }
    }

    public static class d {

        /* renamed from: h  reason: collision with root package name */
        public static final d f28339h = new a().f();

        /* renamed from: i  reason: collision with root package name */
        private static final String f28340i = N.A0(0);

        /* renamed from: j  reason: collision with root package name */
        private static final String f28341j = N.A0(1);

        /* renamed from: k  reason: collision with root package name */
        private static final String f28342k = N.A0(2);

        /* renamed from: l  reason: collision with root package name */
        private static final String f28343l = N.A0(3);

        /* renamed from: m  reason: collision with root package name */
        private static final String f28344m = N.A0(4);

        /* renamed from: n  reason: collision with root package name */
        static final String f28345n = N.A0(5);

        /* renamed from: o  reason: collision with root package name */
        static final String f28346o = N.A0(6);

        /* renamed from: a  reason: collision with root package name */
        public final long f28347a;

        /* renamed from: b  reason: collision with root package name */
        public final long f28348b;

        /* renamed from: c  reason: collision with root package name */
        public final long f28349c;

        /* renamed from: d  reason: collision with root package name */
        public final long f28350d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f28351e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f28352f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f28353g;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public long f28354a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public long f28355b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public boolean f28356c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public boolean f28357d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public boolean f28358e;

            public d f() {
                return new d(this);
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a() {
                this.f28355b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f28354a = dVar.f28348b;
                this.f28355b = dVar.f28350d;
                this.f28356c = dVar.f28351e;
                this.f28357d = dVar.f28352f;
                this.f28358e = dVar.f28353g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f28348b == dVar.f28348b && this.f28350d == dVar.f28350d && this.f28351e == dVar.f28351e && this.f28352f == dVar.f28352f && this.f28353g == dVar.f28353g;
        }

        public int hashCode() {
            long j10 = this.f28348b;
            long j11 = this.f28350d;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f28351e ? 1 : 0)) * 31) + (this.f28352f ? 1 : 0)) * 31) + (this.f28353g ? 1 : 0);
        }

        private d(a aVar) {
            this.f28347a = N.q1(aVar.f28354a);
            this.f28349c = N.q1(aVar.f28355b);
            this.f28348b = aVar.f28354a;
            this.f28350d = aVar.f28355b;
            this.f28351e = aVar.f28356c;
            this.f28352f = aVar.f28357d;
            this.f28353g = aVar.f28358e;
        }
    }

    @Deprecated
    public static final class e extends d {

        /* renamed from: p  reason: collision with root package name */
        public static final e f28359p = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f {

        /* renamed from: l  reason: collision with root package name */
        private static final String f28360l = N.A0(0);

        /* renamed from: m  reason: collision with root package name */
        private static final String f28361m = N.A0(1);

        /* renamed from: n  reason: collision with root package name */
        private static final String f28362n = N.A0(2);

        /* renamed from: o  reason: collision with root package name */
        private static final String f28363o = N.A0(3);

        /* renamed from: p  reason: collision with root package name */
        static final String f28364p = N.A0(4);

        /* renamed from: q  reason: collision with root package name */
        private static final String f28365q = N.A0(5);

        /* renamed from: r  reason: collision with root package name */
        private static final String f28366r = N.A0(6);

        /* renamed from: s  reason: collision with root package name */
        private static final String f28367s = N.A0(7);

        /* renamed from: a  reason: collision with root package name */
        public final UUID f28368a;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public final UUID f28369b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f28370c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public final C9968w<String, String> f28371d;

        /* renamed from: e  reason: collision with root package name */
        public final C9968w<String, String> f28372e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f28373f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f28374g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f28375h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public final C9967v<Integer> f28376i;

        /* renamed from: j  reason: collision with root package name */
        public final C9967v<Integer> f28377j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public final byte[] f28378k;

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f28378k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f28368a.equals(fVar.f28368a) && N.d(this.f28370c, fVar.f28370c) && N.d(this.f28372e, fVar.f28372e) && this.f28373f == fVar.f28373f && this.f28375h == fVar.f28375h && this.f28374g == fVar.f28374g && this.f28377j.equals(fVar.f28377j) && Arrays.equals(this.f28378k, fVar.f28378k);
        }

        public int hashCode() {
            int hashCode = this.f28368a.hashCode() * 31;
            Uri uri = this.f28370c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f28372e.hashCode()) * 31) + (this.f28373f ? 1 : 0)) * 31) + (this.f28375h ? 1 : 0)) * 31) + (this.f28374g ? 1 : 0)) * 31) + this.f28377j.hashCode()) * 31) + Arrays.hashCode(this.f28378k);
        }

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public UUID f28379a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public Uri f28380b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public C9968w<String, String> f28381c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public boolean f28382d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public boolean f28383e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public boolean f28384f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public C9967v<Integer> f28385g;
            /* access modifiers changed from: private */

            /* renamed from: h  reason: collision with root package name */
            public byte[] f28386h;

            public f i() {
                return new f(this);
            }

            @Deprecated
            private a() {
                this.f28381c = C9968w.n();
                this.f28383e = true;
                this.f28385g = C9967v.E();
            }

            private a(f fVar) {
                this.f28379a = fVar.f28368a;
                this.f28380b = fVar.f28370c;
                this.f28381c = fVar.f28372e;
                this.f28382d = fVar.f28373f;
                this.f28383e = fVar.f28374g;
                this.f28384f = fVar.f28375h;
                this.f28385g = fVar.f28377j;
                this.f28386h = fVar.f28378k;
            }
        }

        private f(a aVar) {
            C5950a.g(!aVar.f28384f || aVar.f28380b != null);
            UUID uuid = (UUID) C5950a.e(aVar.f28379a);
            this.f28368a = uuid;
            this.f28369b = uuid;
            this.f28370c = aVar.f28380b;
            this.f28371d = aVar.f28381c;
            this.f28372e = aVar.f28381c;
            this.f28373f = aVar.f28382d;
            this.f28375h = aVar.f28384f;
            this.f28374g = aVar.f28383e;
            this.f28376i = aVar.f28385g;
            this.f28377j = aVar.f28385g;
            this.f28378k = aVar.f28386h != null ? Arrays.copyOf(aVar.f28386h, aVar.f28386h.length) : null;
        }
    }

    public static final class g {

        /* renamed from: f  reason: collision with root package name */
        public static final g f28387f = new a().f();

        /* renamed from: g  reason: collision with root package name */
        private static final String f28388g = N.A0(0);

        /* renamed from: h  reason: collision with root package name */
        private static final String f28389h = N.A0(1);

        /* renamed from: i  reason: collision with root package name */
        private static final String f28390i = N.A0(2);

        /* renamed from: j  reason: collision with root package name */
        private static final String f28391j = N.A0(3);

        /* renamed from: k  reason: collision with root package name */
        private static final String f28392k = N.A0(4);

        /* renamed from: a  reason: collision with root package name */
        public final long f28393a;

        /* renamed from: b  reason: collision with root package name */
        public final long f28394b;

        /* renamed from: c  reason: collision with root package name */
        public final long f28395c;

        /* renamed from: d  reason: collision with root package name */
        public final float f28396d;

        /* renamed from: e  reason: collision with root package name */
        public final float f28397e;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public long f28398a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public long f28399b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public long f28400c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public float f28401d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public float f28402e;

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f28400c = j10;
                return this;
            }

            public a h(float f10) {
                this.f28402e = f10;
                return this;
            }

            public a i(long j10) {
                this.f28399b = j10;
                return this;
            }

            public a j(float f10) {
                this.f28401d = f10;
                return this;
            }

            public a k(long j10) {
                this.f28398a = j10;
                return this;
            }

            public a() {
                this.f28398a = -9223372036854775807L;
                this.f28399b = -9223372036854775807L;
                this.f28400c = -9223372036854775807L;
                this.f28401d = -3.4028235E38f;
                this.f28402e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f28398a = gVar.f28393a;
                this.f28399b = gVar.f28394b;
                this.f28400c = gVar.f28395c;
                this.f28401d = gVar.f28396d;
                this.f28402e = gVar.f28397e;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f28393a == gVar.f28393a && this.f28394b == gVar.f28394b && this.f28395c == gVar.f28395c && this.f28396d == gVar.f28396d && this.f28397e == gVar.f28397e;
        }

        public int hashCode() {
            long j10 = this.f28393a;
            long j11 = this.f28394b;
            long j12 = this.f28395c;
            int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f28396d;
            int i11 = 0;
            int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f28397e;
            if (f11 != 0.0f) {
                i11 = Float.floatToIntBits(f11);
            }
            return floatToIntBits + i11;
        }

        private g(a aVar) {
            this(aVar.f28398a, aVar.f28399b, aVar.f28400c, aVar.f28401d, aVar.f28402e);
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f28393a = j10;
            this.f28394b = j11;
            this.f28395c = j12;
            this.f28396d = f10;
            this.f28397e = f11;
        }
    }

    public static final class h {

        /* renamed from: j  reason: collision with root package name */
        private static final String f28403j = N.A0(0);

        /* renamed from: k  reason: collision with root package name */
        private static final String f28404k = N.A0(1);

        /* renamed from: l  reason: collision with root package name */
        private static final String f28405l = N.A0(2);

        /* renamed from: m  reason: collision with root package name */
        private static final String f28406m = N.A0(3);

        /* renamed from: n  reason: collision with root package name */
        private static final String f28407n = N.A0(4);

        /* renamed from: o  reason: collision with root package name */
        private static final String f28408o = N.A0(5);

        /* renamed from: p  reason: collision with root package name */
        private static final String f28409p = N.A0(6);

        /* renamed from: q  reason: collision with root package name */
        private static final String f28410q = N.A0(7);

        /* renamed from: a  reason: collision with root package name */
        public final Uri f28411a;

        /* renamed from: b  reason: collision with root package name */
        public final String f28412b;

        /* renamed from: c  reason: collision with root package name */
        public final f f28413c;

        /* renamed from: d  reason: collision with root package name */
        public final List<Object> f28414d;

        /* renamed from: e  reason: collision with root package name */
        public final String f28415e;

        /* renamed from: f  reason: collision with root package name */
        public final C9967v<k> f28416f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public final List<j> f28417g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f28418h;

        /* renamed from: i  reason: collision with root package name */
        public final long f28419i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f28411a.equals(hVar.f28411a) && N.d(this.f28412b, hVar.f28412b) && N.d(this.f28413c, hVar.f28413c) && N.d((Object) null, (Object) null) && this.f28414d.equals(hVar.f28414d) && N.d(this.f28415e, hVar.f28415e) && this.f28416f.equals(hVar.f28416f) && N.d(this.f28418h, hVar.f28418h) && N.d(Long.valueOf(this.f28419i), Long.valueOf(hVar.f28419i));
        }

        public int hashCode() {
            int hashCode = this.f28411a.hashCode() * 31;
            String str = this.f28412b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f28413c;
            int hashCode3 = (((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 961) + this.f28414d.hashCode()) * 31;
            String str2 = this.f28415e;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f28416f.hashCode()) * 31;
            Object obj = this.f28418h;
            if (obj != null) {
                i10 = obj.hashCode();
            }
            return (int) ((((long) (hashCode4 + i10)) * 31) + this.f28419i);
        }

        private h(Uri uri, String str, f fVar, b bVar, List<Object> list, String str2, C9967v<k> vVar, Object obj, long j10) {
            this.f28411a = uri;
            this.f28412b = A.r(str);
            this.f28413c = fVar;
            this.f28414d = list;
            this.f28415e = str2;
            this.f28416f = vVar;
            C9967v.a t10 = C9967v.t();
            for (int i10 = 0; i10 < vVar.size(); i10++) {
                t10.a(vVar.get(i10).a().i());
            }
            this.f28417g = t10.k();
            this.f28418h = obj;
            this.f28419i = j10;
        }
    }

    public static final class i {

        /* renamed from: d  reason: collision with root package name */
        public static final i f28420d = new a().d();

        /* renamed from: e  reason: collision with root package name */
        private static final String f28421e = N.A0(0);

        /* renamed from: f  reason: collision with root package name */
        private static final String f28422f = N.A0(1);

        /* renamed from: g  reason: collision with root package name */
        private static final String f28423g = N.A0(2);

        /* renamed from: a  reason: collision with root package name */
        public final Uri f28424a;

        /* renamed from: b  reason: collision with root package name */
        public final String f28425b;

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f28426c;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public Uri f28427a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f28428b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public Bundle f28429c;

            public i d() {
                return new i(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (N.d(this.f28424a, iVar.f28424a) && N.d(this.f28425b, iVar.f28425b)) {
                if ((this.f28426c == null) == (iVar.f28426c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f28424a;
            int i10 = 0;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f28425b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            if (this.f28426c != null) {
                i10 = 1;
            }
            return hashCode2 + i10;
        }

        private i(a aVar) {
            this.f28424a = aVar.f28427a;
            this.f28425b = aVar.f28428b;
            this.f28426c = aVar.f28429c;
        }
    }

    @Deprecated
    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    public static class k {

        /* renamed from: h  reason: collision with root package name */
        private static final String f28430h = N.A0(0);

        /* renamed from: i  reason: collision with root package name */
        private static final String f28431i = N.A0(1);

        /* renamed from: j  reason: collision with root package name */
        private static final String f28432j = N.A0(2);

        /* renamed from: k  reason: collision with root package name */
        private static final String f28433k = N.A0(3);

        /* renamed from: l  reason: collision with root package name */
        private static final String f28434l = N.A0(4);

        /* renamed from: m  reason: collision with root package name */
        private static final String f28435m = N.A0(5);

        /* renamed from: n  reason: collision with root package name */
        private static final String f28436n = N.A0(6);

        /* renamed from: a  reason: collision with root package name */
        public final Uri f28437a;

        /* renamed from: b  reason: collision with root package name */
        public final String f28438b;

        /* renamed from: c  reason: collision with root package name */
        public final String f28439c;

        /* renamed from: d  reason: collision with root package name */
        public final int f28440d;

        /* renamed from: e  reason: collision with root package name */
        public final int f28441e;

        /* renamed from: f  reason: collision with root package name */
        public final String f28442f;

        /* renamed from: g  reason: collision with root package name */
        public final String f28443g;

        public static final class a {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public Uri f28444a;
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public String f28445b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public String f28446c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public int f28447d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public int f28448e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public String f28449f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public String f28450g;

            /* access modifiers changed from: private */
            public j i() {
                return new j(this);
            }

            private a(k kVar) {
                this.f28444a = kVar.f28437a;
                this.f28445b = kVar.f28438b;
                this.f28446c = kVar.f28439c;
                this.f28447d = kVar.f28440d;
                this.f28448e = kVar.f28441e;
                this.f28449f = kVar.f28442f;
                this.f28450g = kVar.f28443g;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f28437a.equals(kVar.f28437a) && N.d(this.f28438b, kVar.f28438b) && N.d(this.f28439c, kVar.f28439c) && this.f28440d == kVar.f28440d && this.f28441e == kVar.f28441e && N.d(this.f28442f, kVar.f28442f) && N.d(this.f28443g, kVar.f28443g);
        }

        public int hashCode() {
            int hashCode = this.f28437a.hashCode() * 31;
            String str = this.f28438b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f28439c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f28440d) * 31) + this.f28441e) * 31;
            String str3 = this.f28442f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f28443g;
            if (str4 != null) {
                i10 = str4.hashCode();
            }
            return hashCode4 + i10;
        }

        private k(a aVar) {
            this.f28437a = aVar.f28444a;
            this.f28438b = aVar.f28445b;
            this.f28439c = aVar.f28446c;
            this.f28440d = aVar.f28447d;
            this.f28441e = aVar.f28448e;
            this.f28442f = aVar.f28449f;
            this.f28443g = aVar.f28450g;
        }
    }

    public static w b(Uri uri) {
        return new c().f(uri).a();
    }

    public static w c(String str) {
        return new c().g(str).a();
    }

    public c a() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return N.d(this.f28318a, wVar.f28318a) && this.f28323f.equals(wVar.f28323f) && N.d(this.f28319b, wVar.f28319b) && N.d(this.f28321d, wVar.f28321d) && N.d(this.f28322e, wVar.f28322e) && N.d(this.f28325h, wVar.f28325h);
    }

    public int hashCode() {
        int hashCode = this.f28318a.hashCode() * 31;
        h hVar = this.f28319b;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f28321d.hashCode()) * 31) + this.f28323f.hashCode()) * 31) + this.f28322e.hashCode()) * 31) + this.f28325h.hashCode();
    }

    private w(String str, e eVar, h hVar, g gVar, y yVar, i iVar) {
        this.f28318a = str;
        this.f28319b = hVar;
        this.f28320c = hVar;
        this.f28321d = gVar;
        this.f28322e = yVar;
        this.f28323f = eVar;
        this.f28324g = eVar;
        this.f28325h = iVar;
    }
}
