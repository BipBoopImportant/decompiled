package I0;

import U0.A1;
import XH.C16807N;
import c2.h;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.B0;
import m0.C5530a;
import m0.C5554m;
import r0.C5812d;
import r0.g;
import r0.j;
import r0.o;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H@ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH@¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"LI0/V;", "", "Lc2/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lr0/j;", "d", "(Lr0/j;)F", "LXH/N;", "e", "(LdI/e;)Ljava/lang/Object;", "f", "(FFFFLdI/e;)Ljava/lang/Object;", "to", "b", "(Lr0/j;LdI/e;)Ljava/lang/Object;", "LU0/A1;", "c", "()LU0/A1;", "a", "F", "Lm0/a;", "Lm0/m;", "Lm0/a;", "animatable", "Lr0/j;", "lastTargetInteraction", "g", "targetInteraction", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class V {

    /* renamed from: a  reason: collision with root package name */
    private float f7593a;

    /* renamed from: b  reason: collision with root package name */
    private float f7594b;

    /* renamed from: c  reason: collision with root package name */
    private float f7595c;

    /* renamed from: d  reason: collision with root package name */
    private float f7596d;

    /* renamed from: e  reason: collision with root package name */
    private final C5530a<h, C5554m> f7597e;

    /* renamed from: f  reason: collision with root package name */
    private j f7598f;

    /* renamed from: g  reason: collision with root package name */
    private j f7599g;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {397}, m = "animateElevation")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f7600c;

        /* renamed from: d  reason: collision with root package name */
        Object f7601d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f7602e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ V f7603f;

        /* renamed from: g  reason: collision with root package name */
        int f7604g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(V v10, C17164e<? super a> eVar) {
            super(eVar);
            this.f7603f = v10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7602e = obj;
            this.f7604g |= Integer.MIN_VALUE;
            return this.f7603f.b((j) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {383}, m = "snapElevation")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f7605c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f7606d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ V f7607e;

        /* renamed from: f  reason: collision with root package name */
        int f7608f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(V v10, C17164e<? super b> eVar) {
            super(eVar);
            this.f7607e = v10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f7606d = obj;
            this.f7608f |= Integer.MIN_VALUE;
            return this.f7607e.e(this);
        }
    }

    public /* synthetic */ V(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    private final float d(j jVar) {
        return jVar instanceof o.b ? this.f7594b : jVar instanceof g ? this.f7595c : jVar instanceof C5812d ? this.f7596d : this.f7593a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof I0.V.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            I0.V$b r0 = (I0.V.b) r0
            int r1 = r0.f7608f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7608f = r1
            goto L_0x0018
        L_0x0013:
            I0.V$b r0 = new I0.V$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f7606d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f7608f
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.f7605c
            I0.V r0 = (I0.V) r0
            XH.y.b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0064
        L_0x002d:
            r5 = move-exception
            goto L_0x006b
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            XH.y.b(r5)
            r0.j r5 = r4.f7599g
            float r5 = r4.d(r5)
            m0.a<c2.h, m0.m> r2 = r4.f7597e
            java.lang.Object r2 = r2.k()
            c2.h r2 = (c2.h) r2
            float r2 = r2.G()
            boolean r2 = c2.h.D(r2, r5)
            if (r2 != 0) goto L_0x0070
            m0.a<c2.h, m0.m> r2 = r4.f7597e     // Catch:{ all -> 0x0069 }
            c2.h r5 = c2.h.m(r5)     // Catch:{ all -> 0x0069 }
            r0.f7605c = r4     // Catch:{ all -> 0x0069 }
            r0.f7608f = r3     // Catch:{ all -> 0x0069 }
            java.lang.Object r5 = r2.t(r5, r0)     // Catch:{ all -> 0x0069 }
            if (r5 != r1) goto L_0x0063
            return r1
        L_0x0063:
            r0 = r4
        L_0x0064:
            r0.j r5 = r0.f7599g
            r0.f7598f = r5
            goto L_0x0070
        L_0x0069:
            r5 = move-exception
            r0 = r4
        L_0x006b:
            r0.j r1 = r0.f7599g
            r0.f7598f = r1
            throw r5
        L_0x0070:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.V.e(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(r0.j r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof I0.V.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            I0.V$a r0 = (I0.V.a) r0
            int r1 = r0.f7604g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f7604g = r1
            goto L_0x0018
        L_0x0013:
            I0.V$a r0 = new I0.V$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f7602e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f7604g
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r6 = r0.f7601d
            r0.j r6 = (r0.j) r6
            java.lang.Object r0 = r0.f7600c
            I0.V r0 = (I0.V) r0
            XH.y.b(r7)     // Catch:{ all -> 0x0031 }
            goto L_0x006b
        L_0x0031:
            r7 = move-exception
            goto L_0x0070
        L_0x0033:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003b:
            XH.y.b(r7)
            float r7 = r5.d(r6)
            r5.f7599g = r6
            m0.a<c2.h, m0.m> r2 = r5.f7597e     // Catch:{ all -> 0x0067 }
            java.lang.Object r2 = r2.k()     // Catch:{ all -> 0x0067 }
            c2.h r2 = (c2.h) r2     // Catch:{ all -> 0x0067 }
            float r2 = r2.G()     // Catch:{ all -> 0x0067 }
            boolean r2 = c2.h.D(r2, r7)     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x006a
            m0.a<c2.h, m0.m> r2 = r5.f7597e     // Catch:{ all -> 0x0067 }
            r0.j r4 = r5.f7598f     // Catch:{ all -> 0x0067 }
            r0.f7600c = r5     // Catch:{ all -> 0x0067 }
            r0.f7601d = r6     // Catch:{ all -> 0x0067 }
            r0.f7604g = r3     // Catch:{ all -> 0x0067 }
            java.lang.Object r7 = I0.K.d(r2, r7, r4, r6, r0)     // Catch:{ all -> 0x0067 }
            if (r7 != r1) goto L_0x006a
            return r1
        L_0x0067:
            r7 = move-exception
            r0 = r5
            goto L_0x0070
        L_0x006a:
            r0 = r5
        L_0x006b:
            r0.f7598f = r6
            XH.N r6 = XH.C16807N.f139792a
            return r6
        L_0x0070:
            r0.f7598f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.V.b(r0.j, dI.e):java.lang.Object");
    }

    public final A1<h> c() {
        return this.f7597e.g();
    }

    public final Object f(float f10, float f11, float f12, float f13, C17164e<? super C16807N> eVar) {
        this.f7593a = f10;
        this.f7594b = f11;
        this.f7595c = f12;
        this.f7596d = f13;
        Object e10 = e(eVar);
        return e10 == C17187b.f() ? e10 : C16807N.f139792a;
    }

    private V(float f10, float f11, float f12, float f13) {
        this.f7593a = f10;
        this.f7594b = f11;
        this.f7595c = f12;
        this.f7596d = f13;
        this.f7597e = new C5530a(h.m(this.f7593a), B0.b(h.f23031b), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
    }
}
