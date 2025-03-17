package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000 62\u00020\u0001:\u00027\"BM\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010+\u0012\u0004\b.\u0010'\u001a\u0004\b,\u0010-R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u0010'\u001a\u0004\b\"\u00101R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u00103\u0012\u0004\b5\u0010'\u001a\u0004\b/\u00104¨\u00068"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ProductCardDataModel;", "", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "product", "", "productType", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;", "stock", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PackageMeasurementsDataModel;", "packageMeasurements", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;", "salesLocation", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PackageMeasurementsDataModel;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ProductCardDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "b", "()Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "getProduct$annotations", "()V", "Ljava/lang/String;", "c", "getProductType$annotations", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;", "e", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;", "getStock$annotations", "d", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PackageMeasurementsDataModel;", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/PackageMeasurementsDataModel;", "getPackageMeasurements$annotations", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationDataModel;", "getSalesLocation$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductCardDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ProductLiteRemote f120048a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120049b;

    /* renamed from: c  reason: collision with root package name */
    private final StockInfoDataModel f120050c;

    /* renamed from: d  reason: collision with root package name */
    private final PackageMeasurementsDataModel f120051d;

    /* renamed from: e  reason: collision with root package name */
    private final SalesLocationDataModel f120052e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ProductCardDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ProductCardDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProductCardDataModel> serializer() {
            return ProductCardDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductCardDataModel(int i10, ProductLiteRemote productLiteRemote, String str, StockInfoDataModel stockInfoDataModel, PackageMeasurementsDataModel packageMeasurementsDataModel, SalesLocationDataModel salesLocationDataModel, T0 t02) {
        if (30 != (i10 & 30)) {
            E0.b(i10, 30, ProductCardDataModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f120048a = null;
        } else {
            this.f120048a = productLiteRemote;
        }
        this.f120049b = str;
        this.f120050c = stockInfoDataModel;
        this.f120051d = packageMeasurementsDataModel;
        this.f120052e = salesLocationDataModel;
    }

    public static final /* synthetic */ void f(ProductCardDataModel productCardDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.z(serialDescriptor, 0) || productCardDataModel.f120048a != null) {
            dVar.B(serialDescriptor, 0, ProductLiteRemote$$serializer.INSTANCE, productCardDataModel.f120048a);
        }
        dVar.B(serialDescriptor, 1, Y0.f144077a, productCardDataModel.f120049b);
        dVar.B(serialDescriptor, 2, StockInfoDataModel$$serializer.INSTANCE, productCardDataModel.f120050c);
        dVar.B(serialDescriptor, 3, PackageMeasurementsDataModel$$serializer.INSTANCE, productCardDataModel.f120051d);
        dVar.B(serialDescriptor, 4, SalesLocationDataModel$$serializer.INSTANCE, productCardDataModel.f120052e);
    }

    public final PackageMeasurementsDataModel a() {
        return this.f120051d;
    }

    public final ProductLiteRemote b() {
        return this.f120048a;
    }

    public final String c() {
        return this.f120049b;
    }

    public final SalesLocationDataModel d() {
        return this.f120052e;
    }

    public final StockInfoDataModel e() {
        return this.f120050c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCardDataModel)) {
            return false;
        }
        ProductCardDataModel productCardDataModel = (ProductCardDataModel) obj;
        return C17542s.e(this.f120048a, productCardDataModel.f120048a) && C17542s.e(this.f120049b, productCardDataModel.f120049b) && C17542s.e(this.f120050c, productCardDataModel.f120050c) && C17542s.e(this.f120051d, productCardDataModel.f120051d) && C17542s.e(this.f120052e, productCardDataModel.f120052e);
    }

    public int hashCode() {
        ProductLiteRemote productLiteRemote = this.f120048a;
        int i10 = 0;
        int hashCode = (productLiteRemote == null ? 0 : productLiteRemote.hashCode()) * 31;
        String str = this.f120049b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        StockInfoDataModel stockInfoDataModel = this.f120050c;
        int hashCode3 = (hashCode2 + (stockInfoDataModel == null ? 0 : stockInfoDataModel.hashCode())) * 31;
        PackageMeasurementsDataModel packageMeasurementsDataModel = this.f120051d;
        int hashCode4 = (hashCode3 + (packageMeasurementsDataModel == null ? 0 : packageMeasurementsDataModel.hashCode())) * 31;
        SalesLocationDataModel salesLocationDataModel = this.f120052e;
        if (salesLocationDataModel != null) {
            i10 = salesLocationDataModel.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        ProductLiteRemote productLiteRemote = this.f120048a;
        String str = this.f120049b;
        StockInfoDataModel stockInfoDataModel = this.f120050c;
        PackageMeasurementsDataModel packageMeasurementsDataModel = this.f120051d;
        SalesLocationDataModel salesLocationDataModel = this.f120052e;
        return "ProductCardDataModel(product=" + productLiteRemote + ", productType=" + str + ", stock=" + stockInfoDataModel + ", packageMeasurements=" + packageMeasurementsDataModel + ", salesLocation=" + salesLocationDataModel + ")";
    }
}
