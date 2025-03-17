package A7;

import A7.a;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

public class e implements a {

    /* renamed from: u  reason: collision with root package name */
    private static final String f32733u = "e";

    /* renamed from: a  reason: collision with root package name */
    private int[] f32734a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f32735b;

    /* renamed from: c  reason: collision with root package name */
    private final a.C0503a f32736c;

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer f32737d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f32738e;

    /* renamed from: f  reason: collision with root package name */
    private short[] f32739f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f32740g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f32741h;

    /* renamed from: i  reason: collision with root package name */
    private byte[] f32742i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f32743j;

    /* renamed from: k  reason: collision with root package name */
    private int f32744k;

    /* renamed from: l  reason: collision with root package name */
    private c f32745l;

    /* renamed from: m  reason: collision with root package name */
    private Bitmap f32746m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f32747n;

    /* renamed from: o  reason: collision with root package name */
    private int f32748o;

    /* renamed from: p  reason: collision with root package name */
    private int f32749p;

    /* renamed from: q  reason: collision with root package name */
    private int f32750q;

    /* renamed from: r  reason: collision with root package name */
    private int f32751r;

    /* renamed from: s  reason: collision with root package name */
    private Boolean f32752s;

    /* renamed from: t  reason: collision with root package name */
    private Bitmap.Config f32753t;

    public e(a.C0503a aVar, c cVar, ByteBuffer byteBuffer, int i10) {
        this(aVar);
        q(cVar, byteBuffer, i10);
    }

