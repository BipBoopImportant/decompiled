package com.sugarcube.core.network.models;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a\u0018\u00010\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/sugarcube/core/network/models/PolygonJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/Polygon;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/Polygon;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/Polygon;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/f;", "", "nullableListOfIntAdapter", "nullableStringAdapter", "Lcom/sugarcube/core/network/models/PolygonParameters;", "nullablePolygonParametersAdapter", "", "nullableListOfListOfDoubleAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PolygonJsonAdapter extends f<Polygon> {
    private volatile Constructor<Polygon> constructorRef;
    private final f<Integer> nullableIntAdapter;
    private final f<List<Integer>> nullableListOfIntAdapter;
    private final f<List<List<Double>>> nullableListOfListOfDoubleAdapter;
    private final f<PolygonParameters> nullablePolygonParametersAdapter;
    private final f<String> nullableStringAdapter;
    private final k.a options;

    public PolygonJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("id", "children", "class", "parameters", "transform", "matrixModel");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        Class<Integer> cls = Integer.class;
        f<Integer> f10 = tVar.f(cls, g0.d(), "id");
        C17542s.i(f10, "adapter(...)");
        this.nullableIntAdapter = f10;
        Type[] typeArr = {cls};
        Class<List> cls2 = List.class;
        f<List<Integer>> f11 = tVar.f(w.j(cls2, typeArr), g0.d(), "children");
        C17542s.i(f11, "adapter(...)");
        this.nullableListOfIntAdapter = f11;
        f<String> f12 = tVar.f(String.class, g0.d(), "category");
        C17542s.i(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        f<PolygonParameters> f13 = tVar.f(PolygonParameters.class, g0.d(), "parameters");
        C17542s.i(f13, "adapter(...)");
        this.nullablePolygonParametersAdapter = f13;
        f<List<List<Double>>> f14 = tVar.f(w.j(cls2, w.j(cls2, Double.class)), g0.d(), "transformAlt0");
        C17542s.i(f14, "adapter(...)");
        this.nullableListOfListOfDoubleAdapter = f14;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Polygon");
        sb2.append(')');
        return sb2.toString();
    }

    public Polygon fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        kVar.d();
        Integer num = null;
        int i10 = -1;
        List list = null;
        String str = null;
        PolygonParameters polygonParameters = null;
        List list2 = null;
        List list3 = null;
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
                    list = this.nullableListOfIntAdapter.fromJson(kVar2);
                    i10 &= -3;
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -5;
                    break;
                case 3:
                    polygonParameters = this.nullablePolygonParametersAdapter.fromJson(kVar2);
                    i10 &= -9;
                    break;
                case 4:
                    list2 = this.nullableListOfListOfDoubleAdapter.fromJson(kVar2);
                    i10 &= -17;
                    break;
                case 5:
                    list3 = this.nullableListOfListOfDoubleAdapter.fromJson(kVar2);
                    i10 &= -33;
                    break;
            }
        }
        kVar.f();
        if (i10 == -64) {
            return new Polygon(num, list, str, polygonParameters, list2, list3);
        }
        Constructor<Polygon> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Polygon.class.getDeclaredConstructor(new Class[]{Integer.class, List.class, String.class, PolygonParameters.class, List.class, List.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        Polygon newInstance = constructor.newInstance(new Object[]{num, list, str, polygonParameters, list2, list3, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, Polygon polygon) {
        C17542s.j(qVar, "writer");
        if (polygon != null) {
            qVar.d();
            qVar.n("id");
            this.nullableIntAdapter.toJson(qVar, polygon.getId());
            qVar.n("children");
            this.nullableListOfIntAdapter.toJson(qVar, polygon.getChildren());
            qVar.n("class");
            this.nullableStringAdapter.toJson(qVar, polygon.getCategory());
            qVar.n("parameters");
            this.nullablePolygonParametersAdapter.toJson(qVar, polygon.getParameters());
            qVar.n("transform");
            this.nullableListOfListOfDoubleAdapter.toJson(qVar, polygon.getTransformAlt0());
            qVar.n("matrixModel");
            this.nullableListOfListOfDoubleAdapter.toJson(qVar, polygon.getTransformAlt1());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
