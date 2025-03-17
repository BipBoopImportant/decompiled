package DF;

import com.sugarcube.app.base.ui.gallery.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b\t\u0010#R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b\n\u0010#R\u0017\u0010%\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u001d\u0010#R\u001a\u0010'\u001a\u00020\u00068\u0006XD¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b\u001a\u0010#R\u0017\u0010)\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b$\u0010#¨\u0006*"}, d2 = {"LDF/c;", "", "LDF/H;", "tabType", "", "list", "", "isUserLoggedIn", "shouldShowCaptureAgain", "isCaptureEnabled", "isPrivacyPolicyConsentPending", "<init>", "(LDF/H;Ljava/util/List;Ljava/lang/Boolean;ZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LDF/H;", "f", "()LDF/H;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "d", "Z", "()Z", "e", "shouldShowCapture", "h", "shouldPrioritizeLogin", "i", "showPrivacyPolicyConsentItem", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: DF.c  reason: case insensitive filesystem */
public final class C12786c {

    /* renamed from: a  reason: collision with root package name */
    private final H f109018a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f109019b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f109020c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f109021d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f109022e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f109023f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f109024g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f109025h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f109026i;

    public C12786c(H h10, List<? extends Object> list, Boolean bool, boolean z10, boolean z11, boolean z12) {
        C17542s.j(h10, "tabType");
        C17542s.j(list, "list");
        this.f109018a = h10;
        this.f109019b = list;
        this.f109020c = bool;
        this.f109021d = z10;
        this.f109022e = z11;
        this.f109023f = z12;
        this.f109024g = C17542s.e(h10.b(), h.c.f124419e) && list.isEmpty() && z11;
        this.f109026i = z12;
    }

    public final List<Object> a() {
        return this.f109019b;
    }

    public final boolean b() {
        return this.f109025h;
    }

    public final boolean c() {
        return this.f109024g;
    }

    public final boolean d() {
        return this.f109021d;
    }

    public final boolean e() {
        return this.f109026i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12786c)) {
            return false;
        }
        C12786c cVar = (C12786c) obj;
        return C17542s.e(this.f109018a, cVar.f109018a) && C17542s.e(this.f109019b, cVar.f109019b) && C17542s.e(this.f109020c, cVar.f109020c) && this.f109021d == cVar.f109021d && this.f109022e == cVar.f109022e && this.f109023f == cVar.f109023f;
    }

    public final H f() {
        return this.f109018a;
    }

    public final Boolean g() {
        return this.f109020c;
    }

    public int hashCode() {
        int hashCode = ((this.f109018a.hashCode() * 31) + this.f109019b.hashCode()) * 31;
        Boolean bool = this.f109020c;
        return ((((((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.f109021d)) * 31) + Boolean.hashCode(this.f109022e)) * 31) + Boolean.hashCode(this.f109023f);
    }

    public String toString() {
        H h10 = this.f109018a;
        List<Object> list = this.f109019b;
        Boolean bool = this.f109020c;
        boolean z10 = this.f109021d;
        boolean z11 = this.f109022e;
        boolean z12 = this.f109023f;
        return "GalleryHomeContent(tabType=" + h10 + ", list=" + list + ", isUserLoggedIn=" + bool + ", shouldShowCaptureAgain=" + z10 + ", isCaptureEnabled=" + z11 + ", isPrivacyPolicyConsentPending=" + z12 + ")";
    }
}
