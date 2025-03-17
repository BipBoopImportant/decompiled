package com.ingka.ikea.instore.datalayer.storeevents.network.model;

import XH.C16814e;
import com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote.TimeSlot.$serializer", "LjK/N;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote$TimeSlot;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class StoreEventRemote$TimeSlot$$serializer implements N<StoreEventRemote.TimeSlot> {
    public static final StoreEventRemote$TimeSlot$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StoreEventRemote$TimeSlot$$serializer storeEventRemote$TimeSlot$$serializer = new StoreEventRemote$TimeSlot$$serializer();
        INSTANCE = storeEventRemote$TimeSlot$$serializer;
        J0 j02 = new J0("com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.TimeSlot", storeEventRemote$TimeSlot$$serializer, 8);
        j02.p("timeslotId", false);
        j02.p("startDate", false);
        j02.p("endDate", false);
        j02.p("currentRegistrationCount", false);
        j02.p("currentWaitingListCount", false);
        j02.p("registrationSettings", false);
        j02.p("visibilityState", false);
        j02.p("registration", false);
        descriptor = j02;
    }

    private StoreEventRemote$TimeSlot$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$TimeSlot$RegistrationSettings} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.TimeSlot deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r2 == 0) goto L_0x006a
            jK.Y0 r2 = jK.Y0.f144077a
            java.lang.Object r10 = r0.A(r1, r10, r2, r11)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.A(r1, r9, r2, r11)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r0.A(r1, r8, r2, r11)
            java.lang.String r8 = (java.lang.String) r8
            jK.X r12 = jK.X.f144073a
            java.lang.Object r6 = r0.A(r1, r6, r12, r11)
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r7 = r0.A(r1, r7, r12, r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$TimeSlot$RegistrationSettings$$serializer r12 = com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$TimeSlot$RegistrationSettings$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r12, r11)
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$TimeSlot$RegistrationSettings r5 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.TimeSlot.RegistrationSettings) r5
            java.lang.Object r2 = r0.A(r1, r4, r2, r11)
            java.lang.String r2 = (java.lang.String) r2
            com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote$$serializer r4 = com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r3, r4, r11)
            com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote r3 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote) r3
            r4 = 255(0xff, float:3.57E-43)
            r25 = r2
            r26 = r3
            r18 = r4
            r24 = r5
            r22 = r6
            r23 = r7
            r21 = r8
            r20 = r9
            r19 = r10
            goto L_0x0104
        L_0x006a:
            r16 = r9
            r2 = r10
            r8 = r11
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0074:
            if (r16 == 0) goto L_0x00f2
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00ee;
                case 0: goto L_0x00e0;
                case 1: goto L_0x00d2;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00a8;
                case 5: goto L_0x009c;
                case 6: goto L_0x0090;
                case 7: goto L_0x0083;
                default: goto L_0x007d;
            }
        L_0x007d:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x0083:
            com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote$$serializer r6 = com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r3, r6, r8)
            r8 = r6
            com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote r8 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote) r8
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x008e:
            r6 = 3
            goto L_0x0074
        L_0x0090:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r4, r6, r9)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 64
            goto L_0x008e
        L_0x009c:
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$TimeSlot$RegistrationSettings$$serializer r6 = com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$TimeSlot$RegistrationSettings$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r5, r6, r10)
            r10 = r6
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$TimeSlot$RegistrationSettings r10 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.TimeSlot.RegistrationSettings) r10
            r2 = r2 | 32
            goto L_0x008e
        L_0x00a8:
            jK.X r6 = jK.X.f144073a
            java.lang.Object r6 = r0.A(r1, r7, r6, r15)
            r15 = r6
            java.lang.Integer r15 = (java.lang.Integer) r15
            r2 = r2 | 16
            goto L_0x008e
        L_0x00b4:
            jK.X r6 = jK.X.f144073a
            r3 = 3
            java.lang.Object r6 = r0.A(r1, r3, r6, r14)
            r14 = r6
            java.lang.Integer r14 = (java.lang.Integer) r14
            r2 = r2 | 8
            r6 = r3
            r3 = 7
            goto L_0x0074
        L_0x00c3:
            r3 = 3
            jK.Y0 r6 = jK.Y0.f144077a
            r3 = 2
            java.lang.Object r6 = r0.A(r1, r3, r6, r13)
            r13 = r6
            java.lang.String r13 = (java.lang.String) r13
            r2 = r2 | 4
        L_0x00d0:
            r3 = 7
            goto L_0x008e
        L_0x00d2:
            r3 = 2
            jK.Y0 r6 = jK.Y0.f144077a
            r3 = 1
            java.lang.Object r6 = r0.A(r1, r3, r6, r12)
            r12 = r6
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 2
            goto L_0x00d0
        L_0x00e0:
            r3 = 1
            jK.Y0 r6 = jK.Y0.f144077a
            r3 = 0
            java.lang.Object r6 = r0.A(r1, r3, r6, r11)
            r11 = r6
            java.lang.String r11 = (java.lang.String) r11
            r2 = r2 | 1
            goto L_0x00d0
        L_0x00ee:
            r3 = 0
            r16 = r3
            goto L_0x00d0
        L_0x00f2:
            r18 = r2
            r26 = r8
            r25 = r9
            r24 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x0104:
            r0.c(r1)
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$TimeSlot r0 = new com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$TimeSlot
            r27 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$TimeSlot$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$TimeSlot");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, StoreEventRemote.TimeSlot timeSlot) {
        C17542s.j(encoder, "encoder");
        C17542s.j(timeSlot, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        StoreEventRemote.TimeSlot.e(timeSlot, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        KSerializer<?> u12 = C17294a.u(y02);
        X x10 = X.f144073a;
        return new KSerializer[]{u10, u11, u12, C17294a.u(x10), C17294a.u(x10), C17294a.u(StoreEventRemote$TimeSlot$RegistrationSettings$$serializer.INSTANCE), C17294a.u(y02), C17294a.u(RegistrationRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
