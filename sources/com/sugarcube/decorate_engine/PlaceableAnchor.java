package com.sugarcube.decorate_engine;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 32\u00020\u0001:\u000243B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBE\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u001e\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001c\"\u0004\b+\u0010,R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010)\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010,R0\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/sugarcube/decorate_engine/PlaceableAnchor;", "", "", "category", "constraint", "", "", "matrixModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/PlaceableAnchor;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "validate$decorate_engine_release", "()V", "validate", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/sugarcube/decorate_engine/PlaceableAnchor;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCategory", "setCategory", "(Ljava/lang/String;)V", "getConstraint", "setConstraint", "Ljava/util/List;", "getMatrixModel", "setMatrixModel", "(Ljava/util/List;)V", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PlaceableAnchor {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {null, null, new C17451f(new C17451f(C17438C.f144010a))};
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private String category;
    private String constraint;
    private List<? extends List<Double>> matrixModel;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/PlaceableAnchor$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/PlaceableAnchor;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlaceableAnchor> serializer() {
            return PlaceableAnchor$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C16814e
    public /* synthetic */ PlaceableAnchor(int i10, String str, String str2, List list, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, PlaceableAnchor$$serializer.INSTANCE.getDescriptor());
        }
        this.category = str;
        if ((i10 & 2) == 0) {
            this.constraint = null;
        } else {
            this.constraint = str2;
        }
        if ((i10 & 4) == 0) {
            this.matrixModel = null;
        } else {
            this.matrixModel = list;
        }
    }

    public static /* synthetic */ PlaceableAnchor copy$default(PlaceableAnchor placeableAnchor, String str, String str2, List<? extends List<Double>> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = placeableAnchor.category;
        }
        if ((i10 & 2) != 0) {
            str2 = placeableAnchor.constraint;
        }
        if ((i10 & 4) != 0) {
            list = placeableAnchor.matrixModel;
        }
        return placeableAnchor.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(PlaceableAnchor placeableAnchor, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        dVar.y(serialDescriptor, 0, placeableAnchor.category);
        if (dVar.z(serialDescriptor, 1) || placeableAnchor.constraint != null) {
            dVar.B(serialDescriptor, 1, Y0.f144077a, placeableAnchor.constraint);
        }
        if (dVar.z(serialDescriptor, 2) || placeableAnchor.matrixModel != null) {
            dVar.B(serialDescriptor, 2, kSerializerArr[2], placeableAnchor.matrixModel);
        }
    }

    public final String component1() {
        return this.category;
    }

    public final String component2() {
        return this.constraint;
    }

    public final List<List<Double>> component3() {
        return this.matrixModel;
    }

    public final PlaceableAnchor copy(String str, String str2, List<? extends List<Double>> list) {
        C17542s.j(str, "category");
        return new PlaceableAnchor(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceableAnchor)) {
            return false;
        }
        PlaceableAnchor placeableAnchor = (PlaceableAnchor) obj;
        return C17542s.e(this.category, placeableAnchor.category) && C17542s.e(this.constraint, placeableAnchor.constraint) && C17542s.e(this.matrixModel, placeableAnchor.matrixModel);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getConstraint() {
        return this.constraint;
    }

    public final List<List<Double>> getMatrixModel() {
        return this.matrixModel;
    }

    public int hashCode() {
        int hashCode = this.category.hashCode() * 31;
        String str = this.constraint;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<? extends List<Double>> list = this.matrixModel;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public final void setCategory(String str) {
        C17542s.j(str, "<set-?>");
        this.category = str;
    }

    public final void setConstraint(String str) {
        this.constraint = str;
    }

    public final void setMatrixModel(List<? extends List<Double>> list) {
        this.matrixModel = list;
    }

    public String toString() {
        String str = this.category;
        String str2 = this.constraint;
        List<? extends List<Double>> list = this.matrixModel;
        return "PlaceableAnchor(category=" + str + ", constraint=" + str2 + ", matrixModel=" + list + ")";
    }

    public final void validate$decorate_engine_release() {
    }

    public PlaceableAnchor(String str, String str2, List<? extends List<Double>> list) {
        C17542s.j(str, "category");
        this.category = str;
        this.constraint = str2;
        this.matrixModel = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlaceableAnchor(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }
}
