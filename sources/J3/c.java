package j3;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.O;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u000f\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u0002"}, d2 = {"Landroidx/lifecycle/r$a;", "event", "Landroidx/lifecycle/y;", "lifecycleOwner", "Lkotlin/Function0;", "LXH/N;", "onEvent", "a", "(Landroidx/lifecycle/r$a;Landroidx/lifecycle/y;LnI/a;LU0/m;II)V", "", "key1", "Lkotlin/Function1;", "Lj3/f;", "Lj3/e;", "effects", "c", "(Ljava/lang/Object;Landroidx/lifecycle/y;LnI/l;LU0/m;II)V", "scope", "d", "(Landroidx/lifecycle/y;Lj3/f;LnI/l;LU0/m;I)V", "currentOnEvent", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "b", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5221y f24836c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r.a f24837d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<C17631a<C16807N>> f24838e;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"j3/c$a$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: j3.c$a$a  reason: collision with other inner class name */
        public static final class C0394a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5221y f24839a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5218v f24840b;

            public C0394a(C5221y yVar, C5218v vVar) {
                this.f24839a = yVar;
                this.f24840b = vVar;
            }

            public void b() {
                this.f24839a.getLifecycle().g(this.f24840b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5221y yVar, r.a aVar, A1<? extends C17631a<C16807N>> a12) {
            super(1);
            this.f24836c = yVar;
            this.f24837d = aVar;
            this.f24838e = a12;
        }

        /* access modifiers changed from: private */
        public static final void c(r.a aVar, A1 a12, C5221y yVar, r.a aVar2) {
            if (aVar2 == aVar) {
                c.b(a12).invoke();
            }
        }

        /* renamed from: b */
        public final L invoke(M m10) {
            b bVar = new b(this.f24837d, this.f24838e);
            this.f24836c.getLifecycle().c(bVar);
            return new C0394a(this.f24836c, bVar);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r.a f24841c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5221y f24842d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f24843e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f24844f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f24845g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r.a aVar, C5221y yVar, C17631a<C16807N> aVar2, int i10, int i11) {
            super(2);
            this.f24841c = aVar;
            this.f24842d = yVar;
            this.f24843e = aVar2;
            this.f24844f = i10;
            this.f24845g = i11;
        }

        public final void a(C4889m mVar, int i10) {
            c.a(this.f24841c, this.f24842d, this.f24843e, mVar, M0.a(this.f24844f | 1), this.f24845g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j3.c$c  reason: collision with other inner class name */
    static final class C0395c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f24846c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5221y f24847d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<f, e> f24848e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f24849f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f24850g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0395c(Object obj, C5221y yVar, C17642l<? super f, ? extends e> lVar, int i10, int i11) {
            super(2);
            this.f24846c = obj;
            this.f24847d = yVar;
            this.f24848e = lVar;
            this.f24849f = i10;
            this.f24850g = i11;
        }

        public final void a(C4889m mVar, int i10) {
            c.c(this.f24846c, this.f24847d, this.f24848e, mVar, M0.a(this.f24849f | 1), this.f24850g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "b", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5221y f24851c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f24852d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<f, e> f24853e;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f24854a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    androidx.lifecycle.r$a[] r0 = androidx.lifecycle.r.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f24854a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: j3.c.d.a.<clinit>():void");
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"j3/c$d$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5221y f24855a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5218v f24856b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ O f24857c;

            public b(C5221y yVar, C5218v vVar, O o10) {
                this.f24855a = yVar;
                this.f24856b = vVar;
                this.f24857c = o10;
            }

            public void b() {
                this.f24855a.getLifecycle().g(this.f24856b);
                e eVar = (e) this.f24857c.f144348a;
                if (eVar != null) {
                    eVar.a();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C5221y yVar, f fVar, C17642l<? super f, ? extends e> lVar) {
            super(1);
            this.f24851c = yVar;
            this.f24852d = fVar;
            this.f24853e = lVar;
        }

        /* access modifiers changed from: private */
        public static final void c(f fVar, O o10, C17642l lVar, C5221y yVar, r.a aVar) {
            int i10 = a.f24854a[aVar.ordinal()];
            if (i10 == 1) {
                o10.f144348a = lVar.invoke(fVar);
            } else if (i10 == 2) {
                e eVar = (e) o10.f144348a;
                if (eVar != null) {
                    eVar.a();
                }
                o10.f144348a = null;
            }
        }

        /* renamed from: b */
        public final L invoke(M m10) {
            O o10 = new O();
            d dVar = new d(this.f24852d, o10, this.f24853e);
            this.f24851c.getLifecycle().c(dVar);
            return new b(this.f24851c, dVar, o10);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5221y f24858c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f24859d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<f, e> f24860e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f24861f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C5221y yVar, f fVar, C17642l<? super f, ? extends e> lVar, int i10) {
            super(2);
            this.f24858c = yVar;
            this.f24859d = fVar;
            this.f24860e = lVar;
            this.f24861f = i10;
        }

        public final void a(C4889m mVar, int i10) {
            c.d(this.f24858c, this.f24859d, this.f24860e, mVar, M0.a(this.f24861f | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0070, code lost:
        if ((r12 & 2) != 0) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.lifecycle.r.a r7, androidx.lifecycle.C5221y r8, nI.C17631a<XH.C16807N> r9, U0.C4889m r10, int r11, int r12) {
        /*
            r0 = -709389590(0xffffffffd5b792ea, float:-2.52302024E13)
            U0.m r10 = r10.k(r0)
            r1 = r12 & 1
            r2 = 4
            if (r1 == 0) goto L_0x000f
            r1 = r11 | 6
            goto L_0x001f
        L_0x000f:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x001e
            boolean r1 = r10.V(r7)
            if (r1 == 0) goto L_0x001b
            r1 = r2
            goto L_0x001c
        L_0x001b:
            r1 = 2
        L_0x001c:
            r1 = r1 | r11
            goto L_0x001f
        L_0x001e:
            r1 = r11
        L_0x001f:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x0033
            r3 = r12 & 2
            if (r3 != 0) goto L_0x0030
            boolean r3 = r10.F(r8)
            if (r3 == 0) goto L_0x0030
            r3 = 32
            goto L_0x0032
        L_0x0030:
            r3 = 16
        L_0x0032:
            r1 = r1 | r3
        L_0x0033:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x003a
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x004a
        L_0x003a:
            r3 = r11 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004a
            boolean r3 = r10.F(r9)
            if (r3 == 0) goto L_0x0047
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0049
        L_0x0047:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0049:
            r1 = r1 | r3
        L_0x004a:
            r3 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            if (r3 != r4) goto L_0x005d
            boolean r3 = r10.l()
            if (r3 != 0) goto L_0x0057
            goto L_0x005d
        L_0x0057:
            r10.L()
        L_0x005a:
            r3 = r8
            goto L_0x00d9
        L_0x005d:
            r10.G()
            r3 = r11 & 1
            if (r3 == 0) goto L_0x0075
            boolean r3 = r10.O()
            if (r3 == 0) goto L_0x006b
            goto L_0x0075
        L_0x006b:
            r10.L()
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0084
        L_0x0072:
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0084
        L_0x0075:
            r3 = r12 & 2
            if (r3 == 0) goto L_0x0084
            U0.I0 r8 = j3.g.a()
            java.lang.Object r8 = r10.Q(r8)
            androidx.lifecycle.y r8 = (androidx.lifecycle.C5221y) r8
            goto L_0x0072
        L_0x0084:
            r10.y()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0093
            r3 = -1
            java.lang.String r4 = "androidx.lifecycle.compose.LifecycleEventEffect (LifecycleEffect.kt:57)"
            U0.C4895p.S(r0, r1, r3, r4)
        L_0x0093:
            androidx.lifecycle.r$a r0 = androidx.lifecycle.r.a.ON_DESTROY
            if (r7 == r0) goto L_0x00ed
            int r0 = r1 >> 6
            r0 = r0 & 14
            U0.A1 r0 = U0.p1.q(r9, r10, r0)
            r3 = r1 & 14
            if (r3 != r2) goto L_0x00a5
            r2 = 1
            goto L_0x00a6
        L_0x00a5:
            r2 = 0
        L_0x00a6:
            boolean r3 = r10.V(r0)
            r2 = r2 | r3
            boolean r3 = r10.F(r8)
            r2 = r2 | r3
            java.lang.Object r3 = r10.D()
            if (r2 != 0) goto L_0x00be
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x00c6
        L_0x00be:
            j3.c$a r3 = new j3.c$a
            r3.<init>(r8, r7, r0)
            r10.u(r3)
        L_0x00c6:
            nI.l r3 = (nI.C17642l) r3
            int r0 = r1 >> 3
            r0 = r0 & 14
            U0.P.c(r8, r3, r10, r0)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x005a
            U0.C4895p.R()
            goto L_0x005a
        L_0x00d9:
            U0.Y0 r8 = r10.n()
            if (r8 == 0) goto L_0x00ec
            j3.c$b r10 = new j3.c$b
            r1 = r10
            r2 = r7
            r4 = r9
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r8.a(r10)
        L_0x00ec:
            return
        L_0x00ed:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.c.a(androidx.lifecycle.r$a, androidx.lifecycle.y, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C17631a<C16807N> b(A1<? extends C17631a<C16807N>> a12) {
        return (C17631a) a12.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006f, code lost:
        if ((r12 & 2) != 0) goto L_0x0071;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(java.lang.Object r7, androidx.lifecycle.C5221y r8, nI.C17642l<? super j3.f, ? extends j3.e> r9, U0.C4889m r10, int r11, int r12) {
        /*
            r0 = 1220373486(0x48bd6bee, float:387935.44)
            U0.m r10 = r10.k(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x000e
            r1 = r11 | 6
            goto L_0x001e
        L_0x000e:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x001d
            boolean r1 = r10.F(r7)
            if (r1 == 0) goto L_0x001a
            r1 = 4
            goto L_0x001b
        L_0x001a:
            r1 = 2
        L_0x001b:
            r1 = r1 | r11
            goto L_0x001e
        L_0x001d:
            r1 = r11
        L_0x001e:
            r2 = r11 & 48
            if (r2 != 0) goto L_0x0032
            r2 = r12 & 2
            if (r2 != 0) goto L_0x002f
            boolean r2 = r10.F(r8)
            if (r2 == 0) goto L_0x002f
            r2 = 32
            goto L_0x0031
        L_0x002f:
            r2 = 16
        L_0x0031:
            r1 = r1 | r2
        L_0x0032:
            r2 = r12 & 4
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0049
        L_0x0039:
            r2 = r11 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0049
            boolean r2 = r10.F(r9)
            if (r2 == 0) goto L_0x0046
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0048
        L_0x0046:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0048:
            r1 = r1 | r2
        L_0x0049:
            r2 = r1 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 != r3) goto L_0x005c
            boolean r2 = r10.l()
            if (r2 != 0) goto L_0x0056
            goto L_0x005c
        L_0x0056:
            r10.L()
        L_0x0059:
            r3 = r8
            goto L_0x00cb
        L_0x005c:
            r10.G()
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0074
            boolean r2 = r10.O()
            if (r2 == 0) goto L_0x006a
            goto L_0x0074
        L_0x006a:
            r10.L()
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0083
        L_0x0071:
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0083
        L_0x0074:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x0083
            U0.I0 r8 = j3.g.a()
            java.lang.Object r8 = r10.Q(r8)
            androidx.lifecycle.y r8 = (androidx.lifecycle.C5221y) r8
            goto L_0x0071
        L_0x0083:
            r10.y()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0092
            r2 = -1
            java.lang.String r3 = "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:467)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x0092:
            boolean r0 = r10.V(r7)
            boolean r2 = r10.V(r8)
            r0 = r0 | r2
            java.lang.Object r2 = r10.D()
            if (r0 != 0) goto L_0x00a9
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x00b5
        L_0x00a9:
            j3.f r2 = new j3.f
            androidx.lifecycle.r r0 = r8.getLifecycle()
            r2.<init>(r0)
            r10.u(r2)
        L_0x00b5:
            j3.f r2 = (j3.f) r2
            int r0 = r1 >> 3
            r0 = r0 & 14
            r1 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            d(r8, r2, r9, r10, r0)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0059
            U0.C4895p.R()
            goto L_0x0059
        L_0x00cb:
            U0.Y0 r8 = r10.n()
            if (r8 == 0) goto L_0x00de
            j3.c$c r10 = new j3.c$c
            r1 = r10
            r2 = r7
            r4 = r9
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r8.a(r10)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.c.c(java.lang.Object, androidx.lifecycle.y, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void d(C5221y yVar, f fVar, C17642l<? super f, ? extends e> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(912823238);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(yVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(fVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(lVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(912823238, i11, -1, "androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:689)");
            }
            boolean F10 = k10.F(fVar) | ((i11 & 896) == 256) | k10.F(yVar);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new d(yVar, fVar, lVar);
                k10.u(D10);
            }
            P.b(yVar, fVar, (C17642l) D10, k10, i11 & 126);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new e(yVar, fVar, lVar, i10));
        }
    }
}
