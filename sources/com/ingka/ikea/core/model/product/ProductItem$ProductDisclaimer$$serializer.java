package com.ingka.ikea.core.model.product;

import XH.C16814e;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Image$$serializer;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.model.product.ProductItem;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/model/product/ProductItem.ProductDisclaimer.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/model/product/ProductItem$ProductDisclaimer;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ProductItem$ProductDisclaimer$$serializer implements N<ProductItem.ProductDisclaimer> {
    public static final ProductItem$ProductDisclaimer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductItem$ProductDisclaimer$$serializer productItem$ProductDisclaimer$$serializer = new ProductItem$ProductDisclaimer$$serializer();
        INSTANCE = productItem$ProductDisclaimer$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.model.product.ProductItem.ProductDisclaimer", productItem$ProductDisclaimer$$serializer, 4);
        j02.p("text", false);
        j02.p("image", true);
        j02.p("type", false);
        j02.p("link", true);
        descriptor = j02;
    }

    private ProductItem$ProductDisclaimer$$serializer() {
    }

    /* renamed from: b */
    public final ProductItem.ProductDisclaimer deserialize(Decoder decoder) {
        Link link;
        ProductItem.ProductDisclaimer.c cVar;
        Image image;
        String str;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        KSerializer[] a10 = ProductItem.ProductDisclaimer.f95104e;
        String str2 = null;
        if (b10.q()) {
            String n10 = b10.n(serialDescriptor, 0);
            link = (Link) b10.A(serialDescriptor, 3, a10[3], null);
            str = n10;
            i10 = 15;
            cVar = (ProductItem.ProductDisclaimer.c) b10.o(serialDescriptor, 2, a10[2], null);
            image = (Image) b10.A(serialDescriptor, 1, Image$$serializer.INSTANCE, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            Image image2 = null;
            ProductItem.ProductDisclaimer.c cVar2 = null;
            Link link2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str2 = b10.n(serialDescriptor, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    image2 = (Image) b10.A(serialDescriptor, 1, Image$$serializer.INSTANCE, image2);
                    i11 |= 2;
                } else if (p10 == 2) {
                    cVar2 = (ProductItem.ProductDisclaimer.c) b10.o(serialDescriptor, 2, a10[2], cVar2);
                    i11 |= 4;
                } else if (p10 == 3) {
                    link2 = (Link) b10.A(serialDescriptor, 3, a10[3], link2);
                    i11 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            str = str2;
            image = image2;
            cVar = cVar2;
            link = link2;
        }
        b10.c(serialDescriptor);
        return new ProductItem.ProductDisclaimer(i10, str, image, cVar, link, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ProductItem.ProductDisclaimer productDisclaimer) {
        C17542s.j(encoder, "encoder");
        C17542s.j(productDisclaimer, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ProductItem.ProductDisclaimer.f(productDisclaimer, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = ProductItem.ProductDisclaimer.f95104e;
        return new KSerializer[]{Y0.f144077a, C17294a.u(Image$$serializer.INSTANCE), a10[2], C17294a.u(a10[3])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
