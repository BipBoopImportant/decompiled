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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/DiscountCodeRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/DiscountCodeRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/DiscountCodeRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/DiscountCodeRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class DiscountCodeRemoteModel$$serializer implements N<DiscountCodeRemoteModel> {
    public static final DiscountCodeRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        DiscountCodeRemoteModel$$serializer discountCodeRemoteModel$$serializer = new DiscountCodeRemoteModel$$serializer();
        INSTANCE = discountCodeRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.DiscountCodeRemoteModel", discountCodeRemoteModel$$serializer, 5);
        j02.p("code", false);
        j02.p("description", false);
        j02.p("status", false);
        j02.p("validFrom", false);
        j02.p("validTo", false);
        descriptor = j02;
    }

    private DiscountCodeRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.ingka.ikea.app.caasremote.models.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.DiscountCodeRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r23.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.caasremote.models.DiscountCodeRemoteModel.f71139f
            boolean r3 = r0.q()
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = r0.n(r1, r8)
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r7 = r0.A(r1, r7, r8, r9)
            java.lang.String r7 = (java.lang.String) r7
            r2 = r2[r6]
            java.lang.Object r2 = r0.A(r1, r6, r2, r9)
            com.ingka.ikea.app.caasremote.models.i r2 = (com.ingka.ikea.app.caasremote.models.i) r2
            java.lang.Object r4 = r0.A(r1, r4, r8, r9)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.A(r1, r5, r8, r9)
            java.lang.String r5 = (java.lang.String) r5
            r6 = 31
            r19 = r2
            r17 = r3
            r20 = r4
            r21 = r5
            r16 = r6
            r18 = r7
            goto L_0x00b6
        L_0x004f:
            r14 = r7
            r3 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x0055:
            if (r14 == 0) goto L_0x00aa
            int r15 = r0.p(r1)
            r8 = -1
            if (r15 == r8) goto L_0x00a7
            if (r15 == 0) goto L_0x009f
            if (r15 == r7) goto L_0x0093
            if (r15 == r6) goto L_0x0087
            if (r15 == r4) goto L_0x007b
            if (r15 != r5) goto L_0x0075
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r5, r8, r13)
            r13 = r8
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 16
        L_0x0073:
            r8 = 0
            goto L_0x0055
        L_0x0075:
            fK.E r0 = new fK.E
            r0.<init>((int) r15)
            throw r0
        L_0x007b:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r4, r8, r12)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 8
            goto L_0x0073
        L_0x0087:
            r8 = r2[r6]
            java.lang.Object r8 = r0.A(r1, r6, r8, r11)
            r11 = r8
            com.ingka.ikea.app.caasremote.models.i r11 = (com.ingka.ikea.app.caasremote.models.i) r11
            r3 = r3 | 4
            goto L_0x0073
        L_0x0093:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r7, r8, r10)
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            r3 = r3 | 2
            goto L_0x0073
        L_0x009f:
            r8 = 0
            java.lang.String r9 = r0.n(r1, r8)
            r3 = r3 | 1
            goto L_0x0055
        L_0x00a7:
            r8 = 0
            r14 = r8
            goto L_0x0055
        L_0x00aa:
            r16 = r3
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
        L_0x00b6:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.DiscountCodeRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.DiscountCodeRemoteModel
            r22 = 0
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.DiscountCodeRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.DiscountCodeRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, DiscountCodeRemoteModel discountCodeRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(discountCodeRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        DiscountCodeRemoteModel.e(discountCodeRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = DiscountCodeRemoteModel.f71139f;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{y02, C17294a.u(y02), C17294a.u(a10[2]), C17294a.u(y02), C17294a.u(y02)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
