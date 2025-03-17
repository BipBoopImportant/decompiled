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

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/core/network/models/CameraPerspectiveJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/CameraPerspective;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/CameraPerspective;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/CameraPerspective;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "doubleAdapter", "Lcom/squareup/moshi/f;", "", "listOfDoubleAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraPerspectiveJsonAdapter extends f<CameraPerspective> {
    private volatile Constructor<CameraPerspective> constructorRef;
    private final f<Double> doubleAdapter;
    private final f<List<Double>> listOfDoubleAdapter;
    private final k.a options;

    public CameraPerspectiveJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("aspectRatio", "yfov", "znear", "zfar", "cxyNormalized");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Double> f10 = tVar.f(Double.TYPE, g0.d(), "aspectRatio");
        C17542s.i(f10, "adapter(...)");
        this.doubleAdapter = f10;
        f<List<Double>> f11 = tVar.f(w.j(List.class, Double.class), g0.d(), "cxyNormalized");
        C17542s.i(f11, "adapter(...)");
        this.listOfDoubleAdapter = f11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CameraPerspective");
        sb2.append(')');
        return sb2.toString();
    }

    public CameraPerspective fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        Double valueOf = Double.valueOf(0.0d);
        kVar.d();
        List list = null;
        Double d10 = valueOf;
        Double d11 = d10;
        Double d12 = d11;
        Double d13 = d12;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar2.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                d10 = this.doubleAdapter.fromJson(kVar2);
                if (d10 != null) {
                    i10 &= -2;
                } else {
                    throw c.w("aspectRatio", "aspectRatio", kVar2);
                }
            } else if (s10 == 1) {
                d11 = this.doubleAdapter.fromJson(kVar2);
                if (d11 != null) {
                    i10 &= -3;
                } else {
                    throw c.w("yfov", "yfov", kVar2);
                }
            } else if (s10 == 2) {
                d12 = this.doubleAdapter.fromJson(kVar2);
                if (d12 != null) {
                    i10 &= -5;
                } else {
                    throw c.w("znear", "znear", kVar2);
                }
            } else if (s10 == 3) {
                d13 = this.doubleAdapter.fromJson(kVar2);
                if (d13 != null) {
                    i10 &= -9;
                } else {
                    throw c.w("zfar", "zfar", kVar2);
                }
            } else if (s10 == 4) {
                list = this.listOfDoubleAdapter.fromJson(kVar2);
                if (list != null) {
                    i10 &= -17;
                } else {
                    throw c.w("cxyNormalized", "cxyNormalized", kVar2);
                }
            } else {
                continue;
            }
        }
        kVar.f();
        if (i10 == -32) {
            double doubleValue = d10.doubleValue();
            double doubleValue2 = d11.doubleValue();
            double doubleValue3 = d12.doubleValue();
            double doubleValue4 = d13.doubleValue();
            C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Double>");
            return new CameraPerspective(doubleValue, doubleValue2, doubleValue3, doubleValue4, list);
        }
        Constructor<CameraPerspective> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Double.TYPE;
            Class<CameraPerspective> cls2 = CameraPerspective.class;
            constructor = cls2.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, List.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        CameraPerspective newInstance = constructor.newInstance(new Object[]{d10, d11, d12, d13, list, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, CameraPerspective cameraPerspective) {
        C17542s.j(qVar, "writer");
        if (cameraPerspective != null) {
            qVar.d();
            qVar.n("aspectRatio");
            this.doubleAdapter.toJson(qVar, Double.valueOf(cameraPerspective.getAspectRatio()));
            qVar.n("yfov");
            this.doubleAdapter.toJson(qVar, Double.valueOf(cameraPerspective.getYfov()));
            qVar.n("znear");
            this.doubleAdapter.toJson(qVar, Double.valueOf(cameraPerspective.getZnear()));
            qVar.n("zfar");
            this.doubleAdapter.toJson(qVar, Double.valueOf(cameraPerspective.getZfar()));
            qVar.n("cxyNormalized");
            this.listOfDoubleAdapter.toJson(qVar, cameraPerspective.getCxyNormalized());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
