package vy;

import KJ.C15985a;
import KJ.C15987c;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.X;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.room.impl.navigation.RoomRoute;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import nI.p;
import ry.C15006a;
import sy.c;
import uy.d;
import vy.f;
import vy.h;
import x4.O;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0011\u0010\u001fR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lvy/b;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lry/a;", "roomRepository", "Luy/d$b;", "roomInternalNavigationFactory", "Lvy/f$a;", "slotMapperFactory", "<init>", "(Landroidx/lifecycle/U;Lry/a;Luy/d$b;Lvy/f$a;)V", "LXH/N;", "E", "()V", "F", "G", "m", "Lry/a;", "Lcom/ingka/ikea/room/impl/navigation/RoomRoute;", "n", "Lcom/ingka/ikea/room/impl/navigation/RoomRoute;", "roomRoute", "LTJ/B;", "Lvy/h;", "o", "LTJ/B;", "_uiState", "LTJ/P;", "p", "LTJ/P;", "()LTJ/P;", "uiState", "LSJ/j;", "Luy/d$a;", "q", "LSJ/j;", "_navigationActions", "LTJ/g;", "r", "LTJ/g;", "D", "()LTJ/g;", "navigationActions", "Luy/d;", "s", "Luy/d;", "roomInternalNavigation", "Lvy/f;", "t", "Lvy/f;", "slotMapper", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C15006a f131559m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final RoomRoute f131560n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C16505B<h> f131561o;

    /* renamed from: p  reason: collision with root package name */
    private final C16519P<h> f131562p;

    /* renamed from: q  reason: collision with root package name */
    private final C16434j<d.a> f131563q;

    /* renamed from: r  reason: collision with root package name */
    private final C16532g<d.a> f131564r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final d f131565s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final f f131566t;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.room.impl.presentation.RoomViewModel$loadRoom$1", f = "RoomViewModel.kt", l = {65}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131567c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f131568d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f131568d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f131568d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f131567c;
            if (i10 == 0) {
                y.b(obj);
                C15006a i11 = this.f131568d.f131559m;
                String a10 = this.f131568d.f131560n.a();
                this.f131567c = 1;
                obj2 = i11.a(a10, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = this.f131568d;
            if (x.e(obj2) == null) {
                c cVar = (c) obj2;
                C15987c<sy.d> a11 = cVar.a();
                f k10 = bVar.f131566t;
                ArrayList arrayList = new ArrayList();
                for (sy.d a12 : a11) {
                    wy.l a13 = k10.a(a12);
                    if (a13 != null) {
                        arrayList.add(a13);
                    }
                }
                C15987c h10 = C15985a.h(arrayList);
                if (!h10.isEmpty()) {
                    bVar.f131561o.setValue(new h.b(cVar.b(), h10));
                } else {
                    bVar.f131561o.setValue(new h.a(cVar.b()));
                }
            } else {
                C16505B C10 = bVar.f131561o;
                do {
                    value = C10.getValue();
                } while (!C10.e(value, new h.a(((h) value).getTitle())));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.room.impl.presentation.RoomViewModel$onBackClicked$1", f = "RoomViewModel.kt", l = {52}, m = "invokeSuspend")
    /* renamed from: vy.b$b  reason: collision with other inner class name */
    static final class C3259b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131569c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f131570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3259b(b bVar, C17164e<? super C3259b> eVar) {
            super(2, eVar);
            this.f131570d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3259b(this.f131570d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3259b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f131569c;
            if (i10 == 0) {
                y.b(obj);
                d h10 = this.f131570d.f131565s;
                d.a.C3254a aVar = d.a.C3254a.f131391b;
                this.f131569c = 1;
                if (h10.a(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public b(U u10, C15006a aVar, d.b bVar, f.a aVar2) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "roomRepository");
        C17542s.j(bVar, "roomInternalNavigationFactory");
        C17542s.j(aVar2, "slotMapperFactory");
        this.f131559m = aVar;
        this.f131560n = (RoomRoute) O.a(u10, P.b(RoomRoute.class), X.j());
        C16505B<h> a10 = C16521S.a(new h.c((String) null));
        this.f131561o = a10;
        this.f131562p = C16534i.c(a10);
        C16434j<d.a> b10 = C16437m.b(0, (C16428d) null, (C17642l) null, 7, (Object) null);
        this.f131563q = b10;
        this.f131564r = C16534i.V(b10);
        d a11 = bVar.a(b10);
        this.f131565s = a11;
        this.f131566t = aVar2.a(a11);
        E();
    }

    private final void E() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    public final C16532g<d.a> D() {
        return this.f131564r;
    }

    public final void F() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C3259b(this, (C17164e<? super C3259b>) null), 3, (Object) null);
    }

    public final void G() {
        h value;
        C16505B<h> b10 = this.f131561o;
        do {
            value = b10.getValue();
        } while (!b10.e(value, new h.c(value.getTitle())));
        E();
    }

    public final C16519P<h> m() {
        return this.f131562p;
    }
}
