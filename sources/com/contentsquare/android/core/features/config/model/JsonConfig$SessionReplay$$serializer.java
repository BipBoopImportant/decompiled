package com.contentsquare.android.core.features.config.model;

import XH.C16814e;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.M;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/contentsquare/android/core/features/config/model/JsonConfig.SessionReplay.$serializer", "LjK/N;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$SessionReplay;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/contentsquare/android/core/features/config/model/JsonConfig$SessionReplay;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/contentsquare/android/core/features/config/model/JsonConfig$SessionReplay;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class JsonConfig$SessionReplay$$serializer implements N<JsonConfig.SessionReplay> {
    public static final JsonConfig$SessionReplay$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        JsonConfig$SessionReplay$$serializer jsonConfig$SessionReplay$$serializer = new JsonConfig$SessionReplay$$serializer();
        INSTANCE = jsonConfig$SessionReplay$$serializer;
        J0 j02 = new J0("com.contentsquare.android.core.features.config.model.JsonConfig.SessionReplay", jsonConfig$SessionReplay$$serializer, 11);
        j02.p("endpoint", true);
        j02.p("recording_rate", true);
        j02.p("record_via_cellular_network", true);
        j02.p("recording_quality_wifi", true);
        j02.p("recording_quality_cellular", true);
        j02.p("blocked_app_versions", true);
        j02.p("srm_enabled", true);
        j02.p("srm_endpoint", true);
        j02.p("user_identifier", true);
        j02.p("etr_enabled", true);
        j02.p("masking_rules", true);
        descriptor = j02;
    }

    private JsonConfig$SessionReplay$$serializer() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d3, code lost:
        r4 = 10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.contentsquare.android.core.features.config.model.JsonConfig.SessionReplay deserialize(kotlinx.serialization.encoding.Decoder r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r25.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.contentsquare.android.core.features.config.model.JsonConfig.SessionReplay.f46758l
            boolean r3 = r0.q()
            r4 = 10
            r5 = 9
            r6 = 7
            r7 = 6
            r8 = 3
            r9 = 8
            r10 = 4
            r11 = 2
            r12 = 5
            r13 = 1
            r14 = 0
            r15 = 0
            if (r3 == 0) goto L_0x0068
            java.lang.String r3 = r0.n(r1, r14)
            float r13 = r0.v(r1, r13)
            boolean r11 = r0.D(r1, r11)
            java.lang.String r8 = r0.n(r1, r8)
            java.lang.String r10 = r0.n(r1, r10)
            r2 = r2[r12]
            java.lang.Object r2 = r0.o(r1, r12, r2, r15)
            boolean r7 = r0.D(r1, r7)
            java.lang.String r6 = r0.n(r1, r6)
            boolean r9 = r0.D(r1, r9)
            boolean r5 = r0.D(r1, r5)
            com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules$$serializer r12 = com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules$$serializer.INSTANCE
            java.lang.Object r4 = r0.o(r1, r4, r12, r15)
            r12 = 2047(0x7ff, float:2.868E-42)
            r15 = r5
            r14 = r12
            r5 = r3
            r12 = r6
            r6 = r13
            r13 = r9
            r9 = r10
            r24 = r11
            r11 = r7
            r7 = r24
            goto L_0x00ff
        L_0x0068:
            r3 = 0
            r18 = r3
            r23 = r13
            r3 = r14
            r16 = r3
            r17 = r16
            r11 = r15
            r13 = r11
            r19 = r13
            r20 = r19
            r21 = r20
            r22 = r21
            r15 = r17
        L_0x007e:
            if (r23 == 0) goto L_0x00ed
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x00e8;
                case 0: goto L_0x00df;
                case 1: goto L_0x00d6;
                case 2: goto L_0x00cb;
                case 3: goto L_0x00c3;
                case 4: goto L_0x00bc;
                case 5: goto L_0x00b3;
                case 6: goto L_0x00ac;
                case 7: goto L_0x00a5;
                case 8: goto L_0x009e;
                case 9: goto L_0x0097;
                case 10: goto L_0x008d;
                default: goto L_0x0087;
            }
        L_0x0087:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x008d:
            com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules$$serializer r8 = com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules$$serializer.INSTANCE
            java.lang.Object r11 = r0.o(r1, r4, r8, r11)
            r14 = r14 | 1024(0x400, float:1.435E-42)
        L_0x0095:
            r8 = 3
            goto L_0x007e
        L_0x0097:
            boolean r3 = r0.D(r1, r5)
            r14 = r14 | 512(0x200, float:7.175E-43)
            goto L_0x0095
        L_0x009e:
            boolean r16 = r0.D(r1, r9)
            r14 = r14 | 256(0x100, float:3.59E-43)
            goto L_0x0095
        L_0x00a5:
            java.lang.String r22 = r0.n(r1, r6)
            r14 = r14 | 128(0x80, float:1.794E-43)
            goto L_0x0095
        L_0x00ac:
            boolean r15 = r0.D(r1, r7)
            r14 = r14 | 64
            goto L_0x0095
        L_0x00b3:
            r8 = r2[r12]
            java.lang.Object r13 = r0.o(r1, r12, r8, r13)
            r14 = r14 | 32
            goto L_0x0095
        L_0x00bc:
            java.lang.String r21 = r0.n(r1, r10)
            r14 = r14 | 16
            goto L_0x0095
        L_0x00c3:
            r8 = 3
            java.lang.String r20 = r0.n(r1, r8)
            r14 = r14 | 8
            goto L_0x007e
        L_0x00cb:
            r4 = 2
            r8 = 3
            boolean r17 = r0.D(r1, r4)
            r14 = r14 | 4
        L_0x00d3:
            r4 = 10
            goto L_0x007e
        L_0x00d6:
            r4 = 1
            r8 = 3
            float r18 = r0.v(r1, r4)
            r14 = r14 | 2
            goto L_0x00d3
        L_0x00df:
            r4 = 0
            r8 = 3
            java.lang.String r19 = r0.n(r1, r4)
            r14 = r14 | 1
            goto L_0x00d3
        L_0x00e8:
            r4 = 0
            r8 = 3
            r23 = r4
            goto L_0x00d3
        L_0x00ed:
            r4 = r11
            r2 = r13
            r11 = r15
            r13 = r16
            r7 = r17
            r6 = r18
            r5 = r19
            r8 = r20
            r9 = r21
            r12 = r22
            r15 = r3
        L_0x00ff:
            r0.c(r1)
            com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay r0 = new com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay
            r10 = r2
            java.util.List r10 = (java.util.List) r10
            r1 = r4
            com.contentsquare.android.core.features.config.model.JsonConfig$MaskingRules r1 = (com.contentsquare.android.core.features.config.model.JsonConfig.MaskingRules) r1
            r16 = 0
            r3 = r0
            r4 = r14
            r14 = r15
            r15 = r1
            r3.<init>((int) r4, (java.lang.String) r5, (float) r6, (boolean) r7, (java.lang.String) r8, (java.lang.String) r9, (java.util.List) r10, (boolean) r11, (java.lang.String) r12, (boolean) r13, (boolean) r14, (com.contentsquare.android.core.features.config.model.JsonConfig.MaskingRules) r15, (jK.T0) r16)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, JsonConfig.SessionReplay sessionReplay) {
        C17542s.j(encoder, "encoder");
        C17542s.j(sessionReplay, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        JsonConfig.SessionReplay.j(sessionReplay, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = JsonConfig.SessionReplay.f46758l[5];
        Y0 y02 = Y0.f144077a;
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{y02, M.f144051a, iVar, y02, y02, kSerializer, iVar, y02, iVar, iVar, JsonConfig$MaskingRules$$serializer.INSTANCE};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
