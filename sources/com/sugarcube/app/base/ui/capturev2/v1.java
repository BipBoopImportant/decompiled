package com.sugarcube.app.base.ui.capturev2;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/v1;", "", "", "imageTimestamp", "Landroid/graphics/Bitmap;", "image", "Lcom/sugarcube/app/base/ui/capturev2/R0;", "sensorData", "Lcom/sugarcube/app/base/ui/capturev2/W;", "intrinsics", "<init>", "(JLandroid/graphics/Bitmap;Lcom/sugarcube/app/base/ui/capturev2/R0;Lcom/sugarcube/app/base/ui/capturev2/W;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "c", "Lcom/sugarcube/app/base/ui/capturev2/R0;", "d", "()Lcom/sugarcube/app/base/ui/capturev2/R0;", "Lcom/sugarcube/app/base/ui/capturev2/W;", "()Lcom/sugarcube/app/base/ui/capturev2/W;", "setIntrinsics", "(Lcom/sugarcube/app/base/ui/capturev2/W;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v1 {

    /* renamed from: a  reason: collision with root package name */
    private final long f124067a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap f124068b;

    /* renamed from: c  reason: collision with root package name */
    private final R0 f124069c;

    /* renamed from: d  reason: collision with root package name */
    private W f124070d;

    public v1(long j10, Bitmap bitmap, R0 r02, W w10) {
        C17542s.j(w10, "intrinsics");
        this.f124067a = j10;
        this.f124068b = bitmap;
        this.f124069c = r02;
        this.f124070d = w10;
    }

    public final Bitmap a() {
        return this.f124068b;
    }

    public final long b() {
        return this.f124067a;
    }

    public final W c() {
        return this.f124070d;
    }

    public final R0 d() {
        return this.f124069c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.f124067a == v1Var.f124067a && C17542s.e(this.f124068b, v1Var.f124068b) && C17542s.e(this.f124069c, v1Var.f124069c) && C17542s.e(this.f124070d, v1Var.f124070d);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.f124067a) * 31;
        Bitmap bitmap = this.f124068b;
        int i10 = 0;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        R0 r02 = this.f124069c;
        if (r02 != null) {
            i10 = r02.hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.f124070d.hashCode();
    }

    public String toString() {
        long j10 = this.f124067a;
        Bitmap bitmap = this.f124068b;
        R0 r02 = this.f124069c;
        W w10 = this.f124070d;
        return "UltrawideAcquiredImage(imageTimestamp=" + j10 + ", image=" + bitmap + ", sensorData=" + r02 + ", intrinsics=" + w10 + ")";
    }
}
