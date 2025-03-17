package Ds;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ys.C12502a;
import ys.C12505d;
import ys.C12507f;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001Ba\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010Jj\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b#\u0010(R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b+\u0010&R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b,\u0010&R\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b)\u0010&¨\u0006-"}, d2 = {"LDs/o;", "", "", "Lys/d;", "notifications", "Lys/f;", "userMessage", "", "isUserMessageDismissed", "Lys/a;", "navigateTo", "isLoadingNotifications", "isRefreshingSources", "isManuallyRefreshing", "showNotificationOptIn", "<init>", "(Ljava/util/List;Lys/f;ZLys/a;ZZZZ)V", "a", "(Ljava/util/List;Lys/f;ZLys/a;ZZZZ)LDs/o;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lys/f;", "f", "()Lys/f;", "c", "Z", "j", "()Z", "Lys/a;", "()Lys/a;", "e", "g", "i", "h", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final List<C12505d> f80264a;

    /* renamed from: b  reason: collision with root package name */
    private final C12507f f80265b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f80266c;

    /* renamed from: d  reason: collision with root package name */
    private final C12502a f80267d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f80268e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f80269f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f80270g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f80271h;

    public o() {
        this((List) null, (C12507f) null, false, (C12502a) null, false, false, false, false, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ o b(o oVar, List list, C12507f fVar, boolean z10, C12502a aVar, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
        o oVar2 = oVar;
        int i11 = i10;
        return oVar.a((i11 & 1) != 0 ? oVar2.f80264a : list, (i11 & 2) != 0 ? oVar2.f80265b : fVar, (i11 & 4) != 0 ? oVar2.f80266c : z10, (i11 & 8) != 0 ? oVar2.f80267d : aVar, (i11 & 16) != 0 ? oVar2.f80268e : z11, (i11 & 32) != 0 ? oVar2.f80269f : z12, (i11 & 64) != 0 ? oVar2.f80270g : z13, (i11 & 128) != 0 ? oVar2.f80271h : z14);
    }

    public final o a(List<C12505d> list, C12507f fVar, boolean z10, C12502a aVar, boolean z11, boolean z12, boolean z13, boolean z14) {
        C17542s.j(list, "notifications");
        return new o(list, fVar, z10, aVar, z11, z12, z13, z14);
    }

    public final C12502a c() {
        return this.f80267d;
    }

    public final List<C12505d> d() {
        return this.f80264a;
    }

    public final boolean e() {
        return this.f80271h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return C17542s.e(this.f80264a, oVar.f80264a) && C17542s.e(this.f80265b, oVar.f80265b) && this.f80266c == oVar.f80266c && C17542s.e(this.f80267d, oVar.f80267d) && this.f80268e == oVar.f80268e && this.f80269f == oVar.f80269f && this.f80270g == oVar.f80270g && this.f80271h == oVar.f80271h;
    }

    public final C12507f f() {
        return this.f80265b;
    }

    public final boolean g() {
        return this.f80268e;
    }

    public final boolean h() {
        return this.f80270g;
    }

    public int hashCode() {
        int hashCode = this.f80264a.hashCode() * 31;
        C12507f fVar = this.f80265b;
        int i10 = 0;
        int hashCode2 = (((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31) + Boolean.hashCode(this.f80266c)) * 31;
        C12502a aVar = this.f80267d;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return ((((((((hashCode2 + i10) * 31) + Boolean.hashCode(this.f80268e)) * 31) + Boolean.hashCode(this.f80269f)) * 31) + Boolean.hashCode(this.f80270g)) * 31) + Boolean.hashCode(this.f80271h);
    }

    public final boolean i() {
        return this.f80269f;
    }

    public final boolean j() {
        return this.f80266c;
    }

    public String toString() {
        List<C12505d> list = this.f80264a;
        C12507f fVar = this.f80265b;
        boolean z10 = this.f80266c;
        C12502a aVar = this.f80267d;
        boolean z11 = this.f80268e;
        boolean z12 = this.f80269f;
        boolean z13 = this.f80270g;
        boolean z14 = this.f80271h;
        return "InboxViewModelState(notifications=" + list + ", userMessage=" + fVar + ", isUserMessageDismissed=" + z10 + ", navigateTo=" + aVar + ", isLoadingNotifications=" + z11 + ", isRefreshingSources=" + z12 + ", isManuallyRefreshing=" + z13 + ", showNotificationOptIn=" + z14 + ")";
    }

    public o(List<C12505d> list, C12507f fVar, boolean z10, C12502a aVar, boolean z11, boolean z12, boolean z13, boolean z14) {
        C17542s.j(list, "notifications");
        this.f80264a = list;
        this.f80265b = fVar;
        this.f80266c = z10;
        this.f80267d = aVar;
        this.f80268e = z11;
        this.f80269f = z12;
        this.f80270g = z13;
        this.f80271h = z14;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ o(java.util.List r10, ys.C12507f r11, boolean r12, ys.C12502a r13, boolean r14, boolean r15, boolean r16, boolean r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000b
            java.util.List r1 = YH.C16877v.n()
            goto L_0x000c
        L_0x000b:
            r1 = r10
        L_0x000c:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0013
            r2 = r3
            goto L_0x0014
        L_0x0013:
            r2 = r11
        L_0x0014:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L_0x001b
            r4 = r5
            goto L_0x001c
        L_0x001b:
            r4 = r12
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r3 = r13
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r5
            goto L_0x0029
        L_0x0028:
            r6 = r14
        L_0x0029:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002f
            r7 = r5
            goto L_0x0030
        L_0x002f:
            r7 = r15
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r5
            goto L_0x0038
        L_0x0036:
            r8 = r16
        L_0x0038:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r5 = r17
        L_0x003f:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r4
            r14 = r3
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ds.o.<init>(java.util.List, ys.f, boolean, ys.a, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
