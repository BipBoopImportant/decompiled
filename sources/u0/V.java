package U0;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u001d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR6\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010+\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"LU0/V;", "", "f", "()LU0/V;", "group", "LXH/N;", "a", "(Ljava/lang/Object;)V", "LU0/d;", "anchor", "", "e", "(LU0/d;)Z", "LU0/f1;", "writer", "", "i", "(LU0/f1;I)V", "LU0/c1;", "table", "h", "(LU0/c1;I)V", "predecessor", "b", "(LU0/f1;II)V", "g", "I", "d", "()I", "key", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "c", "()Ljava/util/ArrayList;", "setGroups", "(Ljava/util/ArrayList;)V", "groups", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "closed", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class V {

    /* renamed from: a  reason: collision with root package name */
    private final int f13888a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<Object> f13889b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13890c;

    private final void a(Object obj) {
        ArrayList<Object> arrayList = this.f13889b;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.f13889b = arrayList;
        arrayList.add(obj);
    }

    private final boolean e(C4866d dVar) {
        ArrayList<Object> arrayList = this.f13889b;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            if (C17542s.e(obj, dVar) || ((obj instanceof V) && ((V) obj).e(dVar))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final U0.V f() {
        /*
            r5 = this;
            java.util.ArrayList<java.lang.Object> r0 = r5.f13889b
            r1 = 0
            if (r0 == 0) goto L_0x0020
            int r2 = r0.size()
            int r2 = r2 + -1
        L_0x000b:
            if (r2 < 0) goto L_0x0020
            java.lang.Object r3 = r0.get(r2)
            boolean r4 = r3 instanceof U0.V
            if (r4 == 0) goto L_0x001d
            r4 = r3
            U0.V r4 = (U0.V) r4
            boolean r4 = r4.f13890c
            if (r4 != 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            int r2 = r2 + -1
            goto L_0x000b
        L_0x0020:
            r3 = r1
        L_0x0021:
            boolean r0 = r3 instanceof U0.V
            if (r0 == 0) goto L_0x0028
            r1 = r3
            U0.V r1 = (U0.V) r1
        L_0x0028:
            if (r1 == 0) goto L_0x0031
            U0.V r0 = r1.f()
            if (r0 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r0 = r5
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.V.f():U0.V");
    }

    public final void b(C4874f1 f1Var, int i10, int i11) {
        C4866d o12;
        ArrayList<Object> arrayList = this.f13889b;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f13889b = arrayList;
        }
        int i12 = 0;
        if (i10 >= 0 && (o12 = f1Var.o1(i10)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i12 >= size) {
                    i12 = -1;
                    break;
                }
                Object obj = arrayList.get(i12);
                if (C17542s.e(obj, o12) || ((obj instanceof V) && ((V) obj).e(o12))) {
                    break;
                }
                i12++;
            }
        }
        arrayList.add(i12, f1Var.E(i11));
    }

    public final ArrayList<Object> c() {
        return this.f13889b;
    }

    public final int d() {
        return this.f13888a;
    }

    public final boolean g(C4866d dVar) {
        ArrayList<Object> arrayList = this.f13889b;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof C4866d) {
                    if (C17542s.e(obj, dVar)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof V) && !((V) obj).g(dVar)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f13889b = null;
                return false;
            }
        }
        return true;
    }

    public final void h(C4865c1 c1Var, int i10) {
        f().a(c1Var.b(i10));
    }

    public final void i(C4874f1 f1Var, int i10) {
        f().a(f1Var.E(i10));
    }
}
