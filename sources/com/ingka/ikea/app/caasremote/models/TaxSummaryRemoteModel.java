package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 -2\u00020\u0001:\u0002.\u0014BK\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010!\u001a\u0004\b$\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001e\u0012\u0004\b)\u0010!\u001a\u0004\b(\u0010\u0017R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010#\u0012\u0004\b,\u0010!\u001a\u0004\b+\u0010%¨\u0006/"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/TaxSummaryRemoteModel;", "", "", "seen1", "", "taxCode", "", "taxPercent", "taxType", "totalTaxAmount", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/app/caasremote/models/TaxSummaryRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTaxCode", "getTaxCode$annotations", "()V", "b", "Ljava/lang/Double;", "getTaxPercent", "()Ljava/lang/Double;", "getTaxPercent$annotations", "c", "getTaxType", "getTaxType$annotations", "d", "getTotalTaxAmount", "getTotalTaxAmount$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TaxSummaryRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f71551a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f71552b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71553c;

    /* renamed from: d  reason: collision with root package name */
    private final Double f71554d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/TaxSummaryRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/TaxSummaryRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TaxSummaryRemoteModel> serializer() {
            return TaxSummaryRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ TaxSummaryRemoteModel(int i10, String str, Double d10, String str2, Double d11, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, TaxSummaryRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71551a = str;
        this.f71552b = d10;
        this.f71553c = str2;
        this.f71554d = d11;
    }

    public static final /* synthetic */ void a(TaxSummaryRemoteModel taxSummaryRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, taxSummaryRemoteModel.f71551a);
        C17438C c10 = C17438C.f144010a;
        dVar.B(serialDescriptor, 1, c10, taxSummaryRemoteModel.f71552b);
        dVar.B(serialDescriptor, 2, y02, taxSummaryRemoteModel.f71553c);
        dVar.B(serialDescriptor, 3, c10, taxSummaryRemoteModel.f71554d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxSummaryRemoteModel)) {
            return false;
        }
        TaxSummaryRemoteModel taxSummaryRemoteModel = (TaxSummaryRemoteModel) obj;
        return C17542s.e(this.f71551a, taxSummaryRemoteModel.f71551a) && C17542s.e(this.f71552b, taxSummaryRemoteModel.f71552b) && C17542s.e(this.f71553c, taxSummaryRemoteModel.f71553c) && C17542s.e(this.f71554d, taxSummaryRemoteModel.f71554d);
    }

    public int hashCode() {
        String str = this.f71551a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d10 = this.f71552b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str2 = this.f71553c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d11 = this.f71554d;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f71551a;
        Double d10 = this.f71552b;
        String str2 = this.f71553c;
        Double d11 = this.f71554d;
        return "TaxSummaryRemoteModel(taxCode=" + str + ", taxPercent=" + d10 + ", taxType=" + str2 + ", totalTaxAmount=" + d11 + ")";
    }
}
