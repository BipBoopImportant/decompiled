package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17438C;
import jK.J0;
import jK.N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryDistributionRemoteModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryDistributionRemoteModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryDistributionRemoteModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/caasremote/models/NullableTotalSavingsSummaryDistributionRemoteModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C16814e
public final class NullableTotalSavingsSummaryDistributionRemoteModel$$serializer implements N<NullableTotalSavingsSummaryDistributionRemoteModel> {
    public static final NullableTotalSavingsSummaryDistributionRemoteModel$$serializer INSTANCE;
    private static final /* synthetic */ J0 descriptor;

    static {
        NullableTotalSavingsSummaryDistributionRemoteModel$$serializer nullableTotalSavingsSummaryDistributionRemoteModel$$serializer = new NullableTotalSavingsSummaryDistributionRemoteModel$$serializer();
        INSTANCE = nullableTotalSavingsSummaryDistributionRemoteModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryDistributionRemoteModel", nullableTotalSavingsSummaryDistributionRemoteModel$$serializer, 6);
        j02.p("coupons", false);
        j02.p("discounts", false);
        j02.p("employee", false);
        j02.p("familyDiscounts", false);
        j02.p("familyPrice", false);
        j02.p("voucher", false);
        descriptor = j02;
    }

    private NullableTotalSavingsSummaryDistributionRemoteModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Double} */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b4, code lost:
        r3 = 5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryDistributionRemoteModel deserialize(kotlinx.serialization.encoding.Decoder r26) {
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
            jK.C r2 = jK.C17438C.f144010a
            java.lang.Object r8 = r0.A(r1, r8, r2, r9)
            java.lang.Double r8 = (java.lang.Double) r8
            java.lang.Object r7 = r0.A(r1, r7, r2, r9)
            java.lang.Double r7 = (java.lang.Double) r7
            java.lang.Object r6 = r0.A(r1, r6, r2, r9)
            java.lang.Double r6 = (java.lang.Double) r6
            java.lang.Object r4 = r0.A(r1, r4, r2, r9)
            java.lang.Double r4 = (java.lang.Double) r4
            java.lang.Object r5 = r0.A(r1, r5, r2, r9)
            java.lang.Double r5 = (java.lang.Double) r5
            java.lang.Object r2 = r0.A(r1, r3, r2, r9)
            java.lang.Double r2 = (java.lang.Double) r2
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
            jK.C r8 = jK.C17438C.f144010a
            java.lang.Object r8 = r0.A(r1, r3, r8, r14)
            r14 = r8
            java.lang.Double r14 = (java.lang.Double) r14
            r2 = r2 | 32
        L_0x0075:
            r8 = 0
            goto L_0x005b
        L_0x0077:
            jK.C r8 = jK.C17438C.f144010a
            java.lang.Object r8 = r0.A(r1, r5, r8, r13)
            r13 = r8
            java.lang.Double r13 = (java.lang.Double) r13
            r2 = r2 | 16
            goto L_0x0075
        L_0x0083:
            jK.C r8 = jK.C17438C.f144010a
            java.lang.Object r8 = r0.A(r1, r4, r8, r12)
            r12 = r8
            java.lang.Double r12 = (java.lang.Double) r12
            r2 = r2 | 8
            goto L_0x0075
        L_0x008f:
            jK.C r8 = jK.C17438C.f144010a
            java.lang.Object r8 = r0.A(r1, r6, r8, r11)
            r11 = r8
            java.lang.Double r11 = (java.lang.Double) r11
            r2 = r2 | 4
            goto L_0x0075
        L_0x009b:
            jK.C r8 = jK.C17438C.f144010a
            java.lang.Object r8 = r0.A(r1, r7, r8, r10)
            r10 = r8
            java.lang.Double r10 = (java.lang.Double) r10
            r2 = r2 | 2
            goto L_0x0075
        L_0x00a7:
            jK.C r8 = jK.C17438C.f144010a
            r3 = 0
            java.lang.Object r8 = r0.A(r1, r3, r8, r9)
            r9 = r8
            java.lang.Double r9 = (java.lang.Double) r9
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
            com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryDistributionRemoteModel r0 = new com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryDistributionRemoteModel
            r24 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryDistributionRemoteModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.app.caasremote.models.NullableTotalSavingsSummaryDistributionRemoteModel");
    }

    /* renamed from: c */
    public void serialize(Encoder encoder, NullableTotalSavingsSummaryDistributionRemoteModel nullableTotalSavingsSummaryDistributionRemoteModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(nullableTotalSavingsSummaryDistributionRemoteModel, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        C17395d b10 = encoder.b(descriptor2);
        NullableTotalSavingsSummaryDistributionRemoteModel.b(nullableTotalSavingsSummaryDistributionRemoteModel, b10, descriptor2);
        b10.c(descriptor2);
    }

    public KSerializer<?>[] childSerializers() {
        C17438C c10 = C17438C.f144010a;
        return new KSerializer[]{C17294a.u(c10), C17294a.u(c10), C17294a.u(c10), C17294a.u(c10), C17294a.u(c10), C17294a.u(c10)};
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
