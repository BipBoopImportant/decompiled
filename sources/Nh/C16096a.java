package NH;

import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nI.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004Bi\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012H\u0010\u000b\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n0\u0006\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0012J\u001b\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016RV\u0010\u000b\u001aD\u0012@\u0012>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\n0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\f\u001a\u00028\u00008\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"\"\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"LNH/a;", "", "TSubject", "TContext", "LNH/e;", "context", "", "Lkotlin/Function3;", "LdI/e;", "LXH/N;", "Lio/ktor/util/pipeline/PipelineInterceptorFunction;", "interceptors", "subject", "LdI/i;", "coroutineContext", "<init>", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;LdI/i;)V", "i", "(LdI/e;)Ljava/lang/Object;", "h", "()V", "f", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "e", "initial", "a", "b", "Ljava/util/List;", "c", "LdI/i;", "getCoroutineContext", "()LdI/i;", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "j", "(Ljava/lang/Object;)V", "", "I", "index", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: NH.a  reason: case insensitive filesystem */
public final class C16096a<TSubject, TContext> extends e<TSubject, TContext> {

    /* renamed from: b  reason: collision with root package name */
    private final List<q<e<TSubject, TContext>, TSubject, C17164e<? super C16807N>, Object>> f136502b;

    /* renamed from: c  reason: collision with root package name */
    private final C17168i f136503c;

    /* renamed from: d  reason: collision with root package name */
    private TSubject f136504d;

    /* renamed from: e  reason: collision with root package name */
    private int f136505e;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", l = {80}, m = "proceedLoop")
    /* renamed from: NH.a$a  reason: collision with other inner class name */
    static final class C3353a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f136506c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f136507d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16096a<TSubject, TContext> f136508e;

        /* renamed from: f  reason: collision with root package name */
        int f136509f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3353a(C16096a<TSubject, TContext> aVar, C17164e<? super C3353a> eVar) {
            super(eVar);
            this.f136508e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f136507d = obj;
            this.f136509f |= Integer.MIN_VALUE;
            return this.f136508e.i(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16096a(TContext tcontext, List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super C17164e<? super C16807N>, ? extends Object>> list, TSubject tsubject, C17168i iVar) {
        super(tcontext);
        C17542s.j(tcontext, "context");
        C17542s.j(list, "interceptors");
        C17542s.j(tsubject, "subject");
        C17542s.j(iVar, "coroutineContext");
        this.f136502b = list;
        this.f136503c = iVar;
        this.f136504d = tsubject;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(dI.C17164e<? super TSubject> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof NH.C16096a.C3353a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            NH.a$a r0 = (NH.C16096a.C3353a) r0
            int r1 = r0.f136509f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f136509f = r1
            goto L_0x0018
        L_0x0013:
            NH.a$a r0 = new NH.a$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f136507d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f136509f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r2 = r0.f136506c
            NH.a r2 = (NH.C16096a) r2
            XH.y.b(r7)
            goto L_0x0039
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            XH.y.b(r7)
            r2 = r6
        L_0x0039:
            int r7 = r2.f136505e
            r4 = -1
            if (r7 != r4) goto L_0x003f
            goto L_0x004a
        L_0x003f:
            java.util.List<nI.q<NH.e<TSubject, TContext>, TSubject, dI.e<? super XH.N>, java.lang.Object>> r4 = r2.f136502b
            int r5 = r4.size()
            if (r7 < r5) goto L_0x004f
            r2.h()
        L_0x004a:
            java.lang.Object r7 = r2.c()
            return r7
        L_0x004f:
            java.lang.Object r4 = r4.get(r7)
            nI.q r4 = (nI.q) r4
            int r7 = r7 + 1
            r2.f136505e = r7
            java.lang.String r7 = "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }"
            kotlin.jvm.internal.C17542s.h(r4, r7)
            java.lang.Object r7 = r2.c()
            r0.f136506c = r2
            r0.f136509f = r3
            java.lang.Object r7 = r4.invoke(r2, r7, r0)
            if (r7 != r1) goto L_0x0039
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: NH.C16096a.i(dI.e):java.lang.Object");
    }

    public Object a(TSubject tsubject, C17164e<? super TSubject> eVar) {
        this.f136505e = 0;
        j(tsubject);
        return e(eVar);
    }

    public TSubject c() {
        return this.f136504d;
    }

    public Object e(C17164e<? super TSubject> eVar) {
        int i10 = this.f136505e;
        if (i10 < 0) {
            return c();
        }
        if (i10 < this.f136502b.size()) {
            return i(eVar);
        }
        h();
        return c();
    }

    public Object f(TSubject tsubject, C17164e<? super TSubject> eVar) {
        j(tsubject);
        return e(eVar);
    }

    public C17168i getCoroutineContext() {
        return this.f136503c;
    }

    public void h() {
        this.f136505e = -1;
    }

    public void j(TSubject tsubject) {
        C17542s.j(tsubject, "<set-?>");
        this.f136504d = tsubject;
    }
}
