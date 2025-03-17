package My;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006\""}, d2 = {"LMy/j;", "", "LMy/i;", "settings", "LMy/c;", "cartContent", "LMy/f;", "navigateTo", "LMy/d;", "cartFooterButton", "<init>", "(LMy/i;LMy/c;LMy/f;LMy/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LMy/i;", "d", "()LMy/i;", "b", "LMy/c;", "()LMy/c;", "c", "LMy/f;", "()LMy/f;", "LMy/d;", "()LMy/d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final i f112173a;

    /* renamed from: b  reason: collision with root package name */
    private final c f112174b;

    /* renamed from: c  reason: collision with root package name */
    private final f f112175c;

    /* renamed from: d  reason: collision with root package name */
    private final d f112176d;

    public j() {
        this((i) null, (c) null, (f) null, (d) null, 15, (DefaultConstructorMarker) null);
    }

    public final c a() {
        return this.f112174b;
    }

    public final d b() {
        return this.f112176d;
    }

    public final f c() {
        return this.f112175c;
    }

    public final i d() {
        return this.f112173a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return C17542s.e(this.f112173a, jVar.f112173a) && C17542s.e(this.f112174b, jVar.f112174b) && C17542s.e(this.f112175c, jVar.f112175c) && C17542s.e(this.f112176d, jVar.f112176d);
    }

    public int hashCode() {
        int hashCode = ((this.f112173a.hashCode() * 31) + this.f112174b.hashCode()) * 31;
        f fVar = this.f112175c;
        return ((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31) + this.f112176d.hashCode();
    }

    public String toString() {
        i iVar = this.f112173a;
        c cVar = this.f112174b;
        f fVar = this.f112175c;
        d dVar = this.f112176d;
        return "UiState(settings=" + iVar + ", cartContent=" + cVar + ", navigateTo=" + fVar + ", cartFooterButton=" + dVar + ")";
    }

    public j(i iVar, c cVar, f fVar, d dVar) {
        C17542s.j(iVar, "settings");
        C17542s.j(cVar, "cartContent");
        C17542s.j(dVar, "cartFooterButton");
        this.f112173a = iVar;
        this.f112174b = cVar;
        this.f112175c = fVar;
        this.f112176d = dVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ j(My.i r16, My.c r17, My.f r18, My.d r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r15 = this;
            r0 = r20 & 1
            if (r0 == 0) goto L_0x0019
            My.i r0 = new My.i
            r13 = 2047(0x7ff, float:2.868E-42)
            r14 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x001b
        L_0x0019:
            r0 = r16
        L_0x001b:
            r1 = r20 & 2
            if (r1 == 0) goto L_0x002d
            My.c r1 = new My.c
            r7 = 15
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x002f
        L_0x002d:
            r1 = r17
        L_0x002f:
            r2 = r20 & 4
            r3 = 0
            if (r2 == 0) goto L_0x0036
            r2 = r3
            goto L_0x0038
        L_0x0036:
            r2 = r18
        L_0x0038:
            r4 = r20 & 8
            if (r4 == 0) goto L_0x0044
            My.d r4 = new My.d
            r5 = 3
            r4.<init>(r3, r3, r5, r3)
            r3 = r15
            goto L_0x0047
        L_0x0044:
            r3 = r15
            r4 = r19
        L_0x0047:
            r15.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: My.j.<init>(My.i, My.c, My.f, My.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
