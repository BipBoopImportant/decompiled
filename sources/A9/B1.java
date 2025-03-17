package a9;

import G8.t;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C17542s;

public abstract class B1<T> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f41928a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public boolean f41929b;

    public B1() {
        C17542s.j(new t(), "systemInstantiable");
        new LinkedHashMap();
    }

    public final synchronized void a(T t10) {
        this.f41928a.remove(t10);
    }
}
