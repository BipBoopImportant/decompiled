package m2;

import java.util.ArrayList;
import java.util.Collections;
import m2.g;
import p2.j;

public class e extends C5573a implements n2.e {

    /* renamed from: m0  reason: collision with root package name */
    protected final g f26151m0;

    /* renamed from: n0  reason: collision with root package name */
    final g.d f26152n0;

    /* renamed from: o0  reason: collision with root package name */
    protected ArrayList<Object> f26153o0 = new ArrayList<>();

    /* renamed from: p0  reason: collision with root package name */
    private j f26154p0;

    public e(g gVar, g.d dVar) {
        super(gVar);
        this.f26151m0 = gVar;
        this.f26152n0 = dVar;
    }

    public p2.e a() {
        return u0();
    }

    public void apply() {
    }

    public e s0(Object... objArr) {
        Collections.addAll(this.f26153o0, objArr);
        return this;
    }

    public void t0() {
        super.apply();
    }

    public j u0() {
        return this.f26154p0;
    }

    public g.d v0() {
        return this.f26152n0;
    }
}
