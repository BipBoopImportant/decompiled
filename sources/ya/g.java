package Ya;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private m f64857a;

    /* synthetic */ g(C9369f fVar) {
    }

    public final C9368e a() {
        m mVar = this.f64857a;
        if (mVar != null) {
            return new C9363D(mVar, (C9362C) null);
        }
        throw new IllegalStateException(String.valueOf(m.class.getCanonicalName()).concat(" must be set"));
    }

    public final g b(m mVar) {
        this.f64857a = mVar;
        return this;
    }
}
