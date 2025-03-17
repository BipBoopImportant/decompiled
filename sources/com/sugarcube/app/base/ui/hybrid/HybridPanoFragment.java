package com.sugarcube.app.base.ui.hybrid;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/HybridPanoFragment;", "Lcom/sugarcube/app/base/ui/hybrid/HybridFragment;", "<init>", "()V", "Lcom/sugarcube/app/base/ui/hybrid/E0;", "D0", "()Lcom/sugarcube/app/base/ui/hybrid/E0;", "B0", "", "index", "E0", "(I)Lcom/sugarcube/app/base/ui/hybrid/E0;", "C0", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class HybridPanoFragment extends HybridFragment {
    /* access modifiers changed from: protected */
    public final E0 B0() {
        E0 u02 = u0();
        u02.w1().b().capturePanoEnd(u02.y1(), u02.r1(), true, 1, u02.e1(), u02.d1());
        return u02;
    }

    /* access modifiers changed from: protected */
    public final E0 C0() {
        E0 u02 = u0();
        u02.w1().b().capturePanoExit(u02.y1(), u02.r1(), 1, u02.e1(), u02.d1());
        return u02;
    }

    /* access modifiers changed from: protected */
    public final E0 D0() {
        E0 u02 = u0();
        u02.w1().b().capturePanoStart(u02.y1(), u02.r1(), 1, u02.e1(), u02.d1());
        return u02;
    }

    /* access modifiers changed from: protected */
    public final E0 E0(int i10) {
        E0 u02 = u0();
        u02.w1().b().capturePanoTarget(u02.y1(), u02.r1(), i10 + 1, 1, u02.e1(), u02.d1());
        return u02;
    }
}
