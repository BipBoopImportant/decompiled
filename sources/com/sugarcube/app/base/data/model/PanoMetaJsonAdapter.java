package com.sugarcube.app.base.data.model;

import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a¨\u0006 "}, d2 = {"Lcom/sugarcube/app/base/data/model/PanoMetaJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/app/base/data/model/PanoMeta;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/app/base/data/model/PanoMeta;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/app/base/data/model/PanoMeta;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "", "mutableListOfNullableIntAdapter", "Lcom/squareup/moshi/f;", "", "mutableListOfNullableFloatAdapter", "", "mutableListOfNullableFloatArrayAdapter", "mutableListOfNullableStringAdapter", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PanoMetaJsonAdapter extends f<PanoMeta> {
    public static final int $stable = 8;
    private final f<List<Float>> mutableListOfNullableFloatAdapter;
    private final f<List<float[]>> mutableListOfNullableFloatArrayAdapter;
    private final f<List<Integer>> mutableListOfNullableIntAdapter;
    private final f<List<String>> mutableListOfNullableStringAdapter;
    private final k.a options;

    public PanoMetaJsonAdapter(t tVar) {
        t tVar2 = tVar;
        C17542s.j(tVar2, "moshi");
        k.a a10 = k.a.a("poseIndexes", "shutterSpeeds", "iso", "evOffsets", "lensPosition", "exposureBias", "whiteBalanceGains", "maxWhiteBalanceGain", "grayWorldWhiteBalanceGain", "whiteBalanceChromacity", "whiteBalanceTemperature", "aperture", "ambientIntensity", "ambientColorTemperature", "anchorPose", "states");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        Class<List> cls = List.class;
        f<List<Integer>> f10 = tVar2.f(w.j(cls, Integer.class), g0.d(), "poseIndexes");
        C17542s.i(f10, "adapter(...)");
        this.mutableListOfNullableIntAdapter = f10;
        f<List<Float>> f11 = tVar2.f(w.j(cls, Float.class), g0.d(), "shutterSpeeds");
        C17542s.i(f11, "adapter(...)");
        this.mutableListOfNullableFloatAdapter = f11;
        f<List<float[]>> f12 = tVar2.f(w.j(cls, float[].class), g0.d(), "maxWhiteBalanceGain");
        C17542s.i(f12, "adapter(...)");
        this.mutableListOfNullableFloatArrayAdapter = f12;
        f<List<String>> f13 = tVar2.f(w.j(cls, String.class), g0.d(), "states");
        C17542s.i(f13, "adapter(...)");
        this.mutableListOfNullableStringAdapter = f13;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PanoMeta");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0081, code lost:
        r12 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0083, code lost:
        r11 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0085, code lost:
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0087, code lost:
        r9 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0089, code lost:
        r8 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008b, code lost:
        r7 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
        r6 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
        r5 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0091, code lost:
        r4 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x007b, code lost:
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x007d, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007f, code lost:
        r13 = r22;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.app.base.data.model.PanoMeta fromJson(com.squareup.moshi.k r36) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            java.lang.String r2 = "reader"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            r36.d()
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
        L_0x0021:
            boolean r2 = r36.hasNext()
            java.lang.String r3 = "poseIndexes"
            r20 = r15
            java.lang.String r15 = "shutterSpeeds"
            r21 = r14
            java.lang.String r14 = "iso"
            r22 = r13
            java.lang.String r13 = "evOffsets"
            r23 = r12
            java.lang.String r12 = "lensPosition"
            r24 = r11
            java.lang.String r11 = "exposureBias"
            r25 = r10
            java.lang.String r10 = "whiteBalanceGains"
            r26 = r9
            java.lang.String r9 = "maxWhiteBalanceGain"
            r27 = r8
            java.lang.String r8 = "grayWorldWhiteBalanceGain"
            r28 = r7
            java.lang.String r7 = "whiteBalanceChromacity"
            r29 = r6
            java.lang.String r6 = "whiteBalanceTemperature"
            r30 = r5
            java.lang.String r5 = "aperture"
            r31 = r4
            java.lang.String r4 = "ambientIntensity"
            r32 = r3
            java.lang.String r3 = "ambientColorTemperature"
            r33 = r15
            java.lang.String r15 = "anchorPose"
            r34 = r14
            java.lang.String r14 = "states"
            if (r2 == 0) goto L_0x0237
            com.squareup.moshi.k$a r2 = r0.options
            int r2 = r1.s(r2)
            switch(r2) {
                case -1: goto L_0x022f;
                case 0: goto L_0x0205;
                case 1: goto L_0x01dd;
                case 2: goto L_0x01b7;
                case 3: goto L_0x0195;
                case 4: goto L_0x0175;
                case 5: goto L_0x0157;
                case 6: goto L_0x013b;
                case 7: goto L_0x0121;
                case 8: goto L_0x0109;
                case 9: goto L_0x00f3;
                case 10: goto L_0x00e0;
                case 11: goto L_0x00cf;
                case 12: goto L_0x00bd;
                case 13: goto L_0x00ab;
                case 14: goto L_0x0099;
                case 15: goto L_0x006f;
                default: goto L_0x006e;
            }
        L_0x006e:
            goto L_0x007b
        L_0x006f:
            com.squareup.moshi.f<java.util.List<java.lang.String>> r2 = r0.mutableListOfNullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r19 = r2
            java.util.List r19 = (java.util.List) r19
            if (r19 == 0) goto L_0x0094
        L_0x007b:
            r15 = r20
        L_0x007d:
            r14 = r21
        L_0x007f:
            r13 = r22
        L_0x0081:
            r12 = r23
        L_0x0083:
            r11 = r24
        L_0x0085:
            r10 = r25
        L_0x0087:
            r9 = r26
        L_0x0089:
            r8 = r27
        L_0x008b:
            r7 = r28
        L_0x008d:
            r6 = r29
        L_0x008f:
            r5 = r30
        L_0x0091:
            r4 = r31
            goto L_0x0021
        L_0x0094:
            com.squareup.moshi.h r1 = ME.c.w(r14, r14, r1)
            throw r1
        L_0x0099:
            com.squareup.moshi.f<java.util.List<float[]>> r2 = r0.mutableListOfNullableFloatArrayAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r18 = r2
            java.util.List r18 = (java.util.List) r18
            if (r18 == 0) goto L_0x00a6
            goto L_0x007b
        L_0x00a6:
            com.squareup.moshi.h r1 = ME.c.w(r15, r15, r1)
            throw r1
        L_0x00ab:
            com.squareup.moshi.f<java.util.List<java.lang.Float>> r2 = r0.mutableListOfNullableFloatAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r17 = r2
            java.util.List r17 = (java.util.List) r17
            if (r17 == 0) goto L_0x00b8
            goto L_0x007b
        L_0x00b8:
            com.squareup.moshi.h r1 = ME.c.w(r3, r3, r1)
            throw r1
        L_0x00bd:
            com.squareup.moshi.f<java.util.List<java.lang.Float>> r2 = r0.mutableListOfNullableFloatAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r16 = r2
            java.util.List r16 = (java.util.List) r16
            if (r16 == 0) goto L_0x00ca
            goto L_0x007b
        L_0x00ca:
            com.squareup.moshi.h r1 = ME.c.w(r4, r4, r1)
            throw r1
        L_0x00cf:
            com.squareup.moshi.f<java.util.List<java.lang.Float>> r2 = r0.mutableListOfNullableFloatAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r15 = r2
            java.util.List r15 = (java.util.List) r15
            if (r15 == 0) goto L_0x00db
            goto L_0x007d
        L_0x00db:
            com.squareup.moshi.h r1 = ME.c.w(r5, r5, r1)
            throw r1
        L_0x00e0:
            com.squareup.moshi.f<java.util.List<float[]>> r2 = r0.mutableListOfNullableFloatArrayAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r14 = r2
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L_0x00ee
            r15 = r20
            goto L_0x007f
        L_0x00ee:
            com.squareup.moshi.h r1 = ME.c.w(r6, r6, r1)
            throw r1
        L_0x00f3:
            com.squareup.moshi.f<java.util.List<float[]>> r2 = r0.mutableListOfNullableFloatArrayAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r13 = r2
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0104
            r15 = r20
            r14 = r21
            goto L_0x0081
        L_0x0104:
            com.squareup.moshi.h r1 = ME.c.w(r7, r7, r1)
            throw r1
        L_0x0109:
            com.squareup.moshi.f<java.util.List<float[]>> r2 = r0.mutableListOfNullableFloatArrayAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r12 = r2
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x011c
            r15 = r20
            r14 = r21
            r13 = r22
            goto L_0x0083
        L_0x011c:
            com.squareup.moshi.h r1 = ME.c.w(r8, r8, r1)
            throw r1
        L_0x0121:
            com.squareup.moshi.f<java.util.List<float[]>> r2 = r0.mutableListOfNullableFloatArrayAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r11 = r2
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L_0x0136
            r15 = r20
            r14 = r21
            r13 = r22
            r12 = r23
            goto L_0x0085
        L_0x0136:
            com.squareup.moshi.h r1 = ME.c.w(r9, r9, r1)
            throw r1
        L_0x013b:
            com.squareup.moshi.f<java.util.List<java.lang.Integer>> r2 = r0.mutableListOfNullableIntAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0152
            r10 = r2
            r15 = r20
            r14 = r21
            r13 = r22
            r12 = r23
            r11 = r24
            goto L_0x0087
        L_0x0152:
            com.squareup.moshi.h r1 = ME.c.w(r10, r10, r1)
            throw r1
        L_0x0157:
            com.squareup.moshi.f<java.util.List<java.lang.Integer>> r2 = r0.mutableListOfNullableIntAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r9 = r2
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x0170
            r15 = r20
            r14 = r21
            r13 = r22
            r12 = r23
            r11 = r24
            r10 = r25
            goto L_0x0089
        L_0x0170:
            com.squareup.moshi.h r1 = ME.c.w(r11, r11, r1)
            throw r1
        L_0x0175:
            com.squareup.moshi.f<java.util.List<java.lang.Float>> r2 = r0.mutableListOfNullableFloatAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x0190
            r15 = r20
            r14 = r21
            r13 = r22
            r12 = r23
            r11 = r24
            r10 = r25
            r9 = r26
            goto L_0x008b
        L_0x0190:
            com.squareup.moshi.h r1 = ME.c.w(r12, r12, r1)
            throw r1
        L_0x0195:
            com.squareup.moshi.f<java.util.List<java.lang.Float>> r2 = r0.mutableListOfNullableFloatAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r7 = r2
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x01b2
            r15 = r20
            r14 = r21
            r13 = r22
            r12 = r23
            r11 = r24
            r10 = r25
            r9 = r26
            r8 = r27
            goto L_0x008d
        L_0x01b2:
            com.squareup.moshi.h r1 = ME.c.w(r13, r13, r1)
            throw r1
        L_0x01b7:
            com.squareup.moshi.f<java.util.List<java.lang.Float>> r2 = r0.mutableListOfNullableFloatAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r6 = r2
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x01d6
            r15 = r20
            r14 = r21
            r13 = r22
            r12 = r23
            r11 = r24
            r10 = r25
            r9 = r26
            r8 = r27
            r7 = r28
            goto L_0x008f
        L_0x01d6:
            r2 = r34
            com.squareup.moshi.h r1 = ME.c.w(r2, r2, r1)
            throw r1
        L_0x01dd:
            com.squareup.moshi.f<java.util.List<java.lang.Float>> r2 = r0.mutableListOfNullableFloatAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r5 = r2
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x01fe
            r15 = r20
            r14 = r21
            r13 = r22
            r12 = r23
            r11 = r24
            r10 = r25
            r9 = r26
            r8 = r27
            r7 = r28
            r6 = r29
            goto L_0x0091
        L_0x01fe:
            r2 = r33
            com.squareup.moshi.h r1 = ME.c.w(r2, r2, r1)
            throw r1
        L_0x0205:
            com.squareup.moshi.f<java.util.List<java.lang.Integer>> r2 = r0.mutableListOfNullableIntAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r4 = r2
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0228
            r15 = r20
            r14 = r21
            r13 = r22
            r12 = r23
            r11 = r24
            r10 = r25
            r9 = r26
            r8 = r27
            r7 = r28
            r6 = r29
            r5 = r30
            goto L_0x0021
        L_0x0228:
            r2 = r32
            com.squareup.moshi.h r1 = ME.c.w(r2, r2, r1)
            throw r1
        L_0x022f:
            r36.w()
            r36.a0()
            goto L_0x007b
        L_0x0237:
            r0 = r33
            r2 = r34
            r36.f()
            com.sugarcube.app.base.data.model.PanoMeta r33 = new com.sugarcube.app.base.data.model.PanoMeta
            if (r31 == 0) goto L_0x02c9
            if (r30 == 0) goto L_0x02c4
            if (r29 == 0) goto L_0x02bf
            if (r28 == 0) goto L_0x02ba
            if (r27 == 0) goto L_0x02b5
            if (r26 == 0) goto L_0x02b0
            if (r25 == 0) goto L_0x02ab
            if (r24 == 0) goto L_0x02a6
            if (r23 == 0) goto L_0x02a1
            if (r22 == 0) goto L_0x029c
            if (r21 == 0) goto L_0x0297
            if (r20 == 0) goto L_0x0292
            if (r16 == 0) goto L_0x028d
            if (r17 == 0) goto L_0x0288
            if (r18 == 0) goto L_0x0283
            if (r19 == 0) goto L_0x027e
            r3 = r33
            r4 = r31
            r5 = r30
            r6 = r29
            r7 = r28
            r8 = r27
            r9 = r26
            r10 = r25
            r11 = r24
            r12 = r23
            r13 = r22
            r14 = r21
            r15 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r33
        L_0x027e:
            com.squareup.moshi.h r0 = ME.c.n(r14, r14, r1)
            throw r0
        L_0x0283:
            com.squareup.moshi.h r0 = ME.c.n(r15, r15, r1)
            throw r0
        L_0x0288:
            com.squareup.moshi.h r0 = ME.c.n(r3, r3, r1)
            throw r0
        L_0x028d:
            com.squareup.moshi.h r0 = ME.c.n(r4, r4, r1)
            throw r0
        L_0x0292:
            com.squareup.moshi.h r0 = ME.c.n(r5, r5, r1)
            throw r0
        L_0x0297:
            com.squareup.moshi.h r0 = ME.c.n(r6, r6, r1)
            throw r0
        L_0x029c:
            com.squareup.moshi.h r0 = ME.c.n(r7, r7, r1)
            throw r0
        L_0x02a1:
            com.squareup.moshi.h r0 = ME.c.n(r8, r8, r1)
            throw r0
        L_0x02a6:
            com.squareup.moshi.h r0 = ME.c.n(r9, r9, r1)
            throw r0
        L_0x02ab:
            com.squareup.moshi.h r0 = ME.c.n(r10, r10, r1)
            throw r0
        L_0x02b0:
            com.squareup.moshi.h r0 = ME.c.n(r11, r11, r1)
            throw r0
        L_0x02b5:
            com.squareup.moshi.h r0 = ME.c.n(r12, r12, r1)
            throw r0
        L_0x02ba:
            com.squareup.moshi.h r0 = ME.c.n(r13, r13, r1)
            throw r0
        L_0x02bf:
            com.squareup.moshi.h r0 = ME.c.n(r2, r2, r1)
            throw r0
        L_0x02c4:
            com.squareup.moshi.h r0 = ME.c.n(r0, r0, r1)
            throw r0
        L_0x02c9:
            r0 = r32
            com.squareup.moshi.h r0 = ME.c.n(r0, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.model.PanoMetaJsonAdapter.fromJson(com.squareup.moshi.k):com.sugarcube.app.base.data.model.PanoMeta");
    }

    public void toJson(q qVar, PanoMeta panoMeta) {
        C17542s.j(qVar, "writer");
        if (panoMeta != null) {
            qVar.d();
            qVar.n("poseIndexes");
            this.mutableListOfNullableIntAdapter.toJson(qVar, panoMeta.getPoseIndexes());
            qVar.n("shutterSpeeds");
            this.mutableListOfNullableFloatAdapter.toJson(qVar, panoMeta.getShutterSpeeds());
            qVar.n("iso");
            this.mutableListOfNullableFloatAdapter.toJson(qVar, panoMeta.getIso());
            qVar.n("evOffsets");
            this.mutableListOfNullableFloatAdapter.toJson(qVar, panoMeta.getEvOffsets());
            qVar.n("lensPosition");
            this.mutableListOfNullableFloatAdapter.toJson(qVar, panoMeta.getLensPosition());
            qVar.n("exposureBias");
            this.mutableListOfNullableIntAdapter.toJson(qVar, panoMeta.getExposureBias());
            qVar.n("whiteBalanceGains");
            this.mutableListOfNullableIntAdapter.toJson(qVar, panoMeta.getWhiteBalanceGains());
            qVar.n("maxWhiteBalanceGain");
            this.mutableListOfNullableFloatArrayAdapter.toJson(qVar, panoMeta.getMaxWhiteBalanceGain());
            qVar.n("grayWorldWhiteBalanceGain");
            this.mutableListOfNullableFloatArrayAdapter.toJson(qVar, panoMeta.getGrayWorldWhiteBalanceGain());
            qVar.n("whiteBalanceChromacity");
            this.mutableListOfNullableFloatArrayAdapter.toJson(qVar, panoMeta.getWhiteBalanceChromacity());
            qVar.n("whiteBalanceTemperature");
            this.mutableListOfNullableFloatArrayAdapter.toJson(qVar, panoMeta.getWhiteBalanceTemperature());
            qVar.n("aperture");
            this.mutableListOfNullableFloatAdapter.toJson(qVar, panoMeta.getAperture());
            qVar.n("ambientIntensity");
            this.mutableListOfNullableFloatAdapter.toJson(qVar, panoMeta.getAmbientIntensity());
            qVar.n("ambientColorTemperature");
            this.mutableListOfNullableFloatAdapter.toJson(qVar, panoMeta.getAmbientColorTemperature());
            qVar.n("anchorPose");
            this.mutableListOfNullableFloatArrayAdapter.toJson(qVar, panoMeta.getAnchorPose());
            qVar.n("states");
            this.mutableListOfNullableStringAdapter.toJson(qVar, panoMeta.getStates());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
