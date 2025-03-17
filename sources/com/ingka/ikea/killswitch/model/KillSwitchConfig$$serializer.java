package com.ingka.ikea.killswitch.model;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/killswitch/model/KillSwitchConfig.$serializer", "LjK/N;", "Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class KillSwitchConfig$$serializer implements N<KillSwitchConfig> {
    public static final KillSwitchConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        KillSwitchConfig$$serializer killSwitchConfig$$serializer = new KillSwitchConfig$$serializer();
        INSTANCE = killSwitchConfig$$serializer;
        J0 j02 = new J0("com.ingka.ikea.killswitch.model.KillSwitchConfig", killSwitchConfig$$serializer, 48);
        j02.p("marketCode", false);
        j02.p("languageCode", false);
        j02.p("version", true);
        j02.p("performStockCheck", false);
        j02.p("alert", false);
        j02.p("enableDynamicLinkShare", false);
        j02.p("blockApp", false);
        j02.p("enableOnlineCheckout", false);
        j02.p("purchaseHistoryListingEnabled", false);
        j02.p("purchaseHistoryLookupEnabled", false);
        j02.p("enableShopAndGo", false);
        j02.p("showAddToCartUnrestricted", false);
        j02.p("showInAppRatingRequest", false);
        j02.p("enableDataControls", false);
        j02.p("enableOnlineAvailability", false);
        j02.p("enableOnlineClickCollectAvailability", false);
        j02.p("shopAndGoTermsAndConditions", false);
        j02.p("enableAvailabilityCart", false);
        j02.p("enableAssemblyServicesAvailability", false);
        j02.p("enableAssemblyServicesOrder", false);
        j02.p("enableFinancialServices", false);
        j02.p("enableCommunicationPostsCarousel", false);
        j02.p("enableFamilyRewards", false);
        j02.p("enableFamilyRewardsCart", false);
        j02.p("enableBackInStockNotificationsCashAndCarry", false);
        j02.p("enableBackInStockNotificationsHomeDelivery", false);
        j02.p("enableKreativEntryPoints", false);
        j02.p("redirectSearchAndBrowsePilot", false);
        j02.p("enableGiftCardBalanceCheck", false);
        j02.p("enableRegisterPushTokens", false);
        j02.p("wayfindingEnabled", false);
        j02.p("enableUpsertAddressInCheckout", false);
        j02.p("enableInboxBackgroundFetch", false);
        j02.p("enableBrowsePageUserRecommendations", false);
        j02.p("enableAdjustSdk", false);
        j02.p("enableExpressAndOnlineReturns", false);
        j02.p("enableInAppUpdates", false);
        j02.p("enableGooglePayExpressInCheckout", false);
        j02.p("enableGooglePayExpressInCart", false);
        j02.p("enableMembershipSpaceKreativ", false);
        j02.p("enableNavigeraAlertMessages", false);
        j02.p("enableNavigeraCommercialMessagesForBrowse", false);
        j02.p("enableOffersHub", false);
        j02.p("enableShoppingListRedesign", false);
        j02.p("enableAppointmentBooking", false);
        j02.p("enableCartProximity", false);
        j02.p("enableStoreModeActivation", false);
        j02.p("enablePrepaidCards", false);
        descriptor = j02;
    }

    private KillSwitchConfig$$serializer() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0271, code lost:
        r4 = XH.C16807N.f139792a;
        r88 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0275, code lost:
        r4 = r85;
        r70 = 8;
        r85 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x02b7, code lost:
        r4 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0339, code lost:
        r16 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x04ae, code lost:
        r85 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x04b4, code lost:
        r70 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x05e8, code lost:
        r3 = r85;
        r7 = r88;
        r85 = r4;
        r4 = r70;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.killswitch.model.KillSwitchConfig deserialize(kotlinx.serialization.encoding.Decoder r143) {
        /*
            r142 = this;
            r0 = r143
            java.lang.String r2 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = descriptor
            iK.c r0 = r0.b(r2)
            boolean r18 = r0.q()
            r10 = 11
            r11 = 10
            r12 = 9
            r13 = 7
            r14 = 6
            r15 = 5
            r1 = 3
            r4 = 8
            r5 = 4
            r3 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r18 == 0) goto L_0x01f8
            java.lang.String r7 = r0.n(r2, r7)
            java.lang.String r6 = r0.n(r2, r6)
            jK.Y0 r9 = jK.Y0.f144077a
            java.lang.Object r3 = r0.A(r2, r3, r9, r8)
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r0.D(r2, r1)
            com.ingka.ikea.killswitch.model.ConfigAlert$$serializer r9 = com.ingka.ikea.killswitch.model.ConfigAlert$$serializer.INSTANCE
            java.lang.Object r5 = r0.A(r2, r5, r9, r8)
            com.ingka.ikea.killswitch.model.ConfigAlert r5 = (com.ingka.ikea.killswitch.model.ConfigAlert) r5
            boolean r9 = r0.D(r2, r15)
            com.ingka.ikea.killswitch.model.BlockApp$$serializer r15 = com.ingka.ikea.killswitch.model.BlockApp$$serializer.INSTANCE
            java.lang.Object r14 = r0.A(r2, r14, r15, r8)
            com.ingka.ikea.killswitch.model.BlockApp r14 = (com.ingka.ikea.killswitch.model.BlockApp) r14
            boolean r13 = r0.D(r2, r13)
            boolean r4 = r0.D(r2, r4)
            boolean r12 = r0.D(r2, r12)
            boolean r11 = r0.D(r2, r11)
            boolean r10 = r0.D(r2, r10)
            r15 = 12
            boolean r15 = r0.D(r2, r15)
            r8 = 13
            boolean r8 = r0.D(r2, r8)
            r18 = r1
            r1 = 14
            boolean r1 = r0.D(r2, r1)
            r38 = r1
            r1 = 15
            boolean r1 = r0.D(r2, r1)
            r37 = r1
            r1 = 16
            boolean r1 = r0.D(r2, r1)
            r36 = r1
            r1 = 17
            boolean r1 = r0.D(r2, r1)
            r35 = r1
            r1 = 18
            boolean r1 = r0.D(r2, r1)
            r34 = r1
            r1 = 19
            boolean r1 = r0.D(r2, r1)
            r143 = r1
            r1 = 20
            boolean r1 = r0.D(r2, r1)
            r32 = r1
            r1 = 21
            boolean r1 = r0.D(r2, r1)
            r31 = r1
            r1 = 22
            boolean r1 = r0.D(r2, r1)
            r30 = r1
            r1 = 23
            boolean r1 = r0.D(r2, r1)
            r29 = r1
            r1 = 24
            boolean r1 = r0.D(r2, r1)
            r28 = r1
            r1 = 25
            boolean r1 = r0.D(r2, r1)
            r27 = r1
            r1 = 26
            boolean r1 = r0.D(r2, r1)
            r26 = r1
            r1 = 27
            boolean r1 = r0.D(r2, r1)
            r25 = r1
            r1 = 28
            boolean r1 = r0.D(r2, r1)
            r24 = r1
            r1 = 29
            boolean r1 = r0.D(r2, r1)
            r23 = r1
            r1 = 30
            boolean r1 = r0.D(r2, r1)
            r22 = r1
            r1 = 31
            boolean r1 = r0.D(r2, r1)
            r21 = r1
            r1 = 32
            boolean r1 = r0.D(r2, r1)
            r33 = r1
            r1 = 33
            boolean r1 = r0.D(r2, r1)
            r20 = r1
            r1 = 34
            boolean r1 = r0.D(r2, r1)
            r19 = r1
            r1 = 35
            boolean r1 = r0.D(r2, r1)
            r17 = r1
            jK.i r1 = jK.C17457i.f144111a
            r16 = r3
            r39 = r7
            r3 = 36
            r7 = 0
            java.lang.Object r3 = r0.A(r2, r3, r1, r7)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r40 = r3
            r3 = 37
            java.lang.Object r3 = r0.A(r2, r3, r1, r7)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r41 = r3
            r3 = 38
            java.lang.Object r3 = r0.A(r2, r3, r1, r7)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r42 = r3
            r3 = 39
            java.lang.Object r3 = r0.A(r2, r3, r1, r7)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r43 = r3
            r3 = 40
            java.lang.Object r3 = r0.A(r2, r3, r1, r7)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r44 = r3
            r3 = 41
            java.lang.Object r3 = r0.A(r2, r3, r1, r7)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r45 = r3
            r3 = 42
            java.lang.Object r1 = r0.A(r2, r3, r1, r7)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r3 = 43
            boolean r3 = r0.D(r2, r3)
            r7 = 44
            boolean r7 = r0.D(r2, r7)
            r46 = r1
            r1 = 45
            boolean r1 = r0.D(r2, r1)
            r47 = r1
            r1 = 46
            boolean r1 = r0.D(r2, r1)
            r48 = r1
            r1 = 47
            boolean r1 = r0.D(r2, r1)
            r49 = 65535(0xffff, float:9.1834E-41)
            r50 = -1
            r111 = r143
            r139 = r1
            r135 = r3
            r100 = r4
            r96 = r5
            r93 = r6
            r136 = r7
            r105 = r8
            r97 = r9
            r103 = r10
            r102 = r11
            r101 = r12
            r99 = r13
            r98 = r14
            r104 = r15
            r94 = r16
            r127 = r17
            r95 = r18
            r126 = r19
            r125 = r20
            r123 = r21
            r122 = r22
            r121 = r23
            r120 = r24
            r119 = r25
            r118 = r26
            r117 = r27
            r116 = r28
            r115 = r29
            r114 = r30
            r113 = r31
            r112 = r32
            r124 = r33
            r110 = r34
            r109 = r35
            r108 = r36
            r107 = r37
            r106 = r38
            r92 = r39
            r128 = r40
            r129 = r41
            r130 = r42
            r131 = r43
            r132 = r44
            r133 = r45
            r134 = r46
            r137 = r47
            r138 = r48
            r91 = r49
            r90 = r50
            goto L_0x065c
        L_0x01f8:
            r141 = r8
            r8 = r7
            r7 = r141
            r86 = r6
            r1 = r7
            r3 = r1
            r6 = r3
            r10 = r6
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r67 = r15
            r68 = r67
            r5 = r8
            r9 = r5
            r40 = r9
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
            r46 = r45
            r47 = r46
            r48 = r47
            r49 = r48
            r50 = r49
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r59 = r58
            r60 = r59
            r61 = r60
            r62 = r61
            r63 = r62
            r64 = r63
            r65 = r64
            r66 = r65
            r72 = r66
            r79 = r72
            r80 = r79
            r81 = r80
            r82 = r81
            r83 = r82
            r84 = r83
            r85 = r84
            r7 = r85
            r8 = r68
        L_0x0258:
            if (r86 == 0) goto L_0x05f2
            int r4 = r0.p(r2)
            switch(r4) {
                case -1: goto L_0x05d4;
                case 0: goto L_0x05bc;
                case 1: goto L_0x05a4;
                case 2: goto L_0x0584;
                case 3: goto L_0x0569;
                case 4: goto L_0x054f;
                case 5: goto L_0x0537;
                case 6: goto L_0x051f;
                case 7: goto L_0x050f;
                case 8: goto L_0x04fe;
                case 9: goto L_0x04ed;
                case 10: goto L_0x04dc;
                case 11: goto L_0x04cb;
                case 12: goto L_0x04ba;
                case 13: goto L_0x049e;
                case 14: goto L_0x047c;
                case 15: goto L_0x046b;
                case 16: goto L_0x045b;
                case 17: goto L_0x044b;
                case 18: goto L_0x043b;
                case 19: goto L_0x042b;
                case 20: goto L_0x041b;
                case 21: goto L_0x040b;
                case 22: goto L_0x03fb;
                case 23: goto L_0x03eb;
                case 24: goto L_0x03db;
                case 25: goto L_0x03cb;
                case 26: goto L_0x03bb;
                case 27: goto L_0x03ab;
                case 28: goto L_0x039b;
                case 29: goto L_0x038b;
                case 30: goto L_0x037b;
                case 31: goto L_0x0369;
                case 32: goto L_0x035b;
                case 33: goto L_0x034c;
                case 34: goto L_0x033d;
                case 35: goto L_0x032b;
                case 36: goto L_0x0317;
                case 37: goto L_0x0303;
                case 38: goto L_0x02f0;
                case 39: goto L_0x02de;
                case 40: goto L_0x02cc;
                case 41: goto L_0x02ba;
                case 42: goto L_0x02a9;
                case 43: goto L_0x02a0;
                case 44: goto L_0x0297;
                case 45: goto L_0x028e;
                case 46: goto L_0x0285;
                case 47: goto L_0x0267;
                default: goto L_0x0261;
            }
        L_0x0261:
            fK.E r0 = new fK.E
            r0.<init>((int) r4)
            throw r0
        L_0x0267:
            r4 = 47
            boolean r63 = r0.D(r2, r4)
            r4 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 | r4
        L_0x0271:
            XH.N r4 = XH.C16807N.f139792a
            r88 = r7
        L_0x0275:
            r4 = r85
            r7 = 0
            r33 = 32
            r37 = 14
            r70 = 8
            r78 = 4
            r85 = r3
            r3 = 1
            goto L_0x05e8
        L_0x0285:
            r4 = 46
            boolean r62 = r0.D(r2, r4)
            r5 = r5 | 16384(0x4000, float:2.2959E-41)
            goto L_0x0271
        L_0x028e:
            r4 = 45
            boolean r61 = r0.D(r2, r4)
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0271
        L_0x0297:
            r4 = 44
            boolean r66 = r0.D(r2, r4)
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            goto L_0x0271
        L_0x02a0:
            r4 = 43
            boolean r64 = r0.D(r2, r4)
            r5 = r5 | 2048(0x800, float:2.87E-42)
            goto L_0x0271
        L_0x02a9:
            r4 = 42
            r88 = r7
            jK.i r7 = jK.C17457i.f144111a
            java.lang.Object r3 = r0.A(r2, r4, r7, r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r5 = r5 | 1024(0x400, float:1.435E-42)
        L_0x02b7:
            XH.N r4 = XH.C16807N.f139792a
            goto L_0x0275
        L_0x02ba:
            r88 = r7
            r4 = 41
            jK.i r7 = jK.C17457i.f144111a
            java.lang.Object r4 = r0.A(r2, r4, r7, r6)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r5 = r5 | 512(0x200, float:7.175E-43)
            XH.N r6 = XH.C16807N.f139792a
            r6 = r4
            goto L_0x0275
        L_0x02cc:
            r88 = r7
            r4 = 40
            jK.i r7 = jK.C17457i.f144111a
            java.lang.Object r4 = r0.A(r2, r4, r7, r10)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r5 = r5 | 256(0x100, float:3.59E-43)
            XH.N r7 = XH.C16807N.f139792a
            r10 = r4
            goto L_0x0275
        L_0x02de:
            r88 = r7
            r4 = 39
            jK.i r7 = jK.C17457i.f144111a
            java.lang.Object r4 = r0.A(r2, r4, r7, r11)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r5 = r5 | 128(0x80, float:1.794E-43)
            XH.N r7 = XH.C16807N.f139792a
            r11 = r4
            goto L_0x0275
        L_0x02f0:
            r88 = r7
            r4 = 38
            jK.i r7 = jK.C17457i.f144111a
            java.lang.Object r4 = r0.A(r2, r4, r7, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r5 = r5 | 64
            XH.N r7 = XH.C16807N.f139792a
            r12 = r4
            goto L_0x0275
        L_0x0303:
            r88 = r7
            r4 = 37
            jK.i r7 = jK.C17457i.f144111a
            java.lang.Object r4 = r0.A(r2, r4, r7, r13)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r7 = 32
            r5 = r5 | r7
            XH.N r7 = XH.C16807N.f139792a
            r13 = r4
            goto L_0x0275
        L_0x0317:
            r88 = r7
            jK.i r4 = jK.C17457i.f144111a
            r7 = 36
            java.lang.Object r4 = r0.A(r2, r7, r4, r14)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r14 = 16
            r5 = r5 | r14
            XH.N r14 = XH.C16807N.f139792a
            r14 = r4
            goto L_0x0275
        L_0x032b:
            r88 = r7
            r4 = 35
            r7 = 36
            boolean r60 = r0.D(r2, r4)
            r16 = 8
            r5 = r5 | 8
        L_0x0339:
            XH.N r16 = XH.C16807N.f139792a
            goto L_0x0275
        L_0x033d:
            r88 = r7
            r4 = 34
            r7 = 36
            boolean r59 = r0.D(r2, r4)
            r16 = 4
            r5 = r5 | 4
            goto L_0x0339
        L_0x034c:
            r88 = r7
            r4 = 33
            r7 = 36
            boolean r58 = r0.D(r2, r4)
            r16 = 2
            r5 = r5 | 2
            goto L_0x0339
        L_0x035b:
            r88 = r7
            r4 = 32
            r7 = 36
            boolean r57 = r0.D(r2, r4)
            r4 = 1
            r5 = r5 | r4
            goto L_0x02b7
        L_0x0369:
            r88 = r7
            r4 = 31
            r7 = 36
            boolean r56 = r0.D(r2, r4)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r85
            r85 = r4 | r16
            goto L_0x02b7
        L_0x037b:
            r88 = r7
            r4 = r85
            r7 = 30
            boolean r55 = r0.D(r2, r7)
            r22 = 1073741824(0x40000000, float:2.0)
            r85 = r4 | r22
            goto L_0x02b7
        L_0x038b:
            r88 = r7
            r4 = r85
            r7 = 29
            boolean r54 = r0.D(r2, r7)
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            r85 = r4 | r23
            goto L_0x02b7
        L_0x039b:
            r88 = r7
            r4 = r85
            r7 = 28
            boolean r53 = r0.D(r2, r7)
            r24 = 268435456(0x10000000, float:2.5243549E-29)
            r85 = r4 | r24
            goto L_0x02b7
        L_0x03ab:
            r88 = r7
            r4 = r85
            r7 = 27
            boolean r52 = r0.D(r2, r7)
            r25 = 134217728(0x8000000, float:3.85186E-34)
            r85 = r4 | r25
            goto L_0x02b7
        L_0x03bb:
            r88 = r7
            r4 = r85
            r7 = 26
            boolean r51 = r0.D(r2, r7)
            r26 = 67108864(0x4000000, float:1.5046328E-36)
            r85 = r4 | r26
            goto L_0x02b7
        L_0x03cb:
            r88 = r7
            r4 = r85
            r7 = 25
            boolean r50 = r0.D(r2, r7)
            r27 = 33554432(0x2000000, float:9.403955E-38)
            r85 = r4 | r27
            goto L_0x02b7
        L_0x03db:
            r88 = r7
            r4 = r85
            r7 = 24
            boolean r49 = r0.D(r2, r7)
            r28 = 16777216(0x1000000, float:2.3509887E-38)
            r85 = r4 | r28
            goto L_0x02b7
        L_0x03eb:
            r88 = r7
            r4 = r85
            r7 = 23
            boolean r48 = r0.D(r2, r7)
            r29 = 8388608(0x800000, float:1.17549435E-38)
            r85 = r4 | r29
            goto L_0x02b7
        L_0x03fb:
            r88 = r7
            r4 = r85
            r7 = 22
            boolean r47 = r0.D(r2, r7)
            r30 = 4194304(0x400000, float:5.877472E-39)
            r85 = r4 | r30
            goto L_0x02b7
        L_0x040b:
            r88 = r7
            r4 = r85
            r7 = 21
            boolean r46 = r0.D(r2, r7)
            r31 = 2097152(0x200000, float:2.938736E-39)
            r85 = r4 | r31
            goto L_0x02b7
        L_0x041b:
            r88 = r7
            r4 = r85
            r7 = 20
            boolean r45 = r0.D(r2, r7)
            r32 = 1048576(0x100000, float:1.469368E-39)
            r85 = r4 | r32
            goto L_0x02b7
        L_0x042b:
            r88 = r7
            r4 = r85
            r7 = 19
            boolean r44 = r0.D(r2, r7)
            r85 = 524288(0x80000, float:7.34684E-40)
            r85 = r4 | r85
            goto L_0x02b7
        L_0x043b:
            r88 = r7
            r4 = r85
            r7 = 18
            boolean r43 = r0.D(r2, r7)
            r34 = 262144(0x40000, float:3.67342E-40)
            r85 = r4 | r34
            goto L_0x02b7
        L_0x044b:
            r88 = r7
            r4 = r85
            r7 = 17
            boolean r42 = r0.D(r2, r7)
            r35 = 131072(0x20000, float:1.83671E-40)
            r85 = r4 | r35
            goto L_0x02b7
        L_0x045b:
            r88 = r7
            r4 = r85
            r7 = 16
            boolean r41 = r0.D(r2, r7)
            r7 = 65536(0x10000, float:9.18355E-41)
            r85 = r4 | r7
            goto L_0x02b7
        L_0x046b:
            r88 = r7
            r4 = r85
            r7 = 15
            boolean r40 = r0.D(r2, r7)
            r37 = 32768(0x8000, float:4.5918E-41)
            r85 = r4 | r37
            goto L_0x02b7
        L_0x047c:
            r88 = r7
            r4 = r85
            r7 = 15
            r9 = 14
            boolean r37 = r0.D(r2, r9)
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            XH.N r38 = XH.C16807N.f139792a
            r85 = r3
            r3 = 1
            r7 = 0
            r33 = 32
            r70 = 8
            r78 = 4
            r141 = r37
            r37 = r9
            r9 = r141
            goto L_0x05e8
        L_0x049e:
            r88 = r7
            r4 = r85
            r7 = 13
            r37 = 14
            boolean r72 = r0.D(r2, r7)
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            XH.N r39 = XH.C16807N.f139792a
        L_0x04ae:
            r85 = r3
        L_0x04b0:
            r3 = 1
            r7 = 0
            r33 = 32
        L_0x04b4:
            r70 = 8
        L_0x04b6:
            r78 = 4
            goto L_0x05e8
        L_0x04ba:
            r88 = r7
            r4 = r85
            r7 = 12
            r37 = 14
            boolean r84 = r0.D(r2, r7)
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            XH.N r18 = XH.C16807N.f139792a
            goto L_0x04ae
        L_0x04cb:
            r88 = r7
            r4 = r85
            r7 = 11
            r37 = 14
            boolean r80 = r0.D(r2, r7)
            r4 = r4 | 2048(0x800, float:2.87E-42)
            XH.N r76 = XH.C16807N.f139792a
            goto L_0x04ae
        L_0x04dc:
            r88 = r7
            r4 = r85
            r7 = 10
            r37 = 14
            boolean r81 = r0.D(r2, r7)
            r4 = r4 | 1024(0x400, float:1.435E-42)
            XH.N r75 = XH.C16807N.f139792a
            goto L_0x04ae
        L_0x04ed:
            r88 = r7
            r4 = r85
            r7 = 9
            r37 = 14
            boolean r82 = r0.D(r2, r7)
            r4 = r4 | 512(0x200, float:7.175E-43)
            XH.N r74 = XH.C16807N.f139792a
            goto L_0x04ae
        L_0x04fe:
            r88 = r7
            r4 = r85
            r7 = 8
            r37 = 14
            boolean r65 = r0.D(r2, r7)
            r4 = r4 | 256(0x100, float:3.59E-43)
            XH.N r7 = XH.C16807N.f139792a
            goto L_0x04ae
        L_0x050f:
            r88 = r7
            r4 = r85
            r7 = 7
            r37 = 14
            boolean r83 = r0.D(r2, r7)
            r4 = r4 | 128(0x80, float:1.794E-43)
            XH.N r73 = XH.C16807N.f139792a
            goto L_0x04ae
        L_0x051f:
            r88 = r7
            r4 = r85
            r37 = 14
            com.ingka.ikea.killswitch.model.BlockApp$$serializer r7 = com.ingka.ikea.killswitch.model.BlockApp$$serializer.INSTANCE
            r85 = r3
            r3 = 6
            java.lang.Object r7 = r0.A(r2, r3, r7, r15)
            com.ingka.ikea.killswitch.model.BlockApp r7 = (com.ingka.ikea.killswitch.model.BlockApp) r7
            r4 = r4 | 64
            XH.N r15 = XH.C16807N.f139792a
            r15 = r7
            goto L_0x04b0
        L_0x0537:
            r88 = r7
            r4 = r85
            r7 = 5
            r37 = 14
            r85 = r3
            r3 = 6
            boolean r79 = r0.D(r2, r7)
            r33 = 32
            r4 = r4 | 32
            XH.N r71 = XH.C16807N.f139792a
        L_0x054b:
            r3 = 1
            r7 = 0
            goto L_0x04b4
        L_0x054f:
            r88 = r7
            r4 = r85
            r7 = 5
            r33 = 32
            r37 = 14
            r85 = r3
            com.ingka.ikea.killswitch.model.ConfigAlert$$serializer r3 = com.ingka.ikea.killswitch.model.ConfigAlert$$serializer.INSTANCE
            r7 = 4
            java.lang.Object r1 = r0.A(r2, r7, r3, r1)
            com.ingka.ikea.killswitch.model.ConfigAlert r1 = (com.ingka.ikea.killswitch.model.ConfigAlert) r1
            r3 = 16
            r4 = r4 | r3
            XH.N r7 = XH.C16807N.f139792a
            goto L_0x054b
        L_0x0569:
            r4 = r85
            r7 = 3
            r33 = 32
            r37 = 14
            r85 = r3
            r3 = 16
            boolean r36 = r0.D(r2, r7)
            r70 = 8
            r4 = r4 | 8
            XH.N r87 = XH.C16807N.f139792a
            r88 = r36
            r3 = 1
            r7 = 0
            goto L_0x04b6
        L_0x0584:
            r88 = r7
            r4 = r85
            r7 = 3
            r33 = 32
            r37 = 14
            r70 = 8
            r85 = r3
            jK.Y0 r3 = jK.Y0.f144077a
            r7 = 2
            java.lang.Object r3 = r0.A(r2, r7, r3, r8)
            java.lang.String r3 = (java.lang.String) r3
            r78 = 4
            r4 = r4 | 4
            XH.N r8 = XH.C16807N.f139792a
            r8 = r3
            r3 = 1
        L_0x05a2:
            r7 = 0
            goto L_0x05e8
        L_0x05a4:
            r88 = r7
            r4 = r85
            r7 = 2
            r33 = 32
            r37 = 14
            r70 = 8
            r78 = 4
            r85 = r3
            r3 = 1
            java.lang.String r68 = r0.n(r2, r3)
            r4 = r4 | r7
            XH.N r77 = XH.C16807N.f139792a
            goto L_0x05a2
        L_0x05bc:
            r88 = r7
            r4 = r85
            r7 = 0
            r33 = 32
            r37 = 14
            r70 = 8
            r78 = 4
            r85 = r3
            r3 = 1
            java.lang.String r67 = r0.n(r2, r7)
            r4 = r4 | r3
            XH.N r69 = XH.C16807N.f139792a
            goto L_0x05e8
        L_0x05d4:
            r88 = r7
            r4 = r85
            r7 = 0
            r33 = 32
            r37 = 14
            r70 = 8
            r78 = 4
            r85 = r3
            r3 = 1
            XH.N r69 = XH.C16807N.f139792a
            r86 = r7
        L_0x05e8:
            r3 = r85
            r7 = r88
            r85 = r4
            r4 = r70
            goto L_0x0258
        L_0x05f2:
            r88 = r7
            r4 = r85
            r85 = r3
            r96 = r1
            r90 = r4
            r91 = r5
            r133 = r6
            r94 = r8
            r106 = r9
            r132 = r10
            r131 = r11
            r130 = r12
            r129 = r13
            r128 = r14
            r98 = r15
            r107 = r40
            r108 = r41
            r109 = r42
            r110 = r43
            r111 = r44
            r112 = r45
            r113 = r46
            r114 = r47
            r115 = r48
            r116 = r49
            r117 = r50
            r118 = r51
            r119 = r52
            r120 = r53
            r121 = r54
            r122 = r55
            r123 = r56
            r124 = r57
            r125 = r58
            r126 = r59
            r127 = r60
            r137 = r61
            r138 = r62
            r139 = r63
            r135 = r64
            r100 = r65
            r136 = r66
            r92 = r67
            r93 = r68
            r105 = r72
            r97 = r79
            r103 = r80
            r102 = r81
            r101 = r82
            r99 = r83
            r104 = r84
            r134 = r85
            r95 = r88
        L_0x065c:
            r0.c(r2)
            com.ingka.ikea.killswitch.model.KillSwitchConfig r0 = new com.ingka.ikea.killswitch.model.KillSwitchConfig
            r89 = r0
            r140 = 0
            r89.<init>(r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.killswitch.model.KillSwitchConfig$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.killswitch.model.KillSwitchConfig");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, KillSwitchConfig killSwitchConfig) {
        C17542s.j(encoder, "encoder");
        C17542s.j(killSwitchConfig, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        KillSwitchConfig.Q(killSwitchConfig, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u10 = C17294a.u(y02);
        C17457i iVar = C17457i.f144111a;
        return new KSerializer[]{y02, y02, u10, iVar, C17294a.u(ConfigAlert$$serializer.INSTANCE), iVar, C17294a.u(BlockApp$$serializer.INSTANCE), iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, iVar, C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar), C17294a.u(iVar), iVar, iVar, iVar, iVar, iVar};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
