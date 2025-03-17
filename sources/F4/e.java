package f4;

import N3.C6669g;
import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.J;
import N3.O;
import N3.P;
import N3.u;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.oppwa.mobile.connect.BuildConfig;
import com.sugarcube.app.base.data.source.CatalogRepository;
import d9.M;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import k4.s;
import k4.t;
import q3.C5797h;
import q3.C5798i;
import q3.C5803n;
import t3.B;
import t3.C5950a;
import t3.N;
import t3.q;
import t3.r;

public class e implements C6678p {
    @Deprecated

    /* renamed from: e0  reason: collision with root package name */
    public static final u f50990e0 = new d();

    /* renamed from: f0  reason: collision with root package name */
    private static final byte[] f50991f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: g0  reason: collision with root package name */
    public static final byte[] f50992g0 = N.s0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: h0  reason: collision with root package name */
    private static final byte[] f50993h0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: i0  reason: collision with root package name */
    private static final byte[] f50994i0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public static final UUID f50995j0 = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: k0  reason: collision with root package name */
    public static final Map<String, Integer> f50996k0;

    /* renamed from: A  reason: collision with root package name */
    private boolean f50997A;

    /* renamed from: B  reason: collision with root package name */
    private long f50998B;

    /* renamed from: C  reason: collision with root package name */
    private long f50999C;

    /* renamed from: D  reason: collision with root package name */
    private long f51000D;

    /* renamed from: E  reason: collision with root package name */
    private r f51001E;

    /* renamed from: F  reason: collision with root package name */
    private r f51002F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f51003G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f51004H;

    /* renamed from: I  reason: collision with root package name */
    private int f51005I;

    /* renamed from: J  reason: collision with root package name */
    private long f51006J;

    /* renamed from: K  reason: collision with root package name */
    private long f51007K;

    /* renamed from: L  reason: collision with root package name */
    private int f51008L;

    /* renamed from: M  reason: collision with root package name */
    private int f51009M;

    /* renamed from: N  reason: collision with root package name */
    private int[] f51010N;

    /* renamed from: O  reason: collision with root package name */
    private int f51011O;

    /* renamed from: P  reason: collision with root package name */
    private int f51012P;

    /* renamed from: Q  reason: collision with root package name */
    private int f51013Q;

    /* renamed from: R  reason: collision with root package name */
    private int f51014R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f51015S;

    /* renamed from: T  reason: collision with root package name */
    private long f51016T;

    /* renamed from: U  reason: collision with root package name */
    private int f51017U;

    /* renamed from: V  reason: collision with root package name */
    private int f51018V;

    /* renamed from: W  reason: collision with root package name */
    private int f51019W;

    /* renamed from: X  reason: collision with root package name */
    private boolean f51020X;

    /* renamed from: Y  reason: collision with root package name */
    private boolean f51021Y;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f51022Z;

    /* renamed from: a  reason: collision with root package name */
    private final C7844c f51023a;

    /* renamed from: a0  reason: collision with root package name */
    private int f51024a0;

    /* renamed from: b  reason: collision with root package name */
    private final g f51025b;

    /* renamed from: b0  reason: collision with root package name */
    private byte f51026b0;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<c> f51027c;

    /* renamed from: c0  reason: collision with root package name */
    private boolean f51028c0;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f51029d;

    /* renamed from: d0  reason: collision with root package name */
    private N3.r f51030d0;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f51031e;

    /* renamed from: f  reason: collision with root package name */
    private final s.a f51032f;

    /* renamed from: g  reason: collision with root package name */
    private final B f51033g;

    /* renamed from: h  reason: collision with root package name */
    private final B f51034h;

    /* renamed from: i  reason: collision with root package name */
    private final B f51035i;

    /* renamed from: j  reason: collision with root package name */
    private final B f51036j;

    /* renamed from: k  reason: collision with root package name */
    private final B f51037k;

    /* renamed from: l  reason: collision with root package name */
    private final B f51038l;

    /* renamed from: m  reason: collision with root package name */
    private final B f51039m;

    /* renamed from: n  reason: collision with root package name */
    private final B f51040n;

    /* renamed from: o  reason: collision with root package name */
    private final B f51041o;

    /* renamed from: p  reason: collision with root package name */
    private final B f51042p;

    /* renamed from: q  reason: collision with root package name */
    private ByteBuffer f51043q;

    /* renamed from: r  reason: collision with root package name */
    private long f51044r;

    /* renamed from: s  reason: collision with root package name */
    private long f51045s;

    /* renamed from: t  reason: collision with root package name */
    private long f51046t;

    /* renamed from: u  reason: collision with root package name */
    private long f51047u;

    /* renamed from: v  reason: collision with root package name */
    private long f51048v;

    /* renamed from: w  reason: collision with root package name */
    private c f51049w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f51050x;

    /* renamed from: y  reason: collision with root package name */
    private int f51051y;

    /* renamed from: z  reason: collision with root package name */
    private long f51052z;

    private final class b implements C7843b {
        private b() {
        }

        public void a(int i10) {
            e.this.q(i10);
        }

        public void b(int i10, int i11, C6679q qVar) {
            e.this.n(i10, i11, qVar);
        }

        public void c(int i10, double d10) {
            e.this.t(i10, d10);
        }

        public void d(int i10, long j10) {
            e.this.z(i10, j10);
        }

        public int e(int i10) {
            return e.this.w(i10);
        }

        public boolean f(int i10) {
            return e.this.B(i10);
        }

        public void g(int i10, String str) {
            e.this.J(i10, str);
        }

        public void h(int i10, long j10, long j11) {
            e.this.I(i10, j10, j11);
        }
    }

    protected static final class c {

        /* renamed from: A  reason: collision with root package name */
        public int f51054A = -1;

        /* renamed from: B  reason: collision with root package name */
        public int f51055B = -1;

        /* renamed from: C  reason: collision with root package name */
        public int f51056C = 1000;

        /* renamed from: D  reason: collision with root package name */
        public int f51057D = 200;

        /* renamed from: E  reason: collision with root package name */
        public float f51058E = -1.0f;

        /* renamed from: F  reason: collision with root package name */
        public float f51059F = -1.0f;

        /* renamed from: G  reason: collision with root package name */
        public float f51060G = -1.0f;

        /* renamed from: H  reason: collision with root package name */
        public float f51061H = -1.0f;

        /* renamed from: I  reason: collision with root package name */
        public float f51062I = -1.0f;

        /* renamed from: J  reason: collision with root package name */
        public float f51063J = -1.0f;

        /* renamed from: K  reason: collision with root package name */
        public float f51064K = -1.0f;

        /* renamed from: L  reason: collision with root package name */
        public float f51065L = -1.0f;

        /* renamed from: M  reason: collision with root package name */
        public float f51066M = -1.0f;

        /* renamed from: N  reason: collision with root package name */
        public float f51067N = -1.0f;

        /* renamed from: O  reason: collision with root package name */
        public byte[] f51068O;

        /* renamed from: P  reason: collision with root package name */
        public int f51069P = 1;

        /* renamed from: Q  reason: collision with root package name */
        public int f51070Q = -1;

        /* renamed from: R  reason: collision with root package name */
        public int f51071R = 8000;

        /* renamed from: S  reason: collision with root package name */
        public long f51072S = 0;

        /* renamed from: T  reason: collision with root package name */
        public long f51073T = 0;

        /* renamed from: U  reason: collision with root package name */
        public P f51074U;

        /* renamed from: V  reason: collision with root package name */
        public boolean f51075V;

        /* renamed from: W  reason: collision with root package name */
        public boolean f51076W = true;
        /* access modifiers changed from: private */

        /* renamed from: X  reason: collision with root package name */
        public String f51077X = "eng";

        /* renamed from: Y  reason: collision with root package name */
        public O f51078Y;

        /* renamed from: Z  reason: collision with root package name */
        public int f51079Z;

        /* renamed from: a  reason: collision with root package name */
        public String f51080a;

        /* renamed from: b  reason: collision with root package name */
        public String f51081b;

        /* renamed from: c  reason: collision with root package name */
        public int f51082c;

        /* renamed from: d  reason: collision with root package name */
        public int f51083d;

        /* renamed from: e  reason: collision with root package name */
        public int f51084e;

        /* renamed from: f  reason: collision with root package name */
        public int f51085f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public int f51086g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f51087h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f51088i;

        /* renamed from: j  reason: collision with root package name */
        public O.a f51089j;

        /* renamed from: k  reason: collision with root package name */
        public byte[] f51090k;

        /* renamed from: l  reason: collision with root package name */
        public C5803n f51091l;

        /* renamed from: m  reason: collision with root package name */
        public int f51092m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f51093n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f51094o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f51095p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f51096q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f51097r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f51098s = -1;

        /* renamed from: t  reason: collision with root package name */
        public float f51099t = 0.0f;

        /* renamed from: u  reason: collision with root package name */
        public float f51100u = 0.0f;

        /* renamed from: v  reason: collision with root package name */
        public float f51101v = 0.0f;

        /* renamed from: w  reason: collision with root package name */
        public byte[] f51102w = null;

        /* renamed from: x  reason: collision with root package name */
        public int f51103x = -1;

        /* renamed from: y  reason: collision with root package name */
        public boolean f51104y = false;

        /* renamed from: z  reason: collision with root package name */
        public int f51105z = -1;

        protected c() {
        }

        /* access modifiers changed from: private */
        public void f() {
            C5950a.e(this.f51078Y);
        }

        private byte[] g(String str) {
            byte[] bArr = this.f51090k;
            if (bArr != null) {
                return bArr;
            }
            throw q3.B.a("Missing CodecPrivate for codec " + str, (Throwable) null);
        }

        private byte[] h() {
            if (this.f51058E == -1.0f || this.f51059F == -1.0f || this.f51060G == -1.0f || this.f51061H == -1.0f || this.f51062I == -1.0f || this.f51063J == -1.0f || this.f51064K == -1.0f || this.f51065L == -1.0f || this.f51066M == -1.0f || this.f51067N == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((int) ((this.f51058E * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f51059F * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f51060G * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f51061H * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f51062I * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f51063J * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f51064K * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.f51065L * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) (this.f51066M + 0.5f)));
            order.putShort((short) ((int) (this.f51067N + 0.5f)));
            order.putShort((short) this.f51056C);
            order.putShort((short) this.f51057D);
            return bArr;
        }

        private static Pair<String, List<byte[]>> k(B b10) {
            try {
                b10.X(16);
                long x10 = b10.x();
                if (x10 == 1482049860) {
                    return new Pair<>("video/divx", (Object) null);
                }
                if (x10 == 859189832) {
                    return new Pair<>("video/3gpp", (Object) null);
                }
                if (x10 == 826496599) {
                    byte[] e10 = b10.e();
                    for (int f10 = b10.f() + 20; f10 < e10.length - 4; f10++) {
                        if (e10[f10] == 0 && e10[f10 + 1] == 0 && e10[f10 + 2] == 1 && e10[f10 + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(e10, f10, e10.length)));
                        }
                    }
                    throw q3.B.a("Failed to find FourCC VC1 initialization data", (Throwable) null);
                }
                q.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw q3.B.a("Error parsing FourCC private data", (Throwable) null);
            }
        }

