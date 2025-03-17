package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ProductCardDataModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ProductCardDataModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ProductCardDataModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ProductCardDataModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ProductCardDataModel$$serializer implements N<ProductCardDataModel> {
    public static final ProductCardDataModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductCardDataModel$$serializer productCardDataModel$$serializer = new ProductCardDataModel$$serializer();
        INSTANCE = productCardDataModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ProductCardDataModel", productCardDataModel$$serializer, 5);
        j02.p("product", true);
        j02.p("productType", false);
        j02.p("stockInfo", false);
        j02.p("packageMeasurements", false);
        j02.p("salesLocation", false);
        descriptor = j02;
    }

    private ProductCardDataModel$$serializer() {
    }

    /* renamed from: b */
    public final ProductCardDataModel deserialize(Decoder decoder) {
        SalesLocationDataModel salesLocationDataModel;
        PackageMeasurementsDataModel packageMeasurementsDataModel;
        StockInfoDataModel stockInfoDataModel;
        String str;
        ProductLiteRemote productLiteRemote;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        ProductLiteRemote productLiteRemote2 = null;
        if (b10.q()) {
            productLiteRemote = (ProductLiteRemote) b10.A(serialDescriptor, 0, ProductLiteRemote$$serializer.INSTANCE, null);
            packageMeasurementsDataModel = (PackageMeasurementsDataModel) b10.A(serialDescriptor, 3, PackageMeasurementsDataModel$$serializer.INSTANCE, null);
            salesLocationDataModel = (SalesLocationDataModel) b10.A(serialDescriptor, 4, SalesLocationDataModel$$serializer.INSTANCE, null);
            stockInfoDataModel = (StockInfoDataModel) b10.A(serialDescriptor, 2, StockInfoDataModel$$serializer.INSTANCE, null);
            str = (String) b10.A(serialDescriptor, 1, Y0.f144077a, null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            String str2 = null;
            StockInfoDataModel stockInfoDataModel2 = null;
            PackageMeasurementsDataModel packageMeasurementsDataModel2 = null;
            SalesLocationDataModel salesLocationDataModel2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    productLiteRemote2 = (ProductLiteRemote) b10.A(serialDescriptor, 0, ProductLiteRemote$$serializer.INSTANCE, productLiteRemote2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    str2 = (String) b10.A(serialDescriptor, 1, Y0.f144077a, str2);
                    i11 |= 2;
                } else if (p10 == 2) {
                    stockInfoDataModel2 = (StockInfoDataModel) b10.A(serialDescriptor, 2, StockInfoDataModel$$serializer.INSTANCE, stockInfoDataModel2);
                    i11 |= 4;
                } else if (p10 == 3) {
                    packageMeasurementsDataModel2 = (PackageMeasurementsDataModel) b10.A(serialDescriptor, 3, PackageMeasurementsDataModel$$serializer.INSTANCE, packageMeasurementsDataModel2);
                    i11 |= 8;
                } else if (p10 == 4) {
                    salesLocationDataModel2 = (SalesLocationDataModel) b10.A(serialDescriptor, 4, SalesLocationDataModel$$serializer.INSTANCE, salesLocationDataModel2);
                    i11 |= 16;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            productLiteRemote = productLiteRemote2;
            str = str2;
            stockInfoDataModel = stockInfoDataModel2;
            packageMeasurementsDataModel = packageMeasurementsDataModel2;
            salesLocationDataModel = salesLocationDataModel2;
        }
        b10.c(serialDescriptor);
        return new ProductCardDataModel(i10, productLiteRemote, str, stockInfoDataModel, packageMeasurementsDataModel, salesLocationDataModel, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ProductCardDataModel productCardDataModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(productCardDataModel, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ProductCardDataModel.f(productCardDataModel, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C17294a.u(ProductLiteRemote$$serializer.INSTANCE), C17294a.u(Y0.f144077a), C17294a.u(StockInfoDataModel$$serializer.INSTANCE), C17294a.u(PackageMeasurementsDataModel$$serializer.INSTANCE), C17294a.u(SalesLocationDataModel$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
