package com.ingka.ikea.dataconsent.impl.repository.datasource.endpoint.model;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "dataconsent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ConsentsRemote$$serializer implements N<ConsentsRemote> {
    public static final ConsentsRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ConsentsRemote$$serializer consentsRemote$$serializer = new ConsentsRemote$$serializer();
        INSTANCE = consentsRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.dataconsent.impl.repository.datasource.endpoint.model.ConsentsRemote", consentsRemote$$serializer, 6);
        j02.p("name", false);
        j02.p("title", false);
        j02.p("policyUrl", true);
        j02.p("version", false);
        j02.p("uiVersion", true);
        j02.p("details", false);
        descriptor = j02;
    }

    private ConsentsRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.dataconsent.impl.repository.datasource.endpoint.model.ConsentsRemote deserialize(kotlinx.serialization.encoding.Decoder r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.dataconsent.impl.repository.datasource.endpoint.model.ConsentsRemote.f95462g
            boolean r3 = r0.q()
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 5
            r8 = 1
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x0052
            java.lang.String r3 = r0.n(r1, r9)
            java.lang.String r8 = r0.n(r1, r8)
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r6, r9, r10)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r4 = r0.n(r1, r4)
            java.lang.Object r5 = r0.A(r1, r5, r9, r10)
            java.lang.String r5 = (java.lang.String) r5
            r2 = r2[r7]
            java.lang.Object r2 = r0.o(r1, r7, r2, r10)
            java.util.List r2 = (java.util.List) r2
            r7 = 63
            r24 = r2
            r19 = r3
            r22 = r4
            r23 = r5
            r21 = r6
            r18 = r7
            r20 = r8
            goto L_0x00b6
        L_0x0052:
            r16 = r8
            r3 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x005a:
            if (r16 == 0) goto L_0x00a8
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00a4;
                case 0: goto L_0x009c;
                case 1: goto L_0x0095;
                case 2: goto L_0x0089;
                case 3: goto L_0x0082;
                case 4: goto L_0x0076;
                case 5: goto L_0x0069;
                default: goto L_0x0063;
            }
        L_0x0063:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0069:
            r9 = r2[r7]
            java.lang.Object r9 = r0.o(r1, r7, r9, r15)
            r15 = r9
            java.util.List r15 = (java.util.List) r15
            r3 = r3 | 32
        L_0x0074:
            r9 = 0
            goto L_0x005a
        L_0x0076:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r5, r9, r14)
            r14 = r9
            java.lang.String r14 = (java.lang.String) r14
            r3 = r3 | 16
            goto L_0x0074
        L_0x0082:
            java.lang.String r13 = r0.n(r1, r4)
            r3 = r3 | 8
            goto L_0x0074
        L_0x0089:
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r6, r9, r12)
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 4
            goto L_0x0074
        L_0x0095:
            java.lang.String r11 = r0.n(r1, r8)
            r3 = r3 | 2
            goto L_0x0074
        L_0x009c:
            r9 = 0
            java.lang.String r10 = r0.n(r1, r9)
            r3 = r3 | 1
            goto L_0x005a
        L_0x00a4:
            r9 = 0
            r16 = r9
            goto L_0x005a
        L_0x00a8:
            r18 = r3
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00b6:
            r0.c(r1)
            com.ingka.ikea.dataconsent.impl.repository.datasource.endpoint.model.ConsentsRemote r0 = new com.ingka.ikea.dataconsent.impl.repository.datasource.endpoint.model.ConsentsRemote
            r25 = 0
            r17 = r0
            r17.<init>((int) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (java.lang.String) r22, (java.lang.String) r23, (java.util.List) r24, (jK.T0) r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.dataconsent.impl.repository.datasource.endpoint.model.ConsentsRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.dataconsent.impl.repository.datasource.endpoint.model.ConsentsRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ConsentsRemote consentsRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(consentsRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ConsentsRemote.b(consentsRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = ConsentsRemote.f95462g;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, C17294a.u(y02), y02, C17294a.u(y02), a10[5]};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
