package SG;

import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import p1.C5747v0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LSG/n;", "Landroidx/lifecycle/f0;", "<init>", "()V", "LXH/N;", "D", "LSG/b;", "colorItem", "E", "(LSG/b;)V", "LTJ/B;", "LSG/m;", "m", "LTJ/B;", "_toolbarState", "LTJ/P;", "n", "LTJ/P;", "C", "()LTJ/P;", "toolbarState", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C16505B<C16415m> f138255m;

    /* renamed from: n  reason: collision with root package name */
    private final C16519P<C16415m> f138256n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.toolbars.helawallcolorpicker.HelaWallColorToolbarViewModel$selectColor$1", f = "HelaWallColorToolbarViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f138257c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n f138258d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16404b f138259e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, C16404b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f138258d = nVar;
            this.f138259e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f138258d, this.f138259e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f138257c == 0) {
                y.b(obj);
                C16505B h10 = this.f138258d.f138255m;
                C16415m mVar = (C16415m) this.f138258d.f138255m.getValue();
                Iterable<C16404b> b10 = ((C16415m) this.f138258d.f138255m.getValue()).b();
                C16404b bVar = this.f138259e;
                ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
                for (C16404b bVar2 : b10) {
                    arrayList.add(C16404b.b(bVar2, (String) null, (String) null, C5747v0.q(bVar2.c(), bVar.c()), false, 11, (Object) null));
                }
                h10.setValue(mVar.a(arrayList, this.f138259e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public n() {
        C16505B<C16415m> a10 = C16521S.a(new C16415m((List) null, (C16404b) null, 3, (DefaultConstructorMarker) null));
        this.f138255m = a10;
        this.f138256n = a10;
        D();
    }

    private final void D() {
        this.f138255m.setValue(new C16415m((List) null, (C16404b) null, 3, (DefaultConstructorMarker) null));
    }

    public final C16519P<C16415m> C() {
        return this.f138256n;
    }

    public final void E(C16404b bVar) {
        C17542s.j(bVar, "colorItem");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, bVar, (C17164e<? super a>) null), 3, (Object) null);
    }
}
