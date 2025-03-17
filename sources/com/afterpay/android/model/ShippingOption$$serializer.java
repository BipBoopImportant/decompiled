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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/afterpay/android/model/ShippingOption.$serializer", "LjK/N;", "Lcom/afterpay/android/model/ShippingOption;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/afterpay/android/model/ShippingOption;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/afterpay/android/model/ShippingOption;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@C16814e
public final class ShippingOption$$serializer implements N<ShippingOption> {
    public static final ShippingOption$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ShippingOption$$serializer shippingOption$$serializer = new ShippingOption$$serializer();
        INSTANCE = shippingOption$$serializer;
        J0 j02 = new J0("com.afterpay.android.model.ShippingOption", shippingOption$$serializer, 6);
        j02.p("id", false);
        j02.p("name", false);
        j02.p("description", false);
        j02.p("shippingAmount", false);
        j02.p("orderAmount", false);
        j02.p("taxAmount", false);
        descriptor = j02;
    }

    private ShippingOption$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        Money$$serializer money$$serializer = Money$$serializer.INSTANCE;
        KSerializer<?> u10 = C17294a.u(money$$serializer);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, money$$serializer, money$$serializer, u10};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.afterpay.android.model.ShippingOption deserialize(kotlinx.serialization.encoding.Decoder r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r25.getDescriptor()
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r2 == 0) goto L_0x0042
            java.lang.String r2 = r0.n(r1, r8)
            java.lang.String r7 = r0.n(r1, r7)
            java.lang.String r6 = r0.n(r1, r6)
            com.afterpay.android.model.Money$$serializer r8 = com.afterpay.android.model.Money$$serializer.INSTANCE
            java.lang.Object r4 = r0.o(r1, r4, r8, r9)
            java.lang.Object r5 = r0.o(r1, r5, r8, r9)
            java.lang.Object r3 = r0.A(r1, r3, r8, r9)
            r8 = 63
            r18 = r2
            r20 = r6
            r19 = r7
            r17 = r8
            goto L_0x0098
        L_0x0042:
            r15 = r7
            r2 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x0049:
            if (r15 == 0) goto L_0x008d
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x008a;
                case 0: goto L_0x0082;
                case 1: goto L_0x007b;
                case 2: goto L_0x0074;
                case 3: goto L_0x006b;
                case 4: goto L_0x0062;
                case 5: goto L_0x0058;
                default: goto L_0x0052;
            }
        L_0x0052:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x0058:
            com.afterpay.android.model.Money$$serializer r8 = com.afterpay.android.model.Money$$serializer.INSTANCE
            java.lang.Object r14 = r0.A(r1, r3, r8, r14)
            r2 = r2 | 32
        L_0x0060:
            r8 = 0
            goto L_0x0049
        L_0x0062:
            com.afterpay.android.model.Money$$serializer r8 = com.afterpay.android.model.Money$$serializer.INSTANCE
            java.lang.Object r13 = r0.o(r1, r5, r8, r13)
            r2 = r2 | 16
            goto L_0x0060
        L_0x006b:
            com.afterpay.android.model.Money$$serializer r8 = com.afterpay.android.model.Money$$serializer.INSTANCE
            java.lang.Object r12 = r0.o(r1, r4, r8, r12)
            r2 = r2 | 8
            goto L_0x0060
        L_0x0074:
            java.lang.String r11 = r0.n(r1, r6)
            r2 = r2 | 4
            goto L_0x0060
        L_0x007b:
            java.lang.String r10 = r0.n(r1, r7)
            r2 = r2 | 2
            goto L_0x0060
        L_0x0082:
            r8 = 0
            java.lang.String r9 = r0.n(r1, r8)
            r2 = r2 | 1
            goto L_0x0049
        L_0x008a:
            r8 = 0
            r15 = r8
            goto L_0x0049
        L_0x008d:
            r17 = r2
            r18 = r9
            r19 = r10
            r20 = r11
            r4 = r12
            r5 = r13
            r3 = r14
        L_0x0098:
            r0.c(r1)
            com.afterpay.android.model.ShippingOption r0 = new com.afterpay.android.model.ShippingOption
            r21 = r4
            com.afterpay.android.model.Money r21 = (com.afterpay.android.model.Money) r21
            r22 = r5
            com.afterpay.android.model.Money r22 = (com.afterpay.android.model.Money) r22
            r23 = r3
            com.afterpay.android.model.Money r23 = (com.afterpay.android.model.Money) r23
            r24 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afterpay.android.model.ShippingOption$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.afterpay.android.model.ShippingOption");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ShippingOption shippingOption) {
        C17542s.j(encoder, "encoder");
        C17542s.j(shippingOption, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ShippingOption.a(shippingOption, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
