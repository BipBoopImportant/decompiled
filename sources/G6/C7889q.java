package g6;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJM\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lg6/q;", "", "", "code", "", "requestMillis", "responseMillis", "Lg6/n;", "headers", "Lg6/r;", "body", "delegate", "<init>", "(IJJLg6/n;Lg6/r;Ljava/lang/Object;)V", "a", "(IJJLg6/n;Lg6/r;Ljava/lang/Object;)Lg6/q;", "I", "d", "()I", "b", "J", "f", "()J", "c", "g", "Lg6/n;", "e", "()Lg6/n;", "Lg6/r;", "()Lg6/r;", "Ljava/lang/Object;", "getDelegate", "()Ljava/lang/Object;", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: g6.q  reason: case insensitive filesystem */
public final class C7889q {

    /* renamed from: a  reason: collision with root package name */
    private final int f51335a;

    /* renamed from: b  reason: collision with root package name */
    private final long f51336b;

    /* renamed from: c  reason: collision with root package name */
    private final long f51337c;

    /* renamed from: d  reason: collision with root package name */
    private final C7886n f51338d;

    /* renamed from: e  reason: collision with root package name */
    private final C7890r f51339e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f51340f;

    public C7889q() {
        this(0, 0, 0, (C7886n) null, (C7890r) null, (Object) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C7889q b(C7889q qVar, int i10, long j10, long j11, C7886n nVar, C7890r rVar, Object obj, int i11, Object obj2) {
        C7889q qVar2 = qVar;
        return qVar.a((i11 & 1) != 0 ? qVar2.f51335a : i10, (i11 & 2) != 0 ? qVar2.f51336b : j10, (i11 & 4) != 0 ? qVar2.f51337c : j11, (i11 & 8) != 0 ? qVar2.f51338d : nVar, (i11 & 16) != 0 ? qVar2.f51339e : rVar, (i11 & 32) != 0 ? qVar2.f51340f : obj);
    }

    public final C7889q a(int i10, long j10, long j11, C7886n nVar, C7890r rVar, Object obj) {
        return new C7889q(i10, j10, j11, nVar, rVar, obj);
    }

    public final C7890r c() {
        return this.f51339e;
    }

    public final int d() {
        return this.f51335a;
    }

    public final C7886n e() {
        return this.f51338d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7889q)) {
            return false;
        }
        C7889q qVar = (C7889q) obj;
        return this.f51335a == qVar.f51335a && this.f51336b == qVar.f51336b && this.f51337c == qVar.f51337c && C17542s.e(this.f51338d, qVar.f51338d) && C17542s.e(this.f51339e, qVar.f51339e) && C17542s.e(this.f51340f, qVar.f51340f);
    }

    public final long f() {
        return this.f51336b;
    }

    public final long g() {
        return this.f51337c;
    }

    public int hashCode() {
        int hashCode = ((((((this.f51335a * 31) + Long.hashCode(this.f51336b)) * 31) + Long.hashCode(this.f51337c)) * 31) + this.f51338d.hashCode()) * 31;
        C7890r rVar = this.f51339e;
        int i10 = 0;
        int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Object obj = this.f51340f;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "NetworkResponse(code=" + this.f51335a + ", requestMillis=" + this.f51336b + ", responseMillis=" + this.f51337c + ", headers=" + this.f51338d + ", body=" + this.f51339e + ", delegate=" + this.f51340f + ')';
    }

    public C7889q(int i10, long j10, long j11, C7886n nVar, C7890r rVar, Object obj) {
        this.f51335a = i10;
        this.f51336b = j10;
        this.f51337c = j11;
        this.f51338d = nVar;
        this.f51339e = rVar;
        this.f51340f = obj;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C7889q(int r10, long r11, long r13, g6.C7886n r15, g6.C7890r r16, java.lang.Object r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18 & 1
            if (r0 == 0) goto L_0x0007
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x0008
        L_0x0007:
            r0 = r10
        L_0x0008:
            r1 = r18 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0010
            r4 = r2
            goto L_0x0011
        L_0x0010:
            r4 = r11
        L_0x0011:
            r1 = r18 & 4
            if (r1 == 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r2 = r13
        L_0x0017:
            r1 = r18 & 8
            if (r1 == 0) goto L_0x001e
            g6.n r1 = g6.C7886n.f51327c
            goto L_0x001f
        L_0x001e:
            r1 = r15
        L_0x001f:
            r6 = r18 & 16
            r7 = 0
            if (r6 == 0) goto L_0x0026
            r6 = r7
            goto L_0x0028
        L_0x0026:
            r6 = r16
        L_0x0028:
            r8 = r18 & 32
            if (r8 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r10 = r9
            r11 = r0
            r12 = r4
            r14 = r2
            r16 = r1
            r17 = r6
            r18 = r7
            r10.<init>(r11, r12, r14, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.C7889q.<init>(int, long, long, g6.n, g6.r, java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
