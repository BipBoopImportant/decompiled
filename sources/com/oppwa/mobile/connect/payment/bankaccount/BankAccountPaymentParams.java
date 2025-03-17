package com.oppwa.mobile.connect.payment.bankaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.utils.Utils;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

public class BankAccountPaymentParams extends PaymentParams {
    public static final Parcelable.Creator<BankAccountPaymentParams> CREATOR = new a();

    /* renamed from: o  reason: collision with root package name */
    private static SoftReference<Pattern> f121821o;

    /* renamed from: p  reason: collision with root package name */
    private static SoftReference<Pattern> f121822p;

    /* renamed from: q  reason: collision with root package name */
    private static SoftReference<Pattern> f121823q;

    /* renamed from: r  reason: collision with root package name */
    private static SoftReference<Pattern> f121824r;

    /* renamed from: s  reason: collision with root package name */
    private static SoftReference<Pattern> f121825s;

    /* renamed from: t  reason: collision with root package name */
    private static SoftReference<Pattern> f121826t;

    /* renamed from: u  reason: collision with root package name */
    private static SoftReference<Pattern> f121827u;

    /* renamed from: g  reason: collision with root package name */
    protected byte[] f121828g;

    /* renamed from: h  reason: collision with root package name */
    protected byte[] f121829h;

    /* renamed from: i  reason: collision with root package name */
    protected byte[] f121830i;

    /* renamed from: j  reason: collision with root package name */
    protected byte[] f121831j;

    /* renamed from: k  reason: collision with root package name */
    protected byte[] f121832k;

    /* renamed from: l  reason: collision with root package name */
    protected byte[] f121833l;

    /* renamed from: m  reason: collision with root package name */
    protected byte[] f121834m;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f121835n = false;

    class a implements Parcelable.Creator<BankAccountPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public BankAccountPaymentParams createFromParcel(Parcel parcel) {
            return new BankAccountPaymentParams(parcel);
        }

