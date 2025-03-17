package Kf;

import Ar.j;
import IC.C13026h;
import Kf.C9133b;
import Kf.g;
import Ln.h;
import Oo.b;
import TJ.C16532g;
import XH.C16807N;
import XH.C16814e;
import XH.t;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J0\u0010\u001a\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\nH@¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010#\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010+R \u00101\u001a\b\u0012\u0004\u0012\u00020-0,8\u0016X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b(\u00100¨\u00062"}, d2 = {"LKf/c;", "LKf/b;", "LLn/h;", "cartRepository", "LKf/x;", "cartInteractor", "LAr/j;", "feedback", "<init>", "(LLn/h;LKf/x;LAr/j;)V", "", "availabilityDisclaimer", "buttonString", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lkotlin/Function0;", "LXH/N;", "callback", "addToCartWithDisclaimer", "(Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/FragmentManager;LnI/a;)V", "", "LKf/y;", "items", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "componentValue", "b", "(Ljava/util/List;Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Landroid/view/View;", "rootView", "", "throwable", "productName", "showAddToCartException", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/Throwable;Ljava/lang/String;)V", "LKf/b$a;", "c", "(Ljava/lang/Throwable;Ljava/lang/String;)LKf/b$a;", "a", "LLn/h;", "LKf/x;", "LAr/j;", "LTJ/g;", "", "d", "LTJ/g;", "()LTJ/g;", "cartQuantity", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kf.c  reason: case insensitive filesystem */
public final class C9134c implements C9133b {

    /* renamed from: a  reason: collision with root package name */
    private final h f61503a;

    /* renamed from: b  reason: collision with root package name */
    private final x f61504b;

    /* renamed from: c  reason: collision with root package name */
    private final j f61505c;

    /* renamed from: d  reason: collision with root package name */
    private final C16532g<Integer> f61506d;

    public C9134c(h hVar, x xVar, j jVar) {
        C17542s.j(hVar, "cartRepository");
        C17542s.j(xVar, "cartInteractor");
        C17542s.j(jVar, "feedback");
        this.f61503a = hVar;
        this.f61504b = xVar;
        this.f61505c = jVar;
        this.f61506d = hVar.a();
    }

    public C16532g<Integer> a() {
        return this.f61506d;
    }

    public void addToCartWithDisclaimer(String str, String str2, FragmentManager fragmentManager, C17631a<C16807N> aVar) {
        C17542s.j(str2, "buttonString");
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(aVar, "callback");
        this.f61504b.addToCartWithDisclaimer(str, str2, fragmentManager, aVar);
    }

    public Object b(List<y> list, Interaction$Component interaction$Component, String str, C17164e<? super C16807N> eVar) {
        Object b10 = this.f61504b.b(list, interaction$Component, str, eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }

    public C9133b.a c(Throwable th2, String str) {
        C17542s.j(th2, "throwable");
        g gVar = th2 instanceof g ? (g) th2 : null;
        if (C17542s.e(gVar, g.b.f61510a)) {
            return new C9133b.a.C1018a(C13026h.a(D.f61496e), C13026h.a(D.f61495d), b.f84616d5);
        }
        if (C17542s.e(gVar, g.a.f61509a) || gVar == null) {
            return new C9133b.a.C1019b((str == null || str.length() == 0) ? C13026h.a(D.f61492a) : C13026h.b(D.f61493b, str));
        }
        throw new t();
    }

    @C16814e
    public void showAddToCartException(Context context, View view, Throwable th2, String str) {
        Context context2 = context;
        Throwable th3 = th2;
        C17542s.j(context, "context");
        C17542s.j(view, "rootView");
        C17542s.j(th3, "throwable");
        C9133b.a c10 = c(th3, str);
        if (c10 instanceof C9133b.a.C1018a) {
            C9133b.a.C1018a aVar = (C9133b.a.C1018a) c10;
            j.a.k(this.f61505c, context, aVar.c().b(context), aVar.a().b(context), true, aVar.b(), (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 480, (Object) null);
        } else if (c10 instanceof C9133b.a.C1019b) {
            j.a.s(this.f61505c, view, ((C9133b.a.C1019b) c10).a().b(context), (String) null, 0, (View) null, (C17631a) null, (C17642l) null, 124, (Object) null);
        } else {
            throw new t();
        }
    }
}
