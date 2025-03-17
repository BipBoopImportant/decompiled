package com.sugarcube.core.network.models;

import YH.g0;
import android.net.Uri;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001c0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"Lcom/sugarcube/core/network/models/ShowroomJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/Showroom;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/Showroom;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/Showroom;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "intAdapter", "Lcom/squareup/moshi/f;", "stringAdapter", "nullableStringAdapter", "", "listOfStringAdapter", "Lcom/sugarcube/core/network/models/FurnishingType;", "nullableFurnishingTypeAdapter", "nullableIntAdapter", "Lcom/sugarcube/core/network/models/RoomShape;", "nullableRoomShapeAdapter", "Landroid/net/Uri;", "nullableUriAdapter", "", "nullableDoubleAdapter", "Ljava/time/Instant;", "nullableInstantAdapter", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ShowroomJsonAdapter extends f<Showroom> {
    private final f<Integer> intAdapter;
    private final f<List<String>> listOfStringAdapter;
    private final f<Double> nullableDoubleAdapter;
    private final f<FurnishingType> nullableFurnishingTypeAdapter;
    private final f<Instant> nullableInstantAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<RoomShape> nullableRoomShapeAdapter;
    private final f<String> nullableStringAdapter;
    private final f<Uri> nullableUriAdapter;
    private final k.a options;
    private final f<String> stringAdapter;

    public ShowroomJsonAdapter(t tVar) {
        t tVar2 = tVar;
        C17542s.j(tVar2, "moshi");
        k.a a10 = k.a.a("id", "composition", "scene", "subCatalog", "images", "name", "roomType", "furnishingType", "sortOrder", "roomShapeName", "roomShape", "roomSize", "compositionCount", "lastCreatedAt");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar2.f(Integer.TYPE, g0.d(), "id");
        C17542s.i(f10, "adapter(...)");
        this.intAdapter = f10;
        Class<String> cls = String.class;
        f<String> f11 = tVar2.f(cls, g0.d(), "composition");
        C17542s.i(f11, "adapter(...)");
        this.stringAdapter = f11;
        f<String> f12 = tVar2.f(cls, g0.d(), "subCatalog");
        C17542s.i(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        f<List<String>> f13 = tVar2.f(w.j(List.class, cls), g0.d(), "images");
        C17542s.i(f13, "adapter(...)");
        this.listOfStringAdapter = f13;
        f<FurnishingType> f14 = tVar2.f(FurnishingType.class, g0.d(), "furnishingType");
        C17542s.i(f14, "adapter(...)");
        this.nullableFurnishingTypeAdapter = f14;
        f<Integer> f15 = tVar2.f(Integer.class, g0.d(), "sortOrder");
        C17542s.i(f15, "adapter(...)");
        this.nullableIntAdapter = f15;
        f<RoomShape> f16 = tVar2.f(RoomShape.class, g0.d(), "roomShapeName");
        C17542s.i(f16, "adapter(...)");
        this.nullableRoomShapeAdapter = f16;
        f<Uri> f17 = tVar2.f(Uri.class, g0.d(), "roomShape");
        C17542s.i(f17, "adapter(...)");
        this.nullableUriAdapter = f17;
        f<Double> f18 = tVar2.f(Double.class, g0.d(), "roomSize");
        C17542s.i(f18, "adapter(...)");
        this.nullableDoubleAdapter = f18;
        f<Instant> f19 = tVar2.f(Instant.class, g0.d(), "lastCreatedAt");
        C17542s.i(f19, "adapter(...)");
        this.nullableInstantAdapter = f19;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Showroom");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005f, code lost:
        r15 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004c, code lost:
        r14 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
        r13 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        r12 = r22;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.core.network.models.Showroom fromJson(com.squareup.moshi.k r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            java.lang.String r2 = "reader"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            r24.d()
            r2 = 0
            r3 = 0
            r5 = r2
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
            r18 = r16
            r17 = r3
        L_0x001f:
            boolean r3 = r24.hasNext()
            java.lang.String r4 = "id"
            r19 = r15
            java.lang.String r15 = "composition"
            r20 = r14
            java.lang.String r14 = "scene"
            r21 = r13
            java.lang.String r13 = "images"
            r22 = r12
            java.lang.String r12 = "roomType"
            if (r3 == 0) goto L_0x011b
            com.squareup.moshi.k$a r3 = r0.options
            int r3 = r1.s(r3)
            switch(r3) {
                case -1: goto L_0x0113;
                case 0: goto L_0x0102;
                case 1: goto L_0x00f0;
                case 2: goto L_0x00de;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00c3;
                case 5: goto L_0x00b9;
                case 6: goto L_0x00a8;
                case 7: goto L_0x009e;
                case 8: goto L_0x008e;
                case 9: goto L_0x0080;
                case 10: goto L_0x0074;
                case 11: goto L_0x0069;
                case 12: goto L_0x0053;
                case 13: goto L_0x0041;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x005f
        L_0x0041:
            com.squareup.moshi.f<java.time.Instant> r3 = r0.nullableInstantAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            r15 = r3
            java.time.Instant r15 = (java.time.Instant) r15
            r17 = 1
        L_0x004c:
            r14 = r20
        L_0x004e:
            r13 = r21
        L_0x0050:
            r12 = r22
            goto L_0x001f
        L_0x0053:
            com.squareup.moshi.f<java.lang.Integer> r3 = r0.intAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            r16 = r3
            java.lang.Integer r16 = (java.lang.Integer) r16
            if (r16 == 0) goto L_0x0062
        L_0x005f:
            r15 = r19
            goto L_0x004c
        L_0x0062:
            java.lang.String r2 = "compositionCount"
            com.squareup.moshi.h r1 = ME.c.w(r2, r2, r1)
            throw r1
        L_0x0069:
            com.squareup.moshi.f<java.lang.Double> r3 = r0.nullableDoubleAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            r18 = r3
            java.lang.Double r18 = (java.lang.Double) r18
            goto L_0x005f
        L_0x0074:
            com.squareup.moshi.f<android.net.Uri> r3 = r0.nullableUriAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            r14 = r3
            android.net.Uri r14 = (android.net.Uri) r14
            r15 = r19
            goto L_0x004e
        L_0x0080:
            com.squareup.moshi.f<com.sugarcube.core.network.models.RoomShape> r3 = r0.nullableRoomShapeAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            r13 = r3
            com.sugarcube.core.network.models.RoomShape r13 = (com.sugarcube.core.network.models.RoomShape) r13
            r15 = r19
            r14 = r20
            goto L_0x0050
        L_0x008e:
            com.squareup.moshi.f<java.lang.Integer> r3 = r0.nullableIntAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            r12 = r3
            java.lang.Integer r12 = (java.lang.Integer) r12
            r15 = r19
            r14 = r20
            r13 = r21
            goto L_0x001f
        L_0x009e:
            com.squareup.moshi.f<com.sugarcube.core.network.models.FurnishingType> r3 = r0.nullableFurnishingTypeAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            r11 = r3
            com.sugarcube.core.network.models.FurnishingType r11 = (com.sugarcube.core.network.models.FurnishingType) r11
            goto L_0x005f
        L_0x00a8:
            com.squareup.moshi.f<java.lang.String> r3 = r0.stringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x00b4
            goto L_0x005f
        L_0x00b4:
            com.squareup.moshi.h r1 = ME.c.w(r12, r12, r1)
            throw r1
        L_0x00b9:
            com.squareup.moshi.f<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x005f
        L_0x00c3:
            com.squareup.moshi.f<java.util.List<java.lang.String>> r3 = r0.listOfStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            r8 = r3
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x00cf
            goto L_0x005f
        L_0x00cf:
            com.squareup.moshi.h r1 = ME.c.w(r13, r13, r1)
            throw r1
        L_0x00d4:
            com.squareup.moshi.f<java.lang.String> r3 = r0.nullableStringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x005f
        L_0x00de:
            com.squareup.moshi.f<java.lang.String> r3 = r0.stringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00eb
            goto L_0x005f
        L_0x00eb:
            com.squareup.moshi.h r1 = ME.c.w(r14, r14, r1)
            throw r1
        L_0x00f0:
            com.squareup.moshi.f<java.lang.String> r3 = r0.stringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.k) r1)
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x00fd
            goto L_0x005f
        L_0x00fd:
            com.squareup.moshi.h r1 = ME.c.w(r15, r15, r1)
            throw r1
        L_0x0102:
            com.squareup.moshi.f<java.lang.Integer> r2 = r0.intAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x010e
            goto L_0x005f
        L_0x010e:
            com.squareup.moshi.h r1 = ME.c.w(r4, r4, r1)
            throw r1
        L_0x0113:
            r24.w()
            r24.a0()
            goto L_0x005f
        L_0x011b:
            r24.f()
            com.sugarcube.core.network.models.Showroom r3 = new com.sugarcube.core.network.models.Showroom
            if (r2 == 0) goto L_0x0164
            int r4 = r2.intValue()
            if (r5 == 0) goto L_0x015f
            if (r6 == 0) goto L_0x015a
            if (r8 == 0) goto L_0x0155
            if (r10 == 0) goto L_0x0150
            r2 = r3
            r12 = r22
            r13 = r21
            r14 = r20
            r1 = r19
            r15 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r16 == 0) goto L_0x0143
            int r3 = r16.intValue()
            goto L_0x0147
        L_0x0143:
            int r3 = r2.getCompositionCount()
        L_0x0147:
            r2.setCompositionCount(r3)
            if (r17 == 0) goto L_0x014f
            r2.setLastCreatedAt(r1)
        L_0x014f:
            return r2
        L_0x0150:
            com.squareup.moshi.h r1 = ME.c.n(r12, r12, r1)
            throw r1
        L_0x0155:
            com.squareup.moshi.h r1 = ME.c.n(r13, r13, r1)
            throw r1
        L_0x015a:
            com.squareup.moshi.h r1 = ME.c.n(r14, r14, r1)
            throw r1
        L_0x015f:
            com.squareup.moshi.h r1 = ME.c.n(r15, r15, r1)
            throw r1
        L_0x0164:
            com.squareup.moshi.h r1 = ME.c.n(r4, r4, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.ShowroomJsonAdapter.fromJson(com.squareup.moshi.k):com.sugarcube.core.network.models.Showroom");
    }

    public void toJson(q qVar, Showroom showroom) {
        C17542s.j(qVar, "writer");
        if (showroom != null) {
            qVar.d();
            qVar.n("id");
            this.intAdapter.toJson(qVar, Integer.valueOf(showroom.getId()));
            qVar.n("composition");
            this.stringAdapter.toJson(qVar, showroom.getComposition());
            qVar.n("scene");
            this.stringAdapter.toJson(qVar, showroom.getScene());
            qVar.n("subCatalog");
            this.nullableStringAdapter.toJson(qVar, showroom.getSubCatalog());
            qVar.n("images");
            this.listOfStringAdapter.toJson(qVar, showroom.getImages());
            qVar.n("name");
            this.nullableStringAdapter.toJson(qVar, showroom.getName());
            qVar.n("roomType");
            this.stringAdapter.toJson(qVar, showroom.getRoomType());
            qVar.n("furnishingType");
            this.nullableFurnishingTypeAdapter.toJson(qVar, showroom.getFurnishingType());
            qVar.n("sortOrder");
            this.nullableIntAdapter.toJson(qVar, showroom.getSortOrder());
            qVar.n("roomShapeName");
            this.nullableRoomShapeAdapter.toJson(qVar, showroom.getRoomShapeName());
            qVar.n("roomShape");
            this.nullableUriAdapter.toJson(qVar, showroom.getRoomShape());
            qVar.n("roomSize");
            this.nullableDoubleAdapter.toJson(qVar, showroom.getRoomSize());
            qVar.n("compositionCount");
            this.intAdapter.toJson(qVar, Integer.valueOf(showroom.getCompositionCount()));
            qVar.n("lastCreatedAt");
            this.nullableInstantAdapter.toJson(qVar, showroom.getLastCreatedAt());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
