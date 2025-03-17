package Iz;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import android.net.Uri;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.r;
import cp.C11178c;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import ow.c;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0017"}, d2 = {"LIz/b;", "LIz/a;", "Lcp/c;", "uriEncoder", "<init>", "(Lcp/c;)V", "Lx4/o;", "navController", "", "productTitle", "", "quantity", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;I)V", "Landroidx/fragment/app/o;", "fragment", "currentRoute", "Lkotlin/Function0;", "onResult", "b", "(Landroidx/fragment/app/o;Ljava/lang/String;LnI/a;)V", "Lcp/c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Iz.b  reason: case insensitive filesystem */
public final class C13036b implements C13035a {

    /* renamed from: a  reason: collision with root package name */
    private final C11178c f111009a;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.scanandgo.navigation.CollectedProductSuccessNavigationImpl$onCollectedProductResult$$inlined$consumeResult$1", f = "CollectedProductSuccessNavigationImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Iz.b$a */
    public static final class a extends l implements p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f111010c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f111011d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f111012e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f111013f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a f111014g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C8948l lVar, String str, C17164e eVar, C17631a aVar) {
            super(2, eVar);
            this.f111012e = lVar;
            this.f111013f = str;
            this.f111014g = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f111012e, this.f111013f, eVar, this.f111014g);
            aVar.f111011d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(Boolean bool, C17164e<? super C16807N> eVar) {
            return ((a) create(bool, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f111010c == 0) {
                y.b(obj);
                Object obj2 = this.f111011d;
                if (obj2 != null) {
                    Boolean bool = (Boolean) obj2;
                    this.f111014g.invoke();
                    this.f111012e.h().m(this.f111013f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C13036b(C11178c cVar) {
        C17542s.j(cVar, "uriEncoder");
        this.f111009a = cVar;
    }

    public void a(C8951o oVar, String str, int i10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "productTitle");
        Uri build = c.a(Uri.parse("ikea://navigation/scanandgo/dialog/product-collected-success?title={title}&qty={qty}")).buildUpon().appendQueryParameter("title", this.f111009a.a(str)).appendQueryParameter("qty", String.valueOf(i10)).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }

    public void b(C5187o oVar, String str, C17631a<C16807N> aVar) {
        C17542s.j(oVar, "fragment");
        C17542s.j(str, "currentRoute");
        C17542s.j(aVar, "onResult");
        C8948l E10 = androidx.navigation.fragment.a.a(oVar).E(str);
        C16532g R10 = C16534i.R(C5208k.a(E10.h().i("product_collected_request_key", null), E10.getLifecycle(), r.b.RESUMED), new a(E10, "product_collected_request_key", (C17164e) null, aVar));
        C5221y viewLifecycleOwner = oVar.getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }
}
