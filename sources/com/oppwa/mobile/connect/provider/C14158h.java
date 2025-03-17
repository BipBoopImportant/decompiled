package com.oppwa.mobile.connect.provider;

import com.oppwa.mobile.connect.provider.listener.BinInfoListener;

/* renamed from: com.oppwa.mobile.connect.provider.h  reason: case insensitive filesystem */
public final /* synthetic */ class C14158h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OppPaymentProvider f122009a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f122010b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f122011c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ BinInfoListener f122012d;

    public /* synthetic */ C14158h(OppPaymentProvider oppPaymentProvider, String str, String str2, BinInfoListener binInfoListener) {
        this.f122009a = oppPaymentProvider;
        this.f122010b = str;
        this.f122011c = str2;
        this.f122012d = binInfoListener;
    }

    public final void run() {
        this.f122009a.a(this.f122010b, this.f122011c, this.f122012d);
    }
}
