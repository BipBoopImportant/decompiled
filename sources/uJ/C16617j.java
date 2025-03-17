package UJ;

import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16422A;
import SJ.C16428d;
import SJ.C16447w;
import SJ.C16449y;
import TJ.C16532g;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H@¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LUJ/j;", "T", "LUJ/e;", "", "LTJ/g;", "flows", "LdI/i;", "context", "", "capacity", "LSJ/d;", "onBufferOverflow", "<init>", "(Ljava/lang/Iterable;LdI/i;ILSJ/d;)V", "j", "(LdI/i;ILSJ/d;)LUJ/e;", "LQJ/Q;", "scope", "LSJ/A;", "n", "(LQJ/Q;)LSJ/A;", "LSJ/y;", "LXH/N;", "i", "(LSJ/y;LdI/e;)Ljava/lang/Object;", "d", "Ljava/lang/Iterable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.j  reason: case insensitive filesystem */
public final class C16617j<T> extends C16612e<T> {

    /* renamed from: d  reason: collision with root package name */
    private final Iterable<C16532g<T>> f139129d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: UJ.j$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f139130c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16532g<T> f139131d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16633z<T> f139132e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16532g<? extends T> gVar, C16633z<T> zVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f139131d = gVar;
            this.f139132e = zVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f139131d, this.f139132e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f139130c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<T> gVar = this.f139131d;
                C16633z<T> zVar = this.f139132e;
                this.f139130c = 1;
                if (gVar.collect(zVar, this) == f10) {
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16617j(Iterable iterable, C17168i iVar, int i10, C16428d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i11 & 2) != 0 ? C17169j.f142968a : iVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? C16428d.SUSPEND : dVar);
    }

    /* access modifiers changed from: protected */
    public Object i(C16449y<? super T> yVar, C17164e<? super C16807N> eVar) {
        C16633z zVar = new C16633z(yVar);
        for (C16532g<T> aVar : this.f139129d) {
            F0 unused = C16314k.d(yVar, (C17168i) null, (T) null, new a(aVar, zVar, (C17164e<? super a>) null), 3, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: protected */
    public C16612e<T> j(C17168i iVar, int i10, C16428d dVar) {
        return new C16617j(this.f139129d, iVar, i10, dVar);
    }

    public C16422A<T> n(Q q10) {
        return C16447w.c(q10, this.f139096a, this.f139097b, l());
    }

    public C16617j(Iterable<? extends C16532g<? extends T>> iterable, C17168i iVar, int i10, C16428d dVar) {
        super(iVar, i10, dVar);
        this.f139129d = iterable;
    }
}
