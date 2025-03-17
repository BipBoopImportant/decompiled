package MI;

import java.util.EnumMap;
import kotlin.jvm.internal.C17542s;

/* renamed from: MI.E  reason: case insensitive filesystem */
public final class C16044E {

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap<C16059c, w> f136277a;

    public C16044E(EnumMap<C16059c, w> enumMap) {
        C17542s.j(enumMap, "defaultQualifiers");
        this.f136277a = enumMap;
    }

    public final w a(C16059c cVar) {
        return this.f136277a.get(cVar);
    }

    public final EnumMap<C16059c, w> b() {
        return this.f136277a;
    }
}
