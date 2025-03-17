package com.ingka.ikea.mcomsettings.impl.network;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/mcomsettings/impl/network/ConfigModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/mcomsettings/impl/network/ConfigModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/mcomsettings/impl/network/ConfigModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/mcomsettings/impl/network/ConfigModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ConfigModel$$serializer implements N<ConfigModel> {
    public static final ConfigModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ConfigModel$$serializer configModel$$serializer = new ConfigModel$$serializer();
        INSTANCE = configModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.mcomsettings.impl.network.ConfigModel", configModel$$serializer, 18);
        j02.p("discountCodeEnabled", false);
        j02.p("showTotalExclTaxInCartAndCheckout", false);
        j02.p("showPriceViewInPaymentExpanded", false);
        j02.p("contactUs", false);
        j02.p("paymentTermsAndConditions", false);
        j02.p("deliveryTimeSlotDatePatterns", false);
        j02.p("cardHolderInACI", false);
        j02.p("showOrderSummaryInCheckoutExpanded", false);
        j02.p("availablePaymentDisclaimerIcons", false);
        j02.p("pickupDisabled", false);
        j02.p("dateAndTimePresentationPattern", false);
        j02.p("checkoutSurvey", false);
        j02.p("abortCheckoutSurvey", false);
        j02.p("showMaterialsInCart", false);
        j02.p("employeeDiscount", false);
        j02.p("showPaymentInformationSectionCheckout", false);
        j02.p("googlePayConfigurationV2", false);
        j02.p("remoteShoppingConfiguration", false);
        descriptor = j02;
    }

    private ConfigModel$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v11, resolved type: com.ingka.ikea.mcomsettings.impl.network.DeliveryTimeSlotDatePatterns} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0124, code lost:
        r3 = r3 | r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0125, code lost:
        r15 = r36;
        r6 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01f3, code lost:
        r6 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x01f5, code lost:
        r4 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x022d, code lost:
        r15 = r26;
        r6 = r27;
        r2 = r34;
        r34 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.mcomsettings.impl.network.ConfigModel deserialize(kotlinx.serialization.encoding.Decoder r60) {
        /*
            r59 = this;
            r0 = r60
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.mcomsettings.impl.network.ConfigModel.f96665s
            boolean r3 = r0.q()
            r12 = 7
            r13 = 6
            r14 = 5
            r15 = 3
            r4 = 2
            r5 = 8
            r6 = 4
            r7 = 1
            r8 = 0
            r9 = 0
            if (r3 == 0) goto L_0x00eb
            jK.i r3 = jK.C17457i.f144111a
            java.lang.Object r8 = r0.A(r1, r8, r3, r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            java.lang.Object r7 = r0.A(r1, r7, r3, r9)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            java.lang.Object r4 = r0.A(r1, r4, r3, r9)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            jK.Y0 r10 = jK.Y0.f144077a
            java.lang.Object r15 = r0.A(r1, r15, r10, r9)
            java.lang.String r15 = (java.lang.String) r15
            r11 = r2[r6]
            java.lang.Object r6 = r0.A(r1, r6, r11, r9)
            java.util.List r6 = (java.util.List) r6
            com.ingka.ikea.mcomsettings.impl.network.DeliveryTimeSlotDatePatterns$$serializer r11 = com.ingka.ikea.mcomsettings.impl.network.DeliveryTimeSlotDatePatterns$$serializer.INSTANCE
            java.lang.Object r11 = r0.A(r1, r14, r11, r9)
            com.ingka.ikea.mcomsettings.impl.network.DeliveryTimeSlotDatePatterns r11 = (com.ingka.ikea.mcomsettings.impl.network.DeliveryTimeSlotDatePatterns) r11
            com.ingka.ikea.mcomsettings.impl.network.CardHolderNameValidationRemote$$serializer r14 = com.ingka.ikea.mcomsettings.impl.network.CardHolderNameValidationRemote$$serializer.INSTANCE
            java.lang.Object r13 = r0.A(r1, r13, r14, r9)
            com.ingka.ikea.mcomsettings.impl.network.CardHolderNameValidationRemote r13 = (com.ingka.ikea.mcomsettings.impl.network.CardHolderNameValidationRemote) r13
            java.lang.Object r12 = r0.A(r1, r12, r3, r9)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            r2 = r2[r5]
            java.lang.Object r2 = r0.A(r1, r5, r2, r9)
            java.util.List r2 = (java.util.List) r2
            r5 = 9
            java.lang.Object r5 = r0.A(r1, r5, r3, r9)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r14 = 10
            java.lang.Object r10 = r0.A(r1, r14, r10, r9)
            java.lang.String r10 = (java.lang.String) r10
            com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote$$serializer r14 = com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote$$serializer.INSTANCE
            r21 = r2
            r2 = 11
            java.lang.Object r2 = r0.A(r1, r2, r14, r9)
            com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote r2 = (com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote) r2
            r20 = r2
            r2 = 12
            java.lang.Object r2 = r0.A(r1, r2, r14, r9)
            com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote r2 = (com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote) r2
            r14 = 13
            java.lang.Object r14 = r0.A(r1, r14, r3, r9)
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            r18 = r2
            com.ingka.ikea.mcomsettings.impl.network.EmployeeDiscountRemote$$serializer r2 = com.ingka.ikea.mcomsettings.impl.network.EmployeeDiscountRemote$$serializer.INSTANCE
            r19 = r4
            r4 = 14
            java.lang.Object r2 = r0.A(r1, r4, r2, r9)
            com.ingka.ikea.mcomsettings.impl.network.EmployeeDiscountRemote r2 = (com.ingka.ikea.mcomsettings.impl.network.EmployeeDiscountRemote) r2
            r4 = 15
            java.lang.Object r3 = r0.A(r1, r4, r3, r9)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote$$serializer r4 = com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote$$serializer.INSTANCE
            r17 = r2
            r2 = 16
            java.lang.Object r2 = r0.A(r1, r2, r4, r9)
            com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote r2 = (com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote) r2
            com.ingka.ikea.mcomsettings.impl.network.RemoteShoppingConfigurationRemote$$serializer r4 = com.ingka.ikea.mcomsettings.impl.network.RemoteShoppingConfigurationRemote$$serializer.INSTANCE
            r16 = r2
            r2 = 17
            java.lang.Object r2 = r0.A(r1, r2, r4, r9)
            com.ingka.ikea.mcomsettings.impl.network.RemoteShoppingConfigurationRemote r2 = (com.ingka.ikea.mcomsettings.impl.network.RemoteShoppingConfigurationRemote) r2
            r4 = 262143(0x3ffff, float:3.6734E-40)
            r57 = r2
            r55 = r3
            r39 = r4
            r49 = r5
            r44 = r6
            r41 = r7
            r40 = r8
            r50 = r10
            r45 = r11
            r47 = r12
            r46 = r13
            r53 = r14
            r43 = r15
            r56 = r16
            r54 = r17
            r52 = r18
            r42 = r19
            r51 = r20
            r48 = r21
            goto L_0x0318
        L_0x00eb:
            r35 = r7
            r3 = r8
            r4 = r9
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r10 = r8
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r29 = r15
            r30 = r29
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
        L_0x0105:
            if (r35 == 0) goto L_0x02e0
            r36 = r15
            int r15 = r0.p(r1)
            switch(r15) {
                case -1: goto L_0x02c7;
                case 0: goto L_0x029f;
                case 1: goto L_0x027a;
                case 2: goto L_0x0257;
                case 3: goto L_0x0236;
                case 4: goto L_0x0214;
                case 5: goto L_0x01f9;
                case 6: goto L_0x01df;
                case 7: goto L_0x01c5;
                case 8: goto L_0x01b4;
                case 9: goto L_0x01a2;
                case 10: goto L_0x0191;
                case 11: goto L_0x0180;
                case 12: goto L_0x016f;
                case 13: goto L_0x015e;
                case 14: goto L_0x014d;
                case 15: goto L_0x013b;
                case 16: goto L_0x012a;
                case 17: goto L_0x0116;
                default: goto L_0x0110;
            }
        L_0x0110:
            fK.E r0 = new fK.E
            r0.<init>((int) r15)
            throw r0
        L_0x0116:
            com.ingka.ikea.mcomsettings.impl.network.RemoteShoppingConfigurationRemote$$serializer r15 = com.ingka.ikea.mcomsettings.impl.network.RemoteShoppingConfigurationRemote$$serializer.INSTANCE
            r37 = r6
            r6 = 17
            java.lang.Object r4 = r0.A(r1, r6, r15, r4)
            com.ingka.ikea.mcomsettings.impl.network.RemoteShoppingConfigurationRemote r4 = (com.ingka.ikea.mcomsettings.impl.network.RemoteShoppingConfigurationRemote) r4
            r15 = 131072(0x20000, float:1.83671E-40)
        L_0x0124:
            r3 = r3 | r15
        L_0x0125:
            r15 = r36
            r6 = r37
            goto L_0x0105
        L_0x012a:
            r37 = r6
            r6 = 17
            com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote$$serializer r15 = com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote$$serializer.INSTANCE
            r6 = 16
            java.lang.Object r7 = r0.A(r1, r6, r15, r7)
            com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote r7 = (com.ingka.ikea.mcomsettings.impl.network.GooglePayExpressConfigRemote) r7
            r15 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0124
        L_0x013b:
            r37 = r6
            r6 = 16
            jK.i r15 = jK.C17457i.f144111a
            r6 = 15
            java.lang.Object r8 = r0.A(r1, r6, r15, r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r15 = 32768(0x8000, float:4.5918E-41)
            goto L_0x0124
        L_0x014d:
            r37 = r6
            r6 = 15
            com.ingka.ikea.mcomsettings.impl.network.EmployeeDiscountRemote$$serializer r15 = com.ingka.ikea.mcomsettings.impl.network.EmployeeDiscountRemote$$serializer.INSTANCE
            r6 = 14
            java.lang.Object r11 = r0.A(r1, r6, r15, r11)
            com.ingka.ikea.mcomsettings.impl.network.EmployeeDiscountRemote r11 = (com.ingka.ikea.mcomsettings.impl.network.EmployeeDiscountRemote) r11
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            goto L_0x0125
        L_0x015e:
            r37 = r6
            r6 = 14
            jK.i r15 = jK.C17457i.f144111a
            r6 = 13
            java.lang.Object r10 = r0.A(r1, r6, r15, r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0125
        L_0x016f:
            r37 = r6
            r6 = 13
            com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote$$serializer r15 = com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote$$serializer.INSTANCE
            r6 = 12
            java.lang.Object r9 = r0.A(r1, r6, r15, r9)
            com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote r9 = (com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote) r9
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            goto L_0x0125
        L_0x0180:
            r37 = r6
            r6 = 12
            com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote$$serializer r15 = com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote$$serializer.INSTANCE
            r6 = 11
            java.lang.Object r5 = r0.A(r1, r6, r15, r5)
            com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote r5 = (com.ingka.ikea.mcomsettings.impl.network.SurveyConfigRemote) r5
            r3 = r3 | 2048(0x800, float:2.87E-42)
            goto L_0x0125
        L_0x0191:
            r37 = r6
            r6 = 11
            jK.Y0 r15 = jK.Y0.f144077a
            r6 = 10
            java.lang.Object r12 = r0.A(r1, r6, r15, r12)
            java.lang.String r12 = (java.lang.String) r12
            r3 = r3 | 1024(0x400, float:1.435E-42)
            goto L_0x0125
        L_0x01a2:
            r37 = r6
            r6 = 10
            jK.i r15 = jK.C17457i.f144111a
            r6 = 9
            java.lang.Object r13 = r0.A(r1, r6, r15, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            r3 = r3 | 512(0x200, float:7.175E-43)
            goto L_0x0125
        L_0x01b4:
            r37 = r6
            r15 = 8
            r6 = r2[r15]
            java.lang.Object r6 = r0.A(r1, r15, r6, r14)
            r14 = r6
            java.util.List r14 = (java.util.List) r14
            r3 = r3 | 256(0x100, float:3.59E-43)
            goto L_0x0125
        L_0x01c5:
            r37 = r6
            r15 = 8
            jK.i r6 = jK.C17457i.f144111a
            r28 = r4
            r4 = r37
            r15 = 7
            java.lang.Object r4 = r0.A(r1, r15, r6, r4)
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r3 = r3 | 128(0x80, float:1.794E-43)
            r4 = r28
            r15 = r36
            goto L_0x0105
        L_0x01df:
            r28 = r4
            r4 = r6
            r15 = 7
            com.ingka.ikea.mcomsettings.impl.network.CardHolderNameValidationRemote$$serializer r6 = com.ingka.ikea.mcomsettings.impl.network.CardHolderNameValidationRemote$$serializer.INSTANCE
            r27 = r4
            r4 = r36
            r15 = 6
            java.lang.Object r4 = r0.A(r1, r15, r6, r4)
            com.ingka.ikea.mcomsettings.impl.network.CardHolderNameValidationRemote r4 = (com.ingka.ikea.mcomsettings.impl.network.CardHolderNameValidationRemote) r4
            r3 = r3 | 64
            r15 = r4
        L_0x01f3:
            r6 = r27
        L_0x01f5:
            r4 = r28
            goto L_0x0105
        L_0x01f9:
            r28 = r4
            r27 = r6
            r4 = r36
            r15 = 6
            com.ingka.ikea.mcomsettings.impl.network.DeliveryTimeSlotDatePatterns$$serializer r6 = com.ingka.ikea.mcomsettings.impl.network.DeliveryTimeSlotDatePatterns$$serializer.INSTANCE
            r26 = r4
            r4 = r34
            r15 = 5
            java.lang.Object r4 = r0.A(r1, r15, r6, r4)
            r34 = r4
            com.ingka.ikea.mcomsettings.impl.network.DeliveryTimeSlotDatePatterns r34 = (com.ingka.ikea.mcomsettings.impl.network.DeliveryTimeSlotDatePatterns) r34
            r3 = r3 | 32
            r15 = r26
            goto L_0x01f3
        L_0x0214:
            r28 = r4
            r27 = r6
            r4 = r34
            r26 = r36
            r6 = 4
            r15 = r2[r6]
            r34 = r2
            r2 = r33
            java.lang.Object r2 = r0.A(r1, r6, r15, r2)
            r33 = r2
            java.util.List r33 = (java.util.List) r33
            r3 = r3 | 16
        L_0x022d:
            r15 = r26
            r6 = r27
            r2 = r34
            r34 = r4
            goto L_0x01f5
        L_0x0236:
            r28 = r4
            r27 = r6
            r4 = r34
            r26 = r36
            r6 = 4
            r34 = r2
            r2 = r33
            jK.Y0 r15 = jK.Y0.f144077a
            r25 = r2
            r2 = r32
            r6 = 3
            java.lang.Object r2 = r0.A(r1, r6, r15, r2)
            r32 = r2
            java.lang.String r32 = (java.lang.String) r32
            r3 = r3 | 8
            r33 = r25
            goto L_0x022d
        L_0x0257:
            r28 = r4
            r27 = r6
            r25 = r33
            r4 = r34
            r26 = r36
            r6 = 3
            r34 = r2
            r2 = r32
            jK.i r15 = jK.C17457i.f144111a
            r24 = r2
            r2 = r31
            r6 = 2
            java.lang.Object r2 = r0.A(r1, r6, r15, r2)
            r31 = r2
            java.lang.Boolean r31 = (java.lang.Boolean) r31
            r3 = r3 | 4
            r32 = r24
            goto L_0x022d
        L_0x027a:
            r28 = r4
            r27 = r6
            r24 = r32
            r25 = r33
            r4 = r34
            r26 = r36
            r6 = 2
            r34 = r2
            r2 = r31
            jK.i r15 = jK.C17457i.f144111a
            r23 = r2
            r2 = r30
            r6 = 1
            java.lang.Object r2 = r0.A(r1, r6, r15, r2)
            r30 = r2
            java.lang.Boolean r30 = (java.lang.Boolean) r30
            r3 = r3 | 2
            r31 = r23
            goto L_0x022d
        L_0x029f:
            r28 = r4
            r27 = r6
            r23 = r31
            r24 = r32
            r25 = r33
            r4 = r34
            r26 = r36
            r6 = 1
            r34 = r2
            r2 = r30
            jK.i r15 = jK.C17457i.f144111a
            r22 = r2
            r2 = r29
            r6 = 0
            java.lang.Object r2 = r0.A(r1, r6, r15, r2)
            r29 = r2
            java.lang.Boolean r29 = (java.lang.Boolean) r29
            r3 = r3 | 1
            r30 = r22
            goto L_0x022d
        L_0x02c7:
            r28 = r4
            r27 = r6
            r22 = r30
            r23 = r31
            r24 = r32
            r25 = r33
            r4 = r34
            r26 = r36
            r6 = 0
            r34 = r2
            r2 = r29
            r35 = r6
            goto L_0x022d
        L_0x02e0:
            r28 = r4
            r27 = r6
            r26 = r15
            r2 = r29
            r22 = r30
            r23 = r31
            r24 = r32
            r25 = r33
            r4 = r34
            r40 = r2
            r39 = r3
            r45 = r4
            r51 = r5
            r56 = r7
            r55 = r8
            r52 = r9
            r53 = r10
            r54 = r11
            r50 = r12
            r49 = r13
            r48 = r14
            r41 = r22
            r42 = r23
            r43 = r24
            r44 = r25
            r46 = r26
            r47 = r27
            r57 = r28
        L_0x0318:
            r0.c(r1)
            com.ingka.ikea.mcomsettings.impl.network.ConfigModel r0 = new com.ingka.ikea.mcomsettings.impl.network.ConfigModel
            r38 = r0
            r58 = 0
            r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.mcomsettings.impl.network.ConfigModel$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.mcomsettings.impl.network.ConfigModel");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ConfigModel configModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(configModel, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ConfigModel.c(configModel, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer[] a10 = ConfigModel.f96665s;
        C17457i iVar = C17457i.f144111a;
        KSerializer<?> u10 = C17294a.u(iVar);
        KSerializer<?> u11 = C17294a.u(iVar);
        KSerializer<?> u12 = C17294a.u(iVar);
        Y0 y02 = Y0.f144077a;
        KSerializer<?> u13 = C17294a.u(y02);
        KSerializer<?> u14 = C17294a.u(a10[4]);
        KSerializer<?> u15 = C17294a.u(DeliveryTimeSlotDatePatterns$$serializer.INSTANCE);
        KSerializer<?> u16 = C17294a.u(CardHolderNameValidationRemote$$serializer.INSTANCE);
        KSerializer<?> u17 = C17294a.u(iVar);
        KSerializer<?> u18 = C17294a.u(a10[8]);
        KSerializer<?> u19 = C17294a.u(iVar);
        KSerializer<?> u20 = C17294a.u(y02);
        SurveyConfigRemote$$serializer surveyConfigRemote$$serializer = SurveyConfigRemote$$serializer.INSTANCE;
        return new KSerializer[]{u10, u11, u12, u13, u14, u15, u16, u17, u18, u19, u20, C17294a.u(surveyConfigRemote$$serializer), C17294a.u(surveyConfigRemote$$serializer), C17294a.u(iVar), C17294a.u(EmployeeDiscountRemote$$serializer.INSTANCE), C17294a.u(iVar), C17294a.u(GooglePayExpressConfigRemote$$serializer.INSTANCE), C17294a.u(RemoteShoppingConfigurationRemote$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
