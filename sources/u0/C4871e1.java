package U0;

import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\u0004\u001a\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u0004\u001a\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001b\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\u0007\u001a#\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0007\u001a#\u0010\u0012\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0007\u001a\u001b\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0004\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0004\u001a\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0004\u001a\u001b\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u0004\u001a#\u0010\u001a\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u0004\u001a#\u0010\u001d\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u001b\u0010\u001e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001e\u0010\u0004\u001a#\u0010\u001f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001f\u0010\u001b\u001a\u001b\u0010 \u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b \u0010\u0004\u001a#\u0010\"\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\"\u0010\u001b\u001aK\u0010)\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u0001H\u0002¢\u0006\u0004\b)\u0010*\u001a5\u00100\u001a\u0004\u0018\u00010,*\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-2\u0006\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0001H\u0002¢\u0006\u0004\b0\u00101\u001a3\u00103\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-2\u0006\u00102\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0001H\u0002¢\u0006\u0004\b3\u00104\u001a3\u00105\u001a\u00020\u0001*\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-2\u0006\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0001H\u0002¢\u0006\u0004\b5\u00104¨\u00066"}, d2 = {"", "", "address", "H", "([II)I", "", "N", "([II)Z", "R", "L", "S", "J", "K", "value", "LXH/N;", "Z", "([IIZ)V", "D", "W", "C", "B", "V", "E", "(I)I", "O", "Q", "a0", "([III)V", "T", "b0", "I", "Y", "F", "anchor", "X", "key", "isNode", "hasDataKey", "hasData", "parentAnchor", "dataAnchor", "M", "([IIIZZZII)V", "Ljava/util/ArrayList;", "LU0/d;", "Lkotlin/collections/ArrayList;", "index", "effectiveSize", "G", "(Ljava/util/ArrayList;II)LU0/d;", "location", "U", "(Ljava/util/ArrayList;II)I", "P", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.e1  reason: case insensitive filesystem */
public final class C4871e1 {
    /* access modifiers changed from: private */
    public static final int B(int[] iArr, int i10) {
        int i11 = i10 * 5;
        if (i11 >= iArr.length) {
            return iArr.length;
        }
        return E(iArr[i11 + 1] >> 29) + iArr[i11 + 4];
    }

    /* access modifiers changed from: private */
    public static final boolean C(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 201326592) != 0;
    }

    /* access modifiers changed from: private */
    public static final boolean D(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 67108864) != 0;
    }

    /* access modifiers changed from: private */
    public static final int E(int i10) {
        switch (i10) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* access modifiers changed from: private */
    public static final int F(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* access modifiers changed from: private */
    public static final C4866d G(ArrayList<C4866d> arrayList, int i10, int i11) {
        int U10 = U(arrayList, i10, i11);
        if (U10 >= 0) {
            return arrayList.get(U10);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final int H(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1];
    }

    /* access modifiers changed from: private */
    public static final int I(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    /* access modifiers changed from: private */
    public static final boolean J(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 268435456) != 0;
    }

    /* access modifiers changed from: private */
    public static final boolean K(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 134217728) != 0;
    }

    /* access modifiers changed from: private */
    public static final boolean L(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & 536870912) != 0;
    }

    /* access modifiers changed from: private */
    public static final void M(int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12, int i12, int i13) {
        int i14 = z10 ? CatalogRepository.FETCH_FLAG_SDB : 0;
        int i15 = z11 ? 536870912 : 0;
        int i16 = z12 ? 268435456 : 0;
        int i17 = i10 * 5;
        iArr[i17] = i11;
        iArr[i17 + 1] = i14 | i15 | i16;
        iArr[i17 + 2] = i12;
        iArr[i17 + 3] = 0;
        iArr[i17 + 4] = i13;
    }

    /* access modifiers changed from: private */
    public static final boolean N(int[] iArr, int i10) {
        return (iArr[(i10 * 5) + 1] & CatalogRepository.FETCH_FLAG_SDB) != 0;
    }

    /* access modifiers changed from: private */
    public static final int O(int[] iArr, int i10) {
        return iArr[i10 * 5];
    }

    /* access modifiers changed from: private */
    public static final int P(ArrayList<C4866d> arrayList, int i10, int i11) {
        int U10 = U(arrayList, i10, i11);
        return U10 >= 0 ? U10 : -(U10 + 1);
    }

    /* access modifiers changed from: private */
    public static final int Q(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & 67108863;
    }

    /* access modifiers changed from: private */
    public static final int R(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    /* access modifiers changed from: private */
    public static final int S(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + E(iArr[i11 + 1] >> 30);
    }

    /* access modifiers changed from: private */
    public static final int T(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 2];
    }

    /* access modifiers changed from: private */
    public static final int U(ArrayList<C4866d> arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int a10 = arrayList.get(i13).a();
            if (a10 < 0) {
                a10 += i11;
            }
            int l10 = C17542s.l(a10, i10);
            if (l10 < 0) {
                i12 = i13 + 1;
            } else if (l10 <= 0) {
                return i13;
            } else {
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    /* access modifiers changed from: private */
    public static final int V(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return iArr[i11 + 4] + E(iArr[i11 + 1] >> 28);
    }

    /* access modifiers changed from: private */
    public static final void W(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | 67108864;
        } else {
            iArr[i11] = iArr[i11] & -67108865;
        }
    }

    /* access modifiers changed from: private */
    public static final void X(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 4] = i11;
    }

    /* access modifiers changed from: private */
    public static final void Y(int[] iArr, int i10, int i11) {
        C4895p.Q(i11 >= 0);
        iArr[(i10 * 5) + 3] = i11;
    }

    /* access modifiers changed from: private */
    public static final void Z(int[] iArr, int i10, boolean z10) {
        int i11 = (i10 * 5) + 1;
        if (z10) {
            iArr[i11] = iArr[i11] | 134217728;
        } else {
            iArr[i11] = iArr[i11] & -134217729;
        }
    }

    /* access modifiers changed from: private */
    public static final void a0(int[] iArr, int i10, int i11) {
        C4895p.Q(i11 >= 0 && i11 < 67108863);
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & -67108864);
    }

    /* access modifiers changed from: private */
    public static final void b0(int[] iArr, int i10, int i11) {
        iArr[(i10 * 5) + 2] = i11;
    }
}
