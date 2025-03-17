package com.sugarcube.app.base.data.model;

import ME.c;
import YH.g0;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import d9.M;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/sugarcube/app/base/data/model/AndroidQualityJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/sugarcube/app/base/data/model/AndroidQuality;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/sugarcube/app/base/data/model/AndroidQuality;", "Lcom/squareup/moshi/q;", "writer", "value_", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Lcom/sugarcube/app/base/data/model/AndroidQuality;)V", "Lcom/squareup/moshi/k$a;", "options", "Lcom/squareup/moshi/k$a;", "", "floatArrayAdapter", "Lcom/squareup/moshi/f;", "", "intArrayAdapter", "", "nullableIntAdapter", "intAdapter", "", "floatAdapter", "", "booleanAdapter", "", "longAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidQualityJsonAdapter extends f<AndroidQuality> {
    public static final int $stable = 8;
    private final f<Boolean> booleanAdapter;
    private volatile Constructor<AndroidQuality> constructorRef;
    private final f<Float> floatAdapter;
    private final f<float[]> floatArrayAdapter;
    private final f<Integer> intAdapter;
    private final f<int[]> intArrayAdapter;
    private final f<Long> longAdapter;
    private final f<Integer> nullableIntAdapter;
    private final k.a options;

    public AndroidQualityJsonAdapter(t tVar) {
        t tVar2 = tVar;
        C17542s.j(tVar2, "moshi");
        k.a a10 = k.a.a("trackingRatios", "trackingStats", "frameCount", "framesWithLowIntensity", "framesWithNoPoints", "lowIntensityRange", "pointsTotal", "principalPointRatioX", "principalPointRatioY", "panoTrackingStats", "panoFrameCount", "panoFramesWithNoPoints", "panoPointsTotal", "panoPrincipalPointRatioX", "panoPrincipalPointRatioY", "poseAnchorEnabled", "poseAnchorCreated", "floorAnchorEnabled", "floorAnchorCreated", "onDrawMPF", "handleMPF", "handleEncodeMPF", "panoSize", "videoSize");
        C17542s.i(a10, "of(...)");
        this.options = a10;
        f<float[]> f10 = tVar2.f(float[].class, g0.d(), "trackingRatios");
        C17542s.i(f10, "adapter(...)");
        this.floatArrayAdapter = f10;
        f<int[]> f11 = tVar2.f(int[].class, g0.d(), "trackingStats");
        C17542s.i(f11, "adapter(...)");
        this.intArrayAdapter = f11;
        f<Integer> f12 = tVar2.f(Integer.class, g0.d(), "frameCount");
        C17542s.i(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
        f<Integer> f13 = tVar2.f(Integer.TYPE, g0.d(), "framesWithLowIntensity");
        C17542s.i(f13, "adapter(...)");
        this.intAdapter = f13;
        f<Float> f14 = tVar2.f(Float.TYPE, g0.d(), "principalPointRatioX");
        C17542s.i(f14, "adapter(...)");
        this.floatAdapter = f14;
        f<Boolean> f15 = tVar2.f(Boolean.TYPE, g0.d(), "poseAnchorEnabled");
        C17542s.i(f15, "adapter(...)");
        this.booleanAdapter = f15;
        f<Long> f16 = tVar2.f(Long.TYPE, g0.d(), "panoSize");
        C17542s.i(f16, "adapter(...)");
        this.longAdapter = f16;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AndroidQuality");
        sb2.append(')');
        return sb2.toString();
    }

    public AndroidQuality fromJson(k kVar) {
        int i10;
        k kVar2 = kVar;
        C17542s.j(kVar2, "reader");
        Integer num = 0;
        Float valueOf = Float.valueOf(0.0f);
        Boolean bool = Boolean.FALSE;
        kVar.d();
        float[] fArr = null;
        int i11 = -1;
        Integer num2 = num;
        Integer num3 = num2;
        Integer num4 = num3;
        Integer num5 = num4;
        Float f10 = valueOf;
        Float f11 = f10;
        Float f12 = f11;
        Float f13 = f12;
        Float f14 = f13;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        Long l10 = 0L;
        Long l11 = null;
        int[] iArr = null;
        float[] fArr2 = null;
        int[] iArr2 = null;
        Integer num6 = null;
        Float f15 = f14;
        Float f16 = f15;
        Integer num7 = num5;
        while (kVar.hasNext()) {
            switch (kVar2.s(this.options)) {
                case -1:
                    kVar.w();
                    kVar.a0();
                    continue;
                case 0:
                    fArr2 = this.floatArrayAdapter.fromJson(kVar2);
                    if (fArr2 != null) {
                        i11 &= -2;
                        continue;
                    } else {
                        throw c.w("trackingRatios", "trackingRatios", kVar2);
                    }
                case 1:
                    iArr2 = this.intArrayAdapter.fromJson(kVar2);
                    if (iArr2 != null) {
                        i11 &= -3;
                        continue;
                    } else {
                        throw c.w("trackingStats", "trackingStats", kVar2);
                    }
                case 2:
                    num6 = this.nullableIntAdapter.fromJson(kVar2);
                    i11 &= -5;
                    continue;
                case 3:
                    num2 = this.intAdapter.fromJson(kVar2);
                    if (num2 != null) {
                        i11 &= -9;
                        continue;
                    } else {
                        throw c.w("framesWithLowIntensity", "framesWithLowIntensity", kVar2);
                    }
                case 4:
                    num = this.intAdapter.fromJson(kVar2);
                    if (num != null) {
                        i11 &= -17;
                        continue;
                    } else {
                        throw c.w("framesWithNoPoints", "framesWithNoPoints", kVar2);
                    }
                case 5:
                    fArr = this.floatArrayAdapter.fromJson(kVar2);
                    if (fArr != null) {
                        i11 &= -33;
                        continue;
                    } else {
                        throw c.w("lowIntensityRange", "lowIntensityRange", kVar2);
                    }
                case 6:
                    num7 = this.intAdapter.fromJson(kVar2);
                    if (num7 != null) {
                        i11 &= -65;
                        continue;
                    } else {
                        throw c.w("pointsTotal", "pointsTotal", kVar2);
                    }
                case 7:
                    f15 = this.floatAdapter.fromJson(kVar2);
                    if (f15 != null) {
                        i11 &= -129;
                        continue;
                    } else {
                        throw c.w("principalPointRatioX", "principalPointRatioX", kVar2);
                    }
                case 8:
                    f16 = this.floatAdapter.fromJson(kVar2);
                    if (f16 != null) {
                        i11 &= -257;
                        continue;
                    } else {
                        throw c.w("principalPointRatioY", "principalPointRatioY", kVar2);
                    }
                case 9:
                    iArr = this.intArrayAdapter.fromJson(kVar2);
                    if (iArr != null) {
                        i11 &= -513;
                        continue;
                    } else {
                        throw c.w("panoTrackingStats", "panoTrackingStats", kVar2);
                    }
                case 10:
                    num3 = this.intAdapter.fromJson(kVar2);
                    if (num3 != null) {
                        i11 &= -1025;
                        continue;
                    } else {
                        throw c.w("panoFrameCount", "panoFrameCount", kVar2);
                    }
                case 11:
                    num4 = this.intAdapter.fromJson(kVar2);
                    if (num4 != null) {
                        i11 &= -2049;
                        continue;
                    } else {
                        throw c.w("panoFramesWithNoPoints", "panoFramesWithNoPoints", kVar2);
                    }
                case 12:
                    num5 = this.intAdapter.fromJson(kVar2);
                    if (num5 != null) {
                        i11 &= -4097;
                        continue;
                    } else {
                        throw c.w("panoPointsTotal", "panoPointsTotal", kVar2);
                    }
                case 13:
                    f10 = this.floatAdapter.fromJson(kVar2);
                    if (f10 != null) {
                        i11 &= -8193;
                        continue;
                    } else {
                        throw c.w("panoPrincipalPointRatioX", "panoPrincipalPointRatioX", kVar2);
                    }
                case 14:
                    f11 = this.floatAdapter.fromJson(kVar2);
                    if (f11 != null) {
                        i11 &= -16385;
                        continue;
                    } else {
                        throw c.w("panoPrincipalPointRatioY", "panoPrincipalPointRatioY", kVar2);
                    }
                case 15:
                    bool2 = this.booleanAdapter.fromJson(kVar2);
                    if (bool2 != null) {
                        i10 = -32769;
                        break;
                    } else {
                        throw c.w("poseAnchorEnabled", "poseAnchorEnabled", kVar2);
                    }
                case 16:
                    bool3 = this.booleanAdapter.fromJson(kVar2);
                    if (bool3 != null) {
                        i10 = -65537;
                        break;
                    } else {
                        throw c.w("poseAnchorCreated", "poseAnchorCreated", kVar2);
                    }
                case 17:
                    bool4 = this.booleanAdapter.fromJson(kVar2);
                    if (bool4 != null) {
                        i10 = -131073;
                        break;
                    } else {
                        throw c.w("floorAnchorEnabled", "floorAnchorEnabled", kVar2);
                    }
                case 18:
                    bool5 = this.booleanAdapter.fromJson(kVar2);
                    if (bool5 != null) {
                        i10 = -262145;
                        break;
                    } else {
                        throw c.w("floorAnchorCreated", "floorAnchorCreated", kVar2);
                    }
                case 19:
                    f12 = this.floatAdapter.fromJson(kVar2);
                    if (f12 != null) {
                        i10 = -524289;
                        break;
                    } else {
                        throw c.w("onDrawMPF", "onDrawMPF", kVar2);
                    }
                case 20:
                    f13 = this.floatAdapter.fromJson(kVar2);
                    if (f13 != null) {
                        i10 = -1048577;
                        break;
                    } else {
                        throw c.w("handleMPF", "handleMPF", kVar2);
                    }
                case 21:
                    f14 = this.floatAdapter.fromJson(kVar2);
                    if (f14 != null) {
                        i10 = -2097153;
                        break;
                    } else {
                        throw c.w("handleEncodeMPF", "handleEncodeMPF", kVar2);
                    }
                case 22:
                    l10 = this.longAdapter.fromJson(kVar2);
                    if (l10 != null) {
                        i10 = -4194305;
                        break;
                    } else {
                        throw c.w("panoSize", "panoSize", kVar2);
                    }
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER:
                    l11 = this.longAdapter.fromJson(kVar2);
                    if (l11 != null) {
                        i10 = -8388609;
                        break;
                    } else {
                        throw c.w("videoSize", "videoSize", kVar2);
                    }
            }
            i11 &= i10;
        }
        kVar.f();
        if (i11 == -16777216) {
            C17542s.h(fArr2, "null cannot be cast to non-null type kotlin.FloatArray");
            C17542s.h(iArr2, "null cannot be cast to non-null type kotlin.IntArray");
            int intValue = num2.intValue();
            int intValue2 = num.intValue();
            C17542s.h(fArr, "null cannot be cast to non-null type kotlin.FloatArray");
            int intValue3 = num7.intValue();
            float floatValue = f15.floatValue();
            float floatValue2 = f16.floatValue();
            C17542s.h(iArr, "null cannot be cast to non-null type kotlin.IntArray");
            return new AndroidQuality(fArr2, iArr2, num6, intValue, intValue2, fArr, intValue3, floatValue, floatValue2, iArr, num3.intValue(), num4.intValue(), num5.intValue(), f10.floatValue(), f11.floatValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), f12.floatValue(), f13.floatValue(), f14.floatValue(), l10.longValue(), l11.longValue());
        }
        Constructor<AndroidQuality> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Long.TYPE;
            Class<float[]> cls5 = float[].class;
            Class<int[]> cls6 = int[].class;
            Class<Integer> cls7 = Integer.class;
            Class<float[]> cls8 = float[].class;
            Class<int[]> cls9 = int[].class;
            Class<AndroidQuality> cls10 = AndroidQuality.class;
            constructor = cls10.getDeclaredConstructor(new Class[]{cls5, cls6, cls7, cls, cls, cls8, cls, cls2, cls2, cls9, cls, cls, cls, cls2, cls2, cls3, cls3, cls3, cls3, cls2, cls2, cls2, cls4, cls4, cls, c.f112014c});
            this.constructorRef = constructor;
            C17542s.i(constructor, "also(...)");
        }
        AndroidQuality newInstance = constructor.newInstance(new Object[]{fArr2, iArr2, num6, num2, num, fArr, num7, f15, f16, iArr, num3, num4, num5, f10, f11, bool2, bool3, bool4, bool5, f12, f13, f14, l10, l11, Integer.valueOf(i11), null});
        C17542s.i(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(q qVar, AndroidQuality androidQuality) {
        C17542s.j(qVar, "writer");
        if (androidQuality != null) {
            qVar.d();
            qVar.n("trackingRatios");
            this.floatArrayAdapter.toJson(qVar, androidQuality.getTrackingRatios());
            qVar.n("trackingStats");
            this.intArrayAdapter.toJson(qVar, androidQuality.getTrackingStats());
            qVar.n("frameCount");
            this.nullableIntAdapter.toJson(qVar, androidQuality.getFrameCount());
            qVar.n("framesWithLowIntensity");
            this.intAdapter.toJson(qVar, Integer.valueOf(androidQuality.getFramesWithLowIntensity()));
            qVar.n("framesWithNoPoints");
            this.intAdapter.toJson(qVar, Integer.valueOf(androidQuality.getFramesWithNoPoints()));
            qVar.n("lowIntensityRange");
            this.floatArrayAdapter.toJson(qVar, androidQuality.getLowIntensityRange());
            qVar.n("pointsTotal");
            this.intAdapter.toJson(qVar, Integer.valueOf(androidQuality.getPointsTotal()));
            qVar.n("principalPointRatioX");
            this.floatAdapter.toJson(qVar, Float.valueOf(androidQuality.getPrincipalPointRatioX()));
            qVar.n("principalPointRatioY");
            this.floatAdapter.toJson(qVar, Float.valueOf(androidQuality.getPrincipalPointRatioY()));
            qVar.n("panoTrackingStats");
            this.intArrayAdapter.toJson(qVar, androidQuality.getPanoTrackingStats());
            qVar.n("panoFrameCount");
            this.intAdapter.toJson(qVar, Integer.valueOf(androidQuality.getPanoFrameCount()));
            qVar.n("panoFramesWithNoPoints");
            this.intAdapter.toJson(qVar, Integer.valueOf(androidQuality.getPanoFramesWithNoPoints()));
            qVar.n("panoPointsTotal");
            this.intAdapter.toJson(qVar, Integer.valueOf(androidQuality.getPanoPointsTotal()));
            qVar.n("panoPrincipalPointRatioX");
            this.floatAdapter.toJson(qVar, Float.valueOf(androidQuality.getPanoPrincipalPointRatioX()));
            qVar.n("panoPrincipalPointRatioY");
            this.floatAdapter.toJson(qVar, Float.valueOf(androidQuality.getPanoPrincipalPointRatioY()));
            qVar.n("poseAnchorEnabled");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(androidQuality.getPoseAnchorEnabled()));
            qVar.n("poseAnchorCreated");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(androidQuality.getPoseAnchorCreated()));
            qVar.n("floorAnchorEnabled");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(androidQuality.getFloorAnchorEnabled()));
            qVar.n("floorAnchorCreated");
            this.booleanAdapter.toJson(qVar, Boolean.valueOf(androidQuality.getFloorAnchorCreated()));
            qVar.n("onDrawMPF");
            this.floatAdapter.toJson(qVar, Float.valueOf(androidQuality.getOnDrawMPF()));
            qVar.n("handleMPF");
            this.floatAdapter.toJson(qVar, Float.valueOf(androidQuality.getHandleMPF()));
            qVar.n("handleEncodeMPF");
            this.floatAdapter.toJson(qVar, Float.valueOf(androidQuality.getHandleEncodeMPF()));
            qVar.n("panoSize");
            this.longAdapter.toJson(qVar, Long.valueOf(androidQuality.getPanoSize()));
            qVar.n("videoSize");
            this.longAdapter.toJson(qVar, Long.valueOf(androidQuality.getVideoSize()));
            qVar.g();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
