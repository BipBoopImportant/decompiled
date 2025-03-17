package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoOrderResponseDataModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoOrderResponseDataModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoOrderResponseDataModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoOrderResponseDataModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ScanAndGoOrderResponseDataModel$$serializer implements N<ScanAndGoOrderResponseDataModel> {
    public static final ScanAndGoOrderResponseDataModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScanAndGoOrderResponseDataModel$$serializer scanAndGoOrderResponseDataModel$$serializer = new ScanAndGoOrderResponseDataModel$$serializer();
        INSTANCE = scanAndGoOrderResponseDataModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoOrderResponseDataModel", scanAndGoOrderResponseDataModel$$serializer, 8);
        j02.p("familySavingsCard", false);
        j02.p("shoppingBag", false);
        j02.p("pickingList", false);
        j02.p("salesOrder", false);
        j02.p("summaryCard", false);
        j02.p("skippedBarcodes", false);
        j02.p("skippedCoupons", false);
        j02.p("applyCoWorkerDiscount", true);
        descriptor = j02;
    }

    private ScanAndGoOrderResponseDataModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.FamilySavingsCardDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShoppingBagDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PickingListDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesOrderDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.OrderSummaryCardDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoOrderResponseDataModel deserialize(kotlinx.serialization.encoding.Decoder r29) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoOrderResponseDataModel.f120078i
            boolean r3 = r0.q()
            r4 = 7
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 6
            r9 = 5
            r10 = 1
            r11 = 0
            r12 = 0
            if (r3 == 0) goto L_0x0072
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.FamilySavingsCardDataModel$$serializer r3 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.FamilySavingsCardDataModel$$serializer.INSTANCE
            java.lang.Object r3 = r0.A(r1, r11, r3, r12)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.FamilySavingsCardDataModel r3 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.FamilySavingsCardDataModel) r3
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShoppingBagDataModel$$serializer r11 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShoppingBagDataModel$$serializer.INSTANCE
            java.lang.Object r10 = r0.A(r1, r10, r11, r12)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShoppingBagDataModel r10 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShoppingBagDataModel) r10
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PickingListDataModel$$serializer r11 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PickingListDataModel$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r7, r11, r12)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PickingListDataModel r7 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PickingListDataModel) r7
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesOrderDataModel$$serializer r11 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesOrderDataModel$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r11, r12)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesOrderDataModel r5 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesOrderDataModel) r5
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.OrderSummaryCardDataModel$$serializer r11 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.OrderSummaryCardDataModel$$serializer.INSTANCE
            java.lang.Object r6 = r0.A(r1, r6, r11, r12)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.OrderSummaryCardDataModel r6 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.OrderSummaryCardDataModel) r6
            r11 = r2[r9]
            java.lang.Object r9 = r0.A(r1, r9, r11, r12)
            java.util.List r9 = (java.util.List) r9
            r2 = r2[r8]
            java.lang.Object r2 = r0.A(r1, r8, r2, r12)
            java.util.List r2 = (java.util.List) r2
            boolean r4 = r0.D(r1, r4)
            r8 = 255(0xff, float:3.57E-43)
            r25 = r2
            r19 = r3
            r26 = r4
            r22 = r5
            r23 = r6
            r21 = r7
            r18 = r8
            r24 = r9
            r20 = r10
            goto L_0x0109
        L_0x0072:
            r16 = r10
            r3 = r11
            r5 = r12
            r7 = r5
            r10 = r7
            r13 = r10
            r14 = r13
            r15 = r14
            r11 = r15
            r12 = r3
        L_0x007d:
            if (r16 == 0) goto L_0x00f7
            int r6 = r0.p(r1)
            switch(r6) {
                case -1: goto L_0x00f3;
                case 0: goto L_0x00e5;
                case 1: goto L_0x00d7;
                case 2: goto L_0x00c9;
                case 3: goto L_0x00ba;
                case 4: goto L_0x00ab;
                case 5: goto L_0x009f;
                case 6: goto L_0x0094;
                case 7: goto L_0x008c;
                default: goto L_0x0086;
            }
        L_0x0086:
            fK.E r0 = new fK.E
            r0.<init>((int) r6)
            throw r0
        L_0x008c:
            boolean r3 = r0.D(r1, r4)
            r12 = r12 | 128(0x80, float:1.794E-43)
        L_0x0092:
            r6 = 4
            goto L_0x007d
        L_0x0094:
            r6 = r2[r8]
            java.lang.Object r5 = r0.A(r1, r8, r6, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = r12 | 64
            goto L_0x0092
        L_0x009f:
            r6 = r2[r9]
            java.lang.Object r6 = r0.A(r1, r9, r6, r7)
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            r12 = r12 | 32
            goto L_0x0092
        L_0x00ab:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.OrderSummaryCardDataModel$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.OrderSummaryCardDataModel$$serializer.INSTANCE
            r4 = 4
            java.lang.Object r6 = r0.A(r1, r4, r6, r10)
            r10 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.OrderSummaryCardDataModel r10 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.OrderSummaryCardDataModel) r10
            r12 = r12 | 16
            r6 = r4
            r4 = 7
            goto L_0x007d
        L_0x00ba:
            r4 = 4
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesOrderDataModel$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesOrderDataModel$$serializer.INSTANCE
            r4 = 3
            java.lang.Object r6 = r0.A(r1, r4, r6, r11)
            r11 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesOrderDataModel r11 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesOrderDataModel) r11
            r12 = r12 | 8
        L_0x00c7:
            r4 = 7
            goto L_0x0092
        L_0x00c9:
            r4 = 3
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PickingListDataModel$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PickingListDataModel$$serializer.INSTANCE
            r4 = 2
            java.lang.Object r6 = r0.A(r1, r4, r6, r15)
            r15 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PickingListDataModel r15 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PickingListDataModel) r15
            r12 = r12 | 4
            goto L_0x00c7
        L_0x00d7:
            r4 = 2
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShoppingBagDataModel$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShoppingBagDataModel$$serializer.INSTANCE
            r4 = 1
            java.lang.Object r6 = r0.A(r1, r4, r6, r14)
            r14 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShoppingBagDataModel r14 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ShoppingBagDataModel) r14
            r12 = r12 | 2
            goto L_0x00c7
        L_0x00e5:
            r4 = 1
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.FamilySavingsCardDataModel$$serializer r6 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.FamilySavingsCardDataModel$$serializer.INSTANCE
            r4 = 0
            java.lang.Object r6 = r0.A(r1, r4, r6, r13)
            r13 = r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.FamilySavingsCardDataModel r13 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.FamilySavingsCardDataModel) r13
            r12 = r12 | 1
            goto L_0x00c7
        L_0x00f3:
            r4 = 0
            r16 = r4
            goto L_0x00c7
        L_0x00f7:
            r26 = r3
            r25 = r5
            r24 = r7
            r23 = r10
            r22 = r11
            r18 = r12
            r19 = r13
            r20 = r14
            r21 = r15
        L_0x0109:
            r0.c(r1)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoOrderResponseDataModel r0 = new com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoOrderResponseDataModel
            r27 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoOrderResponseDataModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoOrderResponseDataModel");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ScanAndGoOrderResponseDataModel scanAndGoOrderResponseDataModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(scanAndGoOrderResponseDataModel, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ScanAndGoOrderResponseDataModel.i(scanAndGoOrderResponseDataModel, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = ScanAndGoOrderResponseDataModel.f120078i;
        return new KSerializer[]{C17294a.u(FamilySavingsCardDataModel$$serializer.INSTANCE), C17294a.u(ShoppingBagDataModel$$serializer.INSTANCE), C17294a.u(PickingListDataModel$$serializer.INSTANCE), C17294a.u(SalesOrderDataModel$$serializer.INSTANCE), C17294a.u(OrderSummaryCardDataModel$$serializer.INSTANCE), C17294a.u(a10[5]), C17294a.u(a10[6]), C17457i.f144111a};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
