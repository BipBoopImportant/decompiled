package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemProductCardDataModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemProductCardDataModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemProductCardDataModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemProductCardDataModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ChildItemProductCardDataModel$$serializer implements N<ChildItemProductCardDataModel> {
    public static final ChildItemProductCardDataModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChildItemProductCardDataModel$$serializer childItemProductCardDataModel$$serializer = new ChildItemProductCardDataModel$$serializer();
        INSTANCE = childItemProductCardDataModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel", childItemProductCardDataModel$$serializer, 9);
        j02.p("product", true);
        j02.p("stockInfo", false);
        j02.p("productType", false);
        j02.p("formattedItemNumber", false);
        j02.p("quantity", false);
        j02.p("max", false);
        j02.p("disclaimer", false);
        j02.p("itemNumber", false);
        j02.p("salesLocation", false);
        descriptor = j02;
    }

    private ChildItemProductCardDataModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel deserialize(kotlinx.serialization.encoding.Decoder r30) {
        /*
            r29 = this;
            r0 = r30
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 8
            r8 = 4
            r9 = 2
            r10 = 1
            r11 = 0
            r12 = 0
            if (r2 == 0) goto L_0x0076
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer r2 = com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer.INSTANCE
            java.lang.Object r2 = r0.A(r1, r11, r2, r12)
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r2 = (com.ingka.ikea.core.remotemodel.product.ProductLiteRemote) r2
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel$$serializer r11 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel$$serializer.INSTANCE
            java.lang.Object r10 = r0.A(r1, r10, r11, r12)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel r10 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel) r10
            jK.Y0 r11 = jK.Y0.f144077a
            java.lang.Object r9 = r0.A(r1, r9, r11, r12)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r6 = r0.A(r1, r6, r11, r12)
            java.lang.String r6 = (java.lang.String) r6
            jK.X r13 = jK.X.f144073a
            java.lang.Object r8 = r0.A(r1, r8, r13, r12)
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r5 = r0.A(r1, r5, r13, r12)
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r4 = r0.A(r1, r4, r11, r12)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.A(r1, r3, r11, r12)
            java.lang.String r3 = (java.lang.String) r3
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel$$serializer r11 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r7, r11, r12)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel r7 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel) r7
            r11 = 511(0x1ff, float:7.16E-43)
            r19 = r2
            r26 = r3
            r25 = r4
            r24 = r5
            r22 = r6
            r27 = r7
            r23 = r8
            r21 = r9
            r20 = r10
            r18 = r11
            goto L_0x0123
        L_0x0076:
            r16 = r10
            r2 = r11
            r6 = r12
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
            r13 = r11
            r14 = r13
            r15 = r14
        L_0x0081:
            if (r16 == 0) goto L_0x010f
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x010b;
                case 0: goto L_0x00fd;
                case 1: goto L_0x00ef;
                case 2: goto L_0x00e1;
                case 3: goto L_0x00d3;
                case 4: goto L_0x00c4;
                case 5: goto L_0x00b5;
                case 6: goto L_0x00a9;
                case 7: goto L_0x009d;
                case 8: goto L_0x0090;
                default: goto L_0x008a;
            }
        L_0x008a:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x0090:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel$$serializer r5 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r7, r5, r8)
            r8 = r5
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel r8 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationDataModel) r8
            r2 = r2 | 256(0x100, float:3.59E-43)
        L_0x009b:
            r5 = 5
            goto L_0x0081
        L_0x009d:
            jK.Y0 r5 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r3, r5, r6)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r2 = r2 | 128(0x80, float:1.794E-43)
            goto L_0x009b
        L_0x00a9:
            jK.Y0 r5 = jK.Y0.f144077a
            java.lang.Object r5 = r0.A(r1, r4, r5, r9)
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 64
            goto L_0x009b
        L_0x00b5:
            jK.X r5 = jK.X.f144073a
            r3 = 5
            java.lang.Object r5 = r0.A(r1, r3, r5, r10)
            r10 = r5
            java.lang.Integer r10 = (java.lang.Integer) r10
            r2 = r2 | 32
            r5 = r3
            r3 = 7
            goto L_0x0081
        L_0x00c4:
            r3 = 5
            jK.X r5 = jK.X.f144073a
            r3 = 4
            java.lang.Object r5 = r0.A(r1, r3, r5, r11)
            r11 = r5
            java.lang.Integer r11 = (java.lang.Integer) r11
            r2 = r2 | 16
        L_0x00d1:
            r3 = 7
            goto L_0x009b
        L_0x00d3:
            r3 = 4
            jK.Y0 r5 = jK.Y0.f144077a
            r3 = 3
            java.lang.Object r5 = r0.A(r1, r3, r5, r15)
            r15 = r5
            java.lang.String r15 = (java.lang.String) r15
            r2 = r2 | 8
            goto L_0x00d1
        L_0x00e1:
            r3 = 3
            jK.Y0 r5 = jK.Y0.f144077a
            r3 = 2
            java.lang.Object r5 = r0.A(r1, r3, r5, r14)
            r14 = r5
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 4
            goto L_0x00d1
        L_0x00ef:
            r3 = 2
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel$$serializer r5 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel$$serializer.INSTANCE
            r3 = 1
            java.lang.Object r5 = r0.A(r1, r3, r5, r13)
            r13 = r5
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel r13 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StockInfoDataModel) r13
            r2 = r2 | 2
            goto L_0x00d1
        L_0x00fd:
            r3 = 1
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer r5 = com.ingka.ikea.core.remotemodel.product.ProductLiteRemote$$serializer.INSTANCE
            r3 = 0
            java.lang.Object r5 = r0.A(r1, r3, r5, r12)
            r12 = r5
            com.ingka.ikea.core.remotemodel.product.ProductLiteRemote r12 = (com.ingka.ikea.core.remotemodel.product.ProductLiteRemote) r12
            r2 = r2 | 1
            goto L_0x00d1
        L_0x010b:
            r3 = 0
            r16 = r3
            goto L_0x00d1
        L_0x010f:
            r18 = r2
            r26 = r6
            r27 = r8
            r25 = r9
            r24 = r10
            r23 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x0123:
            r0.c(r1)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel r0 = new com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel
            r28 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemProductCardDataModel");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ChildItemProductCardDataModel childItemProductCardDataModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(childItemProductCardDataModel, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ChildItemProductCardDataModel.j(childItemProductCardDataModel, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?> u10 = C17294a.u(ProductLiteRemote$$serializer.INSTANCE);
        KSerializer<?> u11 = C17294a.u(StockInfoDataModel$$serializer.INSTANCE);
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u12 = C17294a.u(y02);
        KSerializer<?> u13 = C17294a.u(y02);
        X x10 = X.f144073a;
        return new KSerializer[]{u10, u11, u12, u13, C17294a.u(x10), C17294a.u(x10), C17294a.u(y02), C17294a.u(y02), C17294a.u(SalesLocationDataModel$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
