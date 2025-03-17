package hD;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import aA.C13909a;
import dI.C17164e;
import eI.C17187b;
import kD.h;
import kD.j;
import kD.k;
import kD.o;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import lD.C14761c;
import lD.C14763e;
import nI.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LhD/f;", "LlD/e;", "LlD/c;", "getProfileFlow", "LaA/a;", "sessionManager", "<init>", "(LlD/c;LaA/a;)V", "LTJ/g;", "LkD/o;", "invoke", "()LTJ/g;", "a", "LlD/c;", "b", "LaA/a;", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hD.f  reason: case insensitive filesystem */
public final class C14534f implements C14763e {

    /* renamed from: a  reason: collision with root package name */
    private final C14761c f127479a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C13909a f127480b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "isLoggedIn", "LkD/j;", "profileResult", "LkD/o;", "<anonymous>", "(ZLkD/j;)LkD/o;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.useraccount.impl.usecase.GetUserInfoUseCaseImpl$invoke$1", f = "GetUserInfoUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: hD.f$a */
    static final class a extends l implements q<Boolean, j, C17164e<? super o>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f127481c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f127482d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f127483e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14534f f127484f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14534f fVar, C17164e<? super a> eVar) {
            super(3, eVar);
            this.f127484f = fVar;
        }

        public final Object i(boolean z10, j jVar, C17164e<? super o> eVar) {
            a aVar = new a(this.f127484f, eVar);
            aVar.f127482d = z10;
            aVar.f127483e = jVar;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), (j) obj2, (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f127481c == 0) {
                y.b(obj);
                boolean z10 = this.f127482d;
                h a10 = k.a((j) this.f127483e);
                return new o(this.f127484f.f127480b.a(), !z10 ? o.a.GUEST : (a10 == null || !a10.j()) ? o.a.REGULAR : o.a.FAMILY, a10, a10 != null ? a10.d() : null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C14534f(C14761c cVar, C13909a aVar) {
        C17542s.j(cVar, "getProfileFlow");
        C17542s.j(aVar, "sessionManager");
        this.f127479a = cVar;
        this.f127480b = aVar;
    }

    public C16532g<o> invoke() {
        return C16534i.s(C16534i.n(this.f127480b.n(), C16534i.s(this.f127479a.invoke()), new a(this, (C17164e<? super a>) null)));
    }
}
