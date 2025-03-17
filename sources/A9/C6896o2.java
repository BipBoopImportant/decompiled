package a9;

import QJ.Q;
import XH.C16807N;
import XH.y;
import android.app.Activity;
import b8.o;
import com.contentsquare.android.sdk.C7114a0;
import com.contentsquare.android.sdk.C7156v0;
import com.contentsquare.android.sdk.c1;
import com.contentsquare.android.sdk.k1;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17642l;
import nI.p;

@f(c = "com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.explanation.LongSnapshotExplanationLayoutManager$displayExplanation$1", f = "LongSnapshotExplanationLayoutManager.kt", l = {41}, m = "invokeSuspend")
/* renamed from: a9.o2  reason: case insensitive filesystem */
public final class C6896o2 extends l implements p<Q, C17164e<? super C16807N>, Object> {

    /* renamed from: c  reason: collision with root package name */
    public c1 f42775c;

    /* renamed from: d  reason: collision with root package name */
    public C7114a0 f42776d;

    /* renamed from: e  reason: collision with root package name */
    public int f42777e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C7114a0 f42778f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6896o2(C7114a0 a0Var, C17164e<? super C6896o2> eVar) {
        super(2, eVar);
        this.f42778f = a0Var;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new C6896o2(this.f42778f, eVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        return new C6896o2(this.f42778f, (C17164e) obj2).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        c1 c1Var;
        C7114a0 a0Var;
        Object f10 = C17187b.f();
        int i10 = this.f42777e;
        if (i10 == 0) {
            y.b(obj);
            C7114a0 a0Var2 = this.f42778f;
            c1Var = new c1();
            C7114a0 a0Var3 = this.f42778f;
            Activity activity = a0Var3.f47277a.f42433a.get();
            if (activity != null) {
                this.f42775c = c1Var;
                this.f42776d = a0Var2;
                this.f42777e = 1;
                if (c1Var.a(activity, a0Var3, this) == f10) {
                    return f10;
                }
            }
            a0Var = a0Var2;
        } else if (i10 == 1) {
            a0Var = this.f42776d;
            c1Var = this.f42775c;
            y.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0Var.f47280d = c1Var;
        C7114a0 a0Var4 = this.f42778f;
        C17642l<? super D3, C16807N> lVar = a0Var4.f47281e;
        if (lVar != null) {
            lVar.invoke(new D3(new k1.a(o.f45608o), new k1.a(o.f45607n), new C7156v0.b(b8.l.f45529c), new L4(o.f45606m, new C6959w2(a0Var4)), (L4) null, 16));
        }
        return C16807N.f139792a;
    }
}
