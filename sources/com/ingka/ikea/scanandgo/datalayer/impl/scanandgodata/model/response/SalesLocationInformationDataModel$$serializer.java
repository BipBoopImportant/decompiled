package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationInformationDataModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationInformationDataModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationInformationDataModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/SalesLocationInformationDataModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class SalesLocationInformationDataModel$$serializer implements N<SalesLocationInformationDataModel> {
    public static final SalesLocationInformationDataModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SalesLocationInformationDataModel$$serializer salesLocationInformationDataModel$$serializer = new SalesLocationInformationDataModel$$serializer();
        INSTANCE = salesLocationInformationDataModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationInformationDataModel", salesLocationInformationDataModel$$serializer, 6);
        j02.p("id", false);
        j02.p("recommendationRank", false);
        j02.p("division", false);
        j02.p("aisleAndBin", false);
        j02.p("department", false);
        j02.p("type", false);
        descriptor = j02;
    }

    private SalesLocationInformationDataModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationAisleBinDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentDataModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b8, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationInformationDataModel deserialize(kotlinx.serialization.encoding.Decoder r26) {
        /*
            r25 = this;
            r0 = r26
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r2 == 0) goto L_0x0058
            jK.Y0 r2 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r8, r2, r9)
            java.lang.String r8 = (java.lang.String) r8
            jK.X r10 = jK.X.f144073a
            java.lang.Object r7 = r0.A(r1, r7, r10, r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.Object r6 = r0.A(r1, r6, r2, r9)
            java.lang.String r6 = (java.lang.String) r6
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationAisleBinDataModel$$serializer r10 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationAisleBinDataModel$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r10, r9)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationAisleBinDataModel r4 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationAisleBinDataModel) r4
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentDataModel$$serializer r10 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentDataModel$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r1, r5, r10, r9)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentDataModel r5 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentDataModel) r5
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
            goto L_0x00cc
        L_0x0058:
            r15 = r7
            r2 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x005f:
            if (r15 == 0) goto L_0x00be
            int r8 = r0.p(r1)
            switch(r8) {
                case -1: goto L_0x00ba;
                case 0: goto L_0x00ab;
                case 1: goto L_0x009f;
                case 2: goto L_0x0093;
                case 3: goto L_0x0087;
                case 4: goto L_0x007b;
                case 5: goto L_0x006e;
                default: goto L_0x0068;
            }
        L_0x0068:
            fK.E r0 = new fK.E
            r0.<init>((int) r8)
            throw r0
        L_0x006e:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r3, r8, r14)
            r14 = r8
            java.lang.String r14 = (java.lang.String) r14
            r2 = r2 | 32
        L_0x0079:
            r8 = 0
            goto L_0x005f
        L_0x007b:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentDataModel$$serializer r8 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentDataModel$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r5, r8, r13)
            r13 = r8
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentDataModel r13 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationDepartmentDataModel) r13
            r2 = r2 | 16
            goto L_0x0079
        L_0x0087:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationAisleBinDataModel$$serializer r8 = com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationAisleBinDataModel$$serializer.INSTANCE
            java.lang.Object r8 = r0.A(r1, r4, r8, r12)
            r12 = r8
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationAisleBinDataModel r12 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.LocationAisleBinDataModel) r12
            r2 = r2 | 8
            goto L_0x0079
        L_0x0093:
            jK.Y0 r8 = jK.Y0.f144077a
            java.lang.Object r8 = r0.A(r1, r6, r8, r11)
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            r2 = r2 | 4
            goto L_0x0079
        L_0x009f:
            jK.X r8 = jK.X.f144073a
            java.lang.Object r8 = r0.A(r1, r7, r8, r10)
            r10 = r8
            java.lang.Integer r10 = (java.lang.Integer) r10
            r2 = r2 | 2
            goto L_0x0079
        L_0x00ab:
            jK.Y0 r8 = jK.Y0.f144077a
            r3 = 0
            java.lang.Object r8 = r0.A(r1, r3, r8, r9)
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r2 = r2 | 1
            r8 = r3
        L_0x00b8:
            r3 = 5
            goto L_0x005f
        L_0x00ba:
            r3 = 0
            r8 = r3
            r15 = r8
            goto L_0x00b8
        L_0x00be:
            r17 = r2
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
        L_0x00cc:
            r0.c(r1)
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationInformationDataModel r0 = new com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationInformationDataModel
            r24 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationInformationDataModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.SalesLocationInformationDataModel");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, SalesLocationInformationDataModel salesLocationInformationDataModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(salesLocationInformationDataModel, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        SalesLocationInformationDataModel.c(salesLocationInformationDataModel, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        return new KSerializer[]{C17294a.u(y02), C17294a.u(X.f144073a), C17294a.u(y02), C17294a.u(LocationAisleBinDataModel$$serializer.INSTANCE), C17294a.u(LocationDepartmentDataModel$$serializer.INSTANCE), C17294a.u(y02)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
