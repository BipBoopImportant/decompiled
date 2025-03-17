package com.oppwa.mobile.connect.provider.threeds.v2;

import android.app.Activity;
import android.content.Context;
import com.nsoftware.ipworks3ds.sdk.ThreeDS2Service;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.provider.HttpUtils;
import com.oppwa.mobile.connect.provider.ThreeDS2Info;
import com.oppwa.mobile.connect.provider.threeds.v2.model.ThreeDSConfig;
import com.oppwa.mobile.connect.utils.Logger;
import com.oppwa.mobile.connect.utils.StringUtils;
import java.util.List;
import java.util.Optional;
import qE.C14942b;
import qE.C14945e;
import qE.C14951k;
import qE.C14952l;
import qE.C14953m;

public class ThreeDS2TransactionManager {

    /* renamed from: a  reason: collision with root package name */
    private final Context f122114a;

    /* renamed from: b  reason: collision with root package name */
    private final ThreeDS2Service f122115b;

    /* renamed from: c  reason: collision with root package name */
    private final ThreeDSConfig f122116c;

    /* renamed from: d  reason: collision with root package name */
    private final e f122117d = new e();

    /* renamed from: e  reason: collision with root package name */
    private C14952l f122118e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f122119f;

    public ThreeDS2TransactionManager(Context context, ThreeDS2Service threeDS2Service, ThreeDSConfig threeDSConfig) {
        this.f122114a = context;
        this.f122115b = threeDS2Service;
        this.f122116c = threeDSConfig;
        cleanUp();
    }

    private C14942b a(String str) {
        C14942b bVar = new C14942b();
        bVar.g(str);
        if (this.f122116c.isThreeDSRequestorAppUrlUsed()) {
            bVar.f(a());
        }
        return bVar;
    }

    private String b() {
        return (String) Optional.ofNullable(h().getAuthenticationRequestParameters()).map(new k()).orElse((Object) null);
    }

    private String c(String str) {
        try {
            return HttpUtils.sendPostRequest(str);
        } catch (Exception e10) {
            throw new PaymentException(a("Fail to load challenge completion callback url", (Throwable) e10));
        }
    }

    public void cleanUp() {
        Logger.info("ThreeDS2", "Cleaning up ThreeDS2Service.");
        g();
        this.f122117d.a();
        try {
            Optional.ofNullable(this.f122118e).ifPresent(new i());
            this.f122118e = null;
            this.f122115b.cleanup(this.f122114a);
            this.f122119f = false;
            Logger.info("ThreeDS2", "ThreeDS2Service cleaned up.");
        } catch (Exception unused) {
        }
    }

    public void doChallenge(Activity activity, String str, String str2) {
        PaymentError paymentError;
        Logger.info("ThreeDS2", "Starting challenge.");
        try {
            b bVar = new b();
            h().doChallenge(activity, a(str), bVar, this.f122116c.getSdkMaxTimeout());
            bVar.a();
            paymentError = bVar.b();
            if (str2 != null) {
                a(activity, str2);
            }
        } catch (Exception e10) {
            paymentError = a("Challenge failed", (Throwable) e10);
        }
        if (paymentError != null) {
            if (paymentError.getErrorCode() != ErrorCode.ERROR_CODE_THREEDS2_CANCELED) {
                f();
            }
            throw new PaymentException(paymentError);
        }
    }

    /* access modifiers changed from: protected */
    public void f() {
        a(this.f122117d.b());
    }

    /* access modifiers changed from: protected */
    public void g() {
        a(this.f122117d.c());
    }

    public List<C14953m> getWarnings() {
        Logger.info("ThreeDS2", "Getting warnings.");
        if (!this.f122119f) {
            a(new C14945e.b("", "", ""));
        }
        try {
            return this.f122115b.getWarnings();
        } catch (Exception e10) {
            throw new PaymentException(a("Fail to get warnings", (Throwable) e10));
        }
    }

