package com.afterpay.android.internal;

import XH.C16814e;
import com.afterpay.android.internal.AfterpayCheckoutMessage;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import fK.C17247E;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/afterpay/android/internal/CheckoutErrorMessage.$serializer", "LjK/N;", "Lcom/afterpay/android/internal/CheckoutErrorMessage;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/afterpay/android/internal/CheckoutErrorMessage;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/afterpay/android/internal/CheckoutErrorMessage;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@C16814e
public final class CheckoutErrorMessage$$serializer implements N<CheckoutErrorMessage> {
    public static final CheckoutErrorMessage$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CheckoutErrorMessage$$serializer checkoutErrorMessage$$serializer = new CheckoutErrorMessage$$serializer();
        INSTANCE = checkoutErrorMessage$$serializer;
        J0 j02 = new J0("onError", checkoutErrorMessage$$serializer, 2);
        j02.p("meta", false);
        j02.p(UiComponentContainer.RESULT_ERROR, false);
        descriptor = j02;
    }

    private CheckoutErrorMessage$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta$$serializer.INSTANCE, Y0.f144077a};
    }

    public CheckoutErrorMessage deserialize(Decoder decoder) {
        int i10;
        String str;
        Object obj;
        C17542s.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        C17394c b10 = decoder.b(descriptor2);
        if (b10.q()) {
            obj = b10.o(descriptor2, 0, AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta$$serializer.INSTANCE, null);
            str = b10.n(descriptor2, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            obj = null;
            String str2 = null;
            while (z10) {
                int p10 = b10.p(descriptor2);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    obj = b10.o(descriptor2, 0, AfterpayCheckoutMessage$AfterpayCheckoutMessageMeta$$serializer.INSTANCE, obj);
                    i11 |= 1;
                } else if (p10 == 1) {
                    str2 = b10.n(descriptor2, 1);
                    i11 |= 2;
                } else {
                    throw new C17247E(p10);
                }
            }
            str = str2;
            i10 = i11;
        }
        b10.c(descriptor2);
        return new CheckoutErrorMessage(i10, (AfterpayCheckoutMessage.AfterpayCheckoutMessageMeta) obj, str, (T0) null);
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, CheckoutErrorMessage checkoutErrorMessage) {
        C17542s.j(encoder, "encoder");
        C17542s.j(checkoutErrorMessage, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        CheckoutErrorMessage.d(checkoutErrorMessage, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
