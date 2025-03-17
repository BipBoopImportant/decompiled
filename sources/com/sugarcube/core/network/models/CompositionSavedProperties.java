package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\tHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001a¨\u0006."}, d2 = {"Lcom/sugarcube/core/network/models/CompositionSavedProperties;", "", "lastSavedOn", "", "features", "clientVersion", "clientLibVersions", "erasedSegments", "", "", "wallPaint", "", "wallPaintInpaint", "camera", "Lcom/sugarcube/core/network/models/CameraParameters;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lcom/sugarcube/core/network/models/CameraParameters;)V", "getLastSavedOn", "()Ljava/lang/String;", "getFeatures", "()Ljava/lang/Object;", "getClientVersion", "getClientLibVersions", "getErasedSegments", "()Ljava/util/List;", "getWallPaint", "()Ljava/util/Map;", "getWallPaintInpaint", "getCamera", "()Lcom/sugarcube/core/network/models/CameraParameters;", "featuresUsed", "getFeaturesUsed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CompositionSavedProperties {
    private final CameraParameters camera;
    private final String clientLibVersions;
    private final String clientVersion;
    private final List<Integer> erasedSegments;
    private final Object features;
    private final String lastSavedOn;
    private final Map<String, String> wallPaint;
    private final Map<String, String> wallPaintInpaint;

    public CompositionSavedProperties() {
        this((String) null, (Object) null, (String) null, (String) null, (List) null, (Map) null, (Map) null, (CameraParameters) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CompositionSavedProperties copy$default(CompositionSavedProperties compositionSavedProperties, String str, Object obj, String str2, String str3, List list, Map map, Map map2, CameraParameters cameraParameters, int i10, Object obj2) {
        CompositionSavedProperties compositionSavedProperties2 = compositionSavedProperties;
        int i11 = i10;
        return compositionSavedProperties.copy((i11 & 1) != 0 ? compositionSavedProperties2.lastSavedOn : str, (i11 & 2) != 0 ? compositionSavedProperties2.features : obj, (i11 & 4) != 0 ? compositionSavedProperties2.clientVersion : str2, (i11 & 8) != 0 ? compositionSavedProperties2.clientLibVersions : str3, (i11 & 16) != 0 ? compositionSavedProperties2.erasedSegments : list, (i11 & 32) != 0 ? compositionSavedProperties2.wallPaint : map, (i11 & 64) != 0 ? compositionSavedProperties2.wallPaintInpaint : map2, (i11 & 128) != 0 ? compositionSavedProperties2.camera : cameraParameters);
    }

    public final String component1() {
        return this.lastSavedOn;
    }

    public final Object component2() {
        return this.features;
    }

    public final String component3() {
        return this.clientVersion;
    }

    public final String component4() {
        return this.clientLibVersions;
    }

    public final List<Integer> component5() {
        return this.erasedSegments;
    }

    public final Map<String, String> component6() {
        return this.wallPaint;
    }

    public final Map<String, String> component7() {
        return this.wallPaintInpaint;
    }

    public final CameraParameters component8() {
        return this.camera;
    }

    public final CompositionSavedProperties copy(String str, Object obj, String str2, String str3, List<Integer> list, Map<String, String> map, Map<String, String> map2, CameraParameters cameraParameters) {
        return new CompositionSavedProperties(str, obj, str2, str3, list, map, map2, cameraParameters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositionSavedProperties)) {
            return false;
        }
        CompositionSavedProperties compositionSavedProperties = (CompositionSavedProperties) obj;
        return C17542s.e(this.lastSavedOn, compositionSavedProperties.lastSavedOn) && C17542s.e(this.features, compositionSavedProperties.features) && C17542s.e(this.clientVersion, compositionSavedProperties.clientVersion) && C17542s.e(this.clientLibVersions, compositionSavedProperties.clientLibVersions) && C17542s.e(this.erasedSegments, compositionSavedProperties.erasedSegments) && C17542s.e(this.wallPaint, compositionSavedProperties.wallPaint) && C17542s.e(this.wallPaintInpaint, compositionSavedProperties.wallPaintInpaint) && C17542s.e(this.camera, compositionSavedProperties.camera);
    }

    public final CameraParameters getCamera() {
        return this.camera;
    }

    public final String getClientLibVersions() {
        return this.clientLibVersions;
    }

    public final String getClientVersion() {
        return this.clientVersion;
    }

    public final List<Integer> getErasedSegments() {
        return this.erasedSegments;
    }

    public final Object getFeatures() {
        return this.features;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = (java.util.Map) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Integer> getFeaturesUsed() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.features
            boolean r1 = r0 instanceof java.util.Map
            if (r1 == 0) goto L_0x000a
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x000e
        L_0x000a:
            java.util.Map r0 = YH.X.j()
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.CompositionSavedProperties.getFeaturesUsed():java.util.Map");
    }

    public final String getLastSavedOn() {
        return this.lastSavedOn;
    }

    public final Map<String, String> getWallPaint() {
        return this.wallPaint;
    }

    public final Map<String, String> getWallPaintInpaint() {
        return this.wallPaintInpaint;
    }

    public int hashCode() {
        String str = this.lastSavedOn;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.features;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str2 = this.clientVersion;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientLibVersions;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Integer> list = this.erasedSegments;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.wallPaint;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.wallPaintInpaint;
        int hashCode7 = (hashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
        CameraParameters cameraParameters = this.camera;
        if (cameraParameters != null) {
            i10 = cameraParameters.hashCode();
        }
        return hashCode7 + i10;
    }

    public String toString() {
        String str = this.lastSavedOn;
        Object obj = this.features;
        String str2 = this.clientVersion;
        String str3 = this.clientLibVersions;
        List<Integer> list = this.erasedSegments;
        Map<String, String> map = this.wallPaint;
        Map<String, String> map2 = this.wallPaintInpaint;
        CameraParameters cameraParameters = this.camera;
        return "CompositionSavedProperties(lastSavedOn=" + str + ", features=" + obj + ", clientVersion=" + str2 + ", clientLibVersions=" + str3 + ", erasedSegments=" + list + ", wallPaint=" + map + ", wallPaintInpaint=" + map2 + ", camera=" + cameraParameters + ")";
    }

    public CompositionSavedProperties(String str, Object obj, String str2, String str3, List<Integer> list, Map<String, String> map, Map<String, String> map2, CameraParameters cameraParameters) {
        this.lastSavedOn = str;
        this.features = obj;
        this.clientVersion = str2;
        this.clientLibVersions = str3;
        this.erasedSegments = list;
        this.wallPaint = map;
        this.wallPaintInpaint = map2;
        this.camera = cameraParameters;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CompositionSavedProperties(java.lang.String r10, java.lang.Object r11, java.lang.String r12, java.lang.String r13, java.util.List r14, java.util.Map r15, java.util.Map r16, com.sugarcube.core.network.models.CameraParameters r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.CompositionSavedProperties.<init>(java.lang.String, java.lang.Object, java.lang.String, java.lang.String, java.util.List, java.util.Map, java.util.Map, com.sugarcube.core.network.models.CameraParameters, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
