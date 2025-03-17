package Ux;

import XH.C16807N;
import XH.x;
import XH.y;
import kotlin.Metadata;
import nI.C17642l;
import xa.C8971l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0006\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxa/l;", "", "Lkotlin/Function1;", "LXH/x;", "LXH/N;", "onResult", "b", "(Lxa/l;LnI/l;)V", "pushnotification-impl_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    /* access modifiers changed from: private */
    public static final void b(C8971l<String> lVar, C17642l<? super x<String>, C16807N> lVar2) {
        Object obj;
        if (lVar.q()) {
            String m10 = lVar.m();
            if ((m10 != null ? m10.toString() : null) != null) {
                x.a aVar = x.f139812b;
                obj = x.b(String.valueOf(lVar.m()));
                lVar2.invoke(x.a(obj));
            }
        }
        if (lVar.q()) {
            x.a aVar2 = x.f139812b;
            obj = x.b(y.a(new IllegalStateException("Token was null")));
        } else {
            x.a aVar3 = x.f139812b;
            Throwable l10 = lVar.l();
            if (l10 == null) {
                l10 = new IllegalStateException("Could not get token");
            }
            obj = x.b(y.a(l10));
        }
        lVar2.invoke(x.a(obj));
    }
}
