package D4;

import TJ.C16532g;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001BM\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\rB7\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\u000eR)\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f8\u0006¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"LD4/K;", "", "Key", "Value", "LD4/L;", "config", "initialKey", "LD4/S;", "remoteMediator", "Lkotlin/Function0;", "LD4/P;", "pagingSourceFactory", "<init>", "(LD4/L;Ljava/lang/Object;LD4/S;LnI/a;)V", "(LD4/L;Ljava/lang/Object;LnI/a;)V", "LTJ/g;", "LD4/M;", "a", "LTJ/g;", "()LTJ/g;", "getFlow$annotations", "()V", "flow", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class K<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private final C16532g<M<Value>> f34117a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<C17164e<? super P<Key, Value>>, Object> {
        a(Object obj) {
            super(1, obj, Z.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: t */
        public final Object invoke(C17164e<? super P<Key, Value>> eVar) {
            return ((Z) this.receiver).b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "LD4/P;", "<anonymous>", "()LD4/P;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements C17642l<C17164e<? super P<Key, Value>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34118c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<P<Key, Value>> f34119d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17631a<? extends P<Key, Value>> aVar, C17164e<? super b> eVar) {
            super(1, eVar);
            this.f34119d = aVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new b(this.f34119d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super P<Key, Value>> eVar) {
            return ((b) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f34118c == 0) {
                y.b(obj);
                return this.f34119d.invoke();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public K(L l10, Key key, S<Key, Value> s10, C17631a<? extends P<Key, Value>> aVar) {
        C17642l lVar;
        C17542s.j(l10, "config");
        C17542s.j(aVar, "pagingSourceFactory");
        if (aVar instanceof Z) {
            lVar = new a(aVar);
        } else {
            lVar = new b(aVar, (C17164e<? super b>) null);
        }
        this.f34117a = new F(lVar, key, l10, s10).i();
    }

    public final C16532g<M<Value>> a() {
        return this.f34117a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public K(L l10, Key key, C17631a<? extends P<Key, Value>> aVar) {
        this(l10, key, (S) null, aVar);
        C17542s.j(l10, "config");
        C17542s.j(aVar, "pagingSourceFactory");
    }
}
