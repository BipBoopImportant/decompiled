package com.afterpay.android.internal;

import XH.C16814e;
import com.afterpay.android.internal.AfterpayCheckoutMessage;
import com.afterpay.android.model.ShippingOption$$serializer;
import fK.C17247E;
import iK.C17394c;
import iK.C17395d;
import jK.C17451f;
import jK.J0;
import jK.N;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/afterpay/android/internal/ShippingOptionsMessage.$serializer", "LjK/N;", "Lcom/afterpay/android/internal/ShippingOptionsMessage;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/afterpay/android/internal/ShippingOptionsMessage;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/afterpay/android/internal/ShippingOptionsMessage;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@C16814e
public final class ShippingOptionsMessage$$serializer implements N<ShippingOptionsMessage> {
    public static final ShippingOptionsMessage$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ShippingOptionsMessage$$serializer shippingOptionsMessage$$serializer = new ShippingOptionsMessage$$serializer();
        INSTANCE = shippingOptionsMessage$$serializer;
        J0 j02 = new J0("onShippingOptionsChange", shippingOptionsMessage$$serializer, 2);
        j02.p("meta", false);
        j02.p("payload", false);
        descriptor = j02;
    }

    private ShippingOptionsMessage$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta$$serializer.INSTANCE, new C17451f(ShippingOption$$serializer.INSTANCE)};
    }

    public ShippingOptionsMessage deserialize(Decoder decoder) {
        int i10;
        Object obj;
        Object obj2;
        C17542s.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder.b(descriptor2);
        if (b10.q()) {
            obj2 = b10.o(descriptor2, 0, AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta$$serializer.INSTANCE, null);
            obj = b10.o(descriptor2, 1, new C17451f(ShippingOption$$serializer.INSTANCE), null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            obj2 = null;
            Object obj3 = null;
            while (z10) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    obj2 = b10.o(descriptor2, 0, AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta$$serializer.INSTANCE, obj2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    obj3 = b10.o(descriptor2, 1, new C17451f(ShippingOption$$serializer.INSTANCE), obj3);
                    i11 |= 2;
                } else {
                    throw new C17247E(p10);
                }
            }
            obj = obj3;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new ShippingOptionsMessage(i10, (AfterpayCheckoutMessage.AfterpayCheckoutMessageMeta) obj2, (List) obj, (T0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ShippingOptionsMessage shippingOptionsMessage) {
        C17542s.j(encoder, "encoder");
        C17542s.j(shippingOptionsMessage, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ShippingOptionsMessage.d(shippingOptionsMessage, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
