package l4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k4.C8427k;
import k4.C8432p;
import s3.a;
import t3.A;
import t3.B;
import t3.C5950a;
import t3.C5954e;
import t3.q;

/* renamed from: l4.c  reason: case insensitive filesystem */
public final class C8493c extends C8495e {

    /* renamed from: h  reason: collision with root package name */
    private final B f54536h = new B();

    /* renamed from: i  reason: collision with root package name */
    private final A f54537i = new A();

    /* renamed from: j  reason: collision with root package name */
    private int f54538j = -1;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f54539k;

    /* renamed from: l  reason: collision with root package name */
    private final int f54540l;

    /* renamed from: m  reason: collision with root package name */
    private final b[] f54541m;

    /* renamed from: n  reason: collision with root package name */
    private b f54542n;

    /* renamed from: o  reason: collision with root package name */
    private List<s3.a> f54543o;

    /* renamed from: p  reason: collision with root package name */
    private List<s3.a> f54544p;

    /* renamed from: q  reason: collision with root package name */
    private C0865c f54545q;

    /* renamed from: r  reason: collision with root package name */
    private int f54546r;

    /* renamed from: l4.c$a */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final Comparator<a> f54547c = new C8492b();

        /* renamed from: a  reason: collision with root package name */
        public final s3.a f54548a;

