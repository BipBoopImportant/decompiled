package com.sugarcube.app.base.ui.ultrawide;

import android.hardware.SensorManager;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/e;", "", "", "gravityTimestamp", "", "gravityValues", "rotationTimestamp", "rotationValues", "<init>", "(J[FJ[F)V", "c", "()[F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "[F", "d", "e", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.ultrawide.e  reason: case insensitive filesystem */
public final class C14294e {

    /* renamed from: a  reason: collision with root package name */
    private final long f125603a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f125604b;

    /* renamed from: c  reason: collision with root package name */
    private final long f125605c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f125606d;

    public C14294e(long j10, float[] fArr, long j11, float[] fArr2) {
        C17542s.j(fArr, "gravityValues");
        C17542s.j(fArr2, "rotationValues");
        this.f125603a = j10;
        this.f125604b = fArr;
        this.f125605c = j11;
        this.f125606d = fArr2;
    }

    public final long a() {
        return this.f125603a;
    }

    public final float[] b() {
        return this.f125604b;
    }

    public final float[] c() {
        float[] fArr = new float[16];
        SensorManager.getRotationMatrixFromVector(fArr, this.f125606d);
        return fArr;
    }

    public final long d() {
        return this.f125605c;
    }

    public final float[] e() {
        return this.f125606d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14294e)) {
            return false;
        }
        C14294e eVar = (C14294e) obj;
        return this.f125603a == eVar.f125603a && C17542s.e(this.f125604b, eVar.f125604b) && this.f125605c == eVar.f125605c && C17542s.e(this.f125606d, eVar.f125606d);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.f125603a) * 31) + Arrays.hashCode(this.f125604b)) * 31) + Long.hashCode(this.f125605c)) * 31) + Arrays.hashCode(this.f125606d);
    }

    public String toString() {
        long j10 = this.f125603a;
        String arrays = Arrays.toString(this.f125604b);
        long j11 = this.f125605c;
        String arrays2 = Arrays.toString(this.f125606d);
        return "SensorData(gravityTimestamp=" + j10 + ", gravityValues=" + arrays + ", rotationTimestamp=" + j11 + ", rotationValues=" + arrays2 + ")";
    }
}
