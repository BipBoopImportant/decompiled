package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.J0;
import jK.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/TotalPriceResponseRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class TotalPriceResponseRemoteModel$$serializer implements N<TotalPriceResponseRemoteModel> {
    public static final TotalPriceResponseRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        TotalPriceResponseRemoteModel$$serializer totalPriceResponseRemoteModel$$serializer = new TotalPriceResponseRemoteModel$$serializer();
        INSTANCE = totalPriceResponseRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel", totalPriceResponseRemoteModel$$serializer, 10);
        j02.p("assemblyService", false);
        j02.p("assemblyServiceOfPlans", false);
        j02.p("base", false);
        j02.p("current", false);
        j02.p("product", false);
        j02.p("removalServices", false);
        j02.p("savings", false);
        j02.p("service", false);
        j02.p("serviceByProvider", false);
        j02.p("upsell", false);
        descriptor = j02;
    }

    private TotalPriceResponseRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.ingka.ikea.app.caasremote.models.CurrentPricePropertiesRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.ingka.ikea.app.caasremote.models.ProductTotalPriceResponseRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.app.caasremote.models.NullableRemovalServiceTotalPriceResponseRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.ingka.ikea.app.caasremote.models.NullableServiceTotalPriceResponseRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.ingka.ikea.app.caasremote.models.NullableServiceTotalPricePayToProviderResponseRemoteModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.ingka.ikea.app.caasremote.models.NullableUpsellTotalPricePropertiesRemoteModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r30.getDescriptor()
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 9
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 3
            r8 = 8
            r9 = 4
            r10 = 2
            r11 = 1
            r12 = 0
            r13 = 0
            if (r2 == 0) goto L_0x008a
            com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer r2 = com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r12 = r0.A(r1, r12, r2, r13)
            com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel r12 = (com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel) r12
            java.lang.Object r2 = r0.A(r1, r11, r2, r13)
            com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel r2 = (com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel) r2
            com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel$$serializer r11 = com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel$$serializer.INSTANCE
            java.lang.Object r10 = r0.A(r1, r10, r11, r13)
            com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel r10 = (com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel) r10
            com.ingka.ikea.app.caasremote.models.CurrentPricePropertiesRemoteModel$$serializer r11 = com.ingka.ikea.app.caasremote.models.CurrentPricePropertiesRemoteModel$$serializer.INSTANCE
            java.lang.Object r7 = r0.o(r1, r7, r11, r13)
            com.ingka.ikea.app.caasremote.models.CurrentPricePropertiesRemoteModel r7 = (com.ingka.ikea.app.caasremote.models.CurrentPricePropertiesRemoteModel) r7
            com.ingka.ikea.app.caasremote.models.ProductTotalPriceResponseRemoteModel$$serializer r11 = com.ingka.ikea.app.caasremote.models.ProductTotalPriceResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r9 = r0.o(r1, r9, r11, r13)
            com.ingka.ikea.app.caasremote.models.ProductTotalPriceResponseRemoteModel r9 = (com.ingka.ikea.app.caasremote.models.ProductTotalPriceResponseRemoteModel) r9
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceTotalPriceResponseRemoteModel$$serializer r11 = com.ingka.ikea.app.caasremote.models.NullableRemovalServiceTotalPriceResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r6, r11, r13)
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceTotalPriceResponseRemoteModel r6 = (com.ingka.ikea.app.caasremote.models.NullableRemovalServiceTotalPriceResponseRemoteModel) r6
            com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryRemoteModel$$serializer r11 = com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryRemoteModel$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r11, r13)
            com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryRemoteModel r5 = (com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryRemoteModel) r5
            com.ingka.ikea.app.caasremote.models.NullableServiceTotalPriceResponseRemoteModel$$serializer r11 = com.ingka.ikea.app.caasremote.models.NullableServiceTotalPriceResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r11, r13)
            com.ingka.ikea.app.caasremote.models.NullableServiceTotalPriceResponseRemoteModel r4 = (com.ingka.ikea.app.caasremote.models.NullableServiceTotalPriceResponseRemoteModel) r4
            com.ingka.ikea.app.caasremote.models.NullableServiceTotalPricePayToProviderResponseRemoteModel$$serializer r11 = com.ingka.ikea.app.caasremote.models.NullableServiceTotalPricePayToProviderResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r8, r11, r13)
            com.ingka.ikea.app.caasremote.models.NullableServiceTotalPricePayToProviderResponseRemoteModel r8 = (com.ingka.ikea.app.caasremote.models.NullableServiceTotalPricePayToProviderResponseRemoteModel) r8
            com.ingka.ikea.app.caasremote.models.NullableUpsellTotalPricePropertiesRemoteModel$$serializer r11 = com.ingka.ikea.app.caasremote.models.NullableUpsellTotalPricePropertiesRemoteModel$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r3, r11, r13)
            com.ingka.ikea.app.caasremote.models.NullableUpsellTotalPricePropertiesRemoteModel r3 = (com.ingka.ikea.app.caasremote.models.NullableUpsellTotalPricePropertiesRemoteModel) r3
            r11 = 1023(0x3ff, float:1.434E-42)
            r20 = r2
            r28 = r3
            r26 = r4
            r25 = r5
            r24 = r6
            r22 = r7
            r27 = r8
            r23 = r9
            r21 = r10
            r18 = r11
            r19 = r12
            goto L_0x014c
        L_0x008a:
            r16 = r11
            r2 = r12
            r5 = r13
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r14 = r12
            r15 = r14
        L_0x0096:
            if (r16 == 0) goto L_0x0136
            int r4 = r0.p(r1)
            switch(r4) {
                case -1: goto L_0x0132;
                case 0: goto L_0x0124;
                case 1: goto L_0x0116;
                case 2: goto L_0x0108;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00ec;
                case 5: goto L_0x00de;
                case 6: goto L_0x00ce;
                case 7: goto L_0x00be;
                case 8: goto L_0x00b2;
                case 9: goto L_0x00a5;
                default: goto L_0x009f;
            }
        L_0x009f:
            fK.E r0 = new fK.E
            r0.<init>((int) r4)
            throw r0
        L_0x00a5:
            com.ingka.ikea.app.caasremote.models.NullableUpsellTotalPricePropertiesRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableUpsellTotalPricePropertiesRemoteModel$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r3, r4, r5)
            r5 = r4
            com.ingka.ikea.app.caasremote.models.NullableUpsellTotalPricePropertiesRemoteModel r5 = (com.ingka.ikea.app.caasremote.models.NullableUpsellTotalPricePropertiesRemoteModel) r5
            r2 = r2 | 512(0x200, float:7.175E-43)
        L_0x00b0:
            r4 = 7
            goto L_0x0096
        L_0x00b2:
            com.ingka.ikea.app.caasremote.models.NullableServiceTotalPricePayToProviderResponseRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableServiceTotalPricePayToProviderResponseRemoteModel$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r8, r4, r6)
            r6 = r4
            com.ingka.ikea.app.caasremote.models.NullableServiceTotalPricePayToProviderResponseRemoteModel r6 = (com.ingka.ikea.app.caasremote.models.NullableServiceTotalPricePayToProviderResponseRemoteModel) r6
            r2 = r2 | 256(0x100, float:3.59E-43)
            goto L_0x00b0
        L_0x00be:
            com.ingka.ikea.app.caasremote.models.NullableServiceTotalPriceResponseRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableServiceTotalPriceResponseRemoteModel$$serializer.INSTANCE
            r3 = 7
            java.lang.Object r4 = r0.A(r1, r3, r4, r9)
            r9 = r4
            com.ingka.ikea.app.caasremote.models.NullableServiceTotalPriceResponseRemoteModel r9 = (com.ingka.ikea.app.caasremote.models.NullableServiceTotalPriceResponseRemoteModel) r9
            r2 = r2 | 128(0x80, float:1.794E-43)
            r4 = r3
            r3 = 9
            goto L_0x0096
        L_0x00ce:
            r3 = 7
            com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryRemoteModel$$serializer.INSTANCE
            r3 = 6
            java.lang.Object r4 = r0.A(r1, r3, r4, r7)
            r7 = r4
            com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryRemoteModel r7 = (com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryRemoteModel) r7
            r2 = r2 | 64
        L_0x00db:
            r3 = 9
            goto L_0x00b0
        L_0x00de:
            r3 = 6
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceTotalPriceResponseRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableRemovalServiceTotalPriceResponseRemoteModel$$serializer.INSTANCE
            r3 = 5
            java.lang.Object r4 = r0.A(r1, r3, r4, r10)
            r10 = r4
            com.ingka.ikea.app.caasremote.models.NullableRemovalServiceTotalPriceResponseRemoteModel r10 = (com.ingka.ikea.app.caasremote.models.NullableRemovalServiceTotalPriceResponseRemoteModel) r10
            r2 = r2 | 32
            goto L_0x00db
        L_0x00ec:
            r3 = 5
            com.ingka.ikea.app.caasremote.models.ProductTotalPriceResponseRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.ProductTotalPriceResponseRemoteModel$$serializer.INSTANCE
            r3 = 4
            java.lang.Object r4 = r0.o(r1, r3, r4, r11)
            r11 = r4
            com.ingka.ikea.app.caasremote.models.ProductTotalPriceResponseRemoteModel r11 = (com.ingka.ikea.app.caasremote.models.ProductTotalPriceResponseRemoteModel) r11
            r2 = r2 | 16
            goto L_0x00db
        L_0x00fa:
            r3 = 4
            com.ingka.ikea.app.caasremote.models.CurrentPricePropertiesRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.CurrentPricePropertiesRemoteModel$$serializer.INSTANCE
            r3 = 3
            java.lang.Object r4 = r0.o(r1, r3, r4, r12)
            r12 = r4
            com.ingka.ikea.app.caasremote.models.CurrentPricePropertiesRemoteModel r12 = (com.ingka.ikea.app.caasremote.models.CurrentPricePropertiesRemoteModel) r12
            r2 = r2 | 8
            goto L_0x00db
        L_0x0108:
            r3 = 3
            com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel$$serializer.INSTANCE
            r3 = 2
            java.lang.Object r4 = r0.A(r1, r3, r4, r15)
            r15 = r4
            com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel r15 = (com.ingka.ikea.app.caasremote.models.NullableBasePricePropertiesRemoteModel) r15
            r2 = r2 | 4
            goto L_0x00db
        L_0x0116:
            r3 = 2
            com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer.INSTANCE
            r3 = 1
            java.lang.Object r4 = r0.A(r1, r3, r4, r14)
            r14 = r4
            com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel r14 = (com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel) r14
            r2 = r2 | 2
            goto L_0x00db
        L_0x0124:
            r3 = 1
            com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer r4 = com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer.INSTANCE
            r3 = 0
            java.lang.Object r4 = r0.A(r1, r3, r4, r13)
            r13 = r4
            com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel r13 = (com.ingka.ikea.app.caasremote.models.NullableAssemblyServiceTotalPriceResponseRemoteModel) r13
            r2 = r2 | 1
            goto L_0x00db
        L_0x0132:
            r3 = 0
            r16 = r3
            goto L_0x00db
        L_0x0136:
            r18 = r2
            r28 = r5
            r27 = r6
            r25 = r7
            r26 = r9
            r24 = r10
            r23 = r11
            r22 = r12
            r19 = r13
            r20 = r14
            r21 = r15
        L_0x014c:
            r0.c(r1)
            com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel
            r29 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.TotalPriceResponseRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, TotalPriceResponseRemoteModel totalPriceResponseRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(totalPriceResponseRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        TotalPriceResponseRemoteModel.f(totalPriceResponseRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        NullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer nullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer = NullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer.INSTANCE;
        return new KSerializer[]{C17294a.u(nullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer), C17294a.u(nullableAssemblyServiceTotalPriceResponseRemoteModel$$serializer), C17294a.u(NullableBasePricePropertiesRemoteModel$$serializer.INSTANCE), CurrentPricePropertiesRemoteModel$$serializer.INSTANCE, ProductTotalPriceResponseRemoteModel$$serializer.INSTANCE, C17294a.u(NullableRemovalServiceTotalPriceResponseRemoteModel$$serializer.INSTANCE), C17294a.u(NullableTotalSavingsSummaryRemoteModel$$serializer.INSTANCE), C17294a.u(NullableServiceTotalPriceResponseRemoteModel$$serializer.INSTANCE), C17294a.u(NullableServiceTotalPricePayToProviderResponseRemoteModel$$serializer.INSTANCE), C17294a.u(NullableUpsellTotalPricePropertiesRemoteModel$$serializer.INSTANCE)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
