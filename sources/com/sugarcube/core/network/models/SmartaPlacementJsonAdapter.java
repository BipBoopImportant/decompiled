package com.sugarcube.core.network.models;

import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/core/network/models/SmartaPlacementJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/SmartaPlacement;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/SmartaPlacement;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/SmartaPlacement;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "intAdapter", "Lcom/squareup/moshi/f;", "stringAdapter", "", "floatAdapter", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SmartaPlacementJsonAdapter extends f<SmartaPlacement> {
    private final f<Float> floatAdapter;
    private final f<Integer> intAdapter;
    private final k.a options;
    private final f<String> stringAdapter;

    public SmartaPlacementJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("furnitureId", "parentAttachment", "parentId", "x", "y", "z", "heading", "headingI", "headingJ", "headingK");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar.f(Integer.TYPE, g0.d(), "furnitureId");
        C17542s.i(f10, "adapter(...)");
        this.intAdapter = f10;
        f<String> f11 = tVar.f(String.class, g0.d(), "parentId");
        C17542s.i(f11, "adapter(...)");
        this.stringAdapter = f11;
        f<Float> f12 = tVar.f(Float.TYPE, g0.d(), "x");
        C17542s.i(f12, "adapter(...)");
        this.floatAdapter = f12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SmartaPlacement");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        r6 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0101, code lost:
        r11 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0054, code lost:
        r10 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
        r9 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0058, code lost:
        r8 = r19;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.core.network.models.SmartaPlacement fromJson(com.squareup.moshi.k r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.String r2 = "reader"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            r25.d()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
        L_0x0016:
            boolean r12 = r25.hasNext()
            java.lang.String r13 = "furnitureId"
            java.lang.String r14 = "parentAttachment"
            java.lang.String r15 = "parentId"
            r16 = r11
            java.lang.String r11 = "x"
            r17 = r10
            java.lang.String r10 = "y"
            r18 = r9
            java.lang.String r9 = "z"
            r19 = r8
            java.lang.String r8 = "heading"
            r20 = r6
            java.lang.String r6 = "headingI"
            r21 = r5
            java.lang.String r5 = "headingJ"
            r22 = r4
            java.lang.String r4 = "headingK"
            if (r12 == 0) goto L_0x0131
            com.squareup.moshi.k$a r12 = r0.options
            int r12 = r1.s(r12)
            switch(r12) {
                case -1: goto L_0x012a;
                case 0: goto L_0x011a;
                case 1: goto L_0x010a;
                case 2: goto L_0x00f6;
                case 3: goto L_0x00d9;
                case 4: goto L_0x00be;
                case 5: goto L_0x00a5;
                case 6: goto L_0x008e;
                case 7: goto L_0x0079;
                case 8: goto L_0x0066;
                case 9: goto L_0x0049;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x0101
        L_0x0049:
            com.squareup.moshi.f<java.lang.Float> r5 = r0.floatAdapter
            java.lang.Object r5 = r5.fromJson((com.squareup.moshi.k) r1)
            r11 = r5
            java.lang.Float r11 = (java.lang.Float) r11
            if (r11 == 0) goto L_0x0061
        L_0x0054:
            r10 = r17
        L_0x0056:
            r9 = r18
        L_0x0058:
            r8 = r19
        L_0x005a:
            r6 = r20
        L_0x005c:
            r5 = r21
        L_0x005e:
            r4 = r22
            goto L_0x0016
        L_0x0061:
            com.squareup.moshi.h r1 = ME.c.w(r4, r4, r1)
            throw r1
        L_0x0066:
            com.squareup.moshi.f<java.lang.Float> r4 = r0.floatAdapter
            java.lang.Object r4 = r4.fromJson((com.squareup.moshi.k) r1)
            r10 = r4
            java.lang.Float r10 = (java.lang.Float) r10
            if (r10 == 0) goto L_0x0074
            r11 = r16
            goto L_0x0056
        L_0x0074:
            com.squareup.moshi.h r1 = ME.c.w(r5, r5, r1)
            throw r1
        L_0x0079:
            com.squareup.moshi.f<java.lang.Float> r4 = r0.floatAdapter
            java.lang.Object r4 = r4.fromJson((com.squareup.moshi.k) r1)
            r9 = r4
            java.lang.Float r9 = (java.lang.Float) r9
            if (r9 == 0) goto L_0x0089
            r11 = r16
            r10 = r17
            goto L_0x0058
        L_0x0089:
            com.squareup.moshi.h r1 = ME.c.w(r6, r6, r1)
            throw r1
        L_0x008e:
            com.squareup.moshi.f<java.lang.Float> r4 = r0.floatAdapter
            java.lang.Object r4 = r4.fromJson((com.squareup.moshi.k) r1)
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L_0x00a0
            r8 = r4
            r11 = r16
            r10 = r17
            r9 = r18
            goto L_0x005a
        L_0x00a0:
            com.squareup.moshi.h r1 = ME.c.w(r8, r8, r1)
            throw r1
        L_0x00a5:
            com.squareup.moshi.f<java.lang.Float> r4 = r0.floatAdapter
            java.lang.Object r4 = r4.fromJson((com.squareup.moshi.k) r1)
            r6 = r4
            java.lang.Float r6 = (java.lang.Float) r6
            if (r6 == 0) goto L_0x00b9
            r11 = r16
            r10 = r17
            r9 = r18
            r8 = r19
            goto L_0x005c
        L_0x00b9:
            com.squareup.moshi.h r1 = ME.c.w(r9, r9, r1)
            throw r1
        L_0x00be:
            com.squareup.moshi.f<java.lang.Float> r4 = r0.floatAdapter
            java.lang.Object r4 = r4.fromJson((com.squareup.moshi.k) r1)
            r5 = r4
            java.lang.Float r5 = (java.lang.Float) r5
            if (r5 == 0) goto L_0x00d4
            r11 = r16
            r10 = r17
            r9 = r18
            r8 = r19
            r6 = r20
            goto L_0x005e
        L_0x00d4:
            com.squareup.moshi.h r1 = ME.c.w(r10, r10, r1)
            throw r1
        L_0x00d9:
            com.squareup.moshi.f<java.lang.Float> r4 = r0.floatAdapter
            java.lang.Object r4 = r4.fromJson((com.squareup.moshi.k) r1)
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L_0x00f1
            r11 = r16
            r10 = r17
            r9 = r18
            r8 = r19
            r6 = r20
            r5 = r21
            goto L_0x0016
        L_0x00f1:
            com.squareup.moshi.h r1 = ME.c.w(r11, r11, r1)
            throw r1
        L_0x00f6:
            com.squareup.moshi.f<java.lang.String> r4 = r0.stringAdapter
            java.lang.Object r4 = r4.fromJson((com.squareup.moshi.k) r1)
            r7 = r4
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0105
        L_0x0101:
            r11 = r16
            goto L_0x0054
        L_0x0105:
            com.squareup.moshi.h r1 = ME.c.w(r15, r15, r1)
            throw r1
        L_0x010a:
            com.squareup.moshi.f<java.lang.Integer> r3 = r0.intAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0115
            goto L_0x0101
        L_0x0115:
            com.squareup.moshi.h r1 = ME.c.w(r14, r14, r1)
            throw r1
        L_0x011a:
            com.squareup.moshi.f<java.lang.Integer> r2 = r0.intAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0125
            goto L_0x0101
        L_0x0125:
            com.squareup.moshi.h r1 = ME.c.w(r13, r13, r1)
            throw r1
        L_0x012a:
            r25.w()
            r25.a0()
            goto L_0x0101
        L_0x0131:
            r25.f()
            com.sugarcube.core.network.models.SmartaPlacement r23 = new com.sugarcube.core.network.models.SmartaPlacement
            if (r2 == 0) goto L_0x01aa
            int r2 = r2.intValue()
            if (r3 == 0) goto L_0x01a5
            int r3 = r3.intValue()
            if (r7 == 0) goto L_0x01a0
            if (r22 == 0) goto L_0x019b
            float r11 = r22.floatValue()
            if (r21 == 0) goto L_0x0196
            float r10 = r21.floatValue()
            if (r20 == 0) goto L_0x0191
            float r12 = r20.floatValue()
            if (r19 == 0) goto L_0x018c
            float r13 = r19.floatValue()
            if (r18 == 0) goto L_0x0187
            float r14 = r18.floatValue()
            if (r17 == 0) goto L_0x0182
            float r15 = r17.floatValue()
            if (r16 == 0) goto L_0x017d
            float r1 = r16.floatValue()
            r4 = r23
            r5 = r2
            r6 = r3
            r8 = r11
            r9 = r10
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r23
        L_0x017d:
            com.squareup.moshi.h r1 = ME.c.n(r4, r4, r1)
            throw r1
        L_0x0182:
            com.squareup.moshi.h r1 = ME.c.n(r5, r5, r1)
            throw r1
        L_0x0187:
            com.squareup.moshi.h r1 = ME.c.n(r6, r6, r1)
            throw r1
        L_0x018c:
            com.squareup.moshi.h r1 = ME.c.n(r8, r8, r1)
            throw r1
        L_0x0191:
            com.squareup.moshi.h r1 = ME.c.n(r9, r9, r1)
            throw r1
        L_0x0196:
            com.squareup.moshi.h r1 = ME.c.n(r10, r10, r1)
            throw r1
        L_0x019b:
            com.squareup.moshi.h r1 = ME.c.n(r11, r11, r1)
            throw r1
        L_0x01a0:
            com.squareup.moshi.h r1 = ME.c.n(r15, r15, r1)
            throw r1
        L_0x01a5:
            com.squareup.moshi.h r1 = ME.c.n(r14, r14, r1)
            throw r1
        L_0x01aa:
            com.squareup.moshi.h r1 = ME.c.n(r13, r13, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.SmartaPlacementJsonAdapter.fromJson(com.squareup.moshi.k):com.sugarcube.core.network.models.SmartaPlacement");
    }

    public void toJson(q qVar, SmartaPlacement smartaPlacement) {
        C17542s.j(qVar, "writer");
        if (smartaPlacement != null) {
            qVar.d();
            qVar.n("furnitureId");
            this.intAdapter.toJson(qVar, Integer.valueOf(smartaPlacement.getFurnitureId()));
            qVar.n("parentAttachment");
            this.intAdapter.toJson(qVar, Integer.valueOf(smartaPlacement.getParentAttachment()));
            qVar.n("parentId");
            this.stringAdapter.toJson(qVar, smartaPlacement.getParentId());
            qVar.n("x");
            this.floatAdapter.toJson(qVar, Float.valueOf(smartaPlacement.getX()));
            qVar.n("y");
            this.floatAdapter.toJson(qVar, Float.valueOf(smartaPlacement.getY()));
            qVar.n("z");
            this.floatAdapter.toJson(qVar, Float.valueOf(smartaPlacement.getZ()));
            qVar.n("heading");
            this.floatAdapter.toJson(qVar, Float.valueOf(smartaPlacement.getHeading()));
            qVar.n("headingI");
            this.floatAdapter.toJson(qVar, Float.valueOf(smartaPlacement.getHeadingI()));
            qVar.n("headingJ");
            this.floatAdapter.toJson(qVar, Float.valueOf(smartaPlacement.getHeadingJ()));
            qVar.n("headingK");
            this.floatAdapter.toJson(qVar, Float.valueOf(smartaPlacement.getHeadingK()));
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
