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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/sugarcube/core/network/models/PlaneDataJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/PlaneData;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/PlaneData;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/PlaneData;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "", "listOfListOfDoubleAdapter", "Lcom/squareup/moshi/f;", "doubleAdapter", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlaneDataJsonAdapter extends f<PlaneData> {
    private volatile Constructor<PlaneData> constructorRef;
    private final f<Double> doubleAdapter;
    private final f<List<List<Double>>> listOfListOfDoubleAdapter;
    private final k.a options;
    private final f<String> stringAdapter;

    public PlaneDataJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("rot", "d", "class");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        Class<List> cls = List.class;
        f<List<List<Double>>> f10 = tVar.f(w.j(cls, w.j(cls, Double.class)), g0.d(), "orientation");
        C17542s.i(f10, "adapter(...)");
        this.listOfListOfDoubleAdapter = f10;
        f<Double> f11 = tVar.f(Double.TYPE, g0.d(), "distance");
        C17542s.i(f11, "adapter(...)");
        this.doubleAdapter = f11;
        f<String> f12 = tVar.f(String.class, g0.d(), "category");
        C17542s.i(f12, "adapter(...)");
        this.stringAdapter = f12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PlaneData");
        sb2.append(')');
        return sb2.toString();
    }

    public PlaneData fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        Double valueOf = Double.valueOf(0.0d);
        kVar.d();
        List list = null;
        String str = null;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                list = this.listOfListOfDoubleAdapter.fromJson(kVar);
                if (list != null) {
                    i10 &= -2;
                } else {
                    throw c.w("orientation", "rot", kVar);
                }
            } else if (s10 == 1) {
                valueOf = this.doubleAdapter.fromJson(kVar);
                if (valueOf != null) {
                    i10 &= -3;
                } else {
                    throw c.w("distance", "d", kVar);
                }
            } else if (s10 == 2) {
                str = this.stringAdapter.fromJson(kVar);
                if (str != null) {
                    i10 &= -5;
                } else {
                    throw c.w("category", "class", kVar);
                }
            } else {
                continue;
            }
        }
        kVar.f();
        if (i10 == -8) {
            C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<kotlin.Double>>");
            double doubleValue = valueOf.doubleValue();
            C17542s.h(str, "null cannot be cast to non-null type kotlin.String");
            return new PlaneData(list, doubleValue, str);
        }
        Constructor<PlaneData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PlaneData.class.getDeclaredConstructor(new Class[]{List.class, Double.TYPE, String.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        PlaneData newInstance = constructor.newInstance(new Object[]{list, valueOf, str, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, PlaneData planeData) {
        C17542s.j(qVar, "writer");
        if (planeData != null) {
            qVar.d();
            qVar.n("rot");
            this.listOfListOfDoubleAdapter.toJson(qVar, planeData.getOrientation());
            qVar.n("d");
            this.doubleAdapter.toJson(qVar, Double.valueOf(planeData.getDistance()));
            qVar.n("class");
            this.stringAdapter.toJson(qVar, planeData.getCategory());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
