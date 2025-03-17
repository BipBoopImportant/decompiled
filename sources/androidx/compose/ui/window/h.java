package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB'\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/window/h;", "", "", "dismissOnBackPress", "dismissOnClickOutside", "Landroidx/compose/ui/window/r;", "securePolicy", "usePlatformDefaultWidth", "decorFitsSystemWindows", "<init>", "(ZZLandroidx/compose/ui/window/r;ZZ)V", "(ZZZ)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "b", "()Z", "c", "Landroidx/compose/ui/window/r;", "d", "()Landroidx/compose/ui/window/r;", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19945a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f19946b;

    /* renamed from: c  reason: collision with root package name */
    private final r f19947c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f19948d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f19949e;

    public h() {
        this(false, false, (r) null, false, false, 31, (DefaultConstructorMarker) null);
    }

    public final boolean a() {
        return this.f19949e;
    }

    public final boolean b() {
        return this.f19945a;
    }

    public final boolean c() {
        return this.f19946b;
    }

    public final r d() {
        return this.f19947c;
    }

    public final boolean e() {
        return this.f19948d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f19945a == hVar.f19945a && this.f19946b == hVar.f19946b && this.f19947c == hVar.f19947c && this.f19948d == hVar.f19948d && this.f19949e == hVar.f19949e;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f19945a) * 31) + Boolean.hashCode(this.f19946b)) * 31) + this.f19947c.hashCode()) * 31) + Boolean.hashCode(this.f19948d)) * 31) + Boolean.hashCode(this.f19949e);
    }

    public h(boolean z10, boolean z11, r rVar, boolean z12, boolean z13) {
        this.f19945a = z10;
        this.f19946b = z11;
        this.f19947c = rVar;
        this.f19948d = z12;
        this.f19949e = z13;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ h(boolean r5, boolean r6, androidx.compose.ui.window.r r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 1
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            androidx.compose.ui.window.r r7 = androidx.compose.ui.window.r.Inherit
        L_0x0015:
            r2 = r7
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>((boolean) r6, (boolean) r7, (androidx.compose.ui.window.r) r8, (boolean) r9, (boolean) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.h.<init>(boolean, boolean, androidx.compose.ui.window.r, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12);
    }

    public h(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, r.Inherit, z12, true);
    }
}
