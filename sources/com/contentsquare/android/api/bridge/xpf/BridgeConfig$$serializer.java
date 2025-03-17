package com.contentsquare.android.api.bridge.xpf;

import XH.C16814e;
import com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/contentsquare/android/api/bridge/xpf/BridgeConfig.$serializer", "LjK/N;", "Lcom/contentsquare/android/api/bridge/xpf/BridgeConfig;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/contentsquare/android/api/bridge/xpf/BridgeConfig;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/contentsquare/android/api/bridge/xpf/BridgeConfig;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class BridgeConfig$$serializer implements N<BridgeConfig> {
    public static final BridgeConfig$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        BridgeConfig$$serializer bridgeConfig$$serializer = new BridgeConfig$$serializer();
        INSTANCE = bridgeConfig$$serializer;
        J0 j02 = new J0("com.contentsquare.android.api.bridge.xpf.BridgeConfig", bridgeConfig$$serializer, 5);
        j02.p("crash_reporter_enabled", false);
        j02.p("api_errors_enabled", false);
        j02.p("tag_id", false);
        j02.p("feature_flags", false);
        j02.p("masking_rules", false);
        descriptor = j02;
    }

    private BridgeConfig$$serializer() {
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.contentsquare.android.api.bridge.xpf.BridgeConfig deserialize(kotlinx.serialization.encoding.Decoder r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r16.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.contentsquare.android.api.bridge.xpf.BridgeConfig.f46689f
            boolean r3 = r0.q()
            r4 = 4
            r5 = 2
            r6 = 3
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x003f
            boolean r3 = r0.D(r1, r8)
            boolean r7 = r0.D(r1, r7)
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r8, r9)
            r2 = r2[r6]
            java.lang.Object r2 = r0.o(r1, r6, r2, r9)
            com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules$$serializer r6 = com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r6, r9)
            r6 = 31
            r11 = r5
            r5 = r3
            goto L_0x0092
        L_0x003f:
            r14 = r7
            r3 = r8
            r10 = r3
            r11 = r9
            r12 = r11
            r13 = r12
            r9 = r10
        L_0x0046:
            if (r14 == 0) goto L_0x008d
            int r15 = r0.p(r1)
            r8 = -1
            if (r15 == r8) goto L_0x008a
            if (r15 == 0) goto L_0x0082
            if (r15 == r7) goto L_0x007b
            if (r15 == r5) goto L_0x0072
            if (r15 == r6) goto L_0x0069
            if (r15 != r4) goto L_0x0063
            com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules$$serializer r8 = com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules$$serializer.INSTANCE
            java.lang.Object r13 = r0.A(r1, r4, r8, r13)
            r9 = r9 | 16
        L_0x0061:
            r8 = 0
            goto L_0x0046
        L_0x0063:
            fK.E r0 = new fK.E
            r0.<init>((int) r15)
            throw r0
        L_0x0069:
            r8 = r2[r6]
            java.lang.Object r12 = r0.o(r1, r6, r8, r12)
            r9 = r9 | 8
            goto L_0x0061
        L_0x0072:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r11 = r0.A(r1, r5, r8, r11)
            r9 = r9 | 4
            goto L_0x0061
        L_0x007b:
            boolean r10 = r0.D(r1, r7)
            r9 = r9 | 2
            goto L_0x0061
        L_0x0082:
            r8 = 0
            boolean r3 = r0.D(r1, r8)
            r9 = r9 | 1
            goto L_0x0046
        L_0x008a:
            r8 = 0
            r14 = r8
            goto L_0x0046
        L_0x008d:
            r5 = r3
            r6 = r9
            r7 = r10
            r2 = r12
            r4 = r13
        L_0x0092:
            r0.c(r1)
            com.contentsquare.android.api.bridge.xpf.BridgeConfig r0 = new com.contentsquare.android.api.bridge.xpf.BridgeConfig
            r1 = r11
            java.lang.String r1 = (java.lang.String) r1
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            r9 = r4
            com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules r9 = (com.contentsquare.android.core.features.config.model.JsonConfig.MaskingRules) r9
            r10 = 0
            r3 = r0
            r4 = r6
            r6 = r7
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.api.bridge.xpf.BridgeConfig$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.contentsquare.android.api.bridge.xpf.BridgeConfig");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, BridgeConfig bridgeConfig) {
        C17542s.j(encoder, "encoder");
        C17542s.j(bridgeConfig, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        BridgeConfig.b(bridgeConfig, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = BridgeConfig.f46689f;
        KSerializer<?> u10 = C17294a.u(Y0.f144077a);
        KSerializer<?> kSerializer = a10[3];
        KSerializer<?> u11 = C17294a.u(JsonConfig$MaskingRules$$serializer.INSTANCE);
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{iVar, iVar, u10, kSerializer, u11};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
