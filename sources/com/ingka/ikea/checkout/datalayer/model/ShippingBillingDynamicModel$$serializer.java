package com.ingka.ikea.checkout.datalayer.model;

import XH.C16814e;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration$$serializer;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/checkout/datalayer/model/ShippingBillingDynamicModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ShippingBillingDynamicModel$$serializer implements N<ShippingBillingDynamicModel> {
    public static final ShippingBillingDynamicModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ShippingBillingDynamicModel$$serializer shippingBillingDynamicModel$$serializer = new ShippingBillingDynamicModel$$serializer();
        INSTANCE = shippingBillingDynamicModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.checkout.datalayer.model.ShippingBillingDynamicModel", shippingBillingDynamicModel$$serializer, 5);
        j02.p("primary", false);
        j02.p("secondary", false);
        j02.p("contact", false);
        j02.p("terms", false);
        j02.p("overrideInputValues", true);
        descriptor = j02;
    }

    private ShippingBillingDynamicModel$$serializer() {
    }

    /* renamed from: b */
    public final ShippingBillingDynamicModel deserialize(Decoder decoder) {
        boolean z10;
        DynamicFields$Configuration dynamicFields$Configuration;
        DynamicFields$Configuration dynamicFields$Configuration2;
        DynamicFields$Configuration dynamicFields$Configuration3;
        DynamicFields$Configuration dynamicFields$Configuration4;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        if (b10.q()) {
            DynamicFields$Configuration$$serializer dynamicFields$Configuration$$serializer = DynamicFields$Configuration$$serializer.INSTANCE;
            dynamicFields$Configuration = (DynamicFields$Configuration) b10.o(serialDescriptor, 3, dynamicFields$Configuration$$serializer, null);
            z10 = b10.D(serialDescriptor, 4);
            i10 = 31;
            dynamicFields$Configuration2 = (DynamicFields$Configuration) b10.o(serialDescriptor, 2, dynamicFields$Configuration$$serializer, null);
            dynamicFields$Configuration3 = (DynamicFields$Configuration) b10.A(serialDescriptor, 1, dynamicFields$Configuration$$serializer, null);
            dynamicFields$Configuration4 = (DynamicFields$Configuration) b10.o(serialDescriptor, 0, dynamicFields$Configuration$$serializer, null);
        } else {
            boolean z11 = true;
            boolean z12 = false;
            DynamicFields$Configuration dynamicFields$Configuration5 = null;
            DynamicFields$Configuration dynamicFields$Configuration6 = null;
            DynamicFields$Configuration dynamicFields$Configuration7 = null;
            DynamicFields$Configuration dynamicFields$Configuration8 = null;
            int i11 = 0;
            while (z11) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z11 = false;
                } else if (p10 == 0) {
                    dynamicFields$Configuration5 = (DynamicFields$Configuration) b10.o(serialDescriptor, 0, DynamicFields$Configuration$$serializer.INSTANCE, dynamicFields$Configuration5);
                    i11 |= 1;
                } else if (p10 == 1) {
                    dynamicFields$Configuration6 = (DynamicFields$Configuration) b10.A(serialDescriptor, 1, DynamicFields$Configuration$$serializer.INSTANCE, dynamicFields$Configuration6);
                    i11 |= 2;
                } else if (p10 == 2) {
                    dynamicFields$Configuration7 = (DynamicFields$Configuration) b10.o(serialDescriptor, 2, DynamicFields$Configuration$$serializer.INSTANCE, dynamicFields$Configuration7);
                    i11 |= 4;
                } else if (p10 == 3) {
                    dynamicFields$Configuration8 = (DynamicFields$Configuration) b10.o(serialDescriptor, 3, DynamicFields$Configuration$$serializer.INSTANCE, dynamicFields$Configuration8);
                    i11 |= 8;
                } else if (p10 == 4) {
                    z12 = b10.D(serialDescriptor, 4);
                    i11 |= 16;
                } else {
                    throw new C17247E(p10);
                }
            }
            z10 = z12;
            i10 = i11;
            dynamicFields$Configuration4 = dynamicFields$Configuration5;
            dynamicFields$Configuration3 = dynamicFields$Configuration6;
            dynamicFields$Configuration2 = dynamicFields$Configuration7;
            dynamicFields$Configuration = dynamicFields$Configuration8;
        }
        b10.c(serialDescriptor);
        return new ShippingBillingDynamicModel(i10, dynamicFields$Configuration4, dynamicFields$Configuration3, dynamicFields$Configuration2, dynamicFields$Configuration, z10, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ShippingBillingDynamicModel shippingBillingDynamicModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(shippingBillingDynamicModel, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ShippingBillingDynamicModel.f(shippingBillingDynamicModel, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        DynamicFields$Configuration$$serializer dynamicFields$Configuration$$serializer = DynamicFields$Configuration$$serializer.INSTANCE;
        return new KSerializer[]{dynamicFields$Configuration$$serializer, C17294a.u(dynamicFields$Configuration$$serializer), dynamicFields$Configuration$$serializer, dynamicFields$Configuration$$serializer, C17457i.f144111a};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
