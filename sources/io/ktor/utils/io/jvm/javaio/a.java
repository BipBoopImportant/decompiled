package io.ktor.utils.io.jvm.javaio;

import QJ.C16315k0;
import QJ.C16328r0;
import QJ.F0;
import XH.C16807N;
import XH.x;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.W;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\"\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\bH¤@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00148\u0004@BX\u000e¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b,\u0010-R$\u0010\u0016\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00148\u0004@BX\u000e¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b.\u0010-\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/a;", "", "LQJ/F0;", "parent", "<init>", "(LQJ/F0;)V", "Ljava/lang/Thread;", "thread", "LXH/N;", "i", "(Ljava/lang/Thread;)V", "LdI/e;", "ucont", "j", "(LdI/e;)Ljava/lang/Object;", "h", "k", "()V", "", "buffer", "", "offset", "length", "m", "([BII)I", "jobToken", "l", "(Ljava/lang/Object;)I", "rc", "d", "(I)V", "a", "LQJ/F0;", "g", "()LQJ/F0;", "b", "LdI/e;", "end", "LQJ/k0;", "c", "LQJ/k0;", "disposable", "<set-?>", "I", "f", "()I", "e", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
abstract class a {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f143789f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* renamed from: a  reason: collision with root package name */
    private final F0 f143790a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17164e<C16807N> f143791b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C16315k0 f143792c;

    /* renamed from: d  reason: collision with root package name */
    private int f143793d;

