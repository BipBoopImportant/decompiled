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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/sugarcube/core/network/models/CameraParametersJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/CameraParameters;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/CameraParameters;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/CameraParameters;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "", "listOfDoubleAdapter", "Lcom/squareup/moshi/f;", "stringAdapter", "Lcom/sugarcube/core/network/models/CameraPerspective;", "cameraPerspectiveAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraParametersJsonAdapter extends f<CameraParameters> {
    private final f<CameraPerspective> cameraPerspectiveAdapter;
    private volatile Constructor<CameraParameters> constructorRef;
    private final f<List<Double>> listOfDoubleAdapter;
    private final k.a options;
    private final f<String> stringAdapter;

    public CameraParametersJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("translation", "rotation", "type", "perspective");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<List<Double>> f10 = tVar.f(w.j(List.class, Double.class), g0.d(), "translation");
        C17542s.i(f10, "adapter(...)");
        this.listOfDoubleAdapter = f10;
        f<String> f11 = tVar.f(String.class, g0.d(), "type");
        C17542s.i(f11, "adapter(...)");
        this.stringAdapter = f11;
        f<CameraPerspective> f12 = tVar.f(CameraPerspective.class, g0.d(), "perspective");
        C17542s.i(f12, "adapter(...)");
        this.cameraPerspectiveAdapter = f12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CameraParameters");
        sb2.append(')');
        return sb2.toString();
    }

    public CameraParameters fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        kVar.d();
        List list = null;
        List list2 = null;
        String str = null;
        CameraPerspective cameraPerspective = null;
        int i10 = -1;
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.options);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else if (s10 == 0) {
                list = this.listOfDoubleAdapter.fromJson(kVar);
                if (list != null) {
                    i10 &= -2;
                } else {
                    throw c.w("translation", "translation", kVar);
                }
            } else if (s10 == 1) {
                list2 = this.listOfDoubleAdapter.fromJson(kVar);
                if (list2 != null) {
                    i10 &= -3;
                } else {
                    throw c.w("rotation", "rotation", kVar);
                }
            } else if (s10 == 2) {
                str = this.stringAdapter.fromJson(kVar);
                if (str != null) {
                    i10 &= -5;
                } else {
                    throw c.w("type", "type", kVar);
                }
            } else if (s10 == 3 && (cameraPerspective = this.cameraPerspectiveAdapter.fromJson(kVar)) == null) {
                throw c.w("perspective", "perspective", kVar);
            }
        }
        kVar.f();
        if (i10 == -8) {
            C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Double>");
            C17542s.h(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Double>");
            C17542s.h(str, "null cannot be cast to non-null type kotlin.String");
            if (cameraPerspective != null) {
                return new CameraParameters(list, list2, str, cameraPerspective);
            }
            throw c.n("perspective", "perspective", kVar);
        }
        Constructor<CameraParameters> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CameraParameters.class.getDeclaredConstructor(new Class[]{List.class, List.class, String.class, CameraPerspective.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        if (cameraPerspective != null) {
            CameraParameters newInstance = constructor.newInstance(new Object[]{list, list2, str, cameraPerspective, Integer.valueOf(i10), null});
            C17542s.i(newInstance, "newInstance(...)");
            return newInstance;
        }
        throw c.n("perspective", "perspective", kVar);
    }

    public void toJson(q qVar, CameraParameters cameraParameters) {
        C17542s.j(qVar, "writer");
        if (cameraParameters != null) {
            qVar.d();
            qVar.n("translation");
            this.listOfDoubleAdapter.toJson(qVar, cameraParameters.getTranslation());
            qVar.n("rotation");
            this.listOfDoubleAdapter.toJson(qVar, cameraParameters.getRotation());
            qVar.n("type");
            this.stringAdapter.toJson(qVar, cameraParameters.getType());
            qVar.n("perspective");
            this.cameraPerspectiveAdapter.toJson(qVar, cameraParameters.getPerspective());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
