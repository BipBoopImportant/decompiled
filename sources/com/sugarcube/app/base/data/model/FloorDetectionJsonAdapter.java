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

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/sugarcube/app/base/data/model/FloorDetectionJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/app/base/data/model/FloorDetection;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/app/base/data/model/FloorDetection;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/app/base/data/model/FloorDetection;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "intAdapter", "Lcom/squareup/moshi/f;", "", "floatAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FloorDetectionJsonAdapter extends f<FloorDetection> {
    public static final int $stable = 8;
    private final f<Boolean> booleanAdapter;
    private volatile Constructor<FloorDetection> constructorRef;
    private final f<Float> floatAdapter;
    private final f<Integer> intAdapter;
    private final k.a options;

    public FloorDetectionJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("timeOutLimit", "timeToDetectFloor", "floorAnchorCreated", "poseAnchorCreated");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<Integer> f10 = tVar.f(Integer.TYPE, g0.d(), "timeOutLimit");
        C17542s.i(f10, "adapter(...)");
        this.intAdapter = f10;
        f<Float> f11 = tVar.f(Float.TYPE, g0.d(), "timeToDetectFloor");
        C17542s.i(f11, "adapter(...)");
        this.floatAdapter = f11;
        f<Boolean> f12 = tVar.f(Boolean.TYPE, g0.d(), "floorAnchorCreated");
        C17542s.i(f12, "adapter(...)");
        this.booleanAdapter = f12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FloorDetection");
        sb2.append(')');
        return sb2.toString();
    }

    public FloorDetection fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        Float valueOf = Float.valueOf(0.0f);
        Boolean bool = Boolean.FALSE;
        kVar.d();
        Integer num = 0;
        Float f10 = valueOf;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                num = this.intAdapter.fromJson(kVar);
                if (num != null) {
                    i10 &= -2;
                } else {
                    throw c.w("timeOutLimit", "timeOutLimit", kVar);
                }
            } else if (s10 == 1) {
                f10 = this.floatAdapter.fromJson(kVar);
                if (f10 != null) {
                    i10 &= -3;
                } else {
                    throw c.w("timeToDetectFloor", "timeToDetectFloor", kVar);
                }
            } else if (s10 == 2) {
                bool2 = this.booleanAdapter.fromJson(kVar);
                if (bool2 != null) {
                    i10 &= -5;
                } else {
                    throw c.w("floorAnchorCreated", "floorAnchorCreated", kVar);
                }
            } else if (s10 == 3) {
                bool3 = this.booleanAdapter.fromJson(kVar);
                if (bool3 != null) {
                    i10 &= -9;
                } else {
                    throw c.w("poseAnchorCreated", "poseAnchorCreated", kVar);
                }
            } else {
                continue;
            }
        }
        kVar.f();
        if (i10 == -16) {
            return new FloorDetection(num.intValue(), f10.floatValue(), bool2.booleanValue(), bool3.booleanValue());
        }
        Constructor<FloorDetection> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Class cls3 = Boolean.TYPE;
            constructor = FloorDetection.class.getDeclaredConstructor(new Class[]{cls, cls2, cls3, cls3, cls, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        FloorDetection newInstance = constructor.newInstance(new Object[]{num, f10, bool2, bool3, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, FloorDetection floorDetection) {
        C17542s.j(qVar, "writer");
        if (floorDetection != null) {
            qVar.d();
            qVar.n("timeOutLimit");
            this.intAdapter.toJson(qVar, Integer.valueOf(floorDetection.getTimeOutLimit()));
            qVar.n("timeToDetectFloor");
            this.floatAdapter.toJson(qVar, Float.valueOf(floorDetection.getTimeToDetectFloor()));
            qVar.n("floorAnchorCreated");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(floorDetection.getFloorAnchorCreated()));
            qVar.n("poseAnchorCreated");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(floorDetection.getPoseAnchorCreated()));
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
