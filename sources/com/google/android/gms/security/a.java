package com.google.android.gms.security;

import G9.C6522c;
import G9.d;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.security.ProviderInstaller;

final class a extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f50554a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ProviderInstaller.a f50555b;

    a(Context context, ProviderInstaller.a aVar) {
        this.f50554a = context;
        this.f50555b = aVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            ProviderInstaller.a(this.f50554a);
            return 0;
        } catch (d e10) {
            return Integer.valueOf(e10.a());
        } catch (C6522c e11) {
            return Integer.valueOf(e11.f36314a);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f50555b.d0();
            return;
        }
        this.f50555b.m0(num.intValue(), ProviderInstaller.f50550a.b(this.f50554a, num.intValue(), "pi"));
    }
}