    /* access modifiers changed from: protected */
    public C14952l h() {
        return (C14952l) Optional.ofNullable(this.f122118e).orElseThrow(new j());
    }

    public void initialize(ThreeDS2Info threeDS2Info) {
        String requireProtocolVersion = threeDS2Info.requireProtocolVersion();
        b(new C14945e.b(threeDS2Info.requireDsRefId(), threeDS2Info.requireDsCert(), threeDS2Info.requireDsRootCa()));
        Logger.info("ThreeDS2", "Creating transaction for brand '" + threeDS2Info.getBrand() + "', protocol version '" + requireProtocolVersion + "', directory server id '" + threeDS2Info.requireDsRefId() + "'.");
        try {
            this.f122118e = this.f122115b.createTransaction(threeDS2Info.requireDsRefId(), requireProtocolVersion);
        } catch (Exception e10) {
            throw new PaymentException(a("Fail to create transaction", (Throwable) e10));
        }
    }

    public String requireAuthRequest() {
        Logger.info("ThreeDS2", "Getting auth request.");
        try {
            return (String) Optional.ofNullable((String) Optional.ofNullable(h().getAuthenticationRequestParameters()).map(new f()).orElse((Object) null)).orElseThrow(new g());
        } catch (Exception e10) {
            throw new PaymentException(a("Fail to get auth request", (Throwable) e10));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException d() {
        return new PaymentException(PaymentError.getThreeDS2Error("Auth request can't be null"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException e() {
        return new IllegalStateException("Transaction is null, make sure you called initializeTransaction(ThreeDS2Info threeDS2Info) first");
    }

    /* access modifiers changed from: protected */
    public String c() {
        try {
            String sDKVersion = this.f122115b.getSDKVersion();
            if (sDKVersion != null) {
                return StringUtils.unmaskNumbers(sDKVersion);
            }
            return null;
        } catch (Exception e10) {
            Logger.error("ThreeDS2", "Fail to get SDK version", e10);
            return null;
        }
    }

    private void b(C14945e.b bVar) {
        cleanUp();
        a(bVar);
    }

    private void a(Activity activity, String str) {
        Logger.info("ThreeDS2", "Sending challenge completion callback.");
        String c10 = c(str);
        a aVar = new a();
        a(activity, c10, aVar);
        try {
            aVar.a();
            PaymentError b10 = aVar.b();
            if (b10 != null) {
                throw new PaymentException(b10);
            }
        } catch (InterruptedException e10) {
            throw new PaymentException(a("Interrupted while await", (Throwable) e10));
        }
    }

    /* access modifiers changed from: protected */
    public void a(Activity activity, String str, a aVar) {
        activity.runOnUiThread(new l(activity, aVar, str));
    }

    private String a() {
        String str = "ipworks3ds://" + this.f122114a.getPackageName() + ".oob";
        String b10 = b();
        if (b10 != null) {
            str = str + "?transID=" + b10;
        }
        Logger.info("ThreeDS2", "Requestor app URL: '" + str + "'.");
        return str;
    }

    private void a(C14945e.b bVar) {
        Logger.info("ThreeDS2", "Initializing ThreeDS2Service.\n" + this.f122116c);
        try {
            this.f122115b.initialize(this.f122114a, d.a(this.f122116c, bVar), this.f122116c.getLocale(), this.f122116c.getUiCustomization(), this.f122117d, (C14951k) null);
            this.f122119f = true;
            Logger.info("ThreeDS2", "Initialized with " + c());
        } catch (Exception e10) {
            throw new PaymentException(a("ThreeDS2Service initialization failed", (Throwable) e10));
        }
    }

    private void a(List<String> list) {
        list.forEach(new h());
    }

    private PaymentError a(String str, Throwable th2) {
        Logger.error("ThreeDS2", str, th2);
        return PaymentError.getThreeDS2Error(str);
    }
}
