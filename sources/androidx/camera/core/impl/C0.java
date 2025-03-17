package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class C0<C> {

    /* renamed from: a  reason: collision with root package name */
    private Set<C> f16729a = new HashSet();

    public void a(List<C> list) {
        this.f16729a.addAll(list);
    }

    /* renamed from: b */
    public abstract C0<C> clone();

    public List<C> c() {
        return Collections.unmodifiableList(new ArrayList(this.f16729a));
    }
}
