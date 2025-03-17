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
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/sugarcube/core/network/models/CompositionSavedPropertiesJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/core/network/models/CompositionSavedProperties;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/core/network/models/CompositionSavedProperties;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/core/network/models/CompositionSavedProperties;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "nullableStringAdapter", "Lcom/squareup/moshi/f;", "", "nullableAnyAdapter", "", "", "nullableListOfIntAdapter", "", "nullableMapOfStringStringAdapter", "Lcom/sugarcube/core/network/models/CameraParameters;", "nullableCameraParametersAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CompositionSavedPropertiesJsonAdapter extends f<CompositionSavedProperties> {
    private volatile Constructor<CompositionSavedProperties> constructorRef;
    private final f<Object> nullableAnyAdapter;
    private final f<CameraParameters> nullableCameraParametersAdapter;
    private final f<List<Integer>> nullableListOfIntAdapter;
    private final f<Map<String, String>> nullableMapOfStringStringAdapter;
    private final f<String> nullableStringAdapter;
    private final k.a options;

    public CompositionSavedPropertiesJsonAdapter(t tVar) {
        C17542s.j(tVar, "moshi");
        k.a a10 = k.a.a("lastSavedOn", "features", "clientVersion", "clientLibVersions", "erasedSegments", "wallPaint", "wallPaintInpaint", "camera");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        Class<String> cls = String.class;
        f<String> f10 = tVar.f(cls, g0.d(), "lastSavedOn");
        C17542s.i(f10, "adapter(...)");
        this.nullableStringAdapter = f10;
        f<Object> f11 = tVar.f(Object.class, g0.d(), "features");
        C17542s.i(f11, "adapter(...)");
        this.nullableAnyAdapter = f11;
        f<List<Integer>> f12 = tVar.f(w.j(List.class, Integer.class), g0.d(), "erasedSegments");
        C17542s.i(f12, "adapter(...)");
        this.nullableListOfIntAdapter = f12;
        f<Map<String, String>> f13 = tVar.f(w.j(Map.class, cls, cls), g0.d(), "wallPaint");
        C17542s.i(f13, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f13;
        f<CameraParameters> f14 = tVar.f(CameraParameters.class, g0.d(), "camera");
        C17542s.i(f14, "adapter(...)");
        this.nullableCameraParametersAdapter = f14;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("CompositionSavedProperties");
        sb2.append(')');
        return sb2.toString();
    }

    public CompositionSavedProperties fromJson(k kVar) {
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        kVar.d();
        String str = null;
        int i10 = -1;
        Object obj = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        Map map = null;
        Map map2 = null;
        CameraParameters cameraParameters = null;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -2;
                    break;
                case 1:
                    obj = this.nullableAnyAdapter.fromJson(kVar2);
                    i10 &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -5;
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(kVar2);
                    i10 &= -9;
                    break;
                case 4:
                    list = this.nullableListOfIntAdapter.fromJson(kVar2);
                    i10 &= -17;
                    break;
                case 5:
                    map = this.nullableMapOfStringStringAdapter.fromJson(kVar2);
                    i10 &= -33;
                    break;
                case 6:
                    map2 = this.nullableMapOfStringStringAdapter.fromJson(kVar2);
                    i10 &= -65;
                    break;
                case 7:
                    cameraParameters = this.nullableCameraParametersAdapter.fromJson(kVar2);
                    i10 &= -129;
                    break;
            }
        }
        kVar.f();
        if (i10 == -256) {
            return new CompositionSavedProperties(str, obj, str2, str3, list, map, map2, cameraParameters);
        }
        Constructor<CompositionSavedProperties> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CompositionSavedProperties.class.getDeclaredConstructor(new Class[]{String.class, Object.class, String.class, String.class, List.class, Map.class, Map.class, CameraParameters.class, Integer.TYPE, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        CompositionSavedProperties newInstance = constructor.newInstance(new Object[]{str, obj, str2, str3, list, map, map2, cameraParameters, Integer.valueOf(i10), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, CompositionSavedProperties compositionSavedProperties) {
        C17542s.j(qVar, "writer");
        if (compositionSavedProperties != null) {
            qVar.d();
            qVar.n("lastSavedOn");
            this.nullableStringAdapter.toJson(qVar, compositionSavedProperties.getLastSavedOn());
            qVar.n("features");
            this.nullableAnyAdapter.toJson(qVar, compositionSavedProperties.getFeatures());
            qVar.n("clientVersion");
            this.nullableStringAdapter.toJson(qVar, compositionSavedProperties.getClientVersion());
            qVar.n("clientLibVersions");
            this.nullableStringAdapter.toJson(qVar, compositionSavedProperties.getClientLibVersions());
            qVar.n("erasedSegments");
            this.nullableListOfIntAdapter.toJson(qVar, compositionSavedProperties.getErasedSegments());
            qVar.n("wallPaint");
            this.nullableMapOfStringStringAdapter.toJson(qVar, compositionSavedProperties.getWallPaint());
            qVar.n("wallPaintInpaint");
            this.nullableMapOfStringStringAdapter.toJson(qVar, compositionSavedProperties.getWallPaintInpaint());
            qVar.n("camera");
            this.nullableCameraParametersAdapter.toJson(qVar, compositionSavedProperties.getCamera());
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
