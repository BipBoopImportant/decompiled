package com.ingka.ikea.discover.impl;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/discover/impl/ProductRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/discover/impl/ProductRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/discover/impl/ProductRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/discover/impl/ProductRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ProductRemote$$serializer implements N<ProductRemote> {
    public static final ProductRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProductRemote$$serializer productRemote$$serializer = new ProductRemote$$serializer();
        INSTANCE = productRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.discover.impl.ProductRemote", productRemote$$serializer, 1);
        j02.p("productImage", false);
        descriptor = j02;
    }

    private ProductRemote$$serializer() {
    }

    /* renamed from: b */
    public final ProductRemote deserialize(Decoder decoder) {
        ImageRemote imageRemote;
        C17542s.j(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder.b(serialDescriptor);
        int i10 = 1;
        if (b10.q()) {
            imageRemote = (ImageRemote) b10.A(serialDescriptor, 0, ImageRemote$$serializer.INSTANCE, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            imageRemote = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    imageRemote = (ImageRemote) b10.A(serialDescriptor, 0, ImageRemote$$serializer.INSTANCE, imageRemote);
                    i11 = 1;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
        }
        b10.c(serialDescriptor);
        return new ProductRemote(i10, imageRemote, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ProductRemote productRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(productRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        b10.B(serialDescriptor, 0, ImageRemote$$serializer.INSTANCE, productRemote.f95535a);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C17294a.u(ImageRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
