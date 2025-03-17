package S5;

import E5.k;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"LS5/o;", "", "", "addLastModifiedToFileCacheKey", "networkObserverEnabled", "respectCacheHeaders", "", "bitmapFactoryMaxParallelism", "LE5/k;", "bitmapFactoryExifOrientationPolicy", "<init>", "(ZZZILE5/k;)V", "a", "(ZZZILE5/k;)LS5/o;", "Z", "c", "()Z", "b", "f", "g", "d", "I", "e", "()I", "LE5/k;", "()LE5/k;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f39898a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39899b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f39900c;

    /* renamed from: d  reason: collision with root package name */
    private final int f39901d;

    /* renamed from: e  reason: collision with root package name */
    private final k f39902e;

    public o(boolean z10, boolean z11, boolean z12, int i10, k kVar) {
        this.f39898a = z10;
        this.f39899b = z11;
        this.f39900c = z12;
        this.f39901d = i10;
        this.f39902e = kVar;
    }

    public static /* synthetic */ o b(o oVar, boolean z10, boolean z11, boolean z12, int i10, k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = oVar.f39898a;
        }
        if ((i11 & 2) != 0) {
            z11 = oVar.f39899b;
        }
        boolean z13 = z11;
        if ((i11 & 4) != 0) {
            z12 = oVar.f39900c;
        }
        boolean z14 = z12;
        if ((i11 & 8) != 0) {
            i10 = oVar.f39901d;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            kVar = oVar.f39902e;
        }
        return oVar.a(z10, z13, z14, i12, kVar);
    }

    public final o a(boolean z10, boolean z11, boolean z12, int i10, k kVar) {
        return new o(z10, z11, z12, i10, kVar);
    }

    public final boolean c() {
        return this.f39898a;
    }

    public final k d() {
        return this.f39902e;
    }

    public final int e() {
        return this.f39901d;
    }

    public final boolean f() {
        return this.f39899b;
    }

    public final boolean g() {
        return this.f39900c;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ o(boolean r4, boolean r5, boolean r6, int r7, E5.k r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 1
            if (r10 == 0) goto L_0x0007
            r10 = r0
            goto L_0x0008
        L_0x0007:
            r10 = r4
        L_0x0008:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r5
        L_0x000f:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r0 = r6
        L_0x0015:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001a
            r7 = 4
        L_0x001a:
            r2 = r7
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0021
            E5.k r8 = E5.k.RESPECT_PERFORMANCE
        L_0x0021:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r0
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.o.<init>(boolean, boolean, boolean, int, E5.k, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
