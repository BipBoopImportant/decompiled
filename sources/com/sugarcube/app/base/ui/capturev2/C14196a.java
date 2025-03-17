package com.sugarcube.app.base.ui.capturev2;

import XH.C16807N;
import android.graphics.Bitmap;
import android.hardware.camera2.TotalCaptureResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010'R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010'R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010+\u001a\u0004\b\u001d\u0010,\"\u0004\b-\u0010.R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b(\u00105R'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00108\u0006¢\u0006\f\n\u0004\b&\u00106\u001a\u0004\b#\u00107¨\u00068"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/a;", "", "", "imageTimestamp", "", "imageFormat", "imageFrameCount", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/hardware/camera2/TotalCaptureResult;", "captureResult", "", "Lcom/sugarcube/app/base/ui/capturev2/V;", "frames", "Lkotlin/Function1;", "LXH/N;", "Lcom/sugarcube/app/base/ui/capturev2/ImageResultCallback;", "callback", "<init>", "(JIILandroid/graphics/Bitmap;Landroid/hardware/camera2/TotalCaptureResult;Ljava/util/List;LnI/l;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "d", "()J", "i", "(J)V", "b", "I", "getImageFormat", "g", "(I)V", "c", "getImageFrameCount", "h", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "e", "(Landroid/graphics/Bitmap;)V", "Landroid/hardware/camera2/TotalCaptureResult;", "getCaptureResult", "()Landroid/hardware/camera2/TotalCaptureResult;", "f", "(Landroid/hardware/camera2/TotalCaptureResult;)V", "Ljava/util/List;", "()Ljava/util/List;", "LnI/l;", "()LnI/l;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.capturev2.a  reason: case insensitive filesystem */
public final class C14196a {

    /* renamed from: a  reason: collision with root package name */
    private long f123674a;

    /* renamed from: b  reason: collision with root package name */
    private int f123675b;

    /* renamed from: c  reason: collision with root package name */
    private int f123676c;

    /* renamed from: d  reason: collision with root package name */
    private Bitmap f123677d;

    /* renamed from: e  reason: collision with root package name */
    private TotalCaptureResult f123678e;

    /* renamed from: f  reason: collision with root package name */
    private final List<V> f123679f;

    /* renamed from: g  reason: collision with root package name */
    private final C17642l<C14196a, C16807N> f123680g;

    public C14196a(long j10, int i10, int i11, Bitmap bitmap, TotalCaptureResult totalCaptureResult, List<V> list, C17642l<? super C14196a, C16807N> lVar) {
        C17542s.j(list, "frames");
        C17542s.j(lVar, "callback");
        this.f123674a = j10;
        this.f123675b = i10;
        this.f123676c = i11;
        this.f123677d = bitmap;
        this.f123678e = totalCaptureResult;
        this.f123679f = list;
        this.f123680g = lVar;
    }

    public final Bitmap a() {
        return this.f123677d;
    }

    public final C17642l<C14196a, C16807N> b() {
        return this.f123680g;
    }

    public final List<V> c() {
        return this.f123679f;
    }

    public final long d() {
        return this.f123674a;
    }

    public final void e(Bitmap bitmap) {
        this.f123677d = bitmap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14196a)) {
            return false;
        }
        C14196a aVar = (C14196a) obj;
        return this.f123674a == aVar.f123674a && this.f123675b == aVar.f123675b && this.f123676c == aVar.f123676c && C17542s.e(this.f123677d, aVar.f123677d) && C17542s.e(this.f123678e, aVar.f123678e) && C17542s.e(this.f123679f, aVar.f123679f) && C17542s.e(this.f123680g, aVar.f123680g);
    }

    public final void f(TotalCaptureResult totalCaptureResult) {
        this.f123678e = totalCaptureResult;
    }

    public final void g(int i10) {
        this.f123675b = i10;
    }

    public final void h(int i10) {
        this.f123676c = i10;
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.f123674a) * 31) + Integer.hashCode(this.f123675b)) * 31) + Integer.hashCode(this.f123676c)) * 31;
        Bitmap bitmap = this.f123677d;
        int i10 = 0;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        TotalCaptureResult totalCaptureResult = this.f123678e;
        if (totalCaptureResult != null) {
            i10 = totalCaptureResult.hashCode();
        }
        return ((((hashCode2 + i10) * 31) + this.f123679f.hashCode()) * 31) + this.f123680g.hashCode();
    }

    public final void i(long j10) {
        this.f123674a = j10;
    }

    public String toString() {
        long j10 = this.f123674a;
        int i10 = this.f123675b;
        int i11 = this.f123676c;
        Bitmap bitmap = this.f123677d;
        TotalCaptureResult totalCaptureResult = this.f123678e;
        List<V> list = this.f123679f;
        C17642l<C14196a, C16807N> lVar = this.f123680g;
        return "AcquiredImage(imageTimestamp=" + j10 + ", imageFormat=" + i10 + ", imageFrameCount=" + i11 + ", bitmap=" + bitmap + ", captureResult=" + totalCaptureResult + ", frames=" + list + ", callback=" + lVar + ")";
    }
}
