package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/PlanResponseRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/PlanResponseRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/PlanResponseRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/PlanResponseRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class PlanResponseRemoteModel$$serializer implements N<PlanResponseRemoteModel> {
    public static final PlanResponseRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        PlanResponseRemoteModel$$serializer planResponseRemoteModel$$serializer = new PlanResponseRemoteModel$$serializer();
        INSTANCE = planResponseRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.PlanResponseRemoteModel", planResponseRemoteModel$$serializer, 10);
        j02.p("assemblyService", false);
        j02.p("code", false);
        j02.p("deepLink", false);
        j02.p("images", false);
        j02.p("installationService", false);
        j02.p("items", false);
        j02.p("name", false);
        j02.p("price", false);
        j02.p("quantity", false);
        j02.p("shoppingProfile", false);
        descriptor = j02;
    }

    private PlanResponseRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.ingka.ikea.app.caasremote.models.NullablePlanResponseInstallationServiceRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.ingka.ikea.app.caasremote.models.NullablePlanResponsePriceRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: com.ingka.ikea.app.caasremote.models.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.PlanResponseRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r33) {
        /*
            r32 = this;
            r0 = r33
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r32.getDescriptor()
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.app.caasremote.models.PlanResponseRemoteModel.f71478k
            boolean r3 = r0.q()
            r4 = 7
            r5 = 6
            r6 = 8
            r7 = 4
            r8 = 2
            r9 = 9
            r10 = 5
            r11 = 3
            r12 = 1
            r13 = 0
            r14 = 0
            if (r3 == 0) goto L_0x0084
            com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel$$serializer r3 = com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r13, r3, r14)
            com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel r3 = (com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel) r3
            java.lang.String r12 = r0.n(r1, r12)
            java.lang.String r8 = r0.n(r1, r8)
            r13 = r2[r11]
            java.lang.Object r11 = r0.A(r1, r11, r13, r14)
            java.util.List r11 = (java.util.List) r11
            com.ingka.ikea.app.caasremote.models.NullablePlanResponseInstallationServiceRemoteModel$$serializer r13 = com.ingka.ikea.app.caasremote.models.NullablePlanResponseInstallationServiceRemoteModel$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r7, r13, r14)
            com.ingka.ikea.app.caasremote.models.NullablePlanResponseInstallationServiceRemoteModel r7 = (com.ingka.ikea.app.caasremote.models.NullablePlanResponseInstallationServiceRemoteModel) r7
            r13 = r2[r10]
            java.lang.Object r10 = r0.o(r1, r10, r13, r14)
            java.util.List r10 = (java.util.List) r10
            jK.Y0 r13 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r5, r13, r14)
            java.lang.String r5 = (java.lang.String) r5
            com.ingka.ikea.app.caasremote.models.NullablePlanResponsePriceRemoteModel$$serializer r13 = com.ingka.ikea.app.caasremote.models.NullablePlanResponsePriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r13, r14)
            com.ingka.ikea.app.caasremote.models.NullablePlanResponsePriceRemoteModel r4 = (com.ingka.ikea.app.caasremote.models.NullablePlanResponsePriceRemoteModel) r4
            int r6 = r0.j(r1, r6)
            r2 = r2[r9]
            java.lang.Object r2 = r0.o(r1, r9, r2, r14)
            com.ingka.ikea.app.caasremote.models.l r2 = (com.ingka.ikea.app.caasremote.models.l) r2
            r9 = 1023(0x3ff, float:1.434E-42)
            r30 = r2
            r21 = r3
            r28 = r4
            r27 = r5
            r29 = r6
            r25 = r7
            r23 = r8
            r20 = r9
            r26 = r10
            r24 = r11
            r22 = r12
            goto L_0x0135
        L_0x0084:
            r18 = r12
            r3 = r13
            r7 = r14
            r8 = r7
            r10 = r8
            r11 = r10
            r12 = r11
            r15 = r12
            r16 = r15
            r17 = r16
            r13 = r17
            r14 = r3
        L_0x0094:
            if (r18 == 0) goto L_0x011f
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x011b;
                case 0: goto L_0x010d;
                case 1: goto L_0x0104;
                case 2: goto L_0x00fb;
                case 3: goto L_0x00ee;
                case 4: goto L_0x00e0;
                case 5: goto L_0x00d2;
                case 6: goto L_0x00c3;
                case 7: goto L_0x00b7;
                case 8: goto L_0x00b0;
                case 9: goto L_0x00a3;
                default: goto L_0x009d;
            }
        L_0x009d:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x00a3:
            r5 = r2[r9]
            java.lang.Object r5 = r0.o(r1, r9, r5, r10)
            r10 = r5
            com.ingka.ikea.app.caasremote.models.l r10 = (com.ingka.ikea.app.caasremote.models.l) r10
            r14 = r14 | 512(0x200, float:7.175E-43)
        L_0x00ae:
            r5 = 6
            goto L_0x0094
        L_0x00b0:
            int r3 = r0.j(r1, r6)
            r14 = r14 | 256(0x100, float:3.59E-43)
            goto L_0x00ae
        L_0x00b7:
            com.ingka.ikea.app.caasremote.models.NullablePlanResponsePriceRemoteModel$$serializer r5 = com.ingka.ikea.app.caasremote.models.NullablePlanResponsePriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r4, r5, r7)
            r7 = r5
            com.ingka.ikea.app.caasremote.models.NullablePlanResponsePriceRemoteModel r7 = (com.ingka.ikea.app.caasremote.models.NullablePlanResponsePriceRemoteModel) r7
            r14 = r14 | 128(0x80, float:1.794E-43)
            goto L_0x00ae
        L_0x00c3:
            jK.Y0 r5 = jK.Y0.f144077a
            r4 = 6
            java.lang.Object r5 = r0.A(r1, r4, r5, r11)
            r11 = r5
            java.lang.String r11 = (java.lang.String) r11
            r14 = r14 | 64
            r5 = r4
            r4 = 7
            goto L_0x0094
        L_0x00d2:
            r5 = 5
            r4 = r2[r5]
            java.lang.Object r4 = r0.o(r1, r5, r4, r8)
            r8 = r4
            java.util.List r8 = (java.util.List) r8
            r14 = r14 | 32
        L_0x00de:
            r4 = 7
            goto L_0x00ae
        L_0x00e0:
            r5 = 5
            com.ingka.ikea.app.caasremote.models.NullablePlanResponseInstallationServiceRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullablePlanResponseInstallationServiceRemoteModel$$serializer.INSTANCE
            r5 = 4
            java.lang.Object r4 = r0.A(r1, r5, r4, r12)
            r12 = r4
            com.ingka.ikea.app.caasremote.models.NullablePlanResponseInstallationServiceRemoteModel r12 = (com.ingka.ikea.app.caasremote.models.NullablePlanResponseInstallationServiceRemoteModel) r12
            r14 = r14 | 16
            goto L_0x00de
        L_0x00ee:
            r4 = 3
            r5 = r2[r4]
            java.lang.Object r5 = r0.A(r1, r4, r5, r13)
            r13 = r5
            java.util.List r13 = (java.util.List) r13
            r14 = r14 | 8
            goto L_0x00de
        L_0x00fb:
            r4 = 3
            r5 = 2
            java.lang.String r17 = r0.n(r1, r5)
            r14 = r14 | 4
            goto L_0x00de
        L_0x0104:
            r4 = 1
            r5 = 2
            java.lang.String r16 = r0.n(r1, r4)
            r14 = r14 | 2
            goto L_0x00de
        L_0x010d:
            r5 = 2
            com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel$$serializer.INSTANCE
            r5 = 0
            java.lang.Object r4 = r0.A(r1, r5, r4, r15)
            r15 = r4
            com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel r15 = (com.ingka.ikea.app.caasremote.models.NullablePlanResponseAssemblyServiceRemoteModel) r15
            r14 = r14 | 1
            goto L_0x00de
        L_0x011b:
            r5 = 0
            r18 = r5
            goto L_0x00ae
        L_0x011f:
            r29 = r3
            r28 = r7
            r26 = r8
            r30 = r10
            r27 = r11
            r25 = r12
            r24 = r13
            r20 = r14
            r21 = r15
            r22 = r16
            r23 = r17
        L_0x0135:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.PlanResponseRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.PlanResponseRemoteModel
            r31 = 0
            r19 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.PlanResponseRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.PlanResponseRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, PlanResponseRemoteModel planResponseRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(planResponseRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        PlanResponseRemoteModel.b(planResponseRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = PlanResponseRemoteModel.f71478k;
        KSerializer<?> u10 = C17294a.u(NullablePlanResponseAssemblyServiceRemoteModel$$serializer.INSTANCE);
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{u10, y02, y02, C17294a.u(a10[3]), C17294a.u(NullablePlanResponseInstallationServiceRemoteModel$$serializer.INSTANCE), a10[5], C17294a.u(y02), C17294a.u(NullablePlanResponsePriceRemoteModel$$serializer.INSTANCE), X.f144073a, a10[9]};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
