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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 .2\u00020\u0001:\u0002/\u001fBK\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010 \u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010$\u001a\u0004\b\u001f\u0010)R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010 \u0012\u0004\b-\u0010$\u001a\u0004\b,\u0010\"¨\u00060"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableUpsellTotalPricePropertiesRemoteModel;", "", "", "seen1", "", "exclTax", "inclTax", "Lcom/ingka/ikea/app/caasremote/models/NullableCartUpsellSavingsRemoteModel;", "savings", "tax", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;Lcom/ingka/ikea/app/caasremote/models/NullableCartUpsellSavingsRemoteModel;Ljava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/NullableUpsellTotalPricePropertiesRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "getExclTax", "()Ljava/lang/Double;", "getExclTax$annotations", "()V", "getInclTax", "getInclTax$annotations", "c", "Lcom/ingka/ikea/app/caasremote/models/NullableCartUpsellSavingsRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableCartUpsellSavingsRemoteModel;", "getSavings$annotations", "d", "getTax", "getTax$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableUpsellTotalPricePropertiesRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Double f71459a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f71460b;

    /* renamed from: c  reason: collision with root package name */
    private final NullableCartUpsellSavingsRemoteModel f71461c;

    /* renamed from: d  reason: collision with root package name */
    private final Double f71462d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableUpsellTotalPricePropertiesRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableUpsellTotalPricePropertiesRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableUpsellTotalPricePropertiesRemoteModel> serializer() {
            return NullableUpsellTotalPricePropertiesRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableUpsellTotalPricePropertiesRemoteModel(int i10, Double d10, Double d11, NullableCartUpsellSavingsRemoteModel nullableCartUpsellSavingsRemoteModel, Double d12, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, NullableUpsellTotalPricePropertiesRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71459a = d10;
        this.f71460b = d11;
        this.f71461c = nullableCartUpsellSavingsRemoteModel;
        this.f71462d = d12;
    }

    public static final /* synthetic */ void b(NullableUpsellTotalPricePropertiesRemoteModel nullableUpsellTotalPricePropertiesRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17438C c10 = C17438C.f144010a;
        dVar.B(serialDescriptor, 0, c10, nullableUpsellTotalPricePropertiesRemoteModel.f71459a);
        dVar.B(serialDescriptor, 1, c10, nullableUpsellTotalPricePropertiesRemoteModel.f71460b);
        dVar.B(serialDescriptor, 2, NullableCartUpsellSavingsRemoteModel$$serializer.INSTANCE, nullableUpsellTotalPricePropertiesRemoteModel.f71461c);
        dVar.B(serialDescriptor, 3, c10, nullableUpsellTotalPricePropertiesRemoteModel.f71462d);
    }

    public final NullableCartUpsellSavingsRemoteModel a() {
        return this.f71461c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableUpsellTotalPricePropertiesRemoteModel)) {
            return false;
        }
        NullableUpsellTotalPricePropertiesRemoteModel nullableUpsellTotalPricePropertiesRemoteModel = (NullableUpsellTotalPricePropertiesRemoteModel) obj;
        return C17542s.e(this.f71459a, nullableUpsellTotalPricePropertiesRemoteModel.f71459a) && C17542s.e(this.f71460b, nullableUpsellTotalPricePropertiesRemoteModel.f71460b) && C17542s.e(this.f71461c, nullableUpsellTotalPricePropertiesRemoteModel.f71461c) && C17542s.e(this.f71462d, nullableUpsellTotalPricePropertiesRemoteModel.f71462d);
    }

    public int hashCode() {
        Double d10 = this.f71459a;
        int i10 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f71460b;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        NullableCartUpsellSavingsRemoteModel nullableCartUpsellSavingsRemoteModel = this.f71461c;
        int hashCode3 = (hashCode2 + (nullableCartUpsellSavingsRemoteModel == null ? 0 : nullableCartUpsellSavingsRemoteModel.hashCode())) * 31;
        Double d12 = this.f71462d;
        if (d12 != null) {
            i10 = d12.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        Double d10 = this.f71459a;
        Double d11 = this.f71460b;
        NullableCartUpsellSavingsRemoteModel nullableCartUpsellSavingsRemoteModel = this.f71461c;
        Double d12 = this.f71462d;
        return "NullableUpsellTotalPricePropertiesRemoteModel(exclTax=" + d10 + ", inclTax=" + d11 + ", savings=" + nullableCartUpsellSavingsRemoteModel + ", tax=" + d12 + ")";
    }
}
