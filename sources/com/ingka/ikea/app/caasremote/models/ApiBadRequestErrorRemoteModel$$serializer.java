package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/ApiBadRequestErrorRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/ApiBadRequestErrorRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/ApiBadRequestErrorRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/ApiBadRequestErrorRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class ApiBadRequestErrorRemoteModel$$serializer implements N<ApiBadRequestErrorRemoteModel> {
    public static final ApiBadRequestErrorRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        ApiBadRequestErrorRemoteModel$$serializer apiBadRequestErrorRemoteModel$$serializer = new ApiBadRequestErrorRemoteModel$$serializer();
        INSTANCE = apiBadRequestErrorRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.ApiBadRequestErrorRemoteModel", apiBadRequestErrorRemoteModel$$serializer, 8);
        j02.p("errors", false);
        j02.p("fields", false);
        j02.p("items", false);
        j02.p("plans", false);
        j02.p("reference", false);
        j02.p("title", false);
        j02.p("success", false);
        j02.p("type", false);
        descriptor = j02;
    }

    private ApiBadRequestErrorRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c7, code lost:
        r4 = 7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.ApiBadRequestErrorRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r32) {
        /*
            r31 = this;
            r0 = r32
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r31.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.caasremote.models.ApiBadRequestErrorRemoteModel.f71026i
            boolean r3 = r0.q()
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0068
            r3 = r2[r11]
            java.lang.Object r3 = r0.o(r1, r11, r3, r12)
            java.util.List r3 = (java.util.List) r3
            r11 = r2[r10]
            java.lang.Object r10 = r0.o(r1, r10, r11, r12)
            java.util.List r10 = (java.util.List) r10
            r11 = r2[r9]
            java.lang.Object r9 = r0.o(r1, r9, r11, r12)
            java.util.List r9 = (java.util.List) r9
            r2 = r2[r8]
            java.lang.Object r2 = r0.o(r1, r8, r2, r12)
            java.util.List r2 = (java.util.List) r2
            java.lang.String r7 = r0.n(r1, r7)
            java.lang.String r6 = r0.n(r1, r6)
            boolean r5 = r0.D(r1, r5)
            java.lang.String r4 = r0.n(r1, r4)
            r8 = 255(0xff, float:3.57E-43)
            r25 = r2
            r22 = r3
            r29 = r4
            r28 = r5
            r27 = r6
            r26 = r7
            r21 = r8
            r24 = r9
            r23 = r10
            goto L_0x00f0
        L_0x0068:
            r19 = r10
            r3 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r11 = r18
            r12 = r3
        L_0x0077:
            if (r19 == 0) goto L_0x00de
            int r10 = r0.p(r1)
            switch(r10) {
                case -1: goto L_0x00d9;
                case 0: goto L_0x00c9;
                case 1: goto L_0x00bb;
                case 2: goto L_0x00af;
                case 3: goto L_0x00a3;
                case 4: goto L_0x009c;
                case 5: goto L_0x0095;
                case 6: goto L_0x008e;
                case 7: goto L_0x0086;
                default: goto L_0x0080;
            }
        L_0x0080:
            fK.E r0 = new fK.E
            r0.<init>((int) r10)
            throw r0
        L_0x0086:
            java.lang.String r18 = r0.n(r1, r4)
            r12 = r12 | 128(0x80, float:1.794E-43)
        L_0x008c:
            r10 = 1
            goto L_0x0077
        L_0x008e:
            boolean r3 = r0.D(r1, r5)
            r12 = r12 | 64
            goto L_0x008c
        L_0x0095:
            java.lang.String r17 = r0.n(r1, r6)
            r12 = r12 | 32
            goto L_0x008c
        L_0x009c:
            java.lang.String r16 = r0.n(r1, r7)
            r12 = r12 | 16
            goto L_0x008c
        L_0x00a3:
            r10 = r2[r8]
            java.lang.Object r10 = r0.o(r1, r8, r10, r11)
            r11 = r10
            java.util.List r11 = (java.util.List) r11
            r12 = r12 | 8
            goto L_0x008c
        L_0x00af:
            r10 = r2[r9]
            java.lang.Object r10 = r0.o(r1, r9, r10, r15)
            r15 = r10
            java.util.List r15 = (java.util.List) r15
            r12 = r12 | 4
            goto L_0x008c
        L_0x00bb:
            r10 = 1
            r4 = r2[r10]
            java.lang.Object r4 = r0.o(r1, r10, r4, r14)
            r14 = r4
            java.util.List r14 = (java.util.List) r14
            r12 = r12 | 2
        L_0x00c7:
            r4 = 7
            goto L_0x0077
        L_0x00c9:
            r4 = 0
            r10 = 1
            r5 = r2[r4]
            java.lang.Object r5 = r0.o(r1, r4, r5, r13)
            r13 = r5
            java.util.List r13 = (java.util.List) r13
            r12 = r12 | 1
            r4 = 7
            r5 = 6
            goto L_0x0077
        L_0x00d9:
            r4 = 0
            r10 = 1
            r19 = r4
            goto L_0x00c7
        L_0x00de:
            r28 = r3
            r25 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r24 = r15
            r26 = r16
            r27 = r17
            r29 = r18
        L_0x00f0:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.ApiBadRequestErrorRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.ApiBadRequestErrorRemoteModel
            r30 = 0
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.ApiBadRequestErrorRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.ApiBadRequestErrorRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, ApiBadRequestErrorRemoteModel apiBadRequestErrorRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(apiBadRequestErrorRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        ApiBadRequestErrorRemoteModel.c(apiBadRequestErrorRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = ApiBadRequestErrorRemoteModel.f71026i;
        KSerializer<?> kSerializer = a10[0];
        KSerializer<?> kSerializer2 = a10[1];
        KSerializer<?> kSerializer3 = a10[2];
        KSerializer<?> kSerializer4 = a10[3];
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{kSerializer, kSerializer2, kSerializer3, kSerializer4, y02, y02, C17457i.f144111a, y02};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
