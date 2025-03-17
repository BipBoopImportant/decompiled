package ZI;

import YH.C16870n;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

/* renamed from: ZI.a  reason: case insensitive filesystem */
public abstract class C17004a {

    /* renamed from: f  reason: collision with root package name */
    public static final C3446a f140789f = new C3446a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int[] f140790a;

    /* renamed from: b  reason: collision with root package name */
    private final int f140791b;

    /* renamed from: c  reason: collision with root package name */
    private final int f140792c;

    /* renamed from: d  reason: collision with root package name */
    private final int f140793d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Integer> f140794e;

    /* renamed from: ZI.a$a  reason: collision with other inner class name */
    public static final class C3446a {
        public /* synthetic */ C3446a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3446a() {
        }
    }

    public C17004a(int... iArr) {
        List<Integer> list;
        C17542s.j(iArr, "numbers");
        this.f140790a = iArr;
        Integer o02 = C16870n.o0(iArr, 0);
        int i10 = -1;
        this.f140791b = o02 != null ? o02.intValue() : -1;
        Integer o03 = C16870n.o0(iArr, 1);
        this.f140792c = o03 != null ? o03.intValue() : -1;
        Integer o04 = C16870n.o0(iArr, 2);
        this.f140793d = o04 != null ? o04.intValue() : i10;
        if (iArr.length <= 3) {
            list = C16877v.n();
        } else if (iArr.length <= 1024) {
            list = C16877v.t1(C16870n.e(iArr).subList(3, iArr.length));
        } else {
            throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
        }
        this.f140794e = list;
    }

    public final int a() {
        return this.f140791b;
    }

    public final int b() {
        return this.f140792c;
    }

    public final boolean c(int i10, int i11, int i12) {
        int i13 = this.f140791b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f140792c;
        if (i14 > i11) {
            return true;
        }
        if (i14 < i11) {
            return false;
        }
        return this.f140793d >= i12;
    }

    public final boolean d(C17004a aVar) {
        C17542s.j(aVar, "version");
        return c(aVar.f140791b, aVar.f140792c, aVar.f140793d);
    }

    public final boolean e(int i10, int i11, int i12) {
        int i13 = this.f140791b;
        if (i13 < i10) {
            return true;
        }
        if (i13 > i10) {
            return false;
        }
        int i14 = this.f140792c;
        if (i14 < i11) {
            return true;
        }
        if (i14 > i11) {
            return false;
        }
        return this.f140793d <= i12;
    }

    public boolean equals(Object obj) {
        if (obj != null && C17542s.e(getClass(), obj.getClass())) {
            C17004a aVar = (C17004a) obj;
            return this.f140791b == aVar.f140791b && this.f140792c == aVar.f140792c && this.f140793d == aVar.f140793d && C17542s.e(this.f140794e, aVar.f140794e);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean f(C17004a aVar) {
        C17542s.j(aVar, "ourVersion");
        int i10 = this.f140791b;
        if (i10 == 0) {
            if (!(aVar.f140791b == 0 && this.f140792c == aVar.f140792c)) {
                return false;
            }
        } else if (i10 != aVar.f140791b || this.f140792c > aVar.f140792c) {
            return false;
        }
        return true;
    }

    public final int[] g() {
        return this.f140790a;
    }

    public int hashCode() {
        int i10 = this.f140791b;
        int i11 = i10 + (i10 * 31) + this.f140792c;
        int i12 = i11 + (i11 * 31) + this.f140793d;
        return i12 + (i12 * 31) + this.f140794e.hashCode();
    }

    public String toString() {
        int[] g10 = g();
        ArrayList arrayList = new ArrayList();
        for (int i10 : g10) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : C16877v.G0(arrayList, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
    }
}
