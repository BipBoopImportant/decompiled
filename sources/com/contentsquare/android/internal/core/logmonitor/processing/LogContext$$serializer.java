package com.contentsquare.android.internal.core.logmonitor.processing;

import XH.C16814e;
import com.contentsquare.android.internal.core.logmonitor.processing.LogContext;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.Y0;
import kK.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/contentsquare/android/internal/core/logmonitor/processing/LogContext.$serializer", "LjK/N;", "Lcom/contentsquare/android/internal/core/logmonitor/processing/LogContext;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
@C16814e
public final class LogContext$$serializer implements N<LogContext> {
    public static final LogContext$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ J0 f46779a;

    static {
        LogContext$$serializer logContext$$serializer = new LogContext$$serializer();
        INSTANCE = logContext$$serializer;
        J0 j02 = new J0("com.contentsquare.android.internal.core.logmonitor.processing.LogContext", logContext$$serializer, 4);
        j02.p("description", true);
        j02.p("additional", true);
        j02.p("screen_name", true);
        j02.p("screen_url", true);
        f46779a = j02;
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(q.f144325a);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, u10, y02, y02};
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r19) {
        /*
            r18 = this;
            r0 = r19
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            jK.J0 r1 = f46779a
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L_0x0033
            java.lang.String r2 = r0.n(r1, r6)
            kK.q r6 = kK.q.f144325a
            java.lang.Object r5 = r0.A(r1, r5, r6, r7)
            java.lang.String r4 = r0.n(r1, r4)
            java.lang.String r3 = r0.n(r1, r3)
            r6 = 15
            r14 = r2
            r17 = r3
            r16 = r4
            r13 = r6
            goto L_0x0076
        L_0x0033:
            r11 = r5
            r2 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x0038:
            if (r11 == 0) goto L_0x006f
            int r12 = r0.p(r1)
            r13 = -1
            if (r12 == r13) goto L_0x006d
            if (r12 == 0) goto L_0x0066
            if (r12 == r5) goto L_0x005d
            if (r12 == r4) goto L_0x0056
            if (r12 != r3) goto L_0x0050
            java.lang.String r10 = r0.n(r1, r3)
            r2 = r2 | 8
            goto L_0x0038
        L_0x0050:
            fK.E r0 = new fK.E
            r0.<init>((int) r12)
            throw r0
        L_0x0056:
            java.lang.String r9 = r0.n(r1, r4)
            r2 = r2 | 4
            goto L_0x0038
        L_0x005d:
            kK.q r12 = kK.q.f144325a
            java.lang.Object r8 = r0.A(r1, r5, r12, r8)
            r2 = r2 | 2
            goto L_0x0038
        L_0x0066:
            java.lang.String r7 = r0.n(r1, r6)
            r2 = r2 | 1
            goto L_0x0038
        L_0x006d:
            r11 = r6
            goto L_0x0038
        L_0x006f:
            r13 = r2
            r14 = r7
            r5 = r8
            r16 = r9
            r17 = r10
        L_0x0076:
            r0.c(r1)
            com.contentsquare.android.internal.core.logmonitor.processing.LogContext r0 = new com.contentsquare.android.internal.core.logmonitor.processing.LogContext
            r15 = r5
            kotlinx.serialization.json.JsonElement r15 = (kotlinx.serialization.json.JsonElement) r15
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contentsquare.android.internal.core.logmonitor.processing.LogContext$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    public final SerialDescriptor getDescriptor() {
        return f46779a;
    }

    public final void serialize(Encoder encoder, Object obj) {
        LogContext logContext = (LogContext) obj;
        C17542s.j(encoder, "encoder");
        C17542s.j(logContext, "value");
        J0 j02 = f46779a;
        C17395d b10 = encoder.b(j02);
        LogContext.a aVar = LogContext.Companion;
        if (b10.z(j02, 0) || !C17542s.e(logContext.f46775a, "")) {
            b10.y(j02, 0, logContext.f46775a);
        }
        if (b10.z(j02, 1) || logContext.f46776b != null) {
            b10.B(j02, 1, q.f144325a, logContext.f46776b);
        }
        if (b10.z(j02, 2) || !C17542s.e(logContext.f46777c, "")) {
            b10.y(j02, 2, logContext.f46777c);
        }
        if (b10.z(j02, 3) || !C17542s.e(logContext.f46778d, "")) {
            b10.y(j02, 3, logContext.f46778d);
        }
        b10.c(j02);
    }

    public final KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
