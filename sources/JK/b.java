package Jk;

import Gh.a;
import Gh.d;
import com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.ImageRemote;
import com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.OnboardingFeatureRemote;
import com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.VideoRemote;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"LJk/b;", "Lpp/c;", "LGh/b;", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/network/models/remote/OnboardingFeatureRemote;", "LJk/a;", "imageToLocalMapper", "LJk/d;", "videoToLocalMapper", "<init>", "(LJk/a;LJk/d;)V", "remote", "b", "(Lcom/ingka/ikea/app/splash/onboarding/steps/features/network/models/remote/OnboardingFeatureRemote;)LGh/b;", "a", "LJk/a;", "LJk/d;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C11769c<Gh.b, OnboardingFeatureRemote> {

    /* renamed from: a  reason: collision with root package name */
    private final a f82555a;

    /* renamed from: b  reason: collision with root package name */
    private final d f82556b;

    public b(a aVar, d dVar) {
        C17542s.j(aVar, "imageToLocalMapper");
        C17542s.j(dVar, "videoToLocalMapper");
        this.f82555a = aVar;
        this.f82556b = dVar;
    }

    /* renamed from: b */
    public Gh.b a(OnboardingFeatureRemote onboardingFeatureRemote) {
        C17542s.j(onboardingFeatureRemote, "remote");
        long c10 = onboardingFeatureRemote.c();
        a a10 = a.Companion.a(onboardingFeatureRemote.d());
        String f10 = onboardingFeatureRemote.f();
        String b10 = onboardingFeatureRemote.b();
        String a11 = onboardingFeatureRemote.a();
        VideoRemote g10 = onboardingFeatureRemote.g();
        d b11 = g10 != null ? this.f82556b.a(g10) : null;
        ImageRemote e10 = onboardingFeatureRemote.e();
        return new Gh.b(c10, a10, f10, b10, a11, b11, e10 != null ? this.f82555a.a(e10) : null);
    }

    public List<Gh.b> c(List<OnboardingFeatureRemote> list) {
        return C11769c.a.a(this, list);
    }
}
