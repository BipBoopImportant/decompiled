package vv;

import com.ingka.ikea.mcomsettings.MComConfig;
import com.ingka.ikea.mcomsettings.impl.AvailablePaymentOptionHolder;
import com.ingka.ikea.mcomsettings.impl.CardHolderNameValidation;
import com.ingka.ikea.mcomsettings.impl.DeliveryTimeSlotDatePatternsHolder;
import com.ingka.ikea.mcomsettings.impl.EmployeeDiscountConfig;
import com.ingka.ikea.mcomsettings.impl.PaymentTermsAndConditionHolder;
import com.ingka.ikea.mcomsettings.impl.db.MComSurveyConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b+\b\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010$R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00103R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b8\u0010,\u001a\u0004\b6\u0010$R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\f\n\u0004\b2\u0010=\u001a\u0004\b9\u0010>R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b.\u0010AR\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\bC\u00103R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n8\u0006X\u0004¢\u0006\f\n\u0004\b/\u0010:\u001a\u0004\b0\u0010<R\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\bD\u00103R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\bD\u0010,\u001a\u0004\b8\u0010$R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b4\u0010GR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006X\u0004¢\u0006\f\n\u0004\b-\u0010F\u001a\u0004\b+\u0010GR\u001a\u0010\u0019\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\bH\u00103R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0004¢\u0006\f\n\u0004\bC\u0010I\u001a\u0004\b?\u0010JR\u001a\u0010\u001c\u001a\u00020\u00058\u0006X\u0004¢\u0006\f\n\u0004\bK\u00101\u001a\u0004\bK\u00103R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0004¢\u0006\f\n\u0004\b7\u0010L\u001a\u0004\bB\u0010MR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0004¢\u0006\f\n\u0004\b5\u0010N\u001a\u0004\bE\u0010O¨\u0006P"}, d2 = {"Lvv/c;", "", "", "retailCode", "languageCode", "", "discountCodeEnabled", "showTotalExclTaxInCartAndCheckout", "showPriceViewInPaymentExpanded", "contactUri", "", "Lcom/ingka/ikea/mcomsettings/impl/PaymentTermsAndConditionHolder;", "paymentTermsAndConditionHolders", "Lcom/ingka/ikea/mcomsettings/impl/DeliveryTimeSlotDatePatternsHolder;", "deliveryTimeSlotDatePatternsHolder", "Lcom/ingka/ikea/mcomsettings/impl/CardHolderNameValidation;", "aciCardHolderNameValidation", "showOrderSummaryInCheckoutExpanded", "Lcom/ingka/ikea/mcomsettings/impl/AvailablePaymentOptionHolder;", "availablePaymentOptionHolders", "pickupDisabled", "dateAndTimePresentationPattern", "Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig;", "checkoutSurveyConfig", "abortCheckoutSurveyConfig", "showMaterialsInCart", "Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig;", "employeeDiscount", "showPaymentInformationSectionCheckout", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "googlePayExpressConfig", "", "remoteSalesCartThreshold", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/util/List;Lcom/ingka/ikea/mcomsettings/impl/DeliveryTimeSlotDatePatternsHolder;Lcom/ingka/ikea/mcomsettings/impl/CardHolderNameValidation;ZLjava/util/List;ZLjava/lang/String;Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig;Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig;ZLcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig;ZLcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;Ljava/lang/Double;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "o", "b", "k", "c", "Z", "h", "()Z", "d", "t", "e", "s", "f", "g", "Ljava/util/List;", "l", "()Ljava/util/List;", "Lcom/ingka/ikea/mcomsettings/impl/DeliveryTimeSlotDatePatternsHolder;", "()Lcom/ingka/ikea/mcomsettings/impl/DeliveryTimeSlotDatePatternsHolder;", "i", "Lcom/ingka/ikea/mcomsettings/impl/CardHolderNameValidation;", "()Lcom/ingka/ikea/mcomsettings/impl/CardHolderNameValidation;", "j", "q", "m", "n", "Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig;", "()Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig;", "p", "Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig;", "()Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig;", "r", "Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$GooglePayExpressConfig;", "Ljava/lang/Double;", "()Ljava/lang/Double;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vv.c  reason: case insensitive filesystem */
public final class C12270c {

    /* renamed from: a  reason: collision with root package name */
    private final String f105726a;

    /* renamed from: b  reason: collision with root package name */
    private final String f105727b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f105728c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f105729d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f105730e;

    /* renamed from: f  reason: collision with root package name */
    private final String f105731f;

    /* renamed from: g  reason: collision with root package name */
    private final List<PaymentTermsAndConditionHolder> f105732g;

    /* renamed from: h  reason: collision with root package name */
    private final DeliveryTimeSlotDatePatternsHolder f105733h;

