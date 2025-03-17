package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import com.iovation.mobile.android.FraudForceConfiguration;
import com.iovation.mobile.android.FraudForceManager;
import com.oppwa.mobile.connect.utils.Logger;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.o  reason: case insensitive filesystem */
class C14093o {

    /* renamed from: a  reason: collision with root package name */
    private final Context f121279a;

    @FunctionalInterface
    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.o$a */
    interface a {
        void a(String str);
    }

    public C14093o(Context context) {
        this.f121279a = context;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(a aVar) {
        String str = null;
        try {
            FraudForceManager fraudForceManager = FraudForceManager.INSTANCE;
            fraudForceManager.initialize(a(), this.f121279a);
            fraudForceManager.refresh(this.f121279a);
            str = fraudForceManager.getBlackbox(this.f121279a);
        } catch (Error | Exception e10) {
            Logger.error(e10);
        } finally {
            aVar.a(str);
        }
    }

    public void a(a aVar) {
        new Thread(new y2(this, aVar)).start();
    }

    /* access modifiers changed from: protected */
    public FraudForceConfiguration a() {
        return new FraudForceConfiguration.Builder().build();
    }
}
