package pF;

import com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStep;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LpF/f;", "", "Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStep;", "stepData", "", "isSkippable", "<init>", "(Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStep;Z)V", "a", "(Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStep;Z)LpF/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStep;", "c", "()Lcom/sugarcube/app/base/ui/compose/tutorial/data/TutorialStep;", "b", "Z", "d", "()Z", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pF.f  reason: case insensitive filesystem */
public final class C14926f {

    /* renamed from: a  reason: collision with root package name */
    private final TutorialStep f130354a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f130355b;

    public C14926f(TutorialStep tutorialStep, boolean z10) {
        C17542s.j(tutorialStep, "stepData");
        this.f130354a = tutorialStep;
        this.f130355b = z10;
    }

    public static /* synthetic */ C14926f b(C14926f fVar, TutorialStep tutorialStep, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            tutorialStep = fVar.f130354a;
        }
        if ((i10 & 2) != 0) {
            z10 = fVar.f130355b;
        }
        return fVar.a(tutorialStep, z10);
    }

    public final C14926f a(TutorialStep tutorialStep, boolean z10) {
        C17542s.j(tutorialStep, "stepData");
        return new C14926f(tutorialStep, z10);
    }

    public final TutorialStep c() {
        return this.f130354a;
    }

    public final boolean d() {
        return this.f130355b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14926f)) {
            return false;
        }
        C14926f fVar = (C14926f) obj;
        return C17542s.e(this.f130354a, fVar.f130354a) && this.f130355b == fVar.f130355b;
    }

    public int hashCode() {
        return (this.f130354a.hashCode() * 31) + Boolean.hashCode(this.f130355b);
    }

    public String toString() {
        TutorialStep tutorialStep = this.f130354a;
        boolean z10 = this.f130355b;
        return "TutorialPageUIState(stepData=" + tutorialStep + ", isSkippable=" + z10 + ")";
    }
}
