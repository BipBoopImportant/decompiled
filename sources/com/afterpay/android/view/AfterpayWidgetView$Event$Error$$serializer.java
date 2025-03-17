package com.afterpay.android.view;

import XH.C16814e;
import com.afterpay.android.view.AfterpayWidgetView$Event;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/afterpay/android/view/AfterpayWidgetView.Event.Error.$serializer", "LjK/N;", "Lcom/afterpay/android/view/AfterpayWidgetView$Event$Error;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/afterpay/android/view/AfterpayWidgetView$Event$Error;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/afterpay/android/view/AfterpayWidgetView$Event$Error;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@C16814e
public final class AfterpayWidgetView$Event$Error$$serializer implements N<AfterpayWidgetView$Event.Error> {
    public static final AfterpayWidgetView$Event$Error$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AfterpayWidgetView$Event$Error$$serializer afterpayWidgetView$Event$Error$$serializer = new AfterpayWidgetView$Event$Error$$serializer();
        INSTANCE = afterpayWidgetView$Event$Error$$serializer;
        J0 j02 = new J0("com.afterpay.android.view.AfterpayWidgetView.Event.Error", afterpayWidgetView$Event$Error$$serializer, 4);
        j02.p("errorCode", true);
        j02.p("errorId", true);
        j02.p("message", true);
        j02.p("httpStatusCode", true);
        descriptor = j02;
    }

    private AfterpayWidgetView$Event$Error$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(X.f144073a)};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.afterpay.android.view.AfterpayWidgetView$Event.Error deserialize(kotlinx.serialization.encoding.Decoder r14) {
        /*
            r13 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r13.getDescriptor()
            iK.c r14 = r14.b(r0)
            boolean r1 = r14.q()
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L_0x0031
            jK.Y0 r1 = jK.Y0.f144077a
            java.lang.Object r5 = r14.A(r0, r5, r1, r6)
            java.lang.Object r4 = r14.A(r0, r4, r1, r6)
            java.lang.Object r1 = r14.A(r0, r3, r1, r6)
            jK.X r3 = jK.X.f144073a
            java.lang.Object r2 = r14.A(r0, r2, r3, r6)
            r3 = 15
            r7 = r4
            r4 = r3
            goto L_0x0077
        L_0x0031:
            r10 = r4
            r1 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0036:
            if (r10 == 0) goto L_0x0073
            int r11 = r14.p(r0)
            r12 = -1
            if (r11 == r12) goto L_0x0071
            if (r11 == 0) goto L_0x0068
            if (r11 == r4) goto L_0x005f
            if (r11 == r3) goto L_0x0056
            if (r11 != r2) goto L_0x0050
            jK.X r11 = jK.X.f144073a
            java.lang.Object r9 = r14.A(r0, r2, r11, r9)
            r1 = r1 | 8
            goto L_0x0036
        L_0x0050:
            fK.E r14 = new fK.E
            r14.<init>((int) r11)
            throw r14
        L_0x0056:
            jK.Y0 r11 = jK.Y0.f144077a
            java.lang.Object r8 = r14.A(r0, r3, r11, r8)
            r1 = r1 | 4
            goto L_0x0036
        L_0x005f:
            jK.Y0 r11 = jK.Y0.f144077a
            java.lang.Object r7 = r14.A(r0, r4, r11, r7)
            r1 = r1 | 2
            goto L_0x0036
        L_0x0068:
            jK.Y0 r11 = jK.Y0.f144077a
            java.lang.Object r6 = r14.A(r0, r5, r11, r6)
            r1 = r1 | 1
            goto L_0x0036
        L_0x0071:
            r10 = r5
            goto L_0x0036
        L_0x0073:
            r4 = r1
            r5 = r6
            r1 = r8
            r2 = r9
        L_0x0077:
            r14.c(r0)
            com.afterpay.android.view.AfterpayWidgetView$Event$Error r14 = new com.afterpay.android.view.AfterpayWidgetView$Event$Error
            java.lang.String r5 = (java.lang.String) r5
            r6 = r7
            java.lang.String r6 = (java.lang.String) r6
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            r8 = r2
            java.lang.Integer r8 = (java.lang.Integer) r8
            r9 = 0
            r3 = r14
            r3.<init>((int) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.Integer) r8, (jK.T0) r9)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afterpay.android.view.AfterpayWidgetView$Event$Error$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.afterpay.android.view.AfterpayWidgetView$Event$Error");
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public void serialize(Encoder encoder, AfterpayWidgetView$Event.Error error) {
        C17542s.j(encoder, "encoder");
        C17542s.j(error, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        AfterpayWidgetView$Event.Error.a(error, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
