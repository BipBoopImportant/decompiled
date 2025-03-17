package lu;

import EB.C12832d;
import FB.C12860a;
import QJ.M;
import QJ.Q;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import gp.C11343b;
import gp.C11346e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import lu.C11569b;
import nI.q;
import tf.C10253a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0013\u0010\u001f¨\u0006!"}, d2 = {"Llu/a;", "Lgp/b;", "LFB/a;", "localStoreSelectionRepository", "Llu/b;", "disableStoreModeUseCase", "Ltf/a;", "killSwitchRepository", "LQJ/Q;", "appScope", "LQJ/M;", "ioDispatcher", "<init>", "(LFB/a;Llu/b;Ltf/a;LQJ/Q;LQJ/M;)V", "", "param", "", "b", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "a", "LFB/a;", "Llu/b;", "c", "Ltf/a;", "d", "LQJ/Q;", "e", "LQJ/M;", "Lgp/e;", "f", "Lgp/e;", "()Lgp/e;", "taskId", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lu.a  reason: case insensitive filesystem */
public final class C11568a implements C11343b {

    /* renamed from: a  reason: collision with root package name */
    private final C12860a f99488a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C11569b f99489b;

    /* renamed from: c  reason: collision with root package name */
    private final C10253a f99490c;

    /* renamed from: d  reason: collision with root package name */
    private final Q f99491d;

    /* renamed from: e  reason: collision with root package name */
    private final M f99492e;

    /* renamed from: f  reason: collision with root package name */
    private final C11346e f99493f = C11346e.DISABLE_STORE_MODE_ON_STORE_SWITCH;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEB/d;", "current", "new", "<anonymous>", "(LEB/d;LEB/d;)LEB/d;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storemode.usecase.DisableStoreModeOnStoreSwitchTask$execute$2", f = "DisableStoreModeOnStoreSwitchTask.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: lu.a$a  reason: collision with other inner class name */
    static final class C2277a extends l implements q<C12832d, C12832d, C17164e<? super C12832d>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99494c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f99495d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f99496e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11568a f99497f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2277a(C11568a aVar, C17164e<? super C2277a> eVar) {
            super(3, eVar);
            this.f99497f = aVar;
        }

        /* renamed from: i */
        public final Object invoke(C12832d dVar, C12832d dVar2, C17164e<? super C12832d> eVar) {
            C2277a aVar = new C2277a(this.f99497f, eVar);
            aVar.f99495d = dVar;
            aVar.f99496e = dVar2;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C12832d dVar;
            Object f10 = C17187b.f();
            int i10 = this.f99494c;
            if (i10 == 0) {
                y.b(obj);
                C12832d dVar2 = (C12832d) this.f99495d;
                C12832d dVar3 = (C12832d) this.f99496e;
                if (dVar2 == null || dVar3 == null || C17542s.e(dVar2.e(), dVar3.e())) {
                    return dVar3;
                }
                C11569b c10 = this.f99497f.f99489b;
                C11569b.a.C2279b bVar = C11569b.a.C2279b.f99499a;
                this.f99495d = dVar2;
                this.f99496e = dVar3;
                this.f99494c = 1;
                if (c10.a(bVar, this) == f10) {
                    return f10;
                }
                dVar = dVar3;
            } else if (i10 == 1) {
                dVar = (C12832d) this.f99496e;
                C12832d dVar4 = (C12832d) this.f99495d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return dVar;
        }
    }

    public C11568a(C12860a aVar, C11569b bVar, C10253a aVar2, Q q10, M m10) {
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(bVar, "disableStoreModeUseCase");
        C17542s.j(aVar2, "killSwitchRepository");
        C17542s.j(q10, "appScope");
        C17542s.j(m10, "ioDispatcher");
        this.f99488a = aVar;
        this.f99489b = bVar;
        this.f99490c = aVar2;
        this.f99491d = q10;
        this.f99492e = m10;
    }

    public C11346e a() {
        return this.f99493f;
    }

    public Object b(Object obj, C17164e<? super Boolean> eVar) {
        if (!this.f99490c.h()) {
            return b.a(true);
        }
        C16534i.M(C16534i.L(C16534i.Y(this.f99488a.b(), null, new C2277a(this, (C17164e<? super C2277a>) null)), this.f99492e), this.f99491d);
        return b.a(true);
    }
}