        /* renamed from: a */
        public BankAccountPaymentParams[] newArray(int i10) {
            return new BankAccountPaymentParams[i10];
        }
    }

    BankAccountPaymentParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        super(str, str2);
        this.f121828g = Utils.bytesFromString(Utils.normalizeHolder(str3));
        this.f121829h = Utils.bytesFromString(str4);
        this.f121830i = Utils.bytesFromString(str5);
        this.f121831j = Utils.bytesFromString(str6);
        this.f121832k = Utils.bytesFromString(str7);
        this.f121833l = Utils.bytesFromString(str8);
        this.f121834m = Utils.bytesFromString(str9);
    }

    public static BankAccountPaymentParams createAciInstantPayPaymentParams(String str, String str2, String str3, String str4, String str5) {
        return new a(str, str2, str3, str4, str5);
    }

    public static BankAccountPaymentParams createDirectDebitSepaPaymentParams(String str, String str2, String str3, boolean z10) {
        return new b(str, str2, str3, z10);
    }

    public static BankAccountPaymentParams createGiroPayPaymentParams(String str, String str2, String str3, String str4, String str5) {
        return new c(str, str2, str3, str4, str5);
    }

    @Deprecated
    public static BankAccountPaymentParams createIdealPaymentParams(String str, String str2) {
        return new IdealPaymentParams(str, str2);
    }

    public static BankAccountPaymentParams createIdealTwoPaymentParams(String str, String str2) {
        return new IdealPaymentParams(str, (String) null, str2);
    }

    public static BankAccountPaymentParams createPaytrailPaymentParams(String str) {
        return new e(str);
    }

    public static BankAccountPaymentParams createSofortPaymentParams(String str, String str2) {
        return new f(str, str2);
    }

    private static Pattern e() {
        SoftReference<Pattern> softReference = f121824r;
        if (softReference == null || softReference.get() == null) {
            f121824r = new SoftReference<>(Pattern.compile("[0-9]{3,27}"));
        }
        return f121824r.get();
    }

    private static Pattern f() {
        SoftReference<Pattern> softReference = f121826t;
        if (softReference == null || softReference.get() == null) {
            f121826t = new SoftReference<>(Pattern.compile("[0-9]{1,12}"));
        }
        return f121826t.get();
    }

    private static Pattern g() {
        SoftReference<Pattern> softReference = f121823q;
        if (softReference == null || softReference.get() == null) {
            f121823q = new SoftReference<>(Pattern.compile("[\\s\\S]{1,255}"));
        }
        return f121823q.get();
    }

    private static Pattern h() {
        SoftReference<Pattern> softReference = f121825s;
        if (softReference == null || softReference.get() == null) {
            f121825s = new SoftReference<>(Pattern.compile("[a-zA-Z0-9]{8}$|^[a-zA-Z0-9]{11}"));
        }
        return f121825s.get();
    }

    private static Pattern i() {
        SoftReference<Pattern> softReference = f121822p;
        if (softReference == null || softReference.get() == null) {
            f121822p = new SoftReference<>(Pattern.compile("[A-Z]{2}"));
        }
        return f121822p.get();
    }

    public static boolean isAccountNumberValid(String str) {
        return str != null && e().matcher(str).matches();
    }

    public static boolean isBankCodeValid(String str) {
        return str != null && f().matcher(str).matches();
    }

    public static boolean isBankNameValid(String str) {
        return str != null && g().matcher(str).matches();
    }

    public static boolean isBicValid(String str) {
        return str != null && h().matcher(str).matches();
    }

    public static boolean isCountryValid(String str) {
        return str != null && i().matcher(str).matches();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r2 = com.oppwa.mobile.connect.utils.Utils.normalizeHolder(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isHolderValid(java.lang.String r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r2 = com.oppwa.mobile.connect.utils.Utils.normalizeHolder(r2)
            if (r2 == 0) goto L_0x0019
            java.util.regex.Pattern r1 = j()
            java.util.regex.Matcher r2 = r1.matcher(r2)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L_0x0019
            r0 = 1
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams.isHolderValid(java.lang.String):boolean");
    }

    public static boolean isIbanValid(String str) {
        return d.b(str);
    }

    public static boolean isRoutingNumberValid(String str) {
        return str != null && k().matcher(str).matches();
    }

    private static Pattern j() {
        SoftReference<Pattern> softReference = f121821o;
        if (softReference == null || softReference.get() == null) {
            f121821o = new SoftReference<>(Pattern.compile(".{3,128}"));
        }
        return f121821o.get();
    }

    private static Pattern k() {
        SoftReference<Pattern> softReference = f121827u;
        if (softReference == null || softReference.get() == null) {
            f121827u = new SoftReference<>(Pattern.compile("[0-9]{1,9}"));
        }
        return f121827u.get();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        BankAccountPaymentParams bankAccountPaymentParams = (BankAccountPaymentParams) obj;
        return this.f121835n == bankAccountPaymentParams.f121835n && Arrays.equals(this.f121828g, bankAccountPaymentParams.f121828g) && Arrays.equals(this.f121829h, bankAccountPaymentParams.f121829h) && Arrays.equals(this.f121830i, bankAccountPaymentParams.f121830i) && Arrays.equals(this.f121831j, bankAccountPaymentParams.f121831j) && Arrays.equals(this.f121832k, bankAccountPaymentParams.f121832k) && Arrays.equals(this.f121833l, bankAccountPaymentParams.f121833l) && Arrays.equals(this.f121834m, bankAccountPaymentParams.f121834m);
    }

    public String getAccountNumber() {
        return Utils.stringFromBytes(this.f121830i);
    }

    public String getBankCode() {
        return Utils.stringFromBytes(this.f121832k);
    }

    public String getBankName() {
        return Utils.stringFromBytes(this.f121834m);
    }

    public String getBic() {
        return Utils.stringFromBytes(this.f121831j);
    }

    public String getCountry() {
        return Utils.stringFromBytes(this.f121833l);
    }

    public Parcelable.Creator<?> getCreator() {
        return CREATOR;
    }

    public String getHolder() {
        return Utils.stringFromBytes(this.f121828g);
    }

    public String getIban() {
        return Utils.stringFromBytes(this.f121829h);
    }

    public Map<String, String> getParamsForRequest() {
        return super.getParamsForRequest();
    }

    public int hashCode() {
        return (((((((((((((((super.hashCode() * 31) + Arrays.hashCode(this.f121828g)) * 31) + Arrays.hashCode(this.f121829h)) * 31) + Arrays.hashCode(this.f121830i)) * 31) + Arrays.hashCode(this.f121831j)) * 31) + Arrays.hashCode(this.f121832k)) * 31) + Arrays.hashCode(this.f121833l)) * 31) + Arrays.hashCode(this.f121834m)) * 31) + (this.f121835n ? 1 : 0);
    }

    public boolean isTokenizationEnabled() {
        return this.f121835n;
    }

    public void mask() {
        String iban;
        if (this.f121829h != null && (iban = getIban()) != null && iban.length() > 4) {
            this.f121829h = iban.substring(iban.length() - 4).getBytes();
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        Utils.writeByteArray(parcel, this.f121828g);
        Utils.writeByteArray(parcel, this.f121829h);
        Utils.writeByteArray(parcel, this.f121830i);
        Utils.writeByteArray(parcel, this.f121831j);
        Utils.writeByteArray(parcel, this.f121832k);
        Utils.writeByteArray(parcel, this.f121833l);
        Utils.writeByteArray(parcel, this.f121834m);
        parcel.writeByte(this.f121835n ? (byte) 1 : 0);
    }

    protected BankAccountPaymentParams(Parcel parcel) {
        super(parcel);
        boolean z10 = false;
        this.f121828g = Utils.readByteArray(parcel);
        this.f121829h = Utils.readByteArray(parcel);
        this.f121830i = Utils.readByteArray(parcel);
        this.f121831j = Utils.readByteArray(parcel);
        this.f121832k = Utils.readByteArray(parcel);
        this.f121833l = Utils.readByteArray(parcel);
        this.f121834m = Utils.readByteArray(parcel);
        this.f121835n = parcel.readByte() != 0 ? true : z10;
    }
}
