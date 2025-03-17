package com.oppwa.mobile.connect.checkout.meta;

import androidx.lifecycle.C5221y;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.concurrent.atomic.AtomicBoolean;

public class DisposableLiveData<T> extends K<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f121431a = new AtomicBoolean(false);

    /* access modifiers changed from: private */
    public /* synthetic */ void a(L l10, Object obj) {
        if (this.f121431a.compareAndSet(true, false)) {
            l10.onChanged(obj);
        }
    }

    public void observe(C5221y yVar, L<? super T> l10) {
        if (hasActiveObservers()) {
            Logger.warning("Multiple observers assigned");
        }
        super.observe(yVar, new q(this, l10));
    }

    public void setValue(T t10) {
        this.f121431a.set(true);
        super.setValue(t10);
    }
}
