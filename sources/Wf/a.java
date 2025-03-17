package Wf;

import GC.C12925g;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Vf.a;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import fm.C11274b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import qx.C14956a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u0019"}, d2 = {"LWf/a;", "Landroidx/lifecycle/f0;", "LIl/a;", "appConfigApi", "LVf/a;", "getAssemblyServicesUseCase", "<init>", "(LIl/a;LVf/a;)V", "LVf/a$a;", "LGC/g;", "j", "(LVf/a$a;)LGC/g;", "Lfm/b$a$a$b;", "LGC/g$a;", "i", "(Lfm/b$a$a$b;)LGC/g$a;", "m", "LIl/a;", "LTJ/P;", "n", "LTJ/P;", "()LTJ/P;", "uiState", "o", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f0 {

    /* renamed from: o  reason: collision with root package name */
    public static final C1132a f64743o = new C1132a((DefaultConstructorMarker) null);

    /* renamed from: p  reason: collision with root package name */
    public static final int f64744p = 8;

    /* renamed from: m  reason: collision with root package name */
    private final Il.a f64745m;

    /* renamed from: n  reason: collision with root package name */
    private final C16519P<C12925g> f64746n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LWf/a$a;", "", "<init>", "()V", "", "DESCRIPTION_WITH_MEASUREMENT", "Ljava/lang/String;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wf.a$a  reason: collision with other inner class name */
    public static final class C1132a {
        public /* synthetic */ C1132a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1132a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<C12925g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f64747a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f64748b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Wf.a$b$a  reason: collision with other inner class name */
        public static final class C1133a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f64749a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f64750b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.cart.impl.assembly.viewmodel.AssemblyDetailsViewModel$special$$inlined$map$1$2", f = "AssemblyDetailsViewModel.kt", l = {50}, m = "emit")
            /* renamed from: Wf.a$b$a$a  reason: collision with other inner class name */
            public static final class C1134a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f64751c;

                /* renamed from: d  reason: collision with root package name */
                int f64752d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C1133a f64753e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1134a(C1133a aVar, C17164e eVar) {
                    super(eVar);
                    this.f64753e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f64751c = obj;
                    this.f64752d |= Integer.MIN_VALUE;
                    return this.f64753e.emit((Object) null, this);
                }
            }

            public C1133a(C16533h hVar, a aVar) {
                this.f64749a = hVar;
                this.f64750b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Wf.a.b.C1133a.C1134a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Wf.a$b$a$a r0 = (Wf.a.b.C1133a.C1134a) r0
                    int r1 = r0.f64752d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f64752d = r1
                    goto L_0x0018
                L_0x0013:
                    Wf.a$b$a$a r0 = new Wf.a$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f64751c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f64752d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f64749a
                    Vf.a$a r5 = (Vf.a.C1122a) r5
                    Wf.a r2 = r4.f64750b
                    GC.g r5 = r2.j(r5)
                    r0.f64752d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Wf.a.b.C1133a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, a aVar) {
            this.f64747a = gVar;
            this.f64748b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f64747a.collect(new C1133a(hVar, this.f64748b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public a(Il.a aVar, Vf.a aVar2) {
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(aVar2, "getAssemblyServicesUseCase");
        this.f64745m = aVar;
        this.f64746n = C16534i.c0(new b(aVar2.invoke(), this), g0.a(this), C16515L.a.b(C16515L.f138570a, 0, 0, 3, (Object) null), new C12925g(true, (C13023e) null, (C13023e) null, (List) null, (C12925g.a) null, 30, (DefaultConstructorMarker) null));
    }

    private final C12925g.a i(C11274b.a.C2167a.C2169b bVar) {
        C13023e eVar;
        if (bVar instanceof C11274b.a.C2167a.C2169b.C2170a) {
            eVar = C13026h.a(Oo.b.f84622e0);
        } else if (bVar instanceof C11274b.a.C2167a.C2169b.C2171b) {
            eVar = C13026h.a(Oo.b.f84633f0);
        } else {
            throw new t();
        }
        return new C12925g.a(eVar, C14956a.f130484a.b(bVar.a(), this.f64745m.s()));
    }

    /* access modifiers changed from: private */
    public final C12925g j(a.C1122a aVar) {
        String b10;
        a.C1122a aVar2 = aVar;
        C12925g.a aVar3 = null;
        if (aVar2 instanceof a.C1122a.C1123a) {
            a.C1122a.C1123a aVar4 = (a.C1122a.C1123a) aVar2;
            Iterable<a.C1122a.C1123a.C1124a> b11 = aVar4.b();
            ArrayList arrayList = new ArrayList(C16877v.y(b11, 10));
            for (a.C1122a.C1123a.C1124a aVar5 : b11) {
                if (aVar5.f() != null) {
                    b10 = String.format("%s, %s", Arrays.copyOf(new Object[]{aVar5.b(), aVar5.f()}, 2));
                    C17542s.i(b10, "format(...)");
                } else {
                    b10 = aVar5.b();
                }
                arrayList.add(C12925g.f110316f.a(aVar5.d(), aVar5.e(), aVar5.h(), aVar5.c(), aVar5.g(), b10, aVar5.a(), this.f64745m.s()));
            }
            C11274b.a.C2167a.C2169b a10 = aVar4.a();
            if (a10 != null) {
                aVar3 = i(a10);
            }
            return new C12925g(false, (C13023e) null, (C13023e) null, arrayList, aVar3, 6, (DefaultConstructorMarker) null);
        } else if (aVar2 == null) {
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList2.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList2) {
                if (str == null) {
                    String a11 = C11818a.a("AssemblyServices is null or disabled", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                }
                if (str2 == null) {
                    String name = a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, false, (Throwable) null, str);
            }
            return new C12925g(false, (C13023e) null, (C13023e) null, (List) null, (C12925g.a) null, 30, (DefaultConstructorMarker) null);
        } else {
            throw new t();
        }
    }

    public final C16519P<C12925g> m() {
        return this.f64746n;
    }
}
