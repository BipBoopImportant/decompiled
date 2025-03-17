package com.sugarcube.core.network.models;

import YH.g0;
import android.net.Uri;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.lang.reflect.Constructor;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R(\u0010+\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020*\u0018\u00010)0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/sugarcube/core/network/models/CompositionJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/Composition;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/Composition;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/Composition;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "intAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "Landroid/net/Uri;", "nullableUriAdapter", "nullableIntAdapter", "Ljava/util/UUID;", "uUIDAdapter", "", "Lcom/sugarcube/core/network/models/PlacedFurniture;", "nullableListOfPlacedFurnitureAdapter", "Ljava/time/Instant;", "instantAdapter", "", "booleanAdapter", "Lcom/sugarcube/core/network/models/CompositionSavedProperties;", "nullableCompositionSavedPropertiesAdapter", "", "", "nullableMapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompositionJsonAdapter extends f<Composition> {
    private final f<Boolean> booleanAdapter;
    private volatile Constructor<Composition> constructorRef;
    private final f<Instant> instantAdapter;
    private final f<Integer> intAdapter;
    private final f<CompositionSavedProperties> nullableCompositionSavedPropertiesAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<List<PlacedFurniture>> nullableListOfPlacedFurnitureAdapter;
    private final f<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final f<String> nullableStringAdapter;
    private final f<Uri> nullableUriAdapter;
    private final k.a options;
    private final f<UUID> uUIDAdapter;

    public CompositionJsonAdapter(t tVar) {
        t tVar2 = tVar;
        C17542s.j(tVar2, "moshi");
        k.a a10 = k.a.a("compositionId", "name", "baseImageUrl", "thumbnailUrl", "wid", "uuid", "placedfurnitureSet", "createdAt", "lastModifiedTs", "isShared", "publicCompositionImageUrl", "isStock", "sceneId", "sceneUuid", "baseImageData", "savedProperties", "gltf", "shareUrl");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar2.f(Integer.TYPE, g0.d(), "compositionId");
        C17542s.i(f10, "adapter(...)");
        this.intAdapter = f10;
        Class<String> cls = String.class;
        f<String> f11 = tVar2.f(cls, g0.d(), "name");
        C17542s.i(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        f<Uri> f12 = tVar2.f(Uri.class, g0.d(), "baseImageUrl");
        C17542s.i(f12, "adapter(...)");
        this.nullableUriAdapter = f12;
        f<Integer> f13 = tVar2.f(Integer.class, g0.d(), "wid");
        C17542s.i(f13, "adapter(...)");
        this.nullableIntAdapter = f13;
        f<UUID> f14 = tVar2.f(UUID.class, g0.d(), "compositionUuid");
        C17542s.i(f14, "adapter(...)");
        this.uUIDAdapter = f14;
        f<List<PlacedFurniture>> f15 = tVar2.f(w.j(List.class, PlacedFurniture.class), g0.d(), "placedFurnitureSet");
        C17542s.i(f15, "adapter(...)");
        this.nullableListOfPlacedFurnitureAdapter = f15;
        f<Instant> f16 = tVar2.f(Instant.class, g0.d(), "createdAt");
        C17542s.i(f16, "adapter(...)");
        this.instantAdapter = f16;
        f<Boolean> f17 = tVar2.f(Boolean.TYPE, g0.d(), "isShared");
        C17542s.i(f17, "adapter(...)");
        this.booleanAdapter = f17;
        f<CompositionSavedProperties> f18 = tVar2.f(CompositionSavedProperties.class, g0.d(), "savedProperties");
        C17542s.i(f18, "adapter(...)");
        this.nullableCompositionSavedPropertiesAdapter = f18;
        f<Map<String, Object>> f19 = tVar2.f(w.j(Map.class, cls, Object.class), g0.d(), "gltf");
        C17542s.i(f19, "adapter(...)");
        this.nullableMapOfStringAnyAdapter = f19;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Composition");
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006c, code lost:
        r8 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006e, code lost:
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
        r15 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0072, code lost:
        r2 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
        r14 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0065, code lost:
        r3 = r3 & r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0066, code lost:
        r12 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0068, code lost:
        r10 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006a, code lost:
        r9 = r27;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.sugarcube.core.network.models.Composition fromJson(com.squareup.moshi.k r54) {
        /*
            r53 = this;
            r0 = r53
            r1 = r54
            java.lang.String r2 = "reader"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            r54.d()
            r2 = 0
            r3 = -1
            r4 = r2
            r7 = r4
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
            r19 = r17
            r20 = r19
            r21 = r20
            r24 = r21
            r25 = r24
        L_0x0026:
            boolean r5 = r54.hasNext()
            java.lang.String r6 = "uuid"
            r18 = r12
            java.lang.String r12 = "compositionUuid"
            r26 = r10
            java.lang.String r10 = "compositionId"
            r27 = r9
            java.lang.String r9 = "createdAt"
            r28 = r8
            java.lang.String r8 = "lastModifiedTs"
            r29 = r7
            java.lang.String r7 = "isShared"
            r30 = r15
            java.lang.String r15 = "isStock"
            r31 = r2
            java.lang.String r2 = "sceneId"
            r32 = r14
            java.lang.String r14 = "sceneUuid"
            if (r5 == 0) goto L_0x01bd
            com.squareup.moshi.k$a r5 = r0.options
            int r5 = r1.s(r5)
            switch(r5) {
                case -1: goto L_0x01b5;
                case 0: goto L_0x01a3;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x016a;
                case 4: goto L_0x015b;
                case 5: goto L_0x0149;
                case 6: goto L_0x013c;
                case 7: goto L_0x012a;
                case 8: goto L_0x010a;
                case 9: goto L_0x00ed;
                case 10: goto L_0x00df;
                case 11: goto L_0x00c4;
                case 12: goto L_0x00b2;
                case 13: goto L_0x00a0;
                case 14: goto L_0x0093;
                case 15: goto L_0x0085;
                case 16: goto L_0x0077;
                case 17: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x0066
        L_0x0058:
            com.squareup.moshi.f<android.net.Uri> r2 = r0.nullableUriAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r25 = r2
            android.net.Uri r25 = (android.net.Uri) r25
            r2 = -131073(0xfffffffffffdffff, float:NaN)
        L_0x0065:
            r3 = r3 & r2
        L_0x0066:
            r12 = r18
        L_0x0068:
            r10 = r26
        L_0x006a:
            r9 = r27
        L_0x006c:
            r8 = r28
        L_0x006e:
            r7 = r29
        L_0x0070:
            r15 = r30
        L_0x0072:
            r2 = r31
        L_0x0074:
            r14 = r32
            goto L_0x0026
        L_0x0077:
            com.squareup.moshi.f<java.util.Map<java.lang.String, java.lang.Object>> r2 = r0.nullableMapOfStringAnyAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r24 = r2
            java.util.Map r24 = (java.util.Map) r24
            r2 = -65537(0xfffffffffffeffff, float:NaN)
            goto L_0x0065
        L_0x0085:
            com.squareup.moshi.f<com.sugarcube.core.network.models.CompositionSavedProperties> r2 = r0.nullableCompositionSavedPropertiesAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r21 = r2
            com.sugarcube.core.network.models.CompositionSavedProperties r21 = (com.sugarcube.core.network.models.CompositionSavedProperties) r21
            r2 = -32769(0xffffffffffff7fff, float:NaN)
            goto L_0x0065
        L_0x0093:
            com.squareup.moshi.f<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r20 = r2
            java.lang.String r20 = (java.lang.String) r20
            r3 = r3 & -16385(0xffffffffffffbfff, float:NaN)
            goto L_0x0066
        L_0x00a0:
            com.squareup.moshi.f<java.util.UUID> r2 = r0.uUIDAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r19 = r2
            java.util.UUID r19 = (java.util.UUID) r19
            if (r19 == 0) goto L_0x00ad
        L_0x00ac:
            goto L_0x0066
        L_0x00ad:
            com.squareup.moshi.h r1 = ME.c.w(r14, r14, r1)
            throw r1
        L_0x00b2:
            com.squareup.moshi.f<java.lang.Integer> r5 = r0.intAdapter
            java.lang.Object r5 = r5.fromJson((com.squareup.moshi.k) r1)
            r17 = r5
            java.lang.Integer r17 = (java.lang.Integer) r17
            if (r17 == 0) goto L_0x00bf
            goto L_0x00ac
        L_0x00bf:
            com.squareup.moshi.h r1 = ME.c.w(r2, r2, r1)
            throw r1
        L_0x00c4:
            com.squareup.moshi.f<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x00da
            r15 = r2
            r12 = r18
            r10 = r26
            r9 = r27
            r8 = r28
            r7 = r29
            goto L_0x0072
        L_0x00da:
            com.squareup.moshi.h r1 = ME.c.w(r15, r15, r1)
            throw r1
        L_0x00df:
            com.squareup.moshi.f<android.net.Uri> r2 = r0.nullableUriAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r16 = r2
            android.net.Uri r16 = (android.net.Uri) r16
            r3 = r3 & -1025(0xfffffffffffffbff, float:NaN)
            goto L_0x0066
        L_0x00ed:
            com.squareup.moshi.f<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0105
            r12 = r18
            r10 = r26
            r9 = r27
            r8 = r28
            r7 = r29
            r15 = r30
            goto L_0x0074
        L_0x0105:
            com.squareup.moshi.h r1 = ME.c.w(r7, r7, r1)
            throw r1
        L_0x010a:
            com.squareup.moshi.f<java.time.Instant> r2 = r0.instantAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r14 = r2
            java.time.Instant r14 = (java.time.Instant) r14
            if (r14 == 0) goto L_0x0125
            r12 = r18
            r10 = r26
            r9 = r27
            r8 = r28
            r7 = r29
            r15 = r30
            r2 = r31
            goto L_0x0026
        L_0x0125:
            com.squareup.moshi.h r1 = ME.c.w(r8, r8, r1)
            throw r1
        L_0x012a:
            com.squareup.moshi.f<java.time.Instant> r2 = r0.instantAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r13 = r2
            java.time.Instant r13 = (java.time.Instant) r13
            if (r13 == 0) goto L_0x0137
            goto L_0x00ac
        L_0x0137:
            com.squareup.moshi.h r1 = ME.c.w(r9, r9, r1)
            throw r1
        L_0x013c:
            com.squareup.moshi.f<java.util.List<com.sugarcube.core.network.models.PlacedFurniture>> r2 = r0.nullableListOfPlacedFurnitureAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r12 = r2
            java.util.List r12 = (java.util.List) r12
            r3 = r3 & -65
            goto L_0x0068
        L_0x0149:
            com.squareup.moshi.f<java.util.UUID> r2 = r0.uUIDAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r11 = r2
            java.util.UUID r11 = (java.util.UUID) r11
            if (r11 == 0) goto L_0x0156
            goto L_0x00ac
        L_0x0156:
            com.squareup.moshi.h r1 = ME.c.w(r12, r6, r1)
            throw r1
        L_0x015b:
            com.squareup.moshi.f<java.lang.Integer> r2 = r0.nullableIntAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r10 = r2
            java.lang.Integer r10 = (java.lang.Integer) r10
            r3 = r3 & -17
            r12 = r18
            goto L_0x006a
        L_0x016a:
            com.squareup.moshi.f<android.net.Uri> r2 = r0.nullableUriAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r9 = r2
            android.net.Uri r9 = (android.net.Uri) r9
            r3 = r3 & -9
            r12 = r18
            r10 = r26
            goto L_0x006c
        L_0x017b:
            com.squareup.moshi.f<android.net.Uri> r2 = r0.nullableUriAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r8 = r2
            android.net.Uri r8 = (android.net.Uri) r8
            r3 = r3 & -5
            r12 = r18
            r10 = r26
            r9 = r27
            goto L_0x006e
        L_0x018e:
            com.squareup.moshi.f<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            r3 = r3 & -3
            r12 = r18
            r10 = r26
            r9 = r27
            r8 = r28
            goto L_0x0070
        L_0x01a3:
            com.squareup.moshi.f<java.lang.Integer> r2 = r0.intAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.k) r1)
            r4 = r2
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x01b0
            goto L_0x00ac
        L_0x01b0:
            com.squareup.moshi.h r1 = ME.c.w(r10, r10, r1)
            throw r1
        L_0x01b5:
            r54.w()
            r54.a0()
            goto L_0x0066
        L_0x01bd:
            r54.f()
            r5 = -246879(0xfffffffffffc3ba1, float:NaN)
            if (r3 != r5) goto L_0x022b
            com.sugarcube.core.network.models.Composition r3 = new com.sugarcube.core.network.models.Composition
            if (r4 == 0) goto L_0x0226
            int r4 = r4.intValue()
            if (r11 == 0) goto L_0x0221
            if (r13 == 0) goto L_0x021c
            if (r32 == 0) goto L_0x0217
            if (r31 == 0) goto L_0x0212
            boolean r22 = r31.booleanValue()
            if (r30 == 0) goto L_0x020d
            boolean r23 = r30.booleanValue()
            if (r17 == 0) goto L_0x0208
            int r2 = r17.intValue()
            if (r19 == 0) goto L_0x0203
            r5 = r3
            r6 = r4
            r7 = r29
            r8 = r28
            r9 = r27
            r10 = r26
            r12 = r18
            r14 = r32
            r15 = r22
            r17 = r23
            r18 = r2
            r22 = r24
            r23 = r25
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r3
        L_0x0203:
            com.squareup.moshi.h r1 = ME.c.n(r14, r14, r1)
            throw r1
        L_0x0208:
            com.squareup.moshi.h r1 = ME.c.n(r2, r2, r1)
            throw r1
        L_0x020d:
            com.squareup.moshi.h r1 = ME.c.n(r15, r15, r1)
            throw r1
        L_0x0212:
            com.squareup.moshi.h r1 = ME.c.n(r7, r7, r1)
            throw r1
        L_0x0217:
            com.squareup.moshi.h r1 = ME.c.n(r8, r8, r1)
            throw r1
        L_0x021c:
            com.squareup.moshi.h r1 = ME.c.n(r9, r9, r1)
            throw r1
        L_0x0221:
            com.squareup.moshi.h r1 = ME.c.n(r12, r6, r1)
            throw r1
        L_0x0226:
            com.squareup.moshi.h r1 = ME.c.n(r10, r10, r1)
            throw r1
        L_0x022b:
            java.lang.reflect.Constructor<com.sugarcube.core.network.models.Composition> r5 = r0.constructorRef
            if (r5 != 0) goto L_0x026c
            java.lang.Class r45 = java.lang.Integer.TYPE
            r33 = r45
            r51 = r45
            java.lang.Class r44 = java.lang.Boolean.TYPE
            r42 = r44
            java.lang.Class<android.net.Uri> r50 = android.net.Uri.class
            java.lang.Class<?> r52 = ME.c.f112014c
            java.lang.Class<java.lang.String> r34 = java.lang.String.class
            java.lang.Class<android.net.Uri> r35 = android.net.Uri.class
            java.lang.Class<android.net.Uri> r36 = android.net.Uri.class
            java.lang.Class<java.lang.Integer> r37 = java.lang.Integer.class
            java.lang.Class<java.util.UUID> r38 = java.util.UUID.class
            java.lang.Class<java.util.List> r39 = java.util.List.class
            java.lang.Class<java.time.Instant> r40 = java.time.Instant.class
            java.lang.Class<java.time.Instant> r41 = java.time.Instant.class
            java.lang.Class<android.net.Uri> r43 = android.net.Uri.class
            java.lang.Class<java.util.UUID> r46 = java.util.UUID.class
            java.lang.Class<java.lang.String> r47 = java.lang.String.class
            java.lang.Class<com.sugarcube.core.network.models.CompositionSavedProperties> r48 = com.sugarcube.core.network.models.CompositionSavedProperties.class
            java.lang.Class<java.util.Map> r49 = java.util.Map.class
            java.lang.Class[] r5 = new java.lang.Class[]{r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52}
            r22 = r10
            java.lang.Class<com.sugarcube.core.network.models.Composition> r10 = com.sugarcube.core.network.models.Composition.class
            java.lang.reflect.Constructor r5 = r10.getDeclaredConstructor(r5)
            r0.constructorRef = r5
            java.lang.String r10 = "also(...)"
            kotlin.jvm.internal.C17542s.i(r5, r10)
        L_0x026a:
            r10 = r5
            goto L_0x026f
        L_0x026c:
            r22 = r10
            goto L_0x026a
        L_0x026f:
            if (r4 == 0) goto L_0x02d9
            if (r11 == 0) goto L_0x02d4
            if (r13 == 0) goto L_0x02cf
            if (r32 == 0) goto L_0x02ca
            if (r31 == 0) goto L_0x02c5
            if (r30 == 0) goto L_0x02c0
            if (r17 == 0) goto L_0x02bb
            if (r19 == 0) goto L_0x02b6
            java.lang.Integer r22 = java.lang.Integer.valueOf(r3)
            r23 = 0
            r5 = r29
            r6 = r28
            r7 = r27
            r8 = r26
            r9 = r11
            r1 = r10
            r10 = r18
            r11 = r13
            r12 = r32
            r13 = r31
            r14 = r16
            r15 = r30
            r16 = r17
            r17 = r19
            r18 = r20
            r19 = r21
            r20 = r24
            r21 = r25
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23}
            java.lang.Object r1 = r1.newInstance(r2)
            java.lang.String r2 = "newInstance(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)
            com.sugarcube.core.network.models.Composition r1 = (com.sugarcube.core.network.models.Composition) r1
            return r1
        L_0x02b6:
            com.squareup.moshi.h r1 = ME.c.n(r14, r14, r1)
            throw r1
        L_0x02bb:
            com.squareup.moshi.h r1 = ME.c.n(r2, r2, r1)
            throw r1
        L_0x02c0:
            com.squareup.moshi.h r1 = ME.c.n(r15, r15, r1)
            throw r1
        L_0x02c5:
            com.squareup.moshi.h r1 = ME.c.n(r7, r7, r1)
            throw r1
        L_0x02ca:
            com.squareup.moshi.h r1 = ME.c.n(r8, r8, r1)
            throw r1
        L_0x02cf:
            com.squareup.moshi.h r1 = ME.c.n(r9, r9, r1)
            throw r1
        L_0x02d4:
            com.squareup.moshi.h r1 = ME.c.n(r12, r6, r1)
            throw r1
        L_0x02d9:
            r2 = r22
            com.squareup.moshi.h r1 = ME.c.n(r2, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.CompositionJsonAdapter.fromJson(com.squareup.moshi.k):com.sugarcube.core.network.models.Composition");
    }

    public void toJson(q qVar, Composition composition) {
        C17542s.j(qVar, "writer");
        if (composition != null) {
            qVar.d();
            qVar.n("compositionId");
            this.intAdapter.toJson(qVar, Integer.valueOf(composition.getCompositionId()));
            qVar.n("name");
            this.nullableStringAdapter.toJson(qVar, composition.getName());
            qVar.n("baseImageUrl");
            this.nullableUriAdapter.toJson(qVar, composition.getBaseImageUrl());
            qVar.n("thumbnailUrl");
            this.nullableUriAdapter.toJson(qVar, composition.getThumbnailUrl());
            qVar.n("wid");
            this.nullableIntAdapter.toJson(qVar, composition.getWid());
            qVar.n("uuid");
            this.uUIDAdapter.toJson(qVar, composition.getCompositionUuid());
            qVar.n("placedfurnitureSet");
            this.nullableListOfPlacedFurnitureAdapter.toJson(qVar, composition.getPlacedFurnitureSet());
            qVar.n("createdAt");
            this.instantAdapter.toJson(qVar, composition.getCreatedAt());
            qVar.n("lastModifiedTs");
            this.instantAdapter.toJson(qVar, composition.getLastModifiedTs());
            qVar.n("isShared");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(composition.isShared()));
            qVar.n("publicCompositionImageUrl");
            this.nullableUriAdapter.toJson(qVar, composition.getPublicCompositionImageUrl());
            qVar.n("isStock");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(composition.isStock()));
            qVar.n("sceneId");
            this.intAdapter.toJson(qVar, Integer.valueOf(composition.getSceneId()));
            qVar.n("sceneUuid");
            this.uUIDAdapter.toJson(qVar, composition.getSceneUuid());
            qVar.n("baseImageData");
            this.nullableStringAdapter.toJson(qVar, composition.getBaseImageData());
            qVar.n("savedProperties");
            this.nullableCompositionSavedPropertiesAdapter.toJson(qVar, composition.getSavedProperties());
            qVar.n("gltf");
            this.nullableMapOfStringAnyAdapter.toJson(qVar, composition.getGltf());
            qVar.n("shareUrl");
            this.nullableUriAdapter.toJson(qVar, composition.getShareUrl());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
