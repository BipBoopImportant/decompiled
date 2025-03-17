package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import l3.a;
import uI.C18055d;

class BlikPaymentInfoViewModel extends f0 {

    /* renamed from: a  reason: collision with root package name */
    private WebViewInlineLiveData f120863a;

    public static class Factory implements i0.c {

        /* renamed from: a  reason: collision with root package name */
        private final Context f120864a;

        public Factory(Context context) {
            this.f120864a = context;
        }

        public /* bridge */ /* synthetic */ f0 create(Class cls, a aVar) {
            return super.create(cls, aVar);
        }

        public /* bridge */ /* synthetic */ f0 create(C18055d dVar, a aVar) {
            return super.create(dVar, aVar);
        }

        public <T extends f0> T create(Class<T> cls) {
            return new BlikPaymentInfoViewModel(this.f120864a);
        }
    }

    public BlikPaymentInfoViewModel(Context context) {
        this.f120863a = new WebViewInlineLiveData(context);
    }

    public WebViewInlineLiveData a() {
        return this.f120863a;
    }

    public void a(String str) {
        this.f120863a.loadUrl(str);
    }
}
