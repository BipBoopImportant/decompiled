package com.ingka.ikea.instore.datalayer.storeevents.network.model;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class RegistrationRemote$$serializer implements N<RegistrationRemote> {
    public static final RegistrationRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RegistrationRemote$$serializer registrationRemote$$serializer = new RegistrationRemote$$serializer();
        INSTANCE = registrationRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote", registrationRemote$$serializer, 7);
        j02.p("adultCount", false);
        j02.p("childCount", false);
        j02.p("state", false);
        j02.p("contactMethods", false);
        j02.p("creationTime", false);
        j02.p("pageLang", false);
        j02.p("customerType", false);
        descriptor = j02;
    }

    private RegistrationRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote$c} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00ba, code lost:
        r4 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bb, code lost:
        r5 = 4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote deserialize(kotlinx.serialization.encoding.Decoder r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote.f96166h
            boolean r3 = r0.q()
            r4 = 5
            r5 = 4
            r6 = 2
            r7 = 6
            r8 = 3
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0061
            jK.X r3 = jK.X.f144073a
            java.lang.Object r10 = r0.A(r1, r10, r3, r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r3 = r0.A(r1, r9, r3, r11)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.String r6 = r0.n(r1, r6)
            r9 = r2[r8]
            java.lang.Object r8 = r0.o(r1, r8, r9, r11)
            java.util.List r8 = (java.util.List) r8
            java.lang.String r5 = r0.n(r1, r5)
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r4 = r0.A(r1, r4, r9, r11)
            java.lang.String r4 = (java.lang.String) r4
            r2 = r2[r7]
            java.lang.Object r2 = r0.o(r1, r7, r2, r11)
            com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote$c r2 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote.c) r2
            r7 = 127(0x7f, float:1.78E-43)
            r25 = r2
            r20 = r3
            r24 = r4
            r23 = r5
            r21 = r6
            r18 = r7
            r22 = r8
            r19 = r10
            goto L_0x00e1
        L_0x0061:
            r16 = r9
            r3 = r10
            r9 = r11
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x006a:
            if (r16 == 0) goto L_0x00d1
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00cc;
                case 0: goto L_0x00bd;
                case 1: goto L_0x00ad;
                case 2: goto L_0x00a5;
                case 3: goto L_0x0099;
                case 4: goto L_0x0092;
                case 5: goto L_0x0086;
                case 6: goto L_0x0079;
                default: goto L_0x0073;
            }
        L_0x0073:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x0079:
            r6 = r2[r7]
            java.lang.Object r6 = r0.o(r1, r7, r6, r9)
            r9 = r6
            com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote$c r9 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote.c) r9
            r3 = r3 | 64
        L_0x0084:
            r6 = 2
            goto L_0x006a
        L_0x0086:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r4, r6, r10)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            r3 = r3 | 32
            goto L_0x0084
        L_0x0092:
            java.lang.String r15 = r0.n(r1, r5)
            r3 = r3 | 16
            goto L_0x0084
        L_0x0099:
            r6 = r2[r8]
            java.lang.Object r6 = r0.o(r1, r8, r6, r14)
            r14 = r6
            java.util.List r14 = (java.util.List) r14
            r3 = r3 | 8
            goto L_0x0084
        L_0x00a5:
            r6 = 2
            java.lang.String r13 = r0.n(r1, r6)
            r3 = r3 | 4
            goto L_0x006a
        L_0x00ad:
            r6 = 2
            jK.X r4 = jK.X.f144073a
            r5 = 1
            java.lang.Object r4 = r0.A(r1, r5, r4, r12)
            r12 = r4
            java.lang.Integer r12 = (java.lang.Integer) r12
            r3 = r3 | 2
        L_0x00ba:
            r4 = 5
        L_0x00bb:
            r5 = 4
            goto L_0x006a
        L_0x00bd:
            r5 = 1
            r6 = 2
            jK.X r4 = jK.X.f144073a
            r5 = 0
            java.lang.Object r4 = r0.A(r1, r5, r4, r11)
            r11 = r4
            java.lang.Integer r11 = (java.lang.Integer) r11
            r3 = r3 | 1
            goto L_0x00ba
        L_0x00cc:
            r5 = 0
            r6 = 2
            r16 = r5
            goto L_0x00bb
        L_0x00d1:
            r18 = r3
            r25 = r9
            r24 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x00e1:
            r0.c(r1)
            com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote r0 = new com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote
            r26 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, RegistrationRemote registrationRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(registrationRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        RegistrationRemote.c(registrationRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = RegistrationRemote.f96166h;
        X x10 = X.f144073a;
        KSerializer<?> u10 = C17294a.u(x10);
        KSerializer<?> u11 = C17294a.u(x10);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{u10, u11, y02, a10[3], y02, C17294a.u(y02), a10[6]};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
