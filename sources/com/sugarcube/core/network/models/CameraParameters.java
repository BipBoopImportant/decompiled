package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/sugarcube/core/network/models/CameraParameters;", "", "translation", "", "", "rotation", "type", "", "perspective", "Lcom/sugarcube/core/network/models/CameraPerspective;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/sugarcube/core/network/models/CameraPerspective;)V", "getTranslation", "()Ljava/util/List;", "getRotation", "getType", "()Ljava/lang/String;", "getPerspective", "()Lcom/sugarcube/core/network/models/CameraPerspective;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CameraParameters {
    private final CameraPerspective perspective;
    private final List<Double> rotation;
    private final List<Double> translation;
    private final String type;

    public CameraParameters(List<Double> list, List<Double> list2, String str, CameraPerspective cameraPerspective) {
        C17542s.j(list, "translation");
        C17542s.j(list2, "rotation");
        C17542s.j(str, "type");
        C17542s.j(cameraPerspective, "perspective");
        this.translation = list;
        this.rotation = list2;
        this.type = str;
        this.perspective = cameraPerspective;
    }

    public static /* synthetic */ CameraParameters copy$default(CameraParameters cameraParameters, List<Double> list, List<Double> list2, String str, CameraPerspective cameraPerspective, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = cameraParameters.translation;
        }
        if ((i10 & 2) != 0) {
            list2 = cameraParameters.rotation;
        }
        if ((i10 & 4) != 0) {
            str = cameraParameters.type;
        }
        if ((i10 & 8) != 0) {
            cameraPerspective = cameraParameters.perspective;
        }
        return cameraParameters.copy(list, list2, str, cameraPerspective);
    }

    public final List<Double> component1() {
        return this.translation;
    }

    public final List<Double> component2() {
        return this.rotation;
    }

    public final String component3() {
        return this.type;
    }

    public final CameraPerspective component4() {
        return this.perspective;
    }

    public final CameraParameters copy(List<Double> list, List<Double> list2, String str, CameraPerspective cameraPerspective) {
        C17542s.j(list, "translation");
        C17542s.j(list2, "rotation");
        C17542s.j(str, "type");
        C17542s.j(cameraPerspective, "perspective");
        return new CameraParameters(list, list2, str, cameraPerspective);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraParameters)) {
            return false;
        }
        CameraParameters cameraParameters = (CameraParameters) obj;
        return C17542s.e(this.translation, cameraParameters.translation) && C17542s.e(this.rotation, cameraParameters.rotation) && C17542s.e(this.type, cameraParameters.type) && C17542s.e(this.perspective, cameraParameters.perspective);
    }

    public final CameraPerspective getPerspective() {
        return this.perspective;
    }

    public final List<Double> getRotation() {
        return this.rotation;
    }

    public final List<Double> getTranslation() {
        return this.translation;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.translation.hashCode() * 31) + this.rotation.hashCode()) * 31) + this.type.hashCode()) * 31) + this.perspective.hashCode();
    }

    public String toString() {
        List<Double> list = this.translation;
        List<Double> list2 = this.rotation;
        String str = this.type;
        CameraPerspective cameraPerspective = this.perspective;
        return "CameraParameters(translation=" + list + ", rotation=" + list2 + ", type=" + str + ", perspective=" + cameraPerspective + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CameraParameters(java.util.List r3, java.util.List r4, java.lang.String r5, com.sugarcube.core.network.models.CameraPerspective r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r2 = this;
            r8 = r7 & 1
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            if (r8 == 0) goto L_0x0012
            java.lang.Double[] r3 = new java.lang.Double[]{r0, r0, r0}
            java.util.List r3 = YH.C16877v.q(r3)
        L_0x0012:
            r8 = r7 & 2
            if (r8 == 0) goto L_0x001e
            java.lang.Double[] r4 = new java.lang.Double[]{r0, r0, r0, r0}
            java.util.List r4 = YH.C16877v.q(r4)
        L_0x001e:
            r7 = r7 & 4
            if (r7 == 0) goto L_0x0024
            java.lang.String r5 = "perspective"
        L_0x0024:
            r2.<init>(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.CameraParameters.<init>(java.util.List, java.util.List, java.lang.String, com.sugarcube.core.network.models.CameraPerspective, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