        private static boolean l(B b10) {
            try {
                int z10 = b10.z();
                if (z10 == 1) {
                    return true;
                }
                if (z10 != 65534) {
                    return false;
                }
                b10.W(24);
                return b10.A() == e.f50995j0.getMostSignificantBits() && b10.A() == e.f50995j0.getLeastSignificantBits();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw q3.B.a("Error parsing MS/ACM codec private", (Throwable) null);
            }
        }

        private static List<byte[]> m(byte[] bArr) {
            byte b10;
            byte b11;
            try {
                if (bArr[0] == 2) {
                    int i10 = 0;
                    int i11 = 1;
                    while (true) {
                        b10 = bArr[i11];
                        if ((b10 & 255) != 255) {
                            break;
                        }
                        i10 += 255;
                        i11++;
                    }
                    int i12 = i11 + 1;
                    int i13 = i10 + (b10 & 255);
                    int i14 = 0;
                    while (true) {
                        b11 = bArr[i12];
                        if ((b11 & 255) != 255) {
                            break;
                        }
                        i14 += 255;
                        i12++;
                    }
                    int i15 = i12 + 1;
                    int i16 = i14 + (b11 & 255);
                    if (bArr[i15] == 1) {
                        byte[] bArr2 = new byte[i13];
                        System.arraycopy(bArr, i15, bArr2, 0, i13);
                        int i17 = i15 + i13;
                        if (bArr[i17] == 3) {
                            int i18 = i17 + i16;
                            if (bArr[i18] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i18)];
                                System.arraycopy(bArr, i18, bArr3, 0, bArr.length - i18);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw q3.B.a("Error parsing vorbis codec private", (Throwable) null);
                        }
                        throw q3.B.a("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw q3.B.a("Error parsing vorbis codec private", (Throwable) null);
                }
                throw q3.B.a("Error parsing vorbis codec private", (Throwable) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw q3.B.a("Error parsing vorbis codec private", (Throwable) null);
            }
        }

        /* access modifiers changed from: private */
        public boolean o(boolean z10) {
            return "A_OPUS".equals(this.f51081b) ? z10 : this.f51085f > 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0227, code lost:
            r14 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0236, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0237, code lost:
            r5 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0238, code lost:
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x023c, code lost:
            r1 = null;
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0265, code lost:
            r5 = 0;
            r6 = -1;
            r14 = -1;
            r18 = r2;
            r2 = r1;
            r1 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x02a5, code lost:
            r1 = null;
            r2 = null;
            r16 = "audio/x-unknown";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x02ab, code lost:
            r1 = null;
            r2 = null;
            r5 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ae, code lost:
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x038b, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x03ac, code lost:
            r1 = null;
            r2 = null;
            r6 = androidx.recyclerview.widget.RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x043d, code lost:
            if (r0.f51068O == null) goto L_0x0450;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x043f, code lost:
            r4 = N3.C6676n.a(new t3.B(r0.f51068O));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x044a, code lost:
            if (r4 == null) goto L_0x0450;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x044c, code lost:
            r2 = r4.f38919c;
            r16 = "video/dolby-vision";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x0450, code lost:
            r4 = r16;
            r15 = r0.f51076W;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x0456, code lost:
            if (r0.f51075V == false) goto L_0x045a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x0458, code lost:
            r3 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x045a, code lost:
            r3 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x045b, code lost:
            r3 = r3 | r15;
            r15 = new q3.C5807s.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x0465, code lost:
            if (q3.A.n(r4) == false) goto L_0x0479;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x0467, code lost:
            r15.Q(r0.f51069P).t0(r0.f51071R).m0(r14);
            r5 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x047d, code lost:
            if (q3.A.q(r4) == false) goto L_0x0573;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x0481, code lost:
            if (r0.f51097r != 0) goto L_0x0495;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x0483, code lost:
            r7 = r0.f51095p;
            r8 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x0486, code lost:
            if (r7 != -1) goto L_0x048a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x0488, code lost:
            r7 = r0.f51092m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x048a, code lost:
            r0.f51095p = r7;
            r7 = r0.f51096q;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x048e, code lost:
            if (r7 != -1) goto L_0x0492;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x0490, code lost:
            r7 = r0.f51093n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x0492, code lost:
            r0.f51096q = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x0495, code lost:
            r8 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x0496, code lost:
            r7 = r0.f51095p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0498, code lost:
            if (r7 == r8) goto L_0x04a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x049a, code lost:
            r9 = r0.f51096q;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x049c, code lost:
            if (r9 == r8) goto L_0x04a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x049e, code lost:
            r7 = ((float) (r0.f51093n * r7)) / ((float) (r0.f51092m * r9));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x04a8, code lost:
            r7 = -1.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x04ac, code lost:
            if (r0.f51104y == false) goto L_0x04dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x04ae, code lost:
            r10 = new q3.C5798i.b().d(r0.f51105z).c(r0.f51055B).e(r0.f51054A).f(h()).g(r0.f51094o).b(r0.f51094o).a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x04df, code lost:
            if (r0.f51080a == null) goto L_0x04fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x04eb, code lost:
            if (f4.e.f().containsKey(r0.f51080a) == false) goto L_0x04fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x04ed, code lost:
            r8 = ((java.lang.Integer) f4.e.f().get(r0.f51080a)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x04ff, code lost:
            if (r0.f51098s != 0) goto L_0x054d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0508, code lost:
            if (java.lang.Float.compare(r0.f51099t, 0.0f) != 0) goto L_0x054d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x0510, code lost:
            if (java.lang.Float.compare(r0.f51100u, 0.0f) != 0) goto L_0x054d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0518, code lost:
            if (java.lang.Float.compare(r0.f51101v, 0.0f) != 0) goto L_0x051b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x0523, code lost:
            if (java.lang.Float.compare(r0.f51101v, 90.0f) != 0) goto L_0x0528;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x0525, code lost:
            r5 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x0530, code lost:
            if (java.lang.Float.compare(r0.f51101v, -180.0f) == 0) goto L_0x054a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x053a, code lost:
            if (java.lang.Float.compare(r0.f51101v, 180.0f) != 0) goto L_0x053d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x0545, code lost:
            if (java.lang.Float.compare(r0.f51101v, -90.0f) != 0) goto L_0x054d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x0547, code lost:
            r5 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x054a, code lost:
            r5 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x054d, code lost:
            r5 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x054e, code lost:
            r15.x0(r0.f51092m).c0(r0.f51093n).o0(r7).r0(r5).p0(r0.f51102w).v0(r0.f51103x).S(r10);
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x0577, code lost:
            if ("application/x-subrip".equals(r4) != false) goto L_0x059f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x057d, code lost:
            if ("text/x-ssa".equals(r4) != false) goto L_0x059f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x0583, code lost:
            if ("text/vtt".equals(r4) != false) goto L_0x059f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x0589, code lost:
            if ("application/vobsub".equals(r4) != false) goto L_0x059f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x058f, code lost:
            if ("application/pgs".equals(r4) != false) goto L_0x059f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:244:0x0595, code lost:
            if ("application/dvbsubs".equals(r4) == false) goto L_0x0598;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:246:0x059e, code lost:
            throw q3.B.a("Unexpected MIME type.", (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:247:0x059f, code lost:
            r5 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:249:0x05a2, code lost:
            if (r0.f51080a == null) goto L_0x05b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:251:0x05ae, code lost:
            if (f4.e.f().containsKey(r0.f51080a) != false) goto L_0x05b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:252:0x05b0, code lost:
            r15.g0(r0.f51080a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:253:0x05b5, code lost:
            r1 = r15.d0(r21).s0(r4).j0(r6).i0(r0.f51077X).u0(r3).f0(r1).R(r2).X(r0.f51091l).M();
            r2 = r20.t(r0.f51082c, r5);
            r0.f51078Y = r2;
            r2.e(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:254:0x05ec, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void i(N3.r r20, int r21) {
            /*
                r19 = this;
                r0 = r19
                r2 = 16
                java.lang.String r5 = r0.f51081b
                r5.hashCode()
                java.lang.String r7 = "application/dvbsubs"
                java.lang.String r8 = "application/vobsub"
                java.lang.String r9 = "application/pgs"
                java.lang.String r11 = "text/x-ssa"
                java.lang.String r12 = "text/vtt"
                java.lang.String r13 = "application/x-subrip"
                r15 = 8
                r3 = 3
                java.lang.String r6 = ". Setting mimeType to "
                java.lang.String r16 = "audio/raw"
                java.lang.String r4 = "MatroskaExtractor"
                java.lang.String r14 = "audio/x-unknown"
                r10 = 0
                int r17 = r5.hashCode()
                switch(r17) {
                    case -2095576542: goto L_0x01d2;
                    case -2095575984: goto L_0x01c6;
                    case -1985379776: goto L_0x01ba;
                    case -1784763192: goto L_0x01ae;
                    case -1730367663: goto L_0x01a2;
                    case -1482641358: goto L_0x0196;
                    case -1482641357: goto L_0x018a;
                    case -1373388978: goto L_0x017e;
                    case -933872740: goto L_0x0171;
                    case -538363189: goto L_0x0163;
                    case -538363109: goto L_0x0155;
                    case -425012669: goto L_0x0147;
                    case -356037306: goto L_0x0139;
                    case 62923557: goto L_0x012b;
                    case 62923603: goto L_0x011d;
                    case 62927045: goto L_0x010f;
                    case 82318131: goto L_0x0102;
                    case 82338133: goto L_0x00f4;
                    case 82338134: goto L_0x00e6;
                    case 99146302: goto L_0x00d8;
                    case 444813526: goto L_0x00ca;
                    case 542569478: goto L_0x00bc;
                    case 635596514: goto L_0x00ae;
                    case 725948237: goto L_0x00a0;
                    case 725957860: goto L_0x0093;
                    case 738597099: goto L_0x0086;
                    case 855502857: goto L_0x0079;
                    case 1045209816: goto L_0x006c;
                    case 1422270023: goto L_0x005f;
                    case 1809237540: goto L_0x0052;
                    case 1950749482: goto L_0x0045;
                    case 1950789798: goto L_0x0038;
                    case 1951062397: goto L_0x002b;
                    default: goto L_0x0028;
                }
            L_0x0028:
                r1 = -1
                goto L_0x01dd
            L_0x002b:
                java.lang.String r1 = "A_OPUS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0034
                goto L_0x0028
            L_0x0034:
                r1 = 32
                goto L_0x01dd
            L_0x0038:
                java.lang.String r1 = "A_FLAC"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0041
                goto L_0x0028
            L_0x0041:
                r1 = 31
                goto L_0x01dd
            L_0x0045:
                java.lang.String r1 = "A_EAC3"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x004e
                goto L_0x0028
            L_0x004e:
                r1 = 30
                goto L_0x01dd
            L_0x0052:
                java.lang.String r1 = "V_MPEG2"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x005b
                goto L_0x0028
            L_0x005b:
                r1 = 29
                goto L_0x01dd
            L_0x005f:
                java.lang.String r1 = "S_TEXT/UTF8"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0068
                goto L_0x0028
            L_0x0068:
                r1 = 28
                goto L_0x01dd
            L_0x006c:
                java.lang.String r1 = "S_TEXT/WEBVTT"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0075
                goto L_0x0028
            L_0x0075:
                r1 = 27
                goto L_0x01dd
            L_0x0079:
                java.lang.String r1 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0082
                goto L_0x0028
            L_0x0082:
                r1 = 26
                goto L_0x01dd
            L_0x0086:
                java.lang.String r1 = "S_TEXT/ASS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x008f
                goto L_0x0028
            L_0x008f:
                r1 = 25
                goto L_0x01dd
            L_0x0093:
                java.lang.String r1 = "A_PCM/INT/LIT"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x009c
                goto L_0x0028
            L_0x009c:
                r1 = 24
                goto L_0x01dd
            L_0x00a0:
                java.lang.String r1 = "A_PCM/INT/BIG"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00aa
                goto L_0x0028
            L_0x00aa:
                r1 = 23
                goto L_0x01dd
            L_0x00ae:
                java.lang.String r1 = "A_PCM/FLOAT/IEEE"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00b8
                goto L_0x0028
            L_0x00b8:
                r1 = 22
                goto L_0x01dd
            L_0x00bc:
                java.lang.String r1 = "A_DTS/EXPRESS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00c6
                goto L_0x0028
            L_0x00c6:
                r1 = 21
                goto L_0x01dd
            L_0x00ca:
                java.lang.String r1 = "V_THEORA"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00d4
                goto L_0x0028
            L_0x00d4:
                r1 = 20
                goto L_0x01dd
            L_0x00d8:
                java.lang.String r1 = "S_HDMV/PGS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00e2
                goto L_0x0028
            L_0x00e2:
                r1 = 19
                goto L_0x01dd
            L_0x00e6:
                java.lang.String r1 = "V_VP9"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00f0
                goto L_0x0028
            L_0x00f0:
                r1 = 18
                goto L_0x01dd
            L_0x00f4:
                java.lang.String r1 = "V_VP8"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x00fe
                goto L_0x0028
            L_0x00fe:
                r1 = 17
                goto L_0x01dd
            L_0x0102:
                java.lang.String r1 = "V_AV1"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x010c
                goto L_0x0028
            L_0x010c:
                r1 = r2
                goto L_0x01dd
            L_0x010f:
                java.lang.String r1 = "A_DTS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0119
                goto L_0x0028
            L_0x0119:
                r1 = 15
                goto L_0x01dd
            L_0x011d:
                java.lang.String r1 = "A_AC3"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0127
                goto L_0x0028
            L_0x0127:
                r1 = 14
                goto L_0x01dd
            L_0x012b:
                java.lang.String r1 = "A_AAC"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0135
                goto L_0x0028
            L_0x0135:
                r1 = 13
                goto L_0x01dd
            L_0x0139:
                java.lang.String r1 = "A_DTS/LOSSLESS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0143
                goto L_0x0028
            L_0x0143:
                r1 = 12
                goto L_0x01dd
            L_0x0147:
                java.lang.String r1 = "S_VOBSUB"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0151
                goto L_0x0028
            L_0x0151:
                r1 = 11
                goto L_0x01dd
            L_0x0155:
                java.lang.String r1 = "V_MPEG4/ISO/AVC"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x015f
                goto L_0x0028
            L_0x015f:
                r1 = 10
                goto L_0x01dd
            L_0x0163:
                java.lang.String r1 = "V_MPEG4/ISO/ASP"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x016d
                goto L_0x0028
            L_0x016d:
                r1 = 9
                goto L_0x01dd
            L_0x0171:
                java.lang.String r1 = "S_DVBSUB"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x017b
                goto L_0x0028
            L_0x017b:
                r1 = r15
                goto L_0x01dd
            L_0x017e:
                java.lang.String r1 = "V_MS/VFW/FOURCC"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0188
                goto L_0x0028
            L_0x0188:
                r1 = 7
                goto L_0x01dd
            L_0x018a:
                java.lang.String r1 = "A_MPEG/L3"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x0194
                goto L_0x0028
            L_0x0194:
                r1 = 6
                goto L_0x01dd
            L_0x0196:
                java.lang.String r1 = "A_MPEG/L2"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x01a0
                goto L_0x0028
            L_0x01a0:
                r1 = 5
                goto L_0x01dd
            L_0x01a2:
                java.lang.String r1 = "A_VORBIS"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x01ac
                goto L_0x0028
            L_0x01ac:
                r1 = 4
                goto L_0x01dd
            L_0x01ae:
                java.lang.String r1 = "A_TRUEHD"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x01b8
                goto L_0x0028
            L_0x01b8:
                r1 = r3
                goto L_0x01dd
            L_0x01ba:
                java.lang.String r1 = "A_MS/ACM"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x01c4
                goto L_0x0028
            L_0x01c4:
                r1 = 2
                goto L_0x01dd
            L_0x01c6:
                java.lang.String r1 = "V_MPEG4/ISO/SP"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x01d0
                goto L_0x0028
            L_0x01d0:
                r1 = 1
                goto L_0x01dd
            L_0x01d2:
                java.lang.String r1 = "V_MPEG4/ISO/AP"
                boolean r1 = r5.equals(r1)
                if (r1 != 0) goto L_0x01dc
                goto L_0x0028
            L_0x01dc:
                r1 = 0
            L_0x01dd:
                switch(r1) {
                    case 0: goto L_0x042c;
                    case 1: goto L_0x042c;
                    case 2: goto L_0x03d6;
                    case 3: goto L_0x03c8;
                    case 4: goto L_0x03b6;
                    case 5: goto L_0x03b2;
                    case 6: goto L_0x03a9;
                    case 7: goto L_0x038e;
                    case 8: goto L_0x0378;
                    case 9: goto L_0x042c;
                    case 10: goto L_0x035d;
                    case 11: goto L_0x034f;
                    case 12: goto L_0x034b;
                    case 13: goto L_0x032d;
                    case 14: goto L_0x0329;
                    case 15: goto L_0x0325;
                    case 16: goto L_0x0321;
                    case 17: goto L_0x031d;
                    case 18: goto L_0x0319;
                    case 19: goto L_0x0315;
                    case 20: goto L_0x0311;
                    case 21: goto L_0x0325;
                    case 22: goto L_0x02e7;
                    case 23: goto L_0x02b1;
                    case 24: goto L_0x0281;
                    case 25: goto L_0x026f;
                    case 26: goto L_0x024c;
                    case 27: goto L_0x0247;
                    case 28: goto L_0x0242;
                    case 29: goto L_0x023f;
                    case 30: goto L_0x023a;
                    case 31: goto L_0x022a;
                    case 32: goto L_0x01e7;
                    default: goto L_0x01e0;
                }
            L_0x01e0:
                java.lang.String r1 = "Unrecognized codec identifier."
                q3.B r1 = q3.B.a(r1, r10)
                throw r1
            L_0x01e7:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r3)
                java.lang.String r2 = r0.f51081b
                byte[] r2 = r0.g(r2)
                r1.add(r2)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r15)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r2 = r2.order(r4)
                long r5 = r0.f51072S
                java.nio.ByteBuffer r2 = r2.putLong(r5)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r15)
                java.nio.ByteBuffer r2 = r2.order(r4)
                long r4 = r0.f51073T
                java.nio.ByteBuffer r2 = r2.putLong(r4)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.lang.String r16 = "audio/opus"
                r6 = 5760(0x1680, float:8.071E-42)
                r2 = r10
                r5 = 0
            L_0x0227:
                r14 = -1
                goto L_0x043b
            L_0x022a:
                java.lang.String r1 = r0.f51081b
                byte[] r1 = r0.g(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
            L_0x0236:
                r2 = r10
            L_0x0237:
                r5 = 0
            L_0x0238:
                r6 = -1
                goto L_0x0227
            L_0x023a:
                java.lang.String r16 = "audio/eac3"
            L_0x023c:
                r1 = r10
                r2 = r1
                goto L_0x0237
            L_0x023f:
                java.lang.String r16 = "video/mpeg2"
                goto L_0x023c
            L_0x0242:
                r1 = r10
                r2 = r1
                r16 = r13
                goto L_0x0237
            L_0x0247:
                r1 = r10
                r2 = r1
                r16 = r12
                goto L_0x0237
            L_0x024c:
                t3.B r1 = new t3.B
                java.lang.String r2 = r0.f51081b
                byte[] r2 = r0.g(r2)
                r1.<init>((byte[]) r2)
                N3.C r1 = N3.C6657C.a(r1)
                java.util.List<byte[]> r2 = r1.f38728a
                int r4 = r1.f38729b
                r0.f51079Z = r4
                java.lang.String r1 = r1.f38740m
                java.lang.String r16 = "video/hevc"
            L_0x0265:
                r5 = 0
                r6 = -1
                r14 = -1
                r18 = r2
                r2 = r1
                r1 = r18
                goto L_0x043b
            L_0x026f:
                byte[] r1 = f4.e.f50992g0
                java.lang.String r2 = r0.f51081b
                byte[] r2 = r0.g(r2)
                kb.v r1 = kb.C9967v.G(r1, r2)
                r2 = r10
                r16 = r11
                goto L_0x0237
            L_0x0281:
                int r1 = r0.f51070Q
                int r1 = t3.N.f0(r1)
                if (r1 != 0) goto L_0x02aa
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported little endian PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f51070Q
                r1.append(r2)
                r1.append(r6)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                t3.q.h(r4, r1)
            L_0x02a5:
                r1 = r10
                r2 = r1
                r16 = r14
                goto L_0x0237
            L_0x02aa:
                r14 = r1
            L_0x02ab:
                r1 = r10
                r2 = r1
                r5 = 0
            L_0x02ae:
                r6 = -1
                goto L_0x043b
            L_0x02b1:
                int r1 = r0.f51070Q
                if (r1 != r15) goto L_0x02b7
                r14 = r3
                goto L_0x02ab
            L_0x02b7:
                if (r1 != r2) goto L_0x02bc
                r14 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x02ab
            L_0x02bc:
                r2 = 24
                if (r1 != r2) goto L_0x02c3
                r14 = 1342177280(0x50000000, float:8.5899346E9)
                goto L_0x02ab
            L_0x02c3:
                r2 = 32
                if (r1 != r2) goto L_0x02ca
                r14 = 1610612736(0x60000000, float:3.6893488E19)
                goto L_0x02ab
            L_0x02ca:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported big endian PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f51070Q
                r1.append(r2)
                r1.append(r6)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                t3.q.h(r4, r1)
                goto L_0x02a5
            L_0x02e7:
                int r1 = r0.f51070Q
                r2 = 32
                if (r1 != r2) goto L_0x02f4
                r1 = r10
                r2 = r1
                r5 = 0
                r6 = -1
                r14 = 4
                goto L_0x043b
            L_0x02f4:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported floating point PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f51070Q
                r1.append(r2)
                r1.append(r6)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                t3.q.h(r4, r1)
                goto L_0x02a5
            L_0x0311:
                java.lang.String r16 = "video/x-unknown"
                goto L_0x023c
            L_0x0315:
                r16 = r9
                goto L_0x023c
            L_0x0319:
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x023c
            L_0x031d:
                java.lang.String r16 = "video/x-vnd.on2.vp8"
                goto L_0x023c
            L_0x0321:
                java.lang.String r16 = "video/av01"
                goto L_0x023c
            L_0x0325:
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x023c
            L_0x0329:
                java.lang.String r16 = "audio/ac3"
                goto L_0x023c
            L_0x032d:
                java.lang.String r1 = r0.f51081b
                byte[] r1 = r0.g(r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r2 = r0.f51090k
                N3.a$b r2 = N3.C6663a.e(r2)
                int r4 = r2.f38811a
                r0.f51071R = r4
                int r4 = r2.f38812b
                r0.f51069P = r4
                java.lang.String r2 = r2.f38813c
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x0237
            L_0x034b:
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x023c
            L_0x034f:
                java.lang.String r1 = r0.f51081b
                byte[] r1 = r0.g(r1)
                kb.v r1 = kb.C9967v.F(r1)
                r16 = r8
                goto L_0x0236
            L_0x035d:
                t3.B r1 = new t3.B
                java.lang.String r2 = r0.f51081b
                byte[] r2 = r0.g(r2)
                r1.<init>((byte[]) r2)
                N3.d r1 = N3.C6666d.b(r1)
                java.util.List<byte[]> r2 = r1.f38839a
                int r4 = r1.f38840b
                r0.f51079Z = r4
                java.lang.String r1 = r1.f38850l
                java.lang.String r16 = "video/avc"
                goto L_0x0265
            L_0x0378:
                r1 = 4
                byte[] r2 = new byte[r1]
                java.lang.String r4 = r0.f51081b
                byte[] r4 = r0.g(r4)
                r5 = 0
                java.lang.System.arraycopy(r4, r5, r2, r5, r1)
                kb.v r1 = kb.C9967v.F(r2)
                r16 = r7
            L_0x038b:
                r2 = r10
                goto L_0x0238
            L_0x038e:
                r5 = 0
                t3.B r1 = new t3.B
                java.lang.String r2 = r0.f51081b
                byte[] r2 = r0.g(r2)
                r1.<init>((byte[]) r2)
                android.util.Pair r1 = k(r1)
                java.lang.Object r2 = r1.first
                r16 = r2
                java.lang.String r16 = (java.lang.String) r16
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
                goto L_0x038b
            L_0x03a9:
                r5 = 0
                java.lang.String r16 = "audio/mpeg"
            L_0x03ac:
                r1 = r10
                r2 = r1
                r6 = 4096(0x1000, float:5.74E-42)
                goto L_0x0227
            L_0x03b2:
                r5 = 0
                java.lang.String r16 = "audio/mpeg-L2"
                goto L_0x03ac
            L_0x03b6:
                r5 = 0
                java.lang.String r1 = r0.f51081b
                byte[] r1 = r0.g(r1)
                java.util.List r1 = m(r1)
                java.lang.String r16 = "audio/vorbis"
                r6 = 8192(0x2000, float:1.14794E-41)
                r2 = r10
                goto L_0x0227
            L_0x03c8:
                r5 = 0
                N3.P r1 = new N3.P
                r1.<init>()
                r0.f51074U = r1
                java.lang.String r16 = "audio/true-hd"
                r1 = r10
                r2 = r1
                goto L_0x0238
            L_0x03d6:
                r5 = 0
                t3.B r1 = new t3.B
                java.lang.String r2 = r0.f51081b
                byte[] r2 = r0.g(r2)
                r1.<init>((byte[]) r2)
                boolean r1 = l(r1)
                if (r1 == 0) goto L_0x0417
                int r1 = r0.f51070Q
                int r1 = t3.N.f0(r1)
                if (r1 != 0) goto L_0x0412
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported PCM bit depth: "
                r1.append(r2)
                int r2 = r0.f51070Q
                r1.append(r2)
                r1.append(r6)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                t3.q.h(r4, r1)
            L_0x040c:
                r1 = r10
                r2 = r1
                r16 = r14
                goto L_0x0238
            L_0x0412:
                r14 = r1
                r1 = r10
                r2 = r1
                goto L_0x02ae
            L_0x0417:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r1.append(r2)
                r1.append(r14)
                java.lang.String r1 = r1.toString()
                t3.q.h(r4, r1)
                goto L_0x040c
            L_0x042c:
                r5 = 0
                byte[] r1 = r0.f51090k
                if (r1 != 0) goto L_0x0433
                r1 = r10
                goto L_0x0437
            L_0x0433:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x0437:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x038b
            L_0x043b:
                byte[] r4 = r0.f51068O
                if (r4 == 0) goto L_0x0450
                t3.B r4 = new t3.B
                byte[] r15 = r0.f51068O
                r4.<init>((byte[]) r15)
                N3.n r4 = N3.C6676n.a(r4)
                if (r4 == 0) goto L_0x0450
                java.lang.String r2 = r4.f38919c
                java.lang.String r16 = "video/dolby-vision"
            L_0x0450:
                r4 = r16
                boolean r15 = r0.f51076W
                boolean r3 = r0.f51075V
                if (r3 == 0) goto L_0x045a
                r3 = 2
                goto L_0x045b
            L_0x045a:
                r3 = r5
            L_0x045b:
                r3 = r3 | r15
                q3.s$b r15 = new q3.s$b
                r15.<init>()
                boolean r16 = q3.A.n(r4)
                if (r16 == 0) goto L_0x0479
                int r5 = r0.f51069P
                q3.s$b r5 = r15.Q(r5)
                int r7 = r0.f51071R
                q3.s$b r5 = r5.t0(r7)
                r5.m0(r14)
                r5 = 1
                goto L_0x05a0
            L_0x0479:
                boolean r14 = q3.A.q(r4)
                if (r14 == 0) goto L_0x0573
                int r7 = r0.f51097r
                if (r7 != 0) goto L_0x0495
                int r7 = r0.f51095p
                r8 = -1
                if (r7 != r8) goto L_0x048a
                int r7 = r0.f51092m
            L_0x048a:
                r0.f51095p = r7
                int r7 = r0.f51096q
                if (r7 != r8) goto L_0x0492
                int r7 = r0.f51093n
            L_0x0492:
                r0.f51096q = r7
                goto L_0x0496
            L_0x0495:
                r8 = -1
            L_0x0496:
                int r7 = r0.f51095p
                if (r7 == r8) goto L_0x04a8
                int r9 = r0.f51096q
                if (r9 == r8) goto L_0x04a8
                int r11 = r0.f51093n
                int r11 = r11 * r7
                float r7 = (float) r11
                int r11 = r0.f51092m
                int r11 = r11 * r9
                float r9 = (float) r11
                float r7 = r7 / r9
                goto L_0x04aa
            L_0x04a8:
                r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            L_0x04aa:
                boolean r9 = r0.f51104y
                if (r9 == 0) goto L_0x04dd
                byte[] r9 = r19.h()
                q3.i$b r10 = new q3.i$b
                r10.<init>()
                int r11 = r0.f51105z
                q3.i$b r10 = r10.d(r11)
                int r11 = r0.f51055B
                q3.i$b r10 = r10.c(r11)
                int r11 = r0.f51054A
                q3.i$b r10 = r10.e(r11)
                q3.i$b r9 = r10.f(r9)
                int r10 = r0.f51094o
                q3.i$b r9 = r9.g(r10)
                int r10 = r0.f51094o
                q3.i$b r9 = r9.b(r10)
                q3.i r10 = r9.a()
            L_0x04dd:
                java.lang.String r9 = r0.f51080a
                if (r9 == 0) goto L_0x04fd
                java.util.Map r9 = f4.e.f50996k0
                java.lang.String r11 = r0.f51080a
                boolean r9 = r9.containsKey(r11)
                if (r9 == 0) goto L_0x04fd
                java.util.Map r8 = f4.e.f50996k0
                java.lang.String r9 = r0.f51080a
                java.lang.Object r8 = r8.get(r9)
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
            L_0x04fd:
                int r9 = r0.f51098s
                if (r9 != 0) goto L_0x054d
                float r9 = r0.f51099t
                r11 = 0
                int r9 = java.lang.Float.compare(r9, r11)
                if (r9 != 0) goto L_0x054d
                float r9 = r0.f51100u
                int r9 = java.lang.Float.compare(r9, r11)
                if (r9 != 0) goto L_0x054d
                float r9 = r0.f51101v
                int r9 = java.lang.Float.compare(r9, r11)
                if (r9 != 0) goto L_0x051b
                goto L_0x054e
            L_0x051b:
                float r5 = r0.f51101v
                r9 = 1119092736(0x42b40000, float:90.0)
                int r5 = java.lang.Float.compare(r5, r9)
                if (r5 != 0) goto L_0x0528
                r5 = 90
                goto L_0x054e
            L_0x0528:
                float r5 = r0.f51101v
                r9 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r5 = java.lang.Float.compare(r5, r9)
                if (r5 == 0) goto L_0x054a
                float r5 = r0.f51101v
                r9 = 1127481344(0x43340000, float:180.0)
                int r5 = java.lang.Float.compare(r5, r9)
                if (r5 != 0) goto L_0x053d
                goto L_0x054a
            L_0x053d:
                float r5 = r0.f51101v
                r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r5 = java.lang.Float.compare(r5, r9)
                if (r5 != 0) goto L_0x054d
                r5 = 270(0x10e, float:3.78E-43)
                goto L_0x054e
            L_0x054a:
                r5 = 180(0xb4, float:2.52E-43)
                goto L_0x054e
            L_0x054d:
                r5 = r8
            L_0x054e:
                int r8 = r0.f51092m
                q3.s$b r8 = r15.x0(r8)
                int r9 = r0.f51093n
                q3.s$b r8 = r8.c0(r9)
                q3.s$b r7 = r8.o0(r7)
                q3.s$b r5 = r7.r0(r5)
                byte[] r7 = r0.f51102w
                q3.s$b r5 = r5.p0(r7)
                int r7 = r0.f51103x
                q3.s$b r5 = r5.v0(r7)
                r5.S(r10)
                r5 = 2
                goto L_0x05a0
            L_0x0573:
                boolean r5 = r13.equals(r4)
                if (r5 != 0) goto L_0x059f
                boolean r5 = r11.equals(r4)
                if (r5 != 0) goto L_0x059f
                boolean r5 = r12.equals(r4)
                if (r5 != 0) goto L_0x059f
                boolean r5 = r8.equals(r4)
                if (r5 != 0) goto L_0x059f
                boolean r5 = r9.equals(r4)
                if (r5 != 0) goto L_0x059f
                boolean r5 = r7.equals(r4)
                if (r5 == 0) goto L_0x0598
                goto L_0x059f
            L_0x0598:
                java.lang.String r1 = "Unexpected MIME type."
                q3.B r1 = q3.B.a(r1, r10)
                throw r1
            L_0x059f:
                r5 = 3
            L_0x05a0:
                java.lang.String r7 = r0.f51080a
                if (r7 == 0) goto L_0x05b5
                java.util.Map r7 = f4.e.f50996k0
                java.lang.String r8 = r0.f51080a
                boolean r7 = r7.containsKey(r8)
                if (r7 != 0) goto L_0x05b5
                java.lang.String r7 = r0.f51080a
                r15.g0(r7)
            L_0x05b5:
                r7 = r21
                q3.s$b r7 = r15.d0(r7)
                q3.s$b r4 = r7.s0(r4)
                q3.s$b r4 = r4.j0(r6)
                java.lang.String r6 = r0.f51077X
                q3.s$b r4 = r4.i0(r6)
                q3.s$b r3 = r4.u0(r3)
                q3.s$b r1 = r3.f0(r1)
                q3.s$b r1 = r1.R(r2)
                q3.n r2 = r0.f51091l
                q3.s$b r1 = r1.X(r2)
                q3.s r1 = r1.M()
                int r2 = r0.f51082c
                r3 = r20
                N3.O r2 = r3.t(r2, r5)
                r0.f51078Y = r2
                r2.e(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f4.e.c.i(N3.r, int):void");
        }

        public void j() {
            P p10 = this.f51074U;
            if (p10 != null) {
                p10.a(this.f51078Y, this.f51089j);
            }
        }

        public void n() {
            P p10 = this.f51074U;
            if (p10 != null) {
                p10.b();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f50996k0 = Collections.unmodifiableMap(hashMap);
    }

    public e(s.a aVar, int i10) {
        this(new C7842a(), i10, aVar);
    }

    private static boolean A(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c10 = 8;
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = 9;
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = 10;
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = 12;
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = 13;
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c10 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c10 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = ' ';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
            case BuildConfig.MIN_SDK_VERSION /*24*/:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C6678p[] C() {
        return new C6678p[]{new e(s.a.f54127a, 2)};
    }

    private boolean D(I i10, long j10) {
        if (this.f50997A) {
            this.f50999C = j10;
            i10.f38760a = this.f50998B;
            this.f50997A = false;
            return true;
        }
        if (this.f51050x) {
            long j11 = this.f50999C;
            if (j11 != -1) {
                i10.f38760a = j11;
                this.f50999C = -1;
                return true;
            }
        }
        return false;
    }

    private void E(C6679q qVar, int i10) {
        if (this.f51035i.g() < i10) {
            if (this.f51035i.b() < i10) {
                B b10 = this.f51035i;
                b10.c(Math.max(b10.b() * 2, i10));
            }
            qVar.readFully(this.f51035i.e(), this.f51035i.g(), i10 - this.f51035i.g());
            this.f51035i.V(i10);
        }
    }

    private void F() {
        this.f51017U = 0;
        this.f51018V = 0;
        this.f51019W = 0;
        this.f51020X = false;
        this.f51021Y = false;
        this.f51022Z = false;
        this.f51024a0 = 0;
        this.f51026b0 = 0;
        this.f51028c0 = false;
        this.f51038l.S(0);
    }

    private long G(long j10) {
        long j11 = this.f51046t;
        if (j11 != -9223372036854775807L) {
            return N.Z0(j10, j11, 1000);
        }
        throw q3.B.a("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    private static void H(String str, long j10, byte[] bArr) {
        int i10;
        byte[] bArr2;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                bArr2 = u(j10, "%01d:%02d:%02d:%02d", 10000);
                i10 = 21;
                break;
            case 1:
                bArr2 = u(j10, "%02d:%02d:%02d.%03d", 1000);
                i10 = 25;
                break;
            case 2:
                bArr2 = u(j10, "%02d:%02d:%02d,%03d", 1000);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
    }

    private int K(C6679q qVar, c cVar, int i10, boolean z10) {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f51081b)) {
            L(qVar, f50991f0, i10);
            return s();
        } else if ("S_TEXT/ASS".equals(cVar.f51081b)) {
            L(qVar, f50993h0, i10);
            return s();
        } else if ("S_TEXT/WEBVTT".equals(cVar.f51081b)) {
            L(qVar, f50994i0, i10);
            return s();
        } else {
            O o10 = cVar.f51078Y;
            boolean z11 = true;
            if (!this.f51020X) {
                if (cVar.f51087h) {
                    this.f51013Q &= -1073741825;
                    int i12 = 128;
                    if (!this.f51021Y) {
                        qVar.readFully(this.f51035i.e(), 0, 1);
                        this.f51017U++;
                        if ((this.f51035i.e()[0] & 128) != 128) {
                            this.f51026b0 = this.f51035i.e()[0];
                            this.f51021Y = true;
                        } else {
                            throw q3.B.a("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b10 = this.f51026b0;
                    if ((b10 & 1) == 1) {
                        boolean z12 = (b10 & 2) == 2;
                        this.f51013Q |= CatalogRepository.FETCH_FLAG_SDB;
                        if (!this.f51028c0) {
                            qVar.readFully(this.f51040n.e(), 0, 8);
                            this.f51017U += 8;
                            this.f51028c0 = true;
                            byte[] e10 = this.f51035i.e();
                            if (!z12) {
                                i12 = 0;
                            }
                            e10[0] = (byte) (i12 | 8);
                            this.f51035i.W(0);
                            o10.b(this.f51035i, 1, 1);
                            this.f51018V++;
                            this.f51040n.W(0);
                            o10.b(this.f51040n, 8, 1);
                            this.f51018V += 8;
                        }
                        if (z12) {
                            if (!this.f51022Z) {
                                qVar.readFully(this.f51035i.e(), 0, 1);
                                this.f51017U++;
                                this.f51035i.W(0);
                                this.f51024a0 = this.f51035i.H();
                                this.f51022Z = true;
                            }
                            int i13 = this.f51024a0 * 4;
                            this.f51035i.S(i13);
                            qVar.readFully(this.f51035i.e(), 0, i13);
                            this.f51017U += i13;
                            short s10 = (short) ((this.f51024a0 / 2) + 1);
                            int i14 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f51043q;
                            if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                this.f51043q = ByteBuffer.allocate(i14);
                            }
                            this.f51043q.position(0);
                            this.f51043q.putShort(s10);
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i11 = this.f51024a0;
                                if (i15 >= i11) {
                                    break;
                                }
                                int L10 = this.f51035i.L();
                                if (i15 % 2 == 0) {
                                    this.f51043q.putShort((short) (L10 - i16));
                                } else {
                                    this.f51043q.putInt(L10 - i16);
                                }
                                i15++;
                                i16 = L10;
                            }
                            int i17 = (i10 - this.f51017U) - i16;
                            if (i11 % 2 == 1) {
                                this.f51043q.putInt(i17);
                            } else {
                                this.f51043q.putShort((short) i17);
                                this.f51043q.putInt(0);
                            }
                            this.f51041o.U(this.f51043q.array(), i14);
                            o10.b(this.f51041o, i14, 1);
                            this.f51018V += i14;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f51088i;
                    if (bArr != null) {
                        this.f51038l.U(bArr, bArr.length);
                    }
                }
                if (cVar.o(z10)) {
                    this.f51013Q |= 268435456;
                    this.f51042p.S(0);
                    int g10 = (this.f51038l.g() + i10) - this.f51017U;
                    this.f51035i.S(4);
                    this.f51035i.e()[0] = (byte) ((g10 >> 24) & 255);
                    this.f51035i.e()[1] = (byte) ((g10 >> 16) & 255);
                    this.f51035i.e()[2] = (byte) ((g10 >> 8) & 255);
                    this.f51035i.e()[3] = (byte) (g10 & 255);
                    o10.b(this.f51035i, 4, 2);
                    this.f51018V += 4;
                }
                this.f51020X = true;
            }
            int g11 = i10 + this.f51038l.g();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f51081b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f51081b)) {
                if (cVar.f51074U != null) {
                    if (this.f51038l.g() != 0) {
                        z11 = false;
                    }
                    C5950a.g(z11);
                    cVar.f51074U.d(qVar);
                }
                while (true) {
                    int i18 = this.f51017U;
                    if (i18 >= g11) {
                        break;
                    }
                    int M10 = M(qVar, o10, g11 - i18);
                    this.f51017U += M10;
                    this.f51018V += M10;
                }
            } else {
                byte[] e11 = this.f51034h.e();
                e11[0] = 0;
                e11[1] = 0;
                e11[2] = 0;
                int i19 = cVar.f51079Z;
                int i20 = 4 - i19;
                while (this.f51017U < g11) {
                    int i21 = this.f51019W;
                    if (i21 == 0) {
                        N(qVar, e11, i20, i19);
                        this.f51017U += i19;
                        this.f51034h.W(0);
                        this.f51019W = this.f51034h.L();
                        this.f51033g.W(0);
                        o10.a(this.f51033g, 4);
                        this.f51018V += 4;
                    } else {
                        int M11 = M(qVar, o10, i21);
                        this.f51017U += M11;
                        this.f51018V += M11;
                        this.f51019W -= M11;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f51081b)) {
                this.f51036j.W(0);
                o10.a(this.f51036j, 4);
                this.f51018V += 4;
            }
            return s();
        }
    }

    private void L(C6679q qVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f51039m.b() < length) {
            this.f51039m.T(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f51039m.e(), 0, bArr.length);
        }
        qVar.readFully(this.f51039m.e(), bArr.length, i10);
        this.f51039m.W(0);
        this.f51039m.V(length);
    }

    private int M(C6679q qVar, O o10, int i10) {
        int a10 = this.f51038l.a();
        if (a10 <= 0) {
            return o10.d(qVar, i10, false);
        }
        int min = Math.min(i10, a10);
        o10.a(this.f51038l, min);
        return min;
    }

    private void N(C6679q qVar, byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.f51038l.a());
        qVar.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f51038l.l(bArr, i10, min);
        }
    }

    private void k(int i10) {
        if (this.f51001E == null || this.f51002F == null) {
            throw q3.B.a("Element " + i10 + " must be in a Cues", (Throwable) null);
        }
    }

    private void l(int i10) {
        if (this.f51049w == null) {
            throw q3.B.a("Element " + i10 + " must be in a TrackEntry", (Throwable) null);
        }
    }

    private void m() {
        C5950a.i(this.f51030d0);
    }

    private J o(r rVar, r rVar2) {
        int i10;
        if (this.f51045s == -1 || this.f51048v == -9223372036854775807L || rVar == null || rVar.d() == 0 || rVar2 == null || rVar2.d() != rVar.d()) {
            return new J.b(this.f51048v);
        }
        int d10 = rVar.d();
        int[] iArr = new int[d10];
        long[] jArr = new long[d10];
        long[] jArr2 = new long[d10];
        long[] jArr3 = new long[d10];
        int i11 = 0;
        for (int i12 = 0; i12 < d10; i12++) {
            jArr3[i12] = rVar.c(i12);
            jArr[i12] = this.f51045s + rVar2.c(i12);
        }
        while (true) {
            i10 = d10 - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArr[i11] = (int) (jArr[i13] - jArr[i11]);
            jArr2[i11] = jArr3[i13] - jArr3[i11];
            i11 = i13;
        }
        int i14 = i10;
        while (i14 > 0 && jArr3[i14] > this.f51048v) {
            i14--;
        }
        iArr[i14] = (int) ((this.f51045s + this.f51044r) - jArr[i14]);
        jArr2[i14] = this.f51048v - jArr3[i14];
        if (i14 < i10) {
            q.h("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
            int i15 = i14 + 1;
            iArr = Arrays.copyOf(iArr, i15);
            jArr = Arrays.copyOf(jArr, i15);
            jArr2 = Arrays.copyOf(jArr2, i15);
            jArr3 = Arrays.copyOf(jArr3, i15);
        }
        return new C6669g(iArr, jArr, jArr2, jArr3);
    }

    private void p(c cVar, long j10, int i10, int i11, int i12) {
        P p10 = cVar.f51074U;
        if (p10 != null) {
            p10.c(cVar.f51078Y, j10, i10, i11, i12, cVar.f51089j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f51081b) || "S_TEXT/ASS".equals(cVar.f51081b) || "S_TEXT/WEBVTT".equals(cVar.f51081b)) {
                if (this.f51009M > 1) {
                    q.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.f51007K;
                    if (j11 == -9223372036854775807L) {
                        q.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        H(cVar.f51081b, j11, this.f51039m.e());
                        int f10 = this.f51039m.f();
                        while (true) {
                            if (f10 >= this.f51039m.g()) {
                                break;
                            } else if (this.f51039m.e()[f10] == 0) {
                                this.f51039m.V(f10);
                                break;
                            } else {
                                f10++;
                            }
                        }
                        O o10 = cVar.f51078Y;
                        B b10 = this.f51039m;
                        o10.a(b10, b10.g());
                        i11 += this.f51039m.g();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.f51009M > 1) {
                    this.f51042p.S(0);
                } else {
                    int g10 = this.f51042p.g();
                    cVar.f51078Y.b(this.f51042p, g10, 2);
                    i11 += g10;
                }
            }
            cVar.f51078Y.c(j10, i10, i11, i12, cVar.f51089j);
        }
        this.f51004H = true;
    }

    private static int[] r(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int s() {
        int i10 = this.f51018V;
        F();
        return i10;
    }

    private static byte[] u(long j10, String str, long j11) {
        C5950a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        return N.s0(String.format(Locale.US, str, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))}));
    }

    /* access modifiers changed from: protected */
    public boolean B(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    /* access modifiers changed from: protected */
    public void I(int i10, long j10, long j11) {
        m();
        if (i10 == 160) {
            this.f51015S = false;
            this.f51016T = 0;
        } else if (i10 == 174) {
            this.f51049w = new c();
        } else if (i10 == 187) {
            this.f51003G = false;
        } else if (i10 == 19899) {
            this.f51051y = -1;
            this.f51052z = -1;
        } else if (i10 == 20533) {
            v(i10).f51087h = true;
        } else if (i10 == 21968) {
            v(i10).f51104y = true;
        } else if (i10 == 408125543) {
            long j12 = this.f51045s;
            if (j12 == -1 || j12 == j10) {
                this.f51045s = j10;
                this.f51044r = j11;
                return;
            }
            throw q3.B.a("Multiple Segment elements not supported", (Throwable) null);
        } else if (i10 == 475249515) {
            this.f51001E = new r();
            this.f51002F = new r();
        } else if (i10 != 524531317 || this.f51050x) {
        } else {
            if (!this.f51029d || this.f50998B == -1) {
                this.f51030d0.n(new J.b(this.f51048v));
                this.f51050x = true;
                return;
            }
            this.f50997A = true;
        }
    }

    /* access modifiers changed from: protected */
    public void J(int i10, String str) {
        if (i10 == 134) {
            v(i10).f51081b = str;
        } else if (i10 != 17026) {
            if (i10 == 21358) {
                v(i10).f51080a = str;
            } else if (i10 == 2274716) {
                String unused = v(i10).f51077X = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw q3.B.a("DocType " + str + " not supported", (Throwable) null);
        }
    }

    public void a(long j10, long j11) {
        this.f51000D = -9223372036854775807L;
        this.f51005I = 0;
        this.f51023a.a();
        this.f51025b.e();
        F();
        for (int i10 = 0; i10 < this.f51027c.size(); i10++) {
            this.f51027c.valueAt(i10).n();
        }
    }

    public final void b(N3.r rVar) {
        if (this.f51031e) {
            rVar = new t(rVar, this.f51032f);
        }
        this.f51030d0 = rVar;
    }

    public final boolean h(C6679q qVar) {
        return new f().b(qVar);
    }

    public final int j(C6679q qVar, I i10) {
        this.f51004H = false;
        boolean z10 = true;
        while (z10 && !this.f51004H) {
            z10 = this.f51023a.b(qVar);
            if (z10 && D(i10, qVar.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i11 = 0; i11 < this.f51027c.size(); i11++) {
            c valueAt = this.f51027c.valueAt(i11);
            valueAt.f();
            valueAt.j();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0231, code lost:
        throw q3.B.a("EBML lacing sample size out of range.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0282  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(int r22, int r23, N3.C6679q r24) {
        /*
            r21 = this;
            r7 = r21
            r0 = r22
            r1 = r23
            r8 = r24
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 163(0xa3, float:2.28E-43)
            r4 = 0
            r5 = 2
            r9 = 0
            r10 = 1
            if (r0 == r2) goto L_0x00c5
            if (r0 == r3) goto L_0x00c5
            r2 = 165(0xa5, float:2.31E-43)
            if (r0 == r2) goto L_0x00af
            r2 = 16877(0x41ed, float:2.365E-41)
            if (r0 == r2) goto L_0x00a6
            r2 = 16981(0x4255, float:2.3795E-41)
            if (r0 == r2) goto L_0x0098
            r2 = 18402(0x47e2, float:2.5787E-41)
            if (r0 == r2) goto L_0x0086
            r2 = 21419(0x53ab, float:3.0014E-41)
            if (r0 == r2) goto L_0x0062
            r2 = 25506(0x63a2, float:3.5742E-41)
            if (r0 == r2) goto L_0x0054
            r2 = 30322(0x7672, float:4.249E-41)
            if (r0 != r2) goto L_0x003e
            r21.l(r22)
            f4.e$c r0 = r7.f51049w
            byte[] r2 = new byte[r1]
            r0.f51102w = r2
            r8.readFully(r2, r9, r1)
            goto L_0x02ec
        L_0x003e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected id: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            q3.B r0 = q3.B.a(r0, r4)
            throw r0
        L_0x0054:
            r21.l(r22)
            f4.e$c r0 = r7.f51049w
            byte[] r2 = new byte[r1]
            r0.f51090k = r2
            r8.readFully(r2, r9, r1)
            goto L_0x02ec
        L_0x0062:
            t3.B r0 = r7.f51037k
            byte[] r0 = r0.e()
            java.util.Arrays.fill(r0, r9)
            t3.B r0 = r7.f51037k
            byte[] r0 = r0.e()
            int r2 = 4 - r1
            r8.readFully(r0, r2, r1)
            t3.B r0 = r7.f51037k
            r0.W(r9)
            t3.B r0 = r7.f51037k
            long r0 = r0.J()
            int r0 = (int) r0
            r7.f51051y = r0
            goto L_0x02ec
        L_0x0086:
            byte[] r2 = new byte[r1]
            r8.readFully(r2, r9, r1)
            f4.e$c r0 = r21.v(r22)
            N3.O$a r1 = new N3.O$a
            r1.<init>(r10, r2, r9, r9)
            r0.f51089j = r1
            goto L_0x02ec
        L_0x0098:
            r21.l(r22)
            f4.e$c r0 = r7.f51049w
            byte[] r2 = new byte[r1]
            r0.f51088i = r2
            r8.readFully(r2, r9, r1)
            goto L_0x02ec
        L_0x00a6:
            f4.e$c r0 = r21.v(r22)
            r7.x(r0, r8, r1)
            goto L_0x02ec
        L_0x00af:
            int r0 = r7.f51005I
            if (r0 == r5) goto L_0x00b4
            return
        L_0x00b4:
            android.util.SparseArray<f4.e$c> r0 = r7.f51027c
            int r2 = r7.f51011O
            java.lang.Object r0 = r0.get(r2)
            f4.e$c r0 = (f4.e.c) r0
            int r2 = r7.f51014R
            r7.y(r0, r2, r8, r1)
            goto L_0x02ec
        L_0x00c5:
            int r2 = r7.f51005I
            r6 = 8
            if (r2 != 0) goto L_0x00ea
            f4.g r2 = r7.f51025b
            long r11 = r2.d(r8, r9, r10, r6)
            int r2 = (int) r11
            r7.f51011O = r2
            f4.g r2 = r7.f51025b
            int r2 = r2.b()
            r7.f51012P = r2
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f51007K = r11
            r7.f51005I = r10
            t3.B r2 = r7.f51035i
            r2.S(r9)
        L_0x00ea:
            android.util.SparseArray<f4.e$c> r2 = r7.f51027c
            int r11 = r7.f51011O
            java.lang.Object r2 = r2.get(r11)
            r11 = r2
            f4.e$c r11 = (f4.e.c) r11
            if (r11 != 0) goto L_0x0101
            int r0 = r7.f51012P
            int r0 = r1 - r0
            r8.k(r0)
            r7.f51005I = r9
            return
        L_0x0101:
            r11.f()
            int r2 = r7.f51005I
            if (r2 != r10) goto L_0x02a3
            r2 = 3
            r7.E(r8, r2)
            t3.B r12 = r7.f51035i
            byte[] r12 = r12.e()
            byte r12 = r12[r5]
            r12 = r12 & 6
            int r12 = r12 >> r10
            r13 = 255(0xff, float:3.57E-43)
            if (r12 != 0) goto L_0x012f
            r7.f51009M = r10
            int[] r4 = r7.f51010N
            int[] r4 = r(r4, r10)
            r7.f51010N = r4
            int r12 = r7.f51012P
            int r1 = r1 - r12
            int r1 = r1 - r2
            r4[r9] = r1
        L_0x012b:
            r18 = r11
            goto L_0x0246
        L_0x012f:
            r14 = 4
            r7.E(r8, r14)
            t3.B r15 = r7.f51035i
            byte[] r15 = r15.e()
            byte r15 = r15[r2]
            r15 = r15 & r13
            int r15 = r15 + r10
            r7.f51009M = r15
            int[] r3 = r7.f51010N
            int[] r3 = r(r3, r15)
            r7.f51010N = r3
            if (r12 != r5) goto L_0x0154
            int r2 = r7.f51012P
            int r1 = r1 - r2
            int r1 = r1 - r14
            int r2 = r7.f51009M
            int r1 = r1 / r2
            java.util.Arrays.fill(r3, r9, r2, r1)
            goto L_0x012b
        L_0x0154:
            if (r12 != r10) goto L_0x018b
            r2 = r9
            r3 = r2
        L_0x0158:
            int r4 = r7.f51009M
            int r12 = r4 + -1
            if (r2 >= r12) goto L_0x0180
            int[] r4 = r7.f51010N
            r4[r2] = r9
        L_0x0162:
            int r4 = r14 + 1
            r7.E(r8, r4)
            t3.B r12 = r7.f51035i
            byte[] r12 = r12.e()
            byte r12 = r12[r14]
            r12 = r12 & r13
            int[] r14 = r7.f51010N
            r15 = r14[r2]
            int r15 = r15 + r12
            r14[r2] = r15
            if (r12 == r13) goto L_0x017e
            int r3 = r3 + r15
            int r2 = r2 + 1
            r14 = r4
            goto L_0x0158
        L_0x017e:
            r14 = r4
            goto L_0x0162
        L_0x0180:
            int[] r2 = r7.f51010N
            int r4 = r4 - r10
            int r12 = r7.f51012P
            int r1 = r1 - r12
            int r1 = r1 - r14
            int r1 = r1 - r3
            r2[r4] = r1
            goto L_0x012b
        L_0x018b:
            if (r12 != r2) goto L_0x028d
            r2 = r9
            r3 = r2
        L_0x018f:
            int r12 = r7.f51009M
            int r15 = r12 + -1
            if (r2 >= r15) goto L_0x0239
            int[] r12 = r7.f51010N
            r12[r2] = r9
            int r12 = r14 + 1
            r7.E(r8, r12)
            t3.B r15 = r7.f51035i
            byte[] r15 = r15.e()
            byte r15 = r15[r14]
            if (r15 == 0) goto L_0x0232
            r15 = r9
        L_0x01a9:
            if (r15 >= r6) goto L_0x01ff
            int r16 = 7 - r15
            int r5 = r10 << r16
            t3.B r9 = r7.f51035i
            byte[] r9 = r9.e()
            byte r9 = r9[r14]
            r9 = r9 & r5
            if (r9 == 0) goto L_0x01f5
            int r12 = r12 + r15
            r7.E(r8, r12)
            t3.B r9 = r7.f51035i
            byte[] r9 = r9.e()
            int r17 = r14 + 1
            byte r9 = r9[r14]
            r9 = r9 & r13
            int r5 = ~r5
            r5 = r5 & r9
            r18 = r11
            long r10 = (long) r5
            r5 = r17
        L_0x01d0:
            if (r5 >= r12) goto L_0x01e5
            long r10 = r10 << r6
            t3.B r14 = r7.f51035i
            byte[] r14 = r14.e()
            int r17 = r5 + 1
            byte r5 = r14[r5]
            r5 = r5 & r13
            long r13 = (long) r5
            long r10 = r10 | r13
            r5 = r17
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x01d0
        L_0x01e5:
            if (r2 <= 0) goto L_0x01f3
            int r15 = r15 * 7
            int r15 = r15 + 6
            r13 = 1
            long r19 = r13 << r15
            long r19 = r19 - r13
            long r10 = r10 - r19
        L_0x01f3:
            r14 = r12
            goto L_0x0204
        L_0x01f5:
            r18 = r11
            int r15 = r15 + 1
            r5 = 2
            r9 = 0
            r10 = 1
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x01a9
        L_0x01ff:
            r18 = r11
            r10 = 0
            goto L_0x01f3
        L_0x0204:
            r12 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x022b
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x022b
            int r5 = (int) r10
            int[] r10 = r7.f51010N
            if (r2 != 0) goto L_0x0218
            goto L_0x021d
        L_0x0218:
            int r11 = r2 + -1
            r11 = r10[r11]
            int r5 = r5 + r11
        L_0x021d:
            r10[r2] = r5
            int r3 = r3 + r5
            int r2 = r2 + 1
            r11 = r18
            r5 = 2
            r9 = 0
            r10 = 1
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x018f
        L_0x022b:
            java.lang.String r0 = "EBML lacing sample size out of range."
            q3.B r0 = q3.B.a(r0, r4)
            throw r0
        L_0x0232:
            java.lang.String r0 = "No valid varint length mask found"
            q3.B r0 = q3.B.a(r0, r4)
            throw r0
        L_0x0239:
            r18 = r11
            int[] r2 = r7.f51010N
            r4 = 1
            int r12 = r12 - r4
            int r4 = r7.f51012P
            int r1 = r1 - r4
            int r1 = r1 - r14
            int r1 = r1 - r3
            r2[r12] = r1
        L_0x0246:
            t3.B r1 = r7.f51035i
            byte[] r1 = r1.e()
            r2 = 0
            byte r1 = r1[r2]
            int r1 = r1 << r6
            t3.B r2 = r7.f51035i
            byte[] r2 = r2.e()
            r3 = 1
            byte r2 = r2[r3]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r1 = r1 | r2
            long r2 = r7.f51000D
            long r4 = (long) r1
            long r4 = r7.G(r4)
            long r2 = r2 + r4
            r7.f51006J = r2
            r10 = r18
            int r1 = r10.f51083d
            r2 = 2
            if (r1 == r2) goto L_0x0282
            r1 = 163(0xa3, float:2.28E-43)
            if (r0 != r1) goto L_0x0280
            t3.B r1 = r7.f51035i
            byte[] r1 = r1.e()
            byte r1 = r1[r2]
            r3 = 128(0x80, float:1.794E-43)
            r1 = r1 & r3
            if (r1 != r3) goto L_0x0280
            goto L_0x0282
        L_0x0280:
            r1 = 0
            goto L_0x0283
        L_0x0282:
            r1 = 1
        L_0x0283:
            r7.f51013Q = r1
            r7.f51005I = r2
            r1 = 0
            r7.f51008L = r1
            r1 = 163(0xa3, float:2.28E-43)
            goto L_0x02a5
        L_0x028d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected lacing value: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            q3.B r0 = q3.B.a(r0, r4)
            throw r0
        L_0x02a3:
            r10 = r11
            r1 = r3
        L_0x02a5:
            if (r0 != r1) goto L_0x02d5
        L_0x02a7:
            int r0 = r7.f51008L
            int r1 = r7.f51009M
            if (r0 >= r1) goto L_0x02d1
            int[] r1 = r7.f51010N
            r0 = r1[r0]
            r1 = 0
            int r5 = r7.K(r8, r10, r0, r1)
            long r0 = r7.f51006J
            int r2 = r7.f51008L
            int r3 = r10.f51084e
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = r7.f51013Q
            r6 = 0
            r0 = r21
            r1 = r10
            r0.p(r1, r2, r4, r5, r6)
            int r0 = r7.f51008L
            r1 = 1
            int r0 = r0 + r1
            r7.f51008L = r0
            goto L_0x02a7
        L_0x02d1:
            r0 = 0
            r7.f51005I = r0
            goto L_0x02ec
        L_0x02d5:
            r1 = 1
        L_0x02d6:
            int r0 = r7.f51008L
            int r2 = r7.f51009M
            if (r0 >= r2) goto L_0x02ec
            int[] r2 = r7.f51010N
            r3 = r2[r0]
            int r3 = r7.K(r8, r10, r3, r1)
            r2[r0] = r3
            int r0 = r7.f51008L
            int r0 = r0 + r1
            r7.f51008L = r0
            goto L_0x02d6
        L_0x02ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.e.n(int, int, N3.q):void");
    }

    /* access modifiers changed from: protected */
    public void q(int i10) {
        m();
        if (i10 != 160) {
            if (i10 == 174) {
                c cVar = (c) C5950a.i(this.f51049w);
                String str = cVar.f51081b;
                if (str != null) {
                    if (A(str)) {
                        cVar.i(this.f51030d0, cVar.f51082c);
                        this.f51027c.put(cVar.f51082c, cVar);
                    }
                    this.f51049w = null;
                    return;
                }
                throw q3.B.a("CodecId is missing in TrackEntry element", (Throwable) null);
            } else if (i10 == 19899) {
                int i11 = this.f51051y;
                if (i11 != -1) {
                    long j10 = this.f51052z;
                    if (j10 != -1) {
                        if (i11 == 475249515) {
                            this.f50998B = j10;
                            return;
                        }
                        return;
                    }
                }
                throw q3.B.a("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            } else if (i10 == 25152) {
                l(i10);
                c cVar2 = this.f51049w;
                if (!cVar2.f51087h) {
                    return;
                }
                if (cVar2.f51089j != null) {
                    cVar2.f51091l = new C5803n(new C5803n.b(C5797h.f28129a, "video/webm", this.f51049w.f51089j.f38778b));
                    return;
                }
                throw q3.B.a("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
            } else if (i10 == 28032) {
                l(i10);
                c cVar3 = this.f51049w;
                if (cVar3.f51087h && cVar3.f51088i != null) {
                    throw q3.B.a("Combining encryption and compression is not supported", (Throwable) null);
                }
            } else if (i10 == 357149030) {
                if (this.f51046t == -9223372036854775807L) {
                    this.f51046t = 1000000;
                }
                long j11 = this.f51047u;
                if (j11 != -9223372036854775807L) {
                    this.f51048v = G(j11);
                }
            } else if (i10 != 374648427) {
                if (i10 == 475249515) {
                    if (!this.f51050x) {
                        this.f51030d0.n(o(this.f51001E, this.f51002F));
                        this.f51050x = true;
                    }
                    this.f51001E = null;
                    this.f51002F = null;
                }
            } else if (this.f51027c.size() != 0) {
                this.f51030d0.r();
            } else {
                throw q3.B.a("No valid tracks were found", (Throwable) null);
            }
        } else if (this.f51005I == 2) {
            c cVar4 = this.f51027c.get(this.f51011O);
            cVar4.f();
            if (this.f51016T > 0 && "A_OPUS".equals(cVar4.f51081b)) {
                this.f51042p.T(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f51016T).array());
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.f51009M; i13++) {
                i12 += this.f51010N[i13];
            }
            int i14 = 0;
            while (i14 < this.f51009M) {
                long j12 = this.f51006J + ((long) ((cVar4.f51084e * i14) / 1000));
                int i15 = this.f51013Q;
                if (i14 == 0 && !this.f51015S) {
                    i15 |= 1;
                }
                int i16 = this.f51010N[i14];
                int i17 = i12 - i16;
                p(cVar4, j12, i15, i16, i17);
                i14++;
                i12 = i17;
            }
            this.f51005I = 0;
        }
    }

    public final void release() {
    }

    /* access modifiers changed from: protected */
    public void t(int i10, double d10) {
        if (i10 == 181) {
            v(i10).f51071R = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    v(i10).f51058E = (float) d10;
                    return;
                case 21970:
                    v(i10).f51059F = (float) d10;
                    return;
                case 21971:
                    v(i10).f51060G = (float) d10;
                    return;
                case 21972:
                    v(i10).f51061H = (float) d10;
                    return;
                case 21973:
                    v(i10).f51062I = (float) d10;
                    return;
                case 21974:
                    v(i10).f51063J = (float) d10;
                    return;
                case 21975:
                    v(i10).f51064K = (float) d10;
                    return;
                case 21976:
                    v(i10).f51065L = (float) d10;
                    return;
                case 21977:
                    v(i10).f51066M = (float) d10;
                    return;
                case 21978:
                    v(i10).f51067N = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            v(i10).f51099t = (float) d10;
                            return;
                        case 30324:
                            v(i10).f51100u = (float) d10;
                            return;
                        case 30325:
                            v(i10).f51101v = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f51047u = (long) d10;
        }
    }

    /* access modifiers changed from: protected */
    public c v(int i10) {
        l(i10);
        return this.f51049w;
    }

    /* access modifiers changed from: protected */
    public int w(int i10) {
        switch (i10) {
            case 131:
            case ModuleDescriptor.MODULE_VERSION:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void x(c cVar, C6679q qVar, int i10) {
        if (cVar.f51086g == 1685485123 || cVar.f51086g == 1685480259) {
            byte[] bArr = new byte[i10];
            cVar.f51068O = bArr;
            qVar.readFully(bArr, 0, i10);
            return;
        }
        qVar.k(i10);
    }

    /* access modifiers changed from: protected */
    public void y(c cVar, int i10, C6679q qVar, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f51081b)) {
            qVar.k(i11);
            return;
        }
        this.f51042p.S(i11);
        qVar.readFully(this.f51042p.e(), 0, i11);
    }

    /* access modifiers changed from: protected */
    public void z(int i10, long j10) {
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        v(i10).f51083d = (int) j10;
                        return;
                    case ModuleDescriptor.MODULE_VERSION:
                        c v10 = v(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        v10.f51076W = z10;
                        return;
                    case 155:
                        this.f51007K = G(j10);
                        return;
                    case 159:
                        v(i10).f51069P = (int) j10;
                        return;
                    case 176:
                        v(i10).f51092m = (int) j10;
                        return;
                    case 179:
                        k(i10);
                        this.f51001E.a(G(j10));
                        return;
                    case 186:
                        v(i10).f51093n = (int) j10;
                        return;
                    case 215:
                        v(i10).f51082c = (int) j10;
                        return;
                    case 231:
                        this.f51000D = G(j10);
                        return;
                    case 238:
                        this.f51014R = (int) j10;
                        return;
                    case 241:
                        if (!this.f51003G) {
                            k(i10);
                            this.f51002F.a(j10);
                            this.f51003G = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f51015S = true;
                        return;
                    case 16871:
                        int unused = v(i10).f51086g = (int) j10;
                        return;
                    case 16980:
                        if (j10 != 3) {
                            throw q3.B.a("ContentCompAlgo " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw q3.B.a("DocTypeReadVersion " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j10 != 1) {
                            throw q3.B.a("EBMLReadVersion " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j10 != 5) {
                            throw q3.B.a("ContentEncAlgo " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j10 != 1) {
                            throw q3.B.a("AESSettingsCipherMode " + j10 + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.f51052z = j10 + this.f51045s;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        l(i10);
                        if (i11 == 0) {
                            this.f51049w.f51103x = 0;
                            return;
                        } else if (i11 == 1) {
                            this.f51049w.f51103x = 2;
                            return;
                        } else if (i11 == 3) {
                            this.f51049w.f51103x = 1;
                            return;
                        } else if (i11 == 15) {
                            this.f51049w.f51103x = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        v(i10).f51095p = (int) j10;
                        return;
                    case 21682:
                        v(i10).f51097r = (int) j10;
                        return;
                    case 21690:
                        v(i10).f51096q = (int) j10;
                        return;
                    case 21930:
                        c v11 = v(i10);
                        if (j10 == 1) {
                            z10 = true;
                        }
                        v11.f51075V = z10;
                        return;
                    case 21938:
                        l(i10);
                        c cVar = this.f51049w;
                        cVar.f51104y = true;
                        cVar.f51094o = (int) j10;
                        return;
                    case 21998:
                        v(i10).f51085f = (int) j10;
                        return;
                    case 22186:
                        v(i10).f51072S = j10;
                        return;
                    case 22203:
                        v(i10).f51073T = j10;
                        return;
                    case 25188:
                        v(i10).f51070Q = (int) j10;
                        return;
                    case 30114:
                        this.f51016T = j10;
                        return;
                    case 30321:
                        l(i10);
                        int i12 = (int) j10;
                        if (i12 == 0) {
                            this.f51049w.f51098s = 0;
                            return;
                        } else if (i12 == 1) {
                            this.f51049w.f51098s = 1;
                            return;
                        } else if (i12 == 2) {
                            this.f51049w.f51098s = 2;
                            return;
                        } else if (i12 == 3) {
                            this.f51049w.f51098s = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        v(i10).f51084e = (int) j10;
                        return;
                    case 2807729:
                        this.f51046t = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                l(i10);
                                int i13 = (int) j10;
                                if (i13 == 1) {
                                    this.f51049w.f51055B = 2;
                                    return;
                                } else if (i13 == 2) {
                                    this.f51049w.f51055B = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                l(i10);
                                int k10 = C5798i.k((int) j10);
                                if (k10 != -1) {
                                    this.f51049w.f51054A = k10;
                                    return;
                                }
                                return;
                            case 21947:
                                l(i10);
                                this.f51049w.f51104y = true;
                                int j11 = C5798i.j((int) j10);
                                if (j11 != -1) {
                                    this.f51049w.f51105z = j11;
                                    return;
                                }
                                return;
                            case 21948:
                                v(i10).f51056C = (int) j10;
                                return;
                            case 21949:
                                v(i10).f51057D = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw q3.B.a("ContentEncodingScope " + j10 + " not supported", (Throwable) null);
            }
        } else if (j10 != 0) {
            throw q3.B.a("ContentEncodingOrder " + j10 + " not supported", (Throwable) null);
        }
    }

    e(C7844c cVar, int i10, s.a aVar) {
        this.f51045s = -1;
        this.f51046t = -9223372036854775807L;
        this.f51047u = -9223372036854775807L;
        this.f51048v = -9223372036854775807L;
        this.f50998B = -1;
        this.f50999C = -1;
        this.f51000D = -9223372036854775807L;
        this.f51023a = cVar;
        cVar.c(new b());
        this.f51032f = aVar;
        boolean z10 = false;
        this.f51029d = (i10 & 1) == 0;
        this.f51031e = (i10 & 2) == 0 ? true : z10;
        this.f51025b = new g();
        this.f51027c = new SparseArray<>();
        this.f51035i = new B(4);
        this.f51036j = new B(ByteBuffer.allocate(4).putInt(-1).array());
        this.f51037k = new B(4);
        this.f51033g = new B(u3.e.f30076a);
        this.f51034h = new B(4);
        this.f51038l = new B();
        this.f51039m = new B();
        this.f51040n = new B(8);
        this.f51041o = new B();
        this.f51042p = new B();
        this.f51010N = new int[1];
    }
}
