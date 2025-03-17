package com.sugarcube.decorate_engine;

import XH.C16814e;
import YH.C16877v;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 32\u00020\u0001:\u000243B'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ0\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010*R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010*R$\u00102\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00038F@FX\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/sugarcube/decorate_engine/Transform3D;", "", "", "", "pos", "rotQuat", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/Transform3D;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "validate$decorate_engine_release", "()V", "validate", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/sugarcube/decorate_engine/Transform3D;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPos", "setPos", "(Ljava/util/List;)V", "getRotQuat", "setRotQuat", "v", "getHeading", "()D", "setHeading", "(D)V", "heading", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Transform3D {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private List<Double> pos;
    private List<Double> rotQuat;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/decorate_engine/Transform3D$Companion;", "", "()V", "identityQuat", "", "", "getIdentityQuat", "()Ljava/util/List;", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/Transform3D;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Double> getIdentityQuat() {
            Double valueOf = Double.valueOf(0.0d);
            return C16877v.q(valueOf, valueOf, valueOf, Double.valueOf(1.0d));
        }

        public final KSerializer<Transform3D> serializer() {
            return Transform3D$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C17438C c10 = C17438C.f144010a;
        $childSerializers = new KSerializer[]{new C17451f(c10), new C17451f(c10)};
    }

    public Transform3D() {
        this((List) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Transform3D copy$default(Transform3D transform3D, List<Double> list, List<Double> list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = transform3D.pos;
        }
        if ((i10 & 2) != 0) {
            list2 = transform3D.rotQuat;
        }
        return transform3D.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(Transform3D transform3D, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (dVar.z(serialDescriptor, 0) || !C17542s.e(transform3D.pos, C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)))) {
            dVar.i(serialDescriptor, 0, kSerializerArr[0], transform3D.pos);
        }
        if (dVar.z(serialDescriptor, 1) || !C17542s.e(transform3D.rotQuat, Companion.getIdentityQuat())) {
            dVar.i(serialDescriptor, 1, kSerializerArr[1], transform3D.rotQuat);
        }
    }

    public final List<Double> component1() {
        return this.pos;
    }

    public final List<Double> component2() {
        return this.rotQuat;
    }

    public final Transform3D copy(List<Double> list, List<Double> list2) {
        C17542s.j(list, "pos");
        C17542s.j(list2, "rotQuat");
        return new Transform3D(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transform3D)) {
            return false;
        }
        Transform3D transform3D = (Transform3D) obj;
        return C17542s.e(this.pos, transform3D.pos) && C17542s.e(this.rotQuat, transform3D.rotQuat);
    }

    public final double getHeading() {
        if (this.rotQuat.get(0).doubleValue() == 0.0d) {
            int i10 = (this.rotQuat.get(1).doubleValue() > 0.0d ? 1 : (this.rotQuat.get(1).doubleValue() == 0.0d ? 0 : -1));
        }
        return Math.acos(this.rotQuat.get(3).doubleValue()) * 2.0d;
    }

    public final List<Double> getPos() {
        return this.pos;
    }

    public final List<Double> getRotQuat() {
        return this.rotQuat;
    }

    public int hashCode() {
        return (this.pos.hashCode() * 31) + this.rotQuat.hashCode();
    }

    public final void setHeading(double d10) {
        Double valueOf = Double.valueOf(0.0d);
        double d11 = d10 / 2.0d;
        this.rotQuat = C16877v.q(valueOf, valueOf, Double.valueOf(Math.sin(d11)), Double.valueOf(Math.cos(d11)));
    }

    public final void setPos(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.pos = list;
    }

    public final void setRotQuat(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.rotQuat = list;
    }

    public String toString() {
        List<Double> list = this.pos;
        List<Double> list2 = this.rotQuat;
        return "Transform3D(pos=" + list + ", rotQuat=" + list2 + ")";
    }

    public final void validate$decorate_engine_release() {
        this.pos.size();
        this.rotQuat.size();
    }

    @C16814e
    public /* synthetic */ Transform3D(int i10, List<Double> list, List list2, T0 t02) {
        this.pos = (i10 & 1) == 0 ? C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)) : list;
        if ((i10 & 2) == 0) {
            this.rotQuat = Companion.getIdentityQuat();
        } else {
            this.rotQuat = list2;
        }
    }

    public Transform3D(List<Double> list, List<Double> list2) {
        C17542s.j(list, "pos");
        C17542s.j(list2, "rotQuat");
        this.pos = list;
        this.rotQuat = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Transform3D(List list, List<Double> list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)) : list, (i10 & 2) != 0 ? Companion.getIdentityQuat() : list2);
    }
}
