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

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/sugarcube/core/network/models/PlacedFurnitureJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/PlacedFurniture;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/PlacedFurniture;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/PlacedFurniture;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "", "nullableDoubleAdapter", "Lcom/sugarcube/core/network/models/LocalProduct;", "nullableLocalProductAdapter", "Lcom/sugarcube/core/network/models/FurnitureGfxAttributes;", "nullableFurnitureGfxAttributesAdapter", "", "Lcom/sugarcube/core/network/models/ParentDetails;", "nullableListOfParentDetailsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlacedFurnitureJsonAdapter extends f<PlacedFurniture> {
    private volatile Constructor<PlacedFurniture> constructorRef;
    private final f<Double> nullableDoubleAdapter;
    private final f<FurnitureGfxAttributes> nullableFurnitureGfxAttributesAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<List<ParentDetails>> nullableListOfParentDetailsAdapter;
    private final f<LocalProduct> nullableLocalProductAdapter;
    private final f<String> nullableStringAdapter;
    private final k.a options;

    public PlacedFurnitureJsonAdapter(t tVar) {
        t tVar2 = tVar;
        C17542s.j(tVar2, "moshi");
        k.a a10 = k.a.a("id", "furnitureId", "uniqueId", "x", "y", "z", "headingI", "headingJ", "headingK", "heading", "localProduct", "gfxAttributes", "parentId", "parentAttachment", "parentPath", "localItemNumber");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar2.f(Integer.class, g0.d(), "id");
        C17542s.i(f10, "adapter(...)");
        this.nullableIntAdapter = f10;
        f<String> f11 = tVar2.f(String.class, g0.d(), "uniqueId");
        C17542s.i(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        f<Double> f12 = tVar2.f(Double.class, g0.d(), "x");
        C17542s.i(f12, "adapter(...)");
        this.nullableDoubleAdapter = f12;
        f<LocalProduct> f13 = tVar2.f(LocalProduct.class, g0.d(), "localProduct");
        C17542s.i(f13, "adapter(...)");
        this.nullableLocalProductAdapter = f13;
        f<FurnitureGfxAttributes> f14 = tVar2.f(FurnitureGfxAttributes.class, g0.d(), "gfxAttributes");
        C17542s.i(f14, "adapter(...)");
        this.nullableFurnitureGfxAttributesAdapter = f14;
        f<List<ParentDetails>> f15 = tVar2.f(w.j(List.class, ParentDetails.class), g0.d(), "parentPath");
        C17542s.i(f15, "adapter(...)");
        this.nullableListOfParentDetailsAdapter = f15;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PlacedFurniture");
        sb2.append(')');
        return sb2.toString();
    }

    public PlacedFurniture fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        kVar.d();
        Integer num = null;
        int i10 = -1;
        Integer num2 = null;
        String str = null;
        Double d10 = null;
        Double d11 = null;
        Double d12 = null;
        Double d13 = null;
        Double d14 = null;
        Double d15 = null;
        Double d16 = null;
        LocalProduct localProduct = null;
        FurnitureGfxAttributes furnitureGfxAttributes = null;
        String str2 = null;
        Integer num3 = null;
        List list = null;
        String str3 = null;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    break;
                case 0:
                    num = this.nullableIntAdapter.fromJson(kVar2);
                    i10 &= -2;
                    break;
                case 1:
                    num2 = this.nullableIntAdapter.fromJson(kVar2);
                    i10 &= -3;
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -5;
                    break;
                case 3:
                    d10 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i10 &= -9;
                    break;
                case 4:
                    d11 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i10 &= -17;
                    break;
                case 5:
                    d12 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i10 &= -33;
                    break;
                case 6:
                    d13 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i10 &= -65;
                    break;
                case 7:
                    d14 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i10 &= -129;
                    break;
                case 8:
                    d15 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i10 &= -257;
                    break;
                case 9:
                    d16 = this.nullableDoubleAdapter.fromJson(kVar2);
                    i10 &= -513;
                    break;
                case 10:
                    localProduct = this.nullableLocalProductAdapter.fromJson(kVar2);
                    i10 &= -1025;
                    break;
                case 11:
                    furnitureGfxAttributes = this.nullableFurnitureGfxAttributesAdapter.fromJson(kVar2);
                    i10 &= -2049;
                    break;
                case 12:
                    str2 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -4097;
                    break;
                case 13:
                    num3 = this.nullableIntAdapter.fromJson(kVar2);
                    i10 &= -8193;
                    break;
                case 14:
                    list = this.nullableListOfParentDetailsAdapter.fromJson(kVar2);
                    i10 &= -16385;
                    break;
                case 15:
                    str3 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -32769;
                    break;
            }
        }
        kVar.f();
        if (i10 == -65536) {
            return new PlacedFurniture(num, num2, str, d10, d11, d12, d13, d14, d15, d16, localProduct, furnitureGfxAttributes, str2, num3, list, str3);
        }
        Constructor<PlacedFurniture> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PlacedFurniture.class.getDeclaredConstructor(new Class[]{Integer.class, Integer.class, String.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, LocalProduct.class, FurnitureGfxAttributes.class, String.class, Integer.class, List.class, String.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        PlacedFurniture newInstance = constructor.newInstance(new Object[]{num, num2, str, d10, d11, d12, d13, d14, d15, d16, localProduct, furnitureGfxAttributes, str2, num3, list, str3, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, PlacedFurniture placedFurniture) {
        C17542s.j(qVar, "writer");
        if (placedFurniture != null) {
            qVar.d();
            qVar.n("id");
            this.nullableIntAdapter.toJson(qVar, placedFurniture.getId());
            qVar.n("furnitureId");
            this.nullableIntAdapter.toJson(qVar, placedFurniture.getFurnitureId());
            qVar.n("uniqueId");
            this.nullableStringAdapter.toJson(qVar, placedFurniture.getUniqueId());
            qVar.n("x");
            this.nullableDoubleAdapter.toJson(qVar, placedFurniture.getX());
            qVar.n("y");
            this.nullableDoubleAdapter.toJson(qVar, placedFurniture.getY());
            qVar.n("z");
            this.nullableDoubleAdapter.toJson(qVar, placedFurniture.getZ());
            qVar.n("headingI");
            this.nullableDoubleAdapter.toJson(qVar, placedFurniture.getHeadingI());
            qVar.n("headingJ");
            this.nullableDoubleAdapter.toJson(qVar, placedFurniture.getHeadingJ());
            qVar.n("headingK");
            this.nullableDoubleAdapter.toJson(qVar, placedFurniture.getHeadingK());
            qVar.n("heading");
            this.nullableDoubleAdapter.toJson(qVar, placedFurniture.getHeading());
            qVar.n("localProduct");
            this.nullableLocalProductAdapter.toJson(qVar, placedFurniture.getLocalProduct());
            qVar.n("gfxAttributes");
            this.nullableFurnitureGfxAttributesAdapter.toJson(qVar, placedFurniture.getGfxAttributes());
            qVar.n("parentId");
            this.nullableStringAdapter.toJson(qVar, placedFurniture.getParentId());
            qVar.n("parentAttachment");
            this.nullableIntAdapter.toJson(qVar, placedFurniture.getParentAttachment());
            qVar.n("parentPath");
            this.nullableListOfParentDetailsAdapter.toJson(qVar, placedFurniture.getParentPath());
            qVar.n("localItemNumber");
            this.nullableStringAdapter.toJson(qVar, placedFurniture.getLocalItemNumber());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
