package com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote;

import XH.C16814e;
import com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings$$serializer;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.C17458i0;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/scanandgo/datalayer/impl/settings/datasource/remote/ScanAndGoSettingsRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/settings/datasource/remote/ScanAndGoSettingsRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/scanandgo/datalayer/impl/settings/datasource/remote/ScanAndGoSettingsRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/scanandgo/datalayer/impl/settings/datasource/remote/ScanAndGoSettingsRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ScanAndGoSettingsRemote$$serializer implements N<ScanAndGoSettingsRemote> {
    public static final ScanAndGoSettingsRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScanAndGoSettingsRemote$$serializer scanAndGoSettingsRemote$$serializer = new ScanAndGoSettingsRemote$$serializer();
        INSTANCE = scanAndGoSettingsRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemote", scanAndGoSettingsRemote$$serializer, 16);
        j02.p("countryCode", false);
        j02.p("languageCodes", false);
        j02.p("version", false);
        j02.p("storeName", false);
        j02.p("timeout", false);
        j02.p("digitalReceipt", false);
        j02.p("upptacka", false);
        j02.p("couponsEnabled", false);
        j02.p("ptagLinkSupport", false);
        j02.p("caasEnabled", false);
        j02.p("coworkerDiscountEnabled", false);
        j02.p("caasCheckoutEnabled", false);
        j02.p("caasFullserveEnabled", false);
        j02.p("showTotalPricesInclVat", false);
        j02.p("fullserveTimeSlotsEnabled", false);
        j02.p("fullserveEarlyPaymentEnabled", false);
        descriptor = j02;
    }

    private ScanAndGoSettingsRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0102, code lost:
        r5 = r29;
        r14 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01e5, code lost:
        r14 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x01e7, code lost:
        r2 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0203, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemote deserialize(kotlinx.serialization.encoding.Decoder r51) {
        /*
            r50 = this;
            r0 = r51
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemote.$childSerializers
            boolean r3 = r0.q()
            r9 = 10
            r10 = 9
            r11 = 7
            r12 = 6
            r13 = 5
            r14 = 3
            r15 = 8
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r3 == 0) goto L_0x00c9
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r7 = r0.A(r1, r7, r3, r8)
            java.lang.String r7 = (java.lang.String) r7
            r2 = r2[r6]
            java.lang.Object r2 = r0.A(r1, r6, r2, r8)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r0.A(r1, r5, r3, r8)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r0.A(r1, r14, r3, r8)
            java.lang.String r3 = (java.lang.String) r3
            jK.i0 r6 = jK.C17458i0.f144113a
            java.lang.Object r4 = r0.A(r1, r4, r6, r8)
            java.lang.Long r4 = (java.lang.Long) r4
            jK.i r6 = jK.C17457i.f144111a
            java.lang.Object r13 = r0.A(r1, r13, r6, r8)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings$$serializer r14 = com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings$$serializer.INSTANCE
            java.lang.Object r12 = r0.A(r1, r12, r14, r8)
            com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings r12 = (com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings) r12
            java.lang.Object r11 = r0.A(r1, r11, r6, r8)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            java.lang.Object r14 = r0.A(r1, r15, r6, r8)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            java.lang.Object r10 = r0.A(r1, r10, r6, r8)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.Object r9 = r0.A(r1, r9, r6, r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r15 = 11
            java.lang.Object r15 = r0.A(r1, r15, r6, r8)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            r19 = r2
            r2 = 12
            java.lang.Object r2 = r0.A(r1, r2, r6, r8)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r18 = r2
            r2 = 13
            java.lang.Object r2 = r0.A(r1, r2, r6, r8)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r17 = r2
            r2 = 14
            java.lang.Object r2 = r0.A(r1, r2, r6, r8)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r16 = r2
            r2 = 15
            java.lang.Object r2 = r0.A(r1, r2, r6, r8)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r6 = 65535(0xffff, float:9.1834E-41)
            r48 = r2
            r36 = r3
            r37 = r4
            r35 = r5
            r32 = r6
            r33 = r7
            r43 = r9
            r42 = r10
            r40 = r11
            r39 = r12
            r38 = r13
            r41 = r14
            r44 = r15
            r47 = r16
            r46 = r17
            r45 = r18
            r34 = r19
            goto L_0x0277
        L_0x00c9:
            r26 = r2
            r28 = r6
            r3 = r7
            r2 = r8
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r24 = r15
            r25 = r24
            r27 = r25
        L_0x00e0:
            if (r28 == 0) goto L_0x024b
            r29 = r5
            int r5 = r0.p(r1)
            switch(r5) {
                case -1: goto L_0x023b;
                case 0: goto L_0x021e;
                case 1: goto L_0x0206;
                case 2: goto L_0x01eb;
                case 3: goto L_0x01d1;
                case 4: goto L_0x01b8;
                case 5: goto L_0x01a8;
                case 6: goto L_0x0197;
                case 7: goto L_0x0185;
                case 8: goto L_0x0172;
                case 9: goto L_0x0160;
                case 10: goto L_0x014e;
                case 11: goto L_0x013c;
                case 12: goto L_0x012a;
                case 13: goto L_0x0118;
                case 14: goto L_0x0107;
                case 15: goto L_0x00f1;
                default: goto L_0x00eb;
            }
        L_0x00eb:
            fK.E r0 = new fK.E
            r0.<init>((int) r5)
            throw r0
        L_0x00f1:
            jK.i r5 = jK.C17457i.f144111a
            r30 = r14
            r14 = 15
            java.lang.Object r5 = r0.A(r1, r14, r5, r6)
            r6 = r5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r5 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r5
        L_0x0102:
            r5 = r29
            r14 = r30
            goto L_0x00e0
        L_0x0107:
            r30 = r14
            r14 = 15
            jK.i r5 = jK.C17457i.f144111a
            r14 = 14
            java.lang.Object r2 = r0.A(r1, r14, r5, r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            goto L_0x0102
        L_0x0118:
            r30 = r14
            r14 = 14
            jK.i r5 = jK.C17457i.f144111a
            r14 = 13
            java.lang.Object r5 = r0.A(r1, r14, r5, r7)
            r7 = r5
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0102
        L_0x012a:
            r30 = r14
            r14 = 13
            jK.i r5 = jK.C17457i.f144111a
            r14 = 12
            java.lang.Object r5 = r0.A(r1, r14, r5, r8)
            r8 = r5
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            goto L_0x0102
        L_0x013c:
            r30 = r14
            r14 = 12
            jK.i r5 = jK.C17457i.f144111a
            r14 = 11
            java.lang.Object r5 = r0.A(r1, r14, r5, r9)
            r9 = r5
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r3 = r3 | 2048(0x800, float:2.87E-42)
            goto L_0x0102
        L_0x014e:
            r30 = r14
            r14 = 11
            jK.i r5 = jK.C17457i.f144111a
            r14 = 10
            java.lang.Object r5 = r0.A(r1, r14, r5, r10)
            r10 = r5
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r3 = r3 | 1024(0x400, float:1.435E-42)
            goto L_0x0102
        L_0x0160:
            r30 = r14
            r14 = 10
            jK.i r5 = jK.C17457i.f144111a
            r14 = 9
            java.lang.Object r5 = r0.A(r1, r14, r5, r15)
            r15 = r5
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            r3 = r3 | 512(0x200, float:7.175E-43)
            goto L_0x0102
        L_0x0172:
            r30 = r14
            r14 = 9
            jK.i r5 = jK.C17457i.f144111a
            r14 = 8
            java.lang.Object r5 = r0.A(r1, r14, r5, r11)
            r11 = r5
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r3 = r3 | 256(0x100, float:3.59E-43)
            goto L_0x0102
        L_0x0185:
            r30 = r14
            r14 = 8
            jK.i r5 = jK.C17457i.f144111a
            r14 = 7
            java.lang.Object r5 = r0.A(r1, r14, r5, r12)
            r12 = r5
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r3 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x0102
        L_0x0197:
            r30 = r14
            r14 = 7
            com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings$$serializer r5 = com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings$$serializer.INSTANCE
            r14 = 6
            java.lang.Object r5 = r0.A(r1, r14, r5, r13)
            r13 = r5
            com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings r13 = (com.ingka.ikea.scanandgo.datalayer.model.UpptackaSettings) r13
            r3 = r3 | 64
            goto L_0x0102
        L_0x01a8:
            r30 = r14
            r14 = 6
            jK.i r5 = jK.C17457i.f144111a
            r14 = 5
            java.lang.Object r4 = r0.A(r1, r14, r5, r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r3 = r3 | 32
            goto L_0x0102
        L_0x01b8:
            r30 = r14
            r14 = 5
            jK.i0 r5 = jK.C17458i0.f144113a
            r23 = r2
            r2 = r30
            r14 = 4
            java.lang.Object r2 = r0.A(r1, r14, r5, r2)
            java.lang.Long r2 = (java.lang.Long) r2
            r3 = r3 | 16
            r14 = r2
            r2 = r23
            r5 = r29
            goto L_0x00e0
        L_0x01d1:
            r23 = r2
            r2 = r14
            r14 = 4
            jK.Y0 r5 = jK.Y0.f144077a
            r22 = r2
            r2 = r29
            r14 = 3
            java.lang.Object r2 = r0.A(r1, r14, r5, r2)
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            r3 = r3 | 8
        L_0x01e5:
            r14 = r22
        L_0x01e7:
            r2 = r23
            goto L_0x00e0
        L_0x01eb:
            r23 = r2
            r22 = r14
            r2 = r29
            r14 = 3
            jK.Y0 r5 = jK.Y0.f144077a
            r21 = r2
            r2 = r27
            r14 = 2
            java.lang.Object r2 = r0.A(r1, r14, r5, r2)
            r27 = r2
            java.lang.String r27 = (java.lang.String) r27
            r3 = r3 | 4
        L_0x0203:
            r5 = r21
            goto L_0x01e5
        L_0x0206:
            r23 = r2
            r22 = r14
            r2 = r27
            r21 = r29
            r5 = 1
            r14 = r26[r5]
            r2 = r25
            java.lang.Object r2 = r0.A(r1, r5, r14, r2)
            r25 = r2
            java.util.List r25 = (java.util.List) r25
            r3 = r3 | 2
            goto L_0x0203
        L_0x021e:
            r23 = r2
            r22 = r14
            r2 = r25
            r21 = r29
            r5 = 1
            jK.Y0 r14 = jK.Y0.f144077a
            r20 = r2
            r2 = r24
            r5 = 0
            java.lang.Object r2 = r0.A(r1, r5, r14, r2)
            r24 = r2
            java.lang.String r24 = (java.lang.String) r24
            r3 = r3 | 1
            r25 = r20
            goto L_0x0203
        L_0x023b:
            r23 = r2
            r22 = r14
            r2 = r24
            r20 = r25
            r21 = r29
            r5 = 0
            r28 = r5
            r5 = r21
            goto L_0x01e7
        L_0x024b:
            r23 = r2
            r21 = r5
            r22 = r14
            r2 = r24
            r20 = r25
            r33 = r2
            r32 = r3
            r38 = r4
            r48 = r6
            r46 = r7
            r45 = r8
            r44 = r9
            r43 = r10
            r41 = r11
            r40 = r12
            r39 = r13
            r42 = r15
            r34 = r20
            r36 = r21
            r37 = r22
            r47 = r23
            r35 = r27
        L_0x0277:
            r0.c(r1)
            com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemote r0 = new com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemote
            r31 = r0
            r49 = 0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.scanandgo.datalayer.impl.settings.datasource.remote.ScanAndGoSettingsRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ScanAndGoSettingsRemote scanAndGoSettingsRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(scanAndGoSettingsRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ScanAndGoSettingsRemote.write$Self$datalayer_implementation_release(scanAndGoSettingsRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] access$get$childSerializers$cp = ScanAndGoSettingsRemote.$childSerializers;
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        KSerializer<?> u11 = C17294a.u(access$get$childSerializers$cp[1]);
        KSerializer<?> u12 = C17294a.u(y02);
        KSerializer<?> u13 = C17294a.u(y02);
        KSerializer<?> u14 = C17294a.u(C17458i0.f144113a);
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{u10, u11, u12, u13, u14, C17294a.u(iVar), C17294a.u(UpptackaSettings$$serializer.INSTANCE), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
