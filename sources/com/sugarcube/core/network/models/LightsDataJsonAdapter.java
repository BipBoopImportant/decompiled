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

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/sugarcube/core/network/models/LightsDataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/LightsData;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/LightsData;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/LightsData;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "Lcom/sugarcube/core/network/models/AmbientData;", "ambientDataAdapter", "Lcom/squareup/moshi/f;", "", "Lcom/sugarcube/core/network/models/PointLightData;", "listOfPointLightDataAdapter", "Lcom/sugarcube/core/network/models/DirectionalLightData;", "listOfDirectionalLightDataAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LightsDataJsonAdapter extends f<LightsData> {
    private final f<AmbientData> ambientDataAdapter;
    private volatile Constructor<LightsData> constructorRef;
    private final f<List<DirectionalLightData>> listOfDirectionalLightDataAdapter;
    private final f<List<PointLightData>> listOfPointLightDataAdapter;
    private final k.a options;

    public LightsDataJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("ambient", "point", "directional");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<AmbientData> f10 = tVar.f(AmbientData.class, g0.d(), "ambient");
        C17542s.i(f10, "adapter(...)");
        this.ambientDataAdapter = f10;
        Class<List> cls = List.class;
        f<List<PointLightData>> f11 = tVar.f(w.j(cls, PointLightData.class), g0.d(), "pointLights");
        C17542s.i(f11, "adapter(...)");
        this.listOfPointLightDataAdapter = f11;
        f<List<DirectionalLightData>> f12 = tVar.f(w.j(cls, DirectionalLightData.class), g0.d(), "directionalLights");
        C17542s.i(f12, "adapter(...)");
        this.listOfDirectionalLightDataAdapter = f12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("LightsData");
        sb2.append(')');
        return sb2.toString();
    }

    public LightsData fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        AmbientData ambientData = null;
        List list = null;
        List list2 = null;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                ambientData = this.ambientDataAdapter.fromJson(kVar);
                if (ambientData != null) {
                    i10 &= -2;
                } else {
                    throw c.w("ambient", "ambient", kVar);
                }
            } else if (s10 == 1) {
                list = this.listOfPointLightDataAdapter.fromJson(kVar);
                if (list != null) {
                    i10 &= -3;
                } else {
                    throw c.w("pointLights", "point", kVar);
                }
            } else if (s10 == 2) {
                list2 = this.listOfDirectionalLightDataAdapter.fromJson(kVar);
                if (list2 != null) {
                    i10 &= -5;
                } else {
                    throw c.w("directionalLights", "directional", kVar);
                }
            } else {
                continue;
            }
        }
        kVar.f();
        if (i10 == -8) {
            C17542s.h(ambientData, "null cannot be cast to non-null type com.sugarcube.core.network.models.AmbientData");
            C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.List<com.sugarcube.core.network.models.PointLightData>");
            C17542s.h(list2, "null cannot be cast to non-null type kotlin.collections.List<com.sugarcube.core.network.models.DirectionalLightData>");
            return new LightsData(ambientData, list, list2);
        }
        Constructor<LightsData> constructor = this.constructorRef;
        if (constructor == null) {
            Class<List> cls = List.class;
            constructor = LightsData.class.getDeclaredConstructor(new Class[]{AmbientData.class, cls, cls, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        LightsData newInstance = constructor.newInstance(new Object[]{ambientData, list, list2, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, LightsData lightsData) {
        C17542s.j(qVar, "writer");
        if (lightsData != null) {
            qVar.d();
            qVar.n("ambient");
            this.ambientDataAdapter.toJson(qVar, lightsData.getAmbient());
            qVar.n("point");
            this.listOfPointLightDataAdapter.toJson(qVar, lightsData.getPointLights());
            qVar.n("directional");
            this.listOfDirectionalLightDataAdapter.toJson(qVar, lightsData.getDirectionalLights());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
