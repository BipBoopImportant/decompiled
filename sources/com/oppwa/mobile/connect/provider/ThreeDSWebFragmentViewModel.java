package com.oppwa.mobile.connect.provider;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.webkit.WebViewClientCompat;
import l3.a;
import uI.C18055d;

public class ThreeDSWebFragmentViewModel extends f0 {

    /* renamed from: a  reason: collision with root package name */
    private final K<Bundle> f121989a;

    /* renamed from: b  reason: collision with root package name */
    private final C14155e f121990b;

    /* renamed from: c  reason: collision with root package name */
    private final C14155e f121991c;

    public static class Factory implements i0.c {

        /* renamed from: a  reason: collision with root package name */
        private final Context f121992a;

        /* renamed from: b  reason: collision with root package name */
        private final String f121993b;

        /* renamed from: c  reason: collision with root package name */
        private final String f121994c;

        public Factory(Context context, String str, String str2) {
            this.f121992a = context;
            this.f121993b = str;
            this.f121994c = str2;
        }

        public /* bridge */ /* synthetic */ f0 create(Class cls, a aVar) {
            return super.create(cls, aVar);
        }

        public /* bridge */ /* synthetic */ f0 create(C18055d dVar, a aVar) {
            return super.create(dVar, aVar);
        }

        public <T extends f0> T create(Class<T> cls) {
            return new ThreeDSWebFragmentViewModel(this.f121992a, this.f121993b, this.f121994c);
        }
    }

    public ThreeDSWebFragmentViewModel(Context context, String str, String str2) {
        K<Bundle> k10 = new K<>();
        this.f121989a = k10;
        this.f121990b = new C14155e(context, str, (WebViewClientCompat) null);
        this.f121991c = new C14155e(context, str2, new AsyncPaymentWebViewClient(k10));
    }

    public C14155e getMethodDataWebViewLiveData() {
        return this.f121990b;
    }

    public C14155e getRedirectWebViewLiveData() {
        return this.f121991c;
    }

    public F<Bundle> getResultLiveData() {
        return this.f121989a;
    }
}
