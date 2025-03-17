package io.ktor.utils.io.internal;

import QJ.C16315k0;
import QJ.F0;
import XH.C16807N;
import XH.x;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0010\u0010\f\u001a\f0\u000bR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lio/ktor/utils/io/internal/b;", "", "T", "LdI/e;", "<init>", "()V", "LdI/i;", "context", "LXH/N;", "i", "(LdI/i;)V", "Lio/ktor/utils/io/internal/b$a;", "relation", "g", "(Lio/ktor/utils/io/internal/b$a;)V", "LQJ/F0;", "job", "", "exception", "j", "(LQJ/F0;Ljava/lang/Throwable;)V", "value", "d", "(Ljava/lang/Object;)V", "cause", "e", "(Ljava/lang/Throwable;)V", "actual", "f", "(LdI/e;)Ljava/lang/Object;", "LXH/x;", "result", "resumeWith", "getContext", "()LdI/i;", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b<T> implements C17164e<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f143734a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f143735b;
    private volatile /* synthetic */ Object jobCancellationHandler = null;
    private volatile /* synthetic */ Object state = null;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lio/ktor/utils/io/internal/b$a;", "Lkotlin/Function1;", "", "LXH/N;", "Lkotlinx/coroutines/CompletionHandler;", "LQJ/F0;", "job", "<init>", "(Lio/ktor/utils/io/internal/b;LQJ/F0;)V", "cause", "c", "(Ljava/lang/Throwable;)V", "a", "()V", "LQJ/F0;", "b", "()LQJ/F0;", "LQJ/k0;", "LQJ/k0;", "handler", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a implements C17642l<Throwable, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        private final F0 f143736a;

        /* renamed from: b  reason: collision with root package name */
        private C16315k0 f143737b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b<T> f143738c;

        public a(b bVar, F0 f02) {
            C17542s.j(f02, "job");
            this.f143738c = bVar;
            this.f143736a = f02;
            C16315k0 d10 = F0.a.d(f02, true, false, this, 2, (Object) null);
            if (f02.c()) {
                this.f143737b = d10;
            }
        }

        public final void a() {
            C16315k0 k0Var = this.f143737b;
            if (k0Var != null) {
                this.f143737b = null;
                k0Var.b();
            }
        }

        public final F0 b() {
            return this.f143736a;
        }

        public void c(Throwable th2) {
            this.f143738c.g(this);
            a();
            if (th2 != null) {
                this.f143738c.j(this.f143736a, th2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    static {
        Class<b> cls = b.class;
        Class<Object> cls2 = Object.class;
        f143734a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "state");
        f143735b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "jobCancellationHandler");
    }

    /* access modifiers changed from: private */
    public final void g(b<T>.defpackage.a aVar) {
        androidx.concurrent.futures.b.a(f143735b, this, aVar, (Object) null);
    }

    private final void i(C17168i iVar) {
        Object obj;
        a aVar;
        F0 f02 = (F0) iVar.get(F0.f137562d0);
        a aVar2 = (a) this.jobCancellationHandler;
        if ((aVar2 != null ? aVar2.b() : null) != f02) {
            if (f02 == null) {
                a aVar3 = (a) f143735b.getAndSet(this, (Object) null);
                if (aVar3 != null) {
                    aVar3.a();
                    return;
                }
                return;
            }
            a aVar4 = new a(this, f02);
            do {
                obj = this.jobCancellationHandler;
                aVar = (a) obj;
                if (aVar != null && aVar.b() == f02) {
                    aVar4.a();
                    return;
                }
            } while (!androidx.concurrent.futures.b.a(f143735b, this, obj, aVar4));
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void j(F0 f02, Throwable th2) {
        Object obj;
        C17164e eVar;
        do {
            obj = this.state;
            if (obj instanceof C17164e) {
                eVar = (C17164e) obj;
                if (eVar.getContext().get(F0.f137562d0) != f02) {
                    return;
                }
            } else {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f143734a, this, obj, (Object) null));
        C17542s.h(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
        x.a aVar = x.f139812b;
        eVar.resumeWith(x.b(y.a(th2)));
    }

    public final void d(T t10) {
        C17542s.j(t10, "value");
        resumeWith(x.b(t10));
        a aVar = (a) f143735b.getAndSet(this, (Object) null);
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void e(Throwable th2) {
        C17542s.j(th2, "cause");
        x.a aVar = x.f139812b;
        resumeWith(x.b(y.a(th2)));
        a aVar2 = (a) f143735b.getAndSet(this, (Object) null);
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    public final Object f(C17164e<? super T> eVar) {
        C17542s.j(eVar, "actual");
        while (true) {
            Object obj = this.state;
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f143734a, this, (Object) null, eVar)) {
                    i(eVar.getContext());
                    return C17187b.f();
                }
            } else if (androidx.concurrent.futures.b.a(f143734a, this, obj, (Object) null)) {
                if (!(obj instanceof Throwable)) {
                    C17542s.h(obj, "null cannot be cast to non-null type T of io.ktor.utils.io.internal.CancellableReusableContinuation");
                    return obj;
                }
                throw ((Throwable) obj);
            }
        }
    }

    public C17168i getContext() {
        C17168i context;
        Object obj = this.state;
        C17164e eVar = obj instanceof C17164e ? (C17164e) obj : null;
        return (eVar == null || (context = eVar.getContext()) == null) ? C17169j.f142968a : context;
    }

    public void resumeWith(Object obj) {
        Object obj2;
        Object obj3;
        do {
            obj2 = this.state;
            if (obj2 == null) {
                obj3 = x.e(obj);
                if (obj3 == null) {
                    y.b(obj);
                    obj3 = obj;
                }
            } else if (obj2 instanceof C17164e) {
                obj3 = null;
            } else {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f143734a, this, obj2, obj3));
        if (obj2 instanceof C17164e) {
            ((C17164e) obj2).resumeWith(obj);
        }
    }
}
