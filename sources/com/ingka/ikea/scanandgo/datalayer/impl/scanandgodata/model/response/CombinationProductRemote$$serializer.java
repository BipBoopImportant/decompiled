package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class CombinationProductRemote$$serializer implements N<CombinationProductRemote> {
    public static final CombinationProductRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CombinationProductRemote$$serializer combinationProductRemote$$serializer = new CombinationProductRemote$$serializer();
        INSTANCE = combinationProductRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductRemote", combinationProductRemote$$serializer, 7);
        j02.p("combinationNumber", false);
        j02.p("combinationName", false);
        j02.p("combinationQuantity", false);
        j02.p("combinationImages", false);
        j02.p("basedOnSPR", false);
        j02.p("detailedCombinationInfo", false);
        j02.p("childItems", false);
        descriptor = j02;
    }

    private CombinationProductRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductDetailsRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductRemote deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductRemote.f120002h
            boolean r3 = r0.q()
            r4 = 5
            r5 = 4
            r6 = 2
            r7 = 6
            r8 = 3
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = r0.n(r1, r10)
            java.lang.String r9 = r0.n(r1, r9)
            int r6 = r0.j(r1, r6)
            r10 = r2[r8]
            java.lang.Object r8 = r0.o(r1, r8, r10, r11)
            java.util.List r8 = (java.util.List) r8
            jK.Y0 r10 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r10, r11)
            java.lang.String r5 = (java.lang.String) r5
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductDetailsRemote$$serializer r10 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductDetailsRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.o(r1, r4, r10, r11)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductDetailsRemote r4 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductDetailsRemote) r4
            r2 = r2[r7]
            java.lang.Object r2 = r0.o(r1, r7, r2, r11)
            java.util.List r2 = (java.util.List) r2
            r7 = 127(0x7f, float:1.78E-43)
            r26 = r2
            r20 = r3
            r25 = r4
            r24 = r5
            r22 = r6
            r19 = r7
            r23 = r8
            r21 = r9
            goto L_0x00de
        L_0x005f:
            r17 = r9
            r3 = r10
            r9 = r11
            r12 = r9
            r13 = r12
            r14 = r13
            r15 = r14
            r10 = r15
            r11 = r3
        L_0x0069:
            if (r17 == 0) goto L_0x00ce
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00c9;
                case 0: goto L_0x00bc;
                case 1: goto L_0x00b1;
                case 2: goto L_0x00a9;
                case 3: goto L_0x009d;
                case 4: goto L_0x0091;
                case 5: goto L_0x0085;
                case 6: goto L_0x0078;
                default: goto L_0x0072;
            }
        L_0x0072:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x0078:
            r6 = r2[r7]
            java.lang.Object r6 = r0.o(r1, r7, r6, r9)
            r9 = r6
            java.util.List r9 = (java.util.List) r9
            r11 = r11 | 64
        L_0x0083:
            r6 = 2
            goto L_0x0069
        L_0x0085:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductDetailsRemote$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductDetailsRemote$$serializer.INSTANCE
            java.lang.Object r6 = r0.o(r1, r4, r6, r10)
            r10 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductDetailsRemote r10 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductDetailsRemote) r10
            r11 = r11 | 32
            goto L_0x0083
        L_0x0091:
            jK.Y0 r6 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r5, r6, r15)
            r15 = r6
            java.lang.String r15 = (java.lang.String) r15
            r11 = r11 | 16
            goto L_0x0083
        L_0x009d:
            r6 = r2[r8]
            java.lang.Object r6 = r0.o(r1, r8, r6, r14)
            r14 = r6
            java.util.List r14 = (java.util.List) r14
            r11 = r11 | 8
            goto L_0x0083
        L_0x00a9:
            r6 = 2
            int r3 = r0.j(r1, r6)
            r11 = r11 | 4
            goto L_0x0069
        L_0x00b1:
            r6 = 2
            r13 = 1
            java.lang.String r16 = r0.n(r1, r13)
            r11 = r11 | 2
            r13 = r16
            goto L_0x0069
        L_0x00bc:
            r6 = 2
            r12 = 0
            r16 = 1
            java.lang.String r18 = r0.n(r1, r12)
            r11 = r11 | 1
            r12 = r18
            goto L_0x0069
        L_0x00c9:
            r16 = 1
            r17 = 0
            goto L_0x0083
        L_0x00ce:
            r22 = r3
            r26 = r9
            r25 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r23 = r14
            r24 = r15
        L_0x00de:
            r0.c(r1)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductRemote r0 = new com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductRemote
            r27 = 0
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, CombinationProductRemote combinationProductRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(combinationProductRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        CombinationProductRemote.i(combinationProductRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = CombinationProductRemote.f120002h;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, y02, X.f144073a, a10[3], C17294a.u(y02), CombinationProductDetailsRemote$$serializer.INSTANCE, a10[6]};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
