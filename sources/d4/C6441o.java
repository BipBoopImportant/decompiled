package D4;

import D4.d0;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16511H;
import TJ.C16532g;
import XH.C16807N;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\f\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u00060\u0010R\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LD4/o;", "", "<init>", "()V", "LD4/x;", "loadType", "LTJ/g;", "LD4/d0;", "c", "(LD4/x;)LTJ/g;", "viewportHint", "LXH/N;", "a", "(LD4/x;LD4/d0;)V", "d", "(LD4/d0;)V", "LD4/o$b;", "LD4/o$b;", "state", "LD4/d0$a;", "b", "()LD4/d0$a;", "lastAccessHint", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.o  reason: case insensitive filesystem */
public final class C6441o {

    /* renamed from: a  reason: collision with root package name */
    private final b f34423a = new b();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, d2 = {"LD4/o$a;", "", "<init>", "(LD4/o;)V", "LD4/d0;", "value", "a", "LD4/d0;", "b", "()LD4/d0;", "c", "(LD4/d0;)V", "LTJ/A;", "LTJ/A;", "_flow", "LTJ/g;", "()LTJ/g;", "flow", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D4.o$a */
    private final class a {

        /* renamed from: a  reason: collision with root package name */
        private d0 f34424a;

        /* renamed from: b  reason: collision with root package name */
        private final C16504A<d0> f34425b = C16511H.b(1, 0, C16428d.DROP_OLDEST, 2, (Object) null);

        public a() {
        }

        public final C16532g<d0> a() {
            return this.f34425b;
        }

        public final d0 b() {
            return this.f34424a;
        }

        public final void c(d0 d0Var) {
            this.f34424a = d0Var;
            if (d0Var != null) {
                this.f34425b.a(d0Var);
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042 \u0010\n\u001a\u001c\u0012\b\u0012\u00060\u0007R\u00020\b\u0012\b\u0012\u00060\u0007R\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u00060\u0007R\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u00060\u0007R\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR(\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001cR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u001c¨\u0006\u001f"}, d2 = {"LD4/o$b;", "", "<init>", "(LD4/o;)V", "LD4/d0$a;", "accessHint", "Lkotlin/Function2;", "LD4/o$a;", "LD4/o;", "LXH/N;", "block", "d", "(LD4/d0$a;LnI/p;)V", "a", "LD4/o$a;", "prepend", "b", "append", "<set-?>", "c", "LD4/d0$a;", "()LD4/d0$a;", "lastAccessHint", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "LTJ/g;", "LD4/d0;", "()LTJ/g;", "prependFlow", "appendFlow", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D4.o$b */
    private final class b {

        /* renamed from: a  reason: collision with root package name */
        private final a f34427a;

        /* renamed from: b  reason: collision with root package name */
        private final a f34428b;

        /* renamed from: c  reason: collision with root package name */
        private d0.a f34429c;

        /* renamed from: d  reason: collision with root package name */
        private final ReentrantLock f34430d = new ReentrantLock();

        public b() {
            this.f34427a = new a();
            this.f34428b = new a();
        }

        public final C16532g<d0> a() {
            return this.f34428b.a();
        }

        public final d0.a b() {
            return this.f34429c;
        }

        public final C16532g<d0> c() {
            return this.f34427a.a();
        }

        public final void d(d0.a aVar, p<? super a, ? super a, C16807N> pVar) {
            C17542s.j(pVar, "block");
            ReentrantLock reentrantLock = this.f34430d;
            reentrantLock.lock();
            if (aVar != null) {
                try {
                    this.f34429c = aVar;
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            pVar.invoke(this.f34427a, this.f34428b);
            C16807N n10 = C16807N.f139792a;
            reentrantLock.unlock();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D4.o$c */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34432a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                D4.x[] r0 = D4.C6449x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                D4.x r1 = D4.C6449x.PREPEND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                D4.x r1 = D4.C6449x.APPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f34432a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.C6441o.c.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\n\u0010\u0002\u001a\u00060\u0000R\u00020\u00012\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LD4/o$a;", "LD4/o;", "prependHint", "appendHint", "LXH/N;", "a", "(LD4/o$a;LD4/o$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: D4.o$d */
    static final class d extends C17544u implements p<a, a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6449x f34433c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d0 f34434d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6449x xVar, d0 d0Var) {
            super(2);
            this.f34433c = xVar;
            this.f34434d = d0Var;
        }

        public final void a(a aVar, a aVar2) {
            C17542s.j(aVar, "prependHint");
            C17542s.j(aVar2, "appendHint");
            if (this.f34433c == C6449x.PREPEND) {
                aVar.c(this.f34434d);
            } else {
                aVar2.c(this.f34434d);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((a) obj, (a) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\n\u0010\u0002\u001a\u00060\u0000R\u00020\u00012\n\u0010\u0003\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LD4/o$a;", "LD4/o;", "prependHint", "appendHint", "LXH/N;", "a", "(LD4/o$a;LD4/o$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: D4.o$e */
    static final class e extends C17544u implements p<a, a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d0 f34435c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d0 d0Var) {
            super(2);
            this.f34435c = d0Var;
        }

        public final void a(a aVar, a aVar2) {
            C17542s.j(aVar, "prependHint");
            C17542s.j(aVar2, "appendHint");
            if (C6442p.a(this.f34435c, aVar.b(), C6449x.PREPEND)) {
                aVar.c(this.f34435c);
            }
            if (C6442p.a(this.f34435c, aVar2.b(), C6449x.APPEND)) {
                aVar2.c(this.f34435c);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((a) obj, (a) obj2);
            return C16807N.f139792a;
        }
    }

    public final void a(C6449x xVar, d0 d0Var) {
        C17542s.j(xVar, "loadType");
        C17542s.j(d0Var, "viewportHint");
        if (xVar == C6449x.PREPEND || xVar == C6449x.APPEND) {
            this.f34423a.d((d0.a) null, new d(xVar, d0Var));
            return;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + xVar).toString());
    }

    public final d0.a b() {
        return this.f34423a.b();
    }

    public final C16532g<d0> c(C6449x xVar) {
        C17542s.j(xVar, "loadType");
        int i10 = c.f34432a[xVar.ordinal()];
        if (i10 == 1) {
            return this.f34423a.c();
        }
        if (i10 == 2) {
            return this.f34423a.a();
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }

    public final void d(d0 d0Var) {
        C17542s.j(d0Var, "viewportHint");
        this.f34423a.d(d0Var instanceof d0.a ? (d0.a) d0Var : null, new e(d0Var));
    }
}
