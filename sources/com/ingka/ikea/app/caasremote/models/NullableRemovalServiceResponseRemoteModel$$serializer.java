package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullableRemovalServiceResponseRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullableRemovalServiceResponseRemoteModel$$serializer implements N<NullableRemovalServiceResponseRemoteModel> {
    public static final NullableRemovalServiceResponseRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullableRemovalServiceResponseRemoteModel$$serializer nullableRemovalServiceResponseRemoteModel$$serializer = new NullableRemovalServiceResponseRemoteModel$$serializer();
        INSTANCE = nullableRemovalServiceResponseRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseRemoteModel", nullableRemovalServiceResponseRemoteModel$$serializer, 7);
        j02.p("config", false);
        j02.p("eligibleItems", false);
        j02.p(UiComponentContainer.RESULT_ERROR, false);
        j02.p("isAvailableForPostCode", false);
        j02.p("isAvailableForRU", false);
        j02.p("price", false);
        j02.p("quantity", false);
        descriptor = j02;
    }

    private NullableRemovalServiceResponseRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.ingka.ikea.app.caasremote.models.NullableServiceErrorResponseRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponsePriceRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r27.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseRemoteModel.f71405h
            boolean r3 = r0.q()
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x006b
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel$$serializer r3 = com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r10, r3, r11)
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel r3 = (com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel) r3
            r2 = r2[r9]
            java.lang.Object r2 = r0.A(r1, r9, r2, r11)
            java.util.List r2 = (java.util.List) r2
            com.ingka.ikea.app.caasremote.models.NullableServiceErrorResponseRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullableServiceErrorResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r8, r9, r11)
            com.ingka.ikea.app.caasremote.models.NullableServiceErrorResponseRemoteModel r8 = (com.ingka.ikea.app.caasremote.models.NullableServiceErrorResponseRemoteModel) r8
            jK.i r9 = jK.C17457i.f144111a
            java.lang.Object r6 = r0.A(r1, r6, r9, r11)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Object r7 = r0.A(r1, r7, r9, r11)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponsePriceRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponsePriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r9, r11)
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponsePriceRemoteModel r5 = (com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponsePriceRemoteModel) r5
            jK.X r9 = jK.X.f144073a
            java.lang.Object r4 = r0.A(r1, r4, r9, r11)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r9 = 127(0x7f, float:1.78E-43)
            r20 = r2
            r19 = r3
            r25 = r4
            r24 = r5
            r22 = r6
            r23 = r7
            r21 = r8
            r18 = r9
            goto L_0x00f6
        L_0x006b:
            r16 = r9
            r3 = r10
            r9 = r11
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0074:
            if (r16 == 0) goto L_0x00e6
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x00e1;
                case 0: goto L_0x00d1;
                case 1: goto L_0x00c3;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00a8;
                case 4: goto L_0x009c;
                case 5: goto L_0x0090;
                case 6: goto L_0x0083;
                default: goto L_0x007d;
            }
        L_0x007d:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x0083:
            jK.X r8 = jK.X.f144073a
            java.lang.Object r8 = r0.A(r1, r4, r8, r9)
            r9 = r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            r3 = r3 | 64
        L_0x008e:
            r8 = 2
            goto L_0x0074
        L_0x0090:
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponsePriceRemoteModel$$serializer r8 = com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponsePriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r5, r8, r10)
            r10 = r8
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponsePriceRemoteModel r10 = (com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponsePriceRemoteModel) r10
            r3 = r3 | 32
            goto L_0x008e
        L_0x009c:
            jK.i r8 = jK.C17457i.f144111a
            java.lang.Object r8 = r0.A(r1, r7, r8, r15)
            r15 = r8
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            r3 = r3 | 16
            goto L_0x008e
        L_0x00a8:
            jK.i r8 = jK.C17457i.f144111a
            java.lang.Object r8 = r0.A(r1, r6, r8, r14)
            r14 = r8
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r3 = r3 | 8
            goto L_0x008e
        L_0x00b4:
            com.ingka.ikea.app.caasremote.models.NullableServiceErrorResponseRemoteModel$$serializer r8 = com.ingka.ikea.app.caasremote.models.NullableServiceErrorResponseRemoteModel$$serializer.INSTANCE
            r4 = 2
            java.lang.Object r8 = r0.A(r1, r4, r8, r13)
            r13 = r8
            com.ingka.ikea.app.caasremote.models.NullableServiceErrorResponseRemoteModel r13 = (com.ingka.ikea.app.caasremote.models.NullableServiceErrorResponseRemoteModel) r13
            r3 = r3 | 4
            r8 = r4
            r4 = 6
            goto L_0x0074
        L_0x00c3:
            r8 = 1
            r4 = r2[r8]
            java.lang.Object r4 = r0.A(r1, r8, r4, r12)
            r12 = r4
            java.util.List r12 = (java.util.List) r12
            r3 = r3 | 2
            r4 = 6
            goto L_0x008e
        L_0x00d1:
            r8 = 1
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel$$serializer.INSTANCE
            r5 = 0
            java.lang.Object r4 = r0.A(r1, r5, r4, r11)
            r11 = r4
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel r11 = (com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseConfigRemoteModel) r11
            r3 = r3 | 1
            r4 = 6
        L_0x00df:
            r5 = 5
            goto L_0x008e
        L_0x00e1:
            r5 = 0
            r8 = 1
            r16 = r5
            goto L_0x00df
        L_0x00e6:
            r18 = r3
            r25 = r9
            r24 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x00f6:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseRemoteModel
            r26 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.NullableRemovalServiceResponseRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullableRemovalServiceResponseRemoteModel nullableRemovalServiceResponseRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullableRemovalServiceResponseRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullableRemovalServiceResponseRemoteModel.b(nullableRemovalServiceResponseRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = NullableRemovalServiceResponseRemoteModel.f71405h;
        KSerializer<?> u10 = C17294a.u(NullableRemovalServiceResponseConfigRemoteModel$$serializer.INSTANCE);
        KSerializer<?> u11 = C17294a.u(a10[1]);
        KSerializer<?> u12 = C17294a.u(NullableServiceErrorResponseRemoteModel$$serializer.INSTANCE);
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{u10, u11, u12, C17294a.u(iVar), C17294a.u(iVar), C17294a.u(NullableRemovalServiceResponsePriceRemoteModel$$serializer.INSTANCE), C17294a.u(X.f144073a)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
