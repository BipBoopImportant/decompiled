package com.oppwa.mobile.connect.checkout.dialog.fragment.copyandpay;

import android.content.Context;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutHelper;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.checkout.meta.WpwlOptions;
import com.oppwa.mobile.connect.provider.HttpUtils;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.HashMap;
import java.util.Map;

class a {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f121206a;

    /* renamed from: b  reason: collision with root package name */
    protected final CheckoutSettings f121207b;

    /* renamed from: c  reason: collision with root package name */
    private final String f121208c;

    public a(Context context, CheckoutSettings checkoutSettings, String str) {
        this.f121206a = context;
        this.f121207b = checkoutSettings;
        this.f121208c = str;
    }

    private String a() {
        return HttpUtils.getBaseUrl(this.f121207b.getProviderMode());
    }

    /* access modifiers changed from: protected */
    public Map<String, String> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("{checkoutId}", this.f121207b.getCheckoutId());
        hashMap.put("{baseUrl}", a());
        hashMap.put("{shopperResultUrl}", CheckoutHelper.getShopperResultUrl());
        hashMap.put("{brands}", this.f121208c);
        hashMap.put("{css}", "");
        hashMap.put("{wpwl}", c());
        hashMap.put("{submitButton}", "");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public String c() {
        String str;
        WpwlOptions wpwlOptions = this.f121207b.getWpwlOptions().get(this.f121208c);
        if (wpwlOptions != null) {
            str = wpwlOptions.getWpwlConfigurations() + ";";
        } else {
            str = "{ };";
        }
        Logger.info("WpwlOptions: " + str);
        return str;
    }

    public String formatHtml(String str) {
        for (Map.Entry next : b().entrySet()) {
            if (next.getKey() != null) {
                str = str.replace((CharSequence) next.getKey(), next.getValue() != null ? (CharSequence) next.getValue() : "");
            }
        }
        return str;
    }
}
