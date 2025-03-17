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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R&\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/sugarcube/core/network/models/PointLightDataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/PointLightData;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/PointLightData;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/PointLightData;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "intAdapter", "Lcom/squareup/moshi/f;", "", "", "listOfDoubleAdapter", "doubleAdapter", "listOfListOfDoubleAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PointLightDataJsonAdapter extends f<PointLightData> {
    private volatile Constructor<PointLightData> constructorRef;
    private final f<Double> doubleAdapter;
    private final f<Integer> intAdapter;
    private final f<List<Double>> listOfDoubleAdapter;
    private final f<List<List<Double>>> listOfListOfDoubleAdapter;
    private final k.a options;

    public PointLightDataJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("id", "color", "intensity", "size", "position", "volume");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar.f(Integer.TYPE, g0.d(), "id");
        C17542s.i(f10, "adapter(...)");
        this.intAdapter = f10;
        Class<Double> cls = Double.class;
        Class<List> cls2 = List.class;
        f<List<Double>> f11 = tVar.f(w.j(cls2, cls), g0.d(), "color");
        C17542s.i(f11, "adapter(...)");
        this.listOfDoubleAdapter = f11;
        f<Double> f12 = tVar.f(Double.TYPE, g0.d(), "intensity");
        C17542s.i(f12, "adapter(...)");
        this.doubleAdapter = f12;
        f<List<List<Double>>> f13 = tVar.f(w.j(cls2, w.j(cls2, cls)), g0.d(), "volume");
        C17542s.i(f13, "adapter(...)");
        this.listOfListOfDoubleAdapter = f13;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PointLightData");
        sb2.append(')');
        return sb2.toString();
    }

    public PointLightData fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        Double valueOf = Double.valueOf(0.0d);
        kVar.d();
        int i10 = -1;
        Integer num = 0;
        Double d10 = valueOf;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(kVar2);
                    if (num != null) {
                        i10 &= -2;
                        break;
                    } else {
                        throw c.w("id", "id", kVar2);
                    }
                case 1:
                    list = this.listOfDoubleAdapter.fromJson(kVar2);
                    if (list != null) {
                        i10 &= -3;
                        break;
                    } else {
                        throw c.w("color", "color", kVar2);
                    }
                case 2:
                    d10 = this.doubleAdapter.fromJson(kVar2);
                    if (d10 != null) {
                        i10 &= -5;
                        break;
                    } else {
                        throw c.w("intensity", "intensity", kVar2);
                    }
                case 3:
                    valueOf = this.doubleAdapter.fromJson(kVar2);
                    if (valueOf != null) {
                        i10 &= -9;
                        break;
                    } else {
                        throw c.w("size", "size", kVar2);
                    }
                case 4:
                    list2 = this.listOfDoubleAdapter.fromJson(kVar2);
                    if (list2 != null) {
                        i10 &= -17;
                        break;
                    } else {
                        throw c.w("position", "position", kVar2);
                    }
                case 5:
                    list3 = this.listOfListOfDoubleAdapter.fromJson(kVar2);
                    if (list3 != null) {
                        i10 &= -33;
                        break;
                    } else {
                        throw c.w("volume", "volume", kVar2);
                    }
            }
        }
        kVar.f();
        if (i10 == -64) {
            int intValue = num.intValue();
            C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Double>");
            double doubleValue = d10.doubleValue();
            double doubleValue2 = valueOf.doubleValue();
            C17542s.h(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Double>");
            C17542s.h(list3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<kotlin.Double>>");
            return new PointLightData(intValue, list, doubleValue, doubleValue2, list2, list3);
        }
        Constructor<PointLightData> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Double.TYPE;
            Class<PointLightData> cls3 = PointLightData.class;
            constructor = cls3.getDeclaredConstructor(new Class[]{cls, List.class, cls2, cls2, List.class, List.class, cls, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        PointLightData newInstance = constructor.newInstance(new Object[]{num, list, d10, valueOf, list2, list3, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, PointLightData pointLightData) {
        C17542s.j(qVar, "writer");
        if (pointLightData != null) {
            qVar.d();
            qVar.n("id");
            this.intAdapter.toJson(qVar, Integer.valueOf(pointLightData.getId()));
            qVar.n("color");
            this.listOfDoubleAdapter.toJson(qVar, pointLightData.getColor());
            qVar.n("intensity");
            this.doubleAdapter.toJson(qVar, Double.valueOf(pointLightData.getIntensity()));
            qVar.n("size");
            this.doubleAdapter.toJson(qVar, Double.valueOf(pointLightData.getSize()));
            qVar.n("position");
            this.listOfDoubleAdapter.toJson(qVar, pointLightData.getPosition());
            qVar.n("volume");
            this.listOfListOfDoubleAdapter.toJson(qVar, pointLightData.getVolume());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
