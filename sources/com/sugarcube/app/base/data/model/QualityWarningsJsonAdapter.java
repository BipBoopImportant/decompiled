package com.sugarcube.app.base.data.model;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/app/base/data/model/QualityWarningsJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/app/base/data/model/QualityWarnings;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/app/base/data/model/QualityWarnings;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/app/base/data/model/QualityWarnings;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "floatAdapter", "Lcom/squareup/moshi/f;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QualityWarningsJsonAdapter extends f<QualityWarnings> {
    public static final int $stable = 8;
    private volatile Constructor<QualityWarnings> constructorRef;
    private final f<Float> floatAdapter;
    private final k.a options;

    public QualityWarningsJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("badFrames", "excessiveMotion", "lightingScan", "principalPoint", "lowIntensity");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Float> f10 = tVar.f(Float.TYPE, g0.d(), "badFrames");
        C17542s.i(f10, "adapter(...)");
        this.floatAdapter = f10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("QualityWarnings");
        sb2.append(')');
        return sb2.toString();
    }

    public QualityWarnings fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        Float valueOf = Float.valueOf(0.0f);
        kVar.d();
        Float f10 = valueOf;
        Float f11 = f10;
        Float f12 = f11;
        Float f13 = f12;
        Float f14 = f13;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                f10 = this.floatAdapter.fromJson(kVar);
                if (f10 != null) {
                    i10 &= -2;
                } else {
                    throw c.w("badFrames", "badFrames", kVar);
                }
            } else if (s10 == 1) {
                f11 = this.floatAdapter.fromJson(kVar);
                if (f11 != null) {
                    i10 &= -3;
                } else {
                    throw c.w("excessiveMotion", "excessiveMotion", kVar);
                }
            } else if (s10 == 2) {
                f12 = this.floatAdapter.fromJson(kVar);
                if (f12 != null) {
                    i10 &= -5;
                } else {
                    throw c.w("lightingScan", "lightingScan", kVar);
                }
            } else if (s10 == 3) {
                f13 = this.floatAdapter.fromJson(kVar);
                if (f13 != null) {
                    i10 &= -9;
                } else {
                    throw c.w("principalPoint", "principalPoint", kVar);
                }
            } else if (s10 == 4) {
                f14 = this.floatAdapter.fromJson(kVar);
                if (f14 != null) {
                    i10 &= -17;
                } else {
                    throw c.w("lowIntensity", "lowIntensity", kVar);
                }
            } else {
                continue;
            }
        }
        kVar.f();
        if (i10 == -32) {
            return new QualityWarnings(f10.floatValue(), f11.floatValue(), f12.floatValue(), f13.floatValue(), f14.floatValue());
        }
        Constructor<QualityWarnings> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Float.TYPE;
            constructor = QualityWarnings.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, cls, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        QualityWarnings newInstance = constructor.newInstance(new Object[]{f10, f11, f12, f13, f14, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, QualityWarnings qualityWarnings) {
        C17542s.j(qVar, "writer");
        if (qualityWarnings != null) {
            qVar.d();
            qVar.n("badFrames");
            this.floatAdapter.toJson(qVar, Float.valueOf(qualityWarnings.getBadFrames()));
            qVar.n("excessiveMotion");
            this.floatAdapter.toJson(qVar, Float.valueOf(qualityWarnings.getExcessiveMotion()));
            qVar.n("lightingScan");
            this.floatAdapter.toJson(qVar, Float.valueOf(qualityWarnings.getLightingScan()));
            qVar.n("principalPoint");
            this.floatAdapter.toJson(qVar, Float.valueOf(qualityWarnings.getPrincipalPoint()));
            qVar.n("lowIntensity");
            this.floatAdapter.toJson(qVar, Float.valueOf(qualityWarnings.getLowIntensity()));
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
