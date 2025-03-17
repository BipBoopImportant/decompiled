package u0;

import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import v0.C6138d;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0019\n\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010 R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010(R*\u0010/\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00068\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b#\u0010-\"\u0004\b*\u0010.R\u0014\u00100\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010-R\u0011\u00101\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010-¨\u00062"}, d2 = {"Lu0/H;", "", "Lu0/j;", "gridContent", "<init>", "(Lu0/j;)V", "", "currentSlotsPerLine", "", "Lu0/c;", "b", "(I)Ljava/util/List;", "LXH/N;", "g", "()V", "lineIndex", "Lu0/H$c;", "c", "(I)Lu0/H$c;", "itemIndex", "d", "(I)I", "maxSpan", "i", "(II)I", "a", "Lu0/j;", "Ljava/util/ArrayList;", "Lu0/H$a;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "buckets", "I", "lastLineIndex", "lastLineStartItemIndex", "e", "lastLineStartKnownSpan", "f", "cachedBucketIndex", "", "Ljava/util/List;", "cachedBucket", "h", "previousDefaultSpans", "value", "()I", "(I)V", "slotsPerLine", "bucketSize", "totalSize", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.H  reason: case insensitive filesystem */
public final class C5973H {

    /* renamed from: a  reason: collision with root package name */
    private final C5986j f29575a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<a> f29576b;

    /* renamed from: c  reason: collision with root package name */
    private int f29577c;

    /* renamed from: d  reason: collision with root package name */
    private int f29578d;

    /* renamed from: e  reason: collision with root package name */
    private int f29579e;

    /* renamed from: f  reason: collision with root package name */
    private int f29580f = -1;

    /* renamed from: g  reason: collision with root package name */
    private final List<Integer> f29581g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private List<C5979c> f29582h = C16877v.n();

    /* renamed from: i  reason: collision with root package name */
    private int f29583i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\tR\"\u0010\r\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lu0/H$b;", "Lu0/q;", "<init>", "()V", "", "b", "I", "getMaxCurrentLineSpan", "()I", "(I)V", "maxCurrentLineSpan", "c", "a", "maxLineSpan", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.H$b */
    private static final class b implements C5993q {

        /* renamed from: a  reason: collision with root package name */
        public static final b f29586a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static int f29587b;

        /* renamed from: c  reason: collision with root package name */
        private static int f29588c;

        private b() {
        }

        public int a() {
            return f29588c;
        }

        public void b(int i10) {
            f29587b = i10;
        }

        public void c(int i10) {
            f29588c = i10;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lu0/H$c;", "", "", "firstItemIndex", "", "Lu0/c;", "spans", "<init>", "(ILjava/util/List;)V", "a", "I", "()I", "b", "Ljava/util/List;", "()Ljava/util/List;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.H$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f29589a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C5979c> f29590b;

        public c(int i10, List<C5979c> list) {
            this.f29589a = i10;
            this.f29590b = list;
        }

        public final int a() {
            return this.f29589a;
        }

        public final List<C5979c> b() {
            return this.f29590b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu0/H$a;", "it", "", "a", "(Lu0/H$a;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.H$d */
    static final class d extends C17544u implements C17642l<a, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f29591c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(1);
            this.f29591c = i10;
        }

        /* renamed from: a */
        public final Integer invoke(a aVar) {
            return Integer.valueOf(aVar.a() - this.f29591c);
        }
    }

    public C5973H(C5986j jVar) {
        this.f29575a = jVar;
        ArrayList<a> arrayList = new ArrayList<>();
        arrayList.add(new a(0, 0, 2, (DefaultConstructorMarker) null));
        this.f29576b = arrayList;
    }

    private final int a() {
        return ((int) Math.sqrt((((double) f()) * 1.0d) / ((double) this.f29583i))) + 1;
    }

    private final List<C5979c> b(int i10) {
        if (i10 == this.f29582h.size()) {
            return this.f29582h;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(C5979c.a(C5972G.a(1)));
        }
        this.f29582h = arrayList;
        return arrayList;
    }

    private final void g() {
        this.f29576b.clear();
        this.f29576b.add(new a(0, 0, 2, (DefaultConstructorMarker) null));
        this.f29577c = 0;
        this.f29578d = 0;
        this.f29579e = 0;
        this.f29580f = -1;
        this.f29581g.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
        if (r7 < r6) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final u0.C5973H.c c(int r11) {
        /*
            r10 = this;
            u0.j r0 = r10.f29575a
            boolean r0 = r0.q()
            r1 = 0
            if (r0 != 0) goto L_0x0025
            int r0 = r10.f29583i
            int r11 = r11 * r0
            u0.H$c r0 = new u0.H$c
            int r2 = r10.f29583i
            int r3 = r10.f()
            int r3 = r3 - r11
            int r2 = tI.C17978n.i(r2, r3)
            int r1 = tI.C17978n.e(r2, r1)
            java.util.List r1 = r10.b(r1)
            r0.<init>(r11, r1)
            return r0
        L_0x0025:
            int r0 = r10.a()
            int r0 = r11 / r0
            java.util.ArrayList<u0.H$a> r2 = r10.f29576b
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r10.a()
            int r2 = r2 * r0
            java.util.ArrayList<u0.H$a> r4 = r10.f29576b
            java.lang.Object r4 = r4.get(r0)
            u0.H$a r4 = (u0.C5973H.a) r4
            int r4 = r4.a()
            java.util.ArrayList<u0.H$a> r5 = r10.f29576b
            java.lang.Object r5 = r5.get(r0)
            u0.H$a r5 = (u0.C5973H.a) r5
            int r5 = r5.b()
            int r6 = r10.f29577c
            if (r2 > r6) goto L_0x0060
            if (r6 > r11) goto L_0x0060
            int r4 = r10.f29578d
            int r5 = r10.f29579e
            r2 = r6
            goto L_0x007c
        L_0x0060:
            int r6 = r10.f29580f
            if (r0 != r6) goto L_0x007c
            int r6 = r11 - r2
            java.util.List<java.lang.Integer> r7 = r10.f29581g
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x007c
            java.util.List<java.lang.Integer> r2 = r10.f29581g
            java.lang.Object r2 = r2.get(r6)
            java.lang.Number r2 = (java.lang.Number) r2
            int r4 = r2.intValue()
            r2 = r11
            r5 = r1
        L_0x007c:
            int r6 = r10.a()
            int r6 = r2 % r6
            if (r6 != 0) goto L_0x0090
            int r6 = r10.a()
            int r7 = r11 - r2
            r8 = 2
            if (r8 > r7) goto L_0x0090
            if (r7 >= r6) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r3 = r1
        L_0x0091:
            if (r3 == 0) goto L_0x009a
            r10.f29580f = r0
            java.util.List<java.lang.Integer> r0 = r10.f29581g
            r0.clear()
        L_0x009a:
            if (r2 > r11) goto L_0x0142
        L_0x009c:
            if (r2 >= r11) goto L_0x0103
            int r0 = r10.f()
            if (r4 >= r0) goto L_0x0103
            if (r3 == 0) goto L_0x00af
            java.util.List<java.lang.Integer> r0 = r10.f29581g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r0.add(r6)
        L_0x00af:
            r0 = r1
        L_0x00b0:
            int r6 = r10.f29583i
            if (r0 >= r6) goto L_0x00d2
            int r6 = r10.f()
            if (r4 >= r6) goto L_0x00d2
            if (r5 != 0) goto L_0x00c7
            int r6 = r10.f29583i
            int r6 = r6 - r0
            int r6 = r10.i(r4, r6)
            r9 = r6
            r6 = r5
            r5 = r9
            goto L_0x00c8
        L_0x00c7:
            r6 = r1
        L_0x00c8:
            int r0 = r0 + r5
            int r7 = r10.f29583i
            if (r0 <= r7) goto L_0x00ce
            goto L_0x00d2
        L_0x00ce:
            int r4 = r4 + 1
            r5 = r6
            goto L_0x00b0
        L_0x00d2:
            int r2 = r2 + 1
            int r0 = r10.a()
            int r0 = r2 % r0
            if (r0 != 0) goto L_0x009c
            int r0 = r10.f()
            if (r4 >= r0) goto L_0x009c
            int r0 = r10.a()
            int r0 = r2 / r0
            java.util.ArrayList<u0.H$a> r6 = r10.f29576b
            int r6 = r6.size()
            if (r6 != r0) goto L_0x00fb
            java.util.ArrayList<u0.H$a> r0 = r10.f29576b
            u0.H$a r6 = new u0.H$a
            r6.<init>(r4, r5)
            r0.add(r6)
            goto L_0x009c
        L_0x00fb:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "invalid starting point"
            r11.<init>(r0)
            throw r11
        L_0x0103:
            r10.f29577c = r11
            r10.f29578d = r4
            r10.f29579e = r5
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r0 = r1
            r2 = r4
        L_0x0110:
            int r3 = r10.f29583i
            if (r0 >= r3) goto L_0x013c
            int r3 = r10.f()
            if (r2 >= r3) goto L_0x013c
            if (r5 != 0) goto L_0x0127
            int r3 = r10.f29583i
            int r3 = r3 - r0
            int r3 = r10.i(r2, r3)
            r9 = r5
            r5 = r3
            r3 = r9
            goto L_0x0128
        L_0x0127:
            r3 = r1
        L_0x0128:
            int r0 = r0 + r5
            int r6 = r10.f29583i
            if (r0 > r6) goto L_0x013c
            int r2 = r2 + 1
            long r5 = u0.C5972G.a(r5)
            u0.c r5 = u0.C5979c.a(r5)
            r11.add(r5)
            r5 = r3
            goto L_0x0110
        L_0x013c:
            u0.H$c r0 = new u0.H$c
            r0.<init>(r4, r11)
            return r0
        L_0x0142:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "currentLine > lineIndex"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C5973H.c(int):u0.H$c");
    }

    public final int d(int i10) {
        if (f() <= 0) {
            return 0;
        }
        if (i10 >= f()) {
            throw new IllegalArgumentException("ItemIndex > total count");
        } else if (!this.f29575a.q()) {
            return i10 / this.f29583i;
        } else {
            int l10 = C16877v.l(this.f29576b, 0, 0, new d(i10), 3, (Object) null);
            if (l10 < 0) {
                l10 = (-l10) - 2;
            }
            int a10 = a() * l10;
            int a11 = this.f29576b.get(l10).a();
            if (a11 <= i10) {
                int i11 = 0;
                while (a11 < i10) {
                    int i12 = a11 + 1;
                    int i13 = i(a11, this.f29583i - i11);
                    i11 += i13;
                    int i14 = this.f29583i;
                    if (i11 >= i14) {
                        if (i11 == i14) {
                            a10++;
                            i11 = 0;
                        } else {
                            a10++;
                            i11 = i13;
                        }
                    }
                    if (a10 % a() == 0 && a10 / a() >= this.f29576b.size()) {
                        this.f29576b.add(new a(i12 - (i11 > 0 ? 1 : 0), 0, 2, (DefaultConstructorMarker) null));
                    }
                    a11 = i12;
                }
                return i11 + i(i10, this.f29583i - i11) > this.f29583i ? a10 + 1 : a10;
            }
            throw new IllegalArgumentException("currentItemIndex > itemIndex");
        }
    }

    public final int e() {
        return this.f29583i;
    }

    public final int f() {
        return this.f29575a.n().a();
    }

    public final void h(int i10) {
        if (i10 != this.f29583i) {
            this.f29583i = i10;
            g();
        }
    }

    public final int i(int i10, int i11) {
        b bVar = b.f29586a;
        bVar.b(i11);
        bVar.c(this.f29583i);
        C6138d.a<C5985i> aVar = this.f29575a.n().get(i10);
        return C5979c.d(aVar.c().b().invoke(bVar, Integer.valueOf(i10 - aVar.b())).g());
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lu0/H$a;", "", "", "firstItemIndex", "firstItemKnownSpan", "<init>", "(II)V", "a", "I", "()I", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.H$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f29584a;

        /* renamed from: b  reason: collision with root package name */
        private final int f29585b;

        public a(int i10, int i11) {
            this.f29584a = i10;
            this.f29585b = i11;
        }

        public final int a() {
            return this.f29584a;
        }

        public final int b() {
            return this.f29585b;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i12 & 2) != 0 ? 0 : i11);
        }
    }
}
