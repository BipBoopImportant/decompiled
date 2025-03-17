package iJ;

import AI.C15432m;
import DI.C15538I;
import YH.C16870n;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import uJ.C18113f0;

/* renamed from: iJ.i  reason: case insensitive filesystem */
public final class C17375i {

    /* renamed from: a  reason: collision with root package name */
    public static final C17375i f143504a = new C17375i();

    private C17375i() {
    }

    private final C17368b b(List<?> list, C15538I i10, C15432m mVar) {
        ArrayList arrayList = new ArrayList();
        for (Object f10 : C16877v.t1(list)) {
            C17373g f11 = f(this, f10, (C15538I) null, 2, (Object) null);
            if (f11 != null) {
                arrayList.add(f11);
            }
        }
        if (i10 == null) {
            return new C17368b(arrayList, new C17374h(mVar));
        }
        C18113f0 P10 = i10.p().P(mVar);
        C17542s.i(P10, "getPrimitiveArrayKotlinType(...)");
        return new C17361A(arrayList, P10);
    }

    /* access modifiers changed from: private */
    public static final C18096U d(C15432m mVar, C15538I i10) {
        C17542s.j(i10, "it");
        C18113f0 P10 = i10.p().P(mVar);
        C17542s.i(P10, "getPrimitiveArrayKotlinType(...)");
        return P10;
    }

    public static /* synthetic */ C17373g f(C17375i iVar, Object obj, C15538I i10, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            i10 = null;
        }
        return iVar.e(obj, i10);
    }

    public final C17368b c(List<? extends C17373g<?>> list, C18096U u10) {
        C17542s.j(list, "value");
        C17542s.j(u10, "type");
        return new C17361A(list, u10);
    }

    public final C17373g<?> e(Object obj, C15538I i10) {
        if (obj instanceof Byte) {
            return new C17370d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C17390x(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C17380n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C17387u(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C17371e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C17379m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C17376j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C17369c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C17391y((String) obj);
        }
        if (obj instanceof byte[]) {
            return b(C16870n.W0((byte[]) obj), i10, C15432m.BYTE);
        }
        if (obj instanceof short[]) {
            return b(C16870n.d1((short[]) obj), i10, C15432m.SHORT);
        }
        if (obj instanceof int[]) {
            return b(C16870n.a1((int[]) obj), i10, C15432m.INT);
        }
        if (obj instanceof long[]) {
            return b(C16870n.b1((long[]) obj), i10, C15432m.LONG);
        }
        if (obj instanceof char[]) {
            return b(C16870n.X0((char[]) obj), i10, C15432m.CHAR);
        }
        if (obj instanceof float[]) {
            return b(C16870n.Z0((float[]) obj), i10, C15432m.FLOAT);
        }
        if (obj instanceof double[]) {
            return b(C16870n.Y0((double[]) obj), i10, C15432m.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return b(C16870n.e1((boolean[]) obj), i10, C15432m.BOOLEAN);
        }
        if (obj == null) {
            return new C17388v();
        }
        return null;
    }
}
