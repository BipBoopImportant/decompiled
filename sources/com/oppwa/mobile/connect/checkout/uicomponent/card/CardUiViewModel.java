package com.oppwa.mobile.connect.checkout.uicomponent.card;

import android.content.Context;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.provider.OppPaymentProvider;
import com.oppwa.mobile.connect.provider.model.BinInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import l3.a;
import uI.C18055d;

public class CardUiViewModel extends f0 {

    /* renamed from: a  reason: collision with root package name */
    private final K<Set<String>> f121504a = new K<>();

    /* renamed from: b  reason: collision with root package name */
    private final CheckoutSettings f121505b;

    /* renamed from: c  reason: collision with root package name */
    private final BrandsValidation f121506c;

    /* renamed from: d  reason: collision with root package name */
    private final OppPaymentProvider f121507d;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, Set<String>> f121508e = new HashMap<>();

    public static class Factory implements i0.c {

        /* renamed from: a  reason: collision with root package name */
        private final Context f121509a;

        /* renamed from: b  reason: collision with root package name */
        private final CheckoutSettings f121510b;

        /* renamed from: c  reason: collision with root package name */
        private final BrandsValidation f121511c;

        public Factory(Context context, CheckoutSettings checkoutSettings, BrandsValidation brandsValidation) {
            this.f121509a = context;
            this.f121510b = checkoutSettings;
            this.f121511c = brandsValidation;
        }

        public /* bridge */ /* synthetic */ f0 create(Class cls, a aVar) {
            return super.create(cls, aVar);
        }

        public /* bridge */ /* synthetic */ f0 create(C18055d dVar, a aVar) {
            return super.create(dVar, aVar);
        }

        public <T extends f0> T create(Class<T> cls) {
            return new CardUiViewModel(this.f121509a, this.f121510b, this.f121511c);
        }
    }

    public CardUiViewModel(Context context, CheckoutSettings checkoutSettings, BrandsValidation brandsValidation) {
        this.f121505b = checkoutSettings;
        this.f121506c = brandsValidation;
        this.f121507d = new OppPaymentProvider(context, checkoutSettings.getProviderMode());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, BinInfo binInfo, PaymentError paymentError) {
        a(str, binInfo);
    }

    public void detectCardBrandsByBin(String str) {
        if (this.f121508e.containsKey(str)) {
            Set set = this.f121508e.get(str);
            if (set != null && !set.equals(this.f121504a.getValue())) {
                this.f121504a.postValue(this.f121508e.get(str));
                return;
            }
            return;
        }
        this.f121508e.put(str, Collections.emptySet());
        this.f121507d.requestBinInfo(this.f121505b.getCheckoutId(), str, new l(this, str));
    }

    public void detectCardBrandsByRegex(String str) {
        Set<String> detectCardBrandsByRegex = this.f121506c.detectCardBrandsByRegex(str);
        if (!detectCardBrandsByRegex.equals(this.f121504a.getValue())) {
            this.f121504a.postValue(detectCardBrandsByRegex);
        }
    }

    public K<Set<String>> getDetectedCardBrandsLiveData() {
        return this.f121504a;
    }

    private void a(String str, BinInfo binInfo) {
        Object obj;
        if (binInfo != null) {
            obj = new LinkedHashSet(Arrays.asList(this.f121506c.filterOutUnconfiguredBrands(binInfo.getBrands())));
            this.f121508e.put(str, obj);
        } else {
            obj = Collections.emptySet();
        }
        this.f121504a.postValue(obj);
    }
}
