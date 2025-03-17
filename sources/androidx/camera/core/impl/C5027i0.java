package androidx.camera.core.impl;

import C.C4417z;
import H2.i;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/camera/core/impl/i0;", "", "<init>", "()V", "LC/z;", "dynamicRangeToTest", "", "fullySpecifiedDynamicRanges", "", "c", "(LC/z;Ljava/util/Set;)Z", "underSpecifiedDynamicRange", "fullySpecifiedDynamicRange", "d", "(LC/z;LC/z;)Z", "a", "b", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.camera.core.impl.i0  reason: case insensitive filesystem */
public final class C5027i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C5027i0 f16919a = new C5027i0();

    private C5027i0() {
    }

    private final boolean a(C4417z zVar, C4417z zVar2) {
        i.j(zVar2.e(), "Fully specified range is not actually fully specified.");
        return zVar.a() == 0 || zVar.a() == zVar2.a();
    }

    private final boolean b(C4417z zVar, C4417z zVar2) {
        i.j(zVar2.e(), "Fully specified range is not actually fully specified.");
        int b10 = zVar.b();
        if (b10 == 0) {
            return true;
        }
        int b11 = zVar2.b();
        return (b10 == 2 && b11 != 1) || b10 == b11;
    }

    public static final boolean c(C4417z zVar, Set<C4417z> set) {
        Object obj;
        C17542s.j(zVar, "dynamicRangeToTest");
        C17542s.j(set, "fullySpecifiedDynamicRanges");
        if (zVar.e()) {
            return set.contains(zVar);
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (f16919a.d(zVar, (C4417z) obj)) {
                break;
            }
        }
        return obj != null;
    }

    private final boolean d(C4417z zVar, C4417z zVar2) {
        return a(zVar, zVar2) && b(zVar, zVar2);
    }
}
