package a9;

import XH.C16807N;
import android.view.View;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

public final class S4 extends C17544u implements C17642l<Throwable, C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f42279c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Runnable f42280d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public S4(View view, C6803c5 c5Var) {
        super(1);
        this.f42279c = view;
        this.f42280d = c5Var;
    }

    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f42279c.removeCallbacks(this.f42280d);
        return C16807N.f139792a;
    }
}
