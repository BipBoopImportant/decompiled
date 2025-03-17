package androidx.recyclerview.widget;

import J2.t;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: U  reason: collision with root package name */
    private static final Set<Integer> f43628U = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{17, 66, 33, 130})));

    /* renamed from: I  reason: collision with root package name */
    boolean f43629I = false;

    /* renamed from: J  reason: collision with root package name */
    int f43630J = -1;

    /* renamed from: K  reason: collision with root package name */
    int[] f43631K;

    /* renamed from: L  reason: collision with root package name */
    View[] f43632L;

    /* renamed from: M  reason: collision with root package name */
    final SparseIntArray f43633M = new SparseIntArray();

    /* renamed from: N  reason: collision with root package name */
    final SparseIntArray f43634N = new SparseIntArray();

    /* renamed from: O  reason: collision with root package name */
    d f43635O = new b();

    /* renamed from: P  reason: collision with root package name */
    final Rect f43636P = new Rect();

    /* renamed from: Q  reason: collision with root package name */
    private boolean f43637Q;

    /* renamed from: R  reason: collision with root package name */
    private int f43638R = -1;

    /* renamed from: S  reason: collision with root package name */
    int f43639S = -1;

    /* renamed from: T  reason: collision with root package name */
    int f43640T = -1;

    private static class a {
        static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public static final class b extends d {
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        public int f(int i10) {
            return 1;
        }
    }

    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f43643a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        final SparseIntArray f43644b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        private boolean f43645c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f43646d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        /* access modifiers changed from: package-private */
        public int b(int i10, int i11) {
            if (!this.f43646d) {
                return d(i10, i11);
            }
            int i12 = this.f43644b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int d10 = d(i10, i11);
            this.f43644b.put(i10, d10);
            return d10;
        }

        /* access modifiers changed from: package-private */
        public int c(int i10, int i11) {
            if (!this.f43645c) {
                return e(i10, i11);
            }
            int i12 = this.f43643a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int e10 = e(i10, i11);
            this.f43643a.put(i10, e10);
            return e10;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int a10;
            if (!this.f43646d || (a10 = a(this.f43644b, i10)) == -1) {
                i14 = 0;
                i13 = 0;
                i12 = 0;
            } else {
                i14 = this.f43644b.get(a10);
                i13 = a10 + 1;
                i12 = c(a10, i11) + f(a10);
                if (i12 == i11) {
                    i14++;
                    i12 = 0;
                }
            }
            int f10 = f(i10);
            while (i13 < i10) {
                int f11 = f(i13);
                int i15 = i12 + f11;
                if (i15 == i11) {
                    i14++;
                    i15 = 0;
                } else if (i15 > i11) {
                    i14++;
                    i15 = f11;
                }
                i13++;
            }
            return i12 + f10 > i11 ? i14 + 1 : i14;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f43645c
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.f43643a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.f43643a
                int r3 = r3.get(r2)
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                goto L_0x0030
            L_0x0020:
                r2 = r1
                r3 = r2
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x002d
                r3 = r1
                goto L_0x0030
            L_0x002d:
                if (r3 <= r7) goto L_0x0030
                r3 = r4
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x0037
                return r3
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.d.e(int, int):int");
        }

        public abstract int f(int i10);

        public void g() {
            this.f43644b.clear();
        }

        public void h() {
            this.f43643a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        P3(RecyclerView.q.F0(context, attributeSet, i10, i11).f43851b);
    }

    private int A3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < a(); i13++) {
            int D32 = D3(i13);
            int B32 = B3(i13);
            if (D32 < 0 || B32 < 0) {
                break;
            }
            if (this.f43655s == 1) {
                if ((D32 == i10 && B32 > i11) || D32 > i10) {
                    this.f43639S = D32;
                    this.f43640T = B32;
                    return i13;
                }
            } else if (B32 > i11 && E3(i13).contains(Integer.valueOf(i10))) {
                this.f43640T = B32;
                return i13;
            }
        }
        return -1;
    }

    private int B3(int i10) {
        if (this.f43655s == 0) {
            RecyclerView recyclerView = this.f43831b;
            return I3(recyclerView.f43749c, recyclerView.f43717J0, i10);
        }
        RecyclerView recyclerView2 = this.f43831b;
        return J3(recyclerView2.f43749c, recyclerView2.f43717J0, i10);
    }

    private Set<Integer> C3(int i10) {
        return F3(B3(i10), i10);
    }

    private int D3(int i10) {
        if (this.f43655s == 1) {
            RecyclerView recyclerView = this.f43831b;
            return I3(recyclerView.f43749c, recyclerView.f43717J0, i10);
        }
        RecyclerView recyclerView2 = this.f43831b;
        return J3(recyclerView2.f43749c, recyclerView2.f43717J0, i10);
    }

    private Set<Integer> E3(int i10) {
        return F3(D3(i10), i10);
    }

    private Set<Integer> F3(int i10, int i11) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f43831b;
        int K32 = K3(recyclerView.f43749c, recyclerView.f43717J0, i11);
        for (int i12 = i10; i12 < i10 + K32; i12++) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    private int I3(RecyclerView.x xVar, RecyclerView.C c10, int i10) {
        if (!c10.e()) {
            return this.f43635O.b(i10, this.f43630J);
        }
        int f10 = xVar.f(i10);
        if (f10 != -1) {
            return this.f43635O.b(f10, this.f43630J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    private int J3(RecyclerView.x xVar, RecyclerView.C c10, int i10) {
        if (!c10.e()) {
            return this.f43635O.c(i10, this.f43630J);
        }
        int i11 = this.f43634N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = xVar.f(i10);
        if (f10 != -1) {
            return this.f43635O.c(f10, this.f43630J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    private int K3(RecyclerView.x xVar, RecyclerView.C c10, int i10) {
        if (!c10.e()) {
            return this.f43635O.f(i10);
        }
        int i11 = this.f43633M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = xVar.f(i10);
        if (f10 != -1) {
            return this.f43635O.f(f10);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    private void L3(float f10, int i10) {
        n3(Math.max(Math.round(f10 * ((float) this.f43630J)), i10));
    }

    private boolean M3(int i10) {
        return !E3(i10).contains(Integer.valueOf(this.f43639S)) || !C3(i10).contains(Integer.valueOf(this.f43640T));
    }

    private void N3(View view, int i10, boolean z10) {
        int i11;
        int i12;
        c cVar = (c) view.getLayoutParams();
        Rect rect = cVar.f43855b;
        int i13 = rect.top + rect.bottom + cVar.topMargin + cVar.bottomMargin;
        int i14 = rect.left + rect.right + cVar.leftMargin + cVar.rightMargin;
        int G32 = G3(cVar.f43641e, cVar.f43642f);
        if (this.f43655s == 1) {
            i11 = RecyclerView.q.m0(G32, i10, i14, cVar.width, false);
            i12 = RecyclerView.q.m0(this.f43657u.n(), z0(), i13, cVar.height, true);
        } else {
            int m02 = RecyclerView.q.m0(G32, i10, i13, cVar.height, false);
            int m03 = RecyclerView.q.m0(this.f43657u.n(), M0(), i14, cVar.width, true);
            i12 = m02;
            i11 = m03;
        }
        O3(view, i11, i12, z10);
    }

    private void O3(View view, int i10, int i11, boolean z10) {
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        if (z10 ? h2(view, i10, i11, rVar) : f2(view, i10, i11, rVar)) {
            view.measure(i10, i11);
        }
    }

    private void R3() {
        int y02;
        int s10;
        if (M2() == 1) {
            y02 = L0() - o();
            s10 = t();
        } else {
            y02 = y0() - c();
            s10 = s();
        }
        n3(y02 - s10);
    }

    private void l3(RecyclerView.x xVar, RecyclerView.C c10, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i11 = i10;
            i12 = 0;
        } else {
            i12 = i10 - 1;
            i11 = -1;
            i13 = -1;
        }
        while (i12 != i11) {
            View view = this.f43632L[i12];
            c cVar = (c) view.getLayoutParams();
            int K32 = K3(xVar, c10, E0(view));
            cVar.f43642f = K32;
            cVar.f43641e = i14;
            i14 += K32;
            i12 += i13;
        }
    }

    private void m3() {
        int l02 = l0();
        for (int i10 = 0; i10 < l02; i10++) {
            c cVar = (c) k0(i10).getLayoutParams();
            int a10 = cVar.a();
            this.f43633M.put(a10, cVar.f());
            this.f43634N.put(a10, cVar.e());
        }
    }

    private void n3(int i10) {
        this.f43631K = o3(this.f43631K, this.f43630J, i10);
    }

    static int[] o3(int[] iArr, int i10, int i11) {
        int i12;
        if (!(iArr != null && iArr.length == i10 + 1 && iArr[iArr.length - 1] == i11)) {
            iArr = new int[(i10 + 1)];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void p3() {
        this.f43633M.clear();
        this.f43634N.clear();
    }

    private int q3(RecyclerView.C c10) {
        if (!(l0() == 0 || c10.b() == 0)) {
            t2();
            boolean O22 = O2();
            View x22 = x2(!O22, true);
            View w22 = w2(!O22, true);
            if (!(x22 == null || w22 == null)) {
                int b10 = this.f43635O.b(E0(x22), this.f43630J);
                int b11 = this.f43635O.b(E0(w22), this.f43630J);
                int min = Math.min(b10, b11);
                int max = this.f43660x ? Math.max(0, ((this.f43635O.b(c10.b() - 1, this.f43630J) + 1) - Math.max(b10, b11)) - 1) : Math.max(0, min);
                if (!O22) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.f43657u.d(w22) - this.f43657u.g(x22))) / ((float) ((this.f43635O.b(E0(w22), this.f43630J) - this.f43635O.b(E0(x22), this.f43630J)) + 1)))) + ((float) (this.f43657u.m() - this.f43657u.g(x22))));
            }
        }
        return 0;
    }

    private int r3(RecyclerView.C c10) {
        if (!(l0() == 0 || c10.b() == 0)) {
            t2();
            View x22 = x2(!O2(), true);
            View w22 = w2(!O2(), true);
            if (!(x22 == null || w22 == null)) {
                if (!O2()) {
                    return this.f43635O.b(c10.b() - 1, this.f43630J) + 1;
                }
                int d10 = this.f43657u.d(w22) - this.f43657u.g(x22);
                int b10 = this.f43635O.b(E0(x22), this.f43630J);
                return (int) ((((float) d10) / ((float) ((this.f43635O.b(E0(w22), this.f43630J) - b10) + 1))) * ((float) (this.f43635O.b(c10.b() - 1, this.f43630J) + 1)));
            }
        }
        return 0;
    }

    private void s3(RecyclerView.x xVar, RecyclerView.C c10, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int J32 = J3(xVar, c10, aVar.f43664b);
        if (z10) {
            while (J32 > 0) {
                int i11 = aVar.f43664b;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    aVar.f43664b = i12;
                    J32 = J3(xVar, c10, i12);
                } else {
                    return;
                }
            }
            return;
        }
        int b10 = c10.b() - 1;
        int i13 = aVar.f43664b;
        while (i13 < b10) {
            int i14 = i13 + 1;
            int J33 = J3(xVar, c10, i14);
            if (J33 <= J32) {
                break;
            }
            i13 = i14;
            J32 = J33;
        }
        aVar.f43664b = i13;
    }

    private void t3() {
        View[] viewArr = this.f43632L;
        if (viewArr == null || viewArr.length != this.f43630J) {
            this.f43632L = new View[this.f43630J];
        }
    }

    private View u3() {
        for (int i10 = 0; i10 < l0(); i10++) {
            View k02 = k0(i10);
            Objects.requireNonNull(k02);
            if (a.a(k02)) {
                return k0(i10);
            }
        }
        return null;
    }

    private int x3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int D32 = D3(i13);
            int B32 = B3(i13);
            if (D32 < 0 || B32 < 0) {
                return -1;
            }
            if (this.f43655s == 1) {
                if (D32 < i10 && C3(i13).contains(Integer.valueOf(i11))) {
                    this.f43639S = D32;
                    return i13;
                }
            } else if (D32 < i10 && B32 == i11) {
                this.f43639S = ((Integer) Collections.max(E3(i13))).intValue();
                return i13;
            }
        }
        return -1;
    }

    private int y3(int i10, int i11, int i12) {
        for (int i13 = i12 + 1; i13 < a(); i13++) {
            int D32 = D3(i13);
            int B32 = B3(i13);
            if (D32 < 0 || B32 < 0) {
                return -1;
            }
            if (this.f43655s == 1) {
                if (D32 > i10 && (B32 == i11 || C3(i13).contains(Integer.valueOf(i11)))) {
                    this.f43639S = D32;
                    return i13;
                }
            } else if (D32 > i10 && B32 == i11) {
                this.f43639S = D3(i13);
                return i13;
            }
        }
        return -1;
    }

    private int z3(int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= 0; i13--) {
            int D32 = D3(i13);
            int B32 = B3(i13);
            if (D32 < 0 || B32 < 0) {
                return -1;
            }
            if (this.f43655s == 1) {
                if ((D32 == i10 && B32 < i11) || D32 < i10) {
                    this.f43639S = D32;
                    this.f43640T = B32;
                    return i13;
                }
            } else if (E3(i13).contains(Integer.valueOf(i10)) && B32 < i11) {
                this.f43640T = B32;
                return i13;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean F1(int i10, Bundle bundle) {
        RecyclerView.G o02;
        int i11;
        if (i10 == t.a.f8833V.b() && i10 != -1) {
            View u32 = u3();
            if (u32 == null || bundle == null) {
                return false;
            }
            int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
            if (!f43628U.contains(Integer.valueOf(i12)) || (o02 = this.f43831b.o0(u32)) == null) {
                return false;
            }
            int absoluteAdapterPosition = o02.getAbsoluteAdapterPosition();
            int D32 = D3(absoluteAdapterPosition);
            int B32 = B3(absoluteAdapterPosition);
            if (D32 >= 0 && B32 >= 0) {
                if (M3(absoluteAdapterPosition)) {
                    this.f43639S = D32;
                    this.f43640T = B32;
                }
                int i13 = this.f43639S;
                if (i13 == -1) {
                    i13 = D32;
                }
                int i14 = this.f43640T;
                if (i14 != -1) {
                    B32 = i14;
                }
                if (i12 == 17) {
                    i11 = z3(i13, B32, absoluteAdapterPosition);
                } else if (i12 == 33) {
                    i11 = x3(i13, B32, absoluteAdapterPosition);
                } else if (i12 == 66) {
                    i11 = A3(i13, B32, absoluteAdapterPosition);
                } else if (i12 != 130) {
                    return false;
                } else {
                    i11 = y3(i13, B32, absoluteAdapterPosition);
                }
                if (i11 == -1 && this.f43655s == 0) {
                    if (i12 == 17) {
                        i11 = w3(D32);
                    } else if (i12 == 66) {
                        i11 = v3(D32);
                    }
                }
                if (i11 != -1) {
                    X1(i11);
                    this.f43638R = i11;
                    return true;
                }
            }
            return false;
        } else if (i10 != 16908343 || bundle == null) {
            return super.F1(i10, bundle);
        } else {
            int i15 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i16 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (!(i15 == -1 || i16 == -1)) {
                int itemCount = this.f43831b.f43763m.getItemCount();
                int i17 = 0;
                while (true) {
                    if (i17 >= itemCount) {
                        i17 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.f43831b;
                    int J32 = J3(recyclerView.f43749c, recyclerView.f43717J0, i17);
                    RecyclerView recyclerView2 = this.f43831b;
                    int I32 = I3(recyclerView2.f43749c, recyclerView2.f43717J0, i17);
                    if (this.f43655s != 1) {
                        if (J32 == i15 && I32 == i16) {
                            break;
                        }
                    } else if (J32 == i16 && I32 == i15) {
                        break;
                    }
                    i17++;
                }
                if (i17 > -1) {
                    Z2(i17, 0);
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public View G2(RecyclerView.x xVar, RecyclerView.C c10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int l02 = l0();
        int i12 = 1;
        if (z11) {
            i11 = l0() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = l02;
            i11 = 0;
        }
        int b10 = c10.b();
        t2();
        int m10 = this.f43657u.m();
        int i13 = this.f43657u.i();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View k02 = k0(i11);
            int E02 = E0(k02);
            if (E02 >= 0 && E02 < b10 && J3(xVar, c10, E02) == 0) {
                if (((RecyclerView.r) k02.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = k02;
                    }
                } else if (this.f43657u.g(k02) < i13 && this.f43657u.d(k02) >= m10) {
                    return k02;
                } else {
                    if (view == null) {
                        view = k02;
                    }
                }
            }
            i11 += i12;
        }
        return view != null ? view : view2;
    }

    /* access modifiers changed from: package-private */
    public int G3(int i10, int i11) {
        if (this.f43655s != 1 || !N2()) {
            int[] iArr = this.f43631K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f43631K;
        int i12 = this.f43630J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public int H0(RecyclerView.x xVar, RecyclerView.C c10) {
        if (this.f43655s == 0) {
            return Math.min(this.f43630J, a());
        }
        if (c10.b() < 1) {
            return 0;
        }
        return I3(xVar, c10, c10.b() - 1) + 1;
    }

    public int H3() {
        return this.f43630J;
    }

    public boolean O(RecyclerView.r rVar) {
        return rVar instanceof c;
    }

    /* access modifiers changed from: package-private */
    public void P2(RecyclerView.x xVar, RecyclerView.C c10, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        View d10;
        RecyclerView.x xVar2 = xVar;
        RecyclerView.C c11 = c10;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int l10 = this.f43657u.l();
        boolean z10 = l10 != 1073741824;
        int i23 = l0() > 0 ? this.f43631K[this.f43630J] : 0;
        if (z10) {
            R3();
        }
        boolean z11 = cVar2.f43676e == 1;
        int i24 = this.f43630J;
        if (!z11) {
            i24 = J3(xVar2, c11, cVar2.f43675d) + K3(xVar2, c11, cVar2.f43675d);
        }
        int i25 = 0;
        while (i25 < this.f43630J && cVar2.c(c11) && i24 > 0) {
            int i26 = cVar2.f43675d;
            int K32 = K3(xVar2, c11, i26);
            if (K32 <= this.f43630J) {
                i24 -= K32;
                if (i24 < 0 || (d10 = cVar2.d(xVar2)) == null) {
                    break;
                }
                this.f43632L[i25] = d10;
                i25++;
            } else {
                throw new IllegalArgumentException("Item at position " + i26 + " requires " + K32 + " spans but GridLayoutManager has only " + this.f43630J + " spans.");
            }
        }
        if (i25 == 0) {
            bVar2.f43669b = true;
            return;
        }
        l3(xVar2, c11, i25, z11);
        float f10 = 0.0f;
        int i27 = 0;
        for (int i28 = 0; i28 < i25; i28++) {
            View view = this.f43632L[i28];
            if (cVar2.f43683l == null) {
                if (z11) {
                    F(view);
                } else {
                    G(view, 0);
                }
            } else if (z11) {
                D(view);
            } else {
                E(view, 0);
            }
            L(view, this.f43636P);
            N3(view, l10, false);
            int e10 = this.f43657u.e(view);
            if (e10 > i27) {
                i27 = e10;
            }
            float f11 = (((float) this.f43657u.f(view)) * 1.0f) / ((float) ((c) view.getLayoutParams()).f43642f);
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            L3(f10, i23);
            i27 = 0;
            for (int i29 = 0; i29 < i25; i29++) {
                View view2 = this.f43632L[i29];
                N3(view2, CatalogRepository.FETCH_FLAG_SDB, true);
                int e11 = this.f43657u.e(view2);
                if (e11 > i27) {
                    i27 = e11;
                }
            }
        }
        for (int i30 = 0; i30 < i25; i30++) {
            View view3 = this.f43632L[i30];
            if (this.f43657u.e(view3) != i27) {
                c cVar3 = (c) view3.getLayoutParams();
                Rect rect = cVar3.f43855b;
                int i31 = rect.top + rect.bottom + cVar3.topMargin + cVar3.bottomMargin;
                int i32 = rect.left + rect.right + cVar3.leftMargin + cVar3.rightMargin;
                int G32 = G3(cVar3.f43641e, cVar3.f43642f);
                if (this.f43655s == 1) {
                    i22 = RecyclerView.q.m0(G32, CatalogRepository.FETCH_FLAG_SDB, i32, cVar3.width, false);
                    i21 = View.MeasureSpec.makeMeasureSpec(i27 - i31, CatalogRepository.FETCH_FLAG_SDB);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i32, CatalogRepository.FETCH_FLAG_SDB);
                    i21 = RecyclerView.q.m0(G32, CatalogRepository.FETCH_FLAG_SDB, i31, cVar3.height, false);
                    i22 = makeMeasureSpec;
                }
                O3(view3, i22, i21, true);
            }
        }
        bVar2.f43668a = i27;
        if (this.f43655s == 1) {
            if (cVar2.f43677f == -1) {
                i13 = cVar2.f43673b;
                i20 = i13 - i27;
            } else {
                i20 = cVar2.f43673b;
                i13 = i20 + i27;
            }
            i10 = i20;
            i12 = 0;
            i11 = 0;
        } else {
            if (cVar2.f43677f == -1) {
                i19 = cVar2.f43673b;
                i18 = i19 - i27;
            } else {
                i18 = cVar2.f43673b;
                i19 = i18 + i27;
            }
            i11 = i18;
            i10 = 0;
            i12 = i19;
            i13 = 0;
        }
        int i33 = 0;
        while (i33 < i25) {
            View view4 = this.f43632L[i33];
            c cVar4 = (c) view4.getLayoutParams();
            if (this.f43655s == 1) {
                if (N2()) {
                    int t10 = t() + this.f43631K[this.f43630J - cVar4.f43641e];
                    i17 = i13;
                    i16 = t10;
                    i15 = t10 - this.f43657u.f(view4);
                } else {
                    int t11 = t() + this.f43631K[cVar4.f43641e];
                    i17 = i13;
                    i15 = t11;
                    i16 = this.f43657u.f(view4) + t11;
                }
                i14 = i10;
            } else {
                int s10 = s() + this.f43631K[cVar4.f43641e];
                i14 = s10;
                i16 = i12;
                i15 = i11;
                i17 = this.f43657u.f(view4) + s10;
            }
            Y0(view4, i15, i14, i16, i17);
            if (cVar4.c() || cVar4.b()) {
                bVar2.f43670c = true;
            }
            bVar2.f43671d |= view4.hasFocusable();
            i33++;
            i13 = i17;
            i12 = i16;
            i11 = i15;
            i10 = i14;
        }
        Arrays.fill(this.f43632L, (Object) null);
    }

    public void P3(int i10) {
        if (i10 != this.f43630J) {
            this.f43629I = true;
            if (i10 >= 1) {
                this.f43630J = i10;
                this.f43635O.h();
                T1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    public void Q3(d dVar) {
        this.f43635O = dVar;
    }

    /* access modifiers changed from: package-private */
    public void R2(RecyclerView.x xVar, RecyclerView.C c10, LinearLayoutManager.a aVar, int i10) {
        super.R2(xVar, c10, aVar, i10);
        R3();
        if (c10.b() > 0 && !c10.e()) {
            s3(xVar, c10, aVar, i10);
        }
        t3();
    }

    public int T(RecyclerView.C c10) {
        return this.f43637Q ? q3(c10) : super.T(c10);
    }

    public int U(RecyclerView.C c10) {
        return this.f43637Q ? r3(c10) : super.U(c10);
    }

    public int W(RecyclerView.C c10) {
        return this.f43637Q ? q3(c10) : super.W(c10);
    }

    public int W1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        R3();
        t3();
        return super.W1(i10, xVar, c10);
    }

    public int X(RecyclerView.C c10) {
        return this.f43637Q ? r3(c10) : super.X(c10);
    }

    public int Y1(int i10, RecyclerView.x xVar, RecyclerView.C c10) {
        R3();
        t3();
        return super.Y1(i10, xVar, c10);
    }

    public void c2(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        if (this.f43631K == null) {
            super.c2(rect, i10, i11);
        }
        int t10 = t() + o();
        int s10 = s() + c();
        if (this.f43655s == 1) {
            i13 = RecyclerView.q.P(i11, rect.height() + s10, C0());
            int[] iArr = this.f43631K;
            i12 = RecyclerView.q.P(i10, iArr[iArr.length - 1] + t10, D0());
        } else {
            i12 = RecyclerView.q.P(i10, rect.width() + t10, D0());
            int[] iArr2 = this.f43631K;
            i13 = RecyclerView.q.P(i11, iArr2[iArr2.length - 1] + s10, C0());
        }
        b2(i12, i13);
    }

    public void c3(boolean z10) {
        if (!z10) {
            super.c3(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public RecyclerView.r f0() {
        return this.f43655s == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public RecyclerView.r g0(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public RecyclerView.r h0(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d1, code lost:
        if (r13 == (r2 > r15)) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f1, code lost:
        if (r13 == r10) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View i1(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.x r26, androidx.recyclerview.widget.RecyclerView.C r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.d0(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$c r5 = (androidx.recyclerview.widget.GridLayoutManager.c) r5
            int r6 = r5.f43641e
            int r5 = r5.f43642f
            int r5 = r5 + r6
            android.view.View r7 = super.i1(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.r2(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f43660x
            r11 = -1
            if (r7 == r10) goto L_0x0039
            int r7 = r23.l0()
            int r7 = r7 - r9
            r10 = r11
            r12 = r10
            goto L_0x0040
        L_0x0039:
            int r7 = r23.l0()
            r10 = r7
            r12 = r9
            r7 = 0
        L_0x0040:
            int r13 = r0.f43655s
            if (r13 != r9) goto L_0x004c
            boolean r13 = r23.N2()
            if (r13 == 0) goto L_0x004c
            r13 = r9
            goto L_0x004d
        L_0x004c:
            r13 = 0
        L_0x004d:
            int r14 = r0.I3(r1, r2, r7)
            r15 = r11
            r16 = r15
            r8 = 0
            r17 = 0
            r11 = r7
            r7 = r4
        L_0x0059:
            if (r11 == r10) goto L_0x0065
            int r9 = r0.I3(r1, r2, r11)
            android.view.View r1 = r0.k0(r11)
            if (r1 != r3) goto L_0x0069
        L_0x0065:
            r21 = r7
            goto L_0x0137
        L_0x0069:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0082
            if (r9 == r14) goto L_0x0082
            if (r4 == 0) goto L_0x0074
            goto L_0x0065
        L_0x0074:
            r18 = r3
            r21 = r7
        L_0x0078:
            r19 = r8
            r20 = r10
        L_0x007c:
            r7 = r16
            r8 = r17
            goto L_0x0123
        L_0x0082:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$c r9 = (androidx.recyclerview.widget.GridLayoutManager.c) r9
            int r2 = r9.f43641e
            r18 = r3
            int r3 = r9.f43642f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009a
            if (r2 != r6) goto L_0x009a
            if (r3 != r5) goto L_0x009a
            return r1
        L_0x009a:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a2
            if (r4 == 0) goto L_0x00aa
        L_0x00a2:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b5
            if (r7 != 0) goto L_0x00b5
        L_0x00aa:
            r21 = r7
        L_0x00ac:
            r19 = r8
            r20 = r10
            r7 = r16
            r8 = r17
            goto L_0x00f3
        L_0x00b5:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d4
            if (r7 <= r8) goto L_0x00ca
        L_0x00c9:
            goto L_0x00ac
        L_0x00ca:
            if (r7 != r8) goto L_0x0078
            if (r2 <= r15) goto L_0x00d0
            r7 = 1
            goto L_0x00d1
        L_0x00d0:
            r7 = 0
        L_0x00d1:
            if (r13 != r7) goto L_0x0078
            goto L_0x00c9
        L_0x00d4:
            if (r4 != 0) goto L_0x0078
            r19 = r8
            r20 = r10
            r8 = 0
            r10 = 1
            boolean r22 = r0.X0(r1, r8, r10)
            if (r22 == 0) goto L_0x007c
            r8 = r17
            if (r7 <= r8) goto L_0x00e9
            r7 = r16
            goto L_0x00f3
        L_0x00e9:
            if (r7 != r8) goto L_0x0121
            r7 = r16
            if (r2 <= r7) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r10 = 0
        L_0x00f1:
            if (r13 != r10) goto L_0x0123
        L_0x00f3:
            boolean r10 = r1.hasFocusable()
            if (r10 == 0) goto L_0x010f
            int r4 = r9.f43641e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x012b
        L_0x010f:
            int r7 = r9.f43641e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x012b
        L_0x0121:
            r7 = r16
        L_0x0123:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x012b:
            int r11 = r11 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r10 = r20
            r9 = 1
            goto L_0x0059
        L_0x0137:
            if (r4 == 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r4 = r21
        L_0x013c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.i1(android.view.View, int, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.RecyclerView$C):android.view.View");
    }

    public boolean l2() {
        return this.f43650D == null && !this.f43629I;
    }

    public void m1(RecyclerView.x xVar, RecyclerView.C c10, t tVar) {
        super.m1(xVar, c10, tVar);
        tVar.i0(GridView.class.getName());
        RecyclerView.h hVar = this.f43831b.f43763m;
        if (hVar != null && hVar.getItemCount() > 1) {
            tVar.b(t.a.f8833V);
        }
    }

    /* access modifiers changed from: package-private */
    public void n2(RecyclerView.C c10, LinearLayoutManager.c cVar, RecyclerView.q.c cVar2) {
        int i10 = this.f43630J;
        for (int i11 = 0; i11 < this.f43630J && cVar.c(c10) && i10 > 0; i11++) {
            int i12 = cVar.f43675d;
            cVar2.a(i12, Math.max(0, cVar.f43678g));
            i10 -= this.f43635O.f(i12);
            cVar.f43675d += cVar.f43676e;
        }
    }

    public void o1(RecyclerView.x xVar, RecyclerView.C c10, View view, t tVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.n1(view, tVar);
            return;
        }
        c cVar = (c) layoutParams;
        int I32 = I3(xVar, c10, cVar.a());
        if (this.f43655s == 0) {
            tVar.l0(t.f.a(cVar.e(), cVar.f(), I32, 1, false, false));
            return;
        }
        tVar.l0(t.f.a(I32, 1, cVar.e(), cVar.f(), false, false));
    }

    public int p0(RecyclerView.x xVar, RecyclerView.C c10) {
        if (this.f43655s == 1) {
            return Math.min(this.f43630J, a());
        }
        if (c10.b() < 1) {
            return 0;
        }
        return I3(xVar, c10, c10.b() - 1) + 1;
    }

    public void q1(RecyclerView recyclerView, int i10, int i11) {
        this.f43635O.h();
        this.f43635O.g();
    }

    public void r1(RecyclerView recyclerView) {
        this.f43635O.h();
        this.f43635O.g();
    }

    public void s1(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f43635O.h();
        this.f43635O.g();
    }

    public void t1(RecyclerView recyclerView, int i10, int i11) {
        this.f43635O.h();
        this.f43635O.g();
    }

    public void v1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f43635O.h();
        this.f43635O.g();
    }

    /* access modifiers changed from: package-private */
    public int v3(int i10) {
        if (i10 < 0 || this.f43655s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap();
        for (int i11 = 0; i11 < a(); i11++) {
            for (Integer next : E3(i11)) {
                if (next.intValue() < 0) {
                    return -1;
                }
                if (!treeMap.containsKey(next)) {
                    treeMap.put(next, Integer.valueOf(i11));
                }
            }
        }
        for (Integer num : treeMap.keySet()) {
            int intValue = num.intValue();
            if (intValue > i10) {
                int intValue2 = ((Integer) treeMap.get(num)).intValue();
                this.f43639S = intValue;
                this.f43640T = 0;
                return intValue2;
            }
        }
        return -1;
    }

    public void w1(RecyclerView.x xVar, RecyclerView.C c10) {
        if (c10.e()) {
            m3();
        }
        super.w1(xVar, c10);
        p3();
    }

    /* access modifiers changed from: package-private */
    public int w3(int i10) {
        if (i10 < 0 || this.f43655s == 1) {
            return -1;
        }
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (int i11 = 0; i11 < a(); i11++) {
            for (Integer next : E3(i11)) {
                if (next.intValue() < 0) {
                    return -1;
                }
                treeMap.put(next, Integer.valueOf(i11));
            }
        }
        for (Integer num : treeMap.keySet()) {
            int intValue = num.intValue();
            if (intValue < i10) {
                int intValue2 = ((Integer) treeMap.get(num)).intValue();
                this.f43639S = intValue;
                this.f43640T = B3(intValue2);
                return intValue2;
            }
        }
        return -1;
    }

    public void x1(RecyclerView.C c10) {
        View e02;
        super.x1(c10);
        this.f43629I = false;
        int i10 = this.f43638R;
        if (i10 != -1 && (e02 = e0(i10)) != null) {
            e02.sendAccessibilityEvent(67108864);
            this.f43638R = -1;
        }
    }

    public static class c extends RecyclerView.r {

        /* renamed from: e  reason: collision with root package name */
        int f43641e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f43642f = 0;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int e() {
            return this.f43641e;
        }

        public int f() {
            return this.f43642f;
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        P3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        P3(i10);
    }
}
