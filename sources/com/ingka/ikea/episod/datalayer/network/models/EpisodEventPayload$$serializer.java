package com.ingka.ikea.episod.datalayer.network.models;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/episod/datalayer/network/models/EpisodEventPayload.$serializer", "LjK/N;", "Lcom/ingka/ikea/episod/datalayer/network/models/EpisodEventPayload;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/episod/datalayer/network/models/EpisodEventPayload;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/episod/datalayer/network/models/EpisodEventPayload;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class EpisodEventPayload$$serializer implements N<EpisodEventPayload> {
    public static final EpisodEventPayload$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        EpisodEventPayload$$serializer episodEventPayload$$serializer = new EpisodEventPayload$$serializer();
        INSTANCE = episodEventPayload$$serializer;
        J0 j02 = new J0("com.ingka.ikea.episod.datalayer.network.models.EpisodEventPayload", episodEventPayload$$serializer, 12);
        j02.p("schema_version", false);
        j02.p("client_id", false);
        j02.p("session_id", false);
        j02.p("market_code", false);
        j02.p("language_code", false);
        j02.p("server_timestamp", true);
        j02.p("event_name", false);
        j02.p("event_location", false);
        j02.p("event_origin", false);
        j02.p("event_origin_team", false);
        j02.p("event_details", false);
        j02.p("client_details", false);
        descriptor = j02;
    }

    private EpisodEventPayload$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.ingka.ikea.episod.datalayer.network.models.EventDetails} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: com.ingka.ikea.episod.datalayer.network.models.ClientDetails} */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00fd, code lost:
        r3 = 11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.episod.datalayer.network.models.EpisodEventPayload deserialize(kotlinx.serialization.encoding.Decoder r42) {
        /*
            r41 = this;
            r0 = r42
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r41.getDescriptor()
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 11
            r4 = 10
            r5 = 9
            r6 = 7
            r7 = 6
            r8 = 5
            r9 = 3
            r10 = 8
            r11 = 4
            r12 = 2
            r13 = 1
            r14 = 0
            r15 = 0
            if (r2 == 0) goto L_0x0080
            java.lang.String r2 = r0.n(r1, r14)
            java.lang.String r13 = r0.n(r1, r13)
            java.lang.String r12 = r0.n(r1, r12)
            java.lang.String r9 = r0.n(r1, r9)
            java.lang.String r11 = r0.n(r1, r11)
            jK.Y0 r14 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r8, r14, r15)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r7 = r0.n(r1, r7)
            java.lang.String r6 = r0.n(r1, r6)
            java.lang.String r10 = r0.n(r1, r10)
            java.lang.String r5 = r0.n(r1, r5)
            com.ingka.ikea.episod.datalayer.network.models.EventDetails$$serializer r14 = com.ingka.ikea.episod.datalayer.network.models.EventDetails$$serializer.INSTANCE
            java.lang.Object r4 = r0.o(r1, r4, r14, r15)
            com.ingka.ikea.episod.datalayer.network.models.EventDetails r4 = (com.ingka.ikea.episod.datalayer.network.models.EventDetails) r4
            com.ingka.ikea.episod.datalayer.network.models.ClientDetails$$serializer r14 = com.ingka.ikea.episod.datalayer.network.models.ClientDetails$$serializer.INSTANCE
            java.lang.Object r3 = r0.o(r1, r3, r14, r15)
            com.ingka.ikea.episod.datalayer.network.models.ClientDetails r3 = (com.ingka.ikea.episod.datalayer.network.models.ClientDetails) r3
            r14 = 4095(0xfff, float:5.738E-42)
            r28 = r2
            r39 = r3
            r38 = r4
            r37 = r5
            r35 = r6
            r34 = r7
            r33 = r8
            r31 = r9
            r36 = r10
            r32 = r11
            r30 = r12
            r29 = r13
            r27 = r14
            goto L_0x0136
        L_0x0080:
            r25 = r13
            r2 = r14
            r12 = r15
            r13 = r12
            r14 = r13
            r16 = r14
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
        L_0x0096:
            if (r25 == 0) goto L_0x011c
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x0115;
                case 0: goto L_0x0109;
                case 1: goto L_0x0100;
                case 2: goto L_0x00f5;
                case 3: goto L_0x00ed;
                case 4: goto L_0x00e6;
                case 5: goto L_0x00da;
                case 6: goto L_0x00d3;
                case 7: goto L_0x00cc;
                case 8: goto L_0x00c5;
                case 9: goto L_0x00be;
                case 10: goto L_0x00b2;
                case 11: goto L_0x00a5;
                default: goto L_0x009f;
            }
        L_0x009f:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x00a5:
            com.ingka.ikea.episod.datalayer.network.models.ClientDetails$$serializer r9 = com.ingka.ikea.episod.datalayer.network.models.ClientDetails$$serializer.INSTANCE
            java.lang.Object r9 = r0.o(r1, r3, r9, r12)
            r12 = r9
            com.ingka.ikea.episod.datalayer.network.models.ClientDetails r12 = (com.ingka.ikea.episod.datalayer.network.models.ClientDetails) r12
            r2 = r2 | 2048(0x800, float:2.87E-42)
        L_0x00b0:
            r9 = 3
            goto L_0x0096
        L_0x00b2:
            com.ingka.ikea.episod.datalayer.network.models.EventDetails$$serializer r9 = com.ingka.ikea.episod.datalayer.network.models.EventDetails$$serializer.INSTANCE
            java.lang.Object r9 = r0.o(r1, r4, r9, r13)
            r13 = r9
            com.ingka.ikea.episod.datalayer.network.models.EventDetails r13 = (com.ingka.ikea.episod.datalayer.network.models.EventDetails) r13
            r2 = r2 | 1024(0x400, float:1.435E-42)
            goto L_0x00b0
        L_0x00be:
            java.lang.String r23 = r0.n(r1, r5)
            r2 = r2 | 512(0x200, float:7.175E-43)
            goto L_0x00b0
        L_0x00c5:
            java.lang.String r22 = r0.n(r1, r10)
            r2 = r2 | 256(0x100, float:3.59E-43)
            goto L_0x00b0
        L_0x00cc:
            java.lang.String r21 = r0.n(r1, r6)
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x00b0
        L_0x00d3:
            java.lang.String r20 = r0.n(r1, r7)
            r2 = r2 | 64
            goto L_0x00b0
        L_0x00da:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r8, r9, r14)
            r14 = r9
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 32
            goto L_0x00b0
        L_0x00e6:
            java.lang.String r19 = r0.n(r1, r11)
            r2 = r2 | 16
            goto L_0x00b0
        L_0x00ed:
            r9 = 3
            java.lang.String r18 = r0.n(r1, r9)
            r2 = r2 | 8
            goto L_0x0096
        L_0x00f5:
            r3 = 2
            r9 = 3
            java.lang.String r17 = r0.n(r1, r3)
            r2 = r2 | 4
        L_0x00fd:
            r3 = 11
            goto L_0x0096
        L_0x0100:
            r3 = 1
            r9 = 3
            java.lang.String r16 = r0.n(r1, r3)
            r2 = r2 | 2
            goto L_0x00fd
        L_0x0109:
            r3 = 1
            r9 = 3
            r15 = 0
            java.lang.String r24 = r0.n(r1, r15)
            r2 = r2 | 1
            r15 = r24
            goto L_0x00fd
        L_0x0115:
            r3 = 1
            r9 = 3
            r24 = 0
            r25 = r24
            goto L_0x00fd
        L_0x011c:
            r27 = r2
            r39 = r12
            r38 = r13
            r33 = r14
            r28 = r15
            r29 = r16
            r30 = r17
            r31 = r18
            r32 = r19
            r34 = r20
            r35 = r21
            r36 = r22
            r37 = r23
        L_0x0136:
            r0.c(r1)
            com.ingka.ikea.episod.datalayer.network.models.EpisodEventPayload r0 = new com.ingka.ikea.episod.datalayer.network.models.EpisodEventPayload
            r40 = 0
            r26 = r0
            r26.<init>((int) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32, (java.lang.String) r33, (java.lang.String) r34, (java.lang.String) r35, (java.lang.String) r36, (java.lang.String) r37, (com.ingka.ikea.episod.datalayer.network.models.EventDetails) r38, (com.ingka.ikea.episod.datalayer.network.models.ClientDetails) r39, (jK.T0) r40)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.episod.datalayer.network.models.EpisodEventPayload$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.episod.datalayer.network.models.EpisodEventPayload");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, EpisodEventPayload episodEventPayload) {
        C17542s.j(encoder, "encoder");
        C17542s.j(episodEventPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        EpisodEventPayload.a(episodEventPayload, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, y02, y02, C17294a.u(y02), y02, y02, y02, y02, EventDetails$$serializer.INSTANCE, ClientDetails$$serializer.INSTANCE};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
