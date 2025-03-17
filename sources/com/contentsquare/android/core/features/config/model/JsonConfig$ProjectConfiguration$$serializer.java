package com.contentsquare.android.core.features.config.model;

import XH.C16814e;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.M;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/contentsquare/android/core/features/config/model/JsonConfig.ProjectConfiguration.$serializer", "LjK/N;", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class JsonConfig$ProjectConfiguration$$serializer implements N<JsonConfig.ProjectConfiguration> {
    public static final JsonConfig$ProjectConfiguration$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        JsonConfig$ProjectConfiguration$$serializer jsonConfig$ProjectConfiguration$$serializer = new JsonConfig$ProjectConfiguration$$serializer();
        INSTANCE = jsonConfig$ProjectConfiguration$$serializer;
        J0 j02 = new J0("com.contentsquare.android.core.features.config.model.JsonConfig.ProjectConfiguration", jsonConfig$ProjectConfiguration$$serializer, 18);
        j02.p("enabled", false);
        j02.p("endpoint", false);
        j02.p("sample", false);
        j02.p("bucket", false);
        j02.p("crash_handler", false);
        j02.p("session_timeout", false);
        j02.p("opt_out_by_default", false);
        j02.p("client_mode", false);
        j02.p("in_app_config", true);
        j02.p("session_replay", true);
        j02.p("feature_flags", true);
        j02.p("encryption_public_key_id", true);
        j02.p("encryption_public_key", true);
        j02.p("api_errors", true);
        j02.p("api_errors_troubleshooting_v2", true);
        j02.p("webview", true);
        j02.p("static_resource_manager", true);
        j02.p("csProjectId", true);
        descriptor = j02;
    }

    private JsonConfig$ProjectConfiguration$$serializer() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x010e, code lost:
        r10 = r9;
        r9 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0110, code lost:
        r8 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0159, code lost:
        r11 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x017a, code lost:
        r12 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x019a, code lost:
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01b9, code lost:
        r14 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0315, code lost:
        r37 = r37 | r5;
        r5 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r15;
        r15 = r21;
        r21 = r22;
        r22 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x032e, code lost:
        r3 = r40;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.contentsquare.android.core.features.config.model.JsonConfig.ProjectConfiguration deserialize(kotlinx.serialization.encoding.Decoder r43) {
        /*
            r42 = this;
            r0 = r43
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r42.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.contentsquare.android.core.features.config.model.JsonConfig.ProjectConfiguration.f46736s
            boolean r3 = r0.q()
            r10 = 9
            r11 = 7
            r12 = 6
            r13 = 5
            r14 = 3
            r4 = 8
            r15 = 4
            r5 = 2
            r6 = 10
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x00b5
            boolean r3 = r0.D(r1, r8)
            java.lang.String r7 = r0.n(r1, r7)
            float r5 = r0.v(r1, r5)
            int r8 = r0.j(r1, r14)
            boolean r14 = r0.D(r1, r15)
            int r13 = r0.j(r1, r13)
            boolean r12 = r0.D(r1, r12)
            com.contentsquare.android.core.features.config.model.JsonConfig$ClientMode$$serializer r15 = com.contentsquare.android.core.features.config.model.JsonConfig$ClientMode$$serializer.INSTANCE
            java.lang.Object r11 = r0.o(r1, r11, r15, r9)
            com.contentsquare.android.core.features.config.model.JsonConfig$InAppConfig$$serializer r15 = com.contentsquare.android.core.features.config.model.JsonConfig$InAppConfig$$serializer.INSTANCE
            java.lang.Object r4 = r0.o(r1, r4, r15, r9)
            com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay$$serializer r15 = com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay$$serializer.INSTANCE
            java.lang.Object r10 = r0.o(r1, r10, r15, r9)
            r2 = r2[r6]
            java.lang.Object r2 = r0.o(r1, r6, r2, r9)
            jK.X r6 = jK.X.f144073a
            r15 = 11
            java.lang.Object r6 = r0.A(r1, r15, r6, r9)
            jK.Y0 r15 = jK.Y0.f144077a
            r20 = r2
            r2 = 12
            java.lang.Object r2 = r0.A(r1, r2, r15, r9)
            com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors$$serializer r15 = com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors$$serializer.INSTANCE
            r19 = r2
            r2 = 13
            java.lang.Object r2 = r0.o(r1, r2, r15, r9)
            com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2$$serializer r15 = com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2$$serializer.INSTANCE
            r18 = r2
            r2 = 14
            java.lang.Object r2 = r0.A(r1, r2, r15, r9)
            com.contentsquare.android.core.features.config.model.JsonConfig$WebView$$serializer r15 = com.contentsquare.android.core.features.config.model.JsonConfig$WebView$$serializer.INSTANCE
            r17 = r2
            r2 = 15
            java.lang.Object r2 = r0.o(r1, r2, r15, r9)
            com.contentsquare.android.core.features.config.model.JsonConfig$StaticResourceManager$$serializer r15 = com.contentsquare.android.core.features.config.model.JsonConfig$StaticResourceManager$$serializer.INSTANCE
            r16 = r2
            r2 = 16
            java.lang.Object r2 = r0.o(r1, r2, r15, r9)
            r9 = 17
            int r9 = r0.j(r1, r9)
            r15 = 262143(0x3ffff, float:3.6734E-40)
            r22 = r3
            r24 = r5
            r23 = r7
            r25 = r8
            r39 = r9
            r28 = r12
            r27 = r13
            r26 = r14
            r21 = r15
            r14 = r20
            goto L_0x0355
        L_0x00b5:
            r3 = 0
            r38 = r7
            r21 = r8
            r33 = r21
            r34 = r33
            r35 = r34
            r36 = r35
            r37 = r36
            r4 = r9
            r5 = r4
            r7 = r5
            r10 = r7
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r22 = r15
            r8 = r22
            r9 = r3
            r3 = r37
        L_0x00d4:
            if (r38 == 0) goto L_0x0334
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x0327;
                case 0: goto L_0x02fb;
                case 1: goto L_0x02de;
                case 2: goto L_0x02c0;
                case 3: goto L_0x02a2;
                case 4: goto L_0x0284;
                case 5: goto L_0x0264;
                case 6: goto L_0x0244;
                case 7: goto L_0x0221;
                case 8: goto L_0x01fa;
                case 9: goto L_0x01d7;
                case 10: goto L_0x01bb;
                case 11: goto L_0x019c;
                case 12: goto L_0x017c;
                case 13: goto L_0x015b;
                case 14: goto L_0x0139;
                case 15: goto L_0x0114;
                case 16: goto L_0x00ef;
                case 17: goto L_0x00e3;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x00e3:
            r6 = 17
            int r33 = r0.j(r1, r6)
            r40 = 131072(0x20000, float:1.83671E-40)
            r37 = r37 | r40
            goto L_0x0330
        L_0x00ef:
            com.contentsquare.android.core.features.config.model.JsonConfig$StaticResourceManager$$serializer r6 = com.contentsquare.android.core.features.config.model.JsonConfig$StaticResourceManager$$serializer.INSTANCE
            r40 = r3
            r3 = 16
            java.lang.Object r6 = r0.o(r1, r3, r6, r10)
            r10 = 65536(0x10000, float:9.18355E-41)
            r23 = r22
            r3 = 0
            r24 = 2
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r6
            r6 = 7
            r41 = r7
            r7 = r5
            r5 = r10
        L_0x010e:
            r10 = r9
            r9 = r8
        L_0x0110:
            r8 = r41
            goto L_0x0315
        L_0x0114:
            r40 = r3
            r3 = 16
            com.contentsquare.android.core.features.config.model.JsonConfig$WebView$$serializer r6 = com.contentsquare.android.core.features.config.model.JsonConfig$WebView$$serializer.INSTANCE
            r3 = 15
            java.lang.Object r4 = r0.o(r1, r3, r6, r4)
            r6 = 32768(0x8000, float:4.5918E-41)
            r23 = r22
            r3 = 0
            r24 = 2
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r5
            r5 = r6
            r6 = 7
            goto L_0x0315
        L_0x0139:
            r40 = r3
            r3 = 15
            com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2$$serializer r6 = com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2$$serializer.INSTANCE
            r3 = 14
            java.lang.Object r6 = r0.A(r1, r3, r6, r11)
            r11 = 16384(0x4000, float:2.2959E-41)
            r23 = r22
            r3 = 0
            r24 = 2
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r6
            r6 = 7
            r41 = r7
            r7 = r5
            r5 = r11
        L_0x0159:
            r11 = r10
            goto L_0x010e
        L_0x015b:
            r40 = r3
            r3 = 14
            com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors$$serializer r6 = com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors$$serializer.INSTANCE
            r3 = 13
            java.lang.Object r6 = r0.o(r1, r3, r6, r12)
            r12 = 8192(0x2000, float:1.14794E-41)
            r23 = r22
            r3 = 0
            r24 = 2
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r6
            r6 = 7
            r41 = r7
            r7 = r5
            r5 = r12
        L_0x017a:
            r12 = r11
            goto L_0x0159
        L_0x017c:
            r40 = r3
            r3 = 13
            jK.Y0 r6 = jK.Y0.f144077a
            r3 = 12
            java.lang.Object r6 = r0.A(r1, r3, r6, r13)
            r13 = 4096(0x1000, float:5.74E-42)
            r23 = r22
            r3 = 0
            r24 = 2
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r6
            r6 = 7
            r41 = r7
            r7 = r5
            r5 = r13
        L_0x019a:
            r13 = r12
            goto L_0x017a
        L_0x019c:
            r40 = r3
            r3 = 12
            jK.X r6 = jK.X.f144073a
            r3 = 11
            java.lang.Object r6 = r0.A(r1, r3, r6, r15)
            r15 = 2048(0x800, float:2.87E-42)
            r23 = r22
            r3 = 0
            r24 = 2
            r22 = r21
            r21 = r6
            r6 = 7
            r41 = r7
            r7 = r5
            r5 = r15
            r15 = r14
        L_0x01b9:
            r14 = r13
            goto L_0x019a
        L_0x01bb:
            r40 = r3
            r6 = 10
            r3 = r2[r6]
            java.lang.Object r3 = r0.o(r1, r6, r3, r14)
            r14 = 1024(0x400, float:1.435E-42)
            r23 = r22
            r6 = 7
            r24 = 2
            r22 = r21
            r21 = r15
            r15 = r3
            r3 = 0
            r41 = r7
            r7 = r5
            r5 = r14
            goto L_0x01b9
        L_0x01d7:
            r40 = r3
            r6 = 10
            com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay$$serializer r3 = com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay$$serializer.INSTANCE
            r6 = 9
            java.lang.Object r3 = r0.o(r1, r6, r3, r5)
            r5 = 512(0x200, float:7.175E-43)
            r23 = r22
            r6 = 7
            r24 = 2
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r3
            r3 = 0
            goto L_0x0315
        L_0x01fa:
            r40 = r3
            r6 = 9
            com.contentsquare.android.core.features.config.model.JsonConfig$InAppConfig$$serializer r3 = com.contentsquare.android.core.features.config.model.JsonConfig$InAppConfig$$serializer.INSTANCE
            r6 = 8
            java.lang.Object r3 = r0.o(r1, r6, r3, r7)
            r7 = 256(0x100, float:3.59E-43)
            r23 = r22
            r6 = 7
            r24 = 2
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r3
            r3 = 0
            r41 = r7
            r7 = r5
            r5 = r41
            goto L_0x0315
        L_0x0221:
            r40 = r3
            r6 = 8
            com.contentsquare.android.core.features.config.model.JsonConfig$ClientMode$$serializer r3 = com.contentsquare.android.core.features.config.model.JsonConfig$ClientMode$$serializer.INSTANCE
            r6 = 7
            java.lang.Object r3 = r0.o(r1, r6, r3, r8)
            r8 = 128(0x80, float:1.794E-43)
            r23 = r22
            r24 = 2
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r3
            r3 = 0
            r41 = r7
            r7 = r5
            r5 = r8
            goto L_0x0110
        L_0x0244:
            r40 = r3
            r3 = 6
            r6 = 7
            boolean r34 = r0.D(r1, r3)
            r29 = 64
            r23 = r22
            r3 = 0
            r24 = 2
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r5
            r5 = r29
            goto L_0x0315
        L_0x0264:
            r40 = r3
            r3 = 5
            r6 = 7
            int r35 = r0.j(r1, r3)
            r28 = 32
            r23 = r22
            r3 = 0
            r24 = 2
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r5
            r5 = r28
            goto L_0x0315
        L_0x0284:
            r40 = r3
            r3 = 4
            r6 = 7
            boolean r36 = r0.D(r1, r3)
            r23 = r22
            r3 = 0
            r24 = 2
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r5
            r5 = 16
            goto L_0x0315
        L_0x02a2:
            r40 = r3
            r3 = 3
            r6 = 7
            int r21 = r0.j(r1, r3)
            r23 = r22
            r3 = 0
            r24 = 2
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r5
            r5 = 8
            goto L_0x0315
        L_0x02c0:
            r40 = r3
            r3 = 3
            r6 = 7
            r9 = 2
            float r25 = r0.v(r1, r9)
            r24 = r9
            r23 = r22
            r3 = 0
            r9 = r8
            r22 = r21
            r8 = r7
            r21 = r15
            r7 = r5
            r15 = r14
            r5 = 4
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r25
            goto L_0x0315
        L_0x02de:
            r40 = r3
            r3 = 1
            r6 = 7
            r24 = 2
            java.lang.String r22 = r0.n(r1, r3)
            r23 = r22
            r3 = 0
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r5
            r5 = r24
            goto L_0x0315
        L_0x02fb:
            r3 = 0
            r6 = 7
            r24 = 2
            boolean r23 = r0.D(r1, r3)
            r40 = r23
            r23 = r22
            r22 = r21
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r5
            r5 = 1
        L_0x0315:
            r37 = r37 | r5
            r5 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r21
            r21 = r22
            r22 = r23
            goto L_0x032e
        L_0x0327:
            r40 = r3
            r3 = 0
            r24 = 2
            r38 = r3
        L_0x032e:
            r3 = r40
        L_0x0330:
            r6 = 10
            goto L_0x00d4
        L_0x0334:
            r40 = r3
            r16 = r4
            r4 = r7
            r24 = r9
            r2 = r10
            r17 = r11
            r18 = r12
            r19 = r13
            r6 = r15
            r25 = r21
            r23 = r22
            r39 = r33
            r28 = r34
            r27 = r35
            r26 = r36
            r21 = r37
            r22 = r40
            r10 = r5
            r11 = r8
        L_0x0355:
            r0.c(r1)
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r0 = new com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration
            r20 = r0
            r29 = r11
            com.contentsquare.android.core.features.config.model.JsonConfig$ClientMode r29 = (com.contentsquare.android.core.features.config.model.JsonConfig.ClientMode) r29
            r30 = r4
            com.contentsquare.android.core.features.config.model.JsonConfig$InAppConfig r30 = (com.contentsquare.android.core.features.config.model.JsonConfig.InAppConfig) r30
            r31 = r10
            com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay r31 = (com.contentsquare.android.core.features.config.model.JsonConfig.SessionReplay) r31
            r32 = r14
            java.util.List r32 = (java.util.List) r32
            r33 = r6
            java.lang.Integer r33 = (java.lang.Integer) r33
            r34 = r19
            java.lang.String r34 = (java.lang.String) r34
            r35 = r18
            com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrors r35 = (com.contentsquare.android.core.features.config.model.JsonConfig.ApiErrors) r35
            r36 = r17
            com.contentsquare.android.core.features.config.model.JsonConfig$ApiErrorsV2 r36 = (com.contentsquare.android.core.features.config.model.JsonConfig.ApiErrorsV2) r36
            r37 = r16
            com.contentsquare.android.core.features.config.model.JsonConfig$WebView r37 = (com.contentsquare.android.core.features.config.model.JsonConfig.WebView) r37
            r38 = r2
            com.contentsquare.android.core.features.config.model.JsonConfig$StaticResourceManager r38 = (com.contentsquare.android.core.features.config.model.JsonConfig.StaticResourceManager) r38
            r40 = 0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, JsonConfig.ProjectConfiguration projectConfiguration) {
        C17542s.j(encoder, "encoder");
        C17542s.j(projectConfiguration, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        JsonConfig.ProjectConfiguration.u(projectConfiguration, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = JsonConfig.ProjectConfiguration.f46736s;
        Y0 y02 = Y0.f144077a;
        X x10 = X.f144073a;
        KSerializer<?> kSerializer = a10[10];
        KSerializer<?> u10 = C17294a.u(x10);
        KSerializer<?> u11 = C17294a.u(y02);
        KSerializer<?> u12 = C17294a.u(JsonConfig$ApiErrorsV2$$serializer.INSTANCE);
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{iVar, y02, M.f144051a, x10, iVar, x10, iVar, JsonConfig$ClientMode$$serializer.INSTANCE, JsonConfig$InAppConfig$$serializer.INSTANCE, JsonConfig$SessionReplay$$serializer.INSTANCE, kSerializer, u10, u11, JsonConfig$ApiErrors$$serializer.INSTANCE, u12, JsonConfig$WebView$$serializer.INSTANCE, JsonConfig$StaticResourceManager$$serializer.INSTANCE, x10};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
