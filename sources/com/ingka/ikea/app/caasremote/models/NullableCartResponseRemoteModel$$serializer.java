package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.M;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullableCartResponseRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullableCartResponseRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullableCartResponseRemoteModel$$serializer implements N<NullableCartResponseRemoteModel> {
    public static final NullableCartResponseRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullableCartResponseRemoteModel$$serializer nullableCartResponseRemoteModel$$serializer = new NullableCartResponseRemoteModel$$serializer();
        INSTANCE = nullableCartResponseRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullableCartResponseRemoteModel", nullableCartResponseRemoteModel$$serializer, 12);
        j02.p("cartId", false);
        j02.p("customer", false);
        j02.p("deliveryPrices", false);
        j02.p("discountCodes", false);
        j02.p("employeeDiscountConsent", false);
        j02.p("empty", false);
        j02.p("fulfilment", false);
        j02.p("groups", false);
        j02.p("price", false);
        j02.p("quantity", false);
        j02.p("services", false);
        j02.p("updatedAt", false);
        descriptor = j02;
    }

    private NullableCartResponseRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.ingka.ikea.app.caasremote.models.CustomerContextRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: com.ingka.ikea.app.caasremote.models.NullableMapRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: com.ingka.ikea.app.caasremote.models.NullableCartFulfilmentResponseRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0101, code lost:
        r3 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0103, code lost:
        r5 = 10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.NullableCartResponseRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r38) {
        /*
            r37 = this;
            r0 = r38
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r37.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.caasremote.models.NullableCartResponseRemoteModel.f71259m
            boolean r3 = r0.q()
            r5 = 10
            r6 = 9
            r7 = 6
            r8 = 5
            r9 = 8
            r10 = 4
            r11 = 2
            r12 = 7
            r13 = 3
            r14 = 1
            r15 = 0
            r4 = 0
            if (r3 == 0) goto L_0x0094
            java.lang.String r3 = r0.n(r1, r15)
            com.ingka.ikea.app.caasremote.models.CustomerContextRemoteModel$$serializer r15 = com.ingka.ikea.app.caasremote.models.CustomerContextRemoteModel$$serializer.INSTANCE
            java.lang.Object r14 = r0.o(r1, r14, r15, r4)
            com.ingka.ikea.app.caasremote.models.CustomerContextRemoteModel r14 = (com.ingka.ikea.app.caasremote.models.CustomerContextRemoteModel) r14
            com.ingka.ikea.app.caasremote.models.NullableMapRemoteModel$$serializer r15 = com.ingka.ikea.app.caasremote.models.NullableMapRemoteModel$$serializer.INSTANCE
            java.lang.Object r11 = r0.A(r1, r11, r15, r4)
            com.ingka.ikea.app.caasremote.models.NullableMapRemoteModel r11 = (com.ingka.ikea.app.caasremote.models.NullableMapRemoteModel) r11
            r15 = r2[r13]
            java.lang.Object r13 = r0.o(r1, r13, r15, r4)
            java.util.List r13 = (java.util.List) r13
            boolean r10 = r0.D(r1, r10)
            boolean r8 = r0.D(r1, r8)
            com.ingka.ikea.app.caasremote.models.NullableCartFulfilmentResponseRemoteModel$$serializer r15 = com.ingka.ikea.app.caasremote.models.NullableCartFulfilmentResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r7, r15, r4)
            com.ingka.ikea.app.caasremote.models.NullableCartFulfilmentResponseRemoteModel r7 = (com.ingka.ikea.app.caasremote.models.NullableCartFulfilmentResponseRemoteModel) r7
            r2 = r2[r12]
            java.lang.Object r2 = r0.o(r1, r12, r2, r4)
            java.util.List r2 = (java.util.List) r2
            com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel$$serializer r12 = com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r9, r12, r4)
            com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel r9 = (com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel) r9
            float r6 = r0.v(r1, r6)
            com.ingka.ikea.app.caasremote.models.NullableCartResponseServicesRemoteModel$$serializer r12 = com.ingka.ikea.app.caasremote.models.NullableCartResponseServicesRemoteModel$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r5, r12, r4)
            com.ingka.ikea.app.caasremote.models.NullableCartResponseServicesRemoteModel r4 = (com.ingka.ikea.app.caasremote.models.NullableCartResponseServicesRemoteModel) r4
            r5 = 11
            java.lang.String r5 = r0.n(r1, r5)
            r12 = 4095(0xfff, float:5.738E-42)
            r31 = r2
            r24 = r3
            r34 = r4
            r35 = r5
            r33 = r6
            r30 = r7
            r29 = r8
            r32 = r9
            r28 = r10
            r26 = r11
            r23 = r12
            r27 = r13
            r25 = r14
            goto L_0x016f
        L_0x0094:
            r3 = 11
            r16 = 0
            r7 = r4
            r8 = r7
            r10 = r8
            r11 = r10
            r13 = r11
            r17 = r13
            r21 = r14
            r12 = r15
            r19 = r12
            r20 = r19
            r18 = r16
            r14 = r17
            r15 = r14
        L_0x00ab:
            if (r21 == 0) goto L_0x0155
            int r9 = r0.p(r1)
            switch(r9) {
                case -1: goto L_0x0150;
                case 0: goto L_0x0146;
                case 1: goto L_0x0137;
                case 2: goto L_0x0128;
                case 3: goto L_0x011a;
                case 4: goto L_0x0110;
                case 5: goto L_0x0106;
                case 6: goto L_0x00f4;
                case 7: goto L_0x00e5;
                case 8: goto L_0x00d5;
                case 9: goto L_0x00ce;
                case 10: goto L_0x00c3;
                case 11: goto L_0x00ba;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            fK.E r0 = new fK.E
            r0.<init>((int) r9)
            throw r0
        L_0x00ba:
            java.lang.String r17 = r0.n(r1, r3)
            r12 = r12 | 2048(0x800, float:2.87E-42)
        L_0x00c0:
            r9 = 8
            goto L_0x00ab
        L_0x00c3:
            com.ingka.ikea.app.caasremote.models.NullableCartResponseServicesRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullableCartResponseServicesRemoteModel$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r5, r9, r7)
            com.ingka.ikea.app.caasremote.models.NullableCartResponseServicesRemoteModel r7 = (com.ingka.ikea.app.caasremote.models.NullableCartResponseServicesRemoteModel) r7
            r12 = r12 | 1024(0x400, float:1.435E-42)
            goto L_0x00c0
        L_0x00ce:
            float r18 = r0.v(r1, r6)
            r12 = r12 | 512(0x200, float:7.175E-43)
            goto L_0x00c0
        L_0x00d5:
            com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel$$serializer.INSTANCE
            r3 = 8
            java.lang.Object r8 = r0.A(r1, r3, r9, r8)
            com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel r8 = (com.ingka.ikea.app.caasremote.models.NullableCartResponsePriceRemoteModel) r8
            r12 = r12 | 256(0x100, float:3.59E-43)
            r9 = r3
            r3 = 11
            goto L_0x00ab
        L_0x00e5:
            r9 = 7
            r3 = r2[r9]
            java.lang.Object r3 = r0.o(r1, r9, r3, r10)
            r10 = r3
            java.util.List r10 = (java.util.List) r10
            r12 = r12 | 128(0x80, float:1.794E-43)
            r3 = 11
            goto L_0x00c0
        L_0x00f4:
            r9 = 7
            com.ingka.ikea.app.caasremote.models.NullableCartFulfilmentResponseRemoteModel$$serializer r3 = com.ingka.ikea.app.caasremote.models.NullableCartFulfilmentResponseRemoteModel$$serializer.INSTANCE
            r5 = 6
            java.lang.Object r3 = r0.A(r1, r5, r3, r13)
            r13 = r3
            com.ingka.ikea.app.caasremote.models.NullableCartFulfilmentResponseRemoteModel r13 = (com.ingka.ikea.app.caasremote.models.NullableCartFulfilmentResponseRemoteModel) r13
            r12 = r12 | 64
        L_0x0101:
            r3 = 11
        L_0x0103:
            r5 = 10
            goto L_0x00c0
        L_0x0106:
            r3 = 5
            r5 = 6
            r9 = 7
            boolean r19 = r0.D(r1, r3)
            r12 = r12 | 32
            goto L_0x0101
        L_0x0110:
            r3 = 4
            r5 = 6
            r9 = 7
            boolean r20 = r0.D(r1, r3)
            r12 = r12 | 16
            goto L_0x0101
        L_0x011a:
            r3 = 3
            r9 = 7
            r5 = r2[r3]
            java.lang.Object r5 = r0.o(r1, r3, r5, r11)
            r11 = r5
            java.util.List r11 = (java.util.List) r11
            r12 = r12 | 8
            goto L_0x0101
        L_0x0128:
            r3 = 3
            r9 = 7
            com.ingka.ikea.app.caasremote.models.NullableMapRemoteModel$$serializer r5 = com.ingka.ikea.app.caasremote.models.NullableMapRemoteModel$$serializer.INSTANCE
            r3 = 2
            java.lang.Object r5 = r0.A(r1, r3, r5, r14)
            r14 = r5
            com.ingka.ikea.app.caasremote.models.NullableMapRemoteModel r14 = (com.ingka.ikea.app.caasremote.models.NullableMapRemoteModel) r14
            r12 = r12 | 4
            goto L_0x0101
        L_0x0137:
            r3 = 2
            r9 = 7
            com.ingka.ikea.app.caasremote.models.CustomerContextRemoteModel$$serializer r5 = com.ingka.ikea.app.caasremote.models.CustomerContextRemoteModel$$serializer.INSTANCE
            r3 = 1
            java.lang.Object r5 = r0.o(r1, r3, r5, r15)
            r15 = r5
            com.ingka.ikea.app.caasremote.models.CustomerContextRemoteModel r15 = (com.ingka.ikea.app.caasremote.models.CustomerContextRemoteModel) r15
            r12 = r12 | 2
            goto L_0x0101
        L_0x0146:
            r3 = 1
            r5 = 0
            r9 = 7
            java.lang.String r4 = r0.n(r1, r5)
            r12 = r12 | 1
            goto L_0x0101
        L_0x0150:
            r5 = 0
            r9 = 7
            r21 = r5
            goto L_0x0103
        L_0x0155:
            r24 = r4
            r34 = r7
            r32 = r8
            r31 = r10
            r27 = r11
            r23 = r12
            r30 = r13
            r26 = r14
            r25 = r15
            r35 = r17
            r33 = r18
            r29 = r19
            r28 = r20
        L_0x016f:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.NullableCartResponseRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.NullableCartResponseRemoteModel
            r36 = 0
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.NullableCartResponseRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.NullableCartResponseRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullableCartResponseRemoteModel nullableCartResponseRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullableCartResponseRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullableCartResponseRemoteModel.n(nullableCartResponseRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = NullableCartResponseRemoteModel.f71259m;
        KSerializer<?> u10 = C17294a.u(NullableMapRemoteModel$$serializer.INSTANCE);
        KSerializer<?> kSerializer = a10[3];
        KSerializer<?> u11 = C17294a.u(NullableCartFulfilmentResponseRemoteModel$$serializer.INSTANCE);
        KSerializer<?> kSerializer2 = a10[7];
        KSerializer<?> u12 = C17294a.u(NullableCartResponsePriceRemoteModel$$serializer.INSTANCE);
        KSerializer<?> u13 = C17294a.u(NullableCartResponseServicesRemoteModel$$serializer.INSTANCE);
        Y0 y02 = Y0.f144077a;
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{y02, CustomerContextRemoteModel$$serializer.INSTANCE, u10, kSerializer, iVar, iVar, u11, kSerializer2, u12, M.f144051a, u13, y02};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
