package a9;

import I2.C4600b0;
import QJ.C16320n;
import QJ.C16324p;
import XH.C16807N;
import XH.x;
import android.view.View;
import com.contentsquare.android.sdk.X0;
import dI.C17164e;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

/* renamed from: a9.k5  reason: case insensitive filesystem */
public final class C6867k5 {

    /* renamed from: a9.k5$a */
    public static final class a extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f42659c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f42660d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view, b bVar) {
            super(1);
            this.f42659c = view;
            this.f42660d = bVar;
        }

        public final Object invoke(Object obj) {
            Throwable th2 = (Throwable) obj;
            this.f42659c.removeOnLayoutChangeListener(this.f42660d);
            return C16807N.f139792a;
        }
    }

    /* renamed from: a9.k5$b */
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C16320n<C16807N> f42661a;

        public b(C16324p pVar) {
            this.f42661a = pVar;
        }

        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            C17542s.j(view, "view");
            view.removeOnLayoutChangeListener(this);
            C16320n<C16807N> nVar = this.f42661a;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(C16807N.f139792a));
        }
    }

    public static final Object a(View view, X0.a aVar) {
        C16324p pVar = new C16324p(C17187b.c(aVar), 1);
        pVar.C();
        C6803c5 c5Var = new C6803c5(pVar);
        pVar.K(new S4(view, c5Var));
        view.postOnAnimation(c5Var);
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(aVar);
        }
        return w10 == C17187b.f() ? w10 : C16807N.f139792a;
    }

    public static final Object b(View view, C17164e<? super C16807N> eVar) {
        if (C4600b0.S(view) && !view.isLayoutRequested()) {
            return C16807N.f139792a;
        }
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        b bVar = new b(pVar);
        pVar.K(new a(view, bVar));
        view.addOnLayoutChangeListener(bVar);
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            h.c(eVar);
        }
        return w10 == C17187b.f() ? w10 : C16807N.f139792a;
    }
}
