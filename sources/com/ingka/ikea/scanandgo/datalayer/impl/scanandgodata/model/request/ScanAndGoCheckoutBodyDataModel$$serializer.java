package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request;

import XH.C16814e;
import gK.C17294a;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ScanAndGoCheckoutBodyDataModel$$serializer implements N<ScanAndGoCheckoutBodyDataModel> {
    public static final ScanAndGoCheckoutBodyDataModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScanAndGoCheckoutBodyDataModel$$serializer scanAndGoCheckoutBodyDataModel$$serializer = new ScanAndGoCheckoutBodyDataModel$$serializer();
        INSTANCE = scanAndGoCheckoutBodyDataModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoCheckoutBodyDataModel", scanAndGoCheckoutBodyDataModel$$serializer, 7);
        j02.p("familyCard", false);
        j02.p("barcodes", false);
        j02.p("salesOrder", false);
        j02.p("email", false);
        j02.p("coupons", false);
        j02.p("applyCoWorkerDiscount", true);
        j02.p("fullserveTimeWindowId", false);
        descriptor = j02;
    }

    private ScanAndGoCheckoutBodyDataModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b4, code lost:
        r4 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c3, code lost:
        r4 = 6;
        r5 = 5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoCheckoutBodyDataModel deserialize(kotlinx.serialization.encoding.Decoder r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoCheckoutBodyDataModel.f119926h
            boolean r3 = r0.q()
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 0
            if (r3 == 0) goto L_0x0063
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r10 = r0.A(r1, r10, r3, r11)
            java.lang.String r10 = (java.lang.String) r10
            r12 = r2[r9]
            java.lang.Object r9 = r0.o(r1, r9, r12, r11)
            java.util.List r9 = (java.util.List) r9
            r12 = r2[r8]
            java.lang.Object r8 = r0.o(r1, r8, r12, r11)
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r6 = r0.A(r1, r6, r3, r11)
            java.lang.String r6 = (java.lang.String) r6
            r2 = r2[r7]
            java.lang.Object r2 = r0.A(r1, r7, r2, r11)
            java.util.List r2 = (java.util.List) r2
            boolean r5 = r0.D(r1, r5)
            java.lang.Object r3 = r0.A(r1, r4, r3, r11)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 127(0x7f, float:1.78E-43)
            r23 = r2
            r25 = r3
            r18 = r4
            r24 = r5
            r22 = r6
            r21 = r8
            r20 = r9
            r19 = r10
            goto L_0x00ea
        L_0x0063:
            r16 = r9
            r3 = r10
            r9 = r11
            r12 = r9
            r13 = r12
            r14 = r13
            r15 = r14
            r10 = r15
            r11 = r3
        L_0x006d:
            if (r16 == 0) goto L_0x00da
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x00d5;
                case 0: goto L_0x00c6;
                case 1: goto L_0x00b6;
                case 2: goto L_0x00a8;
                case 3: goto L_0x009c;
                case 4: goto L_0x0090;
                case 5: goto L_0x0089;
                case 6: goto L_0x007c;
                default: goto L_0x0076;
            }
        L_0x0076:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x007c:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r4, r8, r9)
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r3 = r3 | 64
        L_0x0087:
            r8 = 2
            goto L_0x006d
        L_0x0089:
            boolean r11 = r0.D(r1, r5)
            r3 = r3 | 32
            goto L_0x0087
        L_0x0090:
            r8 = r2[r7]
            java.lang.Object r8 = r0.A(r1, r7, r8, r10)
            r10 = r8
            java.util.List r10 = (java.util.List) r10
            r3 = r3 | 16
            goto L_0x0087
        L_0x009c:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r6, r8, r15)
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15
            r3 = r3 | 8
            goto L_0x0087
        L_0x00a8:
            r8 = 2
            r4 = r2[r8]
            java.lang.Object r4 = r0.o(r1, r8, r4, r14)
            r14 = r4
            java.util.List r14 = (java.util.List) r14
            r3 = r3 | 4
        L_0x00b4:
            r4 = 6
            goto L_0x006d
        L_0x00b6:
            r4 = 1
            r8 = 2
            r5 = r2[r4]
            java.lang.Object r5 = r0.o(r1, r4, r5, r13)
            r13 = r5
            java.util.List r13 = (java.util.List) r13
            r3 = r3 | 2
        L_0x00c3:
            r4 = 6
            r5 = 5
            goto L_0x006d
        L_0x00c6:
            r4 = 1
            r8 = 2
            jK.Y0 r5 = jK.Y0.f144077a
            r4 = 0
            java.lang.Object r5 = r0.A(r1, r4, r5, r12)
            r12 = r5
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 1
            goto L_0x00c3
        L_0x00d5:
            r4 = 0
            r8 = 2
            r16 = r4
            goto L_0x00b4
        L_0x00da:
            r18 = r3
            r25 = r9
            r23 = r10
            r24 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r22 = r15
        L_0x00ea:
            r0.c(r1)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoCheckoutBodyDataModel r0 = new com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoCheckoutBodyDataModel
            r26 = 0
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoCheckoutBodyDataModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoCheckoutBodyDataModel");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ScanAndGoCheckoutBodyDataModel scanAndGoCheckoutBodyDataModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(scanAndGoCheckoutBodyDataModel, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ScanAndGoCheckoutBodyDataModel.b(scanAndGoCheckoutBodyDataModel, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = ScanAndGoCheckoutBodyDataModel.f119926h;
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), a10[1], a10[2], C17294a.u(y02), C17294a.u(a10[4]), C17457i.f144111a, C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
