package com.ingka.ikea.core.remotemodel;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17438C;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/core/remotemodel/ReferenceImageRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/core/remotemodel/ReferenceImageRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/core/remotemodel/ReferenceImageRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/core/remotemodel/ReferenceImageRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ReferenceImageRemote$$serializer implements N<ReferenceImageRemote> {
    public static final ReferenceImageRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReferenceImageRemote$$serializer referenceImageRemote$$serializer = new ReferenceImageRemote$$serializer();
        INSTANCE = referenceImageRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.core.remotemodel.ReferenceImageRemote", referenceImageRemote$$serializer, 6);
        j02.p("url", false);
        j02.p("altText", false);
        j02.p("id", false);
        j02.p("imageType", false);
        j02.p("source", false);
        j02.p("aspectRatio", false);
        descriptor = j02;
    }

    private ReferenceImageRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Double} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.core.remotemodel.ReferenceImageRemote deserialize(kotlinx.serialization.encoding.Decoder r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r2 == 0) goto L_0x004c
            java.lang.String r2 = r0.n(r1, r8)
            java.lang.String r7 = r0.n(r1, r7)
            java.lang.String r6 = r0.n(r1, r6)
            java.lang.String r4 = r0.n(r1, r4)
            com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote$$serializer r8 = com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r8, r9)
            com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote r5 = (com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote) r5
            jK.C r8 = jK.C17438C.f144010a
            java.lang.Object r3 = r0.A(r1, r3, r8, r9)
            java.lang.Double r3 = (java.lang.Double) r3
            r8 = 63
            r18 = r2
            r23 = r3
            r21 = r4
            r22 = r5
            r20 = r6
            r19 = r7
            r17 = r8
            goto L_0x00a9
        L_0x004c:
            r15 = r7
            r2 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x0053:
            if (r15 == 0) goto L_0x009b
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x0098;
                case 0: goto L_0x0090;
                case 1: goto L_0x0089;
                case 2: goto L_0x0082;
                case 3: goto L_0x007b;
                case 4: goto L_0x006f;
                case 5: goto L_0x0062;
                default: goto L_0x005c;
            }
        L_0x005c:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x0062:
            jK.C r8 = jK.C17438C.f144010a
            java.lang.Object r8 = r0.A(r1, r3, r8, r14)
            r14 = r8
            java.lang.Double r14 = (java.lang.Double) r14
            r2 = r2 | 32
        L_0x006d:
            r8 = 0
            goto L_0x0053
        L_0x006f:
            com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote$$serializer r8 = com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r5, r8, r13)
            r13 = r8
            com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote r13 = (com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote) r13
            r2 = r2 | 16
            goto L_0x006d
        L_0x007b:
            java.lang.String r12 = r0.n(r1, r4)
            r2 = r2 | 8
            goto L_0x006d
        L_0x0082:
            java.lang.String r11 = r0.n(r1, r6)
            r2 = r2 | 4
            goto L_0x006d
        L_0x0089:
            java.lang.String r10 = r0.n(r1, r7)
            r2 = r2 | 2
            goto L_0x006d
        L_0x0090:
            r8 = 0
            java.lang.String r9 = r0.n(r1, r8)
            r2 = r2 | 1
            goto L_0x0053
        L_0x0098:
            r8 = 0
            r15 = r8
            goto L_0x0053
        L_0x009b:
            r17 = r2
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
        L_0x00a9:
            r0.c(r1)
            com.ingka.ikea.core.remotemodel.ReferenceImageRemote r0 = new com.ingka.ikea.core.remotemodel.ReferenceImageRemote
            r24 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.remotemodel.ReferenceImageRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.core.remotemodel.ReferenceImageRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ReferenceImageRemote referenceImageRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(referenceImageRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ReferenceImageRemote.b(referenceImageRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(ReferenceImageSourceRemote$$serializer.INSTANCE);
        KSerializer<?> u11 = C17294a.u(C17438C.f144010a);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, y02, u10, u11};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