        /* renamed from: b  reason: collision with root package name */
        public final int f54549b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            a.b n10 = new a.b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                n10.s(i13);
            }
            this.f54548a = n10.a();
            this.f54549b = i14;
        }
    }

    /* renamed from: l4.c$b */
    private static final class b {

        /* renamed from: A  reason: collision with root package name */
        private static final int[] f54550A = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: B  reason: collision with root package name */
        private static final boolean[] f54551B = {false, false, false, true, true, true, false};

        /* renamed from: C  reason: collision with root package name */
        private static final int[] f54552C;

        /* renamed from: D  reason: collision with root package name */
        private static final int[] f54553D = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: E  reason: collision with root package name */
        private static final int[] f54554E = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: F  reason: collision with root package name */
        private static final int[] f54555F;

        /* renamed from: v  reason: collision with root package name */
        public static final int f54556v = h(2, 2, 2, 0);

        /* renamed from: w  reason: collision with root package name */
        public static final int f54557w;

        /* renamed from: x  reason: collision with root package name */
        public static final int f54558x;

        /* renamed from: y  reason: collision with root package name */
        private static final int[] f54559y = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: z  reason: collision with root package name */
        private static final int[] f54560z = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: a  reason: collision with root package name */
        private final List<SpannableString> f54561a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final SpannableStringBuilder f54562b = new SpannableStringBuilder();

        /* renamed from: c  reason: collision with root package name */
        private boolean f54563c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f54564d;

        /* renamed from: e  reason: collision with root package name */
        private int f54565e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f54566f;

        /* renamed from: g  reason: collision with root package name */
        private int f54567g;

        /* renamed from: h  reason: collision with root package name */
        private int f54568h;

        /* renamed from: i  reason: collision with root package name */
        private int f54569i;

        /* renamed from: j  reason: collision with root package name */
        private int f54570j;

        /* renamed from: k  reason: collision with root package name */
        private int f54571k;

        /* renamed from: l  reason: collision with root package name */
        private int f54572l;

        /* renamed from: m  reason: collision with root package name */
        private int f54573m;

        /* renamed from: n  reason: collision with root package name */
        private int f54574n;

        /* renamed from: o  reason: collision with root package name */
        private int f54575o;

        /* renamed from: p  reason: collision with root package name */
        private int f54576p;

        /* renamed from: q  reason: collision with root package name */
        private int f54577q;

        /* renamed from: r  reason: collision with root package name */
        private int f54578r;

        /* renamed from: s  reason: collision with root package name */
        private int f54579s;

        /* renamed from: t  reason: collision with root package name */
        private int f54580t;

        /* renamed from: u  reason: collision with root package name */
        private int f54581u;

        static {
            int h10 = h(0, 0, 0, 0);
            f54557w = h10;
            int h11 = h(0, 0, 0, 3);
            f54558x = h11;
            int i10 = h10;
            int i11 = h10;
            f54552C = new int[]{h10, h11, i10, i11, h11, h10, h10};
            f54555F = new int[]{h10, h10, i10, i11, h10, h11, h11};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                t3.C5950a.c(r4, r0, r1)
                t3.C5950a.c(r5, r0, r1)
                t3.C5950a.c(r6, r0, r1)
                t3.C5950a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x001b
                if (r7 == r1) goto L_0x001b
                r3 = 2
                if (r7 == r3) goto L_0x001f
                r3 = 3
                if (r7 == r3) goto L_0x001d
            L_0x001b:
                r7 = r2
                goto L_0x0021
            L_0x001d:
                r7 = r0
                goto L_0x0021
            L_0x001f:
                r7 = 127(0x7f, float:1.78E-43)
            L_0x0021:
                if (r4 <= r1) goto L_0x0025
                r4 = r2
                goto L_0x0026
            L_0x0025:
                r4 = r0
            L_0x0026:
                if (r5 <= r1) goto L_0x002a
                r5 = r2
                goto L_0x002b
            L_0x002a:
                r5 = r0
            L_0x002b:
                if (r6 <= r1) goto L_0x002e
                r0 = r2
            L_0x002e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: l4.C8493c.b.h(int, int, int, int):int");
        }

        public void a(char c10) {
            if (c10 == 10) {
                this.f54561a.add(d());
                this.f54562b.clear();
                if (this.f54575o != -1) {
                    this.f54575o = 0;
                }
                if (this.f54576p != -1) {
                    this.f54576p = 0;
                }
                if (this.f54577q != -1) {
                    this.f54577q = 0;
                }
                if (this.f54579s != -1) {
                    this.f54579s = 0;
                }
                while (true) {
                    if (this.f54561a.size() >= this.f54570j || this.f54561a.size() >= 15) {
                        this.f54561a.remove(0);
                    } else {
                        this.f54581u = this.f54561a.size();
                        return;
                    }
                }
            } else {
                this.f54562b.append(c10);
            }
        }

        public void b() {
            int length = this.f54562b.length();
            if (length > 0) {
                this.f54562b.delete(length - 1, length);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public l4.C8493c.a c() {
            /*
                r15 = this;
                boolean r0 = r15.j()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = r0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.f54561a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.f54561a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.d()
                r2.append(r1)
                int r1 = r15.f54571k
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005f
                if (r1 == r5) goto L_0x005c
                if (r1 == r3) goto L_0x0058
                if (r1 != r4) goto L_0x003f
                goto L_0x005f
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.f54571k
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
            L_0x005a:
                r6 = r1
                goto L_0x0062
            L_0x005c:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x005a
            L_0x005f:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
                goto L_0x005a
            L_0x0062:
                boolean r1 = r15.f54566f
                if (r1 == 0) goto L_0x0071
                int r1 = r15.f54568h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f54567g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007e
            L_0x0071:
                int r1 = r15.f54568h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f54567g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007e:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.f54569i
                int r8 = r1 / 3
                if (r8 != 0) goto L_0x0092
                r8 = r0
                goto L_0x0099
            L_0x0092:
                int r8 = r1 / 3
                if (r8 != r5) goto L_0x0098
                r8 = r5
                goto L_0x0099
            L_0x0098:
                r8 = r3
            L_0x0099:
                int r9 = r1 % 3
                if (r9 != 0) goto L_0x009f
                r9 = r0
                goto L_0x00a5
            L_0x009f:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x00a4
                r9 = r5
                goto L_0x00a5
            L_0x00a4:
                r9 = r3
            L_0x00a5:
                int r1 = r15.f54574n
                int r3 = f54557w
                if (r1 == r3) goto L_0x00ac
                r0 = r5
            L_0x00ac:
                l4.c$a r13 = new l4.c$a
                int r11 = r15.f54574n
                int r12 = r15.f54565e
                r5 = 0
                r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r14
                r10 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: l4.C8493c.b.c():l4.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f54562b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f54575o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f54575o, length, 33);
                }
                if (this.f54576p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f54576p, length, 33);
                }
                if (this.f54577q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f54578r), this.f54577q, length, 33);
                }
                if (this.f54579s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f54580t), this.f54579s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f54561a.clear();
            this.f54562b.clear();
            this.f54575o = -1;
            this.f54576p = -1;
            this.f54577q = -1;
            this.f54579s = -1;
            this.f54581u = 0;
        }

        public void f(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
            int i17 = i15;
            int i18 = i16;
            this.f54563c = true;
            this.f54564d = z10;
            this.f54565e = i10;
            this.f54566f = z11;
            this.f54567g = i11;
            this.f54568h = i12;
            this.f54569i = i14;
            int i19 = i13 + 1;
            if (this.f54570j != i19) {
                this.f54570j = i19;
                while (true) {
                    if (this.f54561a.size() < this.f54570j && this.f54561a.size() < 15) {
                        break;
                    }
                    this.f54561a.remove(0);
                }
            }
            if (!(i17 == 0 || this.f54572l == i17)) {
                this.f54572l = i17;
                int i20 = i17 - 1;
                q(f54552C[i20], f54558x, f54551B[i20], 0, f54560z[i20], f54550A[i20], f54559y[i20]);
            }
            if (i18 != 0 && this.f54573m != i18) {
                this.f54573m = i18;
                int i21 = i18 - 1;
                m(0, 1, 1, false, false, f54554E[i21], f54553D[i21]);
                n(f54556v, f54555F[i21], f54557w);
            }
        }

        public boolean i() {
            return this.f54563c;
        }

        public boolean j() {
            return !i() || (this.f54561a.isEmpty() && this.f54562b.length() == 0);
        }

        public boolean k() {
            return this.f54564d;
        }

        public void l() {
            e();
            this.f54563c = false;
            this.f54564d = false;
            this.f54565e = 4;
            this.f54566f = false;
            this.f54567g = 0;
            this.f54568h = 0;
            this.f54569i = 0;
            this.f54570j = 15;
            this.f54571k = 0;
            this.f54572l = 0;
            this.f54573m = 0;
            int i10 = f54557w;
            this.f54574n = i10;
            this.f54578r = f54556v;
            this.f54580t = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f54575o != -1) {
                if (!z10) {
                    this.f54562b.setSpan(new StyleSpan(2), this.f54575o, this.f54562b.length(), 33);
                    this.f54575o = -1;
                }
            } else if (z10) {
                this.f54575o = this.f54562b.length();
            }
            if (this.f54576p != -1) {
                if (!z11) {
                    this.f54562b.setSpan(new UnderlineSpan(), this.f54576p, this.f54562b.length(), 33);
                    this.f54576p = -1;
                }
            } else if (z11) {
                this.f54576p = this.f54562b.length();
            }
        }

        public void n(int i10, int i11, int i12) {
            if (!(this.f54577q == -1 || this.f54578r == i10)) {
                this.f54562b.setSpan(new ForegroundColorSpan(this.f54578r), this.f54577q, this.f54562b.length(), 33);
            }
            if (i10 != f54556v) {
                this.f54577q = this.f54562b.length();
                this.f54578r = i10;
            }
            if (!(this.f54579s == -1 || this.f54580t == i11)) {
                this.f54562b.setSpan(new BackgroundColorSpan(this.f54580t), this.f54579s, this.f54562b.length(), 33);
            }
            if (i11 != f54557w) {
                this.f54579s = this.f54562b.length();
                this.f54580t = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f54581u != i10) {
                a(10);
            }
            this.f54581u = i10;
        }

        public void p(boolean z10) {
            this.f54564d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f54574n = i10;
            this.f54571k = i15;
        }
    }

    /* renamed from: l4.c$c  reason: collision with other inner class name */
    private static final class C0865c {

        /* renamed from: a  reason: collision with root package name */
        public final int f54582a;

        /* renamed from: b  reason: collision with root package name */
        public final int f54583b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f54584c;

        /* renamed from: d  reason: collision with root package name */
        int f54585d = 0;

        public C0865c(int i10, int i11) {
            this.f54582a = i10;
            this.f54583b = i11;
            this.f54584c = new byte[((i11 * 2) - 1)];
        }
    }

    public C8493c(int i10, List<byte[]> list) {
        boolean z10 = true;
        this.f54540l = i10 == -1 ? 1 : i10;
        this.f54539k = (list == null || !C5954e.v(list)) ? false : z10;
        this.f54541m = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f54541m[i11] = new b();
        }
        this.f54542n = this.f54541m[0];
    }

    private void A(int i10) {
        if (i10 == 160) {
            this.f54542n.a(13252);
            return;
        }
        q.h("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f54542n.a('_');
    }

    private void B() {
        this.f54542n.m(this.f54537i.h(4), this.f54537i.h(2), this.f54537i.h(2), this.f54537i.g(), this.f54537i.g(), this.f54537i.h(3), this.f54537i.h(3));
    }

    private void C() {
        int h10 = b.h(this.f54537i.h(2), this.f54537i.h(2), this.f54537i.h(2), this.f54537i.h(2));
        int h11 = b.h(this.f54537i.h(2), this.f54537i.h(2), this.f54537i.h(2), this.f54537i.h(2));
        this.f54537i.r(2);
        this.f54542n.n(h10, h11, b.g(this.f54537i.h(2), this.f54537i.h(2), this.f54537i.h(2)));
    }

    private void D() {
        this.f54537i.r(4);
        int h10 = this.f54537i.h(4);
        this.f54537i.r(2);
        this.f54542n.o(h10, this.f54537i.h(6));
    }

    private void E() {
        int h10 = b.h(this.f54537i.h(2), this.f54537i.h(2), this.f54537i.h(2), this.f54537i.h(2));
        int h11 = this.f54537i.h(2);
        int g10 = b.g(this.f54537i.h(2), this.f54537i.h(2), this.f54537i.h(2));
        if (this.f54537i.g()) {
            h11 |= 4;
        }
        boolean g11 = this.f54537i.g();
        int h12 = this.f54537i.h(2);
        int h13 = this.f54537i.h(2);
        int h14 = this.f54537i.h(2);
        this.f54537i.r(8);
        this.f54542n.q(h10, g10, g11, h11, h12, h13, h14);
    }

    private void F() {
        C0865c cVar = this.f54545q;
        if (cVar.f54585d != (cVar.f54583b * 2) - 1) {
            q.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f54545q.f54583b * 2) - 1) + ", but current index is " + this.f54545q.f54585d + " (sequence number " + this.f54545q.f54582a + ");");
        }
        A a10 = this.f54537i;
        C0865c cVar2 = this.f54545q;
        a10.o(cVar2.f54584c, cVar2.f54585d);
        boolean z10 = false;
        while (true) {
            if (this.f54537i.b() <= 0) {
                break;
            }
            int h10 = this.f54537i.h(3);
            int h11 = this.f54537i.h(5);
            if (h10 == 7) {
                this.f54537i.r(2);
                h10 = this.f54537i.h(6);
                if (h10 < 7) {
                    q.h("Cea708Decoder", "Invalid extended service number: " + h10);
                }
            }
            if (h11 == 0) {
                if (h10 != 0) {
                    q.h("Cea708Decoder", "serviceNumber is non-zero (" + h10 + ") when blockSize is 0");
                }
            } else if (h10 != this.f54540l) {
                this.f54537i.s(h11);
            } else {
                int e10 = this.f54537i.e() + (h11 * 8);
                while (this.f54537i.e() < e10) {
                    int h12 = this.f54537i.h(8);
                    if (h12 == 16) {
                        int h13 = this.f54537i.h(8);
                        if (h13 <= 31) {
                            u(h13);
                        } else if (h13 <= 127) {
                            z(h13);
                        } else if (h13 <= 159) {
                            v(h13);
                        } else if (h13 <= 255) {
                            A(h13);
                        } else {
                            q.h("Cea708Decoder", "Invalid extended command: " + h13);
                        }
                    } else if (h12 <= 31) {
                        s(h12);
                    } else if (h12 <= 127) {
                        x(h12);
                    } else if (h12 <= 159) {
                        t(h12);
                    } else if (h12 <= 255) {
                        y(h12);
                    } else {
                        q.h("Cea708Decoder", "Invalid base command: " + h12);
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            this.f54543o = r();
        }
    }

    private void G() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f54541m[i10].l();
        }
    }

    private void q() {
        if (this.f54545q != null) {
            F();
            this.f54545q = null;
        }
    }

    private List<s3.a> r() {
        a c10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f54541m[i10].j() && this.f54541m[i10].k() && (c10 = this.f54541m[i10].c()) != null) {
                arrayList.add(c10);
            }
        }
        Collections.sort(arrayList, a.f54547c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f54548a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void s(int i10) {
        if (i10 == 0) {
            return;
        }
        if (i10 == 3) {
            this.f54543o = r();
        } else if (i10 != 8) {
            switch (i10) {
                case 12:
                    G();
                    return;
                case 13:
                    this.f54542n.a(10);
                    return;
                case 14:
                    return;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        q.h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f54537i.r(8);
                        return;
                    } else if (i10 < 24 || i10 > 31) {
                        q.h("Cea708Decoder", "Invalid C0 command: " + i10);
                        return;
                    } else {
                        q.h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f54537i.r(16);
                        return;
                    }
            }
        } else {
            this.f54542n.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r4.f54537i.g() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r4.f54541m[8 - r2].l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r4.f54537i.g() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r4.f54541m[8 - r2].p(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r4.f54537i.g() == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        r4.f54541m[8 - r2].e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x0109;
                case 129: goto L_0x0109;
                case 130: goto L_0x0109;
                case 131: goto L_0x0109;
                case 132: goto L_0x0109;
                case 133: goto L_0x0109;
                case 134: goto L_0x0109;
                case 135: goto L_0x0109;
                case 136: goto L_0x00f3;
                case 137: goto L_0x00dc;
                case 138: goto L_0x00c5;
                case 139: goto L_0x00a9;
                case 140: goto L_0x0093;
                case 141: goto L_0x008c;
                case 142: goto L_0x0117;
                case 143: goto L_0x0087;
                case 144: goto L_0x0073;
                case 145: goto L_0x005d;
                case 146: goto L_0x0049;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0033;
                case 152: goto L_0x0020;
                case 153: goto L_0x0020;
                case 154: goto L_0x0020;
                case 155: goto L_0x0020;
                case 156: goto L_0x0020;
                case 157: goto L_0x0020;
                case 158: goto L_0x0020;
                case 159: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid C1 command: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Cea708Decoder"
            t3.q.h(r0, r5)
            goto L_0x0117
        L_0x0020:
            int r5 = r5 + -152
            r4.w(r5)
            int r0 = r4.f54546r
            if (r0 == r5) goto L_0x0117
            r4.f54546r = r5
            l4.c$b[] r0 = r4.f54541m
            r5 = r0[r5]
            r4.f54542n = r5
            goto L_0x0117
        L_0x0033:
            l4.c$b r5 = r4.f54542n
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0044
            t3.A r5 = r4.f54537i
            r0 = 32
            r5.r(r0)
            goto L_0x0117
        L_0x0044:
            r4.E()
            goto L_0x0117
        L_0x0049:
            l4.c$b r5 = r4.f54542n
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0058
            t3.A r5 = r4.f54537i
            r5.r(r0)
            goto L_0x0117
        L_0x0058:
            r4.D()
            goto L_0x0117
        L_0x005d:
            l4.c$b r5 = r4.f54542n
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x006e
            t3.A r5 = r4.f54537i
            r0 = 24
            r5.r(r0)
            goto L_0x0117
        L_0x006e:
            r4.C()
            goto L_0x0117
        L_0x0073:
            l4.c$b r5 = r4.f54542n
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0082
            t3.A r5 = r4.f54537i
            r5.r(r0)
            goto L_0x0117
        L_0x0082:
            r4.B()
            goto L_0x0117
        L_0x0087:
            r4.G()
            goto L_0x0117
        L_0x008c:
            t3.A r5 = r4.f54537i
            r5.r(r1)
            goto L_0x0117
        L_0x0093:
            if (r2 > r1) goto L_0x0117
            t3.A r5 = r4.f54537i
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00a6
            l4.c$b[] r5 = r4.f54541m
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.l()
        L_0x00a6:
            int r2 = r2 + 1
            goto L_0x0093
        L_0x00a9:
            r5 = r2
        L_0x00aa:
            if (r5 > r1) goto L_0x0117
            t3.A r0 = r4.f54537i
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00c2
            l4.c$b[] r0 = r4.f54541m
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.k()
            r3 = r3 ^ r2
            r0.p(r3)
        L_0x00c2:
            int r5 = r5 + 1
            goto L_0x00aa
        L_0x00c5:
            if (r2 > r1) goto L_0x0117
            t3.A r5 = r4.f54537i
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00d9
            l4.c$b[] r5 = r4.f54541m
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.p(r0)
        L_0x00d9:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00dc:
            r5 = r2
        L_0x00dd:
            if (r5 > r1) goto L_0x0117
            t3.A r0 = r4.f54537i
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00f0
            l4.c$b[] r0 = r4.f54541m
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.p(r2)
        L_0x00f0:
            int r5 = r5 + 1
            goto L_0x00dd
        L_0x00f3:
            if (r2 > r1) goto L_0x0117
            t3.A r5 = r4.f54537i
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x0106
            l4.c$b[] r5 = r4.f54541m
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.e()
        L_0x0106:
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x0109:
            int r5 = r5 + -128
            int r0 = r4.f54546r
            if (r0 == r5) goto L_0x0117
            r4.f54546r = r5
            l4.c$b[] r0 = r4.f54541m
            r5 = r0[r5]
            r4.f54542n = r5
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C8493c.t(int):void");
    }

    private void u(int i10) {
        if (i10 > 7) {
            if (i10 <= 15) {
                this.f54537i.r(8);
            } else if (i10 <= 23) {
                this.f54537i.r(16);
            } else if (i10 <= 31) {
                this.f54537i.r(24);
            }
        }
    }

    private void v(int i10) {
        if (i10 <= 135) {
            this.f54537i.r(32);
        } else if (i10 <= 143) {
            this.f54537i.r(40);
        } else if (i10 <= 159) {
            this.f54537i.r(2);
            this.f54537i.r(this.f54537i.h(6) * 8);
        }
    }

    private void w(int i10) {
        b bVar = this.f54541m[i10];
        this.f54537i.r(2);
        boolean g10 = this.f54537i.g();
        this.f54537i.r(2);
        int h10 = this.f54537i.h(3);
        boolean g11 = this.f54537i.g();
        int h11 = this.f54537i.h(7);
        int h12 = this.f54537i.h(8);
        int h13 = this.f54537i.h(4);
        int h14 = this.f54537i.h(4);
        this.f54537i.r(2);
        this.f54537i.r(6);
        this.f54537i.r(2);
        bVar.f(g10, h10, g11, h11, h12, h14, h13, this.f54537i.h(3), this.f54537i.h(3));
    }

    private void x(int i10) {
        if (i10 == 127) {
            this.f54542n.a(9835);
        } else {
            this.f54542n.a((char) (i10 & 255));
        }
    }

    private void y(int i10) {
        this.f54542n.a((char) (i10 & 255));
    }

    private void z(int i10) {
        if (i10 == 32) {
            this.f54542n.a(' ');
        } else if (i10 == 33) {
            this.f54542n.a(160);
        } else if (i10 == 37) {
            this.f54542n.a(8230);
        } else if (i10 == 42) {
            this.f54542n.a(352);
        } else if (i10 == 44) {
            this.f54542n.a(338);
        } else if (i10 == 63) {
            this.f54542n.a(376);
        } else if (i10 == 57) {
            this.f54542n.a(8482);
        } else if (i10 == 58) {
            this.f54542n.a(353);
        } else if (i10 == 60) {
            this.f54542n.a(339);
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    this.f54542n.a(9608);
                    return;
                case 49:
                    this.f54542n.a(8216);
                    return;
                case 50:
                    this.f54542n.a(8217);
                    return;
                case 51:
                    this.f54542n.a(8220);
                    return;
                case 52:
                    this.f54542n.a(8221);
                    return;
                case 53:
                    this.f54542n.a(8226);
                    return;
                default:
                    switch (i10) {
                        case 118:
                            this.f54542n.a(8539);
                            return;
                        case 119:
                            this.f54542n.a(8540);
                            return;
                        case 120:
                            this.f54542n.a(8541);
                            return;
                        case 121:
                            this.f54542n.a(8542);
                            return;
                        case 122:
                            this.f54542n.a(9474);
                            return;
                        case 123:
                            this.f54542n.a(9488);
                            return;
                        case 124:
                            this.f54542n.a(9492);
                            return;
                        case 125:
                            this.f54542n.a(9472);
                            return;
                        case 126:
                            this.f54542n.a(9496);
                            return;
                        case 127:
                            this.f54542n.a(9484);
                            return;
                        default:
                            q.h("Cea708Decoder", "Invalid G2 character: " + i10);
                            return;
                    }
            }
        } else {
            this.f54542n.a(8480);
        }
    }

    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    public void flush() {
        super.flush();
        this.f54543o = null;
        this.f54544p = null;
        this.f54546r = 0;
        this.f54542n = this.f54541m[0];
        G();
        this.f54545q = null;
    }

    /* access modifiers changed from: protected */
    public C8427k g() {
        List<s3.a> list = this.f54543o;
        this.f54544p = list;
        return new f((List) C5950a.e(list));
    }

    /* access modifiers changed from: protected */
    public void h(C8432p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C5950a.e(pVar.f32279d);
        this.f54536h.U(byteBuffer.array(), byteBuffer.limit());
        while (this.f54536h.a() >= 3) {
            int H10 = this.f54536h.H();
            int i10 = H10 & 3;
            boolean z10 = false;
            boolean z11 = (H10 & 4) == 4;
            byte H11 = (byte) this.f54536h.H();
            byte H12 = (byte) this.f54536h.H();
            if ((i10 == 2 || i10 == 3) && z11) {
                if (i10 == 3) {
                    q();
                    int i11 = (H11 & 192) >> 6;
                    int i12 = this.f54538j;
                    if (!(i12 == -1 || i11 == (i12 + 1) % 4)) {
                        G();
                        q.h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f54538j + " current=" + i11);
                    }
                    this.f54538j = i11;
                    byte b10 = H11 & 63;
                    if (b10 == 0) {
                        b10 = 64;
                    }
                    C0865c cVar = new C0865c(i11, b10);
                    this.f54545q = cVar;
                    byte[] bArr = cVar.f54584c;
                    int i13 = cVar.f54585d;
                    cVar.f54585d = i13 + 1;
                    bArr[i13] = H12;
                } else {
                    if (i10 == 2) {
                        z10 = true;
                    }
                    C5950a.a(z10);
                    C0865c cVar2 = this.f54545q;
                    if (cVar2 == null) {
                        q.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = cVar2.f54584c;
                        int i14 = cVar2.f54585d;
                        int i15 = i14 + 1;
                        cVar2.f54585d = i15;
                        bArr2[i14] = H11;
                        cVar2.f54585d = i14 + 2;
                        bArr2[i15] = H12;
                    }
                }
                C0865c cVar3 = this.f54545q;
                if (cVar3.f54585d == (cVar3.f54583b * 2) - 1) {
                    q();
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ C8432p i() {
        return super.e();
    }

    public /* bridge */ /* synthetic */ k4.q j() {
        return super.a();
    }

    /* access modifiers changed from: protected */
    public boolean m() {
        return this.f54543o != this.f54544p;
    }

    public /* bridge */ /* synthetic */ void n(C8432p pVar) {
        super.c(pVar);
    }

    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
