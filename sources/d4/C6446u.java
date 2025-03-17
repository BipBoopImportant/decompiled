package D4;

import D4.C6435i;
import D4.P;
import QJ.C16310i;
import QJ.Q;
import XH.C16807N;
import XH.t;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0013*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001#J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b8\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010!\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"LD4/u;", "", "Key", "Value", "LD4/P;", "LD4/P$a;", "params", "", "j", "(LD4/P$a;)I", "pageSize", "LXH/N;", "k", "(I)V", "LD4/P$b;", "f", "(LD4/P$a;LdI/e;)Ljava/lang/Object;", "LD4/Q;", "state", "d", "(LD4/Q;)Ljava/lang/Object;", "LdI/i;", "b", "LdI/i;", "fetchContext", "c", "I", "LD4/i;", "dataSource", "LD4/i;", "i", "()LD4/i;", "", "()Z", "jumpingSupported", "a", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.u  reason: case insensitive filesystem */
public final class C6446u<Key, Value> extends P<Key, Value> {

    /* renamed from: d  reason: collision with root package name */
    private static final a f34447d = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final C17168i f34448b;

    /* renamed from: c  reason: collision with root package name */
    private int f34449c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LD4/u$a;", "", "<init>", "()V", "", "PAGE_SIZE_NOT_SET", "I", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D4.u$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "LQJ/Q;", "LD4/P$b$b;", "<anonymous>", "(LQJ/Q;)LD4/P$b$b;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.kt", l = {110}, m = "invokeSuspend")
    /* renamed from: D4.u$b */
    static final class b extends l implements p<Q, C17164e<? super P.b.C0534b<Key, Value>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34450c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6446u<Key, Value> f34451d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C6435i.b<Key> f34452e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ P.a<Key> f34453f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6446u<Key, Value> uVar, C6435i.b<Key> bVar, P.a<Key> aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f34451d = uVar;
            this.f34452e = bVar;
            this.f34453f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f34451d, this.f34452e, this.f34453f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super P.b.C0534b<Key, Value>> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            int i10 = this.f34450c;
            Object obj2 = null;
            if (i10 == 0) {
                y.b(obj);
                this.f34451d.i();
                this.f34450c = 1;
                throw null;
            } else if (i10 == 1) {
                y.b(obj);
                P.a<Key> aVar = this.f34453f;
                C6435i.a aVar2 = (C6435i.a) obj;
                List<Value> list = aVar2.f34355a;
                Object d10 = (!list.isEmpty() || !(aVar instanceof P.a.c)) ? aVar2.d() : null;
                if (!aVar2.f34355a.isEmpty() || !(aVar instanceof P.a.C0532a)) {
                    obj2 = aVar2.c();
                }
                return new P.b.C0534b(list, d10, obj2, aVar2.b(), aVar2.a());
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final int j(P.a<Key> aVar) {
        return (!(aVar instanceof P.a.d) || aVar.b() % 3 != 0) ? aVar.b() : aVar.b() / 3;
    }

    public boolean b() {
        throw null;
    }

    public Key d(Q<Key, Value> q10) {
        C17542s.j(q10, "state");
        throw null;
    }

    public Object f(P.a<Key> aVar, C17164e<? super P.b<Key, Value>> eVar) {
        C6449x xVar;
        if (aVar instanceof P.a.d) {
            xVar = C6449x.REFRESH;
        } else if (aVar instanceof P.a.C0532a) {
            xVar = C6449x.APPEND;
        } else if (aVar instanceof P.a.c) {
            xVar = C6449x.PREPEND;
        } else {
            throw new t();
        }
        C6449x xVar2 = xVar;
        if (this.f34449c == Integer.MIN_VALUE) {
            System.out.println("WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.f34449c = j(aVar);
        }
        return C16310i.g(this.f34448b, new b(this, new C6435i.b(xVar2, aVar.a(), aVar.b(), aVar.c(), this.f34449c), aVar, (C17164e<? super b>) null), eVar);
    }

    public final C6435i<Key, Value> i() {
        return null;
    }

    public final void k(int i10) {
        int i11 = this.f34449c;
        if (i11 == Integer.MIN_VALUE || i10 == i11) {
            this.f34449c = i10;
            return;
        }
        throw new IllegalStateException(("Page size is already set to " + this.f34449c + '.').toString());
    }
}
