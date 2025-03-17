package Kg;

import D4.C6429c;
import D4.M;
import Gg.c;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.app.inspire.b;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import zr.d;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010 8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R#\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0&8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"LKg/b;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LIg/a;", "inspirePaginationManager", "LGg/c;", "inspireAnalytics", "LCx/b;", "publisherTokenManager", "<init>", "(Landroidx/lifecycle/U;LIg/a;LGg/c;LCx/b;)V", "", "filterName", "LXH/N;", "E", "(Ljava/lang/String;)V", "F", "()V", "Lcom/ingka/ikea/app/inspire/b;", "event", "D", "(Lcom/ingka/ikea/app/inspire/b;)V", "m", "LIg/a;", "n", "LGg/c;", "o", "Ljava/lang/String;", "preAppliedFilter", "p", "preAppliedInspirationId", "Lzr/d;", "q", "Lzr/d;", "allInspirationFilter", "r", "preAppliedFilterValue", "LTJ/g;", "LD4/M;", "LKg/a;", "s", "LTJ/g;", "C", "()LTJ/g;", "sectionData", "inspire-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Ig.a f61537m;

    /* renamed from: n  reason: collision with root package name */
    private final c f61538n;

    /* renamed from: o  reason: collision with root package name */
    private final String f61539o;

    /* renamed from: p  reason: collision with root package name */
    private final String f61540p;

    /* renamed from: q  reason: collision with root package name */
    private final d f61541q = d.f107570e.a();

    /* renamed from: r  reason: collision with root package name */
    private final d f61542r;

    /* renamed from: s  reason: collision with root package name */
    private final C16532g<M<a>> f61543s;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.inspire.viewmodel.InspireViewModel$special$$inlined$flatMapLatest$1", f = "InspireViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends l implements q<C16533h<? super M<a>>, String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f61544c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f61545d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f61546e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f61547f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, b bVar) {
            super(3, eVar);
            this.f61547f = bVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super M<a>> hVar, String str, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f61547f);
            aVar.f61545d = hVar;
            aVar.f61546e = str;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f61544c;
            if (i10 == 0) {
                y.b(obj);
                String str = (String) this.f61546e;
                C16532g<M<a>> a10 = this.f61547f.f61537m.a();
                this.f61544c = 1;
                if (C16534i.x((C16533h) this.f61545d, a10, this) == f10) {
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

    public b(U u10, Ig.a aVar, c cVar, Cx.b bVar) {
        d dVar;
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "inspirePaginationManager");
        C17542s.j(cVar, "inspireAnalytics");
        C17542s.j(bVar, "publisherTokenManager");
        this.f61537m = aVar;
        this.f61538n = cVar;
        String str = (String) u10.f("filter");
        this.f61539o = str;
        String str2 = (String) u10.f("inspirationId");
        this.f61540p = str2;
        if (str != null) {
            dVar = new d(str, "", true, str2 != null ? C16877v.e(str2) : null);
        } else {
            dVar = null;
        }
        this.f61542r = dVar;
        this.f61543s = C6429c.a(C16534i.g0(bVar.b(), new a((C17164e) null, this)), g0.a(this));
        if (dVar != null) {
            aVar.c(dVar);
        }
    }

    public final C16532g<M<a>> C() {
        return this.f61543s;
    }

    public final void D(com.ingka.ikea.app.inspire.b bVar) {
        C17542s.j(bVar, "event");
        if (bVar instanceof b.C1235b) {
            this.f61538n.e(((b.C1235b) bVar).a(), this.f61537m.b().c());
        } else if (bVar instanceof b.e) {
            b.e eVar = (b.e) bVar;
            this.f61538n.d(eVar.a(), eVar.c(), this.f61537m.b().c());
        } else if (bVar instanceof b.d) {
            b.d dVar = (b.d) bVar;
            this.f61538n.a(dVar.a(), dVar.b(), this.f61537m.b().c());
        } else if (bVar instanceof b.c) {
            b.c cVar = (b.c) bVar;
            this.f61538n.b(cVar.a().b(), this.f61537m.b().c(), cVar.b(), cVar.a().d());
        } else if (!(bVar instanceof b.a)) {
            throw new t();
        }
    }

    public final void E(String str) {
        C17542s.j(str, "filterName");
        this.f61538n.c(str);
        this.f61537m.c(new d(str, "", true, (List<String>) null));
    }

    public final void F() {
        this.f61537m.c(this.f61541q);
    }
}
