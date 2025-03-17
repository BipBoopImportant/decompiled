package com.appmattus.certificatetransparency.internal.loglist.model.v3;

import XH.C16814e;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/appmattus/certificatetransparency/internal/loglist/model/v3/Log.$serializer", "LjK/N;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Log;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Log;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/Log;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class Log$$serializer implements N<Log> {
    public static final Log$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Log$$serializer log$$serializer = new Log$$serializer();
        INSTANCE = log$$serializer;
        J0 j02 = new J0("com.appmattus.certificatetransparency.internal.loglist.model.v3.Log", log$$serializer, 10);
        j02.p("description", true);
        j02.p("key", false);
        j02.p("log_id", false);
        j02.p("mmd", false);
        j02.p("previous_operators", true);
        j02.p("url", false);
        j02.p("dns", true);
        j02.p("temporal_interval", true);
        j02.p("log_type", true);
        j02.p("state", true);
        descriptor = j02;
    }

    private Log$$serializer() {
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = Log.$childSerializers;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), y02, y02, X.f144073a, C17294a.u(access$get$childSerializers$cp[4]), access$get$childSerializers$cp[5], C17294a.u(access$get$childSerializers$cp[6]), C17294a.u(TemporalInterval$$serializer.INSTANCE), C17294a.u(access$get$childSerializers$cp[8]), C17294a.u(access$get$childSerializers$cp[9])};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: GK.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.appmattus.certificatetransparency.internal.loglist.model.v3.Hostname} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.appmattus.certificatetransparency.internal.loglist.model.v3.LogType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.appmattus.certificatetransparency.internal.loglist.model.v3.State} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00e0, code lost:
        r4 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e1, code lost:
        r7 = 9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appmattus.certificatetransparency.internal.loglist.model.v3.Log deserialize(kotlinx.serialization.encoding.Decoder r33) {
        /*
            r32 = this;
            r0 = r33
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.appmattus.certificatetransparency.internal.loglist.model.v3.Log.$childSerializers
            boolean r3 = r0.q()
            r4 = 7
            r5 = 3
            r6 = 2
            r7 = 9
            r8 = 6
            r9 = 5
            r10 = 8
            r11 = 4
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x0082
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r3 = r0.A(r1, r13, r3, r14)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r12 = r0.n(r1, r12)
            java.lang.String r6 = r0.n(r1, r6)
            int r5 = r0.j(r1, r5)
            r13 = r2[r11]
            java.lang.Object r11 = r0.A(r1, r11, r13, r14)
            java.util.List r11 = (java.util.List) r11
            r13 = r2[r9]
            java.lang.Object r9 = r0.o(r1, r9, r13, r14)
            GK.v r9 = (GK.C15803v) r9
            r13 = r2[r8]
            java.lang.Object r8 = r0.A(r1, r8, r13, r14)
            com.appmattus.certificatetransparency.internal.loglist.model.v3.Hostname r8 = (com.appmattus.certificatetransparency.internal.loglist.model.v3.Hostname) r8
            com.appmattus.certificatetransparency.internal.loglist.model.v3.TemporalInterval$$serializer r13 = com.appmattus.certificatetransparency.internal.loglist.model.v3.TemporalInterval$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r13, r14)
            com.appmattus.certificatetransparency.internal.loglist.model.v3.TemporalInterval r4 = (com.appmattus.certificatetransparency.internal.loglist.model.v3.TemporalInterval) r4
            r13 = r2[r10]
            java.lang.Object r10 = r0.A(r1, r10, r13, r14)
            com.appmattus.certificatetransparency.internal.loglist.model.v3.LogType r10 = (com.appmattus.certificatetransparency.internal.loglist.model.v3.LogType) r10
            r2 = r2[r7]
            java.lang.Object r2 = r0.A(r1, r7, r2, r14)
            com.appmattus.certificatetransparency.internal.loglist.model.v3.State r2 = (com.appmattus.certificatetransparency.internal.loglist.model.v3.State) r2
            r7 = 1023(0x3ff, float:1.434E-42)
            r30 = r2
            r21 = r3
            r28 = r4
            r24 = r5
            r23 = r6
            r20 = r7
            r27 = r8
            r26 = r9
            r29 = r10
            r25 = r11
            r22 = r12
            goto L_0x013a
        L_0x0082:
            r18 = r12
            r3 = r13
            r5 = r14
            r6 = r5
            r9 = r6
            r11 = r9
            r12 = r11
            r15 = r12
            r16 = r15
            r17 = r16
            r13 = r17
            r14 = r3
        L_0x0092:
            if (r18 == 0) goto L_0x0124
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x011f;
                case 0: goto L_0x0110;
                case 1: goto L_0x0106;
                case 2: goto L_0x00fc;
                case 3: goto L_0x00f2;
                case 4: goto L_0x00e4;
                case 5: goto L_0x00d3;
                case 6: goto L_0x00c5;
                case 7: goto L_0x00ba;
                case 8: goto L_0x00ae;
                case 9: goto L_0x00a1;
                default: goto L_0x009b;
            }
        L_0x009b:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x00a1:
            r8 = r2[r7]
            java.lang.Object r8 = r0.A(r1, r7, r8, r9)
            r9 = r8
            com.appmattus.certificatetransparency.internal.loglist.model.v3.State r9 = (com.appmattus.certificatetransparency.internal.loglist.model.v3.State) r9
            r14 = r14 | 512(0x200, float:7.175E-43)
        L_0x00ac:
            r8 = 6
            goto L_0x0092
        L_0x00ae:
            r8 = r2[r10]
            java.lang.Object r8 = r0.A(r1, r10, r8, r11)
            r11 = r8
            com.appmattus.certificatetransparency.internal.loglist.model.v3.LogType r11 = (com.appmattus.certificatetransparency.internal.loglist.model.v3.LogType) r11
            r14 = r14 | 256(0x100, float:3.59E-43)
            goto L_0x00ac
        L_0x00ba:
            com.appmattus.certificatetransparency.internal.loglist.model.v3.TemporalInterval$$serializer r8 = com.appmattus.certificatetransparency.internal.loglist.model.v3.TemporalInterval$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r4, r8, r5)
            com.appmattus.certificatetransparency.internal.loglist.model.v3.TemporalInterval r5 = (com.appmattus.certificatetransparency.internal.loglist.model.v3.TemporalInterval) r5
            r14 = r14 | 128(0x80, float:1.794E-43)
            goto L_0x00ac
        L_0x00c5:
            r8 = 6
            r4 = r2[r8]
            java.lang.Object r4 = r0.A(r1, r8, r4, r6)
            r6 = r4
            com.appmattus.certificatetransparency.internal.loglist.model.v3.Hostname r6 = (com.appmattus.certificatetransparency.internal.loglist.model.v3.Hostname) r6
            r14 = r14 | 64
            r4 = 7
            goto L_0x0092
        L_0x00d3:
            r4 = 5
            r8 = 6
            r7 = r2[r4]
            java.lang.Object r7 = r0.o(r1, r4, r7, r12)
            r12 = r7
            GK.v r12 = (GK.C15803v) r12
            r14 = r14 | 32
        L_0x00e0:
            r4 = 7
        L_0x00e1:
            r7 = 9
            goto L_0x0092
        L_0x00e4:
            r7 = 4
            r8 = 6
            r4 = r2[r7]
            java.lang.Object r4 = r0.A(r1, r7, r4, r13)
            r13 = r4
            java.util.List r13 = (java.util.List) r13
            r14 = r14 | 16
            goto L_0x00e0
        L_0x00f2:
            r4 = 3
            r7 = 4
            r8 = 6
            int r3 = r0.j(r1, r4)
            r14 = r14 | 8
            goto L_0x00e0
        L_0x00fc:
            r4 = 2
            r7 = 4
            r8 = 6
            java.lang.String r17 = r0.n(r1, r4)
            r14 = r14 | 4
            goto L_0x00e0
        L_0x0106:
            r4 = 1
            r7 = 4
            r8 = 6
            java.lang.String r16 = r0.n(r1, r4)
            r14 = r14 | 2
            goto L_0x00e0
        L_0x0110:
            r7 = 4
            r8 = 6
            jK.Y0 r4 = jK.Y0.f144077a
            r7 = 0
            java.lang.Object r4 = r0.A(r1, r7, r4, r15)
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            r14 = r14 | 1
            goto L_0x00e0
        L_0x011f:
            r7 = 0
            r8 = 6
            r18 = r7
            goto L_0x00e1
        L_0x0124:
            r24 = r3
            r28 = r5
            r27 = r6
            r30 = r9
            r29 = r11
            r26 = r12
            r25 = r13
            r20 = r14
            r21 = r15
            r22 = r16
            r23 = r17
        L_0x013a:
            r0.c(r1)
            com.appmattus.certificatetransparency.internal.loglist.model.v3.Log r0 = new com.appmattus.certificatetransparency.internal.loglist.model.v3.Log
            r31 = 0
            r19 = r0
            r19.<init>((int) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (int) r24, (java.util.List) r25, (GK.C15803v) r26, (com.appmattus.certificatetransparency.internal.loglist.model.v3.Hostname) r27, (com.appmattus.certificatetransparency.internal.loglist.model.v3.TemporalInterval) r28, (com.appmattus.certificatetransparency.internal.loglist.model.v3.LogType) r29, (com.appmattus.certificatetransparency.internal.loglist.model.v3.State) r30, (jK.T0) r31)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appmattus.certificatetransparency.internal.loglist.model.v3.Log$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.appmattus.certificatetransparency.internal.loglist.model.v3.Log");
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Log log) {
        C17542s.j(encoder, "encoder");
        C17542s.j(log, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        Log.write$Self$certificatetransparency(log, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
