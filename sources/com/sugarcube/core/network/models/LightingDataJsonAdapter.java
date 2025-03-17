package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/core/network/models/LightingDataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/LightingData;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/LightingData;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/LightingData;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "Lcom/sugarcube/core/network/models/LightsData;", "lightsDataAdapter", "Lcom/squareup/moshi/f;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LightingDataJsonAdapter extends f<LightingData> {
    private volatile Constructor<LightingData> constructorRef;
    private final f<LightsData> lightsDataAdapter;
    private final k.a options;

    public LightingDataJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("lights");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<LightsData> f10 = tVar.f(LightsData.class, g0.d(), "lightsData");
        C17542s.i(f10, "adapter(...)");
        this.lightsDataAdapter = f10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("LightingData");
        sb2.append(')');
        return sb2.toString();
    }

    public LightingData fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        LightsData lightsData = null;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                lightsData = this.lightsDataAdapter.fromJson(kVar);
                if (lightsData != null) {
                    i10 = -2;
                } else {
                    throw c.w("lightsData", "lights", kVar);
                }
            } else {
                continue;
            }
        }
        kVar.f();
        if (i10 == -2) {
            C17542s.h(lightsData, "null cannot be cast to non-null type com.sugarcube.core.network.models.LightsData");
            return new LightingData(lightsData);
        }
        Constructor<LightingData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LightingData.class.getDeclaredConstructor(new Class[]{LightsData.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        LightingData newInstance = constructor.newInstance(new Object[]{lightsData, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, LightingData lightingData) {
        C17542s.j(qVar, "writer");
        if (lightingData != null) {
            qVar.d();
            qVar.n("lights");
            this.lightsDataAdapter.toJson(qVar, lightingData.getLightsData());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
