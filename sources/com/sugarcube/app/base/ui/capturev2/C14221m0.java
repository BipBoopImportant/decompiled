package com.sugarcube.app.base.ui.capturev2;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/m0;", "", "", "timestamp", "", "points", "", "ids", "<init>", "(J[F[I)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "[F", "()[F", "[I", "()[I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.capturev2.m0  reason: case insensitive filesystem */
public final class C14221m0 {

    /* renamed from: a  reason: collision with root package name */
    private final long f123950a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f123951b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f123952c;

    public C14221m0() {
        this(0, (float[]) null, (int[]) null, 7, (DefaultConstructorMarker) null);
    }

    public final int[] a() {
        return this.f123952c;
    }

    public final float[] b() {
        return this.f123951b;
    }

    public final long c() {
        return this.f123950a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14221m0)) {
            return false;
        }
        C14221m0 m0Var = (C14221m0) obj;
        return this.f123950a == m0Var.f123950a && C17542s.e(this.f123951b, m0Var.f123951b) && C17542s.e(this.f123952c, m0Var.f123952c);
    }

    public int hashCode() {
        return (((Long.hashCode(this.f123950a) * 31) + Arrays.hashCode(this.f123951b)) * 31) + Arrays.hashCode(this.f123952c);
    }

    public String toString() {
        long j10 = this.f123950a;
        String arrays = Arrays.toString(this.f123951b);
        String arrays2 = Arrays.toString(this.f123952c);
        return "PointCloudData(timestamp=" + j10 + ", points=" + arrays + ", ids=" + arrays2 + ")";
    }

    public C14221m0(long j10, float[] fArr, int[] iArr) {
        C17542s.j(fArr, "points");
        C17542s.j(iArr, "ids");
        this.f123950a = j10;
        this.f123951b = fArr;
        this.f123952c = iArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14221m0(long j10, float[] fArr, int[] iArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : j10, (i10 & 2) != 0 ? new float[0] : fArr, (i10 & 4) != 0 ? new int[0] : iArr);
    }
}