    private int i(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f32749p + i10; i18++) {
            byte[] bArr = this.f32742i;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f32734a[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f32749p + i20; i21++) {
            byte[] bArr2 = this.f32742i;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f32734a[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    private void j(b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        b bVar2 = bVar;
        int[] iArr = this.f32743j;
        int i15 = bVar2.f32708d;
        int i16 = this.f32749p;
        int i17 = i15 / i16;
        int i18 = bVar2.f32706b / i16;
        int i19 = bVar2.f32707c / i16;
        int i20 = bVar2.f32705a / i16;
        boolean z10 = this.f32744k == 0;
        int i21 = this.f32751r;
        int i22 = this.f32750q;
        byte[] bArr = this.f32742i;
        int[] iArr2 = this.f32734a;
        Boolean bool = this.f32752s;
        int i23 = 8;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1;
        while (i25 < i17) {
            Boolean bool2 = bool;
            if (bVar2.f32709e) {
                if (i24 >= i17) {
                    int i27 = i26 + 1;
                    i10 = i17;
                    if (i27 == 2) {
                        i24 = 4;
                    } else if (i27 == 3) {
                        i23 = 4;
                        i26 = i27;
                        i24 = 2;
                    } else if (i27 == 4) {
                        i26 = i27;
                        i24 = 1;
                        i23 = 2;
                    }
                    i26 = i27;
                } else {
                    i10 = i17;
                }
                i11 = i24 + i23;
            } else {
                i10 = i17;
                i11 = i24;
                i24 = i25;
            }
            int i28 = i24 + i18;
            boolean z11 = i16 == 1;
            if (i28 < i22) {
                int i29 = i28 * i21;
                int i30 = i29 + i20;
                int i31 = i30 + i19;
                int i32 = i29 + i21;
                if (i32 < i31) {
                    i31 = i32;
                }
                i12 = i11;
                int i33 = i25 * i16 * bVar2.f32707c;
                if (z11) {
                    int i34 = i30;
                    while (i34 < i31) {
                        int i35 = i18;
                        int i36 = iArr2[bArr[i33] & 255];
                        if (i36 != 0) {
                            iArr[i34] = i36;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i34++;
                        i18 = i35;
                    }
                } else {
                    i14 = i18;
                    int i37 = ((i31 - i30) * i16) + i33;
                    int i38 = i30;
                    while (true) {
                        i13 = i19;
                        if (i38 >= i31) {
                            break;
                        }
                        int i39 = i(i33, i37, bVar2.f32707c);
                        if (i39 != 0) {
                            iArr[i38] = i39;
                        } else if (z10 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i33 += i16;
                        i38++;
                        i19 = i13;
                    }
                    bool = bool2;
                    i25++;
                    i18 = i14;
                    i17 = i10;
                    i19 = i13;
                    i24 = i12;
                }
            } else {
                i12 = i11;
            }
            i14 = i18;
            i13 = i19;
            bool = bool2;
            i25++;
            i18 = i14;
            i17 = i10;
            i19 = i13;
            i24 = i12;
        }
        Boolean bool3 = bool;
        if (this.f32752s == null) {
            this.f32752s = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
        }
    }

    private void k(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f32743j;
        int i10 = bVar2.f32708d;
        int i11 = bVar2.f32706b;
        int i12 = bVar2.f32707c;
        int i13 = bVar2.f32705a;
        boolean z10 = this.f32744k == 0;
        int i14 = this.f32751r;
        byte[] bArr = this.f32742i;
        int[] iArr2 = this.f32734a;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f32707c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int i22 = i10;
                byte b12 = b11 & 255;
                if (b12 != b10) {
                    int i23 = iArr2[b12];
                    if (i23 != 0) {
                        iArr[i21] = i23;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                b bVar3 = bVar;
                i10 = i22;
            }
            int i24 = i10;
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f32752s;
        this.f32752s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f32752s == null && z10 && b10 != -1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l(A7.b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f32737d
            int r3 = r1.f32714j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0017
            A7.c r1 = r0.f32745l
            int r2 = r1.f32721f
            int r1 = r1.f32722g
        L_0x0015:
            int r2 = r2 * r1
            goto L_0x001c
        L_0x0017:
            int r2 = r1.f32707c
            int r1 = r1.f32708d
            goto L_0x0015
        L_0x001c:
            byte[] r1 = r0.f32742i
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            A7.a$a r1 = r0.f32736c
            byte[] r1 = r1.b(r2)
            r0.f32742i = r1
        L_0x002b:
            byte[] r1 = r0.f32742i
            short[] r3 = r0.f32739f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f32739f = r3
        L_0x0037:
            short[] r3 = r0.f32739f
            byte[] r5 = r0.f32740g
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.f32740g = r5
        L_0x0041:
            byte[] r5 = r0.f32740g
            byte[] r6 = r0.f32741h
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f32741h = r6
        L_0x004d:
            byte[] r6 = r0.f32741h
            int r7 = r28.p()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = r13
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.f32738e
            r15 = -1
            r23 = r7
            r21 = r11
            r24 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r25 = r20
            r26 = r25
            r22 = r15
        L_0x0083:
            if (r13 >= r2) goto L_0x0090
            if (r16 != 0) goto L_0x0097
            int r16 = r28.o()
            if (r16 > 0) goto L_0x0095
            r3 = 3
            r0.f32748o = r3
        L_0x0090:
            r13 = r20
            r0 = 0
            goto L_0x014c
        L_0x0095:
            r17 = 0
        L_0x0097:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r0 = r22
            r15 = r23
            r22 = r7
            r7 = r26
        L_0x00b1:
            if (r4 < r15) goto L_0x0139
            r23 = r11
            r11 = r19 & r24
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c5
            r24 = r12
            r15 = r22
            r8 = r23
            r11 = r8
            r0 = -1
            goto L_0x00b1
        L_0x00c5:
            if (r11 != r10) goto L_0x00dc
            r18 = r4
            r26 = r7
            r21 = r8
            r7 = r22
            r11 = r23
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r22 = r0
            r23 = r15
            r15 = -1
        L_0x00d9:
            r0 = r28
            goto L_0x0083
        L_0x00dc:
            r26 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00f0
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r23
            r4 = r26
            goto L_0x00b1
        L_0x00f0:
            if (r11 < r8) goto L_0x00f9
            byte r7 = (byte) r7
            r6[r25] = r7
            int r25 = r25 + 1
            r7 = r0
            goto L_0x00fa
        L_0x00f9:
            r7 = r11
        L_0x00fa:
            if (r7 < r9) goto L_0x0105
            byte r21 = r5[r7]
            r6[r25] = r21
            int r25 = r25 + 1
            short r7 = r3[r7]
            goto L_0x00fa
        L_0x0105:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x010c:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r25 <= 0) goto L_0x0119
            int r25 = r25 + -1
            byte r27 = r6[r25]
            r1[r20] = r27
            goto L_0x010c
        L_0x0119:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x0130
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r24
            if (r0 != 0) goto L_0x0130
            if (r8 >= r6) goto L_0x0130
            int r15 = r15 + 1
            int r24 = r24 + r8
        L_0x0130:
            r0 = r11
            r11 = r23
            r4 = r26
            r6 = r27
            goto L_0x00b1
        L_0x0139:
            r26 = r4
            r21 = r8
            r23 = r15
            r18 = r26
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r15 = -1
            r26 = r7
            r7 = r22
            r22 = r0
            goto L_0x00d9
        L_0x014c:
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.e.l(A7.b):void");
    }

    private Bitmap n() {
        Boolean bool = this.f32752s;
        Bitmap c10 = this.f32736c.c(this.f32751r, this.f32750q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f32753t);
        c10.setHasAlpha(true);
        return c10;
    }

    private int o() {
        int p10 = p();
        if (p10 <= 0) {
            return p10;
        }
        ByteBuffer byteBuffer = this.f32737d;
        byteBuffer.get(this.f32738e, 0, Math.min(p10, byteBuffer.remaining()));
        return p10;
    }

    private int p() {
        return this.f32737d.get() & 255;
    }

    private Bitmap r(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f32743j;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f32746m;
            if (bitmap2 != null) {
                this.f32736c.a(bitmap2);
            }
            this.f32746m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f32711g == 3 && this.f32746m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f32711g) > 0) {
            if (i11 == 2) {
                if (!bVar.f32710f) {
                    c cVar = this.f32745l;
                    int i13 = cVar.f32727l;
                    if (bVar.f32715k == null || cVar.f32725j != bVar.f32712h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f32708d;
                int i15 = this.f32749p;
                int i16 = i14 / i15;
                int i17 = bVar2.f32706b / i15;
                int i18 = bVar2.f32707c / i15;
                int i19 = bVar2.f32705a / i15;
                int i20 = this.f32751r;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f32751r;
                }
            } else if (i11 == 3 && (bitmap = this.f32746m) != null) {
                int i25 = this.f32751r;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f32750q);
            }
        }
        l(bVar);
        if (bVar.f32709e || this.f32749p != 1) {
            j(bVar);
        } else {
            k(bVar);
        }
        if (this.f32747n && ((i10 = bVar.f32711g) == 0 || i10 == 1)) {
            if (this.f32746m == null) {
                this.f32746m = n();
            }
            Bitmap bitmap3 = this.f32746m;
            int i26 = this.f32751r;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f32750q);
        }
        Bitmap n10 = n();
        int i27 = this.f32751r;
        n10.setPixels(iArr, 0, i27, 0, 0, i27, this.f32750q);
        return n10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e7, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042 A[Catch:{ all -> 0x000e }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d0 A[Catch:{ all -> 0x000e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap a() {
        /*
            r8 = this;
            monitor-enter(r8)
            A7.c r0 = r8.f32745l     // Catch:{ all -> 0x000e }
            int r0 = r0.f32718c     // Catch:{ all -> 0x000e }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x0011
            int r0 = r8.f32744k     // Catch:{ all -> 0x000e }
            if (r0 >= 0) goto L_0x003d
            goto L_0x0011
        L_0x000e:
            r0 = move-exception
            goto L_0x00e8
        L_0x0011:
            java.lang.String r0 = f32733u     // Catch:{ all -> 0x000e }
            boolean r3 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x000e }
            if (r3 == 0) goto L_0x003b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x000e }
            r3.<init>()     // Catch:{ all -> 0x000e }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x000e }
            A7.c r4 = r8.f32745l     // Catch:{ all -> 0x000e }
            int r4 = r4.f32718c     // Catch:{ all -> 0x000e }
            r3.append(r4)     // Catch:{ all -> 0x000e }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x000e }
            int r4 = r8.f32744k     // Catch:{ all -> 0x000e }
            r3.append(r4)     // Catch:{ all -> 0x000e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x000e }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x000e }
        L_0x003b:
            r8.f32748o = r2     // Catch:{ all -> 0x000e }
        L_0x003d:
            int r0 = r8.f32748o     // Catch:{ all -> 0x000e }
            r3 = 0
            if (r0 == r2) goto L_0x00c8
            r4 = 2
            if (r0 != r4) goto L_0x0047
            goto L_0x00c8
        L_0x0047:
            r0 = 0
            r8.f32748o = r0     // Catch:{ all -> 0x000e }
            byte[] r5 = r8.f32738e     // Catch:{ all -> 0x000e }
            if (r5 != 0) goto L_0x0058
            A7.a$a r5 = r8.f32736c     // Catch:{ all -> 0x000e }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.b(r6)     // Catch:{ all -> 0x000e }
            r8.f32738e = r5     // Catch:{ all -> 0x000e }
        L_0x0058:
            A7.c r5 = r8.f32745l     // Catch:{ all -> 0x000e }
            java.util.List<A7.b> r5 = r5.f32720e     // Catch:{ all -> 0x000e }
            int r6 = r8.f32744k     // Catch:{ all -> 0x000e }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x000e }
            A7.b r5 = (A7.b) r5     // Catch:{ all -> 0x000e }
            int r6 = r8.f32744k     // Catch:{ all -> 0x000e }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0074
            A7.c r7 = r8.f32745l     // Catch:{ all -> 0x000e }
            java.util.List<A7.b> r7 = r7.f32720e     // Catch:{ all -> 0x000e }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x000e }
            A7.b r6 = (A7.b) r6     // Catch:{ all -> 0x000e }
            goto L_0x0075
        L_0x0074:
            r6 = r3
        L_0x0075:
            int[] r7 = r5.f32715k     // Catch:{ all -> 0x000e }
            if (r7 == 0) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            A7.c r7 = r8.f32745l     // Catch:{ all -> 0x000e }
            int[] r7 = r7.f32716a     // Catch:{ all -> 0x000e }
        L_0x007e:
            r8.f32734a = r7     // Catch:{ all -> 0x000e }
            if (r7 != 0) goto L_0x00a4
            java.lang.String r0 = f32733u     // Catch:{ all -> 0x000e }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x00a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x000e }
            r1.<init>()     // Catch:{ all -> 0x000e }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x000e }
            int r4 = r8.f32744k     // Catch:{ all -> 0x000e }
            r1.append(r4)     // Catch:{ all -> 0x000e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x000e }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x000e }
        L_0x00a0:
            r8.f32748o = r2     // Catch:{ all -> 0x000e }
            monitor-exit(r8)
            return r3
        L_0x00a4:
            boolean r1 = r5.f32710f     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x00c2
            int[] r1 = r8.f32735b     // Catch:{ all -> 0x000e }
            int r2 = r7.length     // Catch:{ all -> 0x000e }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x000e }
            int[] r1 = r8.f32735b     // Catch:{ all -> 0x000e }
            r8.f32734a = r1     // Catch:{ all -> 0x000e }
            int r2 = r5.f32712h     // Catch:{ all -> 0x000e }
            r1[r2] = r0     // Catch:{ all -> 0x000e }
            int r0 = r5.f32711g     // Catch:{ all -> 0x000e }
            if (r0 != r4) goto L_0x00c2
            int r0 = r8.f32744k     // Catch:{ all -> 0x000e }
            if (r0 != 0) goto L_0x00c2
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x000e }
            r8.f32752s = r0     // Catch:{ all -> 0x000e }
        L_0x00c2:
            android.graphics.Bitmap r0 = r8.r(r5, r6)     // Catch:{ all -> 0x000e }
            monitor-exit(r8)
            return r0
        L_0x00c8:
            java.lang.String r0 = f32733u     // Catch:{ all -> 0x000e }
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x00e6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x000e }
            r1.<init>()     // Catch:{ all -> 0x000e }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x000e }
            int r2 = r8.f32748o     // Catch:{ all -> 0x000e }
            r1.append(r2)     // Catch:{ all -> 0x000e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x000e }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x000e }
        L_0x00e6:
            monitor-exit(r8)
            return r3
        L_0x00e8:
            monitor-exit(r8)     // Catch:{ all -> 0x000e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.e.a():android.graphics.Bitmap");
    }

    public void b() {
        this.f32744k = (this.f32744k + 1) % this.f32745l.f32718c;
    }

    public int c() {
        return this.f32745l.f32718c;
    }

    public void clear() {
        this.f32745l = null;
        byte[] bArr = this.f32742i;
        if (bArr != null) {
            this.f32736c.e(bArr);
        }
        int[] iArr = this.f32743j;
        if (iArr != null) {
            this.f32736c.f(iArr);
        }
        Bitmap bitmap = this.f32746m;
        if (bitmap != null) {
            this.f32736c.a(bitmap);
        }
        this.f32746m = null;
        this.f32737d = null;
        this.f32752s = null;
        byte[] bArr2 = this.f32738e;
        if (bArr2 != null) {
            this.f32736c.e(bArr2);
        }
    }

    public void d(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f32753t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    public int e() {
        int i10;
        if (this.f32745l.f32718c <= 0 || (i10 = this.f32744k) < 0) {
            return 0;
        }
        return m(i10);
    }

    public void f() {
        this.f32744k = -1;
    }

    public int g() {
        return this.f32744k;
    }

    public ByteBuffer getData() {
        return this.f32737d;
    }

    public int h() {
        return this.f32737d.limit() + this.f32742i.length + (this.f32743j.length * 4);
    }

    public int m(int i10) {
        if (i10 >= 0) {
            c cVar = this.f32745l;
            if (i10 < cVar.f32718c) {
                return cVar.f32720e.get(i10).f32713i;
            }
        }
        return -1;
    }

    public synchronized void q(c cVar, ByteBuffer byteBuffer, int i10) {
        if (i10 > 0) {
            try {
                int highestOneBit = Integer.highestOneBit(i10);
                this.f32748o = 0;
                this.f32745l = cVar;
                this.f32744k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f32737d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f32737d.order(ByteOrder.LITTLE_ENDIAN);
                this.f32747n = false;
                Iterator<b> it = cVar.f32720e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f32711g == 3) {
                            this.f32747n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f32749p = highestOneBit;
                int i11 = cVar.f32721f;
                this.f32751r = i11 / highestOneBit;
                int i12 = cVar.f32722g;
                this.f32750q = i12 / highestOneBit;
                this.f32742i = this.f32736c.b(i11 * i12);
                this.f32743j = this.f32736c.d(this.f32751r * this.f32750q);
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
        }
    }

    public e(a.C0503a aVar) {
        this.f32735b = new int[256];
        this.f32753t = Bitmap.Config.ARGB_8888;
        this.f32736c = aVar;
        this.f32745l = new c();
    }
}
