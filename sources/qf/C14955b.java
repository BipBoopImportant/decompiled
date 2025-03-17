package qF;

import com.sugarcube.app.base.data.asset.VideoAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\f¨\u0006\u0016"}, d2 = {"LqF/b;", "", "Lcom/sugarcube/app/base/data/asset/VideoAsset;", "videoUri", "", "startingFrame", "<init>", "(Lcom/sugarcube/app/base/data/asset/VideoAsset;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/sugarcube/app/base/data/asset/VideoAsset;", "b", "()Lcom/sugarcube/app/base/data/asset/VideoAsset;", "I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qF.b  reason: case insensitive filesystem */
public final class C14955b {

    /* renamed from: a  reason: collision with root package name */
    private final VideoAsset f130482a;

    /* renamed from: b  reason: collision with root package name */
    private final int f130483b;

    public C14955b(VideoAsset videoAsset, int i10) {
        C17542s.j(videoAsset, "videoUri");
        this.f130482a = videoAsset;
        this.f130483b = i10;
    }

    public final int a() {
        return this.f130483b;
    }

    public final VideoAsset b() {
        return this.f130482a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14955b)) {
            return false;
        }
        C14955b bVar = (C14955b) obj;
        return this.f130482a == bVar.f130482a && this.f130483b == bVar.f130483b;
    }

    public int hashCode() {
        return (this.f130482a.hashCode() * 31) + Integer.hashCode(this.f130483b);
    }

    public String toString() {
        VideoAsset videoAsset = this.f130482a;
        int i10 = this.f130483b;
        return "VideoMetadata(videoUri=" + videoAsset + ", startingFrame=" + i10 + ")";
    }
}
