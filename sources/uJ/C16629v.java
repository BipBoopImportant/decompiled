package UJ;

import HJ.C15854t;
import QJ.I0;
import TJ.C16533h;
import XH.C16807N;
import XH.x;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import nI.q;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H@¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0000X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u001e\u00100\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"LUJ/v;", "T", "LTJ/h;", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/e;", "collector", "LdI/i;", "collectContext", "<init>", "(LTJ/h;LdI/i;)V", "LdI/e;", "LXH/N;", "uCont", "value", "", "m", "(LdI/e;Ljava/lang/Object;)Ljava/lang/Object;", "currentContext", "previousContext", "j", "(LdI/i;LdI/i;Ljava/lang/Object;)V", "LUJ/m;", "exception", "n", "(LUJ/m;Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "LXH/x;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "c", "LTJ/h;", "d", "LdI/i;", "", "e", "I", "collectContextSize", "f", "lastEmissionContext", "g", "LdI/e;", "completion_", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "getContext", "()LdI/i;", "context", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.v  reason: case insensitive filesystem */
public final class C16629v<T> extends d implements C16533h<T>, e {

    /* renamed from: c  reason: collision with root package name */
    public final C16533h<T> f139166c;

    /* renamed from: d  reason: collision with root package name */
    public final C17168i f139167d;

    /* renamed from: e  reason: collision with root package name */
    public final int f139168e;

    /* renamed from: f  reason: collision with root package name */
    private C17168i f139169f;

    /* renamed from: g  reason: collision with root package name */
    private C17164e<? super C16807N> f139170g;

    public C16629v(C16533h<? super T> hVar, C17168i iVar) {
        super(C16625r.f139160a, C17169j.f142968a);
        this.f139166c = hVar;
        this.f139167d = iVar;
        this.f139168e = ((Number) iVar.fold(0, new C16628u())).intValue();
    }

    private final void j(C17168i iVar, C17168i iVar2, T t10) {
        if (iVar2 instanceof C16620m) {
            n((C16620m) iVar2, t10);
        }
        C16632y.b(this, iVar);
    }

    /* access modifiers changed from: private */
    public static final int k(int i10, C17168i.b bVar) {
        return i10 + 1;
    }

    private final Object m(C17164e<? super C16807N> eVar, T t10) {
        C17168i context = eVar.getContext();
        I0.l(context);
        C17168i iVar = this.f139169f;
        if (iVar != context) {
            j(context, iVar, t10);
            this.f139169f = context;
        }
        this.f139170g = eVar;
        q a10 = C16630w.f139171a;
        C16533h<T> hVar = this.f139166c;
        C17542s.h(hVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        C17542s.h(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = a10.invoke(hVar, t10, this);
        if (!C17542s.e(invoke, C17187b.f())) {
            this.f139170g = null;
        }
        return invoke;
    }

    private final void n(C16620m mVar, Object obj) {
        throw new IllegalStateException(C15854t.m("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + mVar.f139154b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object emit(T t10, C17164e<? super C16807N> eVar) {
        try {
            Object m10 = m(eVar, t10);
            if (m10 == C17187b.f()) {
                h.c(eVar);
            }
            return m10 == C17187b.f() ? m10 : C16807N.f139792a;
        } catch (Throwable th2) {
            this.f139169f = new C16620m(th2, eVar.getContext());
            throw th2;
        }
    }

    public e getCallerFrame() {
        C17164e<? super C16807N> eVar = this.f139170g;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public C17168i getContext() {
        C17168i iVar = this.f139169f;
        return iVar == null ? C17169j.f142968a : iVar;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: protected */
    public Object invokeSuspend(Object obj) {
        Throwable e10 = x.e(obj);
        if (e10 != null) {
            this.f139169f = new C16620m(e10, getContext());
        }
        C17164e<? super C16807N> eVar = this.f139170g;
        if (eVar != null) {
            eVar.resumeWith(obj);
        }
        return C17187b.f();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
