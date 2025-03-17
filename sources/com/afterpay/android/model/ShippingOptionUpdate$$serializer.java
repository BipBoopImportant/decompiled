package com.afterpay.android.model;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/afterpay/android/model/ShippingOptionUpdate.$serializer", "LjK/N;", "Lcom/afterpay/android/model/ShippingOptionUpdate;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/afterpay/android/model/ShippingOptionUpdate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/afterpay/android/model/ShippingOptionUpdate;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@C16814e
public final class ShippingOptionUpdate$$serializer implements N<ShippingOptionUpdate> {
    public static final ShippingOptionUpdate$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ShippingOptionUpdate$$serializer shippingOptionUpdate$$serializer = new ShippingOptionUpdate$$serializer();
        INSTANCE = shippingOptionUpdate$$serializer;
        J0 j02 = new J0("com.afterpay.android.model.ShippingOptionUpdate", shippingOptionUpdate$$serializer, 4);
        j02.p("id", false);
        j02.p("shippingAmount", false);
        j02.p("orderAmount", false);
        j02.p("taxAmount", false);
        descriptor = j02;
    }

    private ShippingOptionUpdate$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        Money$$serializer money$$serializer = Money$$serializer.INSTANCE;
        return new KSerializer[]{Y0.f144077a, money$$serializer, money$$serializer, C17294a.u(money$$serializer)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.afterpay.android.model.ShippingOptionUpdate deserialize(kotlinx.serialization.encoding.Decoder r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r19.getDescriptor()
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L_0x0031
            java.lang.String r2 = r0.n(r1, r6)
            com.afterpay.android.model.Money$$serializer r6 = com.afterpay.android.model.Money$$serializer.INSTANCE
            java.lang.Object r5 = r0.o(r1, r5, r6, r7)
            java.lang.Object r4 = r0.o(r1, r4, r6, r7)
            java.lang.Object r3 = r0.A(r1, r3, r6, r7)
            r6 = 15
            r14 = r2
            r13 = r6
            goto L_0x0076
        L_0x0031:
            r11 = r5
            r2 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x0036:
            if (r11 == 0) goto L_0x0071
            int r12 = r0.p(r1)
            r13 = -1
            if (r12 == r13) goto L_0x006f
            if (r12 == 0) goto L_0x0068
            if (r12 == r5) goto L_0x005f
            if (r12 == r4) goto L_0x0056
            if (r12 != r3) goto L_0x0050
            com.afterpay.android.model.Money$$serializer r12 = com.afterpay.android.model.Money$$serializer.INSTANCE
            java.lang.Object r10 = r0.A(r1, r3, r12, r10)
            r2 = r2 | 8
            goto L_0x0036
        L_0x0050:
            fK.E r0 = new fK.E
            r0.<init>((int) r12)
            throw r0
        L_0x0056:
            com.afterpay.android.model.Money$$serializer r12 = com.afterpay.android.model.Money$$serializer.INSTANCE
            java.lang.Object r9 = r0.o(r1, r4, r12, r9)
            r2 = r2 | 4
            goto L_0x0036
        L_0x005f:
            com.afterpay.android.model.Money$$serializer r12 = com.afterpay.android.model.Money$$serializer.INSTANCE
            java.lang.Object r8 = r0.o(r1, r5, r12, r8)
            r2 = r2 | 2
            goto L_0x0036
        L_0x0068:
            java.lang.String r7 = r0.n(r1, r6)
            r2 = r2 | 1
            goto L_0x0036
        L_0x006f:
            r11 = r6
            goto L_0x0036
        L_0x0071:
            r13 = r2
            r14 = r7
            r5 = r8
            r4 = r9
            r3 = r10
        L_0x0076:
            r0.c(r1)
            com.afterpay.android.model.ShippingOptionUpdate r0 = new com.afterpay.android.model.ShippingOptionUpdate
            r15 = r5
            com.afterpay.android.model.Money r15 = (com.afterpay.android.model.Money) r15
            r16 = r4
            com.afterpay.android.model.Money r16 = (com.afterpay.android.model.Money) r16
            r17 = r3
            com.afterpay.android.model.Money r17 = (com.afterpay.android.model.Money) r17
            r18 = 0
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afterpay.android.model.ShippingOptionUpdate$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.afterpay.android.model.ShippingOptionUpdate");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ShippingOptionUpdate shippingOptionUpdate) {
        C17542s.j(encoder, "encoder");
        C17542s.j(shippingOptionUpdate, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ShippingOptionUpdate.a(shippingOptionUpdate, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
