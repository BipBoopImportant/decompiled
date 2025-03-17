package com.ingka.ikea.appconfig.impl.service.network;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/appconfig/impl/service/network/MarketConfigRemote.$serializer", "LjK/N;", "Lcom/ingka/ikea/appconfig/impl/service/network/MarketConfigRemote;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/appconfig/impl/service/network/MarketConfigRemote;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/appconfig/impl/service/network/MarketConfigRemote;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class MarketConfigRemote$$serializer implements N<MarketConfigRemote> {
    public static final MarketConfigRemote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MarketConfigRemote$$serializer marketConfigRemote$$serializer = new MarketConfigRemote$$serializer();
        INSTANCE = marketConfigRemote$$serializer;
        J0 j02 = new J0("com.ingka.ikea.appconfig.impl.service.network.MarketConfigRemote", marketConfigRemote$$serializer, 18);
        j02.p("calendar", false);
        j02.p("currency", false);
        j02.p("secondaryCurrency", false);
        j02.p("dateFormat", false);
        j02.p("price", false);
        j02.p("emptyListCarouselData", false);
        j02.p("measurementSystemV2", false);
        j02.p("urls", false);
        j02.p("hlp", false);
        j02.p("showEnergyLabelCartList", false);
        j02.p("mapService", false);
        j02.p("legalInformationFooter", false);
        j02.p("zipCodePickerConfiguration", false);
        j02.p("searchHints", false);
        j02.p("giftCardConfiguration", false);
        j02.p("extendedTrackingEnabled", false);
        j02.p("familyAndRegularPriceSameSize", false);
        j02.p("assets", false);
        descriptor = j02;
    }

    private MarketConfigRemote$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.ingka.ikea.appconfig.impl.service.network.PriceRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.ingka.ikea.appconfig.impl.service.network.MapServiceRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: com.ingka.ikea.appconfig.impl.service.network.PostalCodePickerConfigRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: com.ingka.ikea.appconfig.impl.service.network.GiftCardConfigurationRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v6, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v43, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v4, resolved type: java.util.Map} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0177, code lost:
        r8 = r32;
        r6 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x017b, code lost:
        r29 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x036a, code lost:
        r6 = r17;
        r2 = r22;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.appconfig.impl.service.network.MarketConfigRemote deserialize(kotlinx.serialization.encoding.Decoder r56) {
        /*
            r55 = this;
            r0 = r56
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.appconfig.impl.service.network.MarketConfigRemote.f92929s
            boolean r3 = r0.q()
            r9 = 9
            r10 = 6
            r11 = 5
            r12 = 3
            r14 = 8
            r15 = 4
            r13 = 2
            r5 = 7
            r4 = 1
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x00ed
            jK.Y0 r3 = jK.Y0.f144077a
            java.lang.Object r6 = r0.A(r1, r6, r3, r7)
            java.lang.String r6 = (java.lang.String) r6
            com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote$$serializer r8 = com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote$$serializer.INSTANCE
            java.lang.Object r4 = r0.A(r1, r4, r8, r7)
            com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote r4 = (com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote) r4
            java.lang.Object r8 = r0.A(r1, r13, r8, r7)
            com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote r8 = (com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote) r8
            java.lang.Object r12 = r0.A(r1, r12, r3, r7)
            java.lang.String r12 = (java.lang.String) r12
            com.ingka.ikea.appconfig.impl.service.network.PriceRemote$$serializer r13 = com.ingka.ikea.appconfig.impl.service.network.PriceRemote$$serializer.INSTANCE
            java.lang.Object r13 = r0.A(r1, r15, r13, r7)
            com.ingka.ikea.appconfig.impl.service.network.PriceRemote r13 = (com.ingka.ikea.appconfig.impl.service.network.PriceRemote) r13
            java.lang.Object r11 = r0.A(r1, r11, r3, r7)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.A(r1, r10, r3, r7)
            java.lang.String r10 = (java.lang.String) r10
            r15 = r2[r5]
            java.lang.Object r5 = r0.A(r1, r5, r15, r7)
            java.util.List r5 = (java.util.List) r5
            com.ingka.ikea.appconfig.impl.service.network.HlpRemote$$serializer r15 = com.ingka.ikea.appconfig.impl.service.network.HlpRemote$$serializer.INSTANCE
            java.lang.Object r14 = r0.A(r1, r14, r15, r7)
            com.ingka.ikea.appconfig.impl.service.network.HlpRemote r14 = (com.ingka.ikea.appconfig.impl.service.network.HlpRemote) r14
            jK.i r15 = jK.C17457i.f144111a
            java.lang.Object r9 = r0.A(r1, r9, r15, r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r22 = r4
            com.ingka.ikea.appconfig.impl.service.network.MapServiceRemote$$serializer r4 = com.ingka.ikea.appconfig.impl.service.network.MapServiceRemote$$serializer.INSTANCE
            r23 = r5
            r5 = 10
            java.lang.Object r4 = r0.A(r1, r5, r4, r7)
            com.ingka.ikea.appconfig.impl.service.network.MapServiceRemote r4 = (com.ingka.ikea.appconfig.impl.service.network.MapServiceRemote) r4
            r5 = 11
            java.lang.Object r3 = r0.A(r1, r5, r3, r7)
            java.lang.String r3 = (java.lang.String) r3
            com.ingka.ikea.appconfig.impl.service.network.PostalCodePickerConfigRemote$$serializer r5 = com.ingka.ikea.appconfig.impl.service.network.PostalCodePickerConfigRemote$$serializer.INSTANCE
            r21 = r3
            r3 = 12
            java.lang.Object r3 = r0.A(r1, r3, r5, r7)
            com.ingka.ikea.appconfig.impl.service.network.PostalCodePickerConfigRemote r3 = (com.ingka.ikea.appconfig.impl.service.network.PostalCodePickerConfigRemote) r3
            r19 = r3
            r5 = 13
            r3 = r2[r5]
            java.lang.Object r3 = r0.o(r1, r5, r3, r7)
            java.util.List r3 = (java.util.List) r3
            com.ingka.ikea.appconfig.impl.service.network.GiftCardConfigurationRemote$$serializer r5 = com.ingka.ikea.appconfig.impl.service.network.GiftCardConfigurationRemote$$serializer.INSTANCE
            r20 = r3
            r3 = 14
            java.lang.Object r3 = r0.A(r1, r3, r5, r7)
            com.ingka.ikea.appconfig.impl.service.network.GiftCardConfigurationRemote r3 = (com.ingka.ikea.appconfig.impl.service.network.GiftCardConfigurationRemote) r3
            r5 = 15
            java.lang.Object r5 = r0.A(r1, r5, r15, r7)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r16 = r3
            r3 = 16
            java.lang.Object r3 = r0.A(r1, r3, r15, r7)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r15 = 17
            r2 = r2[r15]
            java.lang.Object r2 = r0.A(r1, r15, r2, r7)
            java.util.Map r2 = (java.util.Map) r2
            r7 = 262143(0x3ffff, float:3.6734E-40)
            r53 = r2
            r52 = r3
            r46 = r4
            r51 = r5
            r36 = r6
            r35 = r7
            r38 = r8
            r45 = r9
            r42 = r10
            r41 = r11
            r39 = r12
            r40 = r13
            r44 = r14
            r50 = r16
            r48 = r19
            r49 = r20
            r47 = r21
            r37 = r22
            r43 = r23
            goto L_0x03ba
        L_0x00ed:
            r3 = 17
            r31 = r4
            r4 = r7
            r5 = r4
            r8 = r5
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r24 = r15
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r7 = r6
            r6 = r30
        L_0x010c:
            if (r31 == 0) goto L_0x0385
            int r3 = r0.p(r1)
            switch(r3) {
                case -1: goto L_0x0370;
                case 0: goto L_0x0348;
                case 1: goto L_0x0321;
                case 2: goto L_0x0303;
                case 3: goto L_0x02e4;
                case 4: goto L_0x02c5;
                case 5: goto L_0x02a6;
                case 6: goto L_0x0287;
                case 7: goto L_0x0269;
                case 8: goto L_0x0249;
                case 9: goto L_0x0228;
                case 10: goto L_0x0207;
                case 11: goto L_0x01e1;
                case 12: goto L_0x01be;
                case 13: goto L_0x01a1;
                case 14: goto L_0x0180;
                case 15: goto L_0x0159;
                case 16: goto L_0x0135;
                case 17: goto L_0x011b;
                default: goto L_0x0115;
            }
        L_0x0115:
            fK.E r0 = new fK.E
            r0.<init>((int) r3)
            throw r0
        L_0x011b:
            r32 = r8
            r3 = 17
            r8 = r2[r3]
            r33 = r6
            r6 = r30
            java.lang.Object r6 = r0.A(r1, r3, r8, r6)
            r30 = r6
            java.util.Map r30 = (java.util.Map) r30
            r6 = 131072(0x20000, float:1.83671E-40)
            r7 = r7 | r6
            r8 = r32
            r6 = r33
            goto L_0x010c
        L_0x0135:
            r33 = r6
            r32 = r8
            r6 = r30
            r3 = 17
            jK.i r8 = jK.C17457i.f144111a
            r3 = r29
            r29 = r6
            r6 = 16
            java.lang.Object r3 = r0.A(r1, r6, r8, r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r8 = 65536(0x10000, float:9.18355E-41)
            r7 = r7 | r8
            r30 = r29
            r8 = r32
            r6 = r33
            r29 = r3
            r3 = 17
            goto L_0x010c
        L_0x0159:
            r33 = r6
            r32 = r8
            r3 = r29
            r29 = r30
            r6 = 16
            jK.i r8 = jK.C17457i.f144111a
            r16 = r3
            r6 = r28
            r3 = 15
            java.lang.Object r6 = r0.A(r1, r3, r8, r6)
            r28 = r6
            java.lang.Boolean r28 = (java.lang.Boolean) r28
            r6 = 32768(0x8000, float:4.5918E-41)
            r7 = r7 | r6
        L_0x0177:
            r8 = r32
            r6 = r33
        L_0x017b:
            r3 = 17
            r29 = r16
            goto L_0x010c
        L_0x0180:
            r33 = r6
            r32 = r8
            r6 = r28
            r16 = r29
            r29 = r30
            r3 = 15
            com.ingka.ikea.appconfig.impl.service.network.GiftCardConfigurationRemote$$serializer r8 = com.ingka.ikea.appconfig.impl.service.network.GiftCardConfigurationRemote$$serializer.INSTANCE
            r18 = r6
            r3 = r27
            r6 = 14
            java.lang.Object r3 = r0.A(r1, r6, r8, r3)
            r27 = r3
            com.ingka.ikea.appconfig.impl.service.network.GiftCardConfigurationRemote r27 = (com.ingka.ikea.appconfig.impl.service.network.GiftCardConfigurationRemote) r27
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
            r28 = r18
            goto L_0x0177
        L_0x01a1:
            r33 = r6
            r32 = r8
            r3 = r27
            r18 = r28
            r16 = r29
            r29 = r30
            r8 = 13
            r6 = r2[r8]
            r3 = r26
            java.lang.Object r3 = r0.o(r1, r8, r6, r3)
            r26 = r3
            java.util.List r26 = (java.util.List) r26
            r7 = r7 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0177
        L_0x01be:
            r33 = r6
            r32 = r8
            r3 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r8 = 13
            com.ingka.ikea.appconfig.impl.service.network.PostalCodePickerConfigRemote$$serializer r6 = com.ingka.ikea.appconfig.impl.service.network.PostalCodePickerConfigRemote$$serializer.INSTANCE
            r20 = r3
            r8 = r25
            r3 = 12
            java.lang.Object r6 = r0.A(r1, r3, r6, r8)
            r25 = r6
            com.ingka.ikea.appconfig.impl.service.network.PostalCodePickerConfigRemote r25 = (com.ingka.ikea.appconfig.impl.service.network.PostalCodePickerConfigRemote) r25
            r7 = r7 | 4096(0x1000, float:5.74E-42)
            r26 = r20
            goto L_0x0177
        L_0x01e1:
            r33 = r6
            r32 = r8
            r8 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r3 = 12
            jK.Y0 r6 = jK.Y0.f144077a
            r21 = r8
            r3 = r24
            r8 = 11
            java.lang.Object r3 = r0.A(r1, r8, r6, r3)
            r24 = r3
            java.lang.String r24 = (java.lang.String) r24
            r7 = r7 | 2048(0x800, float:2.87E-42)
            r25 = r21
            goto L_0x0177
        L_0x0207:
            r33 = r6
            r32 = r8
            r3 = r24
            r21 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r8 = 11
            com.ingka.ikea.appconfig.impl.service.network.MapServiceRemote$$serializer r6 = com.ingka.ikea.appconfig.impl.service.network.MapServiceRemote$$serializer.INSTANCE
            r8 = 10
            java.lang.Object r6 = r0.A(r1, r8, r6, r9)
            r9 = r6
            com.ingka.ikea.appconfig.impl.service.network.MapServiceRemote r9 = (com.ingka.ikea.appconfig.impl.service.network.MapServiceRemote) r9
            r7 = r7 | 1024(0x400, float:1.435E-42)
            goto L_0x0177
        L_0x0228:
            r33 = r6
            r32 = r8
            r3 = r24
            r21 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r8 = 10
            jK.i r6 = jK.C17457i.f144111a
            r8 = 9
            java.lang.Object r6 = r0.A(r1, r8, r6, r14)
            r14 = r6
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r7 = r7 | 512(0x200, float:7.175E-43)
            goto L_0x0177
        L_0x0249:
            r33 = r6
            r32 = r8
            r3 = r24
            r21 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r8 = 9
            com.ingka.ikea.appconfig.impl.service.network.HlpRemote$$serializer r6 = com.ingka.ikea.appconfig.impl.service.network.HlpRemote$$serializer.INSTANCE
            r8 = 8
            java.lang.Object r5 = r0.A(r1, r8, r6, r5)
            com.ingka.ikea.appconfig.impl.service.network.HlpRemote r5 = (com.ingka.ikea.appconfig.impl.service.network.HlpRemote) r5
            r7 = r7 | 256(0x100, float:3.59E-43)
            goto L_0x0177
        L_0x0269:
            r33 = r6
            r32 = r8
            r3 = r24
            r21 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r6 = 7
            r8 = r2[r6]
            java.lang.Object r8 = r0.A(r1, r6, r8, r10)
            r10 = r8
            java.util.List r10 = (java.util.List) r10
            r7 = r7 | 128(0x80, float:1.794E-43)
            goto L_0x0177
        L_0x0287:
            r33 = r6
            r32 = r8
            r3 = r24
            r21 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r6 = 7
            jK.Y0 r8 = jK.Y0.f144077a
            r6 = 6
            java.lang.Object r8 = r0.A(r1, r6, r8, r11)
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            r7 = r7 | 64
            goto L_0x0177
        L_0x02a6:
            r33 = r6
            r32 = r8
            r3 = r24
            r21 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r6 = 6
            jK.Y0 r8 = jK.Y0.f144077a
            r6 = 5
            java.lang.Object r8 = r0.A(r1, r6, r8, r15)
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15
            r7 = r7 | 32
            goto L_0x0177
        L_0x02c5:
            r33 = r6
            r32 = r8
            r3 = r24
            r21 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r6 = 5
            com.ingka.ikea.appconfig.impl.service.network.PriceRemote$$serializer r8 = com.ingka.ikea.appconfig.impl.service.network.PriceRemote$$serializer.INSTANCE
            r6 = 4
            java.lang.Object r8 = r0.A(r1, r6, r8, r12)
            r12 = r8
            com.ingka.ikea.appconfig.impl.service.network.PriceRemote r12 = (com.ingka.ikea.appconfig.impl.service.network.PriceRemote) r12
            r7 = r7 | 16
            goto L_0x0177
        L_0x02e4:
            r33 = r6
            r32 = r8
            r3 = r24
            r21 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r6 = 4
            jK.Y0 r8 = jK.Y0.f144077a
            r6 = 3
            java.lang.Object r8 = r0.A(r1, r6, r8, r13)
            r13 = r8
            java.lang.String r13 = (java.lang.String) r13
            r7 = r7 | 8
            goto L_0x0177
        L_0x0303:
            r33 = r6
            r32 = r8
            r3 = r24
            r21 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r6 = 3
            com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote$$serializer r8 = com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote$$serializer.INSTANCE
            r6 = 2
            java.lang.Object r4 = r0.A(r1, r6, r8, r4)
            com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote r4 = (com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote) r4
            r7 = r7 | 4
            goto L_0x0177
        L_0x0321:
            r33 = r6
            r32 = r8
            r3 = r24
            r21 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r6 = 2
            com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote$$serializer r8 = com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote$$serializer.INSTANCE
            r22 = r2
            r2 = r33
            r6 = 1
            java.lang.Object r2 = r0.A(r1, r6, r8, r2)
            com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote r2 = (com.ingka.ikea.appconfig.impl.service.network.CurrencyRemote) r2
            r7 = r7 | 2
            r6 = r2
            r2 = r22
            r8 = r32
            goto L_0x017b
        L_0x0348:
            r22 = r2
            r2 = r6
            r32 = r8
            r3 = r24
            r21 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r6 = 1
            jK.Y0 r8 = jK.Y0.f144077a
            r17 = r2
            r2 = r32
            r6 = 0
            java.lang.Object r2 = r0.A(r1, r6, r8, r2)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            r7 = r7 | 1
        L_0x036a:
            r6 = r17
            r2 = r22
            goto L_0x017b
        L_0x0370:
            r22 = r2
            r17 = r6
            r2 = r8
            r3 = r24
            r21 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r6 = 0
            r31 = r6
            goto L_0x036a
        L_0x0385:
            r17 = r6
            r2 = r8
            r3 = r24
            r21 = r25
            r20 = r26
            r18 = r28
            r16 = r29
            r29 = r30
            r36 = r2
            r47 = r3
            r38 = r4
            r44 = r5
            r35 = r7
            r46 = r9
            r43 = r10
            r42 = r11
            r40 = r12
            r39 = r13
            r45 = r14
            r41 = r15
            r52 = r16
            r37 = r17
            r51 = r18
            r49 = r20
            r48 = r21
            r50 = r27
            r53 = r29
        L_0x03ba:
            r0.c(r1)
            com.ingka.ikea.appconfig.impl.service.network.MarketConfigRemote r0 = new com.ingka.ikea.appconfig.impl.service.network.MarketConfigRemote
            r34 = r0
            r54 = 0
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.appconfig.impl.service.network.MarketConfigRemote$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.appconfig.impl.service.network.MarketConfigRemote");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, MarketConfigRemote marketConfigRemote) {
        C17542s.j(encoder, "encoder");
        C17542s.j(marketConfigRemote, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        MarketConfigRemote.d(marketConfigRemote, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = MarketConfigRemote.f92929s;
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        CurrencyRemote$$serializer currencyRemote$$serializer = CurrencyRemote$$serializer.INSTANCE;
        KSerializer<?> u11 = C17294a.u(currencyRemote$$serializer);
        KSerializer<?> u12 = C17294a.u(currencyRemote$$serializer);
        KSerializer<?> u13 = C17294a.u(y02);
        KSerializer<?> u14 = C17294a.u(PriceRemote$$serializer.INSTANCE);
        KSerializer<?> u15 = C17294a.u(y02);
        KSerializer<?> u16 = C17294a.u(y02);
        KSerializer<?> u17 = C17294a.u(a10[7]);
        KSerializer<?> u18 = C17294a.u(HlpRemote$$serializer.INSTANCE);
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{u10, u11, u12, u13, u14, u15, u16, u17, u18, C17294a.u(iVar), C17294a.u(MapServiceRemote$$serializer.INSTANCE), C17294a.u(y02), C17294a.u(PostalCodePickerConfigRemote$$serializer.INSTANCE), a10[13], C17294a.u(GiftCardConfigurationRemote$$serializer.INSTANCE), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(a10[17])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
