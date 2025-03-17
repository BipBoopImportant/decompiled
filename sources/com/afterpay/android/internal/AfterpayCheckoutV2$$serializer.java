package com.afterpay.android.internal;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/afterpay/android/internal/AfterpayCheckoutV2.$serializer", "LjK/N;", "Lcom/afterpay/android/internal/AfterpayCheckoutV2;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/afterpay/android/internal/AfterpayCheckoutV2;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/afterpay/android/internal/AfterpayCheckoutV2;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@C16814e
public final class AfterpayCheckoutV2$$serializer implements N<AfterpayCheckoutV2> {
    public static final AfterpayCheckoutV2$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AfterpayCheckoutV2$$serializer afterpayCheckoutV2$$serializer = new AfterpayCheckoutV2$$serializer();
        INSTANCE = afterpayCheckoutV2$$serializer;
        J0 j02 = new J0("com.afterpay.android.internal.AfterpayCheckoutV2", afterpayCheckoutV2$$serializer, 9);
        j02.p("token", false);
        j02.p("locale", false);
        j02.p("environment", false);
        j02.p("version", false);
        j02.p("pickup", false);
        j02.p("buyNow", false);
        j02.p("shippingOptionRequired", false);
        j02.p("checkoutRedesignForced", false);
        j02.p("consumerLocale", false);
        descriptor = j02;
    }

    private AfterpayCheckoutV2$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{y02, y02, y02, y02, C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(y02)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.afterpay.android.internal.AfterpayCheckoutV2 deserialize(kotlinx.serialization.encoding.Decoder r33) {
        /*
            r32 = this;
            r0 = r33
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r32.getDescriptor()
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 8
            r8 = 4
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 0
            if (r2 == 0) goto L_0x0056
            java.lang.String r2 = r0.n(r1, r11)
            java.lang.String r10 = r0.n(r1, r10)
            java.lang.String r9 = r0.n(r1, r9)
            java.lang.String r6 = r0.n(r1, r6)
            jK.i r11 = jK.C17457i.f144111a
            java.lang.Object r8 = r0.A(r1, r8, r11, r12)
            java.lang.Object r5 = r0.A(r1, r5, r11, r12)
            java.lang.Object r4 = r0.A(r1, r4, r11, r12)
            java.lang.Object r3 = r0.A(r1, r3, r11, r12)
            jK.Y0 r11 = jK.Y0.f144077a
            java.lang.Object r7 = r0.A(r1, r7, r11, r12)
            r11 = 511(0x1ff, float:7.16E-43)
            r22 = r2
            r25 = r6
            r24 = r9
            r23 = r10
            r21 = r11
            goto L_0x00f0
        L_0x0056:
            r19 = r10
            r2 = r11
            r6 = r12
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x0061:
            if (r19 == 0) goto L_0x00e1
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x00d7;
                case 0: goto L_0x00c7;
                case 1: goto L_0x00b9;
                case 2: goto L_0x00ad;
                case 3: goto L_0x00a4;
                case 4: goto L_0x0098;
                case 5: goto L_0x008c;
                case 6: goto L_0x0083;
                case 7: goto L_0x007a;
                case 8: goto L_0x0070;
                default: goto L_0x006a;
            }
        L_0x006a:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x0070:
            jK.Y0 r5 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r7, r5, r8)
            r2 = r2 | 256(0x100, float:3.59E-43)
        L_0x0078:
            r5 = 5
            goto L_0x0061
        L_0x007a:
            jK.i r5 = jK.C17457i.f144111a
            java.lang.Object r6 = r0.A(r1, r3, r5, r6)
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x0078
        L_0x0083:
            jK.i r5 = jK.C17457i.f144111a
            java.lang.Object r9 = r0.A(r1, r4, r5, r9)
            r2 = r2 | 64
            goto L_0x0078
        L_0x008c:
            jK.i r5 = jK.C17457i.f144111a
            r3 = 5
            java.lang.Object r10 = r0.A(r1, r3, r5, r10)
            r2 = r2 | 32
            r5 = r3
            r3 = 7
            goto L_0x0061
        L_0x0098:
            r3 = 5
            jK.i r5 = jK.C17457i.f144111a
            r3 = 4
            java.lang.Object r11 = r0.A(r1, r3, r5, r11)
            r2 = r2 | 16
        L_0x00a2:
            r3 = 7
            goto L_0x0078
        L_0x00a4:
            r3 = 4
            r5 = 3
            java.lang.String r15 = r0.n(r1, r5)
            r2 = r2 | 8
            goto L_0x00a2
        L_0x00ad:
            r3 = 4
            r5 = 3
            r14 = 2
            java.lang.String r17 = r0.n(r1, r14)
            r2 = r2 | 4
            r14 = r17
            goto L_0x00a2
        L_0x00b9:
            r3 = 4
            r5 = 3
            r13 = 1
            r16 = 2
            java.lang.String r17 = r0.n(r1, r13)
            r2 = r2 | 2
            r13 = r17
            goto L_0x00a2
        L_0x00c7:
            r3 = 4
            r5 = 3
            r12 = 0
            r16 = 2
            r17 = 1
            java.lang.String r18 = r0.n(r1, r12)
            r2 = r2 | 1
            r12 = r18
            goto L_0x00a2
        L_0x00d7:
            r5 = 3
            r16 = 2
            r17 = 1
            r18 = 0
            r19 = r18
            goto L_0x0078
        L_0x00e1:
            r21 = r2
            r3 = r6
            r7 = r8
            r4 = r9
            r5 = r10
            r8 = r11
            r22 = r12
            r23 = r13
            r24 = r14
            r25 = r15
        L_0x00f0:
            r0.c(r1)
            com.afterpay.android.internal.AfterpayCheckoutV2 r0 = new com.afterpay.android.internal.AfterpayCheckoutV2
            r26 = r8
            java.lang.Boolean r26 = (java.lang.Boolean) r26
            r27 = r5
            java.lang.Boolean r27 = (java.lang.Boolean) r27
            r28 = r4
            java.lang.Boolean r28 = (java.lang.Boolean) r28
            r29 = r3
            java.lang.Boolean r29 = (java.lang.Boolean) r29
            r30 = r7
            java.lang.String r30 = (java.lang.String) r30
            r31 = 0
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afterpay.android.internal.AfterpayCheckoutV2$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.afterpay.android.internal.AfterpayCheckoutV2");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, AfterpayCheckoutV2 afterpayCheckoutV2) {
        C17542s.j(encoder, "encoder");
        C17542s.j(afterpayCheckoutV2, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        AfterpayCheckoutV2.a(afterpayCheckoutV2, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
