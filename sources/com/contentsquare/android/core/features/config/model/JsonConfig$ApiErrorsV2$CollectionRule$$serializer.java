package com.contentsquare.android.core.features.config.model;

import XH.C16814e;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/contentsquare/android/core/features/config/model/JsonConfig.ApiErrorsV2.CollectionRule.$serializer", "LjK/N;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CollectionRule;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CollectionRule;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrorsV2$CollectionRule;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class JsonConfig$ApiErrorsV2$CollectionRule$$serializer implements N<JsonConfig.ApiErrorsV2.CollectionRule> {
    public static final JsonConfig$ApiErrorsV2$CollectionRule$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        JsonConfig$ApiErrorsV2$CollectionRule$$serializer jsonConfig$ApiErrorsV2$CollectionRule$$serializer = new JsonConfig$ApiErrorsV2$CollectionRule$$serializer();
        INSTANCE = jsonConfig$ApiErrorsV2$CollectionRule$$serializer;
        J0 j02 = new J0("com.contentsquare.android.core.features.config.model.JsonConfig.ApiErrorsV2.CollectionRule", jsonConfig$ApiErrorsV2$CollectionRule$$serializer, 8);
        j02.p("url", true);
        j02.p("status_code", true);
        j02.p("body_content", true);
        j02.p("collect_query_params", true);
        j02.p("collect_request_body", true);
        j02.p("collect_response_body", true);
        j02.p("body_attribute_paths", true);
        j02.p("custom_headers", true);
        descriptor = j02;
    }

    private JsonConfig$ApiErrorsV2$CollectionRule$$serializer() {
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.contentsquare.android.core.features.config.model.JsonConfig.ApiErrorsV2.CollectionRule deserialize(kotlinx.serialization.encoding.Decoder r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r19.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.contentsquare.android.core.features.config.model.JsonConfig.ApiErrorsV2.CollectionRule.f46712i
            boolean r3 = r0.q()
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 7
            r9 = 6
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0053
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r11 = r0.A(r1, r11, r3, r12)
            jK.X r13 = jK.X.f144073a
            java.lang.Object r10 = r0.A(r1, r10, r13, r12)
            java.lang.Object r3 = r0.A(r1, r7, r3, r12)
            boolean r5 = r0.D(r1, r5)
            boolean r6 = r0.D(r1, r6)
            boolean r4 = r0.D(r1, r4)
            r7 = r2[r9]
            java.lang.Object r7 = r0.o(r1, r9, r7, r12)
            r2 = r2[r8]
            java.lang.Object r2 = r0.o(r1, r8, r2, r12)
            r8 = 255(0xff, float:3.57E-43)
            r9 = r5
            r13 = r6
            r5 = r8
            r15 = r11
            r11 = r4
            goto L_0x00d1
        L_0x0053:
            r17 = r10
            r3 = r11
            r13 = r3
            r14 = r13
            r5 = r12
            r7 = r5
            r10 = r7
            r15 = r10
            r11 = r15
            r12 = r14
        L_0x005e:
            if (r17 == 0) goto L_0x00c8
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00c2;
                case 0: goto L_0x00b5;
                case 1: goto L_0x00a8;
                case 2: goto L_0x009a;
                case 3: goto L_0x008f;
                case 4: goto L_0x0087;
                case 5: goto L_0x0080;
                case 6: goto L_0x0077;
                case 7: goto L_0x006d;
                default: goto L_0x0067;
            }
        L_0x0067:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x006d:
            r6 = r2[r8]
            java.lang.Object r5 = r0.o(r1, r8, r6, r5)
            r14 = r14 | 128(0x80, float:1.794E-43)
        L_0x0075:
            r6 = 4
            goto L_0x005e
        L_0x0077:
            r6 = r2[r9]
            java.lang.Object r7 = r0.o(r1, r9, r6, r7)
            r14 = r14 | 64
            goto L_0x0075
        L_0x0080:
            boolean r3 = r0.D(r1, r4)
            r14 = r14 | 32
            goto L_0x0075
        L_0x0087:
            r6 = 4
            boolean r13 = r0.D(r1, r6)
            r14 = r14 | 16
            goto L_0x005e
        L_0x008f:
            r6 = 4
            r12 = 3
            boolean r16 = r0.D(r1, r12)
            r14 = r14 | 8
            r12 = r16
            goto L_0x005e
        L_0x009a:
            r6 = 4
            r16 = 3
            jK.Y0 r4 = jK.Y0.f144077a
            r6 = 2
            java.lang.Object r10 = r0.A(r1, r6, r4, r10)
            r14 = r14 | 4
        L_0x00a6:
            r4 = 5
            goto L_0x0075
        L_0x00a8:
            r6 = 2
            r16 = 3
            jK.X r4 = jK.X.f144073a
            r6 = 1
            java.lang.Object r11 = r0.A(r1, r6, r4, r11)
            r14 = r14 | 2
            goto L_0x00a6
        L_0x00b5:
            r6 = 1
            r16 = 3
            jK.Y0 r4 = jK.Y0.f144077a
            r6 = 0
            java.lang.Object r15 = r0.A(r1, r6, r4, r15)
            r14 = r14 | 1
            goto L_0x00a6
        L_0x00c2:
            r6 = 0
            r16 = 3
            r17 = r6
            goto L_0x0075
        L_0x00c8:
            r2 = r5
            r9 = r12
            r5 = r14
            r18 = r11
            r11 = r3
            r3 = r10
            r10 = r18
        L_0x00d1:
            r0.c(r1)
            com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2$CollectionRule r0 = new com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2$CollectionRule
            r6 = r15
            java.lang.String r6 = (java.lang.String) r6
            r1 = r10
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            r12 = r7
            java.util.List r12 = (java.util.List) r12
            java.util.List r2 = (java.util.List) r2
            r14 = 0
            r4 = r0
            r7 = r1
            r10 = r13
            r13 = r2
            r4.<init>((int) r5, (java.lang.String) r6, (java.lang.Integer) r7, (java.lang.String) r8, (boolean) r9, (boolean) r10, (boolean) r11, (java.util.List) r12, (java.util.List) r13, (jK.T0) r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2$CollectionRule$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2$CollectionRule");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, JsonConfig.ApiErrorsV2.CollectionRule collectionRule) {
        C17542s.j(encoder, "encoder");
        C17542s.j(collectionRule, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        JsonConfig.ApiErrorsV2.CollectionRule.j(collectionRule, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = JsonConfig.ApiErrorsV2.CollectionRule.f46712i;
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(X.f144073a);
        KSerializer<?> u12 = C17294a.u(y02);
        KSerializer<?> kSerializer = a10[6];
        KSerializer<?> kSerializer2 = a10[7];
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{u10, u11, u12, iVar, iVar, iVar, kSerializer, kSerializer2};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
