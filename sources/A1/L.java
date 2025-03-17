package A1;

import E1.C4488v;
import XH.C16807N;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import o1.C5667g;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00068\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LA1/L;", "LA1/I;", "<init>", "()V", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "d", "LnI/l;", "b", "()LnI/l;", "f", "(LnI/l;)V", "onTouchEvent", "LA1/T;", "value", "e", "LA1/T;", "getRequestDisallowInterceptTouchEvent", "()LA1/T;", "g", "(LA1/T;)V", "requestDisallowInterceptTouchEvent", "Z", "a", "()Z", "c", "(Z)V", "disallowIntercept", "LA1/H;", "LA1/H;", "t", "()LA1/H;", "pointerInputFilter", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class L implements I {

    /* renamed from: d  reason: collision with root package name */
    public C17642l<? super MotionEvent, Boolean> f4344d;

    /* renamed from: e  reason: collision with root package name */
    private T f4345e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4346f;

    /* renamed from: g  reason: collision with root package name */
    private final H f4347g = new b(this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LA1/L$a;", "", "<init>", "(Ljava/lang/String;I)V", "Unknown", "Dispatching", "NotDispatching", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum a {
        Unknown,
        Dispatching,
        NotDispatching
    }

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"A1/L$b", "LA1/H;", "LXH/N;", "i", "()V", "LA1/p;", "pointerEvent", "h", "(LA1/p;)V", "LA1/r;", "pass", "Lc2/r;", "bounds", "e", "(LA1/p;LA1/r;J)V", "d", "LA1/L$a;", "b", "LA1/L$a;", "state", "", "c", "()Z", "shareWithSiblings", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends H {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public a f4348b = a.Unknown;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ L f4349c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "LXH/N;", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<MotionEvent, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ L f4350c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(L l10) {
                super(1);
                this.f4350c = l10;
            }

            public final void a(MotionEvent motionEvent) {
                this.f4350c.b().invoke(motionEvent);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "LXH/N;", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: A1.L$b$b  reason: collision with other inner class name */
        static final class C0000b extends C17544u implements C17642l<MotionEvent, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f4351c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ L f4352d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0000b(b bVar, L l10) {
                super(1);
                this.f4351c = bVar;
                this.f4352d = l10;
            }

            public final void a(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0) {
                    this.f4351c.f4348b = this.f4352d.b().invoke(motionEvent).booleanValue() ? a.Dispatching : a.NotDispatching;
                } else {
                    this.f4352d.b().invoke(motionEvent);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "LXH/N;", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends C17544u implements C17642l<MotionEvent, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ L f4353c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(L l10) {
                super(1);
                this.f4353c = l10;
            }

            public final void a(MotionEvent motionEvent) {
                this.f4353c.b().invoke(motionEvent);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((MotionEvent) obj);
                return C16807N.f139792a;
            }
        }

        b(L l10) {
            this.f4349c = l10;
        }

        private final void h(C4349p pVar) {
            List<B> c10 = pVar.c();
            int size = c10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (c10.get(i10).p()) {
                    if (this.f4348b == a.Dispatching) {
                        C4488v b10 = b();
                        if (b10 != null) {
                            N.b(pVar, b10.p0(C5667g.f26701b.c()), new a(this.f4349c));
                        } else {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                    }
                    this.f4348b = a.NotDispatching;
                    return;
                }
            }
            C4488v b11 = b();
            if (b11 != null) {
                N.c(pVar, b11.p0(C5667g.f26701b.c()), new C0000b(this, this.f4349c));
                if (this.f4348b == a.Dispatching) {
                    int size2 = c10.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        c10.get(i11).a();
                    }
                    C4341h d10 = pVar.d();
                    if (d10 != null) {
                        d10.e(!this.f4349c.a());
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("layoutCoordinates not set");
        }

        private final void i() {
            this.f4348b = a.Unknown;
            this.f4349c.c(false);
        }

        public boolean c() {
            return true;
        }

        public void d() {
            if (this.f4348b == a.Dispatching) {
                N.a(SystemClock.uptimeMillis(), new c(this.f4349c));
                i();
            }
        }

        public void e(C4349p pVar, r rVar, long j10) {
            boolean z10;
            List<B> c10 = pVar.c();
            int i10 = 0;
            if (!this.f4349c.a()) {
                int size = c10.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z10 = false;
                        break;
                    }
                    B b10 = c10.get(i11);
                    if (C4350q.b(b10) || C4350q.d(b10)) {
                        break;
                    }
                    i11++;
                }
            }
            z10 = true;
            if (this.f4348b != a.NotDispatching) {
                if (rVar == r.Initial && z10) {
                    h(pVar);
                }
                if (rVar == r.Final && !z10) {
                    h(pVar);
                }
            }
            if (rVar == r.Final) {
                int size2 = c10.size();
                while (i10 < size2) {
                    if (C4350q.d(c10.get(i10))) {
                        i10++;
                    } else {
                        return;
                    }
                }
                i();
            }
        }
    }

    public final boolean a() {
        return this.f4346f;
    }

    public final C17642l<MotionEvent, Boolean> b() {
        C17642l<? super MotionEvent, Boolean> lVar = this.f4344d;
        if (lVar != null) {
            return lVar;
        }
        C17542s.z("onTouchEvent");
        return null;
    }

    public final void c(boolean z10) {
        this.f4346f = z10;
    }

    public final void f(C17642l<? super MotionEvent, Boolean> lVar) {
        this.f4344d = lVar;
    }

    public final void g(T t10) {
        T t11 = this.f4345e;
        if (t11 != null) {
            t11.b((L) null);
        }
        this.f4345e = t10;
        if (t10 != null) {
            t10.b(this);
        }
    }

    public H t() {
        return this.f4347g;
    }
}
