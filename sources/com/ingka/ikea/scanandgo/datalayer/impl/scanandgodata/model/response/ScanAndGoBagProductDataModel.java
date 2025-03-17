package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 *2\u00020\u0001:\u0002+\u001eB9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010!\u001a\u0004\b$\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010'\u0012\u0004\b)\u0010!\u001a\u0004\b\"\u0010(¨\u0006,"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoBagProductDataModel;", "", "", "seen0", "", "barcode", "", "quantity", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PriceDataModel;", "price", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Double;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PriceDataModel;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoBagProductDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBarcode$annotations", "()V", "b", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "getQuantity$annotations", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PriceDataModel;", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PriceDataModel;", "getPrice$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoBagProductDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120067a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f120068b;

    /* renamed from: c  reason: collision with root package name */
    private final PriceDataModel f120069c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoBagProductDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoBagProductDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ScanAndGoBagProductDataModel> serializer() {
            return ScanAndGoBagProductDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ScanAndGoBagProductDataModel(int i10, String str, Double d10, PriceDataModel priceDataModel, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, ScanAndGoBagProductDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f120067a = str;
        this.f120068b = d10;
        this.f120069c = priceDataModel;
    }

    public static final /* synthetic */ void d(ScanAndGoBagProductDataModel scanAndGoBagProductDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, Y0.f144077a, scanAndGoBagProductDataModel.f120067a);
        dVar.B(serialDescriptor, 1, C17438C.f144010a, scanAndGoBagProductDataModel.f120068b);
        dVar.B(serialDescriptor, 2, PriceDataModel$$serializer.INSTANCE, scanAndGoBagProductDataModel.f120069c);
    }

    public final String a() {
        return this.f120067a;
    }

    public final PriceDataModel b() {
        return this.f120069c;
    }

    public final Double c() {
        return this.f120068b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanAndGoBagProductDataModel)) {
            return false;
        }
        ScanAndGoBagProductDataModel scanAndGoBagProductDataModel = (ScanAndGoBagProductDataModel) obj;
        return C17542s.e(this.f120067a, scanAndGoBagProductDataModel.f120067a) && C17542s.e(this.f120068b, scanAndGoBagProductDataModel.f120068b) && C17542s.e(this.f120069c, scanAndGoBagProductDataModel.f120069c);
    }

    public int hashCode() {
        String str = this.f120067a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d10 = this.f120068b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        PriceDataModel priceDataModel = this.f120069c;
        if (priceDataModel != null) {
            i10 = priceDataModel.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f120067a;
        Double d10 = this.f120068b;
        PriceDataModel priceDataModel = this.f120069c;
        return "ScanAndGoBagProductDataModel(barcode=" + str + ", quantity=" + d10 + ", price=" + priceDataModel + ")";
    }
}
