package com.oppwa.mobile.connect.checkout.dialog;

import android.text.TextUtils;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.InputLayout;
import com.oppwa.mobile.connect.checkout.meta.CheckoutValidationResult;
import com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import com.oppwa.mobile.connect.payment.ikanooi.IkanoOiPaymentParams;
import com.oppwa.mobile.connect.utils.StringUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.q  reason: case insensitive filesystem */
class C14099q {

    /* renamed from: a  reason: collision with root package name */
    private static Pattern f121287a;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$e */
    class e implements InputLayout.c {
        e() {
        }

        public int a() {
            return 0;
        }

        public int a(CharSequence charSequence) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.US);
            simpleDateFormat.setLenient(false);
            try {
                simpleDateFormat.parse(charSequence.toString());
                return -1;
            } catch (ParseException unused) {
                return R.string.checkout_error_date_of_birth;
            }
        }

        public CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener) {
            return CheckoutValidationResult.DEFAULT;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$n */
    static class n {

        /* renamed from: a  reason: collision with root package name */
        private final Pattern f121298a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f121299b;

        /* renamed from: c  reason: collision with root package name */
        private final int f121300c;

        n(Pattern pattern, boolean z10, int i10) {
            this.f121298a = pattern;
            this.f121299b = z10;
            this.f121300c = i10;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f121300c;
        }

        /* access modifiers changed from: package-private */
        public Pattern b() {
            return this.f121298a;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f121299b;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$o */
    static class o {

        /* renamed from: a  reason: collision with root package name */
        private final int f121301a;

        /* renamed from: b  reason: collision with root package name */
        private final int f121302b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f121303c;

        o(int i10, int i11) {
            this.f121301a = i10;
            this.f121302b = i11;
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z10) {
            this.f121303c = z10;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f121301a;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f121303c;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f121302b;
        }
    }

    static InputLayout.c b(int i10) {
        return new i(i10);
    }

    static InputLayout.c c() {
        return new b();
    }

    static InputLayout.c d() {
        return new e();
    }

    static InputLayout.c e() {
        return new f();
    }

    static InputLayout.c f() {
        return a(R.string.checkout_helper_country_code);
    }

    static InputLayout.c g() {
        return new k();
    }

    static InputLayout.c h() {
        return new c();
    }

    /* access modifiers changed from: private */
    public static Pattern i() {
        if (f121287a == null) {
            f121287a = Pattern.compile("[0-9]{2}/[0-9]{2,4}");
        }
        return f121287a;
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$d */
    class d implements InputLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f121290a;

        d(int i10) {
            this.f121290a = i10;
        }

        public int a(CharSequence charSequence) {
            if (TextUtils.isEmpty(charSequence)) {
                return a();
            }
            return -1;
        }

        public CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener) {
            return CheckoutValidationResult.DEFAULT;
        }

        public int a() {
            return this.f121290a;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$f */
    class f implements InputLayout.c {
        f() {
        }

        public int a(CharSequence charSequence) {
            if (!CardPaymentParams.isHolderValid(charSequence.toString())) {
                return R.string.checkout_error_card_holder_invalid;
            }
            return -1;
        }

        public CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener) {
            if (iPaymentFormListener != null) {
                return iPaymentFormListener.onCardHolderValidate(str);
            }
            return CheckoutValidationResult.DEFAULT;
        }

        public int a() {
            return R.string.checkout_error_card_holder_invalid;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$l */
    class l implements InputLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f121297a;

        l(String str) {
            this.f121297a = str;
        }

        public int a(CharSequence charSequence) {
            if (!IkanoOiPaymentParams.isNationalIdentifierValid(charSequence.toString(), this.f121297a)) {
                return a();
            }
            return -1;
        }

        public CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener) {
            return CheckoutValidationResult.DEFAULT;
        }

        public int a() {
            return R.string.checkout_error_national_identifier_invalid;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$m */
    class m implements InputLayout.c {
        m() {
        }

        public int a(CharSequence charSequence) {
            if (!BankAccountPaymentParams.isHolderValid(charSequence.toString())) {
                return a();
            }
            return -1;
        }

        public CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener) {
            return CheckoutValidationResult.DEFAULT;
        }

        public int a() {
            return R.string.checkout_error_account_holder_invalid;
        }
    }

    static InputLayout.c a(C14113v vVar, n nVar) {
        return new g(vVar, nVar);
    }

    static InputLayout.c b() {
        return new m();
    }

    static InputLayout.c c(int i10) {
        return new d(i10);
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$i */
    class i implements InputLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f121295a;

        i(int i10) {
            this.f121295a = i10;
        }

        public int a(CharSequence charSequence) {
            int length = charSequence.length();
            int i10 = this.f121295a;
            if (length == i10) {
                return -1;
            }
            if (i10 == 4) {
                return R.string.checkout_error_security_code_invalid_amex;
            }
            return R.string.checkout_error_security_code_invalid;
        }

        public CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener) {
            return CheckoutValidationResult.DEFAULT;
        }

        public int a() {
            return R.string.checkout_error_security_code_invalid;
        }
    }

    static InputLayout.c a(C14081k kVar, o oVar) {
        return new h(oVar, kVar);
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$k */
    class k implements InputLayout.c {
        k() {
        }

        public int a(CharSequence charSequence) {
            StringBuilder sb2 = new StringBuilder(charSequence);
            StringUtils.replaceNonstandardDigits(sb2);
            if (!CardPaymentParams.isMobilePhoneNumberValid(sb2.toString())) {
                return R.string.checkout_error_mobile_phone_number_invalid;
            }
            return -1;
        }

        public CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener) {
            return CheckoutValidationResult.DEFAULT;
        }

        public int a() {
            return R.string.checkout_error_mobile_phone_number_invalid;
        }
    }

    static InputLayout.c a(int i10) {
        return new j(i10);
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$j */
    class j implements InputLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f121296a;

        j(int i10) {
            this.f121296a = i10;
        }

        public int a(CharSequence charSequence) {
            StringBuilder sb2 = new StringBuilder(charSequence);
            StringUtils.removeSubstring(sb2, Marker.ANY_NON_NULL_MARKER);
            int i10 = !CardPaymentParams.isCountryCodeValid(sb2.toString()) ? this.f121296a : -1;
            StringUtils.wipeString(sb2);
            return i10;
        }

        public CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener) {
            return CheckoutValidationResult.DEFAULT;
        }

        public int a() {
            return this.f121296a;
        }
    }

    static InputLayout.c a(String str) {
        return new l(str);
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$c */
    class c implements InputLayout.c {
        c() {
        }

        public int a(CharSequence charSequence) {
            StringBuilder sb2 = new StringBuilder(charSequence);
            StringUtils.replaceNonstandardDigits(sb2);
            if (!BankAccountPaymentParams.isRoutingNumberValid(sb2.toString())) {
                return a();
            }
            StringUtils.wipeString(sb2);
            return -1;
        }

        public CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener) {
            return CheckoutValidationResult.DEFAULT;
        }

        public int a() {
            return R.string.checkout_error_routing_number_invalid;
        }
    }

    static InputLayout.c a(C14113v vVar, boolean z10) {
        return new a(vVar, z10);
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$b */
    class b implements InputLayout.c {
        b() {
        }

        public int a(CharSequence charSequence) {
            StringBuilder sb2 = new StringBuilder(charSequence);
            StringUtils.replaceNonstandardDigits(sb2);
            String sb3 = sb2.toString();
            if (!BankAccountPaymentParams.isBicValid(sb3) && !BankAccountPaymentParams.isBankCodeValid(sb3)) {
                return a();
            }
            StringUtils.wipeString(sb2);
            return -1;
        }

        public CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener) {
            return CheckoutValidationResult.DEFAULT;
        }

        public int a() {
            return R.string.checkout_error_bic_bank_code_invalid;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$g */
    class g implements InputLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14113v f121291a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f121292b;

        g(C14113v vVar, n nVar) {
            this.f121291a = vVar;
            this.f121292b = nVar;
        }

        public int a(CharSequence charSequence) {
            StringBuilder sb2 = new StringBuilder(charSequence);
            StringUtils.removeSubstring(sb2, this.f121291a.a());
            StringUtils.replaceNonstandardDigits(sb2);
            int a10 = !a(sb2.toString()) ? this.f121292b.a() : -1;
            StringUtils.wipeString(sb2);
            return a10;
        }

        private boolean a(String str) {
            if (!CardPaymentParams.isNumberValid(str, this.f121292b.c())) {
                return false;
            }
            if (this.f121292b.b() == null || this.f121292b.b().matcher(str).find()) {
                return true;
            }
            return false;
        }

        public CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener) {
            return CheckoutValidationResult.DEFAULT;
        }

        public int a() {
            return this.f121292b.a();
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$h */
    class h implements InputLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f121293a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C14081k f121294b;

        h(o oVar, C14081k kVar) {
            this.f121293a = oVar;
            this.f121294b = kVar;
        }

        public int a(CharSequence charSequence) {
            String replaceNonstandardDigits = StringUtils.replaceNonstandardDigits(charSequence.toString());
            if (replaceNonstandardDigits == null || !C14099q.i().matcher(replaceNonstandardDigits).matches()) {
                return this.f121293a.b();
            }
            String replaceNonstandardDigits2 = StringUtils.replaceNonstandardDigits(this.f121294b.a());
            String replaceNonstandardDigits3 = StringUtils.replaceNonstandardDigits(this.f121294b.b());
            if (!CardPaymentParams.isExpiryMonthValid(replaceNonstandardDigits2) || !CardPaymentParams.isExpiryYearValid(replaceNonstandardDigits3)) {
                return this.f121293a.b();
            }
            if (this.f121293a.c() || !CardPaymentParams.isCardExpired(replaceNonstandardDigits2, replaceNonstandardDigits3)) {
                return -1;
            }
            return this.f121293a.a();
        }

        public CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener) {
            return CheckoutValidationResult.DEFAULT;
        }

        public int a() {
            return this.f121293a.b();
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.q$a */
    class a implements InputLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14113v f121288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f121289b;

        a(C14113v vVar, boolean z10) {
            this.f121288a = vVar;
            this.f121289b = z10;
        }

        public int a(CharSequence charSequence) {
            int i10;
            StringBuilder sb2 = new StringBuilder(charSequence);
            StringUtils.removeSubstring(sb2, this.f121288a.a());
            StringUtils.replaceNonstandardDigits(sb2);
            String sb3 = sb2.toString();
            if (!this.f121289b || BankAccountPaymentParams.isIbanValid(sb3) || BankAccountPaymentParams.isAccountNumberValid(sb3)) {
                i10 = (this.f121289b || BankAccountPaymentParams.isIbanValid(sb3)) ? -1 : R.string.checkout_error_iban_invalid;
            } else {
                i10 = R.string.checkout_error_iban_account_number_invalid;
            }
            StringUtils.wipeString(sb2);
            return i10;
        }

        public CheckoutValidationResult a(String str, IPaymentFormListener iPaymentFormListener) {
            return CheckoutValidationResult.DEFAULT;
        }

        public int a() {
            if (this.f121289b) {
                return R.string.checkout_error_iban_account_number_invalid;
            }
            return R.string.checkout_error_iban_invalid;
        }
    }
}
