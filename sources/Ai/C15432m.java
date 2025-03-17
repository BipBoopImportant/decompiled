package AI;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import YH.g0;
import cJ.C17066c;
import cJ.C17069f;
import fI.C17221b;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: AI.m  reason: case insensitive filesystem */
public enum C15432m {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final a Companion = null;
    public static final Set<C15432m> NUMBER_TYPES = null;
    private final C16824o arrayTypeFqName$delegate;
    private final C17069f arrayTypeName;
    private final C16824o typeFqName$delegate;
    private final C17069f typeName;

    /* renamed from: AI.m$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C15432m mVar;
        C15432m mVar2;
        C15432m mVar3;
        C15432m mVar4;
        C15432m mVar5;
        C15432m mVar6;
        C15432m mVar7;
        C15432m[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
        NUMBER_TYPES = g0.h(mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7);
    }

    private C15432m(String str) {
        C17069f v10 = C17069f.v(str);
        C17542s.i(v10, "identifier(...)");
        this.typeName = v10;
        C17069f v11 = C17069f.v(str + "Array");
        C17542s.i(v11, "identifier(...)");
        this.arrayTypeName = v11;
        s sVar = s.PUBLICATION;
        this.typeFqName$delegate = C16825p.a(sVar, new C15430k(this));
        this.arrayTypeFqName$delegate = C16825p.a(sVar, new C15431l(this));
    }

    /* access modifiers changed from: private */
    public static final C17066c D(C15432m mVar) {
        return C15435p.f133015A.b(mVar.typeName);
    }

    /* access modifiers changed from: private */
    public static final C17066c m(C15432m mVar) {
        return C15435p.f133015A.b(mVar.arrayTypeName);
    }

    public final C17066c B() {
        return (C17066c) this.typeFqName$delegate.getValue();
    }

    public final C17069f C() {
        return this.typeName;
    }

    public final C17066c n() {
        return (C17066c) this.arrayTypeFqName$delegate.getValue();
    }

    public final C17069f v() {
        return this.arrayTypeName;
    }
}
