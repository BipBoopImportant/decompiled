package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u0014B7\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001a\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0014\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001a\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006!"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PriceDataModel;", "", "", "seen0", "", "inclTax", "exclTax", "tax", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IDLjava/lang/Double;Ljava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PriceDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "D", "b", "()D", "getInclTax$annotations", "()V", "Ljava/lang/Double;", "()Ljava/lang/Double;", "getExclTax$annotations", "c", "getTax$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PriceDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final double f120045a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f120046b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f120047c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PriceDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PriceDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PriceDataModel> serializer() {
            return PriceDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PriceDataModel(int i10, double d10, Double d11, Double d12, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, PriceDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f120045a = d10;
        this.f120046b = d11;
        this.f120047c = d12;
    }

    public static final /* synthetic */ void d(PriceDataModel priceDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.E(serialDescriptor, 0, priceDataModel.f120045a);
        C17438C c10 = C17438C.f144010a;
        dVar.B(serialDescriptor, 1, c10, priceDataModel.f120046b);
        dVar.B(serialDescriptor, 2, c10, priceDataModel.f120047c);
    }

    public final Double a() {
        return this.f120046b;
    }

    public final double b() {
        return this.f120045a;
    }

    public final Double c() {
        return this.f120047c;
    }
}
