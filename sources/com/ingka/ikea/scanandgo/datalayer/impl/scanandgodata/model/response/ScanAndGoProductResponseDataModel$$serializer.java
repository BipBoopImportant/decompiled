package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ScanAndGoProductResponseDataModel$$serializer implements N<ScanAndGoProductResponseDataModel> {
    public static final ScanAndGoProductResponseDataModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScanAndGoProductResponseDataModel$$serializer scanAndGoProductResponseDataModel$$serializer = new ScanAndGoProductResponseDataModel$$serializer();
        INSTANCE = scanAndGoProductResponseDataModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel", scanAndGoProductResponseDataModel$$serializer, 8);
        j02.p("inspirationSection", false);
        j02.p("presentationSection", false);
        j02.p("configurationSection", false);
        j02.p("buyingInstructionSection", false);
        j02.p("buyingDecisionSection", false);
        j02.p("childItems", false);
        j02.p("childItemPresentation", false);
        j02.p("mustHaveCard", false);
        descriptor = j02;
    }

    private ScanAndGoProductResponseDataModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ConfigurationSectionDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingInstructionSectionDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingDecisionSectionDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemsDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.MustHaveCardDataModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r2 == 0) goto L_0x0072
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.InspirationSectionDataModel$$serializer r2 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.InspirationSectionDataModel$$serializer.INSTANCE
            java.lang.Object r2 = r0.A(r1, r10, r2, r11)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.InspirationSectionDataModel r2 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.InspirationSectionDataModel) r2
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel$$serializer r10 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel$$serializer.INSTANCE
            java.lang.Object r9 = r0.A(r1, r9, r10, r11)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel r9 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel) r9
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ConfigurationSectionDataModel$$serializer r10 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ConfigurationSectionDataModel$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r8, r10, r11)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ConfigurationSectionDataModel r8 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ConfigurationSectionDataModel) r8
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingInstructionSectionDataModel$$serializer r10 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingInstructionSectionDataModel$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r6, r10, r11)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingInstructionSectionDataModel r6 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingInstructionSectionDataModel) r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingDecisionSectionDataModel$$serializer r10 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingDecisionSectionDataModel$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r7, r10, r11)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingDecisionSectionDataModel r7 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingDecisionSectionDataModel) r7
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemsDataModel$$serializer r10 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemsDataModel$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r10, r11)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemsDataModel r5 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemsDataModel) r5
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationDataModel$$serializer r10 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationDataModel$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r10, r11)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationDataModel r4 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationDataModel) r4
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.MustHaveCardDataModel$$serializer r10 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.MustHaveCardDataModel$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r3, r10, r11)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.MustHaveCardDataModel r3 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.MustHaveCardDataModel) r3
            r10 = 255(0xff, float:3.57E-43)
            r19 = r2
            r26 = r3
            r25 = r4
            r24 = r5
            r22 = r6
            r23 = r7
            r21 = r8
            r20 = r9
            r18 = r10
            goto L_0x010c
        L_0x0072:
            r16 = r9
            r2 = r10
            r8 = r11
            r9 = r8
            r10 = r9
            r12 = r10
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x007c:
            if (r16 == 0) goto L_0x00fa
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00f6;
                case 0: goto L_0x00e8;
                case 1: goto L_0x00da;
                case 2: goto L_0x00cb;
                case 3: goto L_0x00bc;
                case 4: goto L_0x00b0;
                case 5: goto L_0x00a4;
                case 6: goto L_0x0098;
                case 7: goto L_0x008b;
                default: goto L_0x0085;
            }
        L_0x0085:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x008b:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.MustHaveCardDataModel$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.MustHaveCardDataModel$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r3, r6, r8)
            r8 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.MustHaveCardDataModel r8 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.MustHaveCardDataModel) r8
            r2 = r2 | 128(0x80, float:1.794E-43)
        L_0x0096:
            r6 = 3
            goto L_0x007c
        L_0x0098:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationDataModel$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationDataModel$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r4, r6, r9)
            r9 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationDataModel r9 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationDataModel) r9
            r2 = r2 | 64
            goto L_0x0096
        L_0x00a4:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemsDataModel$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemsDataModel$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r5, r6, r10)
            r10 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemsDataModel r10 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemsDataModel) r10
            r2 = r2 | 32
            goto L_0x0096
        L_0x00b0:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingDecisionSectionDataModel$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingDecisionSectionDataModel$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r7, r6, r15)
            r15 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingDecisionSectionDataModel r15 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingDecisionSectionDataModel) r15
            r2 = r2 | 16
            goto L_0x0096
        L_0x00bc:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingInstructionSectionDataModel$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingInstructionSectionDataModel$$serializer.INSTANCE
            r3 = 3
            java.lang.Object r6 = r0.A(r1, r3, r6, r14)
            r14 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingInstructionSectionDataModel r14 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingInstructionSectionDataModel) r14
            r2 = r2 | 8
            r6 = r3
            r3 = 7
            goto L_0x007c
        L_0x00cb:
            r3 = 3
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ConfigurationSectionDataModel$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ConfigurationSectionDataModel$$serializer.INSTANCE
            r3 = 2
            java.lang.Object r6 = r0.A(r1, r3, r6, r13)
            r13 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ConfigurationSectionDataModel r13 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ConfigurationSectionDataModel) r13
            r2 = r2 | 4
        L_0x00d8:
            r3 = 7
            goto L_0x0096
        L_0x00da:
            r3 = 2
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel$$serializer.INSTANCE
            r3 = 1
            java.lang.Object r6 = r0.A(r1, r3, r6, r12)
            r12 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel r12 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel) r12
            r2 = r2 | 2
            goto L_0x00d8
        L_0x00e8:
            r3 = 1
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.InspirationSectionDataModel$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.InspirationSectionDataModel$$serializer.INSTANCE
            r3 = 0
            java.lang.Object r6 = r0.A(r1, r3, r6, r11)
            r11 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.InspirationSectionDataModel r11 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.InspirationSectionDataModel) r11
            r2 = r2 | 1
            goto L_0x00d8
        L_0x00f6:
            r3 = 0
            r16 = r3
            goto L_0x00d8
        L_0x00fa:
            r18 = r2
            r26 = r8
            r25 = r9
            r24 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r22 = r14
            r23 = r15
        L_0x010c:
            r0.c(r1)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel r0 = new com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel
            r27 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ScanAndGoProductResponseDataModel scanAndGoProductResponseDataModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(scanAndGoProductResponseDataModel, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ScanAndGoProductResponseDataModel.i(scanAndGoProductResponseDataModel, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C17294a.u(InspirationSectionDataModel$$serializer.INSTANCE), C17294a.u(PresentationSectionDataModel$$serializer.INSTANCE), C17294a.u(ConfigurationSectionDataModel$$serializer.INSTANCE), C17294a.u(BuyingInstructionSectionDataModel$$serializer.INSTANCE), C17294a.u(BuyingDecisionSectionDataModel$$serializer.INSTANCE), C17294a.u(ChildItemsDataModel$$serializer.INSTANCE), C17294a.u(ChildItemPresentationDataModel$$serializer.INSTANCE), C17294a.u(MustHaveCardDataModel$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
