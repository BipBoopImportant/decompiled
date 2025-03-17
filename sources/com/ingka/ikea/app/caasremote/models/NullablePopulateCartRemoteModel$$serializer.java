package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullablePopulateCartRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullablePopulateCartRemoteModel$$serializer implements N<NullablePopulateCartRemoteModel> {
    public static final NullablePopulateCartRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullablePopulateCartRemoteModel$$serializer nullablePopulateCartRemoteModel$$serializer = new NullablePopulateCartRemoteModel$$serializer();
        INSTANCE = nullablePopulateCartRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel", nullablePopulateCartRemoteModel$$serializer, 9);
        j02.p("fetchCartContext", true);
        j02.p("fetchDiscountCodes", true);
        j02.p("fetchIndicativeAvailability", true);
        j02.p("fetchItemInfo", true);
        j02.p("fetchPrice", true);
        j02.p("fetchServices", true);
        j02.p("postCode", true);
        j02.p("stateCode", true);
        j02.p("storeId", true);
        descriptor = j02;
    }

    private NullablePopulateCartRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r30) {
        /*
            r29 = this;
            r0 = r30
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r29.getDescriptor()
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 8
            r8 = 4
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 0
            if (r2 == 0) goto L_0x0072
            jK.i r2 = jK.C17457i.f144111a
            java.lang.Object r11 = r0.A(r1, r11, r2, r12)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            java.lang.Object r10 = r0.A(r1, r10, r2, r12)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r9 = r0.A(r1, r9, r2, r12)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.Object r6 = r0.A(r1, r6, r2, r12)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Object r8 = r0.A(r1, r8, r2, r12)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            java.lang.Object r2 = r0.A(r1, r5, r2, r12)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            jK.Y0 r5 = jK.Y0.f144077a
            java.lang.Object r4 = r0.A(r1, r4, r5, r12)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.A(r1, r3, r5, r12)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r0.A(r1, r7, r5, r12)
            java.lang.String r5 = (java.lang.String) r5
            r7 = 511(0x1ff, float:7.16E-43)
            r24 = r2
            r26 = r3
            r25 = r4
            r27 = r5
            r22 = r6
            r18 = r7
            r23 = r8
            r21 = r9
            r20 = r10
            r19 = r11
            goto L_0x011f
        L_0x0072:
            r16 = r10
            r2 = r11
            r6 = r12
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x007d:
            if (r16 == 0) goto L_0x010b
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x0107;
                case 0: goto L_0x00f9;
                case 1: goto L_0x00eb;
                case 2: goto L_0x00dd;
                case 3: goto L_0x00cf;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00b1;
                case 6: goto L_0x00a5;
                case 7: goto L_0x0099;
                case 8: goto L_0x008c;
                default: goto L_0x0086;
            }
        L_0x0086:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x008c:
            jK.Y0 r5 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r7, r5, r8)
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            r2 = r2 | 256(0x100, float:3.59E-43)
        L_0x0097:
            r5 = 5
            goto L_0x007d
        L_0x0099:
            jK.Y0 r5 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r3, r5, r6)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x0097
        L_0x00a5:
            jK.Y0 r5 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r4, r5, r9)
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 64
            goto L_0x0097
        L_0x00b1:
            jK.i r5 = jK.C17457i.f144111a
            r3 = 5
            java.lang.Object r5 = r0.A(r1, r3, r5, r10)
            r10 = r5
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r2 = r2 | 32
            r5 = r3
            r3 = 7
            goto L_0x007d
        L_0x00c0:
            r3 = 5
            jK.i r5 = jK.C17457i.f144111a
            r3 = 4
            java.lang.Object r5 = r0.A(r1, r3, r5, r11)
            r11 = r5
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r2 = r2 | 16
        L_0x00cd:
            r3 = 7
            goto L_0x0097
        L_0x00cf:
            r3 = 4
            jK.i r5 = jK.C17457i.f144111a
            r3 = 3
            java.lang.Object r5 = r0.A(r1, r3, r5, r15)
            r15 = r5
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            r2 = r2 | 8
            goto L_0x00cd
        L_0x00dd:
            r3 = 3
            jK.i r5 = jK.C17457i.f144111a
            r3 = 2
            java.lang.Object r5 = r0.A(r1, r3, r5, r14)
            r14 = r5
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r2 = r2 | 4
            goto L_0x00cd
        L_0x00eb:
            r3 = 2
            jK.i r5 = jK.C17457i.f144111a
            r3 = 1
            java.lang.Object r5 = r0.A(r1, r3, r5, r13)
            r13 = r5
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r2 = r2 | 2
            goto L_0x00cd
        L_0x00f9:
            r3 = 1
            jK.i r5 = jK.C17457i.f144111a
            r3 = 0
            java.lang.Object r5 = r0.A(r1, r3, r5, r12)
            r12 = r5
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r2 = r2 | 1
            goto L_0x00cd
        L_0x0107:
            r3 = 0
            r16 = r3
            goto L_0x00cd
        L_0x010b:
            r18 = r2
            r26 = r6
            r27 = r8
            r25 = r9
            r24 = r10
            r23 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x011f:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel
            r28 = 0
            r17 = r0
            r17.<init>((int) r18, (java.lang.Boolean) r19, (java.lang.Boolean) r20, (java.lang.Boolean) r21, (java.lang.Boolean) r22, (java.lang.Boolean) r23, (java.lang.Boolean) r24, (java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (jK.T0) r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.NullablePopulateCartRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullablePopulateCartRemoteModel nullablePopulateCartRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullablePopulateCartRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullablePopulateCartRemoteModel.a(nullablePopulateCartRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        C17457i iVar = C17457i.f144111a;
        KSerializer<?> u10 = C17294a.u(iVar);
        KSerializer<?> u11 = C17294a.u(iVar);
        KSerializer<?> u12 = C17294a.u(iVar);
        KSerializer<?> u13 = C17294a.u(iVar);
        KSerializer<?> u14 = C17294a.u(iVar);
        KSerializer<?> u15 = C17294a.u(iVar);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{u10, u11, u12, u13, u14, u15, C17294a.u(y02), C17294a.u(y02), C17294a.u(y02)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
