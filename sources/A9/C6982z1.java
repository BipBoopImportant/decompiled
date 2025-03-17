package a9;

import XH.C16807N;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.c;
import com.contentsquare.android.sdk.I;
import com.contentsquare.android.sdk.c1;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

/* renamed from: a9.z1  reason: case insensitive filesystem */
public final class C6982z1 extends C17544u implements C17631a<C16807N> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ I f42980c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C17631a<C16807N> f42981d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6982z1(I i10, c cVar) {
        super(0);
        this.f42980c = i10;
        this.f42981d = cVar;
    }

    public final Object invoke() {
        c1 c1Var = this.f42980c.f47001c;
        if (c1Var != null) {
            c1Var.dismiss();
        }
        this.f42981d.invoke();
        return C16807N.f139792a;
    }
}
