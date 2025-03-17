package wj;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.r;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
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

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lwj/c;", "Lwj/b;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "listPickerNavigation", "<init>", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;)V", "Lx4/o;", "navController", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "operation", "LXH/N;", "b", "(Lx4/o;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;)V", "Landroidx/fragment/app/o;", "fragment", "", "currentRoute", "Lkotlin/Function1;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b;", "onResult", "a", "(Landroidx/fragment/app/o;Ljava/lang/String;LnI/l;)V", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wj.c  reason: case insensitive filesystem */
public final class C12275c implements C12274b {

    /* renamed from: a  reason: collision with root package name */
    private final ListPickerNavigation f105859a;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.interactor.AddToFavouritesInteractorImpl$consumeResult$$inlined$consumeResult$1", f = "AddToFavouritesInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wj.c$a */
    public static final class a extends l implements p<ListPickerNavigation.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f105860c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f105861d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f105862e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f105863f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l f105864g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C8948l lVar, String str, C17164e eVar, C17642l lVar2) {
            super(2, eVar);
            this.f105862e = lVar;
            this.f105863f = str;
            this.f105864g = lVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f105862e, this.f105863f, eVar, this.f105864g);
            aVar.f105861d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(ListPickerNavigation.b bVar, C17164e<? super C16807N> eVar) {
            return ((a) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f105860c == 0) {
                y.b(obj);
                Object obj2 = this.f105861d;
                if (obj2 != null) {
                    this.f105864g.invoke((ListPickerNavigation.b) obj2);
                    this.f105862e.h().m(this.f105863f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C12275c(ListPickerNavigation listPickerNavigation) {
        C17542s.j(listPickerNavigation, "listPickerNavigation");
        this.f105859a = listPickerNavigation;
    }

    public void a(C5187o oVar, String str, C17642l<? super ListPickerNavigation.b, C16807N> lVar) {
        C17542s.j(oVar, "fragment");
        C17542s.j(str, "currentRoute");
        C17542s.j(lVar, "onResult");
        C8948l E10 = androidx.navigation.fragment.a.a(oVar).E(str);
        C16532g R10 = C16534i.R(C5208k.a(E10.h().i("ChooseListBottomSheet.RequestKey", null), E10.getLifecycle(), r.b.RESUMED), new a(E10, "ChooseListBottomSheet.RequestKey", (C17164e) null, lVar));
        C5221y viewLifecycleOwner = oVar.getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    public void b(C8951o oVar, ListPickerNavigation.Operation operation) {
        C17542s.j(oVar, "navController");
        C17542s.j(operation, "operation");
        ListPickerNavigation.a.a(this.f105859a, oVar, operation, (String) null, 4, (Object) null);
    }
}
