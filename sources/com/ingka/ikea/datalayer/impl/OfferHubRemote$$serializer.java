package com.ingka.ikea.datalayer.impl;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.CategoriesRemote;
import com.ingka.ikea.core.remotemodel.CategoriesRemote$$serializer;
import com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote;
import com.ingka.ikea.core.remotemodel.product.ProductCarouselRemote$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/datalayer/impl/OfferHubRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/datalayer/impl/OfferHubRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/datalayer/impl/OfferHubRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/datalayer/impl/OfferHubRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class OfferHubRemote$$serializer implements N<OfferHubRemote> {
    public static final OfferHubRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OfferHubRemote$$serializer offerHubRemote$$serializer = new OfferHubRemote$$serializer();
        INSTANCE = offerHubRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.datalayer.impl.OfferHubRemote", offerHubRemote$$serializer, 4);
        j02.p("categories", false);
        j02.p("recent", false);
        j02.p("expiringSoon", false);
        j02.p("lowestPrice", false);
        descriptor = j02;
    }

    private OfferHubRemote$$serializer() {
    }

    /* renamed from: b */
    public final OfferHubRemote deserialize(Decoder decoder) {
        ProductCarouselRemote productCarouselRemote;
        ProductCarouselRemote productCarouselRemote2;
        ProductCarouselRemote productCarouselRemote3;
        CategoriesRemote categoriesRemote;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        CategoriesRemote categoriesRemote2 = null;
        if (b10.q()) {
            ProductCarouselRemote$$serializer productCarouselRemote$$serializer = ProductCarouselRemote$$serializer.INSTANCE;
            categoriesRemote = (CategoriesRemote) b10.A(serialDescriptor, 0, CategoriesRemote$$serializer.INSTANCE, null);
            productCarouselRemote = (ProductCarouselRemote) b10.A(serialDescriptor, 3, productCarouselRemote$$serializer, null);
            productCarouselRemote2 = (ProductCarouselRemote) b10.A(serialDescriptor, 2, productCarouselRemote$$serializer, null);
            productCarouselRemote3 = (ProductCarouselRemote) b10.A(serialDescriptor, 1, productCarouselRemote$$serializer, null);
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            ProductCarouselRemote productCarouselRemote4 = null;
            ProductCarouselRemote productCarouselRemote5 = null;
            ProductCarouselRemote productCarouselRemote6 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    categoriesRemote2 = (CategoriesRemote) b10.A(serialDescriptor, 0, CategoriesRemote$$serializer.INSTANCE, categoriesRemote2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    productCarouselRemote4 = (ProductCarouselRemote) b10.A(serialDescriptor, 1, ProductCarouselRemote$$serializer.INSTANCE, productCarouselRemote4);
                    i11 |= 2;
                } else if (p10 == 2) {
                    productCarouselRemote5 = (ProductCarouselRemote) b10.A(serialDescriptor, 2, ProductCarouselRemote$$serializer.INSTANCE, productCarouselRemote5);
                    i11 |= 4;
                } else if (p10 == 3) {
                    productCarouselRemote6 = (ProductCarouselRemote) b10.A(serialDescriptor, 3, ProductCarouselRemote$$serializer.INSTANCE, productCarouselRemote6);
                    i11 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            categoriesRemote = categoriesRemote2;
            productCarouselRemote3 = productCarouselRemote4;
            productCarouselRemote2 = productCarouselRemote5;
            productCarouselRemote = productCarouselRemote6;
        }
        b10.c(serialDescriptor);
        return new OfferHubRemote(i10, categoriesRemote, productCarouselRemote3, productCarouselRemote2, productCarouselRemote, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, OfferHubRemote offerHubRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(offerHubRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        OfferHubRemote.b(offerHubRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(CategoriesRemote$$serializer.INSTANCE);
        ProductCarouselRemote$$serializer productCarouselRemote$$serializer = ProductCarouselRemote$$serializer.INSTANCE;
        return new KSerializer[]{u10, C17294a.u(productCarouselRemote$$serializer), C17294a.u(productCarouselRemote$$serializer), C17294a.u(productCarouselRemote$$serializer)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
