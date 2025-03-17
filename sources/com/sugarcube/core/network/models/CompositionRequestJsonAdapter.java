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

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/sugarcube/core/network/models/CompositionRequestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/CompositionRequest;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/CompositionRequest;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/CompositionRequest;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "Ljava/util/UUID;", "nullableUUIDAdapter", "", "Lcom/sugarcube/core/network/models/PlacedFurniture;", "nullableListOfPlacedFurnitureAdapter", "", "nullableBooleanAdapter", "Lcom/sugarcube/core/network/models/CompositionSavedProperties;", "nullableCompositionSavedPropertiesAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompositionRequestJsonAdapter extends f<CompositionRequest> {
    private volatile Constructor<CompositionRequest> constructorRef;
    private final f<Boolean> nullableBooleanAdapter;
    private final f<CompositionSavedProperties> nullableCompositionSavedPropertiesAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<List<PlacedFurniture>> nullableListOfPlacedFurnitureAdapter;
    private final f<String> nullableStringAdapter;
    private final f<UUID> nullableUUIDAdapter;
    private final k.a options;

    public CompositionRequestJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("compositionId", "name", "sceneId", "uuid", "placedFurniture", "isShared", "sceneUuid", "baseImageData", "savedProperties");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar.f(Integer.class, g0.d(), "compositionId");
        C17542s.i(f10, "adapter(...)");
        this.nullableIntAdapter = f10;
        f<String> f11 = tVar.f(String.class, g0.d(), "name");
        C17542s.i(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        f<UUID> f12 = tVar.f(UUID.class, g0.d(), "uuid");
        C17542s.i(f12, "adapter(...)");
        this.nullableUUIDAdapter = f12;
        f<List<PlacedFurniture>> f13 = tVar.f(w.j(List.class, PlacedFurniture.class), g0.d(), "placedFurniture");
        C17542s.i(f13, "adapter(...)");
        this.nullableListOfPlacedFurnitureAdapter = f13;
        f<Boolean> f14 = tVar.f(Boolean.class, g0.d(), "isShared");
        C17542s.i(f14, "adapter(...)");
        this.nullableBooleanAdapter = f14;
        f<CompositionSavedProperties> f15 = tVar.f(CompositionSavedProperties.class, g0.d(), "savedProperties");
        C17542s.i(f15, "adapter(...)");
        this.nullableCompositionSavedPropertiesAdapter = f15;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CompositionRequest");
        sb2.append(')');
        return sb2.toString();
    }

    public CompositionRequest fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        kVar.d();
        Integer num = null;
        int i10 = -1;
        String str = null;
        Integer num2 = null;
        UUID uuid = null;
        List list = null;
        Boolean bool = null;
        UUID uuid2 = null;
        String str2 = null;
        CompositionSavedProperties compositionSavedProperties = null;
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
                    str = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -3;
                    break;
                case 2:
                    num2 = this.nullableIntAdapter.fromJson(kVar2);
                    i10 &= -5;
                    break;
                case 3:
                    uuid = this.nullableUUIDAdapter.fromJson(kVar2);
                    i10 &= -9;
                    break;
                case 4:
                    list = this.nullableListOfPlacedFurnitureAdapter.fromJson(kVar2);
                    i10 &= -17;
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(kVar2);
                    i10 &= -33;
                    break;
                case 6:
                    uuid2 = this.nullableUUIDAdapter.fromJson(kVar2);
                    i10 &= -65;
                    break;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -129;
                    break;
                case 8:
                    compositionSavedProperties = this.nullableCompositionSavedPropertiesAdapter.fromJson(kVar2);
                    i10 &= -257;
                    break;
            }
        }
        kVar.f();
        if (i10 == -512) {
            return new CompositionRequest(num, str, num2, uuid, list, bool, uuid2, str2, compositionSavedProperties);
        }
        Constructor<CompositionRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CompositionRequest.class.getDeclaredConstructor(new Class[]{Integer.class, String.class, Integer.class, UUID.class, List.class, Boolean.class, UUID.class, String.class, CompositionSavedProperties.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        CompositionRequest newInstance = constructor.newInstance(new Object[]{num, str, num2, uuid, list, bool, uuid2, str2, compositionSavedProperties, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, CompositionRequest compositionRequest) {
        C17542s.j(qVar, "writer");
        if (compositionRequest != null) {
            qVar.d();
            qVar.n("compositionId");
            this.nullableIntAdapter.toJson(qVar, compositionRequest.getCompositionId());
            qVar.n("name");
            this.nullableStringAdapter.toJson(qVar, compositionRequest.getName());
            qVar.n("sceneId");
            this.nullableIntAdapter.toJson(qVar, compositionRequest.getSceneId());
            qVar.n("uuid");
            this.nullableUUIDAdapter.toJson(qVar, compositionRequest.getUuid());
            qVar.n("placedFurniture");
            this.nullableListOfPlacedFurnitureAdapter.toJson(qVar, compositionRequest.getPlacedFurniture());
            qVar.n("isShared");
            this.nullableBooleanAdapter.toJson(qVar, compositionRequest.isShared());
            qVar.n("sceneUuid");
            this.nullableUUIDAdapter.toJson(qVar, compositionRequest.getSceneUuid());
            qVar.n("baseImageData");
            this.nullableStringAdapter.toJson(qVar, compositionRequest.getBaseImageData());
            qVar.n("savedProperties");
            this.nullableCompositionSavedPropertiesAdapter.toJson(qVar, compositionRequest.getSavedProperties());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
