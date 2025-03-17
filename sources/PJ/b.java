package Pj;

import IC.C13020b;
import IC.C13023e;
import Nj.a;
import Nj.c;
import Nj.e;
import Pj.a;
import QJ.F0;
import QJ.Q;
import QJ.T;
import Rj.a;
import SJ.C16428d;
import Sy.a;
import TJ.C16504A;
import TJ.C16511H;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Tj.D;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import jB.C14613b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import rz.O;
import rz.b0;
import sB.C15035a;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b#\u0010$J1\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b%\u0010\"J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00122\u0006\u0010'\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\u00020\u00122\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001803H\u0002¢\u0006\u0004\b5\u00106J\u0018\u00109\u001a\u00020\u00122\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020H0L8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020S0R8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006Y"}, d2 = {"LPj/b;", "Landroidx/lifecycle/f0;", "LNj/g;", "upptackaUseCases", "LQj/c;", "upptackaUiMapper", "LRj/a;", "uiDataModel", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/c;", "uiErrorMapper", "LSy/a;", "scanAndGoAnalytics", "LjB/b;", "shoppingListRepo", "<init>", "(LNj/g;LQj/c;LRj/a;Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/c;LSy/a;LjB/b;)V", "LPj/a$d;", "event", "LXH/N;", "S", "(LPj/a$d;)V", "T", "()V", "U", "", "listId", "M", "(Ljava/lang/String;)V", "", "Lrz/b0;", "supportedProducts", "unSupportedProducts", "LRj/g;", "G", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "I", "(Ljava/util/List;)Ljava/util/List;", "H", "LPj/a$e;", "action", "O", "(LPj/a$e;)V", "LQJ/F0;", "R", "()LQJ/F0;", "LPj/a$f;", "Q", "(LPj/a$f;)V", "LsB/a;", "N", "(LsB/a;)V", "", "favourites", "P", "(Ljava/util/Set;)V", "LPj/a;", "uiEvent", "L", "(LPj/a;)V", "m", "LNj/g;", "n", "LQj/c;", "o", "LRj/a;", "p", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/c;", "q", "LSy/a;", "r", "LjB/b;", "LTJ/A;", "LRj/a$b;", "s", "LTJ/A;", "_sideEffect", "LTJ/g;", "t", "LTJ/g;", "J", "()LTJ/g;", "sideEffect", "LTJ/P;", "LRj/a$c;", "u", "LTJ/P;", "K", "()LTJ/P;", "uiData", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Nj.g f85580m;

    /* renamed from: n  reason: collision with root package name */
    private final Qj.c f85581n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Rj.a f85582o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.c f85583p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Sy.a f85584q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C14613b f85585r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16504A<a.b> f85586s;

    /* renamed from: t  reason: collision with root package name */
    private final C16532g<a.b> f85587t;

    /* renamed from: u  reason: collision with root package name */
    private final C16519P<a.c> f85588u;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.UpptackaImportProductDialogFragmentViewModel$1", f = "UpptackaImportProductDialogFragmentViewModel.kt", l = {52}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f85589c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f85590d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pj.b$a$a  reason: collision with other inner class name */
        static final class C1727a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f85591a;

            C1727a(b bVar) {
                this.f85591a = bVar;
            }

            /* renamed from: c */
            public final Object emit(Set<String> set, C17164e<? super C16807N> eVar) {
                this.f85591a.P(set);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f85590d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f85590d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f85589c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<Set<String>> f11 = this.f85590d.f85585r.f();
                C1727a aVar = new C1727a(this.f85590d);
                this.f85589c = 1;
                if (f11.collect(aVar, this) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pj.b$b  reason: collision with other inner class name */
    public /* synthetic */ class C1728b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f85592a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.UiError$Type[] r0 = com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.UiError.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.UiError$Type r1 = com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.UiError.Type.ADD_TO_BAG     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.UiError$Type r1 = com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.UiError.Type.WRONG_STORE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.UiError$Type r1 = com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.UiError.Type.GENERIC     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f85592a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Pj.b.C1728b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.UpptackaImportProductDialogFragmentViewModel$loadProducts$1", f = "UpptackaImportProductDialogFragmentViewModel.kt", l = {112}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f85593c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f85594d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f85595e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, String str, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f85594d = bVar;
            this.f85595e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f85594d, this.f85595e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f85593c;
            if (i10 == 0) {
                y.b(obj);
                this.f85594d.f85582o.c();
                Nj.c a10 = this.f85594d.f85580m.a();
                String str = this.f85595e;
                this.f85593c = 1;
                obj2 = a10.m5invokegIAlus(str, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = this.f85594d;
            String str2 = this.f85595e;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                c.b bVar2 = (c.b) obj2;
                bVar.f85582o.e(bVar2.a(), bVar2.b(), bVar.G(bVar2.a(), bVar2.b()));
                Sy.a i11 = bVar.f85584q;
                int size = bVar2.a().size();
                int size2 = bVar2.b().size();
                Iterable<b0> b10 = bVar2.b();
                ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
                for (b0 g10 : b10) {
                    arrayList.add(g10.g().d());
                }
                i11.T(size, size2, arrayList);
            } else {
                Sy.a i12 = bVar.f85584q;
                if (str2 == null) {
                    str2 = "";
                }
                i12.s(str2, O.QR.b(), Interaction$Component.SHOP_AND_GO_UPPTACKA_HANDOVER, a.d.SERVER);
                bVar.f85582o.b(bVar.f85583p.a(e10));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.UpptackaImportProductDialogFragmentViewModel$onFavoriteChanged$1", f = "UpptackaImportProductDialogFragmentViewModel.kt", l = {252}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f85596c;

        /* renamed from: d  reason: collision with root package name */
        Object f85597d;

        /* renamed from: e  reason: collision with root package name */
        Object f85598e;

        /* renamed from: f  reason: collision with root package name */
        int f85599f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f85600g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Set<String> f85601h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, Set<String> set, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f85600g = bVar;
            this.f85601h = set;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f85600g, this.f85601h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f85599f;
            if (i10 == 0) {
                y.b(obj);
                Nj.e c10 = this.f85600g.f85580m.c();
                List<b0> g10 = this.f85600g.K().getValue().g();
                List<b0> h10 = this.f85600g.K().getValue().h();
                Set<String> set = this.f85601h;
                this.f85596c = c10;
                this.f85597d = g10;
                this.f85598e = h10;
                this.f85599f = 1;
                obj2 = c10.a(g10, h10, set, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                List list = (List) this.f85598e;
                List list2 = (List) this.f85597d;
                Nj.e eVar = (Nj.e) this.f85596c;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = this.f85600g;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                e.a aVar = (e.a) obj2;
                bVar.f85582o.i(aVar.a(), aVar.b(), bVar.G(aVar.a(), aVar.b()));
            } else {
                bVar.f85582o.b(bVar.f85583p.a(e10));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.UpptackaImportProductDialogFragmentViewModel$onFavouriteClick$1", f = "UpptackaImportProductDialogFragmentViewModel.kt", l = {237}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f85602c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f85603d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a.f f85604e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, a.f fVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f85603d = bVar;
            this.f85604e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f85603d, this.f85604e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f85602c;
            if (i10 == 0) {
                y.b(obj);
                C16504A E10 = this.f85603d.f85586s;
                a.b.C1778a.c cVar = new a.b.C1778a.c(this.f85604e.a().q(), this.f85604e.a().n());
                this.f85602c = 1;
                if (E10.emit(cVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.UpptackaImportProductDialogFragmentViewModel$onNavigateBack$1", f = "UpptackaImportProductDialogFragmentViewModel.kt", l = {226}, m = "invokeSuspend")
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f85605c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f85606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f85606d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f85606d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f85605c;
            if (i10 == 0) {
                y.b(obj);
                C16504A E10 = this.f85606d.f85586s;
                a.b.C1778a.C1779a aVar = a.b.C1778a.C1779a.f86412a;
                this.f85605c = 1;
                if (E10.emit(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.UpptackaImportProductDialogFragmentViewModel$onTransferClick$1", f = "UpptackaImportProductDialogFragmentViewModel.kt", l = {85, 91, 95}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f85607c;

        /* renamed from: d  reason: collision with root package name */
        Object f85608d;

        /* renamed from: e  reason: collision with root package name */
        Object f85609e;

        /* renamed from: f  reason: collision with root package name */
        Object f85610f;

        /* renamed from: g  reason: collision with root package name */
        int f85611g;

        /* renamed from: h  reason: collision with root package name */
        int f85612h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ b f85613i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f85613i = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f85613i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f85612h;
            if (i10 == 0) {
                y.b(obj);
                Nj.a b10 = this.f85613i.f85580m.b();
                List<b0> g10 = this.f85613i.K().getValue().g();
                List<b0> h10 = this.f85613i.K().getValue().h();
                this.f85612h = 1;
                obj2 = b10.a(g10, h10, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                if (i10 == 2) {
                    a.b bVar = (a.b) this.f85610f;
                } else if (i10 == 3) {
                    Throwable th2 = (Throwable) this.f85610f;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b bVar2 = (b) this.f85609e;
                b bVar3 = (b) this.f85608d;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                y.b(obj);
                obj2 = ((x) obj).j();
            }
            b bVar4 = this.f85613i;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                bVar4.f85582o.h();
                C16504A E10 = bVar4.f85586s;
                a.b.C1778a.C1780b bVar5 = a.b.C1778a.C1780b.f86413a;
                this.f85607c = obj2;
                this.f85608d = bVar4;
                this.f85609e = bVar4;
                this.f85610f = (a.b) obj2;
                this.f85611g = 0;
                this.f85612h = 2;
                if (E10.emit(bVar5, this) == f10) {
                    return f10;
                }
            } else {
                bVar4.f85582o.g();
                C16504A E11 = bVar4.f85586s;
                a.b.C1781b bVar6 = new a.b.C1781b(bVar4.f85583p.a(e10));
                this.f85607c = obj2;
                this.f85608d = bVar4;
                this.f85609e = bVar4;
                this.f85610f = e10;
                this.f85611g = 0;
                this.f85612h = 3;
                if (E11.emit(bVar6, this) == f10) {
                    return f10;
                }
            }
            return C16807N.f139792a;
        }
    }

    public b(Nj.g gVar, Qj.c cVar, Rj.a aVar, com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.c cVar2, Sy.a aVar2, C14613b bVar) {
        C17542s.j(gVar, "upptackaUseCases");
        C17542s.j(cVar, "upptackaUiMapper");
        C17542s.j(aVar, "uiDataModel");
        C17542s.j(cVar2, "uiErrorMapper");
        C17542s.j(aVar2, "scanAndGoAnalytics");
        C17542s.j(bVar, "shoppingListRepo");
        this.f85580m = gVar;
        this.f85581n = cVar;
        this.f85582o = aVar;
        this.f85583p = cVar2;
        this.f85584q = aVar2;
        this.f85585r = bVar;
        C16504A<a.b> b10 = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);
        this.f85586s = b10;
        this.f85587t = C16534i.b(b10);
        this.f85588u = aVar.a();
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final List<Rj.g> G(List<b0> list, List<b0> list2) {
        List c10 = C16877v.c();
        c10.addAll(I(list2));
        c10.add(Rj.b.f86426a);
        c10.addAll(H(list, list2));
        return C16877v.a(c10);
    }

    private final List<Rj.g> H(List<b0> list, List<b0> list2) {
        List c10 = C16877v.c();
        if (!list.isEmpty()) {
            if (!list2.isEmpty()) {
                c10.add(new Rj.c(new C13023e.c(Ez.e.f109659a, C13020b.a(list.size()), C16877v.e(Integer.valueOf(list.size())), (DefaultConstructorMarker) null)));
            }
            Iterable<b0> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (b0 a10 : iterable) {
                arrayList.add(this.f85581n.b().a(a10));
            }
            c10.addAll(arrayList);
        }
        return C16877v.a(c10);
    }

    private final List<Rj.g> I(List<b0> list) {
        List c10 = C16877v.c();
        if (!list.isEmpty()) {
            c10.add(new Rj.c(new C13023e.c(Ez.e.f109660b, C13020b.a(list.size()), C16877v.e(Integer.valueOf(list.size())), (DefaultConstructorMarker) null)));
            Iterable<b0> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (b0 a10 : iterable) {
                arrayList.add(this.f85581n.a().a(a10));
            }
            c10.addAll(arrayList);
        }
        return C16877v.a(c10);
    }

    private final void M(String str) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new c(this, str, (C17164e<? super c>) null), 3, (Object) null);
    }

    private final void N(C15035a aVar) {
        this.f85582o.d(aVar);
    }

    private final void O(a.e eVar) {
        int i10 = C1728b.f85592a[eVar.a().ordinal()];
        if (i10 == 1) {
            return;
        }
        if (i10 == 2 || i10 == 3) {
            R();
            return;
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public final void P(Set<String> set) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new d(this, set, (C17164e<? super d>) null), 3, (Object) null);
    }

    private final void Q(a.f fVar) {
        this.f85584q.q(Interaction$Component.SHOP_AND_GO_TRANSFER_ADD_TO_WISHLIST, fVar.a().n(), fVar.a().o().b(), D.a(fVar.a().o()));
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new e(this, fVar, (C17164e<? super e>) null), 3, (Object) null);
    }

    private final F0 R() {
        return C16314k.d(g0.a(this), (C17168i) null, (T) null, new f(this, (C17164e<? super f>) null), 3, (Object) null);
    }

    private final void S(a.d dVar) {
        M(dVar.a());
    }

    private final void T() {
        this.f85582o.f();
        this.f85584q.V(this.f85588u.getValue().g().size(), this.f85588u.getValue().h().size());
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new g(this, (C17164e<? super g>) null), 3, (Object) null);
    }

    private final void U() {
        this.f85584q.X(this.f85588u.getValue().g().size(), this.f85588u.getValue().h().size());
    }

    public final C16532g<a.b> J() {
        return this.f85587t;
    }

    public final C16519P<a.c> K() {
        return this.f85588u;
    }

    public final void L(a aVar) {
        C17542s.j(aVar, "uiEvent");
        if (aVar instanceof a.d) {
            S((a.d) aVar);
        } else if (aVar instanceof a.h) {
            T();
        } else if (aVar instanceof a.f) {
            Q((a.f) aVar);
        } else if (aVar instanceof a.b) {
            N(((a.b) aVar).a());
        } else if (aVar instanceof a.e) {
            O((a.e) aVar);
        } else if ((aVar instanceof a.C1726a) || C17542s.e(aVar, a.c.f85574a)) {
            U();
        } else if (C17542s.e(aVar, a.g.f85578a)) {
            this.f85582o.d((C15035a) null);
        } else {
            throw new t();
        }
    }
}
