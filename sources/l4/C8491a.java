package l4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.C8427k;
import k4.C8432p;
import s3.a;
import t3.B;
import t3.C5950a;
import t3.q;

/* renamed from: l4.a  reason: case insensitive filesystem */
public final class C8491a extends C8495e {

    /* renamed from: A  reason: collision with root package name */
    private static final int[] f54499A = {0, 4, 8, 12, 16, 20, 24, 28};
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f54500B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C  reason: collision with root package name */
    private static final int[] f54501C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, CheckoutActivity.RESULT_CANCELED, CheckoutActivity.RESULT_ERROR, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D  reason: collision with root package name */
    private static final int[] f54502D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E  reason: collision with root package name */
    private static final int[] f54503E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F  reason: collision with root package name */
    private static final int[] f54504F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G  reason: collision with root package name */
    private static final boolean[] f54505G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f54506z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: h  reason: collision with root package name */
    private final B f54507h = new B();

    /* renamed from: i  reason: collision with root package name */
    private final int f54508i;

    /* renamed from: j  reason: collision with root package name */
    private final int f54509j;

    /* renamed from: k  reason: collision with root package name */
    private final int f54510k;

    /* renamed from: l  reason: collision with root package name */
    private final long f54511l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayList<C0863a> f54512m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    private C0863a f54513n = new C0863a(0, 4);

    /* renamed from: o  reason: collision with root package name */
    private List<a> f54514o;

    /* renamed from: p  reason: collision with root package name */
    private List<a> f54515p;

    /* renamed from: q  reason: collision with root package name */
    private int f54516q;

    /* renamed from: r  reason: collision with root package name */
    private int f54517r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f54518s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f54519t;

    /* renamed from: u  reason: collision with root package name */
    private byte f54520u;

    /* renamed from: v  reason: collision with root package name */
    private byte f54521v;

    /* renamed from: w  reason: collision with root package name */
    private int f54522w = 0;

    /* renamed from: x  reason: collision with root package name */
    private boolean f54523x;

    /* renamed from: y  reason: collision with root package name */
    private long f54524y;

    /* renamed from: l4.a$a  reason: collision with other inner class name */
    private static final class C0863a {

        /* renamed from: a  reason: collision with root package name */
        private final List<C0864a> f54525a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<SpannableString> f54526b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final StringBuilder f54527c = new StringBuilder();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f54528d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f54529e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f54530f;

        /* renamed from: g  reason: collision with root package name */
        private int f54531g;

        /* renamed from: h  reason: collision with root package name */
        private int f54532h;

        /* renamed from: l4.a$a$a  reason: collision with other inner class name */
        private static class C0864a {

            /* renamed from: a  reason: collision with root package name */
            public final int f54533a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f54534b;

            /* renamed from: c  reason: collision with root package name */
            public int f54535c;

            public C0864a(int i10, boolean z10, int i11) {
                this.f54533a = i10;
                this.f54534b = z10;
                this.f54535c = i11;
            }
        }

