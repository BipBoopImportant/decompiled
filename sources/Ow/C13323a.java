package Ow;

import Nn.D;
import android.content.ComponentName;
import android.content.Context;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.oppwa.mobile.connect.checkout.meta.CheckoutBrandDetectionType;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.provider.Connect;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0012J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LOw/a;", "", "Landroid/content/Context;", "context", "Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;", "providerMode", "LOw/a$a;", "input", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutSettings;", "b", "(Landroid/content/Context;Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;LOw/a$a;)Lcom/oppwa/mobile/connect/checkout/meta/CheckoutSettings;", "Landroid/content/ComponentName;", "senderComponentName", "", "aciCheckoutId", "", "isValid", "LXH/N;", "a", "(Landroid/content/Context;Landroid/content/ComponentName;Ljava/lang/String;Z)V", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ow.a  reason: case insensitive filesystem */
public interface C13323a {

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b!\b\b\u0018\u00002\u00020\u0001:\u0001 Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b1\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\"\u00102\u001a\u0004\b \u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b1\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b/\u00107\u001a\u0004\b#\u00108R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b5\u00109\u001a\u0004\b*\u0010:¨\u0006;"}, d2 = {"LOw/a$a;", "", "", "retailCode", "checkoutId", "gatewayMerchantId", "currency", "", "leftToPay", "", "paymentBrandsSet", "LNn/D;", "selectedPaymentOption", "selectedBrand", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutBrandDetectionType;", "brandDetection", "", "skipCvv", "Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "cardHolderNameValidation", "LOw/a$a$a;", "googlePayExpressSettings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/util/Set;LNn/D;Ljava/lang/String;Lcom/oppwa/mobile/connect/checkout/meta/CheckoutBrandDetectionType;ZLcom/ingka/ikea/mcomsettings/MComConfig$b;LOw/a$a$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "c", "e", "d", "D", "g", "()D", "f", "Ljava/util/Set;", "h", "()Ljava/util/Set;", "LNn/D;", "k", "()LNn/D;", "j", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutBrandDetectionType;", "()Lcom/oppwa/mobile/connect/checkout/meta/CheckoutBrandDetectionType;", "Z", "l", "()Z", "Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "()Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "LOw/a$a$a;", "()LOw/a$a$a;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ow.a$a  reason: collision with other inner class name */
    public static final class C2787a {

        /* renamed from: a  reason: collision with root package name */
        private final String f113584a;

        /* renamed from: b  reason: collision with root package name */
        private final String f113585b;

        /* renamed from: c  reason: collision with root package name */
        private final String f113586c;

        /* renamed from: d  reason: collision with root package name */
        private final String f113587d;

        /* renamed from: e  reason: collision with root package name */
        private final double f113588e;

        /* renamed from: f  reason: collision with root package name */
        private final Set<String> f113589f;

        /* renamed from: g  reason: collision with root package name */
        private final D f113590g;

        /* renamed from: h  reason: collision with root package name */
        private final String f113591h;

        /* renamed from: i  reason: collision with root package name */
        private final CheckoutBrandDetectionType f113592i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f113593j;

        /* renamed from: k  reason: collision with root package name */
        private final MComConfig.b f113594k;

        /* renamed from: l  reason: collision with root package name */
        private final C2788a f113595l;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LOw/a$a$a;", "", "", "isShippingAddressRequired", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ow.a$a$a  reason: collision with other inner class name */
        public static final class C2788a {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f113596a;

            public C2788a(boolean z10) {
                this.f113596a = z10;
            }

            public final boolean a() {
                return this.f113596a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2788a) && this.f113596a == ((C2788a) obj).f113596a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f113596a);
            }

            public String toString() {
                boolean z10 = this.f113596a;
                return "GooglePayExpressSettings(isShippingAddressRequired=" + z10 + ")";
            }
        }

        public C2787a(String str, String str2, String str3, String str4, double d10, Set<String> set, D d11, String str5, CheckoutBrandDetectionType checkoutBrandDetectionType, boolean z10, MComConfig.b bVar, C2788a aVar) {
            C17542s.j(str, "retailCode");
            C17542s.j(str2, "checkoutId");
            C17542s.j(str4, "currency");
            C17542s.j(set, "paymentBrandsSet");
            C17542s.j(d11, "selectedPaymentOption");
            C17542s.j(str5, "selectedBrand");
            this.f113584a = str;
            this.f113585b = str2;
            this.f113586c = str3;
            this.f113587d = str4;
            this.f113588e = d10;
            this.f113589f = set;
            this.f113590g = d11;
            this.f113591h = str5;
            this.f113592i = checkoutBrandDetectionType;
            this.f113593j = z10;
            this.f113594k = bVar;
            this.f113595l = aVar;
        }

        public final CheckoutBrandDetectionType a() {
            return this.f113592i;
        }

        public final MComConfig.b b() {
            return this.f113594k;
        }

        public final String c() {
            return this.f113585b;
        }

        public final String d() {
            return this.f113587d;
        }

        public final String e() {
            return this.f113586c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2787a)) {
                return false;
            }
            C2787a aVar = (C2787a) obj;
            return C17542s.e(this.f113584a, aVar.f113584a) && C17542s.e(this.f113585b, aVar.f113585b) && C17542s.e(this.f113586c, aVar.f113586c) && C17542s.e(this.f113587d, aVar.f113587d) && Double.compare(this.f113588e, aVar.f113588e) == 0 && C17542s.e(this.f113589f, aVar.f113589f) && C17542s.e(this.f113590g, aVar.f113590g) && C17542s.e(this.f113591h, aVar.f113591h) && this.f113592i == aVar.f113592i && this.f113593j == aVar.f113593j && C17542s.e(this.f113594k, aVar.f113594k) && C17542s.e(this.f113595l, aVar.f113595l);
        }

        public final C2788a f() {
            return this.f113595l;
        }

        public final double g() {
            return this.f113588e;
        }

        public final Set<String> h() {
            return this.f113589f;
        }

        public int hashCode() {
            int hashCode = ((this.f113584a.hashCode() * 31) + this.f113585b.hashCode()) * 31;
            String str = this.f113586c;
            int i10 = 0;
            int hashCode2 = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f113587d.hashCode()) * 31) + Double.hashCode(this.f113588e)) * 31) + this.f113589f.hashCode()) * 31) + this.f113590g.hashCode()) * 31) + this.f113591h.hashCode()) * 31;
            CheckoutBrandDetectionType checkoutBrandDetectionType = this.f113592i;
            int hashCode3 = (((hashCode2 + (checkoutBrandDetectionType == null ? 0 : checkoutBrandDetectionType.hashCode())) * 31) + Boolean.hashCode(this.f113593j)) * 31;
            MComConfig.b bVar = this.f113594k;
            int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            C2788a aVar = this.f113595l;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return hashCode4 + i10;
        }

        public final String i() {
            return this.f113584a;
        }

        public final String j() {
            return this.f113591h;
        }

        public final D k() {
            return this.f113590g;
        }

        public final boolean l() {
            return this.f113593j;
        }

        public String toString() {
            String str = this.f113584a;
            String str2 = this.f113585b;
            String str3 = this.f113586c;
            String str4 = this.f113587d;
            double d10 = this.f113588e;
            Set<String> set = this.f113589f;
            D d11 = this.f113590g;
            String str5 = this.f113591h;
            CheckoutBrandDetectionType checkoutBrandDetectionType = this.f113592i;
            boolean z10 = this.f113593j;
            MComConfig.b bVar = this.f113594k;
            C2788a aVar = this.f113595l;
            return "SettingsInput(retailCode=" + str + ", checkoutId=" + str2 + ", gatewayMerchantId=" + str3 + ", currency=" + str4 + ", leftToPay=" + d10 + ", paymentBrandsSet=" + set + ", selectedPaymentOption=" + d11 + ", selectedBrand=" + str5 + ", brandDetection=" + checkoutBrandDetectionType + ", skipCvv=" + z10 + ", cardHolderNameValidation=" + bVar + ", googlePayExpressSettings=" + aVar + ")";
        }
    }

    void a(Context context, ComponentName componentName, String str, boolean z10);

    CheckoutSettings b(Context context, Connect.ProviderMode providerMode, C2787a aVar);
}
