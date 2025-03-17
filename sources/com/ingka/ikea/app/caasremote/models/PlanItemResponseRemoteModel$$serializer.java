package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.M;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/PlanItemResponseRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/PlanItemResponseRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/PlanItemResponseRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/PlanItemResponseRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class PlanItemResponseRemoteModel$$serializer implements N<PlanItemResponseRemoteModel> {
    public static final PlanItemResponseRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        PlanItemResponseRemoteModel$$serializer planItemResponseRemoteModel$$serializer = new PlanItemResponseRemoteModel$$serializer();
        INSTANCE = planItemResponseRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.PlanItemResponseRemoteModel", planItemResponseRemoteModel$$serializer, 7);
        j02.p("assemblyService", false);
        j02.p("availabilityIndication", false);
        j02.p("fees", false);
        j02.p("info", false);
        j02.p("itemNo", false);
        j02.p("price", false);
        j02.p("quantity", false);
        descriptor = j02;
    }

    private PlanItemResponseRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.ingka.ikea.app.caasremote.models.NullablePlanItemResponseAssemblyServiceRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: com.ingka.ikea.app.caasremote.models.NullablePlanItemAvailabilityIndicationResponseRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.PlanItemResponseRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r27.getDescriptor()
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 6
            r4 = 5
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r2 == 0) goto L_0x0061
            com.ingka.ikea.app.caasremote.models.NullablePlanItemResponseAssemblyServiceRemoteModel$$serializer r2 = com.ingka.ikea.app.caasremote.models.NullablePlanItemResponseAssemblyServiceRemoteModel$$serializer.INSTANCE
            java.lang.Object r2 = r0.A(r1, r9, r2, r10)
            com.ingka.ikea.app.caasremote.models.NullablePlanItemResponseAssemblyServiceRemoteModel r2 = (com.ingka.ikea.app.caasremote.models.NullablePlanItemResponseAssemblyServiceRemoteModel) r2
            com.ingka.ikea.app.caasremote.models.NullablePlanItemAvailabilityIndicationResponseRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullablePlanItemAvailabilityIndicationResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r8, r9, r10)
            com.ingka.ikea.app.caasremote.models.NullablePlanItemAvailabilityIndicationResponseRemoteModel r8 = (com.ingka.ikea.app.caasremote.models.NullablePlanItemAvailabilityIndicationResponseRemoteModel) r8
            com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r7, r9, r10)
            com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel r7 = (com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel) r7
            com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r9, r10)
            com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel r5 = (com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel) r5
            java.lang.String r6 = r0.n(r1, r6)
            com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel$$serializer r9 = com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r9, r10)
            com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel r4 = (com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel) r4
            float r3 = r0.v(r1, r3)
            r9 = 127(0x7f, float:1.78E-43)
            r19 = r2
            r25 = r3
            r24 = r4
            r22 = r5
            r23 = r6
            r21 = r7
            r20 = r8
            r18 = r9
            goto L_0x00df
        L_0x0061:
            r2 = 0
            r16 = r8
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r10 = r9
            r9 = r15
        L_0x006b:
            if (r16 == 0) goto L_0x00cf
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x00cb;
                case 0: goto L_0x00bc;
                case 1: goto L_0x00ad;
                case 2: goto L_0x00a1;
                case 3: goto L_0x0095;
                case 4: goto L_0x008e;
                case 5: goto L_0x0082;
                case 6: goto L_0x007a;
                default: goto L_0x0074;
            }
        L_0x0074:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x007a:
            float r2 = r0.v(r1, r3)
            r10 = r10 | 64
        L_0x0080:
            r8 = 1
            goto L_0x006b
        L_0x0082:
            com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel$$serializer r8 = com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r4, r8, r9)
            r9 = r8
            com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel r9 = (com.ingka.ikea.app.caasremote.models.NullableItemResponsePriceRemoteModel) r9
            r10 = r10 | 32
            goto L_0x0080
        L_0x008e:
            java.lang.String r15 = r0.n(r1, r6)
            r10 = r10 | 16
            goto L_0x0080
        L_0x0095:
            com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel$$serializer r8 = com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r5, r8, r14)
            r14 = r8
            com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel r14 = (com.ingka.ikea.app.caasremote.models.NullableItemInfoResponseRemoteModel) r14
            r10 = r10 | 8
            goto L_0x0080
        L_0x00a1:
            com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel$$serializer r8 = com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r7, r8, r13)
            r13 = r8
            com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel r13 = (com.ingka.ikea.app.caasremote.models.NullableFeesRemoteModel) r13
            r10 = r10 | 4
            goto L_0x0080
        L_0x00ad:
            com.ingka.ikea.app.caasremote.models.NullablePlanItemAvailabilityIndicationResponseRemoteModel$$serializer r8 = com.ingka.ikea.app.caasremote.models.NullablePlanItemAvailabilityIndicationResponseRemoteModel$$serializer.INSTANCE
            r3 = 1
            java.lang.Object r8 = r0.A(r1, r3, r8, r12)
            r12 = r8
            com.ingka.ikea.app.caasremote.models.NullablePlanItemAvailabilityIndicationResponseRemoteModel r12 = (com.ingka.ikea.app.caasremote.models.NullablePlanItemAvailabilityIndicationResponseRemoteModel) r12
            r10 = r10 | 2
            r8 = r3
            r3 = 6
            goto L_0x006b
        L_0x00bc:
            r3 = 1
            com.ingka.ikea.app.caasremote.models.NullablePlanItemResponseAssemblyServiceRemoteModel$$serializer r8 = com.ingka.ikea.app.caasremote.models.NullablePlanItemResponseAssemblyServiceRemoteModel$$serializer.INSTANCE
            r3 = 0
            java.lang.Object r8 = r0.A(r1, r3, r8, r11)
            r11 = r8
            com.ingka.ikea.app.caasremote.models.NullablePlanItemResponseAssemblyServiceRemoteModel r11 = (com.ingka.ikea.app.caasremote.models.NullablePlanItemResponseAssemblyServiceRemoteModel) r11
            r10 = r10 | 1
        L_0x00c9:
            r3 = 6
            goto L_0x0080
        L_0x00cb:
            r3 = 0
            r16 = r3
            goto L_0x00c9
        L_0x00cf:
            r25 = r2
            r24 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x00df:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.PlanItemResponseRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.PlanItemResponseRemoteModel
            r26 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.PlanItemResponseRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.PlanItemResponseRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, PlanItemResponseRemoteModel planItemResponseRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(planItemResponseRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        PlanItemResponseRemoteModel.a(planItemResponseRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C17294a.u(NullablePlanItemResponseAssemblyServiceRemoteModel$$serializer.INSTANCE), C17294a.u(NullablePlanItemAvailabilityIndicationResponseRemoteModel$$serializer.INSTANCE), C17294a.u(NullableFeesRemoteModel$$serializer.INSTANCE), C17294a.u(NullableItemInfoResponseRemoteModel$$serializer.INSTANCE), Y0.f144077a, C17294a.u(NullableItemResponsePriceRemoteModel$$serializer.INSTANCE), M.f144051a};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
