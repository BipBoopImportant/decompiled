package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\b\u0018\u0000 (2\u00020\u0001:\u0002)\u001dB;\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u001fR \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010!\u001a\u0004\b$\u0010&¨\u0006*"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableStoreAvailabilityRemoteModel;", "", "", "seen1", "", "availableForCashAndCarry", "availableForClickAndCollect", "", "availableQuantity", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IZZLjava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/app/caasremote/models/NullableStoreAvailabilityRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "getAvailableForCashAndCarry$annotations", "()V", "b", "getAvailableForClickAndCollect$annotations", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getAvailableQuantity$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableStoreAvailabilityRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f71437a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f71438b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f71439c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableStoreAvailabilityRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableStoreAvailabilityRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableStoreAvailabilityRemoteModel> serializer() {
            return NullableStoreAvailabilityRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableStoreAvailabilityRemoteModel(int i10, boolean z10, boolean z11, Double d10, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, NullableStoreAvailabilityRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71437a = z10;
        this.f71438b = z11;
        this.f71439c = d10;
    }

    public static final /* synthetic */ void d(NullableStoreAvailabilityRemoteModel nullableStoreAvailabilityRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.x(serialDescriptor, 0, nullableStoreAvailabilityRemoteModel.f71437a);
        dVar.x(serialDescriptor, 1, nullableStoreAvailabilityRemoteModel.f71438b);
        dVar.B(serialDescriptor, 2, C17438C.f144010a, nullableStoreAvailabilityRemoteModel.f71439c);
    }

    public final boolean a() {
        return this.f71437a;
    }

    public final boolean b() {
        return this.f71438b;
    }

    public final Double c() {
        return this.f71439c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableStoreAvailabilityRemoteModel)) {
            return false;
        }
        NullableStoreAvailabilityRemoteModel nullableStoreAvailabilityRemoteModel = (NullableStoreAvailabilityRemoteModel) obj;
        return this.f71437a == nullableStoreAvailabilityRemoteModel.f71437a && this.f71438b == nullableStoreAvailabilityRemoteModel.f71438b && C17542s.e(this.f71439c, nullableStoreAvailabilityRemoteModel.f71439c);
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.f71437a) * 31) + Boolean.hashCode(this.f71438b)) * 31;
        Double d10 = this.f71439c;
        return hashCode + (d10 == null ? 0 : d10.hashCode());
    }

    public String toString() {
        boolean z10 = this.f71437a;
        boolean z11 = this.f71438b;
        Double d10 = this.f71439c;
        return "NullableStoreAvailabilityRemoteModel(availableForCashAndCarry=" + z10 + ", availableForClickAndCollect=" + z11 + ", availableQuantity=" + d10 + ")";
    }
}
