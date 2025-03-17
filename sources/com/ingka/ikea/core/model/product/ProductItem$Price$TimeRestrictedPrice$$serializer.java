package com.ingka.ikea.core.model.product;

import XH.C16814e;
import com.ingka.ikea.core.model.product.ProductItem;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/model/product/ProductItem.Price.TimeRestrictedPrice.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$TimeRestrictedPrice;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/model/product/ProductItem$Price$TimeRestrictedPrice;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/model/product/ProductItem$Price$TimeRestrictedPrice;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ProductItem$Price$TimeRestrictedPrice$$serializer implements N<ProductItem.Price.TimeRestrictedPrice> {
    public static final ProductItem$Price$TimeRestrictedPrice$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductItem$Price$TimeRestrictedPrice$$serializer productItem$Price$TimeRestrictedPrice$$serializer = new ProductItem$Price$TimeRestrictedPrice$$serializer();
        INSTANCE = productItem$Price$TimeRestrictedPrice$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.model.product.ProductItem.Price.TimeRestrictedPrice", productItem$Price$TimeRestrictedPrice$$serializer, 2);
        j02.p("includingVat", false);
        j02.p("excludingVat", true);
        descriptor = j02;
    }

    private ProductItem$Price$TimeRestrictedPrice$$serializer() {
    }

    /* renamed from: b */
    public final ProductItem.Price.TimeRestrictedPrice deserialize(Decoder decoder) {
        ProductItem.Price.PriceTag priceTag;
        int i10;
        ProductItem.Price.PriceTag priceTag2;
        C17542s.j(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder.b(serialDescriptor);
        if (b10.q()) {
            ProductItem$Price$PriceTag$$serializer productItem$Price$PriceTag$$serializer = ProductItem$Price$PriceTag$$serializer.INSTANCE;
            priceTag = (ProductItem.Price.PriceTag) b10.o(serialDescriptor, 0, productItem$Price$PriceTag$$serializer, null);
            priceTag2 = (ProductItem.Price.PriceTag) b10.A(serialDescriptor, 1, productItem$Price$PriceTag$$serializer, null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            priceTag2 = null;
            ProductItem.Price.PriceTag priceTag3 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    priceTag3 = (ProductItem.Price.PriceTag) b10.o(serialDescriptor, 0, ProductItem$Price$PriceTag$$serializer.INSTANCE, priceTag3);
                    i11 |= 1;
                } else if (p10 == 1) {
                    priceTag2 = (ProductItem.Price.PriceTag) b10.A(serialDescriptor, 1, ProductItem$Price$PriceTag$$serializer.INSTANCE, priceTag2);
                    i11 |= 2;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            priceTag = priceTag3;
        }
        b10.c(serialDescriptor);
        return new ProductItem.Price.TimeRestrictedPrice(i10, priceTag, priceTag2, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ProductItem.Price.TimeRestrictedPrice timeRestrictedPrice) {
        C17542s.j(encoder, "encoder");
        C17542s.j(timeRestrictedPrice, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ProductItem.Price.TimeRestrictedPrice.g(timeRestrictedPrice, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        ProductItem$Price$PriceTag$$serializer productItem$Price$PriceTag$$serializer = ProductItem$Price$PriceTag$$serializer.INSTANCE;
        return new KSerializer[]{productItem$Price$PriceTag$$serializer, C17294a.u(productItem$Price$PriceTag$$serializer)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
