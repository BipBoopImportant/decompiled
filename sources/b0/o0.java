package B0;

import T1.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"LB0/o0;", "", "", "maxStoredCharacters", "<init>", "(I)V", "LXH/N;", "d", "()V", "LT1/P;", "value", "", "now", "e", "(LT1/P;J)V", "a", "b", "(LT1/P;)V", "g", "()LT1/P;", "c", "I", "getMaxStoredCharacters", "()I", "LB0/o0$a;", "LB0/o0$a;", "undoStack", "redoStack", "storedCharacters", "Ljava/lang/Long;", "lastSnapshot", "", "f", "Z", "forceNextSnapshot", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f5111a;

    /* renamed from: b  reason: collision with root package name */
    private a f5112b;

    /* renamed from: c  reason: collision with root package name */
    private a f5113c;

    /* renamed from: d  reason: collision with root package name */
    private int f5114d;

    /* renamed from: e  reason: collision with root package name */
    private Long f5115e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5116f;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LB0/o0$a;", "", "next", "LT1/P;", "value", "<init>", "(LB0/o0$a;LT1/P;)V", "a", "LB0/o0$a;", "()LB0/o0$a;", "c", "(LB0/o0$a;)V", "b", "LT1/P;", "()LT1/P;", "d", "(LT1/P;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private a f5117a;

        /* renamed from: b  reason: collision with root package name */
        private P f5118b;

        public a(a aVar, P p10) {
            this.f5117a = aVar;
            this.f5118b = p10;
        }

        public final a a() {
            return this.f5117a;
        }

        public final P b() {
            return this.f5118b;
        }

        public final void c(a aVar) {
            this.f5117a = aVar;
        }

        public final void d(P p10) {
            this.f5118b = p10;
        }
    }

    public o0() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:6:0x000e->B:12:0x001e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023 A[EDGE_INSN: B:15:0x0023->B:13:0x0023 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d() {
        /*
            r3 = this;
            B0.o0$a r0 = r3.f5112b
            r1 = 0
            if (r0 == 0) goto L_0x000a
            B0.o0$a r2 = r0.a()
            goto L_0x000b
        L_0x000a:
            r2 = r1
        L_0x000b:
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            if (r0 == 0) goto L_0x001b
            B0.o0$a r2 = r0.a()
            if (r2 == 0) goto L_0x001b
            B0.o0$a r2 = r2.a()
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            if (r2 == 0) goto L_0x0023
            B0.o0$a r0 = r0.a()
            goto L_0x000e
        L_0x0023:
            if (r0 != 0) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            r0.c(r1)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.o0.d():void");
    }

    public static /* synthetic */ void f(o0 o0Var, P p10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = q0.a();
        }
        o0Var.e(p10, j10);
    }

    public final void a() {
        this.f5116f = true;
    }

    public final void b(P p10) {
        P b10;
        this.f5116f = false;
        a aVar = this.f5112b;
        if (!C17542s.e(p10, aVar != null ? aVar.b() : null)) {
            String i10 = p10.i();
            a aVar2 = this.f5112b;
            if (C17542s.e(i10, (aVar2 == null || (b10 = aVar2.b()) == null) ? null : b10.i())) {
                a aVar3 = this.f5112b;
                if (aVar3 != null) {
                    aVar3.d(p10);
                    return;
                }
                return;
            }
            this.f5112b = new a(this.f5112b, p10);
            this.f5113c = null;
            int length = this.f5114d + p10.i().length();
            this.f5114d = length;
            if (length > this.f5111a) {
                d();
            }
        }
    }

    public final P c() {
        a aVar = this.f5113c;
        if (aVar == null) {
            return null;
        }
        this.f5113c = aVar.a();
        this.f5112b = new a(this.f5112b, aVar.b());
        this.f5114d += aVar.b().i().length();
        return aVar.b();
    }

    public final void e(P p10, long j10) {
        if (!this.f5116f) {
            Long l10 = this.f5115e;
            if (j10 <= (l10 != null ? l10.longValue() : 0) + ((long) p0.a())) {
                return;
            }
        }
        this.f5115e = Long.valueOf(j10);
        b(p10);
    }

    public final P g() {
        a a10;
        a aVar = this.f5112b;
        if (aVar == null || (a10 = aVar.a()) == null) {
            return null;
        }
        this.f5112b = a10;
        this.f5114d -= aVar.b().i().length();
        this.f5113c = new a(this.f5113c, aVar.b());
        return a10.b();
    }

    public o0(int i10) {
        this.f5111a = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 100000 : i10);
    }
}
