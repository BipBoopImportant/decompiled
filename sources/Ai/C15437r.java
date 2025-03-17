package AI;

import cJ.C17065b;
import cJ.C17069f;
import fI.C17221b;

/* renamed from: AI.r  reason: case insensitive filesystem */
public enum C15437r {
    UBYTEARRAY(C17065b.a.b(r1, "kotlin/UByteArray", false, 2, (Object) null)),
    USHORTARRAY(C17065b.a.b(r1, "kotlin/UShortArray", false, 2, (Object) null)),
    UINTARRAY(C17065b.a.b(r1, "kotlin/UIntArray", false, 2, (Object) null)),
    ULONGARRAY(C17065b.a.b(r1, "kotlin/ULongArray", false, 2, (Object) null));
    
    private final C17065b classId;
    private final C17069f typeName;

    static {
        C15437r[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C15437r(C17065b bVar) {
        this.classId = bVar;
        this.typeName = bVar.h();
    }

    public final C17069f b() {
        return this.typeName;
    }
}