    /* renamed from: e  reason: collision with root package name */
    private int f143794e;
    volatile /* synthetic */ int result;
    volatile /* synthetic */ Object state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.utils.io.jvm.javaio.BlockingAdapter$block$1", f = "Blocking.kt", l = {186}, m = "invokeSuspend")
    /* renamed from: io.ktor.utils.io.jvm.javaio.a$a  reason: collision with other inner class name */
    static final class C3511a extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f143795c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f143796d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3511a(a aVar, C17164e<? super C3511a> eVar) {
            super(1, eVar);
            this.f143796d = aVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new C3511a(this.f143796d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((C3511a) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f143795c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = this.f143796d;
                this.f143795c = 1;
                if (aVar.h(this) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f143797c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.f143797c = aVar;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                C17164e b10 = this.f143797c.f143791b;
                x.a aVar = x.f139812b;
                b10.resumeWith(x.b(y.a(th2)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0005\u001a\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"io/ktor/utils/io/jvm/javaio/a$c", "LdI/e;", "LXH/N;", "LXH/x;", "result", "resumeWith", "(Ljava/lang/Object;)V", "LdI/i;", "a", "LdI/i;", "getContext", "()LdI/i;", "context", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements C17164e<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        private final C17168i f143798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f143799b;

        c(a aVar) {
            this.f143799b = aVar;
            this.f143798a = aVar.g() != null ? i.f143822b.plus(aVar.g()) : i.f143822b;
        }

        public C17168i getContext() {
            return this.f143798a;
        }

        public void resumeWith(Object obj) {
            Object obj2;
            boolean z10;
            F0 g10;
            Throwable e10;
            Object e11 = x.e(obj);
            if (e11 == null) {
                e11 = C16807N.f139792a;
            }
            a aVar = this.f143799b;
            do {
                obj2 = aVar.state;
                z10 = obj2 instanceof Thread;
                if (!(z10 ? true : obj2 instanceof C17164e ? true : C17542s.e(obj2, this))) {
                    return;
                }
            } while (!androidx.concurrent.futures.b.a(a.f143789f, aVar, obj2, e11));
            if (z10) {
                f.a().b(obj2);
            } else if ((obj2 instanceof C17164e) && (e10 = x.e(obj)) != null) {
                ((C17164e) obj2).resumeWith(x.b(y.a(e10)));
            }
            if (x.g(obj) && !(x.e(obj) instanceof CancellationException) && (g10 = this.f143799b.g()) != null) {
                F0.a.a(g10, (CancellationException) null, 1, (Object) null);
            }
            C16315k0 a10 = this.f143799b.f143792c;
            if (a10 != null) {
                a10.b();
            }
        }
    }

    public a() {
        this((F0) null, 1, (DefaultConstructorMarker) null);
    }

    private final void i(Thread thread) {
        if (this.state == thread) {
            if (!f.b()) {
                b.b().warn("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
            }
            while (true) {
                long b10 = C16328r0.b();
                if (this.state != thread) {
                    return;
                }
                if (b10 > 0) {
                    f.a().a(b10);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final Object j(C17164e<Object> eVar) {
        Object obj;
        C17164e<Object> eVar2;
        Object obj2 = null;
        while (true) {
            Object obj3 = this.state;
            if (obj3 instanceof Thread) {
                eVar2 = C17187b.c(eVar);
                obj = obj3;
            } else if (C17542s.e(obj3, this)) {
                obj = obj2;
                eVar2 = C17187b.c(eVar);
            } else {
                throw new IllegalStateException("Already suspended or in finished state");
            }
            if (androidx.concurrent.futures.b.a(f143789f, this, obj3, eVar2)) {
                if (obj != null) {
                    f.a().b(obj);
                }
                return C17187b.f();
            }
            obj2 = obj;
        }
    }

    /* access modifiers changed from: protected */
    public final void d(int i10) {
        this.result = i10;
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return this.f143794e;
    }

    /* access modifiers changed from: protected */
    public final int f() {
        return this.f143793d;
    }

    public final F0 g() {
        return this.f143790a;
    }

    /* access modifiers changed from: protected */
    public abstract Object h(C17164e<? super C16807N> eVar);

    public final void k() {
        C16315k0 k0Var = this.f143792c;
        if (k0Var != null) {
            k0Var.b();
        }
        C17164e<C16807N> eVar = this.f143791b;
        x.a aVar = x.f139812b;
        eVar.resumeWith(x.b(y.a(new CancellationException("Stream closed"))));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: dI.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int l(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r0 = "jobToken"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = 0
        L_0x000a:
            java.lang.Object r2 = r5.state
            boolean r3 = r2 instanceof dI.C17164e
            if (r3 == 0) goto L_0x001a
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any>"
            kotlin.jvm.internal.C17542s.h(r2, r1)
            r1 = r2
            dI.e r1 = (dI.C17164e) r1
            r3 = r0
            goto L_0x0034
        L_0x001a:
            boolean r3 = r2 instanceof XH.C16807N
            if (r3 == 0) goto L_0x0021
            int r6 = r5.result
            return r6
        L_0x0021:
            boolean r3 = r2 instanceof java.lang.Throwable
            if (r3 != 0) goto L_0x006f
            boolean r3 = r2 instanceof java.lang.Thread
            if (r3 != 0) goto L_0x0067
            boolean r3 = kotlin.jvm.internal.C17542s.e(r2, r5)
            if (r3 != 0) goto L_0x005f
            XH.t r3 = new XH.t
            r3.<init>()
        L_0x0034:
            java.lang.String r4 = "when (value) {\n         …Exception()\n            }"
            kotlin.jvm.internal.C17542s.i(r3, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f143789f
            boolean r2 = androidx.concurrent.futures.b.a(r4, r5, r2, r3)
            if (r2 == 0) goto L_0x000a
            kotlin.jvm.internal.C17542s.g(r1)
            java.lang.Object r6 = XH.x.b(r6)
            r1.resumeWith(r6)
            java.lang.String r6 = "thread"
            kotlin.jvm.internal.C17542s.i(r0, r6)
            r5.i(r0)
            java.lang.Object r6 = r5.state
            boolean r0 = r6 instanceof java.lang.Throwable
            if (r0 != 0) goto L_0x005c
            int r6 = r5.result
            return r6
        L_0x005c:
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        L_0x005f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not yet started"
            r6.<init>(r0)
            throw r6
        L_0x0067:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "There is already thread owning adapter"
            r6.<init>(r0)
            throw r6
        L_0x006f:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.a.l(java.lang.Object):int");
    }

    public final int m(byte[] bArr, int i10, int i11) {
        C17542s.j(bArr, "buffer");
        this.f143793d = i10;
        this.f143794e = i11;
        return l(bArr);
    }

    public a(F0 f02) {
        this.f143790a = f02;
        c cVar = new c(this);
        this.f143791b = cVar;
        this.state = this;
        this.result = 0;
        this.f143792c = f02 != null ? f02.s(new b(this)) : null;
        ((C17642l) W.g(new C3511a(this, (C17164e<? super C3511a>) null), 1)).invoke(cVar);
        if (this.state == this) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(F0 f02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : f02);
    }
}
