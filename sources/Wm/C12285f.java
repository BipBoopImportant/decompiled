package wm;

import com.adjust.sdk.Constants;
import kotlin.Metadata;
import od.C10105b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JI\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lwm/f;", "", "<init>", "()V", "Lod/b;", "bitMatrix", "", "leftToRight", "", "c", "(Lod/b;Z)I", "topToBottom", "d", "", "charSequence", "", "b", "(Ljava/lang/CharSequence;)Ljava/lang/String;", "value", "Lld/a;", "format", "widthInPixel", "heightInPixel", "trimBoundaries", "margin", "useHighLevelErrorCorrection", "Landroid/graphics/Bitmap;", "a", "(Ljava/lang/String;Lld/a;IIZIZ)Landroid/graphics/Bitmap;", "barcode-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wm.f  reason: case insensitive filesystem */
public final class C12285f {

    /* renamed from: a  reason: collision with root package name */
    public static final C12285f f105878a = new C12285f();

    private C12285f() {
    }

    private final String b(CharSequence charSequence) {
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (charSequence.charAt(i10) > 255) {
                return Constants.ENCODING;
            }
        }
        return null;
    }

    private final int c(C10105b bVar, boolean z10) {
        if (bVar == null) {
            return -1;
        }
        int f10 = bVar.f();
        int e10 = bVar.e();
        if (z10) {
            for (int i10 = 0; i10 < f10; i10++) {
                for (int i11 = 0; i11 < e10; i11++) {
                    if (bVar.d(i10, i11)) {
                        return i10;
                    }
                }
            }
            return -1;
        }
        for (int i12 = f10 - 1; -1 < i12; i12--) {
            for (int i13 = 0; i13 < e10; i13++) {
                if (bVar.d(i12, i13)) {
                    return i12;
                }
            }
        }
        return -1;
    }

    private final int d(C10105b bVar, boolean z10) {
        if (bVar == null) {
            return -1;
        }
        int f10 = bVar.f();
        int e10 = bVar.e();
        if (z10) {
            for (int i10 = 0; i10 < e10; i10++) {
                for (int i11 = 0; i11 < f10; i11++) {
                    if (bVar.d(i11, i10)) {
                        return i10;
                    }
                }
            }
            return -1;
        }
        for (int i12 = e10 - 1; -1 < i12; i12--) {
            for (int i13 = 0; i13 < f10; i13++) {
                if (bVar.d(i13, i12)) {
                    return i12;
                }
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x027d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap a(java.lang.String r35, ld.C10008a r36, int r37, int r38, boolean r39, int r40, boolean r41) {
        /*
            r34 = this;
            r1 = r34
            r8 = r35
            r9 = r36
            java.lang.String r10 = "|"
            java.lang.String r11 = "b"
            java.lang.String r12 = "m"
            java.lang.String r13 = "main"
            java.lang.String r14 = "Kt"
            java.lang.Class<wm.f> r15 = wm.C12285f.class
            java.lang.String r7 = ") could not be generated from "
            java.lang.String r6 = "Barcode ("
            java.lang.String r0 = "format"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r5 = 0
            if (r8 != 0) goto L_0x001f
            return r5
        L_0x001f:
            r4 = 46
            r3 = 36
            r2 = 2
            r16 = r7
            r7 = 1
            java.lang.String r0 = " "
            java.lang.String r17 = ""
            r18 = 4
            r19 = 0
            r20 = 0
            r2 = r35
            r3 = r0
            r4 = r17
            r5 = r20
            r25 = r6
            r6 = r18
            r17 = r11
            r11 = r16
            r16 = r12
            r12 = r7
            r7 = r19
            java.lang.String r26 = HJ.C15854t.Q(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x006a }
            java.lang.String r27 = "-"
            java.lang.String r28 = ""
            r30 = 4
            r31 = 0
            r29 = 0
            java.lang.String r7 = HJ.C15854t.Q(r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x006a }
            java.util.EnumMap r0 = new java.util.EnumMap     // Catch:{ Exception -> 0x006a }
            java.lang.Class<ld.c> r2 = ld.C10010c.class
            r0.<init>(r2)     // Catch:{ Exception -> 0x006a }
            if (r40 < 0) goto L_0x006f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r40)     // Catch:{ Exception -> 0x006a }
            ld.c r3 = ld.C10010c.MARGIN     // Catch:{ Exception -> 0x006a }
            r0.put(r3, r2)     // Catch:{ Exception -> 0x006a }
            goto L_0x006f
        L_0x006a:
            r0 = move-exception
        L_0x006b:
            r1 = r25
            goto L_0x0246
        L_0x006f:
            java.lang.String r2 = r1.b(r7)     // Catch:{ Exception -> 0x006a }
            if (r2 == 0) goto L_0x007a
            ld.c r3 = ld.C10010c.CHARACTER_SET     // Catch:{ Exception -> 0x006a }
            r0.put(r3, r2)     // Catch:{ Exception -> 0x006a }
        L_0x007a:
            if (r41 == 0) goto L_0x0083
            ld.c r2 = ld.C10010c.ERROR_CORRECTION     // Catch:{ Exception -> 0x006a }
            wd.a r3 = wd.C10359a.H     // Catch:{ Exception -> 0x006a }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x006a }
        L_0x0083:
            ld.e r2 = new ld.e     // Catch:{ Exception -> 0x006a }
            r2.<init>()     // Catch:{ Exception -> 0x006a }
            r3 = r7
            r4 = r36
            r5 = r37
            r6 = r38
            r32 = r7
            r7 = r0
            od.b r0 = r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0141 }
            kotlin.jvm.internal.C17542s.g(r0)     // Catch:{ Exception -> 0x0141 }
            int r2 = r0.f()     // Catch:{ Exception -> 0x013d }
            int r2 = r2 - r12
            int r3 = r0.f()     // Catch:{ Exception -> 0x013d }
            int r4 = r0.e()     // Catch:{ Exception -> 0x013d }
            int r4 = r4 - r12
            int r5 = r0.e()     // Catch:{ Exception -> 0x013d }
            r6 = 0
            if (r39 == 0) goto L_0x00c8
            int r2 = r1.c(r0, r12)     // Catch:{ Exception -> 0x006a }
            int r3 = r1.c(r0, r6)     // Catch:{ Exception -> 0x006a }
            int r4 = r3 - r2
            int r4 = r4 + r12
            int r5 = r1.d(r0, r12)     // Catch:{ Exception -> 0x006a }
            int r7 = r1.d(r0, r6)     // Catch:{ Exception -> 0x006a }
            int r18 = r7 - r5
            int r18 = r18 + 1
            r6 = r18
            goto L_0x00ce
        L_0x00c8:
            r7 = r4
            r4 = r3
            r3 = r2
            r2 = r6
            r6 = r5
            r5 = r2
        L_0x00ce:
            if (r4 < 0) goto L_0x00dc
            if (r2 < 0) goto L_0x00dc
            int r12 = r4 + -1
            if (r2 > r12) goto L_0x00dc
            if (r3 < 0) goto L_0x00dc
            int r12 = r3 - r2
            if (r12 >= 0) goto L_0x00de
        L_0x00dc:
            r1 = 0
            goto L_0x013c
        L_0x00de:
            if (r6 < 0) goto L_0x00ec
            if (r5 < 0) goto L_0x00ec
            int r12 = r6 + -1
            if (r5 > r12) goto L_0x00ec
            if (r7 < 0) goto L_0x00ec
            int r12 = r7 - r5
            if (r12 >= 0) goto L_0x00ee
        L_0x00ec:
            r1 = 0
            goto L_0x013c
        L_0x00ee:
            int r12 = r4 * r6
            int[] r12 = new int[r12]     // Catch:{ Exception -> 0x006a }
            if (r5 > r7) goto L_0x011c
            r19 = 0
        L_0x00f6:
            int r20 = r19 * r4
            if (r2 > r3) goto L_0x0113
            r1 = r2
            r26 = 0
        L_0x00fd:
            int r27 = r20 + r26
            boolean r28 = r0.d(r1, r5)     // Catch:{ Exception -> 0x006a }
            if (r28 == 0) goto L_0x0108
            r28 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x010a
        L_0x0108:
            r28 = 0
        L_0x010a:
            r12[r27] = r28     // Catch:{ Exception -> 0x006a }
            int r26 = r26 + 1
            if (r1 == r3) goto L_0x0113
            int r1 = r1 + 1
            goto L_0x00fd
        L_0x0113:
            int r19 = r19 + 1
            if (r5 == r7) goto L_0x011c
            int r5 = r5 + 1
            r1 = r34
            goto L_0x00f6
        L_0x011c:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x006a }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r4, r6, r0)     // Catch:{ Exception -> 0x006a }
            java.lang.String r0 = "createBitmap(...)"
            kotlin.jvm.internal.C17542s.i(r5, r0)     // Catch:{ Exception -> 0x006a }
            r30 = 0
            r31 = 0
            r28 = 0
            r26 = r5
            r27 = r12
            r29 = r4
            r32 = r4
            r33 = r6
            r26.setPixels(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ Exception -> 0x006a }
            goto L_0x031d
        L_0x013c:
            return r1
        L_0x013d:
            r0 = move-exception
            r1 = 0
            goto L_0x006b
        L_0x0141:
            r0 = move-exception
            r1 = 0
            qv.e r12 = qv.e.DEBUG     // Catch:{ Exception -> 0x006a }
            qv.d r2 = qv.d.f102012a     // Catch:{ Exception -> 0x006a }
            java.util.List r2 = r2.a()     // Catch:{ Exception -> 0x006a }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ Exception -> 0x006a }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x006a }
            r3.<init>()     // Catch:{ Exception -> 0x006a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x006a }
        L_0x0156:
            boolean r4 = r2.hasNext()     // Catch:{ Exception -> 0x006a }
            r7 = 0
            if (r4 == 0) goto L_0x016e
            java.lang.Object r4 = r2.next()     // Catch:{ Exception -> 0x006a }
            r5 = r4
            qv.b r5 = (qv.C11819b) r5     // Catch:{ Exception -> 0x006a }
            boolean r5 = r5.b(r12, r7)     // Catch:{ Exception -> 0x006a }
            if (r5 == 0) goto L_0x0156
            r3.add(r4)     // Catch:{ Exception -> 0x006a }
            goto L_0x0156
        L_0x016e:
            java.util.Iterator r19 = r3.iterator()     // Catch:{ Exception -> 0x006a }
            r2 = r1
            r5 = r2
        L_0x0174:
            boolean r3 = r19.hasNext()     // Catch:{ Exception -> 0x006a }
            if (r3 == 0) goto L_0x023d
            java.lang.Object r3 = r19.next()     // Catch:{ Exception -> 0x006a }
            qv.b r3 = (qv.C11819b) r3     // Catch:{ Exception -> 0x006a }
            if (r5 != 0) goto L_0x01c0
            java.lang.String r4 = r0.getMessage()     // Catch:{ Exception -> 0x01bc }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01bc }
            r5.<init>()     // Catch:{ Exception -> 0x01bc }
            r7 = r25
            r5.append(r7)     // Catch:{ Exception -> 0x01b8 }
            r5.append(r9)     // Catch:{ Exception -> 0x01b8 }
            r5.append(r11)     // Catch:{ Exception -> 0x01b8 }
            r1 = r32
            r5.append(r1)     // Catch:{ Exception -> 0x01b8 }
            java.lang.String r6 = " : "
            r5.append(r6)     // Catch:{ Exception -> 0x01b8 }
            r5.append(r4)     // Catch:{ Exception -> 0x01b8 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x01b8 }
            r5 = 0
            java.lang.String r4 = qv.C11818a.a(r4, r5)     // Catch:{ Exception -> 0x01b8 }
            if (r4 != 0) goto L_0x01b1
            r1 = 0
            goto L_0x023d
        L_0x01b1:
            java.lang.String r4 = qv.C11820c.a(r4)     // Catch:{ Exception -> 0x01b8 }
            r20 = r4
            goto L_0x01c6
        L_0x01b8:
            r0 = move-exception
        L_0x01b9:
            r1 = r7
            goto L_0x0246
        L_0x01bc:
            r0 = move-exception
            r7 = r25
            goto L_0x01b9
        L_0x01c0:
            r7 = r25
            r1 = r32
            r20 = r5
        L_0x01c6:
            if (r2 != 0) goto L_0x0218
            java.lang.String r2 = r15.getName()     // Catch:{ Exception -> 0x0215 }
            kotlin.jvm.internal.C17542s.g(r2)     // Catch:{ Exception -> 0x0215 }
            r39 = r0
            r4 = 0
            r5 = 2
            r6 = 36
            java.lang.String r0 = HJ.C15854t.s1(r2, r6, r4, r5, r4)     // Catch:{ Exception -> 0x0211 }
            r6 = 46
            java.lang.String r0 = HJ.C15854t.o1(r0, r6, r4, r5, r4)     // Catch:{ Exception -> 0x01b8 }
            int r4 = r0.length()     // Catch:{ Exception -> 0x01b8 }
            if (r4 != 0) goto L_0x01e6
            goto L_0x01ea
        L_0x01e6:
            java.lang.String r2 = HJ.C15854t.P0(r0, r14)     // Catch:{ Exception -> 0x01b8 }
        L_0x01ea:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x01b8 }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x01b8 }
            r4 = 1
            boolean r0 = HJ.C15854t.b0(r0, r13, r4)     // Catch:{ Exception -> 0x01b8 }
            if (r0 == 0) goto L_0x01fc
            r0 = r16
            goto L_0x01fe
        L_0x01fc:
            r0 = r17
        L_0x01fe:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b8 }
            r4.<init>()     // Catch:{ Exception -> 0x01b8 }
            r4.append(r0)     // Catch:{ Exception -> 0x01b8 }
            r4.append(r10)     // Catch:{ Exception -> 0x01b8 }
            r4.append(r2)     // Catch:{ Exception -> 0x01b8 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x01b8 }
            goto L_0x021e
        L_0x0211:
            r0 = move-exception
        L_0x0212:
            r6 = 46
            goto L_0x01b9
        L_0x0215:
            r0 = move-exception
            r5 = 2
            goto L_0x0212
        L_0x0218:
            r39 = r0
            r5 = 2
            r6 = 46
            r0 = r2
        L_0x021e:
            r2 = r3
            r3 = r12
            r4 = r0
            r32 = r1
            r1 = r5
            r21 = 0
            r5 = r21
            r6 = 0
            r1 = r7
            r7 = r20
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x023b }
            r2 = r0
            r25 = r1
            r5 = r20
            r7 = r21
            r1 = 0
            r0 = r39
            goto L_0x0174
        L_0x023b:
            r0 = move-exception
            goto L_0x0246
        L_0x023d:
            return r1
        L_0x023e:
            r0 = move-exception
            r1 = r6
            r17 = r11
            r11 = r16
            r16 = r12
        L_0x0246:
            qv.e r12 = qv.e.ERROR
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0259:
            boolean r4 = r2.hasNext()
            r7 = 0
            if (r4 == 0) goto L_0x0271
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            boolean r5 = r5.b(r12, r7)
            if (r5 == 0) goto L_0x0259
            r3.add(r4)
            goto L_0x0259
        L_0x0271:
            java.util.Iterator r19 = r3.iterator()
            r2 = 0
            r5 = 0
        L_0x0277:
            boolean r3 = r19.hasNext()
            if (r3 == 0) goto L_0x02a0
            java.lang.Object r3 = r19.next()
            qv.b r3 = (qv.C11819b) r3
            if (r5 != 0) goto L_0x02ab
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r9)
            r4.append(r11)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = qv.C11818a.a(r4, r0)
            if (r4 != 0) goto L_0x02a4
        L_0x02a0:
            r25 = 0
            goto L_0x031b
        L_0x02a4:
            java.lang.String r4 = qv.C11820c.a(r4)
            r20 = r4
            goto L_0x02ad
        L_0x02ab:
            r20 = r5
        L_0x02ad:
            if (r2 != 0) goto L_0x02f8
            java.lang.String r2 = r15.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r4 = 2
            r5 = 36
            r6 = 0
            java.lang.String r7 = HJ.C15854t.s1(r2, r5, r6, r4, r6)
            r5 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r5, r6, r4, r6)
            int r21 = r7.length()
            if (r21 != 0) goto L_0x02cb
            goto L_0x02cf
        L_0x02cb:
            java.lang.String r2 = HJ.C15854t.P0(r7, r14)
        L_0x02cf:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            r5 = 1
            boolean r7 = HJ.C15854t.b0(r7, r13, r5)
            if (r7 == 0) goto L_0x02e1
            r7 = r16
            goto L_0x02e3
        L_0x02e1:
            r7 = r17
        L_0x02e3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            r4.append(r10)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L_0x02f5:
            r18 = r2
            goto L_0x02fb
        L_0x02f8:
            r5 = 1
            r6 = 0
            goto L_0x02f5
        L_0x02fb:
            r2 = r3
            r3 = r12
            r21 = 2
            r4 = r18
            r24 = r5
            r7 = 0
            r22 = 46
            r23 = 36
            r5 = r7
            r25 = r6
            r6 = r0
            r26 = r7
            r7 = r20
            r2.a(r3, r4, r5, r6, r7)
            r2 = r18
            r5 = r20
            r7 = r26
            goto L_0x0277
        L_0x031b:
            r5 = r25
        L_0x031d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wm.C12285f.a(java.lang.String, ld.a, int, int, boolean, int, boolean):android.graphics.Bitmap");
    }
}
