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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/core/network/models/PosXYZJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/PosXYZ;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/PosXYZ;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/PosXYZ;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "doubleAdapter", "Lcom/squareup/moshi/f;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PosXYZJsonAdapter extends f<PosXYZ> {
    private volatile Constructor<PosXYZ> constructorRef;
    private final f<Double> doubleAdapter;
    private final k.a options;

    public PosXYZJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("x", "y", "z");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Double> f10 = tVar.f(Double.TYPE, g0.d(), "x");
        C17542s.i(f10, "adapter(...)");
        this.doubleAdapter = f10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("PosXYZ");
        sb2.append(')');
        return sb2.toString();
    }

    public PosXYZ fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        Double valueOf = Double.valueOf(0.0d);
        kVar.d();
        Double d10 = valueOf;
        Double d11 = d10;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                valueOf = this.doubleAdapter.fromJson(kVar);
                if (valueOf != null) {
                    i10 &= -2;
                } else {
                    throw c.w("x", "x", kVar);
                }
            } else if (s10 == 1) {
                d10 = this.doubleAdapter.fromJson(kVar);
                if (d10 != null) {
                    i10 &= -3;
                } else {
                    throw c.w("y", "y", kVar);
                }
            } else if (s10 == 2) {
                d11 = this.doubleAdapter.fromJson(kVar);
                if (d11 != null) {
                    i10 &= -5;
                } else {
                    throw c.w("z", "z", kVar);
                }
            } else {
                continue;
            }
        }
        kVar.f();
        if (i10 == -8) {
            return new PosXYZ(valueOf.doubleValue(), d10.doubleValue(), d11.doubleValue());
        }
        Constructor<PosXYZ> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Double.TYPE;
            constructor = PosXYZ.class.getDeclaredConstructor(new Class[]{cls, cls, cls, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        PosXYZ newInstance = constructor.newInstance(new Object[]{valueOf, d10, d11, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, PosXYZ posXYZ) {
        C17542s.j(qVar, "writer");
        if (posXYZ != null) {
            qVar.d();
            qVar.n("x");
            this.doubleAdapter.toJson(qVar, Double.valueOf(posXYZ.getX()));
            qVar.n("y");
            this.doubleAdapter.toJson(qVar, Double.valueOf(posXYZ.getY()));
            qVar.n("z");
            this.doubleAdapter.toJson(qVar, Double.valueOf(posXYZ.getZ()));
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
