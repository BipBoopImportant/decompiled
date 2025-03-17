package com.ingka.ikea.core.remotemodel.product;

import XH.C16814e;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/remotemodel/product/ProductWithCoordinatesRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/remotemodel/product/ProductWithCoordinatesRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/remotemodel/product/ProductWithCoordinatesRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/remotemodel/product/ProductWithCoordinatesRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ProductWithCoordinatesRemote$$serializer implements N<ProductWithCoordinatesRemote> {
    public static final ProductWithCoordinatesRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductWithCoordinatesRemote$$serializer productWithCoordinatesRemote$$serializer = new ProductWithCoordinatesRemote$$serializer();
        INSTANCE = productWithCoordinatesRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.remotemodel.product.ProductWithCoordinatesRemote", productWithCoordinatesRemote$$serializer, 2);
        j02.p("coordinates", false);
        j02.p("product", false);
        descriptor = j02;
    }

    private ProductWithCoordinatesRemote$$serializer() {
    }

    /* renamed from: b */
    public final ProductWithCoordinatesRemote deserialize(Decoder decoder) {
        int i10;
        ProductLiteRemote productLiteRemote;
        CoordinatesRemoteV6 coordinatesRemoteV6;
        C17542s.j(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder.b(serialDescriptor);
        if (b10.q()) {
            coordinatesRemoteV6 = (CoordinatesRemoteV6) b10.A(serialDescriptor, 0, CoordinatesRemoteV6$$serializer.INSTANCE, null);
            productLiteRemote = (ProductLiteRemote) b10.A(serialDescriptor, 1, ProductLiteRemote$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            coordinatesRemoteV6 = null;
            ProductLiteRemote productLiteRemote2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    coordinatesRemoteV6 = (CoordinatesRemoteV6) b10.A(serialDescriptor, 0, CoordinatesRemoteV6$$serializer.INSTANCE, coordinatesRemoteV6);
                    i11 |= 1;
                } else if (p10 == 1) {
                    productLiteRemote2 = (ProductLiteRemote) b10.A(serialDescriptor, 1, ProductLiteRemote$$serializer.INSTANCE, productLiteRemote2);
                    i11 |= 2;
                } else {
                    throw new C17247E(p10);
                }
            }
            productLiteRemote = productLiteRemote2;
            i10 = i11;
        }
        b10.c(serialDescriptor);
        return new ProductWithCoordinatesRemote(i10, coordinatesRemoteV6, productLiteRemote, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ProductWithCoordinatesRemote productWithCoordinatesRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(productWithCoordinatesRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ProductWithCoordinatesRemote.b(productWithCoordinatesRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C17294a.u(CoordinatesRemoteV6$$serializer.INSTANCE), C17294a.u(ProductLiteRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
