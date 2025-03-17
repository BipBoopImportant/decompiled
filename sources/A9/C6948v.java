package a9;

import QJ.Q;
import XH.C16807N;
import XH.y;
import com.contentsquare.android.internal.features.srm.SrmKeysCache;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.internal.features.srm.SrmKeysCache$load$1", f = "SrmKeysCache.kt", l = {}, m = "invokeSuspend")
/* renamed from: a9.v  reason: case insensitive filesystem */
public final class C6948v extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SrmKeysCache f42892c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6948v(SrmKeysCache srmKeysCache, C17164e<? super C6948v> eVar) {
        super(2, eVar);
        this.f42892c = srmKeysCache;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new C6948v(this.f42892c, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new C6948v(this.f42892c, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        C17187b.f();
        y.b(obj);
        SrmKeysCache.b(this.f42892c);
        return C16807N.f139792a;
    }
}
