package Ue;

import TJ.C16532g;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.y;
import YH.X;
import com.google.firebase.analytics.FirebaseAnalytics;
import dI.C17164e;
import eI.C17187b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import up.C12071a;
import up.C12074d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LUe/a;", "LEe/a;", "Lup/d;", "userConsentRepository", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics", "<init>", "(Lup/d;Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "", "Lcom/google/firebase/analytics/FirebaseAnalytics$b;", "Lcom/google/firebase/analytics/FirebaseAnalytics$a;", "", "e", "(Ljava/util/Map;)Z", "performanceAndAnalytics", "personalisedAds", "d", "(ZZ)Ljava/util/Map;", "LTJ/g;", "invoke", "()LTJ/g;", "a", "Lup/d;", "b", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Ee.a {

    /* renamed from: a  reason: collision with root package name */
    private final C12074d f64482a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseAnalytics f64483b;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "performanceAndAnalytics", "personalisedAds"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.analytics.usecase.AnalyticsEnabledUseCaseImpl$invoke$1", f = "AnalyticsEnabledUseCaseImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ue.a$a  reason: collision with other inner class name */
    static final class C1120a extends l implements q<Boolean, Boolean, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f64484c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f64485d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f64486e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f64487f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1120a(a aVar, C17164e<? super C1120a> eVar) {
            super(3, eVar);
            this.f64487f = aVar;
        }

        public final Object i(boolean z10, boolean z11, C17164e<? super Boolean> eVar) {
            C1120a aVar = new C1120a(this.f64487f, eVar);
            aVar.f64485d = z10;
            aVar.f64486e = z11;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f64484c == 0) {
                y.b(obj);
                boolean z10 = this.f64485d;
                Map a10 = this.f64487f.d(z10, this.f64486e);
                if (z10) {
                    this.f64487f.f64483b.f("allow_personalized_ads", String.valueOf(this.f64487f.e(a10)));
                    this.f64487f.f64483b.b(true);
                    this.f64487f.f64483b.c(a10);
                } else {
                    this.f64487f.f64483b.c(a10);
                    this.f64487f.f64483b.b(false);
                }
                return b.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(C12074d dVar, FirebaseAnalytics firebaseAnalytics) {
        C17542s.j(dVar, "userConsentRepository");
        C17542s.j(firebaseAnalytics, "firebaseAnalytics");
        this.f64482a = dVar;
        this.f64483b = firebaseAnalytics;
    }

    /* access modifiers changed from: private */
    public final Map<FirebaseAnalytics.b, FirebaseAnalytics.a> d(boolean z10, boolean z11) {
        FirebaseAnalytics.b bVar = FirebaseAnalytics.b.AD_STORAGE;
        FirebaseAnalytics.a aVar = FirebaseAnalytics.a.DENIED;
        v a10 = C16796C.a(bVar, aVar);
        FirebaseAnalytics.b bVar2 = FirebaseAnalytics.b.ANALYTICS_STORAGE;
        v a11 = C16796C.a(bVar2, aVar);
        FirebaseAnalytics.b bVar3 = FirebaseAnalytics.b.AD_USER_DATA;
        v a12 = C16796C.a(bVar3, aVar);
        FirebaseAnalytics.b bVar4 = FirebaseAnalytics.b.AD_PERSONALIZATION;
        Map<FirebaseAnalytics.b, FirebaseAnalytics.a> p10 = X.p(a10, a11, a12, C16796C.a(bVar4, aVar));
        if (z10) {
            FirebaseAnalytics.a aVar2 = FirebaseAnalytics.a.GRANTED;
            p10.put(bVar2, aVar2);
            if (z11) {
                p10.put(bVar, aVar2);
                p10.put(bVar3, aVar2);
                p10.put(bVar4, aVar2);
            }
        }
        return p10;
    }

    /* access modifiers changed from: private */
    public final boolean e(Map<FirebaseAnalytics.b, ? extends FirebaseAnalytics.a> map) {
        return map.get(FirebaseAnalytics.b.AD_PERSONALIZATION) == FirebaseAnalytics.a.GRANTED;
    }

    public C16532g<Boolean> invoke() {
        return C16534i.n(this.f64482a.c(C12071a.b.f103980e), this.f64482a.c(C12071a.d.f103982e), new C1120a(this, (C17164e<? super C1120a>) null));
    }
}
