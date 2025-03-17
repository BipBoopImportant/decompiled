package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b0\b\b\u0018\u0000 W2\u00020\u0001:\u0002X,B\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÁ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b,\u0010.R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010-\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010.R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00100\u001a\u0004\b6\u00107R \u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b<\u00100\u001a\u0004\b1\u0010;R \u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\b@\u00100\u001a\u0004\b4\u0010?R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010A\u0012\u0004\bD\u00100\u001a\u0004\bB\u0010CR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bH\u00100\u001a\u0004\b9\u0010GR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u00100\u001a\u0004\bK\u0010LR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u00100\u001a\u0004\bP\u0010QR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bV\u00100\u001a\u0004\b=\u0010U¨\u0006Y"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/NullableAssemblyServiceTotalPriceResponseRemoteModel;", "assemblyService", "assemblyServiceOfPlans", "Lcom/ingka/ikea/app/caasremote/models/NullableBasePricePropertiesRemoteModel;", "base", "Lcom/ingka/ikea/app/caasremote/models/CurrentPricePropertiesRemoteModel;", "current", "Lcom/ingka/ikea/app/caasremote/models/ProductTotalPriceResponseRemoteModel;", "product", "Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceTotalPriceResponseRemoteModel;", "removalServices", "Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryRemoteModel;", "savings", "Lcom/ingka/ikea/app/caasremote/models/NullableServiceTotalPriceResponseRemoteModel;", "service", "Lcom/ingka/ikea/app/caasremote/models/NullableServiceTotalPricePayToProviderResponseRemoteModel;", "serviceByProvider", "Lcom/ingka/ikea/app/caasremote/models/NullableUpsellTotalPricePropertiesRemoteModel;", "upsell", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/NullableAssemblyServiceTotalPriceResponseRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableAssemblyServiceTotalPriceResponseRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableBasePricePropertiesRemoteModel;Lcom/ingka/ikea/app/caasremote/models/CurrentPricePropertiesRemoteModel;Lcom/ingka/ikea/app/caasremote/models/ProductTotalPriceResponseRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceTotalPriceResponseRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableServiceTotalPriceResponseRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableServiceTotalPricePayToProviderResponseRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableUpsellTotalPricePropertiesRemoteModel;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/NullableAssemblyServiceTotalPriceResponseRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableAssemblyServiceTotalPriceResponseRemoteModel;", "getAssemblyService$annotations", "()V", "b", "getAssemblyServiceOfPlans", "getAssemblyServiceOfPlans$annotations", "c", "Lcom/ingka/ikea/app/caasremote/models/NullableBasePricePropertiesRemoteModel;", "getBase", "()Lcom/ingka/ikea/app/caasremote/models/NullableBasePricePropertiesRemoteModel;", "getBase$annotations", "d", "Lcom/ingka/ikea/app/caasremote/models/CurrentPricePropertiesRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/CurrentPricePropertiesRemoteModel;", "getCurrent$annotations", "e", "Lcom/ingka/ikea/app/caasremote/models/ProductTotalPriceResponseRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/ProductTotalPriceResponseRemoteModel;", "getProduct$annotations", "Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceTotalPriceResponseRemoteModel;", "getRemovalServices", "()Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceTotalPriceResponseRemoteModel;", "getRemovalServices$annotations", "g", "Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryRemoteModel;", "getSavings$annotations", "h", "Lcom/ingka/ikea/app/caasremote/models/NullableServiceTotalPriceResponseRemoteModel;", "getService", "()Lcom/ingka/ikea/app/caasremote/models/NullableServiceTotalPriceResponseRemoteModel;", "getService$annotations", "i", "Lcom/ingka/ikea/app/caasremote/models/NullableServiceTotalPricePayToProviderResponseRemoteModel;", "getServiceByProvider", "()Lcom/ingka/ikea/app/caasremote/models/NullableServiceTotalPricePayToProviderResponseRemoteModel;", "getServiceByProvider$annotations", "j", "Lcom/ingka/ikea/app/caasremote/models/NullableUpsellTotalPricePropertiesRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableUpsellTotalPricePropertiesRemoteModel;", "getUpsell$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TotalPriceResponseRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final NullableAssemblyServiceTotalPriceResponseRemoteModel f71555a;

    /* renamed from: b  reason: collision with root package name */
    private final NullableAssemblyServiceTotalPriceResponseRemoteModel f71556b;

    /* renamed from: c  reason: collision with root package name */
    private final NullableBasePricePropertiesRemoteModel f71557c;

    /* renamed from: d  reason: collision with root package name */
    private final CurrentPricePropertiesRemoteModel f71558d;

    /* renamed from: e  reason: collision with root package name */
    private final ProductTotalPriceResponseRemoteModel f71559e;

    /* renamed from: f  reason: collision with root package name */
    private final NullableRemovalServiceTotalPriceResponseRemoteModel f71560f;

    /* renamed from: g  reason: collision with root package name */
    private final NullableTotalSavingsSummaryRemoteModel f71561g;

    /* renamed from: h  reason: collision with root package name */
    private final NullableServiceTotalPriceResponseRemoteModel f71562h;

    /* renamed from: i  reason: collision with root package name */
    private final NullableServiceTotalPricePayToProviderResponseRemoteModel f71563i;

    /* renamed from: j  reason: collision with root package name */
    private final NullableUpsellTotalPricePropertiesRemoteModel f71564j;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TotalPriceResponseRemoteModel> serializer() {
            return TotalPriceResponseRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ TotalPriceResponseRemoteModel(int i10, NullableAssemblyServiceTotalPriceResponseRemoteModel nullableAssemblyServiceTotalPriceResponseRemoteModel, NullableAssemblyServiceTotalPriceResponseRemoteModel nullableAssemblyServiceTotalPriceResponseRemoteModel2, NullableBasePricePropertiesRemoteModel nullableBasePricePropertiesRemoteModel, CurrentPricePropertiesRemoteModel currentPricePropertiesRemoteModel, ProductTotalPriceResponseRemoteModel productTotalPriceResponseRemoteModel, NullableRemovalServiceTotalPriceResponseRemoteModel nullableRemovalServiceTotalPriceResponseRemoteModel, NullableTotalSavingsSummaryRemoteModel nullableTotalSavingsSummaryRemoteModel, NullableServiceTotalPriceResponseRemoteModel nullableServiceTotalPriceResponseRemoteModel, NullableServiceTotalPricePayToProviderResponseRemoteModel nullableServiceTotalPricePayToProviderResponseRemoteModel, NullableUpsellTotalPricePropertiesRemoteModel nullableUpsellTotalPricePropertiesRemoteModel, T0 t02) {
        if (1023 != (i10 & 1023)) {
            E0.b(i10, 1023, TotalPriceResponseRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71555a = nullableAssemblyServiceTotalPriceResponseRemoteModel;
        this.f71556b = nullableAssemblyServiceTotalPriceResponseRemoteModel2;
        this.f71557c = nullableBasePricePropertiesRemoteModel;
        this.f71558d = currentPricePropertiesRemoteModel;
        this.f71559e = productTotalPriceResponseRemoteModel;
        this.f71560f = nullableRemovalServiceTotalPriceResponseRemoteModel;
        this.f71561g = nullableTotalSavingsSummaryRemoteModel;
        this.f71562h = nullableServiceTotalPriceResponseRemoteModel;
        this.f71563i = nullableServiceTotalPricePayToProviderResponseRemoteModel;
        this.f71564j = nullableUpsellTotalPricePropertiesRemoteModel;
    }

    public static final /* synthetic */ void f(TotalPriceResponseRemoteModel totalPriceResponseRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        NullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer nullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer = NullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 0, nullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer, totalPriceResponseRemoteModel.f71555a);
        dVar.B(serialDescriptor, 1, nullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer, totalPriceResponseRemoteModel.f71556b);
        dVar.B(serialDescriptor, 2, NullableBasePricePropertiesRemoteModel$$serializer.INSTANCE, totalPriceResponseRemoteModel.f71557c);
        dVar.i(serialDescriptor, 3, CurrentPricePropertiesRemoteModel$$serializer.INSTANCE, totalPriceResponseRemoteModel.f71558d);
        dVar.i(serialDescriptor, 4, ProductTotalPriceResponseRemoteModel$$serializer.INSTANCE, totalPriceResponseRemoteModel.f71559e);
        dVar.B(serialDescriptor, 5, NullableRemovalServiceTotalPriceResponseRemoteModel$$serializer.INSTANCE, totalPriceResponseRemoteModel.f71560f);
        dVar.B(serialDescriptor, 6, NullableTotalSavingsSummaryRemoteModel$$serializer.INSTANCE, totalPriceResponseRemoteModel.f71561g);
        dVar.B(serialDescriptor, 7, NullableServiceTotalPriceResponseRemoteModel$$serializer.INSTANCE, totalPriceResponseRemoteModel.f71562h);
        dVar.B(serialDescriptor, 8, NullableServiceTotalPricePayToProviderResponseRemoteModel$$serializer.INSTANCE, totalPriceResponseRemoteModel.f71563i);
        dVar.B(serialDescriptor, 9, NullableUpsellTotalPricePropertiesRemoteModel$$serializer.INSTANCE, totalPriceResponseRemoteModel.f71564j);
    }

    public final NullableAssemblyServiceTotalPriceResponseRemoteModel a() {
        return this.f71555a;
    }

    public final CurrentPricePropertiesRemoteModel b() {
        return this.f71558d;
    }

    public final ProductTotalPriceResponseRemoteModel c() {
        return this.f71559e;
    }

    public final NullableTotalSavingsSummaryRemoteModel d() {
        return this.f71561g;
    }

    public final NullableUpsellTotalPricePropertiesRemoteModel e() {
        return this.f71564j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalPriceResponseRemoteModel)) {
            return false;
        }
        TotalPriceResponseRemoteModel totalPriceResponseRemoteModel = (TotalPriceResponseRemoteModel) obj;
        return C17542s.e(this.f71555a, totalPriceResponseRemoteModel.f71555a) && C17542s.e(this.f71556b, totalPriceResponseRemoteModel.f71556b) && C17542s.e(this.f71557c, totalPriceResponseRemoteModel.f71557c) && C17542s.e(this.f71558d, totalPriceResponseRemoteModel.f71558d) && C17542s.e(this.f71559e, totalPriceResponseRemoteModel.f71559e) && C17542s.e(this.f71560f, totalPriceResponseRemoteModel.f71560f) && C17542s.e(this.f71561g, totalPriceResponseRemoteModel.f71561g) && C17542s.e(this.f71562h, totalPriceResponseRemoteModel.f71562h) && C17542s.e(this.f71563i, totalPriceResponseRemoteModel.f71563i) && C17542s.e(this.f71564j, totalPriceResponseRemoteModel.f71564j);
    }

    public int hashCode() {
        NullableAssemblyServiceTotalPriceResponseRemoteModel nullableAssemblyServiceTotalPriceResponseRemoteModel = this.f71555a;
        int i10 = 0;
        int hashCode = (nullableAssemblyServiceTotalPriceResponseRemoteModel == null ? 0 : nullableAssemblyServiceTotalPriceResponseRemoteModel.hashCode()) * 31;
        NullableAssemblyServiceTotalPriceResponseRemoteModel nullableAssemblyServiceTotalPriceResponseRemoteModel2 = this.f71556b;
        int hashCode2 = (hashCode + (nullableAssemblyServiceTotalPriceResponseRemoteModel2 == null ? 0 : nullableAssemblyServiceTotalPriceResponseRemoteModel2.hashCode())) * 31;
        NullableBasePricePropertiesRemoteModel nullableBasePricePropertiesRemoteModel = this.f71557c;
        int hashCode3 = (((((hashCode2 + (nullableBasePricePropertiesRemoteModel == null ? 0 : nullableBasePricePropertiesRemoteModel.hashCode())) * 31) + this.f71558d.hashCode()) * 31) + this.f71559e.hashCode()) * 31;
        NullableRemovalServiceTotalPriceResponseRemoteModel nullableRemovalServiceTotalPriceResponseRemoteModel = this.f71560f;
        int hashCode4 = (hashCode3 + (nullableRemovalServiceTotalPriceResponseRemoteModel == null ? 0 : nullableRemovalServiceTotalPriceResponseRemoteModel.hashCode())) * 31;
        NullableTotalSavingsSummaryRemoteModel nullableTotalSavingsSummaryRemoteModel = this.f71561g;
        int hashCode5 = (hashCode4 + (nullableTotalSavingsSummaryRemoteModel == null ? 0 : nullableTotalSavingsSummaryRemoteModel.hashCode())) * 31;
        NullableServiceTotalPriceResponseRemoteModel nullableServiceTotalPriceResponseRemoteModel = this.f71562h;
        int hashCode6 = (hashCode5 + (nullableServiceTotalPriceResponseRemoteModel == null ? 0 : nullableServiceTotalPriceResponseRemoteModel.hashCode())) * 31;
        NullableServiceTotalPricePayToProviderResponseRemoteModel nullableServiceTotalPricePayToProviderResponseRemoteModel = this.f71563i;
        int hashCode7 = (hashCode6 + (nullableServiceTotalPricePayToProviderResponseRemoteModel == null ? 0 : nullableServiceTotalPricePayToProviderResponseRemoteModel.hashCode())) * 31;
        NullableUpsellTotalPricePropertiesRemoteModel nullableUpsellTotalPricePropertiesRemoteModel = this.f71564j;
        if (nullableUpsellTotalPricePropertiesRemoteModel != null) {
            i10 = nullableUpsellTotalPricePropertiesRemoteModel.hashCode();
        }
        return hashCode7 + i10;
    }

    public String toString() {
        NullableAssemblyServiceTotalPriceResponseRemoteModel nullableAssemblyServiceTotalPriceResponseRemoteModel = this.f71555a;
        NullableAssemblyServiceTotalPriceResponseRemoteModel nullableAssemblyServiceTotalPriceResponseRemoteModel2 = this.f71556b;
        NullableBasePricePropertiesRemoteModel nullableBasePricePropertiesRemoteModel = this.f71557c;
        CurrentPricePropertiesRemoteModel currentPricePropertiesRemoteModel = this.f71558d;
        ProductTotalPriceResponseRemoteModel productTotalPriceResponseRemoteModel = this.f71559e;
        NullableRemovalServiceTotalPriceResponseRemoteModel nullableRemovalServiceTotalPriceResponseRemoteModel = this.f71560f;
        NullableTotalSavingsSummaryRemoteModel nullableTotalSavingsSummaryRemoteModel = this.f71561g;
        NullableServiceTotalPriceResponseRemoteModel nullableServiceTotalPriceResponseRemoteModel = this.f71562h;
        NullableServiceTotalPricePayToProviderResponseRemoteModel nullableServiceTotalPricePayToProviderResponseRemoteModel = this.f71563i;
        NullableUpsellTotalPricePropertiesRemoteModel nullableUpsellTotalPricePropertiesRemoteModel = this.f71564j;
        return "TotalPriceResponseRemoteModel(assemblyService=" + nullableAssemblyServiceTotalPriceResponseRemoteModel + ", assemblyServiceOfPlans=" + nullableAssemblyServiceTotalPriceResponseRemoteModel2 + ", base=" + nullableBasePricePropertiesRemoteModel + ", current=" + currentPricePropertiesRemoteModel + ", product=" + productTotalPriceResponseRemoteModel + ", removalServices=" + nullableRemovalServiceTotalPriceResponseRemoteModel + ", savings=" + nullableTotalSavingsSummaryRemoteModel + ", service=" + nullableServiceTotalPriceResponseRemoteModel + ", serviceByProvider=" + nullableServiceTotalPricePayToProviderResponseRemoteModel + ", upsell=" + nullableUpsellTotalPricePropertiesRemoteModel + ")";
    }
}
