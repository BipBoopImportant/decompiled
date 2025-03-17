package w0;

import YH.C16869m;
import YH.C16870n;
import YH.C16877v;
import bI.C17035a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0011\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\tJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0003J\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0016\u0010&\u001a\u00020\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010%R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lw0/p;", "", "<init>", "()V", "", "capacity", "newOffset", "LXH/N;", "b", "(II)V", "itemIndex", "lane", "l", "h", "(I)I", "targetLane", "", "a", "(II)Z", "m", "()I", "i", "j", "f", "(II)I", "e", "requestedIndex", "d", "(I)V", "", "gaps", "k", "(I[I)V", "g", "(I)[I", "I", "anchor", "[I", "lanes", "LYH/m;", "Lw0/p$b;", "c", "LYH/m;", "spannedItems", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p {

    /* renamed from: d  reason: collision with root package name */
    public static final a f31227d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f31228e = 8;

    /* renamed from: a  reason: collision with root package name */
    private int f31229a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f31230b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    private final C16869m<b> f31231c = new C16869m<>();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lw0/p$a;", "", "<init>", "()V", "", "FullSpan", "I", "MaxCapacity", "Unset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lw0/p$b;", "", "", "index", "", "gaps", "<init>", "(I[I)V", "a", "I", "b", "()I", "[I", "()[I", "c", "([I)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f31232a;

        /* renamed from: b  reason: collision with root package name */
        private int[] f31233b;

        public b(int i10, int[] iArr) {
            this.f31232a = i10;
            this.f31233b = iArr;
        }

        public final int[] a() {
            return this.f31233b;
        }

        public final int b() {
            return this.f31232a;
        }

        public final void c(int[] iArr) {
            this.f31233b = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "K", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends C17544u implements C17642l<b, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Comparable f31234c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Comparable comparable) {
            super(1);
            this.f31234c = comparable;
        }

        /* renamed from: a */
        public final Integer invoke(b bVar) {
            return Integer.valueOf(C17035a.e(Integer.valueOf(bVar.b()), this.f31234c));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "K", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends C17544u implements C17642l<b, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Comparable f31235c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Comparable comparable) {
            super(1);
            this.f31235c = comparable;
        }

        /* renamed from: a */
        public final Integer invoke(b bVar) {
            return Integer.valueOf(C17035a.e(Integer.valueOf(bVar.b()), this.f31235c));
        }
    }

    private final void b(int i10, int i11) {
        if (i10 <= 131072) {
            int[] iArr = this.f31230b;
            if (iArr.length < i10) {
                int length = iArr.length;
                while (length < i10) {
                    length *= 2;
                }
                this.f31230b = C16870n.q(this.f31230b, new int[length], i11, 0, 0, 12, (Object) null);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Requested item capacity " + i10 + " is larger than max supported: 131072!").toString());
    }

    static /* synthetic */ void c(p pVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        pVar.b(i10, i11);
    }

    public final boolean a(int i10, int i11) {
        int h10 = h(i10);
        return h10 == i11 || h10 == -1 || h10 == -2;
    }

    public final void d(int i10) {
        int i11 = this.f31229a;
        int i12 = i10 - i11;
        if (i12 < 0 || i12 >= 131072) {
            int max = Math.max(i10 - (this.f31230b.length / 2), 0);
            this.f31229a = max;
            int i13 = max - i11;
            if (i13 >= 0) {
                int[] iArr = this.f31230b;
                if (i13 < iArr.length) {
                    C16870n.l(iArr, iArr, 0, i13, iArr.length);
                }
                int[] iArr2 = this.f31230b;
                C16870n.v(iArr2, 0, Math.max(0, iArr2.length - i13), this.f31230b.length);
            } else {
                int i14 = -i13;
                int[] iArr3 = this.f31230b;
                if (iArr3.length + i14 < 131072) {
                    b(iArr3.length + i14 + 1, i14);
                } else {
                    if (i14 < iArr3.length) {
                        C16870n.l(iArr3, iArr3, i14, 0, iArr3.length - i14);
                    }
                    int[] iArr4 = this.f31230b;
                    C16870n.v(iArr4, 0, 0, Math.min(iArr4.length, i14));
                }
            }
        } else {
            c(this, i12 + 1, 0, 2, (Object) null);
        }
        while (!this.f31231c.isEmpty() && this.f31231c.first().b() < i()) {
            this.f31231c.removeFirst();
        }
        while (!this.f31231c.isEmpty() && this.f31231c.last().b() > m()) {
            this.f31231c.removeLast();
        }
    }

    public final int e(int i10, int i11) {
        int m10 = m();
        for (int i12 = i10 + 1; i12 < m10; i12++) {
            if (a(i12, i11)) {
                return i12;
            }
        }
        return m();
    }

    public final int f(int i10, int i11) {
        while (true) {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
            if (a(i10, i11)) {
                return i10;
            }
        }
    }

    public final int[] g(int i10) {
        C16869m<b> mVar = this.f31231c;
        b bVar = (b) C16877v.z0(this.f31231c, C16877v.j(mVar, 0, mVar.size(), new c(Integer.valueOf(i10))));
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final int h(int i10) {
        if (i10 < i() || i10 >= m()) {
            return -1;
        }
        return this.f31230b[i10 - this.f31229a] - 1;
    }

    public final int i() {
        return this.f31229a;
    }

    public final void j() {
        C16870n.y(this.f31230b, 0, 0, 0, 6, (Object) null);
        this.f31231c.clear();
    }

    public final void k(int i10, int[] iArr) {
        C16869m<b> mVar = this.f31231c;
        int j10 = C16877v.j(mVar, 0, mVar.size(), new d(Integer.valueOf(i10)));
        if (j10 < 0) {
            if (iArr != null) {
                this.f31231c.add(-(j10 + 1), new b(i10, iArr));
            }
        } else if (iArr == null) {
            this.f31231c.remove(j10);
        } else {
            this.f31231c.get(j10).c(iArr);
        }
    }

    public final void l(int i10, int i11) {
        if (i10 >= 0) {
            d(i10);
            this.f31230b[i10 - this.f31229a] = i11 + 1;
            return;
        }
        throw new IllegalArgumentException("Negative lanes are not supported");
    }

    public final int m() {
        return this.f31229a + this.f31230b.length;
    }
}
