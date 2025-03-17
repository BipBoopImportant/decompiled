package com.ingka.ikea.mcomsettings;

import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentContainer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.J;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import tv.C11996a;
import tv.C11997b;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b/\b\b\u0018\u0000 R2\u00020\u0001:\b94+86S.0BÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b6\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b2\u0010=\u001a\u0004\b9\u0010>R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b0\u0010AR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\bC\u00103R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b;\u0010:\u001a\u0004\b.\u0010<R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bD\u00101\u001a\u0004\bD\u00103R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010,\u001a\u0004\b8\u0010$R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b4\u0010HR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bC\u0010G\u001a\u0004\b+\u0010HR\u0017\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\bF\u00103R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b7\u0010J\u001a\u0004\b?\u0010KR\u0017\u0010\u001c\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\bI\u00103R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bB\u0010NR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bE\u0010Q¨\u0006T"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig;", "", "", "retailCode", "languageCode", "", "discountCodeEnabled", "showTotalExclTaxInCartAndCheckout", "showPriceViewInPaymentExpanded", "contactUri", "", "Lcom/ingka/ikea/mcomsettings/MComConfig$g;", "paymentTermsAndConditionHolders", "Lcom/ingka/ikea/mcomsettings/MComConfig$d;", "deliveryTimeSlotDatePatternsHolder", "Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "cardHolderInAci", "showOrderSummaryInCheckoutExpanded", "Lcom/ingka/ikea/mcomsettings/MComConfig$a;", "availablePaymentOptionHolders", "pickupDisabled", "dateAndTimePresentationPattern", "Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "checkoutSurveyConfig", "abortCheckoutSurveyConfig", "showMaterialsInCart", "Lcom/ingka/ikea/mcomsettings/MComConfig$e;", "employeeDiscount", "showPaymentInformationSectionCheckout", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "googlePayExpressConfig", "", "remoteSalesCartThreshold", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Lcom/ingka/ikea/mcomsettings/MComConfig$d;Lcom/ingka/ikea/mcomsettings/MComConfig$b;ZLjava/util/List;ZLjava/lang/String;Lcom/ingka/ikea/mcomsettings/MComConfig$f;Lcom/ingka/ikea/mcomsettings/MComConfig$f;ZLcom/ingka/ikea/mcomsettings/MComConfig$e;ZLcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;Ljava/lang/Double;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRetailCode", "b", "getLanguageCode", "c", "Z", "h", "()Z", "d", "r", "e", "q", "f", "g", "Ljava/util/List;", "k", "()Ljava/util/List;", "Lcom/ingka/ikea/mcomsettings/MComConfig$d;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$d;", "i", "Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "j", "o", "l", "m", "n", "Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "p", "Lcom/ingka/ikea/mcomsettings/MComConfig$e;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$e;", "s", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "t", "Ljava/lang/Double;", "()Ljava/lang/Double;", "u", "GooglePayExpressConfig", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MComConfig {

    /* renamed from: u  reason: collision with root package name */
    public static final c f96551u = new c((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f96552a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96553b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f96554c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f96555d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f96556e;

    /* renamed from: f  reason: collision with root package name */
    private final String f96557f;

    /* renamed from: g  reason: collision with root package name */
    private final List<g> f96558g;

    /* renamed from: h  reason: collision with root package name */
    private final d f96559h;

    /* renamed from: i  reason: collision with root package name */
    private final b f96560i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f96561j;

    /* renamed from: k  reason: collision with root package name */
    private final List<a> f96562k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f96563l;

    /* renamed from: m  reason: collision with root package name */
    private final String f96564m;

    /* renamed from: n  reason: collision with root package name */
    private final f f96565n;

    /* renamed from: o  reason: collision with root package name */
    private final f f96566o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f96567p;

    /* renamed from: q  reason: collision with root package name */
    private final e f96568q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f96569r;

    /* renamed from: s  reason: collision with root package name */
    private final GooglePayExpressConfig f96570s;

    /* renamed from: t  reason: collision with root package name */
    private final Double f96571t;

    @p
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b \b\b\u0018\u0000 @2\u00020\u0001:\u0006ABCDE)Bw\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010*\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010,R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00101\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u00101\u0012\u0004\b6\u0010.\u001a\u0004\b5\u0010\"R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u0010*\u0012\u0004\b9\u0010.\u001a\u0004\b8\u0010,R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010:\u0012\u0004\b<\u0010.\u001a\u0004\b7\u0010;R(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u0010*\u0012\u0004\b>\u0010.\u001a\u0004\b=\u0010,R(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010*\u0012\u0004\b?\u0010.\u001a\u0004\b4\u0010,¨\u0006F"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "", "", "Ltv/a;", "cardAuthMethods", "Ltv/b;", "cardNetworks", "", "termsAndConditionsLink", "privacyPolicyLink", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredTaxField;", "requiredTaxFields", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$FiscalCodeField;", "fiscalCodeField", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredRecipientField;", "requiredRecipientFields", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$CountryOfOrigin;", "countriesOfOrigin", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$FiscalCodeField;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$FiscalCodeField;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "j", "(Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getCardAuthMethods$annotations", "()V", "c", "getCardNetworks$annotations", "Ljava/lang/String;", "i", "getTermsAndConditionsLink$annotations", "d", "f", "getPrivacyPolicyLink$annotations", "e", "h", "getRequiredTaxFields$annotations", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$FiscalCodeField;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$FiscalCodeField;", "getFiscalCodeField$annotations", "g", "getRequiredRecipientFields$annotations", "getCountriesOfOrigin$annotations", "Companion", "RequiredTaxField", "RequiredRecipientField", "FiscalCodeField", "CountryOfOrigin", "$serializer", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GooglePayExpressConfig {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public static final KSerializer<Object>[] f96572i = {new C17451f(J.b("com.ingka.ikea.mcomsettings.googlepay.GooglePayConstants.CardAuthMethods", C11996a.values())), new C17451f(J.b("com.ingka.ikea.mcomsettings.googlepay.GooglePayConstants.CardNetworks", C11997b.values())), null, null, new C17451f(MComConfig$GooglePayExpressConfig$RequiredTaxField$$serializer.INSTANCE), null, new C17451f(MComConfig$GooglePayExpressConfig$RequiredRecipientField$$serializer.INSTANCE), new C17451f(MComConfig$GooglePayExpressConfig$CountryOfOrigin$$serializer.INSTANCE)};

        /* renamed from: a  reason: collision with root package name */
        private final List<C11996a> f96573a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C11997b> f96574b;

        /* renamed from: c  reason: collision with root package name */
        private final String f96575c;

        /* renamed from: d  reason: collision with root package name */
        private final String f96576d;

        /* renamed from: e  reason: collision with root package name */
        private final List<RequiredTaxField> f96577e;

        /* renamed from: f  reason: collision with root package name */
        private final FiscalCodeField f96578f;

        /* renamed from: g  reason: collision with root package name */
        private final List<RequiredRecipientField> f96579g;

        /* renamed from: h  reason: collision with root package name */
        private final List<CountryOfOrigin> f96580h;

        @p
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 \"2\u00020\u0001:\u0002#\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001d\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$CountryOfOrigin;", "", "", "displayText", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$CountryOfOrigin;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDisplayText$annotations", "()V", "b", "getValue$annotations", "Companion", "$serializer", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CountryOfOrigin {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f96581a;

            /* renamed from: b  reason: collision with root package name */
            private final String f96582b;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$CountryOfOrigin$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$CountryOfOrigin;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<CountryOfOrigin> serializer() {
                    return MComConfig$GooglePayExpressConfig$CountryOfOrigin$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ CountryOfOrigin(int i10, String str, String str2, T0 t02) {
                if (3 != (i10 & 3)) {
                    E0.b(i10, 3, MComConfig$GooglePayExpressConfig$CountryOfOrigin$$serializer.INSTANCE.getDescriptor());
                }
                this.f96581a = str;
                this.f96582b = str2;
            }

            public static final /* synthetic */ void c(CountryOfOrigin countryOfOrigin, C17395d dVar, SerialDescriptor serialDescriptor) {
                dVar.y(serialDescriptor, 0, countryOfOrigin.f96581a);
                dVar.y(serialDescriptor, 1, countryOfOrigin.f96582b);
            }

            public final String a() {
                return this.f96581a;
            }

            public final String b() {
                return this.f96582b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CountryOfOrigin)) {
                    return false;
                }
                CountryOfOrigin countryOfOrigin = (CountryOfOrigin) obj;
                return C17542s.e(this.f96581a, countryOfOrigin.f96581a) && C17542s.e(this.f96582b, countryOfOrigin.f96582b);
            }

            public int hashCode() {
                return (this.f96581a.hashCode() * 31) + this.f96582b.hashCode();
            }

            public String toString() {
                String str = this.f96581a;
                String str2 = this.f96582b;
                return "CountryOfOrigin(displayText=" + str + ", value=" + str2 + ")";
            }

            public CountryOfOrigin(String str, String str2) {
                C17542s.j(str, "displayText");
                C17542s.j(str2, "value");
                this.f96581a = str;
                this.f96582b = str2;
            }
        }

        @p
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 %2\u00020\u0001:\u0002&\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001e\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u0012\u0004\b$\u0010 \u001a\u0004\b!\u0010\u0016¨\u0006'"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$FiscalCodeField;", "", "", "displayText", "regex", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$FiscalCodeField;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDisplayText$annotations", "()V", "b", "c", "getRegex$annotations", "getErrorMessage$annotations", "Companion", "$serializer", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class FiscalCodeField {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f96583a;

            /* renamed from: b  reason: collision with root package name */
            private final String f96584b;

            /* renamed from: c  reason: collision with root package name */
            private final String f96585c;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$FiscalCodeField$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$FiscalCodeField;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<FiscalCodeField> serializer() {
                    return MComConfig$GooglePayExpressConfig$FiscalCodeField$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ FiscalCodeField(int i10, String str, String str2, String str3, T0 t02) {
                if (7 != (i10 & 7)) {
                    E0.b(i10, 7, MComConfig$GooglePayExpressConfig$FiscalCodeField$$serializer.INSTANCE.getDescriptor());
                }
                this.f96583a = str;
                this.f96584b = str2;
                this.f96585c = str3;
            }

            public static final /* synthetic */ void d(FiscalCodeField fiscalCodeField, C17395d dVar, SerialDescriptor serialDescriptor) {
                dVar.y(serialDescriptor, 0, fiscalCodeField.f96583a);
                dVar.y(serialDescriptor, 1, fiscalCodeField.f96584b);
                dVar.y(serialDescriptor, 2, fiscalCodeField.f96585c);
            }

            public final String a() {
                return this.f96583a;
            }

            public final String b() {
                return this.f96585c;
            }

            public final String c() {
                return this.f96584b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FiscalCodeField)) {
                    return false;
                }
                FiscalCodeField fiscalCodeField = (FiscalCodeField) obj;
                return C17542s.e(this.f96583a, fiscalCodeField.f96583a) && C17542s.e(this.f96584b, fiscalCodeField.f96584b) && C17542s.e(this.f96585c, fiscalCodeField.f96585c);
            }

            public int hashCode() {
                return (((this.f96583a.hashCode() * 31) + this.f96584b.hashCode()) * 31) + this.f96585c.hashCode();
            }

            public String toString() {
                String str = this.f96583a;
                String str2 = this.f96584b;
                String str3 = this.f96585c;
                return "FiscalCodeField(displayText=" + str + ", regex=" + str2 + ", errorMessage=" + str3 + ")";
            }

            public FiscalCodeField(String str, String str2, String str3) {
                C17542s.j(str, "displayText");
                C17542s.j(str2, "regex");
                C17542s.j(str3, "errorMessage");
                this.f96583a = str;
                this.f96584b = str2;
                this.f96585c = str3;
            }
        }

        @p
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\b\u0018\u0000 *2\u00020\u0001:\u0002+\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001f\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b%\u0010!\u001a\u0004\b\"\u0010\u0018R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010!\u001a\u0004\b&\u0010(¨\u0006,"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredRecipientField;", "", "", "displayText", "regex", "recipientCodeType", "", "requiresInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredRecipientField;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDisplayText$annotations", "()V", "b", "c", "getRegex$annotations", "getRecipientCodeType$annotations", "d", "Z", "()Z", "getRequiresInput$annotations", "Companion", "$serializer", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RequiredRecipientField {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f96586a;

            /* renamed from: b  reason: collision with root package name */
            private final String f96587b;

            /* renamed from: c  reason: collision with root package name */
            private final String f96588c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f96589d;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredRecipientField$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredRecipientField;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<RequiredRecipientField> serializer() {
                    return MComConfig$GooglePayExpressConfig$RequiredRecipientField$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ RequiredRecipientField(int i10, String str, String str2, String str3, boolean z10, T0 t02) {
                if (15 != (i10 & 15)) {
                    E0.b(i10, 15, MComConfig$GooglePayExpressConfig$RequiredRecipientField$$serializer.INSTANCE.getDescriptor());
                }
                this.f96586a = str;
                this.f96587b = str2;
                this.f96588c = str3;
                this.f96589d = z10;
            }

            public static final /* synthetic */ void e(RequiredRecipientField requiredRecipientField, C17395d dVar, SerialDescriptor serialDescriptor) {
                dVar.y(serialDescriptor, 0, requiredRecipientField.f96586a);
                dVar.y(serialDescriptor, 1, requiredRecipientField.f96587b);
                dVar.y(serialDescriptor, 2, requiredRecipientField.f96588c);
                dVar.x(serialDescriptor, 3, requiredRecipientField.f96589d);
            }

            public final String a() {
                return this.f96586a;
            }

            public final String b() {
                return this.f96588c;
            }

            public final String c() {
                return this.f96587b;
            }

            public final boolean d() {
                return this.f96589d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RequiredRecipientField)) {
                    return false;
                }
                RequiredRecipientField requiredRecipientField = (RequiredRecipientField) obj;
                return C17542s.e(this.f96586a, requiredRecipientField.f96586a) && C17542s.e(this.f96587b, requiredRecipientField.f96587b) && C17542s.e(this.f96588c, requiredRecipientField.f96588c) && this.f96589d == requiredRecipientField.f96589d;
            }

            public int hashCode() {
                return (((((this.f96586a.hashCode() * 31) + this.f96587b.hashCode()) * 31) + this.f96588c.hashCode()) * 31) + Boolean.hashCode(this.f96589d);
            }

            public String toString() {
                String str = this.f96586a;
                String str2 = this.f96587b;
                String str3 = this.f96588c;
                boolean z10 = this.f96589d;
                return "RequiredRecipientField(displayText=" + str + ", regex=" + str2 + ", recipientCodeType=" + str3 + ", requiresInput=" + z10 + ")";
            }

            public RequiredRecipientField(String str, String str2, String str3, boolean z10) {
                C17542s.j(str, "displayText");
                C17542s.j(str2, "regex");
                C17542s.j(str3, "recipientCodeType");
                this.f96586a = str;
                this.f96587b = str2;
                this.f96588c = str3;
                this.f96589d = z10;
            }
        }

        @p
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\b\u0018\u0000 -2\u00020\u0001:\u0002.\u001fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010 \u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0019R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\"\u001a\u0004\b'\u0010(R \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010 \u0012\u0004\b+\u0010\"\u001a\u0004\b*\u0010\u0019R \u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010&\u0012\u0004\b,\u0010\"\u001a\u0004\b%\u0010(¨\u0006/"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredTaxField;", "", "", "displayText", "regex", "", "showCountryOfOrigin", "taxCodeType", "requiresInput", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredTaxField;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDisplayText$annotations", "()V", "b", "getRegex$annotations", "c", "Z", "d", "()Z", "getShowCountryOfOrigin$annotations", "e", "getTaxCodeType$annotations", "getRequiresInput$annotations", "Companion", "$serializer", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RequiredTaxField {
            public static final a Companion = new a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final String f96590a;

            /* renamed from: b  reason: collision with root package name */
            private final String f96591b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f96592c;

            /* renamed from: d  reason: collision with root package name */
            private final String f96593d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f96594e;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredTaxField$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$RequiredTaxField;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<RequiredTaxField> serializer() {
                    return MComConfig$GooglePayExpressConfig$RequiredTaxField$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ RequiredTaxField(int i10, String str, String str2, boolean z10, String str3, boolean z11, T0 t02) {
                if (31 != (i10 & 31)) {
                    E0.b(i10, 31, MComConfig$GooglePayExpressConfig$RequiredTaxField$$serializer.INSTANCE.getDescriptor());
                }
                this.f96590a = str;
                this.f96591b = str2;
                this.f96592c = z10;
                this.f96593d = str3;
                this.f96594e = z11;
            }

            public static final /* synthetic */ void f(RequiredTaxField requiredTaxField, C17395d dVar, SerialDescriptor serialDescriptor) {
                dVar.y(serialDescriptor, 0, requiredTaxField.f96590a);
                dVar.y(serialDescriptor, 1, requiredTaxField.f96591b);
                dVar.x(serialDescriptor, 2, requiredTaxField.f96592c);
                dVar.y(serialDescriptor, 3, requiredTaxField.f96593d);
                dVar.x(serialDescriptor, 4, requiredTaxField.f96594e);
            }

            public final String a() {
                return this.f96590a;
            }

            public final String b() {
                return this.f96591b;
            }

            public final boolean c() {
                return this.f96594e;
            }

            public final boolean d() {
                return this.f96592c;
            }

            public final String e() {
                return this.f96593d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RequiredTaxField)) {
                    return false;
                }
                RequiredTaxField requiredTaxField = (RequiredTaxField) obj;
                return C17542s.e(this.f96590a, requiredTaxField.f96590a) && C17542s.e(this.f96591b, requiredTaxField.f96591b) && this.f96592c == requiredTaxField.f96592c && C17542s.e(this.f96593d, requiredTaxField.f96593d) && this.f96594e == requiredTaxField.f96594e;
            }

            public int hashCode() {
                return (((((((this.f96590a.hashCode() * 31) + this.f96591b.hashCode()) * 31) + Boolean.hashCode(this.f96592c)) * 31) + this.f96593d.hashCode()) * 31) + Boolean.hashCode(this.f96594e);
            }

            public String toString() {
                String str = this.f96590a;
                String str2 = this.f96591b;
                boolean z10 = this.f96592c;
                String str3 = this.f96593d;
                boolean z11 = this.f96594e;
                return "RequiredTaxField(displayText=" + str + ", regex=" + str2 + ", showCountryOfOrigin=" + z10 + ", taxCodeType=" + str3 + ", requiresInput=" + z11 + ")";
            }

            public RequiredTaxField(String str, String str2, boolean z10, String str3, boolean z11) {
                C17542s.j(str, "displayText");
                C17542s.j(str2, "regex");
                C17542s.j(str3, "taxCodeType");
                this.f96590a = str;
                this.f96591b = str2;
                this.f96592c = z10;
                this.f96593d = str3;
                this.f96594e = z11;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<GooglePayExpressConfig> serializer() {
                return MComConfig$GooglePayExpressConfig$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ GooglePayExpressConfig(int i10, List list, List list2, String str, String str2, List list3, FiscalCodeField fiscalCodeField, List list4, List list5, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, MComConfig$GooglePayExpressConfig$$serializer.INSTANCE.getDescriptor());
            }
            this.f96573a = list;
            this.f96574b = list2;
            this.f96575c = str;
            this.f96576d = str2;
            if ((i10 & 16) == 0) {
                this.f96577e = null;
            } else {
                this.f96577e = list3;
            }
            if ((i10 & 32) == 0) {
                this.f96578f = null;
            } else {
                this.f96578f = fiscalCodeField;
            }
            if ((i10 & 64) == 0) {
                this.f96579g = null;
            } else {
                this.f96579g = list4;
            }
            if ((i10 & 128) == 0) {
                this.f96580h = null;
            } else {
                this.f96580h = list5;
            }
        }

        public static final /* synthetic */ void j(GooglePayExpressConfig googlePayExpressConfig, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f96572i;
            dVar.i(serialDescriptor, 0, kSerializerArr[0], googlePayExpressConfig.f96573a);
            dVar.i(serialDescriptor, 1, kSerializerArr[1], googlePayExpressConfig.f96574b);
            dVar.y(serialDescriptor, 2, googlePayExpressConfig.f96575c);
            dVar.B(serialDescriptor, 3, Y0.f144077a, googlePayExpressConfig.f96576d);
            if (dVar.z(serialDescriptor, 4) || googlePayExpressConfig.f96577e != null) {
                dVar.B(serialDescriptor, 4, kSerializerArr[4], googlePayExpressConfig.f96577e);
            }
            if (dVar.z(serialDescriptor, 5) || googlePayExpressConfig.f96578f != null) {
                dVar.B(serialDescriptor, 5, MComConfig$GooglePayExpressConfig$FiscalCodeField$$serializer.INSTANCE, googlePayExpressConfig.f96578f);
            }
            if (dVar.z(serialDescriptor, 6) || googlePayExpressConfig.f96579g != null) {
                dVar.B(serialDescriptor, 6, kSerializerArr[6], googlePayExpressConfig.f96579g);
            }
            if (dVar.z(serialDescriptor, 7) || googlePayExpressConfig.f96580h != null) {
                dVar.B(serialDescriptor, 7, kSerializerArr[7], googlePayExpressConfig.f96580h);
            }
        }

        public final List<C11996a> b() {
            return this.f96573a;
        }

        public final List<C11997b> c() {
            return this.f96574b;
        }

        public final List<CountryOfOrigin> d() {
            return this.f96580h;
        }

        public final FiscalCodeField e() {
            return this.f96578f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GooglePayExpressConfig)) {
                return false;
            }
            GooglePayExpressConfig googlePayExpressConfig = (GooglePayExpressConfig) obj;
            return C17542s.e(this.f96573a, googlePayExpressConfig.f96573a) && C17542s.e(this.f96574b, googlePayExpressConfig.f96574b) && C17542s.e(this.f96575c, googlePayExpressConfig.f96575c) && C17542s.e(this.f96576d, googlePayExpressConfig.f96576d) && C17542s.e(this.f96577e, googlePayExpressConfig.f96577e) && C17542s.e(this.f96578f, googlePayExpressConfig.f96578f) && C17542s.e(this.f96579g, googlePayExpressConfig.f96579g) && C17542s.e(this.f96580h, googlePayExpressConfig.f96580h);
        }

        public final String f() {
            return this.f96576d;
        }

        public final List<RequiredRecipientField> g() {
            return this.f96579g;
        }

        public final List<RequiredTaxField> h() {
            return this.f96577e;
        }

        public int hashCode() {
            int hashCode = ((((this.f96573a.hashCode() * 31) + this.f96574b.hashCode()) * 31) + this.f96575c.hashCode()) * 31;
            String str = this.f96576d;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<RequiredTaxField> list = this.f96577e;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            FiscalCodeField fiscalCodeField = this.f96578f;
            int hashCode4 = (hashCode3 + (fiscalCodeField == null ? 0 : fiscalCodeField.hashCode())) * 31;
            List<RequiredRecipientField> list2 = this.f96579g;
            int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<CountryOfOrigin> list3 = this.f96580h;
            if (list3 != null) {
                i10 = list3.hashCode();
            }
            return hashCode5 + i10;
        }

        public final String i() {
            return this.f96575c;
        }

        public String toString() {
            List<C11996a> list = this.f96573a;
            List<C11997b> list2 = this.f96574b;
            String str = this.f96575c;
            String str2 = this.f96576d;
            List<RequiredTaxField> list3 = this.f96577e;
            FiscalCodeField fiscalCodeField = this.f96578f;
            List<RequiredRecipientField> list4 = this.f96579g;
            List<CountryOfOrigin> list5 = this.f96580h;
            return "GooglePayExpressConfig(cardAuthMethods=" + list + ", cardNetworks=" + list2 + ", termsAndConditionsLink=" + str + ", privacyPolicyLink=" + str2 + ", requiredTaxFields=" + list3 + ", fiscalCodeField=" + fiscalCodeField + ", requiredRecipientFields=" + list4 + ", countriesOfOrigin=" + list5 + ")";
        }

        public GooglePayExpressConfig(List<? extends C11996a> list, List<? extends C11997b> list2, String str, String str2, List<RequiredTaxField> list3, FiscalCodeField fiscalCodeField, List<RequiredRecipientField> list4, List<CountryOfOrigin> list5) {
            C17542s.j(list, "cardAuthMethods");
            C17542s.j(list2, "cardNetworks");
            C17542s.j(str, "termsAndConditionsLink");
            this.f96573a = list;
            this.f96574b = list2;
            this.f96575c = str;
            this.f96576d = str2;
            this.f96577e = list3;
            this.f96578f = fiscalCodeField;
            this.f96579g = list4;
            this.f96580h = list5;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$a;", "", "", "name", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f96595a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96596b;

        public a(String str, String str2) {
            C17542s.j(str, "name");
            C17542s.j(str2, "link");
            this.f96595a = str;
            this.f96596b = str2;
        }

        public final String a() {
            return this.f96596b;
        }

        public final String b() {
            return this.f96595a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f96595a, aVar.f96595a) && C17542s.e(this.f96596b, aVar.f96596b);
        }

        public int hashCode() {
            return (this.f96595a.hashCode() * 31) + this.f96596b.hashCode();
        }

        public String toString() {
            String str = this.f96595a;
            String str2 = this.f96596b;
            return "AvailablePaymentOption(name=" + str + ", link=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "", "", "enabled", "", "regex", "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f96597a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96598b;

        public b(boolean z10, String str) {
            this.f96597a = z10;
            this.f96598b = str;
        }

        public final boolean a() {
            return this.f96597a;
        }

        public final String b() {
            return this.f96598b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f96597a == bVar.f96597a && C17542s.e(this.f96598b, bVar.f96598b);
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.f96597a) * 31;
            String str = this.f96598b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            boolean z10 = this.f96597a;
            String str = this.f96598b;
            return "CardHolderNameValidation(enabled=" + z10 + ", regex=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$c;", "", "<init>", "()V", "", "DEFAULT_PATTERN_DATE_AND_TIME", "Ljava/lang/String;", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$d;", "", "", "dayPattern", "monthPattern", "weekdayPattern", "timePattern", "weekdayAndDate", "dateAndMonth", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "f", "d", "e", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f96599a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96600b;

        /* renamed from: c  reason: collision with root package name */
        private final String f96601c;

        /* renamed from: d  reason: collision with root package name */
        private final String f96602d;

        /* renamed from: e  reason: collision with root package name */
        private final String f96603e;

        /* renamed from: f  reason: collision with root package name */
        private final String f96604f;

        public d(String str, String str2, String str3, String str4, String str5, String str6) {
            C17542s.j(str, "dayPattern");
            C17542s.j(str2, "monthPattern");
            C17542s.j(str3, "weekdayPattern");
            C17542s.j(str4, "timePattern");
            C17542s.j(str5, "weekdayAndDate");
            C17542s.j(str6, "dateAndMonth");
            this.f96599a = str;
            this.f96600b = str2;
            this.f96601c = str3;
            this.f96602d = str4;
            this.f96603e = str5;
            this.f96604f = str6;
        }

        public final String a() {
            return this.f96604f;
        }

        public final String b() {
            return this.f96599a;
        }

        public final String c() {
            return this.f96600b;
        }

        public final String d() {
            return this.f96602d;
        }

        public final String e() {
            return this.f96603e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f96599a, dVar.f96599a) && C17542s.e(this.f96600b, dVar.f96600b) && C17542s.e(this.f96601c, dVar.f96601c) && C17542s.e(this.f96602d, dVar.f96602d) && C17542s.e(this.f96603e, dVar.f96603e) && C17542s.e(this.f96604f, dVar.f96604f);
        }

        public final String f() {
            return this.f96601c;
        }

        public int hashCode() {
            return (((((((((this.f96599a.hashCode() * 31) + this.f96600b.hashCode()) * 31) + this.f96601c.hashCode()) * 31) + this.f96602d.hashCode()) * 31) + this.f96603e.hashCode()) * 31) + this.f96604f.hashCode();
        }

        public String toString() {
            String str = this.f96599a;
            String str2 = this.f96600b;
            String str3 = this.f96601c;
            String str4 = this.f96602d;
            String str5 = this.f96603e;
            String str6 = this.f96604f;
            return "DeliveryTimeSlotDatePatterns(dayPattern=" + str + ", monthPattern=" + str2 + ", weekdayPattern=" + str3 + ", timePattern=" + str4 + ", weekdayAndDate=" + str5 + ", dateAndMonth=" + str6 + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u0002\u0013\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$e;", "", "", "enabled", "Lcom/ingka/ikea/mcomsettings/MComConfig$e$a;", "card", "Lcom/ingka/ikea/mcomsettings/MComConfig$e$b;", "readMore", "<init>", "(ZLcom/ingka/ikea/mcomsettings/MComConfig$e$a;Lcom/ingka/ikea/mcomsettings/MComConfig$e$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lcom/ingka/ikea/mcomsettings/MComConfig$e$a;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$e$a;", "c", "Lcom/ingka/ikea/mcomsettings/MComConfig$e$b;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$e$b;", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f96605a;

        /* renamed from: b  reason: collision with root package name */
        private final a f96606b;

        /* renamed from: c  reason: collision with root package name */
        private final b f96607c;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$e$a;", "", "", "title", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final String f96608a;

            /* renamed from: b  reason: collision with root package name */
            private final String f96609b;

            public a(String str, String str2) {
                C17542s.j(str, "title");
                C17542s.j(str2, "description");
                this.f96608a = str;
                this.f96609b = str2;
            }

            public final String a() {
                return this.f96609b;
            }

            public final String b() {
                return this.f96608a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f96608a, aVar.f96608a) && C17542s.e(this.f96609b, aVar.f96609b);
            }

            public int hashCode() {
                return (this.f96608a.hashCode() * 31) + this.f96609b.hashCode();
            }

            public String toString() {
                String str = this.f96608a;
                String str2 = this.f96609b;
                return "Card(title=" + str + ", description=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$e$b;", "", "", "imageUrl", "title", "terms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            private final String f96610a;

            /* renamed from: b  reason: collision with root package name */
            private final String f96611b;

            /* renamed from: c  reason: collision with root package name */
            private final String f96612c;

            public b(String str, String str2, String str3) {
                C17542s.j(str, "imageUrl");
                C17542s.j(str2, "title");
                C17542s.j(str3, "terms");
                this.f96610a = str;
                this.f96611b = str2;
                this.f96612c = str3;
            }

            public final String a() {
                return this.f96610a;
            }

            public final String b() {
                return this.f96612c;
            }

            public final String c() {
                return this.f96611b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f96610a, bVar.f96610a) && C17542s.e(this.f96611b, bVar.f96611b) && C17542s.e(this.f96612c, bVar.f96612c);
            }

            public int hashCode() {
                return (((this.f96610a.hashCode() * 31) + this.f96611b.hashCode()) * 31) + this.f96612c.hashCode();
            }

            public String toString() {
                String str = this.f96610a;
                String str2 = this.f96611b;
                String str3 = this.f96612c;
                return "ReadMore(imageUrl=" + str + ", title=" + str2 + ", terms=" + str3 + ")";
            }
        }

        public e(boolean z10, a aVar, b bVar) {
            C17542s.j(aVar, "card");
            C17542s.j(bVar, "readMore");
            this.f96605a = z10;
            this.f96606b = aVar;
            this.f96607c = bVar;
        }

        public final a a() {
            return this.f96606b;
        }

        public final boolean b() {
            return this.f96605a;
        }

        public final b c() {
            return this.f96607c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f96605a == eVar.f96605a && C17542s.e(this.f96606b, eVar.f96606b) && C17542s.e(this.f96607c, eVar.f96607c);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f96605a) * 31) + this.f96606b.hashCode()) * 31) + this.f96607c.hashCode();
        }

        public String toString() {
            boolean z10 = this.f96605a;
            a aVar = this.f96606b;
            b bVar = this.f96607c;
            return "EmployeeDiscountConfig(enabled=" + z10 + ", card=" + aVar + ", readMore=" + bVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "", "", "id", "title", "description", "", "Lcom/ingka/ikea/mcomsettings/MComConfig$f$a;", "questions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private final String f96613a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96614b;

        /* renamed from: c  reason: collision with root package name */
        private final String f96615c;

        /* renamed from: d  reason: collision with root package name */
        private final List<a> f96616d;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0014\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$f$a;", "", "", "id", "title", "", "minRating", "maxRating", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "I", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private final String f96617a;

            /* renamed from: b  reason: collision with root package name */
            private final String f96618b;

            /* renamed from: c  reason: collision with root package name */
            private final int f96619c;

            /* renamed from: d  reason: collision with root package name */
            private final int f96620d;

            public a(String str, String str2, int i10, int i11) {
                C17542s.j(str, "id");
                C17542s.j(str2, "title");
                this.f96617a = str;
                this.f96618b = str2;
                this.f96619c = i10;
                this.f96620d = i11;
            }

            public final String a() {
                return this.f96617a;
            }

            public final int b() {
                return this.f96620d;
            }

            public final int c() {
                return this.f96619c;
            }

            public final String d() {
                return this.f96618b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f96617a, aVar.f96617a) && C17542s.e(this.f96618b, aVar.f96618b) && this.f96619c == aVar.f96619c && this.f96620d == aVar.f96620d;
            }

            public int hashCode() {
                return (((((this.f96617a.hashCode() * 31) + this.f96618b.hashCode()) * 31) + Integer.hashCode(this.f96619c)) * 31) + Integer.hashCode(this.f96620d);
            }

            public String toString() {
                String str = this.f96617a;
                String str2 = this.f96618b;
                int i10 = this.f96619c;
                int i11 = this.f96620d;
                return "SurveyQuestion(id=" + str + ", title=" + str2 + ", minRating=" + i10 + ", maxRating=" + i11 + ")";
            }
        }

        public f(String str, String str2, String str3, List<a> list) {
            C17542s.j(str, "id");
            C17542s.j(str2, "title");
            C17542s.j(list, "questions");
            this.f96613a = str;
            this.f96614b = str2;
            this.f96615c = str3;
            this.f96616d = list;
        }

        public final String a() {
            return this.f96615c;
        }

        public final String b() {
            return this.f96613a;
        }

        public final List<a> c() {
            return this.f96616d;
        }

        public final String d() {
            return this.f96614b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return C17542s.e(this.f96613a, fVar.f96613a) && C17542s.e(this.f96614b, fVar.f96614b) && C17542s.e(this.f96615c, fVar.f96615c) && C17542s.e(this.f96616d, fVar.f96616d);
        }

        public int hashCode() {
            int hashCode = ((this.f96613a.hashCode() * 31) + this.f96614b.hashCode()) * 31;
            String str = this.f96615c;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f96616d.hashCode();
        }

        public String toString() {
            String str = this.f96613a;
            String str2 = this.f96614b;
            String str3 = this.f96615c;
            List<a> list = this.f96616d;
            return "MComSurveyConfig(id=" + str + ", title=" + str2 + ", description=" + str3 + ", questions=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ingka/ikea/mcomsettings/MComConfig$g;", "", "", "paymentBrand", "url", "localizedText", "localizedClickableText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "getLocalizedClickableText", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final String f96621a;

        /* renamed from: b  reason: collision with root package name */
        private final String f96622b;

        /* renamed from: c  reason: collision with root package name */
        private final String f96623c;

        /* renamed from: d  reason: collision with root package name */
        private final String f96624d;

        public g(String str, String str2, String str3, String str4) {
            C17542s.j(str, PaymentDetailsUiComponentContainer.ARG_PAYMENT_BRAND);
            C17542s.j(str2, "url");
            C17542s.j(str3, "localizedText");
            C17542s.j(str4, "localizedClickableText");
            this.f96621a = str;
            this.f96622b = str2;
            this.f96623c = str3;
            this.f96624d = str4;
        }

        public final String a() {
            return this.f96623c;
        }

        public final String b() {
            return this.f96621a;
        }

        public final String c() {
            return this.f96622b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return C17542s.e(this.f96621a, gVar.f96621a) && C17542s.e(this.f96622b, gVar.f96622b) && C17542s.e(this.f96623c, gVar.f96623c) && C17542s.e(this.f96624d, gVar.f96624d);
        }

        public int hashCode() {
            return (((((this.f96621a.hashCode() * 31) + this.f96622b.hashCode()) * 31) + this.f96623c.hashCode()) * 31) + this.f96624d.hashCode();
        }

        public String toString() {
            String str = this.f96621a;
            String str2 = this.f96622b;
            String str3 = this.f96623c;
            String str4 = this.f96624d;
            return "PaymentTermsAndCondition(paymentBrand=" + str + ", url=" + str2 + ", localizedText=" + str3 + ", localizedClickableText=" + str4 + ")";
        }
    }

    public MComConfig(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, List<g> list, d dVar, b bVar, boolean z13, List<a> list2, boolean z14, String str4, f fVar, f fVar2, boolean z15, e eVar, boolean z16, GooglePayExpressConfig googlePayExpressConfig, Double d10) {
        String str5 = str4;
        C17542s.j(str, "retailCode");
        C17542s.j(str2, "languageCode");
        C17542s.j(list, "paymentTermsAndConditionHolders");
        C17542s.j(dVar, "deliveryTimeSlotDatePatternsHolder");
        C17542s.j(str5, "dateAndTimePresentationPattern");
        this.f96552a = str;
        this.f96553b = str2;
        this.f96554c = z10;
        this.f96555d = z11;
        this.f96556e = z12;
        this.f96557f = str3;
        this.f96558g = list;
        this.f96559h = dVar;
        this.f96560i = bVar;
        this.f96561j = z13;
        this.f96562k = list2;
        this.f96563l = z14;
        this.f96564m = str5;
        this.f96565n = fVar;
        this.f96566o = fVar2;
        this.f96567p = z15;
        this.f96568q = eVar;
        this.f96569r = z16;
        this.f96570s = googlePayExpressConfig;
        this.f96571t = d10;
    }

    public final f a() {
        return this.f96566o;
    }

    public final List<a> b() {
        return this.f96562k;
    }

    public final b c() {
        return this.f96560i;
    }

    public final f d() {
        return this.f96565n;
    }

    public final String e() {
        return this.f96557f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MComConfig)) {
            return false;
        }
        MComConfig mComConfig = (MComConfig) obj;
        return C17542s.e(this.f96552a, mComConfig.f96552a) && C17542s.e(this.f96553b, mComConfig.f96553b) && this.f96554c == mComConfig.f96554c && this.f96555d == mComConfig.f96555d && this.f96556e == mComConfig.f96556e && C17542s.e(this.f96557f, mComConfig.f96557f) && C17542s.e(this.f96558g, mComConfig.f96558g) && C17542s.e(this.f96559h, mComConfig.f96559h) && C17542s.e(this.f96560i, mComConfig.f96560i) && this.f96561j == mComConfig.f96561j && C17542s.e(this.f96562k, mComConfig.f96562k) && this.f96563l == mComConfig.f96563l && C17542s.e(this.f96564m, mComConfig.f96564m) && C17542s.e(this.f96565n, mComConfig.f96565n) && C17542s.e(this.f96566o, mComConfig.f96566o) && this.f96567p == mComConfig.f96567p && C17542s.e(this.f96568q, mComConfig.f96568q) && this.f96569r == mComConfig.f96569r && C17542s.e(this.f96570s, mComConfig.f96570s) && C17542s.e(this.f96571t, mComConfig.f96571t);
    }

    public final String f() {
        return this.f96564m;
    }

    public final d g() {
        return this.f96559h;
    }

    public final boolean h() {
        return this.f96554c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f96552a.hashCode() * 31) + this.f96553b.hashCode()) * 31) + Boolean.hashCode(this.f96554c)) * 31) + Boolean.hashCode(this.f96555d)) * 31) + Boolean.hashCode(this.f96556e)) * 31;
        String str = this.f96557f;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f96558g.hashCode()) * 31) + this.f96559h.hashCode()) * 31;
        b bVar = this.f96560i;
        int hashCode3 = (((hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31) + Boolean.hashCode(this.f96561j)) * 31;
        List<a> list = this.f96562k;
        int hashCode4 = (((((hashCode3 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.f96563l)) * 31) + this.f96564m.hashCode()) * 31;
        f fVar = this.f96565n;
        int hashCode5 = (hashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f fVar2 = this.f96566o;
        int hashCode6 = (((hashCode5 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31) + Boolean.hashCode(this.f96567p)) * 31;
        e eVar = this.f96568q;
        int hashCode7 = (((hashCode6 + (eVar == null ? 0 : eVar.hashCode())) * 31) + Boolean.hashCode(this.f96569r)) * 31;
        GooglePayExpressConfig googlePayExpressConfig = this.f96570s;
        int hashCode8 = (hashCode7 + (googlePayExpressConfig == null ? 0 : googlePayExpressConfig.hashCode())) * 31;
        Double d10 = this.f96571t;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return hashCode8 + i10;
    }

    public final e i() {
        return this.f96568q;
    }

    public final GooglePayExpressConfig j() {
        return this.f96570s;
    }

    public final List<g> k() {
        return this.f96558g;
    }

    public final boolean l() {
        return this.f96563l;
    }

    public final Double m() {
        return this.f96571t;
    }

    public final boolean n() {
        return this.f96567p;
    }

    public final boolean o() {
        return this.f96561j;
    }

    public final boolean p() {
        return this.f96569r;
    }

    public final boolean q() {
        return this.f96556e;
    }

    public final boolean r() {
        return this.f96555d;
    }

    public String toString() {
        String str = this.f96552a;
        String str2 = this.f96553b;
        boolean z10 = this.f96554c;
        boolean z11 = this.f96555d;
        boolean z12 = this.f96556e;
        String str3 = this.f96557f;
        List<g> list = this.f96558g;
        d dVar = this.f96559h;
        b bVar = this.f96560i;
        boolean z13 = this.f96561j;
        List<a> list2 = this.f96562k;
        boolean z14 = this.f96563l;
        String str4 = this.f96564m;
        f fVar = this.f96565n;
        f fVar2 = this.f96566o;
        boolean z15 = this.f96567p;
        e eVar = this.f96568q;
        boolean z16 = this.f96569r;
        GooglePayExpressConfig googlePayExpressConfig = this.f96570s;
        Double d10 = this.f96571t;
        return "MComConfig(retailCode=" + str + ", languageCode=" + str2 + ", discountCodeEnabled=" + z10 + ", showTotalExclTaxInCartAndCheckout=" + z11 + ", showPriceViewInPaymentExpanded=" + z12 + ", contactUri=" + str3 + ", paymentTermsAndConditionHolders=" + list + ", deliveryTimeSlotDatePatternsHolder=" + dVar + ", cardHolderInAci=" + bVar + ", showOrderSummaryInCheckoutExpanded=" + z13 + ", availablePaymentOptionHolders=" + list2 + ", pickupDisabled=" + z14 + ", dateAndTimePresentationPattern=" + str4 + ", checkoutSurveyConfig=" + fVar + ", abortCheckoutSurveyConfig=" + fVar2 + ", showMaterialsInCart=" + z15 + ", employeeDiscount=" + eVar + ", showPaymentInformationSectionCheckout=" + z16 + ", googlePayExpressConfig=" + googlePayExpressConfig + ", remoteSalesCartThreshold=" + d10 + ")";
    }
}
