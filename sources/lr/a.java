package Lr;

import Ae.e;
import EB.C12832d;
import FB.C12860a;
import QJ.Q;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16534i;
import WE.C13796a;
import XH.C16807N;
import XH.y;
import android.app.Activity;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.sugarcube.app.base.external.interactions.AccountInteractions;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import sf.C10242c;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"LLr/a;", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "LRd/a;", "accountNavigation", "LAe/e;", "analytics", "Lsf/c;", "appUserDataRepository", "LFB/a;", "localStoreSelectionRepository", "LQJ/Q;", "coroutineScope", "<init>", "(LRd/a;LAe/e;Lsf/c;LFB/a;LQJ/Q;)V", "Landroid/app/Activity;", "activity", "LXH/N;", "navigateLogin", "(Landroid/app/Activity;)V", "navigateSignup", "LTJ/P;", "LWE/a;", "getUserData", "()LTJ/P;", "a", "LRd/a;", "b", "LAe/e;", "c", "Lsf/c;", "d", "LFB/a;", "e", "LQJ/Q;", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements AccountInteractions {

    /* renamed from: a  reason: collision with root package name */
    private final Rd.a f83325a;

    /* renamed from: b  reason: collision with root package name */
    private final e f83326b;

    /* renamed from: c  reason: collision with root package name */
    private final C10242c f83327c;

    /* renamed from: d  reason: collision with root package name */
    private final C12860a f83328d;

    /* renamed from: e  reason: collision with root package name */
    private final Q f83329e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LEB/d;", "storeSelection", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "address", "LWE/a;", "<anonymous>", "(LEB/d;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;)LWE/a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.geomagical.impl.sugarcube.interactions.GeomagicalAccountInteractions$getUserData$1", f = "GeomagicalAccountInteractions.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Lr.a$a  reason: collision with other inner class name */
    static final class C1668a extends l implements q<C12832d, UserPostalCodeAddress, C17164e<? super C13796a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f83330c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f83331d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f83332e;

        C1668a(C17164e<? super C1668a> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C12832d dVar, UserPostalCodeAddress userPostalCodeAddress, C17164e<? super C13796a> eVar) {
            C1668a aVar = new C1668a(eVar);
            aVar.f83331d = dVar;
            aVar.f83332e = userPostalCodeAddress;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f83330c == 0) {
                y.b(obj);
                C12832d dVar = (C12832d) this.f83331d;
                UserPostalCodeAddress userPostalCodeAddress = (UserPostalCodeAddress) this.f83332e;
                String str = null;
                String d10 = userPostalCodeAddress != null ? userPostalCodeAddress.d() : null;
                if (dVar != null) {
                    str = dVar.e();
                }
                return new C13796a(d10, str);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(Rd.a aVar, e eVar, C10242c cVar, C12860a aVar2, Q q10) {
        C17542s.j(aVar, "accountNavigation");
        C17542s.j(eVar, "analytics");
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        C17542s.j(q10, "coroutineScope");
        this.f83325a = aVar;
        this.f83326b = eVar;
        this.f83327c = cVar;
        this.f83328d = aVar2;
        this.f83329e = q10;
    }

    public C16519P<C13796a> getUserData() {
        return C16534i.c0(C16534i.n(this.f83328d.b(), this.f83327c.d(), new C1668a((C17164e<? super C1668a>) null)), this.f83329e, C16515L.f138570a.c(), null);
    }

    public void navigateLogin(Activity activity) {
        C17542s.j(activity, "activity");
        e.c.b(this.f83326b, Interaction$Component.LOGIN_BUTTON, (String) null, (Map) null, (e.b) null, 14, (Object) null);
        this.f83325a.d(activity);
    }

    public void navigateSignup(Activity activity) {
        C17542s.j(activity, "activity");
        e.c.b(this.f83326b, Interaction$Component.SIGN_UP_BUTTON, (String) null, (Map) null, (e.b) null, 14, (Object) null);
        this.f83325a.e(activity);
    }
}
