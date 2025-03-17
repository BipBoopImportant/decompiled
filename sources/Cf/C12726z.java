package CF;

import android.net.Uri;
import androidx.lifecycle.K;
import kF.C14730z;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b \u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b\u0019\u0010&R!\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b$\u0010(¨\u0006)"}, d2 = {"LCF/z;", "", "Landroid/net/Uri;", "videoUri", "", "videoPreviewFrameResId", "", "titleText", "bodyText", "ctaText", "backgroundColorResId", "", "autoStart", "Landroidx/lifecycle/K;", "LkF/z;", "playbackActionsLD", "<init>", "(Landroid/net/Uri;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLandroidx/lifecycle/K;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "h", "()Landroid/net/Uri;", "b", "I", "g", "c", "Ljava/lang/String;", "f", "d", "e", "Z", "()Z", "Landroidx/lifecycle/K;", "()Landroidx/lifecycle/K;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: CF.z  reason: case insensitive filesystem */
public final class C12726z {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f108456a;

    /* renamed from: b  reason: collision with root package name */
    private final int f108457b;

    /* renamed from: c  reason: collision with root package name */
    private final String f108458c;

    /* renamed from: d  reason: collision with root package name */
    private final String f108459d;

    /* renamed from: e  reason: collision with root package name */
    private final String f108460e;

    /* renamed from: f  reason: collision with root package name */
    private final int f108461f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f108462g;

    /* renamed from: h  reason: collision with root package name */
    private final K<C14730z> f108463h;

    public C12726z(Uri uri, int i10, String str, String str2, String str3, int i11, boolean z10, K<C14730z> k10) {
        C17542s.j(uri, "videoUri");
        this.f108456a = uri;
        this.f108457b = i10;
        this.f108458c = str;
        this.f108459d = str2;
        this.f108460e = str3;
        this.f108461f = i11;
        this.f108462g = z10;
        this.f108463h = k10;
    }

    public final boolean a() {
        return this.f108462g;
    }

    public final int b() {
        return this.f108461f;
    }

    public final String c() {
        return this.f108459d;
    }

    public final String d() {
        return this.f108460e;
    }

    public final K<C14730z> e() {
        return this.f108463h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12726z)) {
            return false;
        }
        C12726z zVar = (C12726z) obj;
        return C17542s.e(this.f108456a, zVar.f108456a) && this.f108457b == zVar.f108457b && C17542s.e(this.f108458c, zVar.f108458c) && C17542s.e(this.f108459d, zVar.f108459d) && C17542s.e(this.f108460e, zVar.f108460e) && this.f108461f == zVar.f108461f && this.f108462g == zVar.f108462g && C17542s.e(this.f108463h, zVar.f108463h);
    }

    public final String f() {
        return this.f108458c;
    }

    public final int g() {
        return this.f108457b;
    }

    public final Uri h() {
        return this.f108456a;
    }

    public int hashCode() {
        int hashCode = ((this.f108456a.hashCode() * 31) + Integer.hashCode(this.f108457b)) * 31;
        String str = this.f108458c;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f108459d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f108460e;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.f108461f)) * 31) + Boolean.hashCode(this.f108462g)) * 31;
        K<C14730z> k10 = this.f108463h;
        if (k10 != null) {
            i10 = k10.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        Uri uri = this.f108456a;
        int i10 = this.f108457b;
        String str = this.f108458c;
        String str2 = this.f108459d;
        String str3 = this.f108460e;
        int i11 = this.f108461f;
        boolean z10 = this.f108462g;
        K<C14730z> k10 = this.f108463h;
        return "VideoCardParams(videoUri=" + uri + ", videoPreviewFrameResId=" + i10 + ", titleText=" + str + ", bodyText=" + str2 + ", ctaText=" + str3 + ", backgroundColorResId=" + i11 + ", autoStart=" + z10 + ", playbackActionsLD=" + k10 + ")";
    }
}
