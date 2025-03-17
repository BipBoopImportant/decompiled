package rK;

import A1.B;
import A1.C4349p;
import A1.C4352t;
import A1.r;
import G1.C4508k;
import G1.s0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.t;
import XH.y;
import android.view.KeyEvent;
import androidx.compose.ui.d;
import c2.i;
import c2.j;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5551k0;
import me.saket.telephoto.zoomable.g;
import me.saket.telephoto.zoomable.h;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import o1.C5668h;
import pK.C17769n;
import y1.C6255c;
import y1.C6256d;
import y1.C6257e;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R)\u00108\u001a\u0014\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\f018\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R#\u0010?\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\f098\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"LrK/o;", "Landroidx/compose/ui/d$c;", "Ly1/e;", "LG1/s0;", "LpK/n;", "state", "Lme/saket/telephoto/zoomable/h;", "spec", "<init>", "(LpK/n;Lme/saket/telephoto/zoomable/h;)V", "Lme/saket/telephoto/zoomable/g$b;", "shortcut", "LXH/N;", "D2", "(Lme/saket/telephoto/zoomable/g$b;)V", "Ly1/b;", "event", "", "p1", "(Landroid/view/KeyEvent;)Z", "LA1/p;", "pointerEvent", "LA1/r;", "pass", "Lc2/r;", "bounds", "T1", "(LA1/p;LA1/r;J)V", "Y0", "s1", "()V", "n", "LpK/n;", "C2", "()LpK/n;", "F2", "(LpK/n;)V", "o", "Lme/saket/telephoto/zoomable/h;", "getSpec", "()Lme/saket/telephoto/zoomable/h;", "E2", "(Lme/saket/telephoto/zoomable/h;)V", "Lkotlin/Function0;", "p", "LnI/a;", "getCanPan", "()LnI/a;", "canPan", "Lkotlin/Function2;", "", "Lo1/g;", "q", "LnI/p;", "getOnZoom", "()LnI/p;", "onZoom", "Lkotlin/Function1;", "Lc2/j;", "r", "LnI/l;", "getOnPan", "()LnI/l;", "onPan", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o extends d.c implements C6257e, s0 {

    /* renamed from: n  reason: collision with root package name */
    private C17769n f146779n;

    /* renamed from: o  reason: collision with root package name */
    private h f146780o;

    /* renamed from: p  reason: collision with root package name */
    private final C17631a<Boolean> f146781p = new b(this);

    /* renamed from: q  reason: collision with root package name */
    private final p<Float, C5667g, C16807N> f146782q = new d(this);

    /* renamed from: r  reason: collision with root package name */
    private final C17642l<j, C16807N> f146783r = new c(this);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f146784a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f146785b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        static {
            /*
                me.saket.telephoto.zoomable.g$b$e[] r0 = me.saket.telephoto.zoomable.g.b.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                me.saket.telephoto.zoomable.g$b$e r2 = me.saket.telephoto.zoomable.g.b.e.In     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                me.saket.telephoto.zoomable.g$b$e r3 = me.saket.telephoto.zoomable.g.b.e.Out     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f146784a = r0
                me.saket.telephoto.zoomable.g$b$c[] r0 = me.saket.telephoto.zoomable.g.b.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                me.saket.telephoto.zoomable.g$b$c r3 = me.saket.telephoto.zoomable.g.b.c.Up     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                me.saket.telephoto.zoomable.g$b$c r1 = me.saket.telephoto.zoomable.g.b.c.Down     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                me.saket.telephoto.zoomable.g$b$c r1 = me.saket.telephoto.zoomable.g.b.c.Left     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                me.saket.telephoto.zoomable.g$b$c r1 = me.saket.telephoto.zoomable.g.b.c.Right     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                f146785b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rK.o.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f146786c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(o oVar) {
            super(0);
            this.f146786c = oVar;
        }

        public final Boolean invoke() {
            return Boolean.valueOf(this.f146786c.C2().f().d().a() > 1.0f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/j;", "delta", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends C17544u implements C17642l<j, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f146787c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
        @f(c = "me.saket.telephoto.zoomable.internal.HardwareShortcutsNode$onPan$1$1", f = "hardwareShortcuts.kt", l = {67}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f146788c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ o f146789d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f146790e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(o oVar, long j10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f146789d = oVar;
                this.f146790e = j10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f146789d, this.f146790e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f146788c;
                if (i10 == 0) {
                    y.b(obj);
                    C17769n C22 = this.f146789d.C2();
                    c2.d i11 = C4508k.i(this.f146789d);
                    long j10 = this.f146790e;
                    long a10 = C5668h.a(i11.H1(j.e(j10)), i11.H1(j.f(j10)));
                    C5551k0 k0Var = new C5551k0(0, 1, (DefaultConstructorMarker) null);
                    this.f146788c = 1;
                    if (C22.j(a10, k0Var, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(o oVar) {
            super(1);
            this.f146787c = oVar;
        }

        public final void a(long j10) {
            F0 unused = C16314k.d(this.f146787c.c2(), (C17168i) null, (T) null, new a(this.f146787c, j10, (C17164e<? super a>) null), 3, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((j) obj).i());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "factor", "Lo1/g;", "centroid", "LXH/N;", "a", "(FJ)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends C17544u implements p<Float, C5667g, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o f146791c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 9, 0})
        @f(c = "me.saket.telephoto.zoomable.internal.HardwareShortcutsNode$onZoom$1$1", f = "hardwareShortcuts.kt", l = {58}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f146792c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ o f146793d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ float f146794e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f146795f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(o oVar, float f10, long j10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f146793d = oVar;
                this.f146794e = f10;
                this.f146795f = j10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f146793d, this.f146794e, this.f146795f, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f146792c;
                if (i10 == 0) {
                    y.b(obj);
                    C17769n C22 = this.f146793d.C2();
                    float f11 = this.f146794e;
                    long j10 = this.f146795f;
                    C5551k0 k0Var = new C5551k0(0, 1, (DefaultConstructorMarker) null);
                    this.f146792c = 1;
                    if (C22.l(f11, j10, k0Var, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(o oVar) {
            super(2);
            this.f146791c = oVar;
        }

        public final void a(float f10, long j10) {
            F0 unused = C16314k.d(this.f146791c.c2(), (C17168i) null, (T) null, new a(this.f146791c, f10, j10, (C17164e<? super a>) null), 3, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).floatValue(), ((C5667g) obj2).v());
            return C16807N.f139792a;
        }
    }

    public o(C17769n nVar, h hVar) {
        C17542s.j(nVar, "state");
        C17542s.j(hVar, "spec");
        this.f146779n = nVar;
        this.f146780o = hVar;
    }

    private final void D2(g.b bVar) {
        long j10;
        if (bVar instanceof g.b.d) {
            g.b.d dVar = (g.b.d) bVar;
            int i10 = a.f146784a[dVar.b().ordinal()];
            if (i10 == 1) {
                this.f146782q.invoke(Float.valueOf(dVar.c()), C5667g.d(dVar.a()));
            } else if (i10 == 2) {
                this.f146782q.invoke(Float.valueOf(1.0f / dVar.c()), C5667g.d(dVar.a()));
            }
        } else if ((bVar instanceof g.b.C3527b) && this.f146781p.invoke().booleanValue()) {
            g.b.C3527b bVar2 = (g.b.C3527b) bVar;
            int i11 = a.f146785b[bVar2.a().ordinal()];
            if (i11 == 1) {
                j10 = i.a(c2.h.B((float) 0), bVar2.b());
            } else if (i11 == 2) {
                j10 = i.a(c2.h.B((float) 0), c2.h.B(-bVar2.b()));
            } else if (i11 == 3) {
                j10 = i.a(bVar2.b(), c2.h.B((float) 0));
            } else if (i11 == 4) {
                j10 = i.a(c2.h.B(-bVar2.b()), c2.h.B((float) 0));
            } else {
                throw new t();
            }
            this.f146783r.invoke(j.a(j10));
        }
    }

    public final C17769n C2() {
        return this.f146779n;
    }

    public final void E2(h hVar) {
        C17542s.j(hVar, "<set-?>");
        this.f146780o = hVar;
    }

    public final void F2(C17769n nVar) {
        C17542s.j(nVar, "<set-?>");
        this.f146779n = nVar;
    }

    public void T1(C4349p pVar, r rVar, long j10) {
        C17542s.j(pVar, "pointerEvent");
        C17542s.j(rVar, "pass");
        if (C4352t.i(pVar.g(), C4352t.f4431a.f()) && rVar == r.Main) {
            List<B> c10 = pVar.c();
            int size = c10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!c10.get(i10).p()) {
                    g.b a10 = this.f146780o.c().a(pVar);
                    if (a10 != null) {
                        List<B> c11 = pVar.c();
                        int size2 = c11.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            c11.get(i11).a();
                        }
                        D2(a10);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public boolean Y0(KeyEvent keyEvent) {
        C17542s.j(keyEvent, "event");
        return false;
    }

    public boolean p1(KeyEvent keyEvent) {
        C17542s.j(keyEvent, "event");
        if (!C6255c.e(C6256d.b(keyEvent), C6255c.f32260a.a())) {
            return false;
        }
        g.b b10 = this.f146780o.c().b(keyEvent);
        if (b10 != null) {
            D2(b10);
        }
        return b10 != null;
    }

    public void s1() {
    }
}