    /* renamed from: i  reason: collision with root package name */
    private final CardHolderNameValidation f105734i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f105735j;

    /* renamed from: k  reason: collision with root package name */
    private final List<AvailablePaymentOptionHolder> f105736k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f105737l;

    /* renamed from: m  reason: collision with root package name */
    private final String f105738m;

    /* renamed from: n  reason: collision with root package name */
    private final MComSurveyConfig f105739n;

    /* renamed from: o  reason: collision with root package name */
    private final MComSurveyConfig f105740o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f105741p;

    /* renamed from: q  reason: collision with root package name */
    private final EmployeeDiscountConfig f105742q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f105743r;

    /* renamed from: s  reason: collision with root package name */
    private final MComConfig.GooglePayExpressConfig f105744s;

    /* renamed from: t  reason: collision with root package name */
    private final Double f105745t;

    public C12270c(String str, String str2, boolean z10, boolean z11, boolean z12, String str3, List<PaymentTermsAndConditionHolder> list, DeliveryTimeSlotDatePatternsHolder deliveryTimeSlotDatePatternsHolder, CardHolderNameValidation cardHolderNameValidation, boolean z13, List<AvailablePaymentOptionHolder> list2, boolean z14, String str4, MComSurveyConfig mComSurveyConfig, MComSurveyConfig mComSurveyConfig2, boolean z15, EmployeeDiscountConfig employeeDiscountConfig, boolean z16, MComConfig.GooglePayExpressConfig googlePayExpressConfig, Double d10) {
        String str5 = str4;
        C17542s.j(str, "retailCode");
        C17542s.j(str2, "languageCode");
        C17542s.j(list, "paymentTermsAndConditionHolders");
        C17542s.j(deliveryTimeSlotDatePatternsHolder, "deliveryTimeSlotDatePatternsHolder");
        C17542s.j(str5, "dateAndTimePresentationPattern");
        this.f105726a = str;
        this.f105727b = str2;
        this.f105728c = z10;
        this.f105729d = z11;
        this.f105730e = z12;
        this.f105731f = str3;
        this.f105732g = list;
        this.f105733h = deliveryTimeSlotDatePatternsHolder;
        this.f105734i = cardHolderNameValidation;
        this.f105735j = z13;
        this.f105736k = list2;
        this.f105737l = z14;
        this.f105738m = str5;
        this.f105739n = mComSurveyConfig;
        this.f105740o = mComSurveyConfig2;
        this.f105741p = z15;
        this.f105742q = employeeDiscountConfig;
        this.f105743r = z16;
        this.f105744s = googlePayExpressConfig;
        this.f105745t = d10;
    }

    public final MComSurveyConfig a() {
        return this.f105740o;
    }

    public final CardHolderNameValidation b() {
        return this.f105734i;
    }

    public final List<AvailablePaymentOptionHolder> c() {
        return this.f105736k;
    }

    public final MComSurveyConfig d() {
        return this.f105739n;
    }

