package androidx.compose.foundation;

import A1.K;
import G1.s0;
import G1.x0;
import L1.i;
import L1.v;
import L1.x;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5586I;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import o1.C5667g;
import p0.G;
import p0.w;
import r0.m;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002Bo\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0016\u001a\u00020\u0004*\u00020\u0015H@¢\u0006\u0004\b\u0016\u0010\u0017Jz\u0010\u0018\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0004*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010 \u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/f;", "", "Landroidx/compose/foundation/a;", "Lkotlin/Function0;", "LXH/N;", "onClick", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "Lr0/m;", "interactionSource", "Ln0/I;", "indicationNodeFactory", "", "enabled", "onClickLabel", "LL1/i;", "role", "<init>", "(LnI/a;Ljava/lang/String;LnI/a;LnI/a;Lr0/m;Ln0/I;ZLjava/lang/String;LL1/i;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LA1/K;", "P2", "(LA1/K;LdI/e;)Ljava/lang/Object;", "d3", "(LnI/a;Ljava/lang/String;LnI/a;LnI/a;Lr0/m;Ln0/I;ZLjava/lang/String;LL1/i;)V", "LL1/x;", "O2", "(LL1/x;)V", "J", "Ljava/lang/String;", "K", "LnI/a;", "L", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f extends a implements s0 {

    /* renamed from: J  reason: collision with root package name */
    private String f17619J;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public C17631a<C16807N> f17620K;
    /* access modifiers changed from: private */

    /* renamed from: L  reason: collision with root package name */
    public C17631a<C16807N> f17621L;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f17622c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.f17622c = fVar;
        }

        public final Boolean invoke() {
            C17631a c32 = this.f17622c.f17620K;
            if (c32 != null) {
                c32.invoke();
            }
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C5667g, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f17623c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(1);
            this.f17623c = fVar;
        }

        public final void a(long j10) {
            C17631a b32 = this.f17623c.f17621L;
            if (b32 != null) {
                b32.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C5667g) obj).v());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<C5667g, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f17624c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(1);
            this.f17624c = fVar;
        }

        public final void a(long j10) {
            C17631a c32 = this.f17624c.f17620K;
            if (c32 != null) {
                c32.invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C5667g) obj).v());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp0/w;", "Lo1/g;", "offset", "LXH/N;", "<anonymous>", "(Lp0/w;Lo1/g;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.CombinedClickableNodeImpl$clickPointerInput$4", f = "Clickable.kt", l = {787}, m = "invokeSuspend")
    static final class d extends l implements q<w, C5667g, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17625c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f17626d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ long f17627e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f17628f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar, C17164e<? super d> eVar) {
            super(3, eVar);
            this.f17628f = fVar;
        }

        public final Object i(w wVar, long j10, C17164e<? super C16807N> eVar) {
            d dVar = new d(this.f17628f, eVar);
            dVar.f17626d = wVar;
            dVar.f17627e = j10;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((w) obj, ((C5667g) obj2).v(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17625c;
            if (i10 == 0) {
                y.b(obj);
                w wVar = (w) this.f17626d;
                long j10 = this.f17627e;
                if (this.f17628f.U2()) {
                    f fVar = this.f17628f;
                    this.f17625c = 1;
                    if (fVar.W2(wVar, j10, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<C5667g, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f17629c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(1);
            this.f17629c = fVar;
        }

        public final void a(long j10) {
            if (this.f17629c.U2()) {
                this.f17629c.V2().invoke();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C5667g) obj).v());
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ f(C17631a aVar, String str, C17631a aVar2, C17631a aVar3, m mVar, C5586I i10, boolean z10, String str2, i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, str, aVar2, aVar3, mVar, i10, z10, str2, iVar);
    }

    public void O2(x xVar) {
        if (this.f17620K != null) {
            v.E(xVar, this.f17619J, new a(this));
        }
    }

    public Object P2(K k10, C17164e<? super C16807N> eVar) {
        Object i10 = G.i(k10, (!U2() || this.f17621L == null) ? null : new b(this), (!U2() || this.f17620K == null) ? null : new c(this), new d(this, (C17164e<? super d>) null), new e(this), eVar);
        return i10 == C17187b.f() ? i10 : C16807N.f139792a;
    }

    public void d3(C17631a<C16807N> aVar, String str, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, m mVar, C5586I i10, boolean z10, String str2, i iVar) {
        boolean z11;
        String str3 = str;
        C17631a<C16807N> aVar4 = aVar2;
        C17631a<C16807N> aVar5 = aVar3;
        if (!C17542s.e(this.f17619J, str)) {
            this.f17619J = str3;
            x0.b(this);
        }
        boolean z12 = false;
        if ((this.f17620K == null) != (aVar4 == null)) {
            R2();
            x0.b(this);
            z11 = true;
        } else {
            z11 = false;
        }
        this.f17620K = aVar4;
        boolean z13 = this.f17621L == null;
        if (aVar5 == null) {
            z12 = true;
        }
        if (z13 != z12) {
            z11 = true;
        }
        this.f17621L = aVar5;
        boolean z14 = U2() != z10 ? true : z11;
        a3(mVar, i10, z10, str2, iVar, aVar);
        if (z14) {
            Y2();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(C17631a<C16807N> aVar, String str, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, m mVar, C5586I i10, boolean z10, String str2, i iVar) {
        super(mVar, i10, z10, str2, iVar, aVar, (DefaultConstructorMarker) null);
        this.f17619J = str;
        this.f17620K = aVar2;
        this.f17621L = aVar3;
    }
}
