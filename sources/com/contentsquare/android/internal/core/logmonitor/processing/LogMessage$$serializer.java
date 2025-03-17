package com.contentsquare.android.internal.core.logmonitor.processing;

import XH.C16814e;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import gK.C17294a;
import iK.C17395d;
import jK.C17458i0;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/contentsquare/android/internal/core/logmonitor/processing/LogMessage.$serializer", "LjK/N;", "Lcom/contentsquare/android/internal/core/logmonitor/processing/LogMessage;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
@C16814e
public final class LogMessage$$serializer implements N<LogMessage> {
    public static final LogMessage$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ J0 f46801a;

    static {
        LogMessage$$serializer logMessage$$serializer = new LogMessage$$serializer();
        INSTANCE = logMessage$$serializer;
        J0 j02 = new J0("com.contentsquare.android.internal.core.logmonitor.processing.LogMessage", logMessage$$serializer, 17);
        j02.p("level", true);
        j02.p("stacktrace", true);
        j02.p("context", true);
        j02.p(UiComponentContainer.RESULT_ERROR, true);
        j02.p("xpf", true);
        j02.p("pid", true);
        j02.p("application", true);
        j02.p("version", true);
        j02.p("date", true);
        j02.p("device_model", true);
        j02.p("os_type", true);
        j02.p("os_version", true);
        j02.p("os_api", true);
        j02.p("bundle_id", true);
        j02.p("build_version", true);
        j02.p("app_version", true);
        j02.p("app_build_version", true);
        f46801a = j02;
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(LogMessage.f46783r[0]);
        KSerializer<?> u11 = C17294a.u(LogContext$$serializer.INSTANCE);
        KSerializer<?> u12 = C17294a.u(LogError$$serializer.INSTANCE);
        KSerializer<?> u13 = C17294a.u(LogXpf$$serializer.INSTANCE);
        KSerializer<?> u14 = C17294a.u(X.f144073a);
        KSerializer<?> u15 = C17294a.u(C17458i0.f144113a);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{u10, y02, u11, u12, u13, u14, y02, y02, u15, y02, y02, y02, y02, y02, y02, y02, y02};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0163, code lost:
        r7 = 16;
        r9 = 10;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01ab, code lost:
        r7 = 16;
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c9, code lost:
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c9, code lost:
        r14 = r14;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r34) {
        /*
            r33 = this;
            r0 = r34
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            jK.J0 r1 = f46801a
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer<java.lang.Object>[] r2 = com.contentsquare.android.internal.core.logmonitor.processing.LogMessage.f46783r
            boolean r3 = r0.q()
            r9 = 10
            r10 = 9
            r11 = 7
            r12 = 6
            r13 = 5
            r14 = 3
            r15 = 8
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r3 == 0) goto L_0x00a8
            r2 = r2[r7]
            java.lang.Object r2 = r0.A(r1, r7, r2, r8)
            java.lang.String r3 = r0.n(r1, r6)
            com.contentsquare.android.internal.core.logmonitor.processing.LogContext$$serializer r6 = com.contentsquare.android.internal.core.logmonitor.processing.LogContext$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r6, r8)
            com.contentsquare.android.internal.core.logmonitor.processing.LogError$$serializer r6 = com.contentsquare.android.internal.core.logmonitor.processing.LogError$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r14, r6, r8)
            com.contentsquare.android.internal.core.logmonitor.processing.LogXpf$$serializer r7 = com.contentsquare.android.internal.core.logmonitor.processing.LogXpf$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r7, r8)
            jK.X r7 = jK.X.f144073a
            java.lang.Object r7 = r0.A(r1, r13, r7, r8)
            java.lang.String r12 = r0.n(r1, r12)
            java.lang.String r11 = r0.n(r1, r11)
            jK.i0 r13 = jK.C17458i0.f144113a
            java.lang.Object r8 = r0.A(r1, r15, r13, r8)
            java.lang.String r10 = r0.n(r1, r10)
            java.lang.String r9 = r0.n(r1, r9)
            r13 = 11
            java.lang.String r13 = r0.n(r1, r13)
            r14 = 12
            java.lang.String r14 = r0.n(r1, r14)
            r15 = 13
            java.lang.String r15 = r0.n(r1, r15)
            r18 = r2
            r2 = 14
            java.lang.String r2 = r0.n(r1, r2)
            r17 = r2
            r2 = 15
            java.lang.String r2 = r0.n(r1, r2)
            r16 = r7
            r7 = 16
            java.lang.String r7 = r0.n(r1, r7)
            r19 = 131071(0x1ffff, float:1.8367E-40)
            r20 = r2
            r21 = r3
            r31 = r7
            r24 = r10
            r22 = r12
            r2 = r18
            r7 = r5
            r12 = r11
            r18 = r15
            r11 = r8
            r15 = r9
            r8 = r6
            r6 = r19
            r19 = r17
            r17 = r14
            r14 = r16
            r16 = r13
            goto L_0x01c4
        L_0x00a8:
            r3 = r7
            r7 = 16
            r13 = r3
            r32 = r6
            r3 = r8
            r4 = r3
            r5 = r4
            r6 = r5
            r14 = r6
            r21 = r14
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
        L_0x00c9:
            if (r32 == 0) goto L_0x01b0
            int r12 = r0.p(r1)
            switch(r12) {
                case -1: goto L_0x01a6;
                case 0: goto L_0x019a;
                case 1: goto L_0x018f;
                case 2: goto L_0x0182;
                case 3: goto L_0x0175;
                case 4: goto L_0x0168;
                case 5: goto L_0x0158;
                case 6: goto L_0x014a;
                case 7: goto L_0x0141;
                case 8: goto L_0x0136;
                case 9: goto L_0x012a;
                case 10: goto L_0x011e;
                case 11: goto L_0x0112;
                case 12: goto L_0x0106;
                case 13: goto L_0x00fa;
                case 14: goto L_0x00ee;
                case 15: goto L_0x00e1;
                case 16: goto L_0x00d8;
                default: goto L_0x00d2;
            }
        L_0x00d2:
            fK.E r0 = new fK.E
            r0.<init>((int) r12)
            throw r0
        L_0x00d8:
            java.lang.String r31 = r0.n(r1, r7)
            r12 = 65536(0x10000, float:9.18355E-41)
            r13 = r13 | r12
            goto L_0x01ad
        L_0x00e1:
            r12 = 15
            java.lang.String r30 = r0.n(r1, r12)
            r16 = 32768(0x8000, float:4.5918E-41)
            r13 = r13 | r16
            goto L_0x01ad
        L_0x00ee:
            r7 = 14
            r12 = 15
            java.lang.String r29 = r0.n(r1, r7)
            r13 = r13 | 16384(0x4000, float:2.2959E-41)
            goto L_0x01ab
        L_0x00fa:
            r7 = 13
            r12 = 15
            java.lang.String r28 = r0.n(r1, r7)
            r13 = r13 | 8192(0x2000, float:1.14794E-41)
            goto L_0x01ab
        L_0x0106:
            r7 = 12
            r12 = 15
            java.lang.String r27 = r0.n(r1, r7)
            r13 = r13 | 4096(0x1000, float:5.74E-42)
            goto L_0x01ab
        L_0x0112:
            r7 = 11
            r12 = 15
            java.lang.String r26 = r0.n(r1, r7)
            r13 = r13 | 2048(0x800, float:2.87E-42)
            goto L_0x01ab
        L_0x011e:
            r7 = 11
            r12 = 15
            java.lang.String r25 = r0.n(r1, r9)
            r13 = r13 | 1024(0x400, float:1.435E-42)
            goto L_0x01ab
        L_0x012a:
            r7 = 11
            r12 = 15
            java.lang.String r24 = r0.n(r1, r10)
            r13 = r13 | 512(0x200, float:7.175E-43)
            goto L_0x01ab
        L_0x0136:
            r12 = 15
            jK.i0 r7 = jK.C17458i0.f144113a
            java.lang.Object r4 = r0.A(r1, r15, r7, r4)
            r13 = r13 | 256(0x100, float:3.59E-43)
            goto L_0x01ab
        L_0x0141:
            r12 = 15
            java.lang.String r23 = r0.n(r1, r11)
            r13 = r13 | 128(0x80, float:1.794E-43)
            goto L_0x01ab
        L_0x014a:
            r7 = 6
            r12 = 15
            java.lang.String r22 = r0.n(r1, r7)
            r13 = r13 | 64
            r12 = r7
            r7 = 16
            goto L_0x00c9
        L_0x0158:
            r12 = 15
            jK.X r7 = jK.X.f144073a
            r9 = 5
            java.lang.Object r14 = r0.A(r1, r9, r7, r14)
            r13 = r13 | 32
        L_0x0163:
            r7 = 16
            r9 = 10
            goto L_0x01ad
        L_0x0168:
            r9 = 5
            r12 = 15
            com.contentsquare.android.internal.core.logmonitor.processing.LogXpf$$serializer r7 = com.contentsquare.android.internal.core.logmonitor.processing.LogXpf$$serializer.INSTANCE
            r9 = 4
            java.lang.Object r5 = r0.A(r1, r9, r7, r5)
            r13 = r13 | 16
            goto L_0x0163
        L_0x0175:
            r9 = 4
            r12 = 15
            com.contentsquare.android.internal.core.logmonitor.processing.LogError$$serializer r7 = com.contentsquare.android.internal.core.logmonitor.processing.LogError$$serializer.INSTANCE
            r9 = 3
            java.lang.Object r6 = r0.A(r1, r9, r7, r6)
            r13 = r13 | 8
            goto L_0x0163
        L_0x0182:
            r9 = 3
            r12 = 15
            com.contentsquare.android.internal.core.logmonitor.processing.LogContext$$serializer r7 = com.contentsquare.android.internal.core.logmonitor.processing.LogContext$$serializer.INSTANCE
            r9 = 2
            java.lang.Object r3 = r0.A(r1, r9, r7, r3)
            r13 = r13 | 4
            goto L_0x0163
        L_0x018f:
            r7 = 1
            r9 = 2
            r12 = 15
            java.lang.String r21 = r0.n(r1, r7)
            r13 = r13 | 2
            goto L_0x0163
        L_0x019a:
            r7 = 0
            r12 = 15
            r9 = r2[r7]
            java.lang.Object r8 = r0.A(r1, r7, r9, r8)
            r13 = r13 | 1
            goto L_0x0163
        L_0x01a6:
            r7 = 0
            r12 = 15
            r32 = r7
        L_0x01ab:
            r7 = 16
        L_0x01ad:
            r12 = 6
            goto L_0x00c9
        L_0x01b0:
            r7 = r3
            r11 = r4
            r4 = r5
            r2 = r8
            r12 = r23
            r15 = r25
            r16 = r26
            r17 = r27
            r18 = r28
            r19 = r29
            r20 = r30
            r8 = r6
            r6 = r13
        L_0x01c4:
            r0.c(r1)
            com.contentsquare.android.internal.core.logmonitor.processing.LogMessage r0 = new com.contentsquare.android.internal.core.logmonitor.processing.LogMessage
            r3 = r0
            r5 = r2
            com.contentsquare.android.internal.core.logmonitor.processing.a r5 = (com.contentsquare.android.internal.core.logmonitor.processing.a) r5
            com.contentsquare.android.internal.core.logmonitor.processing.LogContext r7 = (com.contentsquare.android.internal.core.logmonitor.processing.LogContext) r7
            com.contentsquare.android.internal.core.logmonitor.processing.LogError r8 = (com.contentsquare.android.internal.core.logmonitor.processing.LogError) r8
            r9 = r4
            com.contentsquare.android.internal.core.logmonitor.processing.LogXpf r9 = (com.contentsquare.android.internal.core.logmonitor.processing.LogXpf) r9
            r10 = r14
            java.lang.Integer r10 = (java.lang.Integer) r10
            r13 = r11
            java.lang.Long r13 = (java.lang.Long) r13
            r4 = r6
            r6 = r21
            r11 = r22
            r14 = r24
            r21 = r31
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.core.logmonitor.processing.LogMessage$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    public final SerialDescriptor getDescriptor() {
        return f46801a;
    }

    public final void serialize(Encoder encoder, Object obj) {
        LogMessage logMessage = (LogMessage) obj;
        C17542s.j(encoder, "encoder");
        C17542s.j(logMessage, "value");
        J0 j02 = f46801a;
        C17395d b10 = encoder.b(j02);
        KSerializer<Object>[] kSerializerArr = LogMessage.f46783r;
        if (b10.z(j02, 0) || logMessage.f46784a != null) {
            b10.B(j02, 0, kSerializerArr[0], logMessage.f46784a);
        }
        if (b10.z(j02, 1) || !C17542s.e(logMessage.f46785b, "")) {
            b10.y(j02, 1, logMessage.f46785b);
        }
        if (b10.z(j02, 2) || logMessage.f46786c != null) {
            b10.B(j02, 2, LogContext$$serializer.INSTANCE, logMessage.f46786c);
        }
        if (b10.z(j02, 3) || logMessage.f46787d != null) {
            b10.B(j02, 3, LogError$$serializer.INSTANCE, logMessage.f46787d);
        }
        if (b10.z(j02, 4) || logMessage.f46788e != null) {
            b10.B(j02, 4, LogXpf$$serializer.INSTANCE, logMessage.f46788e);
        }
        if (b10.z(j02, 5) || logMessage.f46789f != null) {
            b10.B(j02, 5, X.f144073a, logMessage.f46789f);
        }
        if (b10.z(j02, 6) || !C17542s.e(logMessage.f46790g, "")) {
            b10.y(j02, 6, logMessage.f46790g);
        }
        if (b10.z(j02, 7) || !C17542s.e(logMessage.f46791h, "")) {
            b10.y(j02, 7, logMessage.f46791h);
        }
        if (b10.z(j02, 8) || logMessage.f46792i != null) {
            b10.B(j02, 8, C17458i0.f144113a, logMessage.f46792i);
        }
        if (b10.z(j02, 9) || !C17542s.e(logMessage.f46793j, "")) {
            b10.y(j02, 9, logMessage.f46793j);
        }
        if (b10.z(j02, 10) || !C17542s.e(logMessage.f46794k, "android")) {
            b10.y(j02, 10, logMessage.f46794k);
        }
        if (b10.z(j02, 11) || !C17542s.e(logMessage.f46795l, "")) {
            b10.y(j02, 11, logMessage.f46795l);
        }
        if (b10.z(j02, 12) || !C17542s.e(logMessage.f46796m, "")) {
            b10.y(j02, 12, logMessage.f46796m);
        }
        if (b10.z(j02, 13) || !C17542s.e(logMessage.f46797n, "")) {
            b10.y(j02, 13, logMessage.f46797n);
        }
        if (b10.z(j02, 14) || !C17542s.e(logMessage.f46798o, "")) {
            b10.y(j02, 14, logMessage.f46798o);
        }
        if (b10.z(j02, 15) || !C17542s.e(logMessage.f46799p, "")) {
            b10.y(j02, 15, logMessage.f46799p);
        }
        if (b10.z(j02, 16) || !C17542s.e(logMessage.f46800q, "")) {
            b10.y(j02, 16, logMessage.f46800q);
        }
        b10.c(j02);
    }

    public final KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
