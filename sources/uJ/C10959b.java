package Uj;

import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Tj.l;
import Uj.C10958a;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.lifecycle.f0;
import dI.C17164e;
import eI.C17187b;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import nI.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0006¢\u0006\u0012\n\u0004\b\u0019\u0010\u0017\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"LUj/b;", "Landroidx/lifecycle/f0;", "LTj/l;", "getCartQuantityUpdateFlow", "<init>", "(LTj/l;)V", "LTj/l$a;", "update", "LUj/a;", "E", "(LTj/l$a;)LUj/a;", "LUj/b$a;", "event", "LXH/N;", "D", "(LUj/b$a;)V", "LTJ/B;", "", "m", "LTJ/B;", "isBadgeUpdatesAllowed", "LTJ/g;", "n", "LTJ/g;", "buttonStateFlow", "o", "C", "()LTJ/g;", "getState$annotations", "()V", "state", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Uj.b  reason: case insensitive filesystem */
public final class C10959b extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C16505B<Boolean> f88004m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C16532g<C10958a> f88005n;

    /* renamed from: o  reason: collision with root package name */
    private final C16532g<C10958a> f88006o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LUj/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "PostponeBadgeUpdates", "ResumeBadgeUpdates", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Uj.b$a */
    public enum a {
        PostponeBadgeUpdates,
        ResumeBadgeUpdates;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Uj.b$b  reason: collision with other inner class name */
    public /* synthetic */ class C1837b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f88007a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Uj.b$a[] r0 = Uj.C10959b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Uj.b$a r1 = Uj.C10959b.a.PostponeBadgeUpdates     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Uj.b$a r1 = Uj.C10959b.a.ResumeBadgeUpdates     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f88007a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Uj.C10959b.C1837b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Uj.b$c */
    /* synthetic */ class c extends G {

        /* renamed from: b  reason: collision with root package name */
        public static final c f88008b = new c();

        c() {
            super(C10958a.class, "totalQuantity", "getTotalQuantity()I", 0);
        }

        public Object get(Object obj) {
            return Integer.valueOf(((C10958a) obj).a());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.CartButtonViewModel$special$$inlined$flatMapLatest$1", f = "CartButtonViewModel.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: Uj.b$d */
    public static final class d extends l implements q<C16533h<? super C10958a>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88009c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f88010d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f88011e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C10959b f88012f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17164e eVar, C10959b bVar) {
            super(3, eVar);
            this.f88012f = bVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C10958a> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            d dVar = new d(eVar, this.f88012f);
            dVar.f88010d = hVar;
            dVar.f88011e = bool;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f88009c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f88010d;
                C16532g h10 = ((Boolean) this.f88011e).booleanValue() ? this.f88012f.f88005n : C16534i.y();
                this.f88009c = 1;
                if (C16534i.x(hVar, h10, this) == f10) {
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
    /* renamed from: Uj.b$e */
    public static final class e implements C16532g<C10958a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f88013a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C10959b f88014b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Uj.b$e$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f88015a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C10959b f88016b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.CartButtonViewModel$special$$inlined$map$1$2", f = "CartButtonViewModel.kt", l = {50}, m = "emit")
            /* renamed from: Uj.b$e$a$a  reason: collision with other inner class name */
            public static final class C1838a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f88017c;

                /* renamed from: d  reason: collision with root package name */
                int f88018d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f88019e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1838a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f88019e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f88017c = obj;
                    this.f88018d |= Integer.MIN_VALUE;
                    return this.f88019e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C10959b bVar) {
                this.f88015a = hVar;
                this.f88016b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Uj.C10959b.e.a.C1838a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Uj.b$e$a$a r0 = (Uj.C10959b.e.a.C1838a) r0
                    int r1 = r0.f88018d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f88018d = r1
                    goto L_0x0018
                L_0x0013:
                    Uj.b$e$a$a r0 = new Uj.b$e$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f88017c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f88018d
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
                    TJ.h r6 = r4.f88015a
                    Tj.l$a r5 = (Tj.l.a) r5
                    Uj.b r2 = r4.f88016b
                    Uj.a r5 = r2.E(r5)
                    r0.f88018d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Uj.C10959b.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar, C10959b bVar) {
            this.f88013a = gVar;
            this.f88014b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f88013a.collect(new a(hVar, this.f88014b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C10959b(Tj.l lVar) {
        C17542s.j(lVar, "getCartQuantityUpdateFlow");
        C16505B<Boolean> a10 = C16521S.a(Boolean.TRUE);
        this.f88004m = a10;
        this.f88005n = C16534i.t(new e(lVar.invoke(), this), c.f88008b);
        this.f88006o = C16534i.g0(a10, new d((C17164e) null, this));
    }

    /* access modifiers changed from: private */
    public final C10958a E(l.a aVar) {
        if (aVar.b() == 0) {
            return C10958a.b.f88001a;
        }
        return new C10958a.C1836a(aVar.b(), aVar instanceof l.a.b ? C10958a.c.ProductAdded : C10958a.c.Other);
    }

    public final C16532g<C10958a> C() {
        return this.f88006o;
    }

    public final void D(a aVar) {
        C17542s.j(aVar, "event");
        C16505B<Boolean> b10 = this.f88004m;
        int i10 = C1837b.f88007a[aVar.ordinal()];
        boolean z10 = true;
        if (i10 == 1) {
            z10 = false;
        } else if (i10 != 2) {
            throw new t();
        }
        b10.setValue(Boolean.valueOf(z10));
    }
}
