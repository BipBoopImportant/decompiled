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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/afterpay/android/model/ShippingAddress.$serializer", "LjK/N;", "Lcom/afterpay/android/model/ShippingAddress;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/afterpay/android/model/ShippingAddress;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/afterpay/android/model/ShippingAddress;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@C16814e
public final class ShippingAddress$$serializer implements N<ShippingAddress> {
    public static final ShippingAddress$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ShippingAddress$$serializer shippingAddress$$serializer = new ShippingAddress$$serializer();
        INSTANCE = shippingAddress$$serializer;
        J0 j02 = new J0("com.afterpay.android.model.ShippingAddress", shippingAddress$$serializer, 8);
        j02.p("name", false);
        j02.p("address1", false);
        j02.p("address2", true);
        j02.p("countryCode", true);
        j02.p("postcode", false);
        j02.p("phoneNumber", true);
        j02.p("state", true);
        j02.p("suburb", true);
        descriptor = j02;
    }

    private ShippingAddress$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.afterpay.android.model.ShippingAddress deserialize(kotlinx.serialization.encoding.Decoder r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r17.getDescriptor()
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r2 == 0) goto L_0x0047
            jK.Y0 r2 = jK.Y0.f144077a
            java.lang.Object r10 = r0.A(r1, r10, r2, r11)
            java.lang.Object r9 = r0.A(r1, r9, r2, r11)
            java.lang.Object r8 = r0.A(r1, r8, r2, r11)
            java.lang.Object r6 = r0.A(r1, r6, r2, r11)
            java.lang.Object r7 = r0.A(r1, r7, r2, r11)
            java.lang.Object r5 = r0.A(r1, r5, r2, r11)
            java.lang.Object r4 = r0.A(r1, r4, r2, r11)
            java.lang.Object r2 = r0.A(r1, r3, r2, r11)
            r3 = 255(0xff, float:3.57E-43)
            r12 = r9
            r9 = r4
            r4 = r3
            goto L_0x00be
        L_0x0047:
            r16 = r9
            r2 = r10
            r8 = r11
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0051:
            if (r16 == 0) goto L_0x00b7
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00b3;
                case 0: goto L_0x00a8;
                case 1: goto L_0x009d;
                case 2: goto L_0x0091;
                case 3: goto L_0x0085;
                case 4: goto L_0x007c;
                case 5: goto L_0x0073;
                case 6: goto L_0x006a;
                case 7: goto L_0x0060;
                default: goto L_0x005a;
            }
        L_0x005a:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x0060:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r3, r6, r8)
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x0068:
            r6 = 3
            goto L_0x0051
        L_0x006a:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r4, r6, r9)
            r2 = r2 | 64
            goto L_0x0068
        L_0x0073:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r10 = r0.A(r1, r5, r6, r10)
            r2 = r2 | 32
            goto L_0x0068
        L_0x007c:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r15 = r0.A(r1, r7, r6, r15)
            r2 = r2 | 16
            goto L_0x0068
        L_0x0085:
            jK.Y0 r6 = jK.Y0.f144077a
            r3 = 3
            java.lang.Object r14 = r0.A(r1, r3, r6, r14)
            r2 = r2 | 8
            r6 = r3
            r3 = 7
            goto L_0x0051
        L_0x0091:
            r3 = 3
            jK.Y0 r6 = jK.Y0.f144077a
            r3 = 2
            java.lang.Object r13 = r0.A(r1, r3, r6, r13)
            r2 = r2 | 4
        L_0x009b:
            r3 = 7
            goto L_0x0068
        L_0x009d:
            r3 = 2
            jK.Y0 r6 = jK.Y0.f144077a
            r3 = 1
            java.lang.Object r12 = r0.A(r1, r3, r6, r12)
            r2 = r2 | 2
            goto L_0x009b
        L_0x00a8:
            r3 = 1
            jK.Y0 r6 = jK.Y0.f144077a
            r3 = 0
            java.lang.Object r11 = r0.A(r1, r3, r6, r11)
            r2 = r2 | 1
            goto L_0x009b
        L_0x00b3:
            r3 = 0
            r16 = r3
            goto L_0x009b
        L_0x00b7:
            r4 = r2
            r2 = r8
            r5 = r10
            r10 = r11
            r8 = r13
            r6 = r14
            r7 = r15
        L_0x00be:
            r0.c(r1)
            com.afterpay.android.model.ShippingAddress r0 = new com.afterpay.android.model.ShippingAddress
            r1 = r10
            java.lang.String r1 = (java.lang.String) r1
            r10 = r12
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r8 = (java.lang.String) r8
            r11 = r6
            java.lang.String r11 = (java.lang.String) r11
            r12 = r7
            java.lang.String r12 = (java.lang.String) r12
            r13 = r5
            java.lang.String r13 = (java.lang.String) r13
            r14 = r9
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r2 = (java.lang.String) r2
            r15 = 0
            r3 = r0
            r5 = r1
            r6 = r10
            r7 = r8
            r8 = r11
            r9 = r12
            r10 = r13
            r11 = r14
            r12 = r2
            r13 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afterpay.android.model.ShippingAddress$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.afterpay.android.model.ShippingAddress");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, ShippingAddress shippingAddress) {
        C17542s.j(encoder, "encoder");
        C17542s.j(shippingAddress, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ShippingAddress.a(shippingAddress, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
