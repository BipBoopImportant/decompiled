package com.ingka.ikea.instore.datalayer.storeevents.network.model;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class StoreEventRemote$$serializer implements N<StoreEventRemote> {
    public static final StoreEventRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StoreEventRemote$$serializer storeEventRemote$$serializer = new StoreEventRemote$$serializer();
        INSTANCE = storeEventRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote", storeEventRemote$$serializer, 8);
        j02.p("id", false);
        j02.p("eventImagePath", false);
        j02.p("price", false);
        j02.p("loyaltyEvent", false);
        j02.p("eventDetails", false);
        j02.p("timeSlots", false);
        j02.p("registrationSettings", false);
        j02.p("location", false);
        descriptor = j02;
    }

    private StoreEventRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Price} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Details} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$RegistrationSettings} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.f96176i
            boolean r3 = r0.q()
            r4 = 7
            r5 = 6
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 5
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0072
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r11 = r0.A(r1, r11, r3, r12)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.A(r1, r10, r3, r12)
            java.lang.String r10 = (java.lang.String) r10
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Price$$serializer r13 = com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Price$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r8, r13, r12)
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Price r8 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.Price) r8
            java.lang.Object r3 = r0.A(r1, r6, r3, r12)
            java.lang.String r3 = (java.lang.String) r3
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Details$$serializer r6 = com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Details$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r7, r6, r12)
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Details r6 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.Details) r6
            r2 = r2[r9]
            java.lang.Object r2 = r0.A(r1, r9, r2, r12)
            java.util.List r2 = (java.util.List) r2
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$RegistrationSettings$$serializer r7 = com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$RegistrationSettings$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r7, r12)
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$RegistrationSettings r5 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.RegistrationSettings) r5
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$LocationRemote$$serializer r7 = com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$LocationRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r7, r12)
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$LocationRemote r4 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.LocationRemote) r4
            r7 = 255(0xff, float:3.57E-43)
            r24 = r2
            r22 = r3
            r26 = r4
            r25 = r5
            r23 = r6
            r18 = r7
            r21 = r8
            r20 = r10
            r19 = r11
            goto L_0x010d
        L_0x0072:
            r16 = r10
            r3 = r11
            r6 = r12
            r8 = r6
            r10 = r8
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x007c:
            if (r16 == 0) goto L_0x00fb
            int r7 = r0.p(r1)
            switch(r7) {
                case -1: goto L_0x00f7;
                case 0: goto L_0x00e9;
                case 1: goto L_0x00db;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00be;
                case 4: goto L_0x00af;
                case 5: goto L_0x00a3;
                case 6: goto L_0x0097;
                case 7: goto L_0x008b;
                default: goto L_0x0085;
            }
        L_0x0085:
            fK.E r0 = new fK.E
            r0.<init>((int) r7)
            throw r0
        L_0x008b:
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$LocationRemote$$serializer r7 = com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$LocationRemote$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r4, r7, r6)
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$LocationRemote r6 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.LocationRemote) r6
            r3 = r3 | 128(0x80, float:1.794E-43)
        L_0x0095:
            r7 = 4
            goto L_0x007c
        L_0x0097:
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$RegistrationSettings$$serializer r7 = com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$RegistrationSettings$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r5, r7, r8)
            r8 = r7
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$RegistrationSettings r8 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.RegistrationSettings) r8
            r3 = r3 | 64
            goto L_0x0095
        L_0x00a3:
            r7 = r2[r9]
            java.lang.Object r7 = r0.A(r1, r9, r7, r10)
            r10 = r7
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 32
            goto L_0x0095
        L_0x00af:
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Details$$serializer r7 = com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Details$$serializer.INSTANCE
            r4 = 4
            java.lang.Object r7 = r0.A(r1, r4, r7, r11)
            r11 = r7
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Details r11 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.Details) r11
            r3 = r3 | 16
            r7 = r4
            r4 = 7
            goto L_0x007c
        L_0x00be:
            r4 = 4
            jK.Y0 r7 = jK.Y0.f144077a
            r4 = 3
            java.lang.Object r7 = r0.A(r1, r4, r7, r15)
            r15 = r7
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 8
        L_0x00cb:
            r4 = 7
            goto L_0x0095
        L_0x00cd:
            r4 = 3
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Price$$serializer r7 = com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Price$$serializer.INSTANCE
            r4 = 2
            java.lang.Object r7 = r0.A(r1, r4, r7, r14)
            r14 = r7
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$Price r14 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote.Price) r14
            r3 = r3 | 4
            goto L_0x00cb
        L_0x00db:
            r4 = 2
            jK.Y0 r7 = jK.Y0.f144077a
            r4 = 1
            java.lang.Object r7 = r0.A(r1, r4, r7, r13)
            r13 = r7
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 2
            goto L_0x00cb
        L_0x00e9:
            r4 = 1
            jK.Y0 r7 = jK.Y0.f144077a
            r4 = 0
            java.lang.Object r7 = r0.A(r1, r4, r7, r12)
            r12 = r7
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 1
            goto L_0x00cb
        L_0x00f7:
            r4 = 0
            r16 = r4
            goto L_0x00cb
        L_0x00fb:
            r18 = r3
            r26 = r6
            r25 = r8
            r24 = r10
            r23 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x010d:
            r0.c(r1)
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote r0 = new com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote
            r27 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, StoreEventRemote storeEventRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(storeEventRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        StoreEventRemote.g(storeEventRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] c10 = StoreEventRemote.f96176i;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(StoreEventRemote$Price$$serializer.INSTANCE), C17294a.u(y02), C17294a.u(StoreEventRemote$Details$$serializer.INSTANCE), C17294a.u(c10[5]), C17294a.u(StoreEventRemote$RegistrationSettings$$serializer.INSTANCE), C17294a.u(StoreEventRemote$LocationRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