    public final String e() {
        return this.f105731f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12270c)) {
            return false;
        }
        C12270c cVar = (C12270c) obj;
        return C17542s.e(this.f105726a, cVar.f105726a) && C17542s.e(this.f105727b, cVar.f105727b) && this.f105728c == cVar.f105728c && this.f105729d == cVar.f105729d && this.f105730e == cVar.f105730e && C17542s.e(this.f105731f, cVar.f105731f) && C17542s.e(this.f105732g, cVar.f105732g) && C17542s.e(this.f105733h, cVar.f105733h) && C17542s.e(this.f105734i, cVar.f105734i) && this.f105735j == cVar.f105735j && C17542s.e(this.f105736k, cVar.f105736k) && this.f105737l == cVar.f105737l && C17542s.e(this.f105738m, cVar.f105738m) && C17542s.e(this.f105739n, cVar.f105739n) && C17542s.e(this.f105740o, cVar.f105740o) && this.f105741p == cVar.f105741p && C17542s.e(this.f105742q, cVar.f105742q) && this.f105743r == cVar.f105743r && C17542s.e(this.f105744s, cVar.f105744s) && C17542s.e(this.f105745t, cVar.f105745t);
    }

    public final String f() {
        return this.f105738m;
    }

    public final DeliveryTimeSlotDatePatternsHolder g() {
        return this.f105733h;
    }

    public final boolean h() {
        return this.f105728c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f105726a.hashCode() * 31) + this.f105727b.hashCode()) * 31) + Boolean.hashCode(this.f105728c)) * 31) + Boolean.hashCode(this.f105729d)) * 31) + Boolean.hashCode(this.f105730e)) * 31;
        String str = this.f105731f;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f105732g.hashCode()) * 31) + this.f105733h.hashCode()) * 31;
        CardHolderNameValidation cardHolderNameValidation = this.f105734i;
        int hashCode3 = (((hashCode2 + (cardHolderNameValidation == null ? 0 : cardHolderNameValidation.hashCode())) * 31) + Boolean.hashCode(this.f105735j)) * 31;
        List<AvailablePaymentOptionHolder> list = this.f105736k;
        int hashCode4 = (((((hashCode3 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.f105737l)) * 31) + this.f105738m.hashCode()) * 31;
        MComSurveyConfig mComSurveyConfig = this.f105739n;
        int hashCode5 = (hashCode4 + (mComSurveyConfig == null ? 0 : mComSurveyConfig.hashCode())) * 31;
        MComSurveyConfig mComSurveyConfig2 = this.f105740o;
        int hashCode6 = (((hashCode5 + (mComSurveyConfig2 == null ? 0 : mComSurveyConfig2.hashCode())) * 31) + Boolean.hashCode(this.f105741p)) * 31;
        EmployeeDiscountConfig employeeDiscountConfig = this.f105742q;
        int hashCode7 = (((hashCode6 + (employeeDiscountConfig == null ? 0 : employeeDiscountConfig.hashCode())) * 31) + Boolean.hashCode(this.f105743r)) * 31;
        MComConfig.GooglePayExpressConfig googlePayExpressConfig = this.f105744s;
        int hashCode8 = (hashCode7 + (googlePayExpressConfig == null ? 0 : googlePayExpressConfig.hashCode())) * 31;
        Double d10 = this.f105745t;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return hashCode8 + i10;
    }

    public final EmployeeDiscountConfig i() {
        return this.f105742q;
    }

    public final MComConfig.GooglePayExpressConfig j() {
        return this.f105744s;
    }

    public final String k() {
        return this.f105727b;
    }

    public final List<PaymentTermsAndConditionHolder> l() {
        return this.f105732g;
    }

    public final boolean m() {
        return this.f105737l;
    }

    public final Double n() {
        return this.f105745t;
    }

    public final String o() {
        return this.f105726a;
    }

    public final boolean p() {
        return this.f105741p;
    }

    public final boolean q() {
        return this.f105735j;
    }

    public final boolean r() {
        return this.f105743r;
    }

    public final boolean s() {
        return this.f105730e;
    }

    public final boolean t() {
        return this.f105729d;
    }

    public String toString() {
        String str = this.f105726a;
        String str2 = this.f105727b;
        boolean z10 = this.f105728c;
        boolean z11 = this.f105729d;
        boolean z12 = this.f105730e;
        String str3 = this.f105731f;
        List<PaymentTermsAndConditionHolder> list = this.f105732g;
        DeliveryTimeSlotDatePatternsHolder deliveryTimeSlotDatePatternsHolder = this.f105733h;
        CardHolderNameValidation cardHolderNameValidation = this.f105734i;
        boolean z13 = this.f105735j;
        List<AvailablePaymentOptionHolder> list2 = this.f105736k;
        boolean z14 = this.f105737l;
        String str4 = this.f105738m;
        MComSurveyConfig mComSurveyConfig = this.f105739n;
        MComSurveyConfig mComSurveyConfig2 = this.f105740o;
        boolean z15 = this.f105741p;
        EmployeeDiscountConfig employeeDiscountConfig = this.f105742q;
        boolean z16 = this.f105743r;
        MComConfig.GooglePayExpressConfig googlePayExpressConfig = this.f105744s;
        Double d10 = this.f105745t;
        return "MComConfigHolder(retailCode=" + str + ", languageCode=" + str2 + ", discountCodeEnabled=" + z10 + ", showTotalExclTaxInCartAndCheckout=" + z11 + ", showPriceViewInPaymentExpanded=" + z12 + ", contactUri=" + str3 + ", paymentTermsAndConditionHolders=" + list + ", deliveryTimeSlotDatePatternsHolder=" + deliveryTimeSlotDatePatternsHolder + ", aciCardHolderNameValidation=" + cardHolderNameValidation + ", showOrderSummaryInCheckoutExpanded=" + z13 + ", availablePaymentOptionHolders=" + list2 + ", pickupDisabled=" + z14 + ", dateAndTimePresentationPattern=" + str4 + ", checkoutSurveyConfig=" + mComSurveyConfig + ", abortCheckoutSurveyConfig=" + mComSurveyConfig2 + ", showMaterialsInCart=" + z15 + ", employeeDiscount=" + employeeDiscountConfig + ", showPaymentInformationSectionCheckout=" + z16 + ", googlePayExpressConfig=" + googlePayExpressConfig + ", remoteSalesCartThreshold=" + d10 + ")";
    }
}
