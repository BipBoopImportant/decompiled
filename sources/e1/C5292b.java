package e1;

import U0.C4889m;
import YH.C16870n;
import YH.C16877v;
import YH.U;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Le1/b;", "", "Ljava/lang/reflect/Method;", "method", "Le1/a;", "composableInfo", "<init>", "(Ljava/lang/reflect/Method;Le1/a;)V", "LU0/m;", "composer", "instance", "", "args", "a", "(LU0/m;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/reflect/Method;", "b", "Le1/a;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: e1.b  reason: case insensitive filesystem */
public final class C5292b {

    /* renamed from: a  reason: collision with root package name */
    private final Method f23233a;

    /* renamed from: b  reason: collision with root package name */
    private final C5291a f23234b;

    public C5292b(Method method, C5291a aVar) {
        this.f23233a = method;
        this.f23234b = aVar;
    }

    public final Object a(C4889m mVar, Object obj, Object... objArr) {
        Object obj2;
        Object[] objArr2 = objArr;
        C5291a aVar = this.f23234b;
        int a10 = aVar.a();
        int b10 = aVar.b();
        int c10 = aVar.c();
        int length = this.f23233a.getParameterTypes().length;
        int i10 = a10 + 1;
        int i11 = b10 + i10;
        Object[] objArr3 = new Integer[c10];
        int i12 = 0;
        for (int i13 = 0; i13 < c10; i13++) {
            int i14 = i13 * 31;
            C17974j w10 = C17978n.w(i14, Math.min(i14 + 31, a10));
            ArrayList arrayList = new ArrayList(C16877v.y(w10, 10));
            Iterator it = w10.iterator();
            while (it.hasNext()) {
                int c11 = ((U) it).c();
                arrayList.add(Integer.valueOf((c11 >= objArr2.length || objArr2[c11] == null) ? 1 : 0));
            }
            int i15 = 0;
            int i16 = 0;
            for (Object next : arrayList) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    C16877v.x();
                }
                i15 |= ((Number) next).intValue() << i16;
                i16 = i17;
            }
            objArr3[i13] = Integer.valueOf(i15);
        }
        Object[] objArr4 = new Object[length];
        while (i12 < length) {
            if (i12 >= 0 && i12 < a10) {
                obj2 = (i12 < 0 || i12 > C16870n.n0(objArr)) ? C5293c.g(this.f23233a.getParameterTypes()[i12]) : objArr2[i12];
            } else if (i12 == a10) {
                obj2 = mVar;
            } else if (i12 == i10 || (a10 + 2 <= i12 && i12 < i11)) {
                obj2 = 0;
            } else if (i11 > i12 || i12 >= length) {
                throw new IllegalStateException("Unexpected index");
            } else {
                obj2 = objArr3[i12 - i11];
            }
            objArr4[i12] = obj2;
            i12++;
        }
        return this.f23233a.invoke(obj, Arrays.copyOf(objArr4, length));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5292b) {
            return C17542s.e(this.f23233a, ((C5292b) obj).f23233a);
        }
        return false;
    }

    public int hashCode() {
        return this.f23233a.hashCode();
    }
}
