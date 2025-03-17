package com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/SuggestionsRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/SuggestionsRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/SuggestionsRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/SuggestionsRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class SuggestionsRemote$$serializer implements N<SuggestionsRemote> {
    public static final SuggestionsRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuggestionsRemote$$serializer suggestionsRemote$$serializer = new SuggestionsRemote$$serializer();
        INSTANCE = suggestionsRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.SuggestionsRemote", suggestionsRemote$$serializer, 6);
        j02.p("autocomplete", false);
        j02.p("productCategories", false);
        j02.p("rooms", false);
        j02.p("items", false);
        j02.p("bottomAutocomplete", false);
        j02.p("links", false);
        descriptor = j02;
    }

    private SuggestionsRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.SuggestionsRemote deserialize(kotlinx.serialization.encoding.Decoder r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.SuggestionsRemote.f93365g
            boolean r3 = r0.q()
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x0060
            r3 = r2[r9]
            java.lang.Object r3 = r0.o(r1, r9, r3, r10)
            java.util.List r3 = (java.util.List) r3
            r9 = r2[r8]
            java.lang.Object r8 = r0.A(r1, r8, r9, r10)
            java.util.List r8 = (java.util.List) r8
            r9 = r2[r7]
            java.lang.Object r7 = r0.A(r1, r7, r9, r10)
            java.util.List r7 = (java.util.List) r7
            r9 = r2[r5]
            java.lang.Object r5 = r0.A(r1, r5, r9, r10)
            java.util.List r5 = (java.util.List) r5
            r9 = r2[r6]
            java.lang.Object r6 = r0.A(r1, r6, r9, r10)
            java.util.List r6 = (java.util.List) r6
            r2 = r2[r4]
            java.lang.Object r2 = r0.A(r1, r4, r2, r10)
            java.util.List r2 = (java.util.List) r2
            r4 = 63
            r24 = r2
            r19 = r3
            r18 = r4
            r22 = r5
            r23 = r6
            r21 = r7
            r20 = r8
            goto L_0x00d4
        L_0x0060:
            r16 = r8
            r3 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0068:
            if (r16 == 0) goto L_0x00c6
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00c2;
                case 0: goto L_0x00b4;
                case 1: goto L_0x00a8;
                case 2: goto L_0x009c;
                case 3: goto L_0x0090;
                case 4: goto L_0x0084;
                case 5: goto L_0x0077;
                default: goto L_0x0071;
            }
        L_0x0071:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0077:
            r9 = r2[r4]
            java.lang.Object r9 = r0.A(r1, r4, r9, r15)
            r15 = r9
            java.util.List r15 = (java.util.List) r15
            r3 = r3 | 32
        L_0x0082:
            r9 = 0
            goto L_0x0068
        L_0x0084:
            r9 = r2[r6]
            java.lang.Object r9 = r0.A(r1, r6, r9, r14)
            r14 = r9
            java.util.List r14 = (java.util.List) r14
            r3 = r3 | 16
            goto L_0x0082
        L_0x0090:
            r9 = r2[r5]
            java.lang.Object r9 = r0.A(r1, r5, r9, r13)
            r13 = r9
            java.util.List r13 = (java.util.List) r13
            r3 = r3 | 8
            goto L_0x0082
        L_0x009c:
            r9 = r2[r7]
            java.lang.Object r9 = r0.A(r1, r7, r9, r12)
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            r3 = r3 | 4
            goto L_0x0082
        L_0x00a8:
            r9 = r2[r8]
            java.lang.Object r9 = r0.A(r1, r8, r9, r11)
            r11 = r9
            java.util.List r11 = (java.util.List) r11
            r3 = r3 | 2
            goto L_0x0082
        L_0x00b4:
            r9 = 0
            r4 = r2[r9]
            java.lang.Object r4 = r0.o(r1, r9, r4, r10)
            r10 = r4
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 1
            r4 = 5
            goto L_0x0068
        L_0x00c2:
            r9 = 0
            r16 = r9
            goto L_0x0068
        L_0x00c6:
            r18 = r3
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00d4:
            r0.c(r1)
            com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.SuggestionsRemote r0 = new com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.SuggestionsRemote
            r25 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.SuggestionsRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models.SuggestionsRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, SuggestionsRemote suggestionsRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(suggestionsRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        SuggestionsRemote.c(suggestionsRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = SuggestionsRemote.f93365g;
        return new KSerializer[]{a10[0], C17294a.u(a10[1]), C17294a.u(a10[2]), C17294a.u(a10[3]), C17294a.u(a10[4]), C17294a.u(a10[5])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
