package Jk;

import Ik.a;
import com.ingka.ikea.app.splash.onboarding.steps.features.network.models.remote.OnboardingFeaturesRemote;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJk/c;", "Lpp/c;", "LIk/a;", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/network/models/remote/OnboardingFeaturesRemote;", "LJk/b;", "onboardingFeatureToLocalMapper", "<init>", "(LJk/b;)V", "remote", "b", "(Lcom/ingka/ikea/app/splash/onboarding/steps/features/network/models/remote/OnboardingFeaturesRemote;)LIk/a;", "a", "LJk/b;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements C11769c<a, OnboardingFeaturesRemote> {

    /* renamed from: a  reason: collision with root package name */
    private final b f82557a;

    public c(b bVar) {
        C17542s.j(bVar, "onboardingFeatureToLocalMapper");
        this.f82557a = bVar;
    }

    /* renamed from: b */
    public a a(OnboardingFeaturesRemote onboardingFeaturesRemote) {
        C17542s.j(onboardingFeaturesRemote, "remote");
        return new a(this.f82557a.c(onboardingFeaturesRemote.b()));
    }
}
