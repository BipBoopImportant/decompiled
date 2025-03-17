package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.provider.OppPaymentProvider;
import com.oppwa.mobile.connect.provider.model.BinInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.d  reason: case insensitive filesystem */
class C14060d {

    /* renamed from: e  reason: collision with root package name */
    private static C14060d f121152e;

    /* renamed from: a  reason: collision with root package name */
    private Set<a> f121153a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private BrandsValidation f121154b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, String[]> f121155c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private String f121156d;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.d$a */
    interface a {
        void onBrandsLoaded(String str, String[] strArr);
    }

    private C14060d() {
    }

    static synchronized C14060d b() {
        C14060d dVar;
        synchronized (C14060d.class) {
            try {
                if (f121152e == null) {
                    f121152e = new C14060d();
                }
                dVar = f121152e;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.f121155c.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    public void a(OppPaymentProvider oppPaymentProvider, String str, String str2, BrandsValidation brandsValidation) {
        this.f121154b = brandsValidation;
        this.f121156d = str2;
        oppPaymentProvider.requestBinInfo(str, str2, new r2(this));
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar) {
        this.f121153a.remove(aVar);
    }

    /* access modifiers changed from: private */
    public void a(BinInfo binInfo, PaymentError paymentError) {
        if (binInfo != null) {
            String[] filterOutUnconfiguredBrands = this.f121154b.filterOutUnconfiguredBrands(binInfo.getBrands());
            b().a(this.f121156d, filterOutUnconfiguredBrands);
            b(this.f121156d, filterOutUnconfiguredBrands);
        }
    }

    private String[] b(String str) {
        return this.f121155c.get(str);
    }

    private void b(String str, String[] strArr) {
        for (a onBrandsLoaded : this.f121153a) {
            onBrandsLoaded.onBrandsLoaded(str, strArr);
        }
    }

    /* access modifiers changed from: package-private */
    public String[] a(String str) {
        String str2 = "";
        for (String next : this.f121155c.keySet()) {
            if (str.startsWith(next) && next.length() > str2.length()) {
                str2 = next;
            }
        }
        if (str2.length() > 0) {
            return this.f121155c.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f121155c = new HashMap();
        this.f121154b = null;
        this.f121156d = null;
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f121153a.add(aVar);
    }

    private void a(String str, String[] strArr) {
        if (b(str) == null) {
            this.f121155c.put(str, strArr);
        }
    }
}
