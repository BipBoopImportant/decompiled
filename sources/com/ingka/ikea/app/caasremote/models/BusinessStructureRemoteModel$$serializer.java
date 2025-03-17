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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/BusinessStructureRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/BusinessStructureRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/BusinessStructureRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/BusinessStructureRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class BusinessStructureRemoteModel$$serializer implements N<BusinessStructureRemoteModel> {
    public static final BusinessStructureRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        BusinessStructureRemoteModel$$serializer businessStructureRemoteModel$$serializer = new BusinessStructureRemoteModel$$serializer();
        INSTANCE = businessStructureRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel", businessStructureRemoteModel$$serializer, 6);
        j02.p("homeFurnishingBusinessName", false);
        j02.p("homeFurnishingBusinessNo", false);
        j02.p("productAreaName", false);
        j02.p("productAreaNo", false);
        j02.p("productRangeAreaName", false);
        j02.p("productRangeAreaNo", false);
        descriptor = j02;
    }

    private BusinessStructureRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b4, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r25.getDescriptor()
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r2 == 0) goto L_0x0054
            jK.Y0 r2 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r8, r2, r9)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.A(r1, r7, r2, r9)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.A(r1, r6, r2, r9)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r4 = r0.A(r1, r4, r2, r9)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.A(r1, r5, r2, r9)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r0.A(r1, r3, r2, r9)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 63
            r23 = r2
            r17 = r3
            r21 = r4
            r22 = r5
            r20 = r6
            r19 = r7
            r18 = r8
            goto L_0x00c8
        L_0x0054:
            r15 = r7
            r2 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x005b:
            if (r15 == 0) goto L_0x00ba
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x00b6;
                case 0: goto L_0x00a7;
                case 1: goto L_0x009b;
                case 2: goto L_0x008f;
                case 3: goto L_0x0083;
                case 4: goto L_0x0077;
                case 5: goto L_0x006a;
                default: goto L_0x0064;
            }
        L_0x0064:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x006a:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r3, r8, r14)
            r14 = r8
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 32
        L_0x0075:
            r8 = 0
            goto L_0x005b
        L_0x0077:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r5, r8, r13)
            r13 = r8
            java.lang.String r13 = (java.lang.String) r13
            r2 = r2 | 16
            goto L_0x0075
        L_0x0083:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r4, r8, r12)
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r2 = r2 | 8
            goto L_0x0075
        L_0x008f:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r6, r8, r11)
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            r2 = r2 | 4
            goto L_0x0075
        L_0x009b:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r7, r8, r10)
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            r2 = r2 | 2
            goto L_0x0075
        L_0x00a7:
            jK.Y0 r8 = jK.Y0.f144077a
            r3 = 0
            java.lang.Object r8 = r0.A(r1, r3, r8, r9)
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 1
            r8 = r3
        L_0x00b4:
            r3 = 5
            goto L_0x005b
        L_0x00b6:
            r3 = 0
            r8 = r3
            r15 = r8
            goto L_0x00b4
        L_0x00ba:
            r17 = r2
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
        L_0x00c8:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel
            r24 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.BusinessStructureRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, BusinessStructureRemoteModel businessStructureRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(businessStructureRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        BusinessStructureRemoteModel.a(businessStructureRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
