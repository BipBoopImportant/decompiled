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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 &2\u00020\u0001:\u0002'\u001dB?\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u0012\u0004\b%\u0010!\u001a\u0004\b$\u0010\u001f¨\u0006("}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableLowestPreviousPriceRemoteModel;", "", "", "seen1", "", "exclTax", "inclTax", "tax", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/app/caasremote/models/NullableLowestPreviousPriceRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getExclTax$annotations", "()V", "b", "getInclTax$annotations", "getTax", "getTax$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableLowestPreviousPriceRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Double f71358a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f71359b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f71360c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableLowestPreviousPriceRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableLowestPreviousPriceRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableLowestPreviousPriceRemoteModel> serializer() {
            return NullableLowestPreviousPriceRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableLowestPreviousPriceRemoteModel(int i10, Double d10, Double d11, Double d12, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, NullableLowestPreviousPriceRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71358a = d10;
        this.f71359b = d11;
        this.f71360c = d12;
    }

    public static final /* synthetic */ void c(NullableLowestPreviousPriceRemoteModel nullableLowestPreviousPriceRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17438C c10 = C17438C.f144010a;
        dVar.B(serialDescriptor, 0, c10, nullableLowestPreviousPriceRemoteModel.f71358a);
        dVar.B(serialDescriptor, 1, c10, nullableLowestPreviousPriceRemoteModel.f71359b);
        dVar.B(serialDescriptor, 2, c10, nullableLowestPreviousPriceRemoteModel.f71360c);
    }

    public final Double a() {
        return this.f71358a;
    }

    public final Double b() {
        return this.f71359b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableLowestPreviousPriceRemoteModel)) {
            return false;
        }
        NullableLowestPreviousPriceRemoteModel nullableLowestPreviousPriceRemoteModel = (NullableLowestPreviousPriceRemoteModel) obj;
        return C17542s.e(this.f71358a, nullableLowestPreviousPriceRemoteModel.f71358a) && C17542s.e(this.f71359b, nullableLowestPreviousPriceRemoteModel.f71359b) && C17542s.e(this.f71360c, nullableLowestPreviousPriceRemoteModel.f71360c);
    }

    public int hashCode() {
        Double d10 = this.f71358a;
        int i10 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f71359b;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f71360c;
        if (d12 != null) {
            i10 = d12.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        Double d10 = this.f71358a;
        Double d11 = this.f71359b;
        Double d12 = this.f71360c;
        return "NullableLowestPreviousPriceRemoteModel(exclTax=" + d10 + ", inclTax=" + d11 + ", tax=" + d12 + ")";
    }
}
