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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/sugarcube/app/base/data/model/QualityMetaJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/app/base/data/model/QualityMeta;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/app/base/data/model/QualityMeta;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/app/base/data/model/QualityMeta;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "Lcom/sugarcube/app/base/data/model/QualityWarnings;", "qualityWarningsAdapter", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/app/base/data/model/AndroidQuality;", "androidQualityAdapter", "Lcom/sugarcube/app/base/data/model/FloorDetection;", "nullableFloorDetectionAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QualityMetaJsonAdapter extends f<QualityMeta> {
    public static final int $stable = 8;
    private final f<AndroidQuality> androidQualityAdapter;
    private volatile Constructor<QualityMeta> constructorRef;
    private final f<FloorDetection> nullableFloorDetectionAdapter;
    private final k.a options;
    private final f<QualityWarnings> qualityWarningsAdapter;

    public QualityMetaJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("warnings", "android", "floorDetection");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<QualityWarnings> f10 = tVar.f(QualityWarnings.class, g0.d(), "warnings");
        C17542s.i(f10, "adapter(...)");
        this.qualityWarningsAdapter = f10;
        f<AndroidQuality> f11 = tVar.f(AndroidQuality.class, g0.d(), "android");
        C17542s.i(f11, "adapter(...)");
        this.androidQualityAdapter = f11;
        f<FloorDetection> f12 = tVar.f(FloorDetection.class, g0.d(), "floorDetection");
        C17542s.i(f12, "adapter(...)");
        this.nullableFloorDetectionAdapter = f12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("QualityMeta");
        sb2.append(')');
        return sb2.toString();
    }

    public QualityMeta fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        QualityWarnings qualityWarnings = null;
        AndroidQuality androidQuality = null;
        FloorDetection floorDetection = null;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                qualityWarnings = this.qualityWarningsAdapter.fromJson(kVar);
                if (qualityWarnings != null) {
                    i10 &= -2;
                } else {
                    throw c.w("warnings", "warnings", kVar);
                }
            } else if (s10 == 1) {
                androidQuality = this.androidQualityAdapter.fromJson(kVar);
                if (androidQuality != null) {
                    i10 &= -3;
                } else {
                    throw c.w("android", "android", kVar);
                }
            } else if (s10 == 2) {
                floorDetection = this.nullableFloorDetectionAdapter.fromJson(kVar);
                i10 &= -5;
            }
        }
        kVar.f();
        if (i10 == -8) {
            C17542s.h(qualityWarnings, "null cannot be cast to non-null type com.sugarcube.app.base.data.model.QualityWarnings");
            C17542s.h(androidQuality, "null cannot be cast to non-null type com.sugarcube.app.base.data.model.AndroidQuality");
            return new QualityMeta(qualityWarnings, androidQuality, floorDetection);
        }
        Constructor<QualityMeta> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = QualityMeta.class.getDeclaredConstructor(new Class[]{QualityWarnings.class, AndroidQuality.class, FloorDetection.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        QualityMeta newInstance = constructor.newInstance(new Object[]{qualityWarnings, androidQuality, floorDetection, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, QualityMeta qualityMeta) {
        C17542s.j(qVar, "writer");
        if (qualityMeta != null) {
            qVar.d();
            qVar.n("warnings");
            this.qualityWarningsAdapter.toJson(qVar, qualityMeta.getWarnings());
            qVar.n("android");
            this.androidQualityAdapter.toJson(qVar, qualityMeta.getAndroid());
            qVar.n("floorDetection");
            this.nullableFloorDetectionAdapter.toJson(qVar, qualityMeta.getFloorDetection());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
