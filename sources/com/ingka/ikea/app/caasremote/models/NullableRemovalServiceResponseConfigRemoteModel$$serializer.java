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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseConfigRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseConfigRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseConfigRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseConfigRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullableRemovalServiceResponseConfigRemoteModel$$serializer implements N<NullableRemovalServiceResponseConfigRemoteModel> {
    public static final NullableRemovalServiceResponseConfigRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullableRemovalServiceResponseConfigRemoteModel$$serializer nullableRemovalServiceResponseConfigRemoteModel$$serializer = new NullableRemovalServiceResponseConfigRemoteModel$$serializer();
        INSTANCE = nullableRemovalServiceResponseConfigRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel", nullableRemovalServiceResponseConfigRemoteModel$$serializer, 5);
        j02.p("id", false);
        j02.p("payToProvider", false);
        j02.p("priceCalculationType", false);
        j02.p("provider", false);
        j02.p("type", false);
        descriptor = j02;
    }

    private NullableRemovalServiceResponseConfigRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.ingka.ikea.app.caasremote.models.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r25) {
        /*
            r24 = this;
            r0 = r25
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r24.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel.f71397f
            boolean r3 = r0.q()
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x0053
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r8, r3, r9)
            java.lang.String r8 = (java.lang.String) r8
            jK.i r10 = jK.C17457i.f144111a
            java.lang.Object r7 = r0.A(r1, r7, r10, r9)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r2 = r2[r6]
            java.lang.Object r2 = r0.A(r1, r6, r2, r9)
            com.ingka.ikea.app.caasremote.models.f r2 = (com.ingka.ikea.app.caasremote.models.f) r2
            java.lang.Object r4 = r0.A(r1, r4, r3, r9)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.A(r1, r5, r3, r9)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 31
            r20 = r2
            r22 = r3
            r21 = r4
            r17 = r5
            r19 = r7
            r18 = r8
            goto L_0x00c1
        L_0x0053:
            r14 = r7
            r3 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x0059:
            if (r14 == 0) goto L_0x00b5
            int r15 = r0.p(r1)
            r8 = -1
            if (r15 == r8) goto L_0x00b1
            if (r15 == 0) goto L_0x00a3
            if (r15 == r7) goto L_0x0097
            if (r15 == r6) goto L_0x008b
            if (r15 == r4) goto L_0x007f
            if (r15 != r5) goto L_0x0079
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r5, r8, r13)
            r13 = r8
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 16
        L_0x0077:
            r8 = 0
            goto L_0x0059
        L_0x0079:
            fK.E r0 = new fK.E
            r0.<init>((int) r15)
            throw r0
        L_0x007f:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r4, r8, r12)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 8
            goto L_0x0077
        L_0x008b:
            r8 = r2[r6]
            java.lang.Object r8 = r0.A(r1, r6, r8, r11)
            r11 = r8
            com.ingka.ikea.app.caasremote.models.f r11 = (com.ingka.ikea.app.caasremote.models.f) r11
            r3 = r3 | 4
            goto L_0x0077
        L_0x0097:
            jK.i r8 = jK.C17457i.f144111a
            java.lang.Object r8 = r0.A(r1, r7, r8, r10)
            r10 = r8
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r3 = r3 | 2
            goto L_0x0077
        L_0x00a3:
            jK.Y0 r8 = jK.Y0.f144077a
            r15 = 0
            java.lang.Object r8 = r0.A(r1, r15, r8, r9)
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r3 = r3 | 1
            r8 = r15
            goto L_0x0059
        L_0x00b1:
            r15 = 0
            r8 = r15
            r14 = r8
            goto L_0x0059
        L_0x00b5:
            r17 = r3
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
        L_0x00c1:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel
            r23 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullableRemovalServiceResponseConfigRemoteModel nullableRemovalServiceResponseConfigRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullableRemovalServiceResponseConfigRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullableRemovalServiceResponseConfigRemoteModel.b(nullableRemovalServiceResponseConfigRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = NullableRemovalServiceResponseConfigRemoteModel.f71397f;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(C17457i.f144111a), C17294a.u(a10[2]), C17294a.u(y02), C17294a.u(y02)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
