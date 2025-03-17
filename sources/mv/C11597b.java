package mv;

import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import gv.C11364a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import mv.C11596a;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, d2 = {"Lmv/b;", "Landroidx/lifecycle/f0;", "Lgv/a;", "getEntrypointDataUseCase", "<init>", "(Lgv/a;)V", "m", "Lgv/a;", "LTJ/B;", "Lmv/a;", "n", "LTJ/B;", "_uiState", "LTJ/P;", "o", "LTJ/P;", "()LTJ/P;", "uiState", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.b  reason: case insensitive filesystem */
public final class C11597b extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C11364a f99691m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C16505B<C11596a> f99692n;

    /* renamed from: o  reason: collision with root package name */
    private final C16519P<C11596a> f99693o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.liveshopping.impl.presentation.viewmodel.LiveShoppingEntryPointViewModel$2", f = "LiveShoppingEntryPointViewModel.kt", l = {43, 43}, m = "invokeSuspend")
    /* renamed from: mv.b$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99694c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C11597b f99695d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11597b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f99695d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f99695d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r4.f99694c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                XH.y.b(r5)
                goto L_0x003b
            L_0x0012:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x001a:
                XH.y.b(r5)
                goto L_0x0030
            L_0x001e:
                XH.y.b(r5)
                mv.b r5 = r4.f99695d
                gv.a r5 = r5.f99691m
                r4.f99694c = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L_0x0030
                return r0
            L_0x0030:
                TJ.g r5 = (TJ.C16532g) r5
                r4.f99694c = r2
                java.lang.Object r5 = TJ.C16534i.B(r5, r4)
                if (r5 != r0) goto L_0x003b
                return r0
            L_0x003b:
                XH.x r5 = (XH.x) r5
                java.lang.Object r5 = r5.j()
                mv.b r0 = r4.f99695d
                java.lang.Throwable r1 = XH.x.e(r5)
                if (r1 != 0) goto L_0x0062
                hv.b r5 = (hv.C11386b) r5
                TJ.B r1 = r0.f99692n
            L_0x004f:
                java.lang.Object r0 = r1.getValue()
                r2 = r0
                mv.a r2 = (mv.C11596a) r2
                mv.a$a r2 = new mv.a$a
                r2.<init>(r5)
                boolean r0 = r1.e(r0, r2)
                if (r0 == 0) goto L_0x004f
                goto L_0x0075
            L_0x0062:
                TJ.B r5 = r0.f99692n
            L_0x0066:
                java.lang.Object r0 = r5.getValue()
                r1 = r0
                mv.a r1 = (mv.C11596a) r1
                mv.a$b r1 = mv.C11596a.b.f99689a
                boolean r0 = r5.e(r0, r1)
                if (r0 == 0) goto L_0x0066
            L_0x0075:
                XH.N r5 = XH.C16807N.f139792a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: mv.C11597b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"mv/b$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mv.b$b  reason: collision with other inner class name */
    public static final class C2299b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11597b f99696a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2299b(N.a aVar, C11597b bVar) {
            super(aVar);
            this.f99696a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C11597b bVar = this.f99696a;
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Failed to get live shopping", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f99696a.f99692n.setValue(C11596a.b.f99689a);
        }
    }

    public C11597b(C11364a aVar) {
        C17542s.j(aVar, "getEntrypointDataUseCase");
        this.f99691m = aVar;
        C11596a.c cVar = C11596a.c.f99690a;
        C16505B<C11596a> a10 = C16521S.a(cVar);
        this.f99692n = a10;
        this.f99693o = C16534i.c0(a10, g0.a(this), ip.f.a(), cVar);
        F0 unused = C16314k.d(g0.a(this), new C2299b(N.f137593c0, this), (T) null, new a(this, (C17164e<? super a>) null), 2, (Object) null);
    }

    public final C16519P<C11596a> m() {
        return this.f99693o;
    }
}
