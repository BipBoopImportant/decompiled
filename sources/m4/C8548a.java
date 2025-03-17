package m4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.oppwa.mobile.connect.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import k4.C8421e;
import k4.s;
import kb.C9967v;
import s3.a;
import t3.A;
import t3.B;
import t3.C5957h;
import t3.N;
import t3.q;

/* renamed from: m4.a  reason: case insensitive filesystem */
public final class C8548a implements s {

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f54916h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f54917i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    private static final byte[] f54918j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f54919a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f54920b;

    /* renamed from: c  reason: collision with root package name */
    private final Canvas f54921c = new Canvas();

    /* renamed from: d  reason: collision with root package name */
    private final b f54922d = new b(719, 575, 0, 719, 0, 575);

    /* renamed from: e  reason: collision with root package name */
    private final C0874a f54923e = new C0874a(0, f(), g(), h());

    /* renamed from: f  reason: collision with root package name */
    private final h f54924f;

    /* renamed from: g  reason: collision with root package name */
    private Bitmap f54925g;

    /* renamed from: m4.a$a  reason: collision with other inner class name */
    private static final class C0874a {

        /* renamed from: a  reason: collision with root package name */
        public final int f54926a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f54927b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f54928c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f54929d;

        public C0874a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f54926a = i10;
            this.f54927b = iArr;
            this.f54928c = iArr2;
            this.f54929d = iArr3;
        }
    }

    /* renamed from: m4.a$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f54930a;

        /* renamed from: b  reason: collision with root package name */
        public final int f54931b;

        /* renamed from: c  reason: collision with root package name */
        public final int f54932c;

        /* renamed from: d  reason: collision with root package name */
        public final int f54933d;

        /* renamed from: e  reason: collision with root package name */
        public final int f54934e;

        /* renamed from: f  reason: collision with root package name */
        public final int f54935f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f54930a = i10;
            this.f54931b = i11;
            this.f54932c = i12;
            this.f54933d = i13;
            this.f54934e = i14;
            this.f54935f = i15;
        }
    }

    /* renamed from: m4.a$c */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f54936a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f54937b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f54938c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f54939d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f54936a = i10;
            this.f54937b = z10;
            this.f54938c = bArr;
            this.f54939d = bArr2;
        }
    }

    /* renamed from: m4.a$d */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f54940a;

        /* renamed from: b  reason: collision with root package name */
        public final int f54941b;

        /* renamed from: c  reason: collision with root package name */
        public final int f54942c;

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<e> f54943d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f54940a = i10;
            this.f54941b = i11;
            this.f54942c = i12;
            this.f54943d = sparseArray;
        }
    }

    /* renamed from: m4.a$e */
    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f54944a;

        /* renamed from: b  reason: collision with root package name */
        public final int f54945b;

        public e(int i10, int i11) {
            this.f54944a = i10;
            this.f54945b = i11;
        }
    }

    /* renamed from: m4.a$f */
    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f54946a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f54947b;

        /* renamed from: c  reason: collision with root package name */
        public final int f54948c;

        /* renamed from: d  reason: collision with root package name */
        public final int f54949d;

        /* renamed from: e  reason: collision with root package name */
        public final int f54950e;

        /* renamed from: f  reason: collision with root package name */
        public final int f54951f;

        /* renamed from: g  reason: collision with root package name */
        public final int f54952g;

        /* renamed from: h  reason: collision with root package name */
        public final int f54953h;

        /* renamed from: i  reason: collision with root package name */
        public final int f54954i;

        /* renamed from: j  reason: collision with root package name */
        public final int f54955j;

        /* renamed from: k  reason: collision with root package name */
        public final SparseArray<g> f54956k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f54946a = i10;
            this.f54947b = z10;
            this.f54948c = i11;
            this.f54949d = i12;
            this.f54950e = i13;
            this.f54951f = i14;
            this.f54952g = i15;
            this.f54953h = i16;
            this.f54954i = i17;
            this.f54955j = i18;
            this.f54956k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f54956k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f54956k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* renamed from: m4.a$g */
    private static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f54957a;

        /* renamed from: b  reason: collision with root package name */
        public final int f54958b;

        /* renamed from: c  reason: collision with root package name */
        public final int f54959c;

        /* renamed from: d  reason: collision with root package name */
        public final int f54960d;

        /* renamed from: e  reason: collision with root package name */
        public final int f54961e;

        /* renamed from: f  reason: collision with root package name */
        public final int f54962f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f54957a = i10;
            this.f54958b = i11;
            this.f54959c = i12;
            this.f54960d = i13;
            this.f54961e = i14;
            this.f54962f = i15;
        }
    }

    /* renamed from: m4.a$h */
    private static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f54963a;

        /* renamed from: b  reason: collision with root package name */
        public final int f54964b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<f> f54965c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<C0874a> f54966d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<c> f54967e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray<C0874a> f54968f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray<c> f54969g = new SparseArray<>();

        /* renamed from: h  reason: collision with root package name */
        public b f54970h;

        /* renamed from: i  reason: collision with root package name */
        public d f54971i;

        public h(int i10, int i11) {
            this.f54963a = i10;
            this.f54964b = i11;
        }

        public void a() {
            this.f54965c.clear();
            this.f54966d.clear();
            this.f54967e.clear();
            this.f54968f.clear();
            this.f54969g.clear();
            this.f54970h = null;
            this.f54971i = null;
        }
    }

    public C8548a(List<byte[]> list) {
        B b10 = new B(list.get(0));
        int P10 = b10.P();
        int P11 = b10.P();
        Paint paint = new Paint();
        this.f54919a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f54920b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f54924f = new h(P10, P11);
    }

    private static byte[] e(int i10, int i11, A a10) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) a10.h(i11);
        }
        return bArr;
    }

    private static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = i(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                int i11 = 127;
                int i12 = (i10 & 1) != 0 ? 127 : 0;
                int i13 = (i10 & 2) != 0 ? 127 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = i(255, i12, i13, i11);
            }
        }
        return iArr;
    }

    private static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = 255;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = i(63, i12, i13, i11);
            } else {
                int i14 = i10 & ModuleDescriptor.MODULE_VERSION;
                int i15 = 170;
                int i16 = 85;
                if (i14 == 0) {
                    int i17 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i18 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        i16 = 0;
                    }
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = i(255, i17, i18, i16 + i15);
                } else if (i14 != 8) {
                    int i19 = 43;
                    if (i14 == 128) {
                        int i20 = ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0);
                        int i21 = ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i19 = 0;
                        }
                        int i22 = i19 + 127;
                        if ((i10 & 64) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = i(255, i20, i21, i22 + i16);
                    } else if (i14 == 136) {
                        int i23 = ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0);
                        int i24 = ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i19 = 0;
                        }
                        if ((i10 & 64) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = i(255, i23, i24, i19 + i16);
                    }
                } else {
                    int i25 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i26 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        i16 = 0;
                    }
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = i(127, i25, i26, i16 + i15);
                }
            }
        }
        return iArr;
    }

    private static int i(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int j(t3.A r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 2
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
            r12 = r5
            goto L_0x0060
        L_0x0014:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.h(r6)
            int r4 = r4 + r6
            int r3 = r13.h(r3)
        L_0x0024:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0060
        L_0x0028:
            boolean r4 = r13.g()
            if (r4 == 0) goto L_0x0032
            r11 = r2
            r12 = r5
        L_0x0030:
            r4 = r9
            goto L_0x0060
        L_0x0032:
            int r4 = r13.h(r3)
            if (r4 == 0) goto L_0x005e
            if (r4 == r5) goto L_0x005b
            if (r4 == r3) goto L_0x004f
            if (r4 == r6) goto L_0x0042
            r11 = r2
        L_0x003f:
            r4 = r9
            r12 = r4
            goto L_0x0060
        L_0x0042:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 29
            int r3 = r13.h(r3)
            goto L_0x0024
        L_0x004f:
            r4 = 4
            int r4 = r13.h(r4)
            int r4 = r4 + 12
            int r3 = r13.h(r3)
            goto L_0x0024
        L_0x005b:
            r11 = r2
            r12 = r3
            goto L_0x0030
        L_0x005e:
            r11 = r5
            goto L_0x003f
        L_0x0060:
            if (r12 == 0) goto L_0x007e
            if (r8 == 0) goto L_0x007e
            if (r15 == 0) goto L_0x0068
            byte r4 = r15[r4]
        L_0x0068:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x007e:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0082
            return r10
        L_0x0082:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.C8548a.j(t3.A, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int k(t3.A r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 4
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = r5
            goto L_0x006c
        L_0x0015:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 != 0) goto L_0x002c
            int r3 = r13.h(r6)
            if (r3 == 0) goto L_0x0028
            int r3 = r3 + 2
            r11 = r2
            r12 = r3
        L_0x0026:
            r4 = r9
            goto L_0x006c
        L_0x0028:
            r11 = r5
        L_0x0029:
            r4 = r9
            r12 = r4
            goto L_0x006c
        L_0x002c:
            boolean r4 = r13.g()
            r7 = 2
            if (r4 != 0) goto L_0x0040
            int r4 = r13.h(r7)
            int r4 = r4 + r3
            int r3 = r13.h(r3)
        L_0x003c:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x006c
        L_0x0040:
            int r4 = r13.h(r7)
            if (r4 == 0) goto L_0x0069
            if (r4 == r5) goto L_0x0066
            if (r4 == r7) goto L_0x005b
            if (r4 == r6) goto L_0x004e
            r11 = r2
            goto L_0x0029
        L_0x004e:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 25
            int r3 = r13.h(r3)
            goto L_0x003c
        L_0x005b:
            int r4 = r13.h(r3)
            int r4 = r4 + 9
            int r3 = r13.h(r3)
            goto L_0x003c
        L_0x0066:
            r11 = r2
            r12 = r7
            goto L_0x0026
        L_0x0069:
            r11 = r2
            r12 = r5
            goto L_0x0026
        L_0x006c:
            if (r12 == 0) goto L_0x008a
            if (r8 == 0) goto L_0x008a
            if (r15 == 0) goto L_0x0074
            byte r4 = r15[r4]
        L_0x0074:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x008a:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x008e
            return r10
        L_0x008e:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.C8548a.k(t3.A, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int l(t3.A r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 8
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = r5
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.g()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.h(r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = r9
            goto L_0x0035
        L_0x0026:
            r11 = r5
            r4 = r9
            r12 = r4
            goto L_0x0035
        L_0x002a:
            int r4 = r13.h(r6)
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.C8548a.l(t3.A, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static void m(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int i13 = i10;
        byte[] bArr5 = bArr;
        A a10 = new A(bArr);
        int i14 = i11;
        int i15 = i12;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        byte[] bArr8 = null;
        while (a10.b() != 0) {
            int h10 = a10.h(8);
            if (h10 != 240) {
                switch (h10) {
                    case 16:
                        if (i13 != 3) {
                            if (i13 != 2) {
                                bArr2 = null;
                                i14 = j(a10, iArr, bArr2, i14, i15, paint, canvas);
                                a10.c();
                                break;
                            } else {
                                bArr3 = bArr8 == null ? f54916h : bArr8;
                            }
                        } else {
                            bArr3 = bArr6 == null ? f54917i : bArr6;
                        }
                        bArr2 = bArr3;
                        i14 = j(a10, iArr, bArr2, i14, i15, paint, canvas);
                        a10.c();
                    case 17:
                        if (i13 == 3) {
                            bArr4 = bArr7 == null ? f54918j : bArr7;
                        } else {
                            bArr4 = null;
                        }
                        i14 = k(a10, iArr, bArr4, i14, i15, paint, canvas);
                        a10.c();
                        break;
                    case 18:
                        i14 = l(a10, iArr, (byte[]) null, i14, i15, paint, canvas);
                        break;
                    default:
                        switch (h10) {
                            case 32:
                                bArr8 = e(4, 4, a10);
                                break;
                            case BuildConfig.TARGET_SDK_VERSION /*33*/:
                                bArr6 = e(4, 8, a10);
                                break;
                            case 34:
                                bArr7 = e(16, 8, a10);
                                break;
                        }
                }
            } else {
                i15 += 2;
                i14 = i11;
            }
        }
    }

    private static void n(c cVar, C0874a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr = i10 == 3 ? aVar.f54929d : i10 == 2 ? aVar.f54928c : aVar.f54927b;
        int i13 = i10;
        int i14 = i11;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        m(cVar.f54938c, iArr, i13, i14, i12, paint2, canvas2);
        m(cVar.f54939d, iArr, i13, i14, i12 + 1, paint2, canvas2);
    }

    private C8421e o(A a10) {
        int i10;
        SparseArray<g> sparseArray;
        A a11 = a10;
        while (a10.b() >= 48 && a11.h(8) == 15) {
            u(a11, this.f54924f);
        }
        h hVar = this.f54924f;
        d dVar = hVar.f54971i;
        if (dVar == null) {
            return new C8421e(C9967v.E(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f54970h;
        if (bVar == null) {
            bVar = this.f54922d;
        }
        Bitmap bitmap = this.f54925g;
        if (!(bitmap != null && bVar.f54930a + 1 == bitmap.getWidth() && bVar.f54931b + 1 == this.f54925g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f54930a + 1, bVar.f54931b + 1, Bitmap.Config.ARGB_8888);
            this.f54925g = createBitmap;
            this.f54921c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f54943d;
        for (int i11 = 0; i11 < sparseArray2.size(); i11++) {
            this.f54921c.save();
            e valueAt = sparseArray2.valueAt(i11);
            f fVar = this.f54924f.f54965c.get(sparseArray2.keyAt(i11));
            int i12 = valueAt.f54944a + bVar.f54932c;
            int i13 = valueAt.f54945b + bVar.f54934e;
            this.f54921c.clipRect(i12, i13, Math.min(fVar.f54948c + i12, bVar.f54933d), Math.min(fVar.f54949d + i13, bVar.f54935f));
            C0874a aVar = this.f54924f.f54966d.get(fVar.f54952g);
            if (aVar == null && (aVar = this.f54924f.f54968f.get(fVar.f54952g)) == null) {
                aVar = this.f54923e;
            }
            SparseArray<g> sparseArray3 = fVar.f54956k;
            int i14 = 0;
            while (i14 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i14);
                g valueAt2 = sparseArray3.valueAt(i14);
                c cVar = this.f54924f.f54967e.get(keyAt);
                c cVar2 = cVar == null ? this.f54924f.f54969g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i10 = i14;
                    sparseArray = sparseArray3;
                    n(cVar2, aVar, fVar.f54951f, valueAt2.f54959c + i12, i13 + valueAt2.f54960d, cVar2.f54937b ? null : this.f54919a, this.f54921c);
                } else {
                    i10 = i14;
                    sparseArray = sparseArray3;
                }
                i14 = i10 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f54947b) {
                int i15 = fVar.f54951f;
                this.f54920b.setColor(i15 == 3 ? aVar.f54929d[fVar.f54953h] : i15 == 2 ? aVar.f54928c[fVar.f54954i] : aVar.f54927b[fVar.f54955j]);
                this.f54921c.drawRect((float) i12, (float) i13, (float) (fVar.f54948c + i12), (float) (fVar.f54949d + i13), this.f54920b);
            }
            arrayList.add(new a.b().f(Bitmap.createBitmap(this.f54925g, i12, i13, fVar.f54948c, fVar.f54949d)).k(((float) i12) / ((float) bVar.f54930a)).l(0).h(((float) i13) / ((float) bVar.f54931b), 0).i(0).n(((float) fVar.f54948c) / ((float) bVar.f54930a)).g(((float) fVar.f54949d) / ((float) bVar.f54931b)).a());
            this.f54921c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f54921c.restore();
        }
        return new C8421e(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static C0874a p(A a10, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        A a11 = a10;
        int i16 = 8;
        int h10 = a11.h(8);
        a11.r(8);
        int i17 = 2;
        int i18 = i10 - 2;
        int[] f10 = f();
        int[] g10 = g();
        int[] h11 = h();
        while (i18 > 0) {
            int h12 = a11.h(i16);
            int h13 = a11.h(i16);
            int[] iArr = (h13 & 128) != 0 ? f10 : (h13 & 64) != 0 ? g10 : h11;
            if ((h13 & 1) != 0) {
                i14 = a11.h(i16);
                i13 = a11.h(i16);
                i12 = a11.h(i16);
                i11 = a11.h(i16);
                i15 = i18 - 6;
            } else {
                i12 = a11.h(4) << 4;
                i15 = i18 - 4;
                int h14 = a11.h(4) << 4;
                i11 = a11.h(i17) << 6;
                i14 = a11.h(6) << i17;
                i13 = h14;
            }
            if (i14 == 0) {
                i11 = 255;
                i13 = 0;
                i12 = 0;
            }
            double d10 = (double) i14;
            double d11 = (double) (i13 - 128);
            double d12 = (double) (i12 - 128);
            iArr[h12] = i((byte) (255 - (i11 & 255)), N.p((int) (d10 + (1.402d * d11)), 0, 255), N.p((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), N.p((int) (d10 + (d12 * 1.772d)), 0, 255));
            i18 = i15;
            h10 = h10;
            i16 = 8;
            i17 = 2;
        }
        return new C0874a(h10, f10, g10, h11);
    }

    private static b q(A a10) {
        int i10;
        int i11;
        int i12;
        int i13;
        a10.r(4);
        boolean g10 = a10.g();
        a10.r(3);
        int h10 = a10.h(16);
        int h11 = a10.h(16);
        if (g10) {
            int h12 = a10.h(16);
            int h13 = a10.h(16);
            int h14 = a10.h(16);
            i10 = a10.h(16);
            i12 = h13;
            i11 = h14;
            i13 = h12;
        } else {
            i13 = 0;
            i11 = 0;
            i12 = h10;
            i10 = h11;
        }
        return new b(h10, h11, i13, i12, i11, i10);
    }

    private static c r(A a10) {
        byte[] bArr;
        int h10 = a10.h(16);
        a10.r(4);
        int h11 = a10.h(2);
        boolean g10 = a10.g();
        a10.r(1);
        byte[] bArr2 = N.f29467f;
        if (h11 == 1) {
            a10.r(a10.h(8) * 16);
        } else if (h11 == 0) {
            int h12 = a10.h(16);
            int h13 = a10.h(16);
            if (h12 > 0) {
                bArr2 = new byte[h12];
                a10.k(bArr2, 0, h12);
            }
            if (h13 > 0) {
                bArr = new byte[h13];
                a10.k(bArr, 0, h13);
                return new c(h10, g10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h10, g10, bArr2, bArr);
    }

    private static d s(A a10, int i10) {
        int h10 = a10.h(8);
        int h11 = a10.h(4);
        int h12 = a10.h(2);
        a10.r(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int h13 = a10.h(8);
            a10.r(8);
            i11 -= 6;
            sparseArray.put(h13, new e(a10.h(16), a10.h(16)));
        }
        return new d(h10, h11, h12, sparseArray);
    }

    private static f t(A a10, int i10) {
        int i11;
        int i12;
        int i13;
        A a11 = a10;
        int h10 = a11.h(8);
        a11.r(4);
        boolean g10 = a10.g();
        a11.r(3);
        int i14 = 16;
        int h11 = a11.h(16);
        int h12 = a11.h(16);
        int h13 = a11.h(3);
        int h14 = a11.h(3);
        int i15 = 2;
        a11.r(2);
        int h15 = a11.h(8);
        int h16 = a11.h(8);
        int h17 = a11.h(4);
        int h18 = a11.h(2);
        a11.r(2);
        int i16 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i16 > 0) {
            int h19 = a11.h(i14);
            int h20 = a11.h(i15);
            int h21 = a11.h(i15);
            int h22 = a11.h(12);
            int i17 = h18;
            a11.r(4);
            int h23 = a11.h(12);
            int i18 = i16 - 6;
            if (h20 != 1) {
                i13 = 2;
                if (h20 != 2) {
                    i12 = 0;
                    i11 = 0;
                    i16 = i18;
                    sparseArray.put(h19, new g(h20, h21, h22, h23, i12, i11));
                    i15 = i13;
                    h18 = i17;
                    i14 = 16;
                }
            } else {
                i13 = 2;
            }
            i16 -= 8;
            i12 = a11.h(8);
            i11 = a11.h(8);
            sparseArray.put(h19, new g(h20, h21, h22, h23, i12, i11));
            i15 = i13;
            h18 = i17;
            i14 = 16;
        }
        return new f(h10, g10, h11, h12, h13, h14, h15, h16, h17, h18, sparseArray);
    }

    private static void u(A a10, h hVar) {
        f fVar;
        int h10 = a10.h(8);
        int h11 = a10.h(16);
        int h12 = a10.h(16);
        int d10 = a10.d() + h12;
        if (h12 * 8 > a10.b()) {
            q.h("DvbParser", "Data field length exceeds limit");
            a10.r(a10.b());
            return;
        }
        switch (h10) {
            case 16:
                if (h11 == hVar.f54963a) {
                    d dVar = hVar.f54971i;
                    d s10 = s(a10, h12);
                    if (s10.f54942c == 0) {
                        if (!(dVar == null || dVar.f54941b == s10.f54941b)) {
                            hVar.f54971i = s10;
                            break;
                        }
                    } else {
                        hVar.f54971i = s10;
                        hVar.f54965c.clear();
                        hVar.f54966d.clear();
                        hVar.f54967e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f54971i;
                if (h11 == hVar.f54963a && dVar2 != null) {
                    f t10 = t(a10, h12);
                    if (dVar2.f54942c == 0 && (fVar = hVar.f54965c.get(t10.f54946a)) != null) {
                        t10.a(fVar);
                    }
                    hVar.f54965c.put(t10.f54946a, t10);
                    break;
                }
            case 18:
                if (h11 != hVar.f54963a) {
                    if (h11 == hVar.f54964b) {
                        C0874a p10 = p(a10, h12);
                        hVar.f54968f.put(p10.f54926a, p10);
                        break;
                    }
                } else {
                    C0874a p11 = p(a10, h12);
                    hVar.f54966d.put(p11.f54926a, p11);
                    break;
                }
                break;
            case 19:
                if (h11 != hVar.f54963a) {
                    if (h11 == hVar.f54964b) {
                        c r10 = r(a10);
                        hVar.f54969g.put(r10.f54936a, r10);
                        break;
                    }
                } else {
                    c r11 = r(a10);
                    hVar.f54967e.put(r11.f54936a, r11);
                    break;
                }
                break;
            case 20:
                if (h11 == hVar.f54963a) {
                    hVar.f54970h = q(a10);
                    break;
                }
                break;
        }
        a10.s(d10 - a10.d());
    }

    public void a() {
        this.f54924f.a();
    }

    public void c(byte[] bArr, int i10, int i11, s.b bVar, C5957h<C8421e> hVar) {
        A a10 = new A(bArr, i11 + i10);
        a10.p(i10);
        hVar.accept(o(a10));
    }

    public int d() {
        return 2;
    }
}
