package com.ingka.ikea.checkout.datalayer.impl.repo.network.model;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/checkout/datalayer/impl/repo/network/model/CheckoutStateRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/CheckoutStateRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/CheckoutStateRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/model/CheckoutStateRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class CheckoutStateRemote$$serializer implements N<CheckoutStateRemote> {
    public static final CheckoutStateRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CheckoutStateRemote$$serializer checkoutStateRemote$$serializer = new CheckoutStateRemote$$serializer();
        INSTANCE = checkoutStateRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.checkout.datalayer.impl.repo.network.model.CheckoutStateRemote", checkoutStateRemote$$serializer, 3);
        j02.p("orderTotal", false);
        j02.p("goodsTotal", false);
        j02.p("shippingPrice", false);
        descriptor = j02;
    }

    private CheckoutStateRemote$$serializer() {
    }

    /* renamed from: b */
    public final CheckoutStateRemote deserialize(Decoder decoder) {
        PriceResponse priceResponse;
        PriceResponse priceResponse2;
        PriceResponse priceResponse3;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        PriceResponse priceResponse4 = null;
        if (b10.q()) {
            PriceResponse$$serializer priceResponse$$serializer = PriceResponse$$serializer.INSTANCE;
            priceResponse = (PriceResponse) b10.A(serialDescriptor, 2, priceResponse$$serializer, null);
            i10 = 7;
            priceResponse2 = (PriceResponse) b10.A(serialDescriptor, 1, priceResponse$$serializer, null);
            priceResponse3 = (PriceResponse) b10.A(serialDescriptor, 0, priceResponse$$serializer, null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            PriceResponse priceResponse5 = null;
            PriceResponse priceResponse6 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    priceResponse4 = (PriceResponse) b10.A(serialDescriptor, 0, PriceResponse$$serializer.INSTANCE, priceResponse4);
                    i11 |= 1;
                } else if (p10 == 1) {
                    priceResponse5 = (PriceResponse) b10.A(serialDescriptor, 1, PriceResponse$$serializer.INSTANCE, priceResponse5);
                    i11 |= 2;
                } else if (p10 == 2) {
                    priceResponse6 = (PriceResponse) b10.A(serialDescriptor, 2, PriceResponse$$serializer.INSTANCE, priceResponse6);
                    i11 |= 4;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            priceResponse3 = priceResponse4;
            priceResponse2 = priceResponse5;
            priceResponse = priceResponse6;
        }
        b10.c(serialDescriptor);
        return new CheckoutStateRemote(i10, priceResponse3, priceResponse2, priceResponse, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, CheckoutStateRemote checkoutStateRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(checkoutStateRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        CheckoutStateRemote.b(checkoutStateRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        PriceResponse$$serializer priceResponse$$serializer = PriceResponse$$serializer.INSTANCE;
        return new KSerializer[]{C17294a.u(priceResponse$$serializer), C17294a.u(priceResponse$$serializer), C17294a.u(priceResponse$$serializer)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
