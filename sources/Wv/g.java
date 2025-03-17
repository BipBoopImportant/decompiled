package Wv;

import AA.C12556a;
import KJ.C15987c;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Tv.d;
import Wv.f;
import XH.C16807N;
import XH.t;
import XH.y;
import Yv.A;
import aA.C13910b;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.r;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 ¨\u0006!"}, d2 = {"LWv/g;", "LWv/f;", "LAA/a;", "themeIntegration", "LDr/b;", "geomagicalIntegration", "LYv/A;", "getSelectedStoreNameUseCase", "LTv/d;", "settingsListContentFactory", "<init>", "(LAA/a;LDr/b;LYv/A;LTv/d;)V", "LaA/b;", "userState", "LTJ/g;", "LWv/f$a;", "d", "(LaA/b;)LTJ/g;", "", "storeName", "", "isKreativEnabled", "isThemeEnabled", "LKJ/c;", "LTv/b;", "c", "(LaA/b;Ljava/lang/String;ZZ)LKJ/c;", "a", "LAA/a;", "b", "LDr/b;", "LYv/A;", "LTv/d;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final C12556a f40609a;

    /* renamed from: b  reason: collision with root package name */
    private final Dr.b f40610b;

    /* renamed from: c  reason: collision with root package name */
    private final A f40611c;

    /* renamed from: d  reason: collision with root package name */
    private final d f40612d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40613a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                aA.b[] r0 = aA.C13910b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                aA.b r1 = aA.C13910b.GUEST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                aA.b r1 = aA.C13910b.REGULAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                aA.b r1 = aA.C13910b.FAMILY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f40613a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Wv.g.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.orchestrator.SettingsOrchestratorImpl$createContentFlow$1", f = "SettingsOrchestrator.kt", l = {43}, m = "invokeSuspend")
    static final class b extends l implements p<C16533h<? super String>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40614c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f40615d;

        b(C17164e<? super b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar);
            bVar.f40615d = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super String> hVar, C17164e<? super C16807N> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f40614c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f40615d;
                this.f40615d = hVar;
                this.f40614c = 1;
                if (hVar.emit(null, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f40615d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "theme", "kreativ", "", "storeName", "LWv/f$a;", "<anonymous>", "(ZZLjava/lang/String;)LWv/f$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.membership.impl.orchestrator.SettingsOrchestratorImpl$createContentFlow$2", f = "SettingsOrchestrator.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements r<Boolean, Boolean, String, C17164e<? super f.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f40616c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f40617d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f40618e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f40619f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f40620g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C13910b f40621h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, C13910b bVar, C17164e<? super c> eVar) {
            super(4, eVar);
            this.f40620g = gVar;
            this.f40621h = bVar;
        }

        public final Object i(boolean z10, boolean z11, String str, C17164e<? super f.a> eVar) {
            c cVar = new c(this.f40620g, this.f40621h, eVar);
            cVar.f40617d = z10;
            cVar.f40618e = z11;
            cVar.f40619f = str;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f40616c == 0) {
                y.b(obj);
                boolean z10 = this.f40617d;
                boolean z11 = this.f40618e;
                return new f.a(this.f40620g.c(this.f40621h, (String) this.f40619f, z11, z10));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (String) obj3, (C17164e) obj4);
        }
    }

    public g(C12556a aVar, Dr.b bVar, A a10, d dVar) {
        C17542s.j(aVar, "themeIntegration");
        C17542s.j(bVar, "geomagicalIntegration");
        C17542s.j(a10, "getSelectedStoreNameUseCase");
        C17542s.j(dVar, "settingsListContentFactory");
        this.f40609a = aVar;
        this.f40610b = bVar;
        this.f40611c = a10;
        this.f40612d = dVar;
    }

    /* access modifiers changed from: private */
    public final C15987c<Tv.b> c(C13910b bVar, String str, boolean z10, boolean z11) {
        int i10 = a.f40613a[bVar.ordinal()];
        if (i10 == 1) {
            return this.f40612d.f(str, z10, z11);
        }
        if (i10 == 2) {
            return this.f40612d.g(str, z10, z11);
        }
        if (i10 == 3) {
            return this.f40612d.e(str, z10, z11);
        }
        throw new t();
    }

    private final C16532g<f.a> d(C13910b bVar) {
        return C16534i.m(this.f40609a.isEnabled(), this.f40610b.isEnabled(), C16534i.S(this.f40611c.invoke(), new b((C17164e<? super b>) null)), new c(this, bVar, (C17164e<? super c>) null));
    }

    public C16532g<f.a> a(C13910b bVar) {
        C17542s.j(bVar, "userState");
        return C16534i.s(d(bVar));
    }
}
