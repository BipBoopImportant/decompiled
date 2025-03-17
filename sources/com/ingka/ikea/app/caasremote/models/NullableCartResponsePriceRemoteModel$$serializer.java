package com.ingka.ikea.app.caasremote.models;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullableCartResponsePriceRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullableCartResponsePriceRemoteModel$$serializer implements N<NullableCartResponsePriceRemoteModel> {
    public static final NullableCartResponsePriceRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullableCartResponsePriceRemoteModel$$serializer nullableCartResponsePriceRemoteModel$$serializer = new NullableCartResponsePriceRemoteModel$$serializer();
        INSTANCE = nullableCartResponsePriceRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel", nullableCartResponsePriceRemoteModel$$serializer, 6);
        j02.p("currency", false);
        j02.p("fees", false);
        j02.p("proximityDiscounts", false);
        j02.p("taxSummaries", false);
        j02.p("totalPrice", false);
        j02.p("totalSavingsSummary", false);
        descriptor = j02;
    }

    private NullableCartResponsePriceRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r27) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r26.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel.f71252g
            boolean r3 = r0.q()
            r4 = 4
            r5 = 5
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r3 == 0) goto L_0x005e
            java.lang.String r3 = r0.n(r1, r9)
            com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r8, r9, r10)
            com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel r8 = (com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel) r8
            r9 = r2[r7]
            java.lang.Object r7 = r0.A(r1, r7, r9, r10)
            java.util.List r7 = (java.util.List) r7
            r9 = r2[r6]
            java.lang.Object r6 = r0.o(r1, r6, r9, r10)
            java.util.List r6 = (java.util.List) r6
            com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r4 = r0.o(r1, r4, r9, r10)
            com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel r4 = (com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel) r4
            r2 = r2[r5]
            java.lang.Object r2 = r0.A(r1, r5, r2, r10)
            java.util.List r2 = (java.util.List) r2
            r5 = 63
            r24 = r2
            r19 = r3
            r23 = r4
            r18 = r5
            r22 = r6
            r21 = r7
            r20 = r8
            goto L_0x00cc
        L_0x005e:
            r16 = r8
            r3 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0066:
            if (r16 == 0) goto L_0x00be
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x00ba;
                case 0: goto L_0x00b2;
                case 1: goto L_0x00a6;
                case 2: goto L_0x009a;
                case 3: goto L_0x008e;
                case 4: goto L_0x0082;
                case 5: goto L_0x0075;
                default: goto L_0x006f;
            }
        L_0x006f:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x0075:
            r9 = r2[r5]
            java.lang.Object r9 = r0.A(r1, r5, r9, r15)
            r15 = r9
            java.util.List r15 = (java.util.List) r15
            r3 = r3 | 32
        L_0x0080:
            r9 = 0
            goto L_0x0066
        L_0x0082:
            com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r9 = r0.o(r1, r4, r9, r14)
            r14 = r9
            com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel r14 = (com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel) r14
            r3 = r3 | 16
            goto L_0x0080
        L_0x008e:
            r9 = r2[r6]
            java.lang.Object r9 = r0.o(r1, r6, r9, r13)
            r13 = r9
            java.util.List r13 = (java.util.List) r13
            r3 = r3 | 8
            goto L_0x0080
        L_0x009a:
            r9 = r2[r7]
            java.lang.Object r9 = r0.A(r1, r7, r9, r12)
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            r3 = r3 | 4
            goto L_0x0080
        L_0x00a6:
            com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r8, r9, r11)
            r11 = r9
            com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel r11 = (com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel) r11
            r3 = r3 | 2
            goto L_0x0080
        L_0x00b2:
            r9 = 0
            java.lang.String r10 = r0.n(r1, r9)
            r3 = r3 | 1
            goto L_0x0066
        L_0x00ba:
            r9 = 0
            r16 = r9
            goto L_0x0066
        L_0x00be:
            r18 = r3
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
        L_0x00cc:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel
            r25 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullableCartResponsePriceRemoteModel nullableCartResponsePriceRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullableCartResponsePriceRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullableCartResponsePriceRemoteModel.d(nullableCartResponsePriceRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = NullableCartResponsePriceRemoteModel.f71252g;
        return new KSerializer[]{Y0.f144077a, C17294a.u(NullableFeesRemoteModel$$serializer.INSTANCE), C17294a.u(a10[2]), a10[3], TotalPriceResponseRemoteModel$$serializer.INSTANCE, C17294a.u(a10[5])};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
