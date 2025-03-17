package YH;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000e\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f\u001aS\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0017\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00162\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010\u0019\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a9\u0010\u001c\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u001b2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\t*\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010!\u001a\u00020 *\u00020 2\u0006\u0010\u0010\u001a\u00020 2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b!\u0010\"\u001a5\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b#\u0010$\u001a#\u0010%\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b%\u0010&\u001a#\u0010'\u001a\u00020\t*\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b'\u0010(\u001a9\u0010*\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+\u001a-\u0010,\u001a\u00020)*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-\u001a-\u0010/\u001a\u00020)*\u00020\u001b2\u0006\u0010\u000b\u001a\u00020.2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b/\u00100\u001a.\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b1\u00102\u001a\u001c\u00103\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u00104\u001a6\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b6\u00107\u001a\u001c\u00108\u001a\u00020\u0005*\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0002¢\u0006\u0004\b8\u00109\u001a\u001c\u0010:\u001a\u00020\u001b*\u00020\u001b2\u0006\u00105\u001a\u00020\u001bH\u0002¢\u0006\u0004\b:\u0010;\u001a\u001c\u0010<\u001a\u00020\t*\u00020\t2\u0006\u00105\u001a\u00020\tH\u0002¢\u0006\u0004\b<\u0010=\u001a\u001c\u0010?\u001a\u00020>*\u00020>2\u0006\u00105\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@\u001a\u001c\u0010B\u001a\u00020A*\u00020A2\u0006\u00105\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010C\u001a\u001f\u0010D\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bD\u0010E\u001a%\u0010F\u001a\u00020)*\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\bF\u0010G\u001a;\u0010K\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010J\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Hj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`I¢\u0006\u0004\bK\u0010L\u001aO\u0010M\u001a\u00020)\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010J\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Hj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`I2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\bM\u0010N\u001a\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0005¢\u0006\u0004\bO\u0010P\u001a\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020.0\u0001*\u00020\u001b¢\u0006\u0004\bQ\u0010R\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\t¢\u0006\u0004\bS\u0010T\u001a\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020U0\u0001*\u00020>¢\u0006\u0004\bV\u0010W\u001a\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020X0\u0001*\u00020A¢\u0006\u0004\bY\u0010Z¨\u0006["}, d2 = {"T", "", "", "f", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "e", "([I)Ljava/util/List;", "", "", "element", "fromIndex", "toIndex", "g", "([FFII)I", "destination", "destinationOffset", "startIndex", "endIndex", "n", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "", "i", "([B[BIII)[B", "l", "([I[IIII)[I", "", "m", "([J[JIII)[J", "k", "([F[FIII)[F", "", "j", "([C[CIII)[C", "u", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "s", "([BII)[B", "t", "([FII)[F", "LXH/N;", "x", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "v", "([IIII)V", "", "w", "([JJII)V", "G", "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "D", "([II)[I", "elements", "H", "([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;", "E", "([I[I)[I", "F", "([J[J)[J", "C", "([F[F)[F", "", "B", "([D[D)[D", "", "I", "([Z[Z)[Z", "K", "([Ljava/lang/Object;)V", "J", "([III)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "L", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "M", "([Ljava/lang/Object;Ljava/util/Comparator;II)V", "Q", "([I)[Ljava/lang/Integer;", "R", "([J)[Ljava/lang/Long;", "P", "([F)[Ljava/lang/Float;", "", "O", "([D)[Ljava/lang/Double;", "", "N", "([Z)[Ljava/lang/Boolean;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* renamed from: YH.q  reason: case insensitive filesystem */
class C16873q extends C16872p {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"YH/q$a", "LYH/d;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "k", "(I)Z", "index", "m", "(I)Ljava/lang/Integer;", "p", "(I)I", "q", "a", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YH.q$a */
    public static final class a extends C16860d<Integer> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int[] f140469b;

        a(int[] iArr) {
            this.f140469b = iArr;
        }

        public int a() {
            return this.f140469b.length;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return k(((Number) obj).intValue());
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return p(((Number) obj).intValue());
        }

        public boolean isEmpty() {
            return this.f140469b.length == 0;
        }

        public boolean k(int i10) {
            return C16870n.Y(this.f140469b, i10);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return q(((Number) obj).intValue());
        }

        /* renamed from: m */
        public Integer get(int i10) {
            return Integer.valueOf(this.f140469b[i10]);
        }

        public int p(int i10) {
            return C16870n.s0(this.f140469b, i10);
        }

        public int q(int i10) {
            return C16874s.E0(this.f140469b, i10);
        }
    }

    public static /* synthetic */ void A(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        C16870n.x(objArr, obj, i10, i11);
    }

    public static double[] B(double[] dArr, double[] dArr2) {
        C17542s.j(dArr, "<this>");
        C17542s.j(dArr2, "elements");
        int length = dArr.length;
        int length2 = dArr2.length;
        double[] copyOf = Arrays.copyOf(dArr, length + length2);
        System.arraycopy(dArr2, 0, copyOf, length, length2);
        C17542s.g(copyOf);
        return copyOf;
    }

    public static float[] C(float[] fArr, float[] fArr2) {
        C17542s.j(fArr, "<this>");
        C17542s.j(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        C17542s.g(copyOf);
        return copyOf;
    }

    public static int[] D(int[] iArr, int i10) {
        C17542s.j(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i10;
        C17542s.g(copyOf);
        return copyOf;
    }

    public static int[] E(int[] iArr, int[] iArr2) {
        C17542s.j(iArr, "<this>");
        C17542s.j(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        C17542s.g(copyOf);
        return copyOf;
    }

    public static long[] F(long[] jArr, long[] jArr2) {
        C17542s.j(jArr, "<this>");
        C17542s.j(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, copyOf, length, length2);
        C17542s.g(copyOf);
        return copyOf;
    }

    public static <T> T[] G(T[] tArr, T t10) {
        C17542s.j(tArr, "<this>");
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        copyOf[length] = t10;
        C17542s.g(copyOf);
        return copyOf;
    }

    public static <T> T[] H(T[] tArr, T[] tArr2) {
        C17542s.j(tArr, "<this>");
        C17542s.j(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] copyOf = Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, copyOf, length, length2);
        C17542s.g(copyOf);
        return copyOf;
    }

    public static boolean[] I(boolean[] zArr, boolean[] zArr2) {
        C17542s.j(zArr, "<this>");
        C17542s.j(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, copyOf, length, length2);
        C17542s.g(copyOf);
        return copyOf;
    }

    public static void J(int[] iArr, int i10, int i11) {
        C17542s.j(iArr, "<this>");
        Arrays.sort(iArr, i10, i11);
    }

    public static <T> void K(T[] tArr) {
        C17542s.j(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void L(T[] tArr, Comparator<? super T> comparator) {
        C17542s.j(tArr, "<this>");
        C17542s.j(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static <T> void M(T[] tArr, Comparator<? super T> comparator, int i10, int i11) {
        C17542s.j(tArr, "<this>");
        C17542s.j(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }

    public static Boolean[] N(boolean[] zArr) {
        C17542s.j(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static Double[] O(double[] dArr) {
        C17542s.j(dArr, "<this>");
        Double[] dArr2 = new Double[dArr.length];
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    public static Float[] P(float[] fArr) {
        C17542s.j(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    public static Integer[] Q(int[] iArr) {
        C17542s.j(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    public static Long[] R(long[] jArr) {
        C17542s.j(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    public static List<Integer> e(int[] iArr) {
        C17542s.j(iArr, "<this>");
        return new a(iArr);
    }

    public static <T> List<T> f(T[] tArr) {
        C17542s.j(tArr, "<this>");
        List<T> a10 = C16875t.a(tArr);
        C17542s.i(a10, "asList(...)");
        return a10;
    }

    public static final int g(float[] fArr, float f10, int i10, int i11) {
        C17542s.j(fArr, "<this>");
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    public static /* synthetic */ int h(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return g(fArr, f10, i10, i11);
    }

    public static byte[] i(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        C17542s.j(bArr, "<this>");
        C17542s.j(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    public static char[] j(char[] cArr, char[] cArr2, int i10, int i11, int i12) {
        C17542s.j(cArr, "<this>");
        C17542s.j(cArr2, "destination");
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
        return cArr2;
    }

    public static float[] k(float[] fArr, float[] fArr2, int i10, int i11, int i12) {
        C17542s.j(fArr, "<this>");
        C17542s.j(fArr2, "destination");
        System.arraycopy(fArr, i11, fArr2, i10, i12 - i11);
        return fArr2;
    }

    public static int[] l(int[] iArr, int[] iArr2, int i10, int i11, int i12) {
        C17542s.j(iArr, "<this>");
        C17542s.j(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
        return iArr2;
    }

    public static long[] m(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        C17542s.j(jArr, "<this>");
        C17542s.j(jArr2, "destination");
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
        return jArr2;
    }

    public static <T> T[] n(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        C17542s.j(tArr, "<this>");
        C17542s.j(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ byte[] o(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return C16870n.i(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ float[] p(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return C16870n.k(fArr, fArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] q(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return C16870n.l(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] r(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return C16870n.n(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] s(byte[] bArr, int i10, int i11) {
        C17542s.j(bArr, "<this>");
        C16871o.c(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        C17542s.i(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static float[] t(float[] fArr, int i10, int i11) {
        C17542s.j(fArr, "<this>");
        C16871o.c(i11, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        C17542s.i(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static <T> T[] u(T[] tArr, int i10, int i11) {
        C17542s.j(tArr, "<this>");
        C16871o.c(i11, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i10, i11);
        C17542s.i(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void v(int[] iArr, int i10, int i11, int i12) {
        C17542s.j(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static final void w(long[] jArr, long j10, int i10, int i11) {
        C17542s.j(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    public static <T> void x(T[] tArr, T t10, int i10, int i11) {
        C17542s.j(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void y(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        C16870n.v(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void z(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        w(jArr, j10, i10, i11);
    }
}