        public C0863a(int i10, int i11) {
            j(i10);
            this.f54532h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f54527c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f54525a.size()) {
                C0864a aVar = this.f54525a.get(i14);
                boolean z11 = aVar.f54534b;
                int i16 = aVar.f54533a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = C8491a.f54500B[i16];
                    }
                    z10 = z12;
                }
                int i17 = aVar.f54535c;
                i14++;
                if (i17 != (i14 < this.f54525a.size() ? this.f54525a.get(i14).f54535c : length)) {
                    if (i10 != -1 && !z11) {
                        q(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        o(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        n(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (!(i10 == -1 || i10 == length)) {
                q(spannableStringBuilder, i10, length);
            }
            if (!(i11 == -1 || i11 == length)) {
                o(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                n(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
            }
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f54527c.length() < 32) {
                this.f54527c.append(c10);
            }
        }

        public void f() {
            int length = this.f54527c.length();
            if (length > 0) {
                this.f54527c.delete(length - 1, length);
                int size = this.f54525a.size() - 1;
                while (size >= 0) {
                    C0864a aVar = this.f54525a.get(size);
                    int i10 = aVar.f54535c;
                    if (i10 == length) {
                        aVar.f54535c = i10 - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        public a g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f54526b.size(); i11++) {
                spannableStringBuilder.append(this.f54526b.get(i11));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f54529e + this.f54530f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f54531g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f54531g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((((float) i12) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f54528d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f54531g == 1) {
                i14 -= this.f54532h - 1;
            }
            return new a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h((float) i14, 1).k(f10).l(i10).a();
        }

        public boolean i() {
            return this.f54525a.isEmpty() && this.f54526b.isEmpty() && this.f54527c.length() == 0;
        }

        public void j(int i10) {
            this.f54531g = i10;
            this.f54525a.clear();
            this.f54526b.clear();
            this.f54527c.setLength(0);
            this.f54528d = 15;
            this.f54529e = 0;
            this.f54530f = 0;
        }

        public void k() {
            this.f54526b.add(h());
            this.f54527c.setLength(0);
            this.f54525a.clear();
            int min = Math.min(this.f54532h, this.f54528d);
            while (this.f54526b.size() >= min) {
                this.f54526b.remove(0);
            }
        }

        public void l(int i10) {
            this.f54531g = i10;
        }

        public void m(int i10) {
            this.f54532h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f54525a.add(new C0864a(i10, z10, this.f54527c.length()));
        }
    }

    public C8491a(String str, int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            C5950a.a(j10 >= 16000);
            this.f54511l = j10 * 1000;
        } else {
            this.f54511l = -9223372036854775807L;
        }
        this.f54508i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f54510k = 0;
            this.f54509j = 0;
        } else if (i10 == 2) {
            this.f54510k = 1;
            this.f54509j = 0;
        } else if (i10 == 3) {
            this.f54510k = 0;
            this.f54509j = 1;
        } else if (i10 != 4) {
            q.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f54510k = 0;
            this.f54509j = 0;
        } else {
            this.f54510k = 1;
            this.f54509j = 1;
        }
        O(0);
        N();
        this.f54523x = true;
        this.f54524y = -9223372036854775807L;
    }

    private void A(byte b10, byte b11) {
        int i10 = f54506z[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f54513n.f54528d) {
            if (this.f54516q != 1 && !this.f54513n.i()) {
                C0863a aVar = new C0863a(this.f54516q, this.f54517r);
                this.f54513n = aVar;
                this.f54512m.add(aVar);
            }
            int unused = this.f54513n.f54528d = i10;
        }
        boolean z10 = false;
        boolean z11 = (b11 & 16) == 16;
        if ((b11 & 1) == 1) {
            z10 = true;
        }
        int i11 = (b11 >> 1) & 7;
        this.f54513n.p(z11 ? 8 : i11, z10);
        if (z11) {
            int unused2 = this.f54513n.f54529e = f54499A[i11];
        }
    }

    private static boolean B(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean C(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    private static boolean D(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean E(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean F(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean G(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean H(boolean z10, byte b10, byte b11) {
        if (!z10 || !G(b10)) {
            this.f54519t = false;
        } else if (this.f54519t && this.f54520u == b10 && this.f54521v == b11) {
            this.f54519t = false;
            return true;
        } else {
            this.f54519t = true;
            this.f54520u = b10;
            this.f54521v = b11;
        }
        return false;
    }

    private static boolean I(byte b10) {
        return (b10 & 246) == 20;
    }

    private static boolean J(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean K(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean L(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void M(byte b10, byte b11) {
        if (L(b10)) {
            this.f54523x = false;
        } else if (I(b10)) {
            if (!(b11 == 32 || b11 == 47)) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f54523x = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f54523x = true;
        }
    }

    private void N() {
        this.f54513n.j(this.f54516q);
        this.f54512m.clear();
        this.f54512m.add(this.f54513n);
    }

    private void O(int i10) {
        int i11 = this.f54516q;
        if (i11 != i10) {
            this.f54516q = i10;
            if (i10 == 3) {
                for (int i12 = 0; i12 < this.f54512m.size(); i12++) {
                    this.f54512m.get(i12).l(i10);
                }
                return;
            }
            N();
            if (i11 == 3 || i10 == 1 || i10 == 0) {
                this.f54514o = Collections.emptyList();
            }
        }
    }

    private void P(int i10) {
        this.f54517r = i10;
        this.f54513n.m(i10);
    }

    private boolean Q() {
        return (this.f54511l == -9223372036854775807L || this.f54524y == -9223372036854775807L || l() - this.f54524y < this.f54511l) ? false : true;
    }

    private boolean R(byte b10) {
        if (B(b10)) {
            this.f54522w = s(b10);
        }
        return this.f54522w == this.f54510k;
    }

    private static char r(byte b10) {
        return (char) f54501C[(b10 & Byte.MAX_VALUE) - 32];
    }

    private static int s(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<a> t() {
        int size = this.f54512m.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            a g10 = this.f54512m.get(i11).g(Integer.MIN_VALUE);
            arrayList.add(g10);
            if (g10 != null) {
                i10 = Math.min(i10, g10.f29049i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            a aVar = (a) arrayList.get(i12);
            if (aVar != null) {
                if (aVar.f29049i != i10) {
                    aVar = (a) C5950a.e(this.f54512m.get(i12).g(i10));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static char u(byte b10) {
        return (char) f54503E[b10 & 31];
    }

    private static char v(byte b10) {
        return (char) f54504F[b10 & 31];
    }

    private static char w(byte b10, byte b11) {
        return (b10 & 1) == 0 ? u(b11) : v(b11);
    }

    private static char x(byte b10) {
        return (char) f54502D[b10 & 15];
    }

    private void y(byte b10) {
        this.f54513n.e(' ');
        this.f54513n.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void z(byte b10) {
        if (b10 == 32) {
            O(2);
        } else if (b10 != 41) {
            switch (b10) {
                case 37:
                    O(1);
                    P(2);
                    return;
                case 38:
                    O(1);
                    P(3);
                    return;
                case 39:
                    O(1);
                    P(4);
                    return;
                default:
                    int i10 = this.f54516q;
                    if (i10 != 0) {
                        if (b10 != 33) {
                            switch (b10) {
                                case 44:
                                    this.f54514o = Collections.emptyList();
                                    int i11 = this.f54516q;
                                    if (i11 == 1 || i11 == 3) {
                                        N();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i10 == 1 && !this.f54513n.i()) {
                                        this.f54513n.k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    N();
                                    return;
                                case 47:
                                    this.f54514o = t();
                                    N();
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            this.f54513n.f();
                            return;
                        }
                    } else {
                        return;
                    }
            }
        } else {
            O(3);
        }
    }

    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    public void flush() {
        super.flush();
        this.f54514o = null;
        this.f54515p = null;
        O(0);
        P(4);
        N();
        this.f54518s = false;
        this.f54519t = false;
        this.f54520u = 0;
        this.f54521v = 0;
        this.f54522w = 0;
        this.f54523x = true;
        this.f54524y = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    public C8427k g() {
        List<a> list = this.f54514o;
        this.f54515p = list;
        return new f((List) C5950a.e(list));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0017 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(k4.C8432p r10) {
        /*
            r9 = this;
            java.nio.ByteBuffer r10 = r10.f32279d
            java.lang.Object r10 = t3.C5950a.e(r10)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            t3.B r0 = r9.f54507h
            byte[] r1 = r10.array()
            int r10 = r10.limit()
            r0.U(r1, r10)
            r10 = 0
            r0 = r10
        L_0x0017:
            t3.B r1 = r9.f54507h
            int r1 = r1.a()
            int r2 = r9.f54508i
            r3 = 1
            if (r1 < r2) goto L_0x00f5
            r1 = 2
            if (r2 != r1) goto L_0x0027
            r1 = -4
            goto L_0x002d
        L_0x0027:
            t3.B r1 = r9.f54507h
            int r1 = r1.H()
        L_0x002d:
            t3.B r2 = r9.f54507h
            int r2 = r2.H()
            t3.B r4 = r9.f54507h
            int r4 = r4.H()
            r5 = r1 & 2
            if (r5 == 0) goto L_0x003e
            goto L_0x0017
        L_0x003e:
            r5 = r1 & 1
            int r6 = r9.f54509j
            if (r5 == r6) goto L_0x0045
            goto L_0x0017
        L_0x0045:
            r5 = r2 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x0050
            if (r6 != 0) goto L_0x0050
            goto L_0x0017
        L_0x0050:
            boolean r7 = r9.f54518s
            r1 = r1 & 4
            r8 = 4
            if (r1 != r8) goto L_0x0063
            boolean[] r1 = f54505G
            boolean r2 = r1[r2]
            if (r2 == 0) goto L_0x0063
            boolean r1 = r1[r4]
            if (r1 == 0) goto L_0x0063
            r1 = r3
            goto L_0x0064
        L_0x0063:
            r1 = r10
        L_0x0064:
            r9.f54518s = r1
            boolean r1 = r9.H(r1, r5, r6)
            if (r1 == 0) goto L_0x006d
            goto L_0x0017
        L_0x006d:
            boolean r1 = r9.f54518s
            if (r1 != 0) goto L_0x0078
            if (r7 == 0) goto L_0x0017
            r9.N()
        L_0x0076:
            r0 = r3
            goto L_0x0017
        L_0x0078:
            r9.M(r5, r6)
            boolean r1 = r9.f54523x
            if (r1 != 0) goto L_0x0080
            goto L_0x0017
        L_0x0080:
            boolean r1 = r9.R(r5)
            if (r1 != 0) goto L_0x0087
            goto L_0x0017
        L_0x0087:
            boolean r0 = B(r5)
            if (r0 == 0) goto L_0x00de
            boolean r0 = J(r5, r6)
            if (r0 == 0) goto L_0x009d
            l4.a$a r0 = r9.f54513n
            char r1 = x(r6)
            r0.e(r1)
            goto L_0x0076
        L_0x009d:
            boolean r0 = C(r5, r6)
            if (r0 == 0) goto L_0x00b2
            l4.a$a r0 = r9.f54513n
            r0.f()
            l4.a$a r0 = r9.f54513n
            char r1 = w(r5, r6)
            r0.e(r1)
            goto L_0x0076
        L_0x00b2:
            boolean r0 = D(r5, r6)
            if (r0 == 0) goto L_0x00bc
            r9.y(r6)
            goto L_0x0076
        L_0x00bc:
            boolean r0 = F(r5, r6)
            if (r0 == 0) goto L_0x00c6
            r9.A(r5, r6)
            goto L_0x0076
        L_0x00c6:
            boolean r0 = K(r5, r6)
            if (r0 == 0) goto L_0x00d4
            l4.a$a r0 = r9.f54513n
            int r6 = r6 + -32
            int unused = r0.f54530f = r6
            goto L_0x0076
        L_0x00d4:
            boolean r0 = E(r5, r6)
            if (r0 == 0) goto L_0x0076
            r9.z(r6)
            goto L_0x0076
        L_0x00de:
            l4.a$a r0 = r9.f54513n
            char r1 = r(r5)
            r0.e(r1)
            r0 = r6 & 224(0xe0, float:3.14E-43)
            if (r0 == 0) goto L_0x0076
            l4.a$a r0 = r9.f54513n
            char r1 = r(r6)
            r0.e(r1)
            goto L_0x0076
        L_0x00f5:
            if (r0 == 0) goto L_0x010a
            int r10 = r9.f54516q
            if (r10 == r3) goto L_0x00fe
            r0 = 3
            if (r10 != r0) goto L_0x010a
        L_0x00fe:
            java.util.List r10 = r9.t()
            r9.f54514o = r10
            long r0 = r9.l()
            r9.f54524y = r0
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C8491a.h(k4.p):void");
    }

    public /* bridge */ /* synthetic */ C8432p i() {
        return super.e();
    }

    /* renamed from: j */
    public k4.q a() {
        k4.q k10;
        k4.q j10 = super.a();
        if (j10 != null) {
            return j10;
        }
        if (!Q() || (k10 = k()) == null) {
            return null;
        }
        this.f54514o = Collections.emptyList();
        this.f54524y = -9223372036854775807L;
        k4.q qVar = k10;
        qVar.K(l(), g(), Long.MAX_VALUE);
        return k10;
    }

    /* access modifiers changed from: protected */
    public boolean m() {
        return this.f54514o != this.f54515p;
    }

    public /* bridge */ /* synthetic */ void n(C8432p pVar) {
        super.c(pVar);
    }

    public void release() {
    }
}
