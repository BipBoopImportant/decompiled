package hi;

import GC.C12925g;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.C5210m;
import com.ingka.ikea.core.model.Media;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import fm.C11274b;
import ip.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;
import op.C11700k;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import qx.C14956a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lhi/f;", "Lhi/e;", "Lfm/b;", "getAssemblyServiceUseCase", "LIl/a;", "appConfigApi", "Lbi/a;", "pipRepository", "<init>", "(Lfm/b;LIl/a;Lbi/a;)V", "Lfm/b$a;", "Lop/k;", "productDetails", "LGC/g;", "e", "(Lfm/b$a;Lop/k;)LGC/g;", "Lfm/b$a$a$b;", "LGC/g$a;", "d", "(Lfm/b$a$a$b;)LGC/g$a;", "", "itemNo", "LTJ/g;", "a", "(Ljava/lang/String;)LTJ/g;", "Lfm/b;", "b", "LIl/a;", "c", "Lbi/a;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C11274b f74162a;

    /* renamed from: b  reason: collision with root package name */
    private final Il.a f74163b;

    /* renamed from: c  reason: collision with root package name */
    private final bi.a f74164c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.usecase.GetPipAssemblyDetailsUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetPipAssemblyDetailsUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class a extends l implements q<C16533h<? super C12925g>, k<C11700k, String>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74165c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74166d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74167e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f74168f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f74169g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, f fVar, String str) {
            super(3, eVar);
            this.f74168f = fVar;
            this.f74169g = str;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C12925g> hVar, k<C11700k, String> kVar, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f74168f, this.f74169g);
            aVar.f74166d = hVar;
            aVar.f74167e = kVar;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74165c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f74166d;
                k kVar = (k) this.f74167e;
                C16532g bVar = kVar instanceof k.f ? new b(this.f74168f.f74162a.a(C16877v.e(new C11274b.C2173b(this.f74169g, 1))), this.f74168f, kVar) : kVar instanceof k.b ? C16521S.a(new C12925g(false, (C13023e) null, (C13023e) null, (List) null, (C12925g.a) null, 30, (DefaultConstructorMarker) null)) : C16521S.a(new C12925g(true, (C13023e) null, (C13023e) null, (List) null, (C12925g.a) null, 30, (DefaultConstructorMarker) null));
                this.f74165c = 1;
                if (C16534i.x(hVar, bVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<C12925g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74170a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f74171b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f74172c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74173a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f74174b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ k f74175c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.usecase.GetPipAssemblyDetailsUseCaseImpl$invoke$lambda$1$$inlined$map$1$2", f = "GetPipAssemblyDetailsUseCase.kt", l = {50}, m = "emit")
            /* renamed from: hi.f$b$a$a  reason: collision with other inner class name */
            public static final class C1319a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74176c;

                /* renamed from: d  reason: collision with root package name */
                int f74177d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74178e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1319a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74178e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74176c = obj;
                    this.f74177d |= Integer.MIN_VALUE;
                    return this.f74178e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, f fVar, k kVar) {
                this.f74173a = hVar;
                this.f74174b = fVar;
                this.f74175c = kVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof hi.f.b.a.C1319a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    hi.f$b$a$a r0 = (hi.f.b.a.C1319a) r0
                    int r1 = r0.f74177d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74177d = r1
                    goto L_0x0018
                L_0x0013:
                    hi.f$b$a$a r0 = new hi.f$b$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f74176c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74177d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0051
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f74173a
                    fm.b$a r6 = (fm.C11274b.a) r6
                    hi.f r2 = r5.f74174b
                    ip.k r4 = r5.f74175c
                    ip.k$f r4 = (ip.k.f) r4
                    java.lang.Object r4 = r4.d()
                    op.k r4 = (op.C11700k) r4
                    GC.g r6 = r2.e(r6, r4)
                    r0.f74177d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0051
                    return r1
                L_0x0051:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hi.f.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar, f fVar, k kVar) {
            this.f74170a = gVar;
            this.f74171b = fVar;
            this.f74172c = kVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74170a.collect(new a(hVar, this.f74171b, this.f74172c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public f(C11274b bVar, Il.a aVar, bi.a aVar2) {
        C17542s.j(bVar, "getAssemblyServiceUseCase");
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(aVar2, "pipRepository");
        this.f74162a = bVar;
        this.f74163b = aVar;
        this.f74164c = aVar2;
    }

    private final C12925g.a d(C11274b.a.C2167a.C2169b bVar) {
        C13023e eVar;
        if (bVar instanceof C11274b.a.C2167a.C2169b.C2170a) {
            eVar = C13026h.a(Oo.b.f84622e0);
        } else if (bVar instanceof C11274b.a.C2167a.C2169b.C2171b) {
            eVar = C13026h.a(Oo.b.f84633f0);
        } else {
            throw new t();
        }
        return new C12925g.a(eVar, C14956a.f130484a.b(bVar.a(), this.f74163b.s()));
    }

    /* access modifiers changed from: private */
    public final C12925g e(C11274b.a aVar, C11700k kVar) {
        char c10;
        C11274b.a aVar2 = aVar;
        char c11 = '$';
        C12925g.a aVar3 = null;
        if (aVar2 instanceof C11274b.a.C2167a) {
            C11274b.a.C2167a aVar4 = (C11274b.a.C2167a) aVar2;
            C11274b.a.C2167a.C2168a aVar5 = (C11274b.a.C2167a.C2168a) C16877v.y0(aVar4.b());
            if (!C17542s.e(aVar5 != null ? aVar5.b() : null, kVar.c().i())) {
                e eVar = e.WARN;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("Item number mismatch", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    if (str2 == null) {
                        String name = aVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar, str2, false, (Throwable) null, str);
                    c11 = '$';
                }
                return new C12925g(false, (C13023e) null, (C13023e) null, (List) null, (C12925g.a) null, 30, (DefaultConstructorMarker) null);
            }
            C12925g.b bVar2 = C12925g.f110316f;
            String i10 = kVar.c().i();
            String j10 = kVar.c().j();
            Media media = (Media) C16877v.y0(kVar.c().g());
            List e10 = C16877v.e(bVar2.a(i10, j10, 1, media != null ? media.getUrl() : null, kVar.c().h().i(), kVar.c().h().c(), aVar5.a(), this.f74163b.s()));
            C11274b.a.C2167a.C2169b a11 = aVar4.a();
            if (a11 != null) {
                aVar3 = d(a11);
            }
            return new C12925g(false, (C13023e) null, (C13023e) null, e10, aVar3, 6, (DefaultConstructorMarker) null);
        }
        e eVar2 = e.WARN;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : qv.d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str3 = null;
        String str4 = null;
        for (C11819b bVar3 : arrayList2) {
            if (str3 == null) {
                String a12 = C11818a.a("AssemblyServices is null or disabled", (Throwable) null);
                if (a12 == null) {
                    break;
                }
                str3 = C11820c.a(a12);
            }
            if (str4 == null) {
                String name2 = f.class.getName();
                C17542s.g(name2);
                c10 = '$';
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                c10 = '$';
            }
            char c12 = c10;
            bVar3.a(eVar2, str4, false, (Throwable) null, str3);
        }
        return new C12925g(false, (C13023e) null, (C13023e) null, (List) null, (C12925g.a) null, 30, (DefaultConstructorMarker) null);
    }

    public C16532g<C12925g> a(String str) {
        C17542s.j(str, "itemNo");
        return C16534i.g0(C5210m.a(this.f74164c.a(str)), new a((C17164e) null, this, str));
    }
}
