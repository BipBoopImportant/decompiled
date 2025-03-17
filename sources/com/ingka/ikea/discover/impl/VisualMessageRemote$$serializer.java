package com.ingka.ikea.discover.impl;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.ProductCatPLRemote$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/discover/impl/VisualMessageRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/discover/impl/VisualMessageRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/discover/impl/VisualMessageRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/discover/impl/VisualMessageRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class VisualMessageRemote$$serializer implements N<VisualMessageRemote> {
    public static final VisualMessageRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VisualMessageRemote$$serializer visualMessageRemote$$serializer = new VisualMessageRemote$$serializer();
        INSTANCE = visualMessageRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.discover.impl.VisualMessageRemote", visualMessageRemote$$serializer, 6);
        j02.p("id", false);
        j02.p("purpose", false);
        j02.p("title", false);
        j02.p("description", false);
        j02.p("referenceImages", false);
        j02.p("productCatPL", false);
        descriptor = j02;
    }

    private VisualMessageRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.ingka.ikea.core.remotemodel.ProductCatPLRemote} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.discover.impl.VisualMessageRemote deserialize(kotlinx.serialization.encoding.Decoder r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.discover.impl.VisualMessageRemote.f95554g
            boolean r3 = r0.q()
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 4
            r8 = 1
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x0050
            java.lang.String r3 = r0.n(r1, r9)
            java.lang.String r8 = r0.n(r1, r8)
            java.lang.String r6 = r0.n(r1, r6)
            java.lang.String r5 = r0.n(r1, r5)
            r2 = r2[r7]
            java.lang.Object r2 = r0.o(r1, r7, r2, r10)
            java.util.List r2 = (java.util.List) r2
            com.ingka.ikea.core.remotemodel.ProductCatPLRemote$$serializer r7 = com.ingka.ikea.core.remotemodel.ProductCatPLRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r7, r10)
            com.ingka.ikea.core.remotemodel.ProductCatPLRemote r4 = (com.ingka.ikea.core.remotemodel.ProductCatPLRemote) r4
            r7 = 63
            r23 = r2
            r19 = r3
            r24 = r4
            r22 = r5
            r21 = r6
            r18 = r7
            r20 = r8
            goto L_0x00af
        L_0x0050:
            r16 = r8
            r3 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0058:
            if (r16 == 0) goto L_0x00a1
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x009d;
                case 0: goto L_0x0095;
                case 1: goto L_0x008e;
                case 2: goto L_0x0087;
                case 3: goto L_0x0080;
                case 4: goto L_0x0074;
                case 5: goto L_0x0067;
                default: goto L_0x0061;
            }
        L_0x0061:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0067:
            com.ingka.ikea.core.remotemodel.ProductCatPLRemote$$serializer r9 = com.ingka.ikea.core.remotemodel.ProductCatPLRemote$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r4, r9, r15)
            r15 = r9
            com.ingka.ikea.core.remotemodel.ProductCatPLRemote r15 = (com.ingka.ikea.core.remotemodel.ProductCatPLRemote) r15
            r3 = r3 | 32
        L_0x0072:
            r9 = 0
            goto L_0x0058
        L_0x0074:
            r9 = r2[r7]
            java.lang.Object r9 = r0.o(r1, r7, r9, r14)
            r14 = r9
            java.util.List r14 = (java.util.List) r14
            r3 = r3 | 16
            goto L_0x0072
        L_0x0080:
            java.lang.String r13 = r0.n(r1, r5)
            r3 = r3 | 8
            goto L_0x0072
        L_0x0087:
            java.lang.String r12 = r0.n(r1, r6)
            r3 = r3 | 4
            goto L_0x0072
        L_0x008e:
            java.lang.String r11 = r0.n(r1, r8)
            r3 = r3 | 2
            goto L_0x0072
        L_0x0095:
            r9 = 0
            java.lang.String r10 = r0.n(r1, r9)
            r3 = r3 | 1
            goto L_0x0058
        L_0x009d:
            r9 = 0
            r16 = r9
            goto L_0x0058
        L_0x00a1:
            r18 = r3
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00af:
            r0.c(r1)
            com.ingka.ikea.discover.impl.VisualMessageRemote r0 = new com.ingka.ikea.discover.impl.VisualMessageRemote
            r25 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.discover.impl.VisualMessageRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.discover.impl.VisualMessageRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, VisualMessageRemote visualMessageRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(visualMessageRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        VisualMessageRemote.c(visualMessageRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = VisualMessageRemote.f95554g[4];
        KSerializer<?> u10 = C17294a.u(ProductCatPLRemote$$serializer.INSTANCE);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, y02, y02, kSerializer, u10};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
