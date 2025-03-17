package mn;

import Il.b;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import gp.C11343b;
import gp.C11346e;
import in.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0019"}, d2 = {"Lmn/a;", "Lgp/b;", "Lin/e;", "browseRepository", "LQJ/M;", "dispatcher", "LQJ/Q;", "scope", "<init>", "(Lin/e;LQJ/M;LQJ/Q;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "Lin/e;", "LQJ/M;", "c", "LQJ/Q;", "Lgp/e;", "d", "Lgp/e;", "()Lgp/e;", "taskId", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mn.a  reason: case insensitive filesystem */
public final class C11585a implements C11343b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final e f99627a;

    /* renamed from: b  reason: collision with root package name */
    private final M f99628b;

    /* renamed from: c  reason: collision with root package name */
    private final Q f99629c;

    /* renamed from: d  reason: collision with root package name */
    private final C11346e f99630d = C11346e.PRE_FETCH_BROWSE_DATABASE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.browseandsearch.browse.datalayer.impl.tasks.PreFetchBrowseDatabaseTask$execute$2", f = "PreFetchBrowseDatabaseTask.kt", l = {35}, m = "invokeSuspend")
    /* renamed from: mn.a$a  reason: collision with other inner class name */
    static final class C2293a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99631c;

        /* renamed from: d  reason: collision with root package name */
        Object f99632d;

        /* renamed from: e  reason: collision with root package name */
        Object f99633e;

        /* renamed from: f  reason: collision with root package name */
        int f99634f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Object f99635g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C11585a f99636h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2293a(Object obj, C11585a aVar, C17164e<? super C2293a> eVar) {
            super(2, eVar);
            this.f99635g = obj;
            this.f99636h = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2293a(this.f99635g, this.f99636h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C2293a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f99634f;
            if (i10 == 0) {
                y.b(obj);
                Object obj2 = this.f99635g;
                b bVar = null;
                Il.e eVar = obj2 instanceof Il.e ? (Il.e) obj2 : null;
                if (eVar != null) {
                    bVar = eVar.a();
                }
                boolean z10 = bVar == b.REGION_CHANGED;
                e c10 = this.f99636h.f99627a;
                this.f99632d = eVar;
                this.f99633e = obj2;
                this.f99631c = z10 ? 1 : 0;
                this.f99634f = 1;
                if (c10.a(z10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Il.e eVar2 = (Il.e) this.f99632d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public C11585a(e eVar, M m10, Q q10) {
        C17542s.j(eVar, "browseRepository");
        C17542s.j(m10, "dispatcher");
        C17542s.j(q10, "scope");
        this.f99627a = eVar;
        this.f99628b = m10;
        this.f99629c = q10;
    }

    public C11346e a() {
        return this.f99630d;
    }

    public Object b(Object obj, C17164e<? super Boolean> eVar) {
        F0 unused = C16314k.d(this.f99629c, this.f99628b, (T) null, new C2293a(obj, this, (C17164e<? super C2293a>) null), 2, (Object) null);
        return kotlin.coroutines.jvm.internal.b.a(true);
    }
}
