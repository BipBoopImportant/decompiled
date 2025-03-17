package UJ;

import QJ.Q;
import QJ.S;
import QJ.T;
import QJ.V;
import SJ.C16422A;
import SJ.C16428d;
import SJ.C16447w;
import SJ.C16449y;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H¤@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R6\u0010.\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140*\u0012\u0006\u0012\u0004\u0018\u00010+0)8@X\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00058@X\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"LUJ/e;", "T", "LUJ/q;", "LdI/i;", "context", "", "capacity", "LSJ/d;", "onBufferOverflow", "<init>", "(LdI/i;ILSJ/d;)V", "LTJ/g;", "k", "()LTJ/g;", "d", "(LdI/i;ILSJ/d;)LTJ/g;", "j", "(LdI/i;ILSJ/d;)LUJ/e;", "LSJ/y;", "scope", "LXH/N;", "i", "(LSJ/y;LdI/e;)Ljava/lang/Object;", "LQJ/Q;", "LSJ/A;", "n", "(LQJ/Q;)LSJ/A;", "LTJ/h;", "collector", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "", "g", "()Ljava/lang/String;", "toString", "a", "LdI/i;", "b", "I", "c", "LSJ/d;", "Lkotlin/Function2;", "LdI/e;", "", "l", "()LnI/p;", "collectToFun", "m", "()I", "produceCapacity", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.e  reason: case insensitive filesystem */
public abstract class C16612e<T> implements C16624q<T> {

    /* renamed from: a  reason: collision with root package name */
    public final C17168i f139096a;

    /* renamed from: b  reason: collision with root package name */
    public final int f139097b;

    /* renamed from: c  reason: collision with root package name */
    public final C16428d f139098c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
    /* renamed from: UJ.e$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f139099c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f139100d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16533h<T> f139101e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16612e<T> f139102f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C16533h<? super T> hVar, C16612e<T> eVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f139101e = hVar;
            this.f139102f = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f139101e, this.f139102f, eVar);
            aVar.f139100d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f139099c;
            if (i10 == 0) {
                y.b(obj);
                C16533h<T> hVar = this.f139101e;
                C16422A<T> n10 = this.f139102f.n((Q) this.f139100d);
                this.f139099c = 1;
                if (C16534i.w(hVar, n10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LSJ/y;", "it", "LXH/N;", "<anonymous>", "(LSJ/y;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: UJ.e$b */
    static final class b extends l implements p<C16449y<? super T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f139103c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f139104d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16612e<T> f139105e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C16612e<T> eVar, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f139105e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f139105e, eVar);
            bVar.f139104d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C16449y<? super T> yVar, C17164e<? super C16807N> eVar) {
            return ((b) create(yVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f139103c;
            if (i10 == 0) {
                y.b(obj);
                C16612e<T> eVar = this.f139105e;
                this.f139103c = 1;
                if (eVar.i((C16449y) this.f139104d, this) == f10) {
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

    public C16612e(C17168i iVar, int i10, C16428d dVar) {
        this.f139096a = iVar;
        this.f139097b = i10;
        this.f139098c = dVar;
    }

    static /* synthetic */ <T> Object h(C16612e<T> eVar, C16533h<? super T> hVar, C17164e<? super C16807N> eVar2) {
        Object f10 = S.f(new a(hVar, eVar, (C17164e<? super a>) null), eVar2);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    public Object collect(C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
        return h(this, hVar, eVar);
    }

    public C16532g<T> d(C17168i iVar, int i10, C16428d dVar) {
        C17168i plus = iVar.plus(this.f139096a);
        if (dVar == C16428d.SUSPEND) {
            int i11 = this.f139097b;
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2) {
                            i10 += i11;
                            if (i10 < 0) {
                                i10 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i10 = i11;
            }
            dVar = this.f139098c;
        }
        return (C17542s.e(plus, this.f139096a) && i10 == this.f139097b && dVar == this.f139098c) ? this : j(plus, i10, dVar);
    }

    /* access modifiers changed from: protected */
    public String g() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract Object i(C16449y<? super T> yVar, C17164e<? super C16807N> eVar);

    /* access modifiers changed from: protected */
    public abstract C16612e<T> j(C17168i iVar, int i10, C16428d dVar);

    public C16532g<T> k() {
        return null;
    }

    public final p<C16449y<? super T>, C17164e<? super C16807N>, Object> l() {
        return new b(this, (C17164e<? super b>) null);
    }

    public final int m() {
        int i10 = this.f139097b;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public C16422A<T> n(Q q10) {
        return C16447w.d(q10, this.f139096a, m(), this.f139098c, T.ATOMIC, (C17642l) null, l(), 16, (Object) null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String g10 = g();
        if (g10 != null) {
            arrayList.add(g10);
        }
        if (this.f139096a != C17169j.f142968a) {
            arrayList.add("context=" + this.f139096a);
        }
        if (this.f139097b != -3) {
            arrayList.add("capacity=" + this.f139097b);
        }
        if (this.f139098c != C16428d.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f139098c);
        }
        return V.a(this) + '[' + C16877v.G0(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null) + ']';
    }
}
