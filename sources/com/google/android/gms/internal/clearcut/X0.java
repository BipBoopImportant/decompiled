package com.google.android.gms.internal.clearcut;

import E9.c;
import H9.C6527a;
import H9.r;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.util.VisibleForTesting;

public final class X0 extends f<a.d.c> implements c {
    @VisibleForTesting
    private X0(Context context) {
        super(context, E9.a.f35257p, null, (r) new C6527a());
    }

    public static c D(Context context) {
        return new X0(context);
    }

    public final i<Status> a(E9.f fVar) {
        return l(new m2(fVar, j()));
    }
}
