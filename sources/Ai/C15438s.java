package AI;

import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import fI.C17221b;
import kotlin.jvm.internal.C17542s;

/* renamed from: AI.s  reason: case insensitive filesystem */
public enum C15438s {
    UBYTE(C17065b.a.b(r1, "kotlin/UByte", false, 2, (Object) null)),
    USHORT(C17065b.a.b(r1, "kotlin/UShort", false, 2, (Object) null)),
    UINT(C17065b.a.b(r1, "kotlin/UInt", false, 2, (Object) null)),
    ULONG(C17065b.a.b(r1, "kotlin/ULong", false, 2, (Object) null));
    
    private final C17065b arrayClassId;
    private final C17065b classId;
    private final C17069f typeName;

    static {
        C15438s[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C15438s(C17065b bVar) {
        this.classId = bVar;
        C17069f h10 = bVar.h();
        this.typeName = h10;
        C17066c f10 = bVar.f();
        C17069f v10 = C17069f.v(h10.b() + "Array");
        C17542s.i(v10, "identifier(...)");
        this.arrayClassId = new C17065b(f10, v10);
    }

    public final C17065b b() {
        return this.arrayClassId;
    }

    public final C17065b j() {
        return this.classId;
    }

    public final C17069f m() {
        return this.typeName;
    }
}
