package com.ingka.ikea.appconfig.impl.service.network;

import XH.C16814e;
import gK.C17294a;
import iK.C17395d;
import jK.C17438C;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/appconfig/impl/service/network/CurrencyRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/appconfig/impl/service/network/CurrencyRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/appconfig/impl/service/network/CurrencyRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/appconfig/impl/service/network/CurrencyRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class CurrencyRemote$$serializer implements N<CurrencyRemote> {
    public static final CurrencyRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CurrencyRemote$$serializer currencyRemote$$serializer = new CurrencyRemote$$serializer();
        INSTANCE = currencyRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote", currencyRemote$$serializer, 15);
        j02.p("symbol", false);
        j02.p("decimalSymbol", false);
        j02.p("code", false);
        j02.p("negativeFormat", false);
        j02.p("positiveFormat", false);
        j02.p("digitGroupSymbol", false);
        j02.p("integerSymbol", false);
        j02.p("nbrFractionDigits", false);
        j02.p("showFractionDigitsOnInteger", false);
        j02.p("conversionRate", false);
        j02.p("decimalVerticalAlignment", false);
        j02.p("decimalSign", false);
        j02.p("currencyVerticalAlignment", false);
        j02.p("currencyPosition", false);
        j02.p("analyticsConversionRate", false);
        descriptor = j02;
    }

    private CurrencyRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Double} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00eb, code lost:
        r4 = r25;
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01cd, code lost:
        r3 = r20;
        r2 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01eb, code lost:
        r4 = r19;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote deserialize(kotlinx.serialization.encoding.Decoder r46) {
        /*
            r45 = this;
            r0 = r46
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            boolean r2 = r0.q()
            r7 = 10
            r8 = 9
            r9 = 7
            r10 = 6
            r11 = 5
            r12 = 3
            r13 = 8
            r14 = 4
            r15 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L_0x00b6
            jK.Y0 r2 = jK.Y0.f144077a
            java.lang.Object r4 = r0.A(r1, r4, r2, r5)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r0.A(r1, r3, r2, r5)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r15 = r0.A(r1, r15, r2, r5)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r12 = r0.A(r1, r12, r2, r5)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r14 = r0.A(r1, r14, r2, r5)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r11 = r0.A(r1, r11, r2, r5)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.A(r1, r10, r2, r5)
            java.lang.String r10 = (java.lang.String) r10
            jK.X r6 = jK.X.f144073a
            java.lang.Object r6 = r0.A(r1, r9, r6, r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            jK.i r9 = jK.C17457i.f144111a
            java.lang.Object r9 = r0.A(r1, r13, r9, r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            jK.C r13 = jK.C17438C.f144010a
            java.lang.Object r8 = r0.A(r1, r8, r13, r5)
            java.lang.Double r8 = (java.lang.Double) r8
            java.lang.Object r7 = r0.A(r1, r7, r2, r5)
            java.lang.String r7 = (java.lang.String) r7
            r18 = r3
            r3 = 11
            java.lang.Object r3 = r0.A(r1, r3, r2, r5)
            java.lang.String r3 = (java.lang.String) r3
            r17 = r3
            r3 = 12
            java.lang.Object r3 = r0.A(r1, r3, r2, r5)
            java.lang.String r3 = (java.lang.String) r3
            r16 = r3
            r3 = 13
            java.lang.Object r2 = r0.A(r1, r3, r2, r5)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 14
            java.lang.Object r3 = r0.A(r1, r3, r13, r5)
            java.lang.Double r3 = (java.lang.Double) r3
            r5 = 32767(0x7fff, float:4.5916E-41)
            r42 = r2
            r43 = r3
            r29 = r4
            r28 = r5
            r36 = r6
            r39 = r7
            r38 = r8
            r37 = r9
            r35 = r10
            r34 = r11
            r32 = r12
            r33 = r14
            r31 = r15
            r41 = r16
            r40 = r17
            r30 = r18
            goto L_0x0243
        L_0x00b6:
            r24 = r3
            r2 = r5
            r3 = r2
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r22 = r15
            r23 = r22
            r5 = r4
            r4 = r23
        L_0x00cb:
            if (r24 == 0) goto L_0x0219
            r25 = r4
            int r4 = r0.p(r1)
            switch(r4) {
                case -1: goto L_0x020b;
                case 0: goto L_0x01ee;
                case 1: goto L_0x01d3;
                case 2: goto L_0x01b9;
                case 3: goto L_0x01a0;
                case 4: goto L_0x018f;
                case 5: goto L_0x017e;
                case 6: goto L_0x016d;
                case 7: goto L_0x015b;
                case 8: goto L_0x0149;
                case 9: goto L_0x0137;
                case 10: goto L_0x0125;
                case 11: goto L_0x0113;
                case 12: goto L_0x0101;
                case 13: goto L_0x00f0;
                case 14: goto L_0x00dc;
                default: goto L_0x00d6;
            }
        L_0x00d6:
            fK.E r0 = new fK.E
            r0.<init>((int) r4)
            throw r0
        L_0x00dc:
            jK.C r4 = jK.C17438C.f144010a
            r26 = r3
            r3 = 14
            java.lang.Object r4 = r0.A(r1, r3, r4, r6)
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
            r5 = r5 | 16384(0x4000, float:2.2959E-41)
        L_0x00eb:
            r4 = r25
            r3 = r26
            goto L_0x00cb
        L_0x00f0:
            r26 = r3
            r3 = 14
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 13
            java.lang.Object r2 = r0.A(r1, r3, r4, r2)
            java.lang.String r2 = (java.lang.String) r2
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            goto L_0x00eb
        L_0x0101:
            r26 = r3
            r3 = 13
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 12
            java.lang.Object r4 = r0.A(r1, r3, r4, r7)
            r7 = r4
            java.lang.String r7 = (java.lang.String) r7
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            goto L_0x00eb
        L_0x0113:
            r26 = r3
            r3 = 12
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 11
            java.lang.Object r4 = r0.A(r1, r3, r4, r8)
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            r5 = r5 | 2048(0x800, float:2.87E-42)
            goto L_0x00eb
        L_0x0125:
            r26 = r3
            r3 = 11
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 10
            java.lang.Object r4 = r0.A(r1, r3, r4, r13)
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            r5 = r5 | 1024(0x400, float:1.435E-42)
            goto L_0x00eb
        L_0x0137:
            r26 = r3
            r3 = 10
            jK.C r4 = jK.C17438C.f144010a
            r3 = 9
            java.lang.Object r4 = r0.A(r1, r3, r4, r9)
            r9 = r4
            java.lang.Double r9 = (java.lang.Double) r9
            r5 = r5 | 512(0x200, float:7.175E-43)
            goto L_0x00eb
        L_0x0149:
            r26 = r3
            r3 = 9
            jK.i r4 = jK.C17457i.f144111a
            r3 = 8
            java.lang.Object r4 = r0.A(r1, r3, r4, r10)
            r10 = r4
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r5 = r5 | 256(0x100, float:3.59E-43)
            goto L_0x00eb
        L_0x015b:
            r26 = r3
            r3 = 8
            jK.X r4 = jK.X.f144073a
            r3 = 7
            java.lang.Object r4 = r0.A(r1, r3, r4, r11)
            r11 = r4
            java.lang.Integer r11 = (java.lang.Integer) r11
            r5 = r5 | 128(0x80, float:1.794E-43)
            goto L_0x00eb
        L_0x016d:
            r26 = r3
            r3 = 7
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 6
            java.lang.Object r4 = r0.A(r1, r3, r4, r14)
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            r5 = r5 | 64
            goto L_0x00eb
        L_0x017e:
            r26 = r3
            r3 = 6
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 5
            java.lang.Object r4 = r0.A(r1, r3, r4, r12)
            r12 = r4
            java.lang.String r12 = (java.lang.String) r12
            r5 = r5 | 32
            goto L_0x00eb
        L_0x018f:
            r26 = r3
            r3 = 5
            jK.Y0 r4 = jK.Y0.f144077a
            r3 = 4
            java.lang.Object r4 = r0.A(r1, r3, r4, r15)
            r15 = r4
            java.lang.String r15 = (java.lang.String) r15
            r5 = r5 | 16
            goto L_0x00eb
        L_0x01a0:
            r26 = r3
            r3 = 4
            jK.Y0 r4 = jK.Y0.f144077a
            r21 = r2
            r2 = r26
            r3 = 3
            java.lang.Object r2 = r0.A(r1, r3, r4, r2)
            java.lang.String r2 = (java.lang.String) r2
            r5 = r5 | 8
            r3 = r2
            r2 = r21
            r4 = r25
            goto L_0x00cb
        L_0x01b9:
            r21 = r2
            r2 = r3
            r3 = 3
            jK.Y0 r4 = jK.Y0.f144077a
            r20 = r2
            r2 = r25
            r3 = 2
            java.lang.Object r2 = r0.A(r1, r3, r4, r2)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            r5 = r5 | 4
        L_0x01cd:
            r3 = r20
            r2 = r21
            goto L_0x00cb
        L_0x01d3:
            r21 = r2
            r20 = r3
            r2 = r25
            r3 = 2
            jK.Y0 r4 = jK.Y0.f144077a
            r19 = r2
            r2 = r23
            r3 = 1
            java.lang.Object r2 = r0.A(r1, r3, r4, r2)
            r23 = r2
            java.lang.String r23 = (java.lang.String) r23
            r5 = r5 | 2
        L_0x01eb:
            r4 = r19
            goto L_0x01cd
        L_0x01ee:
            r21 = r2
            r20 = r3
            r2 = r23
            r19 = r25
            r3 = 1
            jK.Y0 r4 = jK.Y0.f144077a
            r18 = r2
            r2 = r22
            r3 = 0
            java.lang.Object r2 = r0.A(r1, r3, r4, r2)
            r22 = r2
            java.lang.String r22 = (java.lang.String) r22
            r5 = r5 | 1
            r23 = r18
            goto L_0x01eb
        L_0x020b:
            r21 = r2
            r20 = r3
            r2 = r22
            r18 = r23
            r19 = r25
            r3 = 0
            r24 = r3
            goto L_0x01eb
        L_0x0219:
            r21 = r2
            r20 = r3
            r19 = r4
            r2 = r22
            r18 = r23
            r29 = r2
            r28 = r5
            r43 = r6
            r41 = r7
            r40 = r8
            r38 = r9
            r37 = r10
            r36 = r11
            r34 = r12
            r39 = r13
            r35 = r14
            r33 = r15
            r30 = r18
            r31 = r19
            r32 = r20
            r42 = r21
        L_0x0243:
            r0.c(r1)
            com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote r0 = new com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote
            r27 = r0
            r44 = 0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, CurrencyRemote currencyRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(currencyRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        CurrencyRemote.e(currencyRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(y02);
        KSerializer<?> u12 = C17294a.u(y02);
        KSerializer<?> u13 = C17294a.u(y02);
        KSerializer<?> u14 = C17294a.u(y02);
        KSerializer<?> u15 = C17294a.u(y02);
        KSerializer<?> u16 = C17294a.u(y02);
        KSerializer<?> u17 = C17294a.u(X.f144073a);
        KSerializer<?> u18 = C17294a.u(C17457i.f144111a);
        C17438C c10 = C17438C.f144010a;
        return new KSerializer[]{u10, u11, u12, u13, u14, u15, u16, u17, u18, C17294a.u(c10), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(y02), C17294a.u(c10)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
