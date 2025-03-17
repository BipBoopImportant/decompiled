package vj;

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
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lvj/b;", "Lvj/a;", "<init>", "()V", "Lx4/o;", "navController", "LXH/N;", "a", "(Lx4/o;)V", "Landroidx/fragment/app/o;", "fragment", "", "currentRoute", "Lkotlin/Function0;", "result", "b", "(Landroidx/fragment/app/o;Ljava/lang/String;LnI/a;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C12128a {

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.help.navigation.HelpDialogNavigationImpl$resultListener$$inlined$consumeResult$1", f = "HelpDialogNavigation.kt", l = {}, m = "invokeSuspend")
    public static final class a extends l implements p<String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f104449c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f104450d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f104451e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f104452f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a f104453g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C8948l lVar, String str, C17164e eVar, C17631a aVar) {
            super(2, eVar);
            this.f104451e = lVar;
            this.f104452f = str;
            this.f104453g = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f104451e, this.f104452f, eVar, this.f104453g);
            aVar.f104450d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(String str, C17164e<? super C16807N> eVar) {
            return ((a) create(str, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f104449c == 0) {
                y.b(obj);
                Object obj2 = this.f104450d;
                if (obj2 != null) {
                    String str = (String) obj2;
                    this.f104453g.invoke();
                    this.f104451e.h().m(this.f104452f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public void a(C8951o oVar) {
        C17542s.j(oVar, "navController");
        Uri parse = Uri.parse("ikea://navigation/scanandgo/dialog/scanningHelpDialog");
        C17542s.i(parse, "parse(...)");
        oVar.X(parse);
    }

    public void b(C5187o oVar, String str, C17631a<C16807N> aVar) {
        C17542s.j(oVar, "fragment");
        C17542s.j(str, "currentRoute");
        C17542s.j(aVar, "result");
        C8948l E10 = androidx.navigation.fragment.a.a(oVar).E(str);
        C16532g R10 = C16534i.R(C5208k.a(E10.h().i("help_fragment_result", null), E10.getLifecycle(), r.b.RESUMED), new a(E10, "help_fragment_result", (C17164e) null, aVar));
        C5221y viewLifecycleOwner = oVar.getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }
}
