package q3;

import android.media.AudioAttributes;
import t3.N;

/* renamed from: q3.c  reason: case insensitive filesystem */
public final class C5792c {

    /* renamed from: g  reason: collision with root package name */
    public static final C5792c f28108g = new e().a();

    /* renamed from: h  reason: collision with root package name */
    private static final String f28109h = N.A0(0);

    /* renamed from: i  reason: collision with root package name */
    private static final String f28110i = N.A0(1);

    /* renamed from: j  reason: collision with root package name */
    private static final String f28111j = N.A0(2);

    /* renamed from: k  reason: collision with root package name */
    private static final String f28112k = N.A0(3);

    /* renamed from: l  reason: collision with root package name */
    private static final String f28113l = N.A0(4);

    /* renamed from: a  reason: collision with root package name */
    public final int f28114a;

    /* renamed from: b  reason: collision with root package name */
    public final int f28115b;

    /* renamed from: c  reason: collision with root package name */
    public final int f28116c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28117d;

    /* renamed from: e  reason: collision with root package name */
    public final int f28118e;

    /* renamed from: f  reason: collision with root package name */
    private d f28119f;

    /* renamed from: q3.c$b */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            AudioAttributes.Builder unused = builder.setAllowedCapturePolicy(i10);
        }
    }

    /* renamed from: q3.c$c  reason: collision with other inner class name */
    private static final class C0448c {
        public static void a(AudioAttributes.Builder builder, int i10) {
            AudioAttributes.Builder unused = builder.setSpatializationBehavior(i10);
        }
    }

    /* renamed from: q3.c$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final AudioAttributes f28120a;

        private d(C5792c cVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(cVar.f28114a).setFlags(cVar.f28115b).setUsage(cVar.f28116c);
            int i10 = N.f29462a;
            if (i10 >= 29) {
                b.a(usage, cVar.f28117d);
            }
            if (i10 >= 32) {
                C0448c.a(usage, cVar.f28118e);
            }
            this.f28120a = usage.build();
        }
    }

    /* renamed from: q3.c$e */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private int f28121a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f28122b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f28123c = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f28124d = 1;

        /* renamed from: e  reason: collision with root package name */
        private int f28125e = 0;

        public C5792c a() {
            return new C5792c(this.f28121a, this.f28122b, this.f28123c, this.f28124d, this.f28125e);
        }
    }

    public d a() {
        if (this.f28119f == null) {
            this.f28119f = new d();
        }
        return this.f28119f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5792c.class != obj.getClass()) {
            return false;
        }
        C5792c cVar = (C5792c) obj;
        return this.f28114a == cVar.f28114a && this.f28115b == cVar.f28115b && this.f28116c == cVar.f28116c && this.f28117d == cVar.f28117d && this.f28118e == cVar.f28118e;
    }

    public int hashCode() {
        return ((((((((527 + this.f28114a) * 31) + this.f28115b) * 31) + this.f28116c) * 31) + this.f28117d) * 31) + this.f28118e;
    }

    private C5792c(int i10, int i11, int i12, int i13, int i14) {
        this.f28114a = i10;
        this.f28115b = i11;
        this.f28116c = i12;
        this.f28117d = i13;
        this.f28118e = i14;
    }
}
