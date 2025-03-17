package com.google.android.gms.common.api;

import H9.C6530d;
import H9.C6539m;
import H9.C6543q;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f48015a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface a extends C6530d {
    }

    @Deprecated
    public interface b extends C6539m {
    }

    public static Set<g> b() {
        Set<g> set = f48015a;
        synchronized (set) {
        }
        return set;
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends n, A>> T a(T t10) {
        throw new UnsupportedOperationException();
    }

    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public boolean d(C6543q qVar) {
        throw new UnsupportedOperationException();
    }

    public void e() {
        throw new UnsupportedOperationException();
    }
}
