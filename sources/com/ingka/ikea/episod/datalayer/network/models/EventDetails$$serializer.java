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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/episod/datalayer/network/models/EventDetails.$serializer", "LjK/N;", "Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class EventDetails$$serializer implements N<EventDetails> {
    public static final EventDetails$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        EventDetails$$serializer eventDetails$$serializer = new EventDetails$$serializer();
        INSTANCE = eventDetails$$serializer;
        J0 j02 = new J0("com.ingka.ikea.episod.datalayer.network.models.EventDetails", eventDetails$$serializer, 7);
        j02.p("items", true);
        j02.p("label", true);
        j02.p("component", true);
        j02.p("component_value", true);
        j02.p("image_id", true);
        j02.p("component_type", true);
        j02.p("category", true);
        descriptor = j02;
    }

    private EventDetails$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.episod.datalayer.network.models.EventDetails deserialize(kotlinx.serialization.encoding.Decoder r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r27.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.episod.datalayer.network.models.EventDetails.f95769h
            boolean r3 = r0.q()
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0063
            r2 = r2[r10]
            java.lang.Object r2 = r0.A(r1, r10, r2, r11)
            java.util.List r2 = (java.util.List) r2
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r9, r3, r11)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.A(r1, r8, r3, r11)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r0.A(r1, r6, r3, r11)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.A(r1, r7, r3, r11)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.A(r1, r5, r3, r11)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r0.A(r1, r4, r3, r11)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 127(0x7f, float:1.78E-43)
            r19 = r2
            r25 = r3
            r18 = r4
            r24 = r5
            r22 = r6
            r23 = r7
            r21 = r8
            r20 = r9
            goto L_0x00eb
        L_0x0063:
            r16 = r9
            r3 = r10
            r9 = r11
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x006c:
            if (r16 == 0) goto L_0x00db
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x00d7;
                case 0: goto L_0x00ca;
                case 1: goto L_0x00bb;
                case 2: goto L_0x00ac;
                case 3: goto L_0x00a0;
                case 4: goto L_0x0094;
                case 5: goto L_0x0088;
                case 6: goto L_0x007b;
                default: goto L_0x0075;
            }
        L_0x0075:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x007b:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r4, r8, r9)
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r3 = r3 | 64
        L_0x0086:
            r8 = 2
            goto L_0x006c
        L_0x0088:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r5, r8, r10)
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            r3 = r3 | 32
            goto L_0x0086
        L_0x0094:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r7, r8, r15)
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 16
            goto L_0x0086
        L_0x00a0:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r6, r8, r14)
            r14 = r8
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 8
            goto L_0x0086
        L_0x00ac:
            jK.Y0 r8 = jK.Y0.f144077a
            r4 = 2
            java.lang.Object r8 = r0.A(r1, r4, r8, r13)
            r13 = r8
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 4
            r8 = r4
            r4 = 6
            goto L_0x006c
        L_0x00bb:
            r4 = 2
            jK.Y0 r8 = jK.Y0.f144077a
            r4 = 1
            java.lang.Object r8 = r0.A(r1, r4, r8, r12)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 2
        L_0x00c8:
            r4 = 6
            goto L_0x0086
        L_0x00ca:
            r8 = 0
            r4 = r2[r8]
            java.lang.Object r4 = r0.A(r1, r8, r4, r11)
            r11 = r4
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 1
            goto L_0x00c8
        L_0x00d7:
            r8 = 0
            r16 = r8
            goto L_0x0086
        L_0x00db:
            r18 = r3
            r25 = r9
            r24 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x00eb:
            r0.c(r1)
            com.ingka.ikea.episod.datalayer.network.models.EventDetails r0 = new com.ingka.ikea.episod.datalayer.network.models.EventDetails
            r26 = 0
            r17 = r0
            r17.<init>((int) r18, (java.util.List) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (java.lang.String) r24, (java.lang.String) r25, (jK.T0) r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.episod.datalayer.network.models.EventDetails$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.episod.datalayer.network.models.EventDetails");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, EventDetails eventDetails) {
        C17542s.j(encoder, "encoder");
        C17542s.j(eventDetails, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        EventDetails.b(eventDetails, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(EventDetails.f95769h[0]);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{u10, C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
