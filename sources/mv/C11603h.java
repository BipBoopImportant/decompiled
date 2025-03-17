package mv;

import HJ.C15854t;
import KJ.C15985a;
import QJ.C16297b0;
import QJ.C16310i;
import QJ.C16311i0;
import QJ.F0;
import QJ.M;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.core.model.Image;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import hv.C11385a;
import hv.C11387c;
import hv.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kv.C11533a;
import lv.C11573a;
import mv.C11602g;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\f¨\u0006\u000e"}, d2 = {"Lmv/h;", "Landroidx/lifecycle/f0;", "<init>", "()V", "LTJ/B;", "Lmv/g;", "m", "LTJ/B;", "_uiState", "LTJ/P;", "n", "LTJ/P;", "()LTJ/P;", "uiState", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.h  reason: case insensitive filesystem */
public final class C11603h extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C16505B<C11602g> f99707m;

    /* renamed from: n  reason: collision with root package name */
    private final C16519P<C11602g> f99708n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.liveshopping.impl.presentation.viewmodel.LiveShoppingViewModel$2", f = "LiveShoppingViewModel.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: mv.h$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99709c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C11603h f99710d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Lkv/a;", "<anonymous>", "(LQJ/Q;)Lkv/a;"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.liveshopping.impl.presentation.viewmodel.LiveShoppingViewModel$2$response$1", f = "LiveShoppingViewModel.kt", l = {47}, m = "invokeSuspend")
        /* renamed from: mv.h$a$a  reason: collision with other inner class name */
        static final class C2300a extends l implements p<Q, C17164e<? super C11533a>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f99711c;

            C2300a(C17164e<? super C2300a> eVar) {
                super(2, eVar);
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2300a(eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C11533a> eVar) {
                return ((C2300a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f99711c;
                if (i10 == 0) {
                    y.b(obj);
                    this.f99711c = 1;
                    if (C16297b0.b(2000, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return new C11533a(C11573a.b(), C15985a.b(C11573a.b()), C15985a.b(C11573a.a(), C11387c.h(C11573a.a(), (Boolean) null, (Boolean) null, (List) null, (List) null, (String) null, (Boolean) null, (Boolean) null, "2", (Image) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (List) null, (C11385a) null, (d) null, (String) null, 1048447, (Object) null)), C15985a.b("Bedroom", "Kitchen"), C15985a.a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11603h hVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f99710d = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f99710d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f99709c;
            if (i10 == 0) {
                y.b(obj);
                M b10 = C16311i0.b();
                C2300a aVar = new C2300a((C17164e<? super C2300a>) null);
                this.f99709c = 1;
                obj = C16310i.g(b10, aVar, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f99710d.f99707m.setValue(new C11602g.a((C11533a) obj));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"mv/h$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mv.h$b */
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11603h f99712a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, C11603h hVar) {
            super(aVar);
            this.f99712a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C11603h hVar = this.f99712a;
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Failed to get live shopping screen data", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f99712a.f99707m.setValue(C11602g.b.f99705a);
        }
    }

    public C11603h() {
        C11602g.c cVar = C11602g.c.f99706a;
        C16505B<C11602g> a10 = C16521S.a(cVar);
        this.f99707m = a10;
        this.f99708n = C16534i.c0(a10, g0.a(this), ip.f.a(), cVar);
        F0 unused = C16314k.d(g0.a(this), new b(N.f137593c0, this), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
    }

    public final C16519P<C11602g> m() {
        return this.f99708n;
    }
}
