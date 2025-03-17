package a9;

import D8.c;
import HJ.C15854t;
import QJ.Q;
import XH.C16807N;
import XH.y;
import com.contentsquare.android.internal.features.srm.SrmKeysCache;
import dI.C17164e;
import eI.C17187b;
import jK.C17450e0;
import java.util.LinkedHashSet;
import kK.C17514c;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@f(c = "com.contentsquare.android.internal.features.srm.SrmKeysCache$plusAssign$2", f = "SrmKeysCache.kt", l = {}, m = "invokeSuspend")
public final class F extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SrmKeysCache f41990c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F(SrmKeysCache srmKeysCache, C17164e<? super F> eVar) {
        super(2, eVar);
        this.f41990c = srmKeysCache;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new F(this.f41990c, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new F(this.f41990c, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        C17187b.f();
        y.b(obj);
        SrmKeysCache srmKeysCache = this.f41990c;
        synchronized (srmKeysCache) {
            C17514c.a aVar = C17514c.f144280d;
            LinkedHashSet linkedHashSet = srmKeysCache.f46845d;
            aVar.a();
            String b10 = aVar.b(new C17450e0(SrmKeysCache.Key.Companion.serializer()), linkedHashSet);
            srmKeysCache.f46842a.o(srmKeysCache.f46846e);
            srmKeysCache.f46842a.s(srmKeysCache.f46847f, C15854t.E(b10), false);
            c cVar = srmKeysCache.f46850i;
            cVar.f("Saved " + srmKeysCache.f46845d.size() + " keys to disk.");
        }
        return C16807N.f139792a;
    }
}
