package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010#0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/sugarcube/core/network/models/FurnitureGfxAttributesJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/FurnitureGfxAttributes;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/FurnitureGfxAttributes;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/FurnitureGfxAttributes;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "Lcom/sugarcube/core/network/models/FurnitureArtData;", "nullableFurnitureArtDataAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "Lcom/sugarcube/core/network/models/PosXYZ;", "nullablePosXYZAdapter", "", "nullableLongAdapter", "", "nullableIntAdapter", "", "nullableBooleanAdapter", "", "nullableListOfIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FurnitureGfxAttributesJsonAdapter extends f<FurnitureGfxAttributes> {
    private volatile Constructor<FurnitureGfxAttributes> constructorRef;
    private final f<Boolean> nullableBooleanAdapter;
    private final f<FurnitureArtData> nullableFurnitureArtDataAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<List<Integer>> nullableListOfIntAdapter;
    private final f<Long> nullableLongAdapter;
    private final f<PosXYZ> nullablePosXYZAdapter;
    private final f<String> nullableStringAdapter;
    private final k.a options;

    public FurnitureGfxAttributesJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("artData", "stackedPlane", "position", "parentId", "anchorCombinationIndex", "mirrorOptionEnabled", "additionalContacts");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<FurnitureArtData> f10 = tVar.f(FurnitureArtData.class, g0.d(), "artData");
        C17542s.i(f10, "adapter(...)");
        this.nullableFurnitureArtDataAdapter = f10;
        f<String> f11 = tVar.f(String.class, g0.d(), "legacyStackedPlane");
        C17542s.i(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        f<PosXYZ> f12 = tVar.f(PosXYZ.class, g0.d(), "legacyRelativePosition");
        C17542s.i(f12, "adapter(...)");
        this.nullablePosXYZAdapter = f12;
        f<Long> f13 = tVar.f(Long.class, g0.d(), "parentId");
        C17542s.i(f13, "adapter(...)");
        this.nullableLongAdapter = f13;
        Class<Integer> cls = Integer.class;
        f<Integer> f14 = tVar.f(cls, g0.d(), "anchorCombinationIndex");
        C17542s.i(f14, "adapter(...)");
        this.nullableIntAdapter = f14;
        f<Boolean> f15 = tVar.f(Boolean.class, g0.d(), "mirrorOptionEnabled");
        C17542s.i(f15, "adapter(...)");
        this.nullableBooleanAdapter = f15;
        f<List<Integer>> f16 = tVar.f(w.j(List.class, cls), g0.d(), "additionalContacts");
        C17542s.i(f16, "adapter(...)");
        this.nullableListOfIntAdapter = f16;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FurnitureGfxAttributes");
        sb2.append(')');
        return sb2.toString();
    }

    public FurnitureGfxAttributes fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        kVar.d();
        FurnitureArtData furnitureArtData = null;
        int i10 = -1;
        String str = null;
        PosXYZ posXYZ = null;
        Long l10 = null;
        Integer num = null;
        Boolean bool = null;
        List list = null;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    break;
                case 0:
                    furnitureArtData = this.nullableFurnitureArtDataAdapter.fromJson(kVar2);
                    i10 &= -2;
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -3;
                    break;
                case 2:
                    posXYZ = this.nullablePosXYZAdapter.fromJson(kVar2);
                    i10 &= -5;
                    break;
                case 3:
                    l10 = this.nullableLongAdapter.fromJson(kVar2);
                    i10 &= -9;
                    break;
                case 4:
                    num = this.nullableIntAdapter.fromJson(kVar2);
                    i10 &= -17;
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(kVar2);
                    i10 &= -33;
                    break;
                case 6:
                    list = this.nullableListOfIntAdapter.fromJson(kVar2);
                    i10 &= -65;
                    break;
            }
        }
        kVar.f();
        if (i10 == -128) {
            return new FurnitureGfxAttributes(furnitureArtData, str, posXYZ, l10, num, bool, list);
        }
        Constructor<FurnitureGfxAttributes> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FurnitureGfxAttributes.class.getDeclaredConstructor(new Class[]{FurnitureArtData.class, String.class, PosXYZ.class, Long.class, Integer.class, Boolean.class, List.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        FurnitureGfxAttributes newInstance = constructor.newInstance(new Object[]{furnitureArtData, str, posXYZ, l10, num, bool, list, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, FurnitureGfxAttributes furnitureGfxAttributes) {
        C17542s.j(qVar, "writer");
        if (furnitureGfxAttributes != null) {
            qVar.d();
            qVar.n("artData");
            this.nullableFurnitureArtDataAdapter.toJson(qVar, furnitureGfxAttributes.getArtData());
            qVar.n("stackedPlane");
            this.nullableStringAdapter.toJson(qVar, furnitureGfxAttributes.getLegacyStackedPlane());
            qVar.n("position");
            this.nullablePosXYZAdapter.toJson(qVar, furnitureGfxAttributes.getLegacyRelativePosition());
            qVar.n("parentId");
            this.nullableLongAdapter.toJson(qVar, furnitureGfxAttributes.getParentId());
            qVar.n("anchorCombinationIndex");
            this.nullableIntAdapter.toJson(qVar, furnitureGfxAttributes.getAnchorCombinationIndex());
            qVar.n("mirrorOptionEnabled");
            this.nullableBooleanAdapter.toJson(qVar, furnitureGfxAttributes.getMirrorOptionEnabled());
            qVar.n("additionalContacts");
            this.nullableListOfIntAdapter.toJson(qVar, furnitureGfxAttributes.getAdditionalContacts());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
