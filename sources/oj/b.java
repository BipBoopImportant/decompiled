package Oj;

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
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.ingka.ikea.app.scanandgoonlineredesign.upptacka.navigation.UpptackaImportProductNavigation$Companion$Result;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LOj/b;", "LOj/a;", "<init>", "()V", "Lx4/o;", "navController", "", "listId", "LXH/N;", "b", "(Lx4/o;Ljava/lang/String;)V", "Landroidx/fragment/app/o;", "fragment", "route", "Lkotlin/Function1;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/navigation/UpptackaImportProductNavigation$Companion$Result;", "callback", "a", "(Landroidx/fragment/app/o;Ljava/lang/String;LnI/l;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.navigation.UpptackaImportProductNavigationImpl$consumeResult$$inlined$consumeResult$1", f = "UpptackaImportProductNavigation.kt", l = {}, m = "invokeSuspend")
    public static final class a extends l implements p<UpptackaImportProductNavigation$Companion$Result, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f84278c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f84279d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f84280e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f84281f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l f84282g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C8948l lVar, String str, C17164e eVar, C17642l lVar2) {
            super(2, eVar);
            this.f84280e = lVar;
            this.f84281f = str;
            this.f84282g = lVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f84280e, this.f84281f, eVar, this.f84282g);
            aVar.f84279d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(UpptackaImportProductNavigation$Companion$Result upptackaImportProductNavigation$Companion$Result, C17164e<? super C16807N> eVar) {
            return ((a) create(upptackaImportProductNavigation$Companion$Result, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f84278c == 0) {
                y.b(obj);
                Object obj2 = this.f84279d;
                if (obj2 != null) {
                    this.f84282g.invoke((UpptackaImportProductNavigation$Companion$Result) obj2);
                    this.f84280e.h().m(this.f84281f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public void a(C5187o oVar, String str, C17642l<? super UpptackaImportProductNavigation$Companion$Result, C16807N> lVar) {
        C17542s.j(oVar, "fragment");
        C17542s.j(str, PlaceTypes.ROUTE);
        C17542s.j(lVar, "callback");
        C8948l E10 = androidx.navigation.fragment.a.a(oVar).E(str);
        C16532g R10 = C16534i.R(C5208k.a(E10.h().i("UpptackaImportProductDialogFragment.RequestKey", null), E10.getLifecycle(), r.b.RESUMED), new a(E10, "UpptackaImportProductDialogFragment.RequestKey", (C17164e) null, lVar));
        C5221y viewLifecycleOwner = oVar.getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    public void b(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "listId");
        Uri build = Uri.parse("ikea://navigation/scanandgo/dialog/upptackaImportDialog?listId={listId}").buildUpon().appendQueryParameter("listId", str).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }
}
