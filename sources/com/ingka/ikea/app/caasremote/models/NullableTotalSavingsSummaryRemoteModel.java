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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u001dB3\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010!\u001a\u0004\b\"\u0010$¨\u0006("}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryRemoteModel;", "", "", "seen1", "", "amount", "Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryDistributionRemoteModel;", "distribution", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryDistributionRemoteModel;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getAmount$annotations", "()V", "b", "Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryDistributionRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryDistributionRemoteModel;", "getDistribution$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableTotalSavingsSummaryRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Double f71453a;

    /* renamed from: b  reason: collision with root package name */
    private final NullableTotalSavingsSummaryDistributionRemoteModel f71454b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableTotalSavingsSummaryRemoteModel> serializer() {
            return NullableTotalSavingsSummaryRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableTotalSavingsSummaryRemoteModel(int i10, Double d10, NullableTotalSavingsSummaryDistributionRemoteModel nullableTotalSavingsSummaryDistributionRemoteModel, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, NullableTotalSavingsSummaryRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71453a = d10;
        this.f71454b = nullableTotalSavingsSummaryDistributionRemoteModel;
    }

    public static final /* synthetic */ void c(NullableTotalSavingsSummaryRemoteModel nullableTotalSavingsSummaryRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, C17438C.f144010a, nullableTotalSavingsSummaryRemoteModel.f71453a);
        dVar.B(serialDescriptor, 1, NullableTotalSavingsSummaryDistributionRemoteModel$$serializer.INSTANCE, nullableTotalSavingsSummaryRemoteModel.f71454b);
    }

    public final Double a() {
        return this.f71453a;
    }

    public final NullableTotalSavingsSummaryDistributionRemoteModel b() {
        return this.f71454b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableTotalSavingsSummaryRemoteModel)) {
            return false;
        }
        NullableTotalSavingsSummaryRemoteModel nullableTotalSavingsSummaryRemoteModel = (NullableTotalSavingsSummaryRemoteModel) obj;
        return C17542s.e(this.f71453a, nullableTotalSavingsSummaryRemoteModel.f71453a) && C17542s.e(this.f71454b, nullableTotalSavingsSummaryRemoteModel.f71454b);
    }

    public int hashCode() {
        Double d10 = this.f71453a;
        int i10 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        NullableTotalSavingsSummaryDistributionRemoteModel nullableTotalSavingsSummaryDistributionRemoteModel = this.f71454b;
        if (nullableTotalSavingsSummaryDistributionRemoteModel != null) {
            i10 = nullableTotalSavingsSummaryDistributionRemoteModel.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Double d10 = this.f71453a;
        NullableTotalSavingsSummaryDistributionRemoteModel nullableTotalSavingsSummaryDistributionRemoteModel = this.f71454b;
        return "NullableTotalSavingsSummaryRemoteModel(amount=" + d10 + ", distribution=" + nullableTotalSavingsSummaryDistributionRemoteModel + ")";
    }
}
