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
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/sugarcube/core/network/models/SmartaPlacementRequestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/SmartaPlacementRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/SmartaPlacementRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/SmartaPlacementRequest;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "Lcom/sugarcube/core/network/models/PlacedFurniture;", "listOfPlacedFurnitureAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "Ljava/util/UUID;", "nullableUUIDAdapter", "", "booleanAdapter", "Lcom/sugarcube/core/network/models/CompositionSavedProperties;", "nullableCompositionSavedPropertiesAdapter", "", "nullableIntAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SmartaPlacementRequestJsonAdapter extends f<SmartaPlacementRequest> {
    private final f<Boolean> booleanAdapter;
    private volatile Constructor<SmartaPlacementRequest> constructorRef;
    private final f<List<PlacedFurniture>> listOfPlacedFurnitureAdapter;
    private final f<CompositionSavedProperties> nullableCompositionSavedPropertiesAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<String> nullableStringAdapter;
    private final f<UUID> nullableUUIDAdapter;
    private final k.a options;
    private final f<String> stringAdapter;

    public SmartaPlacementRequestJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("placedFurniture", "name", "sceneId", "isShared", "savedProperties", "localProductIdToPlace", "localItemNumberToPlace", "productIdMode");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<List<PlacedFurniture>> f10 = tVar.f(w.j(List.class, PlacedFurniture.class), g0.d(), "placedFurniture");
        C17542s.i(f10, "adapter(...)");
        this.listOfPlacedFurnitureAdapter = f10;
        Class<String> cls = String.class;
        f<String> f11 = tVar.f(cls, g0.d(), "name");
        C17542s.i(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        f<UUID> f12 = tVar.f(UUID.class, g0.d(), "sceneId");
        C17542s.i(f12, "adapter(...)");
        this.nullableUUIDAdapter = f12;
        f<Boolean> f13 = tVar.f(Boolean.TYPE, g0.d(), "isShared");
        C17542s.i(f13, "adapter(...)");
        this.booleanAdapter = f13;
        f<CompositionSavedProperties> f14 = tVar.f(CompositionSavedProperties.class, g0.d(), "savedProperties");
        C17542s.i(f14, "adapter(...)");
        this.nullableCompositionSavedPropertiesAdapter = f14;
        f<Integer> f15 = tVar.f(Integer.class, g0.d(), "localProductIdToPlace");
        C17542s.i(f15, "adapter(...)");
        this.nullableIntAdapter = f15;
        f<String> f16 = tVar.f(cls, g0.d(), "productIdMode");
        C17542s.i(f16, "adapter(...)");
        this.stringAdapter = f16;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SmartaPlacementRequest");
        sb2.append(')');
        return sb2.toString();
    }

    public SmartaPlacementRequest fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        kVar.d();
        List list = null;
        int i10 = -1;
        String str = null;
        UUID uuid = null;
        Boolean bool = null;
        CompositionSavedProperties compositionSavedProperties = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    break;
                case 0:
                    list = this.listOfPlacedFurnitureAdapter.fromJson(kVar2);
                    if (list != null) {
                        break;
                    } else {
                        throw c.w("placedFurniture", "placedFurniture", kVar2);
                    }
                case 1:
                    str = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 2:
                    uuid = this.nullableUUIDAdapter.fromJson(kVar2);
                    break;
                case 3:
                    bool = this.booleanAdapter.fromJson(kVar2);
                    if (bool != null) {
                        break;
                    } else {
                        throw c.w("isShared", "isShared", kVar2);
                    }
                case 4:
                    compositionSavedProperties = this.nullableCompositionSavedPropertiesAdapter.fromJson(kVar2);
                    break;
                case 5:
                    num = this.nullableIntAdapter.fromJson(kVar2);
                    i10 = -33;
                    break;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(kVar2);
                    break;
                case 7:
                    str3 = this.stringAdapter.fromJson(kVar2);
                    if (str3 != null) {
                        break;
                    } else {
                        throw c.w("productIdMode", "productIdMode", kVar2);
                    }
            }
        }
        kVar.f();
        if (i10 != -33) {
            Constructor<SmartaPlacementRequest> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = SmartaPlacementRequest.class.getDeclaredConstructor(new Class[]{List.class, String.class, UUID.class, Boolean.TYPE, CompositionSavedProperties.class, Integer.class, String.class, String.class, Integer.TYPE, c.f112014c});
                this.constructorRef = constructor;
                C17542s.i(constructor, "also(...)");
            }
            Constructor<SmartaPlacementRequest> constructor2 = constructor;
            if (list == null) {
                throw c.n("placedFurniture", "placedFurniture", kVar2);
            } else if (bool == null) {
                throw c.n("isShared", "isShared", kVar2);
            } else if (str3 != null) {
                SmartaPlacementRequest newInstance = constructor2.newInstance(new Object[]{list, str, uuid, bool, compositionSavedProperties, num, str2, str3, Integer.valueOf(i10), null});
                C17542s.i(newInstance, "newInstance(...)");
                return newInstance;
            } else {
                throw c.n("productIdMode", "productIdMode", kVar2);
            }
        } else if (list == null) {
            throw c.n("placedFurniture", "placedFurniture", kVar2);
        } else if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (str3 != null) {
                return new SmartaPlacementRequest(list, str, uuid, booleanValue, compositionSavedProperties, num, str2, str3);
            }
            throw c.n("productIdMode", "productIdMode", kVar2);
        } else {
            throw c.n("isShared", "isShared", kVar2);
        }
    }

    public void toJson(q qVar, SmartaPlacementRequest smartaPlacementRequest) {
        C17542s.j(qVar, "writer");
        if (smartaPlacementRequest != null) {
            qVar.d();
            qVar.n("placedFurniture");
            this.listOfPlacedFurnitureAdapter.toJson(qVar, smartaPlacementRequest.getPlacedFurniture());
            qVar.n("name");
            this.nullableStringAdapter.toJson(qVar, smartaPlacementRequest.getName());
            qVar.n("sceneId");
            this.nullableUUIDAdapter.toJson(qVar, smartaPlacementRequest.getSceneId());
            qVar.n("isShared");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(smartaPlacementRequest.isShared()));
            qVar.n("savedProperties");
            this.nullableCompositionSavedPropertiesAdapter.toJson(qVar, smartaPlacementRequest.getSavedProperties());
            qVar.n("localProductIdToPlace");
            this.nullableIntAdapter.toJson(qVar, smartaPlacementRequest.getLocalProductIdToPlace());
            qVar.n("localItemNumberToPlace");
            this.nullableStringAdapter.toJson(qVar, smartaPlacementRequest.getLocalItemNumberToPlace());
            qVar.n("productIdMode");
            this.stringAdapter.toJson(qVar, smartaPlacementRequest.getProductIdMode());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
