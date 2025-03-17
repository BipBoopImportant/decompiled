package hg;

import Ay.b;
import Ay.c;
import XH.C16807N;
import Zf.k;
import android.net.Uri;
import androidx.lifecycle.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import sf.C10242c;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R$\u0010+\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00168B@BX\u000e¢\u0006\f\u001a\u0004\b(\u0010%\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lhg/A;", "Landroidx/lifecycle/f0;", "Lsf/c;", "appUserDataRepository", "LAy/c;", "scanAndGoCartNavigation", "LZf/k;", "cartNavigation", "LAy/b;", "scanAndGoCartIntegration", "<init>", "(Lsf/c;LAy/c;LZf/k;LAy/b;)V", "Lkotlin/Function0;", "LXH/N;", "block", "G", "(LnI/a;)V", "Lkotlin/Function1;", "Landroid/net/Uri;", "F", "(LnI/l;)V", "uri", "", "H", "(Landroid/net/Uri;)Z", "m", "Lsf/c;", "n", "LAy/c;", "o", "LZf/k;", "p", "LAy/b;", "q", "Z", "hasProcessedAutoNavigation", "D", "()Z", "isDualBagEnabled", "value", "C", "E", "(Z)V", "combinedCartOnboardingShown", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hg.A  reason: case insensitive filesystem */
public final class C9788A extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C10242c f73588m;

    /* renamed from: n  reason: collision with root package name */
    private final c f73589n;

    /* renamed from: o  reason: collision with root package name */
    private final k f73590o;

    /* renamed from: p  reason: collision with root package name */
    private final b f73591p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f73592q;

    public C9788A(C10242c cVar, c cVar2, k kVar, b bVar) {
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(cVar2, "scanAndGoCartNavigation");
        C17542s.j(kVar, "cartNavigation");
        C17542s.j(bVar, "scanAndGoCartIntegration");
        this.f73588m = cVar;
        this.f73589n = cVar2;
        this.f73590o = kVar;
        this.f73591p = bVar;
    }

    private final boolean C() {
        return this.f73588m.e();
    }

    private final boolean D() {
        return this.f73591p.a();
    }

    private final void E(boolean z10) {
        this.f73588m.z(z10);
    }

    public final void F(C17642l<? super Uri, C16807N> lVar) {
        C17542s.j(lVar, "block");
        if (D() && this.f73590o.e() == k.a.STORE_CART && !this.f73592q) {
            this.f73592q = true;
            lVar.invoke(Uri.parse(this.f73589n.c(true)));
        }
    }

    public final void G(C17631a<C16807N> aVar) {
        C17542s.j(aVar, "block");
        if (D() && !C()) {
            aVar.invoke();
            E(true);
        }
    }

    public final boolean H(Uri uri) {
        C17542s.j(uri, "uri");
        Uri parse = Uri.parse(this.f73590o.a());
        Uri parse2 = Uri.parse(this.f73589n.c(true));
        return (C17542s.e(uri.getScheme(), parse.getScheme()) && C17542s.e(uri.getPath(), parse.getPath())) || (C17542s.e(uri.getScheme(), parse2.getScheme()) && C17542s.e(uri.getPath(), parse2.getPath()));
    }
}
