package ha;

import com.optimizely.ab.config.FeatureVariable;
import j9.c;
import j9.j;
import mc.C10036b;

/* renamed from: ha.y8  reason: case insensitive filesystem */
public final /* synthetic */ class C8196y8 implements C10036b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f53031a;

    public /* synthetic */ C8196y8(j jVar) {
        this.f53031a = jVar;
    }

    public final Object get() {
        return this.f53031a.b("FIREBASE_ML_SDK", byte[].class, c.b(FeatureVariable.JSON_TYPE), A8.f51792a);
    }
}
