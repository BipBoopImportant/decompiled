package cF;

import XH.C16824o;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.i0;
import e3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import x4.C8948l;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* renamed from: cF.f  reason: case insensitive filesystem */
public final class C14044f implements C17631a<i0.c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C5187o f119140a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C16824o<C8948l> f119141b;

    public C14044f(C5187o oVar, C16824o<C8948l> oVar2) {
        this.f119140a = oVar;
        this.f119141b = oVar2;
    }

    /* renamed from: a */
    public final i0.c invoke() {
        C5191t requireActivity = this.f119140a.requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        return a.a(requireActivity, C14046h.b(this.f119141b).getDefaultViewModelProviderFactory());
    }
}
