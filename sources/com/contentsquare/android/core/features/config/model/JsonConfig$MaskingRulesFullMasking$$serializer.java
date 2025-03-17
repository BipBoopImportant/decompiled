package com.contentsquare.android.core.features.config.model;

import XH.C16814e;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import iK.C17395d;
import jK.J0;
import jK.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/contentsquare/android/core/features/config/model/JsonConfig.MaskingRulesFullMasking.$serializer", "LjK/N;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRulesFullMasking;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRulesFullMasking;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/contentsquare/android/core/features/config/model/JsonConfig$MaskingRulesFullMasking;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class JsonConfig$MaskingRulesFullMasking$$serializer implements N<JsonConfig.MaskingRulesFullMasking> {
    public static final JsonConfig$MaskingRulesFullMasking$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        JsonConfig$MaskingRulesFullMasking$$serializer jsonConfig$MaskingRulesFullMasking$$serializer = new JsonConfig$MaskingRulesFullMasking$$serializer();
        INSTANCE = jsonConfig$MaskingRulesFullMasking$$serializer;
        J0 j02 = new J0("com.contentsquare.android.core.features.config.model.JsonConfig.MaskingRulesFullMasking", jsonConfig$MaskingRulesFullMasking$$serializer, 3);
        j02.p("app", true);
        j02.p("sdk", true);
        j02.p("flutter_plugin", true);
        descriptor = j02;
    }

    private JsonConfig$MaskingRulesFullMasking$$serializer() {
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.contentsquare.android.core.features.config.model.JsonConfig.MaskingRulesFullMasking deserialize(kotlinx.serialization.encoding.Decoder r13) {
        /*
            r12 = this;
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r12.getDescriptor()
            iK.c r13 = r13.b(r0)
            kotlinx.serialization.KSerializer[] r1 = com.contentsquare.android.core.features.config.model.JsonConfig.MaskingRulesFullMasking.f46732d
            boolean r2 = r13.q()
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0031
            r2 = r1[r5]
            java.lang.Object r2 = r13.o(r0, r5, r2, r6)
            r5 = r1[r4]
            java.lang.Object r4 = r13.o(r0, r4, r5, r6)
            r1 = r1[r3]
            java.lang.Object r1 = r13.o(r0, r3, r1, r6)
            r3 = 7
            r7 = r4
            r4 = r3
            goto L_0x006a
        L_0x0031:
            r9 = r4
            r2 = r5
            r7 = r6
            r8 = r7
        L_0x0035:
            if (r9 == 0) goto L_0x0067
            int r10 = r13.p(r0)
            r11 = -1
            if (r10 == r11) goto L_0x0065
            if (r10 == 0) goto L_0x005c
            if (r10 == r4) goto L_0x0053
            if (r10 != r3) goto L_0x004d
            r10 = r1[r3]
            java.lang.Object r8 = r13.o(r0, r3, r10, r8)
            r2 = r2 | 4
            goto L_0x0035
        L_0x004d:
            fK.E r13 = new fK.E
            r13.<init>((int) r10)
            throw r13
        L_0x0053:
            r10 = r1[r4]
            java.lang.Object r7 = r13.o(r0, r4, r10, r7)
            r2 = r2 | 2
            goto L_0x0035
        L_0x005c:
            r10 = r1[r5]
            java.lang.Object r6 = r13.o(r0, r5, r10, r6)
            r2 = r2 | 1
            goto L_0x0035
        L_0x0065:
            r9 = r5
            goto L_0x0035
        L_0x0067:
            r4 = r2
            r2 = r6
            r1 = r8
        L_0x006a:
            r13.c(r0)
            com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRulesFullMasking r13 = new com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRulesFullMasking
            r5 = r2
            java.util.List r5 = (java.util.List) r5
            r6 = r7
            java.util.List r6 = (java.util.List) r6
            r7 = r1
            java.util.List r7 = (java.util.List) r7
            r8 = 0
            r3 = r13
            r3.<init>((int) r4, (java.util.List) r5, (java.util.List) r6, (java.util.List) r7, (jK.T0) r8)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRulesFullMasking$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRulesFullMasking");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, JsonConfig.MaskingRulesFullMasking maskingRulesFullMasking) {
        C17542s.j(encoder, "encoder");
        C17542s.j(maskingRulesFullMasking, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        JsonConfig.MaskingRulesFullMasking.d(maskingRulesFullMasking, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = JsonConfig.MaskingRulesFullMasking.f46732d;
        return new KSerializer[]{a10[0], a10[1], a10[2]};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
