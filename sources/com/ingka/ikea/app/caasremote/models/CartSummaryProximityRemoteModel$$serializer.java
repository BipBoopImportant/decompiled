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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/CartSummaryProximityRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/CartSummaryProximityRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/CartSummaryProximityRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/CartSummaryProximityRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class CartSummaryProximityRemoteModel$$serializer implements N<CartSummaryProximityRemoteModel> {
    public static final CartSummaryProximityRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        CartSummaryProximityRemoteModel$$serializer cartSummaryProximityRemoteModel$$serializer = new CartSummaryProximityRemoteModel$$serializer();
        INSTANCE = cartSummaryProximityRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.CartSummaryProximityRemoteModel", cartSummaryProximityRemoteModel$$serializer, 9);
        j02.p("additionalPurchase", false);
        j02.p("discount", false);
        j02.p("discountId", false);
        j02.p("discountName", false);
        j02.p("discountQualification", false);
        j02.p("discountValidity", false);
        j02.p("isOrderDiscount", false);
        j02.p("isServiceDiscount", false);
        j02.p("itemLineReferences", false);
        descriptor = j02;
    }

    private CartSummaryProximityRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountValidityRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.CartSummaryProximityRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r30) {
        /*
            r29 = this;
            r0 = r30
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r29.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.caasremote.models.CartSummaryProximityRemoteModel.f71091j
            boolean r3 = r0.q()
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 2
            r9 = 3
            r10 = 8
            r11 = 1
            r12 = 0
            r13 = 0
            if (r3 == 0) goto L_0x0082
            com.ingka.ikea.app.caasremote.models.NullableCartProximityAdditionalPurchaseRemoteModel$$serializer r3 = com.ingka.ikea.app.caasremote.models.NullableCartProximityAdditionalPurchaseRemoteModel$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r12, r3, r13)
            com.ingka.ikea.app.caasremote.models.NullableCartProximityAdditionalPurchaseRemoteModel r3 = (com.ingka.ikea.app.caasremote.models.NullableCartProximityAdditionalPurchaseRemoteModel) r3
            com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountRemoteModel$$serializer r12 = com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountRemoteModel$$serializer.INSTANCE
            java.lang.Object r11 = r0.A(r1, r11, r12, r13)
            com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountRemoteModel r11 = (com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountRemoteModel) r11
            jK.Y0 r12 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r8, r12, r13)
            java.lang.String r8 = (java.lang.String) r8
            r12 = r2[r9]
            java.lang.Object r9 = r0.A(r1, r9, r12, r13)
            java.util.List r9 = (java.util.List) r9
            jK.M r12 = jK.M.f144051a
            java.lang.Object r7 = r0.A(r1, r7, r12, r13)
            java.lang.Float r7 = (java.lang.Float) r7
            com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountValidityRemoteModel$$serializer r12 = com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountValidityRemoteModel$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r6, r12, r13)
            com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountValidityRemoteModel r6 = (com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountValidityRemoteModel) r6
            jK.i r12 = jK.C17457i.f144111a
            java.lang.Object r5 = r0.A(r1, r5, r12, r13)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            java.lang.Object r4 = r0.A(r1, r4, r12, r13)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r2 = r2[r10]
            java.lang.Object r2 = r0.A(r1, r10, r2, r13)
            java.util.List r2 = (java.util.List) r2
            r10 = 511(0x1ff, float:7.16E-43)
            r27 = r2
            r19 = r3
            r26 = r4
            r25 = r5
            r24 = r6
            r23 = r7
            r21 = r8
            r22 = r9
            r18 = r10
            r20 = r11
            goto L_0x0130
        L_0x0082:
            r16 = r11
            r3 = r12
            r6 = r13
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r15 = r14
        L_0x008d:
            if (r16 == 0) goto L_0x011c
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x0118;
                case 0: goto L_0x010a;
                case 1: goto L_0x00fc;
                case 2: goto L_0x00ee;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00d3;
                case 5: goto L_0x00c4;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00a9;
                case 8: goto L_0x009c;
                default: goto L_0x0096;
            }
        L_0x0096:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x009c:
            r5 = r2[r10]
            java.lang.Object r5 = r0.A(r1, r10, r5, r6)
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            r3 = r3 | 256(0x100, float:3.59E-43)
        L_0x00a7:
            r5 = 6
            goto L_0x008d
        L_0x00a9:
            jK.i r5 = jK.C17457i.f144111a
            java.lang.Object r5 = r0.A(r1, r4, r5, r7)
            r7 = r5
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x00a7
        L_0x00b5:
            jK.i r5 = jK.C17457i.f144111a
            r4 = 6
            java.lang.Object r5 = r0.A(r1, r4, r5, r9)
            r9 = r5
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r3 = r3 | 64
            r5 = r4
            r4 = 7
            goto L_0x008d
        L_0x00c4:
            r4 = 6
            com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountValidityRemoteModel$$serializer r5 = com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountValidityRemoteModel$$serializer.INSTANCE
            r4 = 5
            java.lang.Object r5 = r0.A(r1, r4, r5, r8)
            r8 = r5
            com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountValidityRemoteModel r8 = (com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountValidityRemoteModel) r8
            r3 = r3 | 32
        L_0x00d1:
            r4 = 7
            goto L_0x00a7
        L_0x00d3:
            r4 = 5
            jK.M r5 = jK.M.f144051a
            r4 = 4
            java.lang.Object r5 = r0.A(r1, r4, r5, r11)
            r11 = r5
            java.lang.Float r11 = (java.lang.Float) r11
            r3 = r3 | 16
            goto L_0x00d1
        L_0x00e1:
            r5 = 3
            r4 = r2[r5]
            java.lang.Object r4 = r0.A(r1, r5, r4, r12)
            r12 = r4
            java.util.List r12 = (java.util.List) r12
            r3 = r3 | 8
            goto L_0x00d1
        L_0x00ee:
            r5 = 3
            jK.Y0 r4 = jK.Y0.f144077a
            r5 = 2
            java.lang.Object r4 = r0.A(r1, r5, r4, r15)
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 4
            goto L_0x00d1
        L_0x00fc:
            r5 = 2
            com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountRemoteModel$$serializer.INSTANCE
            r5 = 1
            java.lang.Object r4 = r0.A(r1, r5, r4, r14)
            r14 = r4
            com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountRemoteModel r14 = (com.ingka.ikea.app.caasremote.models.NullableCartProximityDiscountRemoteModel) r14
            r3 = r3 | 2
            goto L_0x00d1
        L_0x010a:
            r5 = 1
            com.ingka.ikea.app.caasremote.models.NullableCartProximityAdditionalPurchaseRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableCartProximityAdditionalPurchaseRemoteModel$$serializer.INSTANCE
            r5 = 0
            java.lang.Object r4 = r0.A(r1, r5, r4, r13)
            r13 = r4
            com.ingka.ikea.app.caasremote.models.NullableCartProximityAdditionalPurchaseRemoteModel r13 = (com.ingka.ikea.app.caasremote.models.NullableCartProximityAdditionalPurchaseRemoteModel) r13
            r3 = r3 | 1
            goto L_0x00d1
        L_0x0118:
            r5 = 0
            r16 = r5
            goto L_0x00a7
        L_0x011c:
            r18 = r3
            r27 = r6
            r26 = r7
            r24 = r8
            r25 = r9
            r23 = r11
            r22 = r12
            r19 = r13
            r20 = r14
            r21 = r15
        L_0x0130:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.CartSummaryProximityRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.CartSummaryProximityRemoteModel
            r28 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.CartSummaryProximityRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.CartSummaryProximityRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, CartSummaryProximityRemoteModel cartSummaryProximityRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(cartSummaryProximityRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        CartSummaryProximityRemoteModel.b(cartSummaryProximityRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = CartSummaryProximityRemoteModel.f71091j;
        KSerializer<?> u10 = C17294a.u(NullableCartProximityAdditionalPurchaseRemoteModel$$serializer.INSTANCE);
        KSerializer<?> u11 = C17294a.u(NullableCartProximityDiscountRemoteModel$$serializer.INSTANCE);
        KSerializer<?> u12 = C17294a.u(Y0.f144077a);
        KSerializer<?> u13 = C17294a.u(a10[3]);
        KSerializer<?> u14 = C17294a.u(M.f144051a);
        KSerializer<?> u15 = C17294a.u(NullableCartProximityDiscountValidityRemoteModel$$serializer.INSTANCE);
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{u10, u11, u12, u13, u14, u15, C17294a.u(iVar), C17294a.u(iVar), C17294a.u(a10[8])};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
