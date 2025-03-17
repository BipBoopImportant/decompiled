package com.contentsquare.android.core.features.config.model;

import XH.C16814e;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/contentsquare/android/core/features/config/model/JsonConfig.ApiErrors.$serializer", "LjK/N;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrors;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrors;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrors;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class JsonConfig$ApiErrors$$serializer implements N<JsonConfig.ApiErrors> {
    public static final JsonConfig$ApiErrors$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        JsonConfig$ApiErrors$$serializer jsonConfig$ApiErrors$$serializer = new JsonConfig$ApiErrors$$serializer();
        INSTANCE = jsonConfig$ApiErrors$$serializer;
        J0 j02 = new J0("com.contentsquare.android.core.features.config.model.JsonConfig.ApiErrors", jsonConfig$ApiErrors$$serializer, 6);
        j02.p("collect_standard_headers", true);
        j02.p("collect_query_params", true);
        j02.p("collect_request_body", true);
        j02.p("collect_response_body", true);
        j02.p("valid_urls", true);
        j02.p("valid_custom_headers", true);
        descriptor = j02;
    }

    private JsonConfig$ApiErrors$$serializer() {
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.contentsquare.android.core.features.config.model.JsonConfig.ApiErrors deserialize(kotlinx.serialization.encoding.Decoder r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r18.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.contentsquare.android.core.features.config.model.JsonConfig.ApiErrors.f46698g
            boolean r3 = r0.q()
            r4 = 3
            r5 = 2
            r6 = 5
            r7 = 4
            r8 = 1
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x0048
            boolean r3 = r0.D(r1, r9)
            boolean r8 = r0.D(r1, r8)
            boolean r5 = r0.D(r1, r5)
            boolean r4 = r0.D(r1, r4)
            r9 = r2[r7]
            java.lang.Object r7 = r0.o(r1, r7, r9, r10)
            r2 = r2[r6]
            java.lang.Object r2 = r0.o(r1, r6, r2, r10)
            r6 = 63
            r11 = r5
            r5 = r3
            r17 = r8
            r8 = r4
            r4 = r6
            r6 = r17
            goto L_0x009a
        L_0x0048:
            r16 = r8
            r3 = r9
            r11 = r3
            r12 = r11
            r13 = r12
            r14 = r10
            r15 = r14
            r10 = r13
        L_0x0051:
            if (r16 == 0) goto L_0x0094
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x0090;
                case 0: goto L_0x0088;
                case 1: goto L_0x0081;
                case 2: goto L_0x007a;
                case 3: goto L_0x0073;
                case 4: goto L_0x006a;
                case 5: goto L_0x0060;
                default: goto L_0x005a;
            }
        L_0x005a:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0060:
            r9 = r2[r6]
            java.lang.Object r15 = r0.o(r1, r6, r9, r15)
            r12 = r12 | 32
        L_0x0068:
            r9 = 0
            goto L_0x0051
        L_0x006a:
            r9 = r2[r7]
            java.lang.Object r14 = r0.o(r1, r7, r9, r14)
            r12 = r12 | 16
            goto L_0x0068
        L_0x0073:
            boolean r10 = r0.D(r1, r4)
            r12 = r12 | 8
            goto L_0x0068
        L_0x007a:
            boolean r11 = r0.D(r1, r5)
            r12 = r12 | 4
            goto L_0x0068
        L_0x0081:
            boolean r13 = r0.D(r1, r8)
            r12 = r12 | 2
            goto L_0x0068
        L_0x0088:
            r9 = 0
            boolean r3 = r0.D(r1, r9)
            r12 = r12 | 1
            goto L_0x0051
        L_0x0090:
            r9 = 0
            r16 = r9
            goto L_0x0051
        L_0x0094:
            r5 = r3
            r8 = r10
            r4 = r12
            r6 = r13
            r7 = r14
            r2 = r15
        L_0x009a:
            r0.c(r1)
            com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors r0 = new com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors
            r9 = r7
            java.util.List r9 = (java.util.List) r9
            r10 = r2
            java.util.List r10 = (java.util.List) r10
            r1 = 0
            r3 = r0
            r7 = r11
            r11 = r1
            r3.<init>((int) r4, (boolean) r5, (boolean) r6, (boolean) r7, (boolean) r8, (java.util.List) r9, (java.util.List) r10, (jK.T0) r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, JsonConfig.ApiErrors apiErrors) {
        C17542s.j(encoder, "encoder");
        C17542s.j(apiErrors, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        JsonConfig.ApiErrors.h(apiErrors, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = JsonConfig.ApiErrors.f46698g;
        KSerializer<?> kSerializer = a10[4];
        KSerializer<?> kSerializer2 = a10[5];
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{iVar, iVar, iVar, iVar, kSerializer, kSerializer2};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
