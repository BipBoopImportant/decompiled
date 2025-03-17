package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullablePlanResponseAssemblyServiceRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseAssemblyServiceRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseAssemblyServiceRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullablePlanResponseAssemblyServiceRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullablePlanResponseAssemblyServiceRemoteModel$$serializer implements N<NullablePlanResponseAssemblyServiceRemoteModel> {
    public static final NullablePlanResponseAssemblyServiceRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullablePlanResponseAssemblyServiceRemoteModel$$serializer nullablePlanResponseAssemblyServiceRemoteModel$$serializer = new NullablePlanResponseAssemblyServiceRemoteModel$$serializer();
        INSTANCE = nullablePlanResponseAssemblyServiceRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel", nullablePlanResponseAssemblyServiceRemoteModel$$serializer, 5);
        j02.p("consents", false);
        j02.p("isAvailable", false);
        j02.p("price", false);
        j02.p("selectedQuantityForAssembly", false);
        j02.p("serviceItemNo", false);
        descriptor = j02;
    }

    private NullablePlanResponseAssemblyServiceRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServicePriceRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r23.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel.f71372f
            boolean r3 = r0.q()
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x0057
            r2 = r2[r8]
            java.lang.Object r2 = r0.o(r1, r8, r2, r9)
            java.util.List r2 = (java.util.List) r2
            jK.i r3 = jK.C17457i.f144111a
            java.lang.Object r3 = r0.A(r1, r7, r3, r9)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServicePriceRemoteModel$$serializer r7 = com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServicePriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r6, r7, r9)
            com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServicePriceRemoteModel r6 = (com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServicePriceRemoteModel) r6
            jK.X r7 = jK.X.f144073a
            java.lang.Object r4 = r0.A(r1, r4, r7, r9)
            java.lang.Integer r4 = (java.lang.Integer) r4
            jK.Y0 r7 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r7, r9)
            java.lang.String r5 = (java.lang.String) r5
            r7 = 31
            r17 = r2
            r18 = r3
            r20 = r4
            r21 = r5
            r19 = r6
            r16 = r7
            goto L_0x00c2
        L_0x0057:
            r14 = r7
            r3 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x005d:
            if (r14 == 0) goto L_0x00b6
            int r15 = r0.p(r1)
            r8 = -1
            if (r15 == r8) goto L_0x00b3
            if (r15 == 0) goto L_0x00a7
            if (r15 == r7) goto L_0x009b
            if (r15 == r6) goto L_0x008f
            if (r15 == r4) goto L_0x0083
            if (r15 != r5) goto L_0x007d
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r5, r8, r13)
            r13 = r8
            java.lang.String r13 = (java.lang.String) r13
            r3 = r3 | 16
        L_0x007b:
            r8 = 0
            goto L_0x005d
        L_0x007d:
            fK.E r0 = new fK.E
            r0.<init>((int) r15)
            throw r0
        L_0x0083:
            jK.X r8 = jK.X.f144073a
            java.lang.Object r8 = r0.A(r1, r4, r8, r12)
            r12 = r8
            java.lang.Integer r12 = (java.lang.Integer) r12
            r3 = r3 | 8
            goto L_0x007b
        L_0x008f:
            com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServicePriceRemoteModel$$serializer r8 = com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServicePriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r6, r8, r11)
            r11 = r8
            com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServicePriceRemoteModel r11 = (com.ingka.ikea.app.caasremote.models.NullableItemResponseAssemblyServicePriceRemoteModel) r11
            r3 = r3 | 4
            goto L_0x007b
        L_0x009b:
            jK.i r8 = jK.C17457i.f144111a
            java.lang.Object r8 = r0.A(r1, r7, r8, r10)
            r10 = r8
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r3 = r3 | 2
            goto L_0x007b
        L_0x00a7:
            r8 = 0
            r15 = r2[r8]
            java.lang.Object r9 = r0.o(r1, r8, r15, r9)
            java.util.List r9 = (java.util.List) r9
            r3 = r3 | 1
            goto L_0x005d
        L_0x00b3:
            r8 = 0
            r14 = r8
            goto L_0x005d
        L_0x00b6:
            r16 = r3
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
        L_0x00c2:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel
            r22 = 0
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullablePlanResponseAssemblyServiceRemoteModel nullablePlanResponseAssemblyServiceRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullablePlanResponseAssemblyServiceRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullablePlanResponseAssemblyServiceRemoteModel.b(nullablePlanResponseAssemblyServiceRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{NullablePlanResponseAssemblyServiceRemoteModel.f71372f[0], C17294a.u(C17457i.f144111a), C17294a.u(NullableItemResponseAssemblyServicePriceRemoteModel$$serializer.INSTANCE), C17294a.u(X.f144073a), C17294a.u(Y0.f144077a)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
