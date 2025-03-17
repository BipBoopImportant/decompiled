package ed;

import Zc.C9396e;
import Zc.C9400i;
import android.content.Context;
import bd.C9428b;
import com.google.android.gms.common.b;
import ha.C8136s8;
import ha.E8;

/* renamed from: ed.g  reason: case insensitive filesystem */
public final class C9639g extends C9396e {

    /* renamed from: b  reason: collision with root package name */
    private final C9400i f72599b;

    public C9639g(C9400i iVar) {
        this.f72599b = iVar;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        C9428b bVar = (C9428b) obj;
        Context b10 = this.f72599b.b();
        C8136s8 b11 = E8.b(C9635c.d());
        return new C9642j(this.f72599b, bVar, (C9645m.b(b10) || b.f().a(b10) >= 204500000) ? new C9645m(b10, bVar, b11) : new C9647o(b10, bVar, b11), b11);
    }
}
