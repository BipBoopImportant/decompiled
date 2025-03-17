package com.google.android.gms.wallet;

import Ba.A;
import Ba.B;
import Ba.C6381e;
import Ba.C6385i;
import Ba.C6386j;
import Ba.M;
import H9.C6545t;
import android.content.Context;
import com.google.android.gms.common.api.f;
import com.google.android.gms.wallet.b;
import xa.C8971l;

public class PaymentsClient extends f<b.a> {
    PaymentsClient(Context context, b.a aVar) {
        super(context, b.f50605a, aVar, f.a.f48010c);
    }

    public C8971l<Boolean> D(C6381e eVar) {
        return n(C6545t.a().e(23705).b(new A(eVar)).a());
    }

    public C8971l<C6385i> E(C6386j jVar) {
        return r(C6545t.a().b(new B(jVar)).d(M.f33285c).c(true).e(23707).a());
    }
}
