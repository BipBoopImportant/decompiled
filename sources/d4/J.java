package D4;

import D4.C6447v;
import D4.E;
import D4.d0;
import YH.C16870n;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import tI.C17974j;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0010\b\u0000\u0018\u0000 \u001c*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u000274B+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB\u0017\b\u0016\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000'¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00028\u00002\u0006\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b+\u0010&J#\u0010.\u001a\u00020\u00102\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b.\u0010/J\r\u00101\u001a\u000200¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\u0002032\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b4\u00105R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u0010=\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00078\u0016@RX\u000e¢\u0006\f\n\u0004\b4\u0010:\u001a\u0004\b;\u0010<R$\u0010\b\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00078\u0016@RX\u000e¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b>\u0010<R$\u0010\t\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u00078\u0016@RX\u000e¢\u0006\f\n\u0004\b \u0010:\u001a\u0004\b?\u0010<R\u0014\u0010A\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010<R\u0014\u0010C\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010<R\u0014\u0010E\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\bD\u0010<¨\u0006F"}, d2 = {"LD4/J;", "", "T", "LD4/D;", "", "LD4/a0;", "pages", "", "placeholdersBefore", "placeholdersAfter", "<init>", "(Ljava/util/List;II)V", "LD4/E$b;", "insertEvent", "(LD4/E$b;)V", "index", "LXH/N;", "c", "(I)V", "f", "(Ljava/util/List;)I", "insert", "LD4/J$b;", "callback", "p", "(LD4/E$b;LD4/J$b;)V", "LtI/j;", "pageOffsetsToDrop", "e", "(LtI/j;)I", "LD4/E$a;", "drop", "d", "(LD4/E$a;LD4/J$b;)V", "", "toString", "()Ljava/lang/String;", "g", "(I)Ljava/lang/Object;", "LD4/t;", "r", "()LD4/t;", "localIndex", "h", "LD4/E;", "pageEvent", "q", "(LD4/E;LD4/J$b;)V", "LD4/d0$b;", "o", "()LD4/d0$b;", "LD4/d0$a;", "b", "(I)LD4/d0$a;", "", "a", "Ljava/util/List;", "<set-?>", "I", "n", "()I", "storageCount", "l", "k", "i", "originalPageOffsetFirst", "j", "originalPageOffsetLast", "m", "size", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class J<T> implements D<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f34110e = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final J<Object> f34111f = new J<>(E.b.f33870g.e());

    /* renamed from: a  reason: collision with root package name */
    private final List<a0<T>> f34112a;

    /* renamed from: b  reason: collision with root package name */
    private int f34113b;

    /* renamed from: c  reason: collision with root package name */
    private int f34114c;

    /* renamed from: d  reason: collision with root package name */
    private int f34115d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LD4/J$a;", "", "<init>", "()V", "T", "LD4/E$b;", "event", "LD4/J;", "a", "(LD4/E$b;)LD4/J;", "INITIAL", "LD4/J;", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> J<T> a(E.b<T> bVar) {
            if (bVar != null) {
                return new J<>(bVar);
            }
            J<T> a10 = J.f34111f;
            C17542s.h(a10, "null cannot be cast to non-null type androidx.paging.PagePresenter<T of androidx.paging.PagePresenter.Companion.initial>");
            return a10;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0007J'\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"LD4/J$b;", "", "", "position", "count", "LXH/N;", "c", "(II)V", "a", "b", "LD4/x;", "loadType", "", "fromMediator", "LD4/v;", "loadState", "e", "(LD4/x;ZLD4/v;)V", "LD4/w;", "source", "mediator", "d", "(LD4/w;LD4/w;)V", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        void a(int i10, int i11);

        void b(int i10, int i11);

        void c(int i10, int i11);

        void d(C6448w wVar, C6448w wVar2);

        void e(C6449x xVar, boolean z10, C6447v vVar);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34116a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                D4.x[] r0 = D4.C6449x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                D4.x r1 = D4.C6449x.REFRESH     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                D4.x r1 = D4.C6449x.PREPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                D4.x r1 = D4.C6449x.APPEND     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f34116a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.J.c.<clinit>():void");
        }
    }

    public J(List<a0<T>> list, int i10, int i11) {
        C17542s.j(list, "pages");
        this.f34112a = C16877v.w1(list);
        this.f34113b = f(list);
        this.f34114c = i10;
        this.f34115d = i11;
    }

    private final void c(int i10) {
        if (i10 < 0 || i10 >= m()) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + m());
        }
    }

    private final void d(E.a<T> aVar, b bVar) {
        int m10 = m();
        C6449x c10 = aVar.c();
        C6449x xVar = C6449x.PREPEND;
        if (c10 == xVar) {
            int l10 = l();
            this.f34113b = n() - e(new C17974j(aVar.e(), aVar.d()));
            this.f34114c = aVar.g();
            int m11 = m() - m10;
            if (m11 > 0) {
                bVar.a(0, m11);
            } else if (m11 < 0) {
                bVar.b(0, -m11);
            }
            int max = Math.max(0, l10 + m11);
            int g10 = aVar.g() - max;
            if (g10 > 0) {
                bVar.c(max, g10);
            }
            bVar.e(xVar, false, C6447v.c.f34457b.b());
            return;
        }
        int k10 = k();
        this.f34113b = n() - e(new C17974j(aVar.e(), aVar.d()));
        this.f34115d = aVar.g();
        int m12 = m() - m10;
        if (m12 > 0) {
            bVar.a(m10, m12);
        } else if (m12 < 0) {
            bVar.b(m10 + m12, -m12);
        }
        int g11 = aVar.g() - (k10 - (m12 < 0 ? Math.min(k10, -m12) : 0));
        if (g11 > 0) {
            bVar.c(m() - aVar.g(), g11);
        }
        bVar.e(C6449x.APPEND, false, C6447v.c.f34457b.b());
    }

    private final int e(C17974j jVar) {
        Iterator<a0<T>> it = this.f34112a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            a0 next = it.next();
            int[] e10 = next.e();
            int length = e10.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (jVar.A(e10[i11])) {
                    i10 += next.b().size();
                    it.remove();
                    break;
                } else {
                    i11++;
                }
            }
        }
        return i10;
    }

    private final int f(List<a0<T>> list) {
        int i10 = 0;
        for (a0 b10 : list) {
            i10 += b10.b().size();
        }
        return i10;
    }

    private final int i() {
        Integer K02 = C16870n.K0(((a0) C16877v.w0(this.f34112a)).e());
        C17542s.g(K02);
        return K02.intValue();
    }

    private final int j() {
        Integer H02 = C16870n.H0(((a0) C16877v.I0(this.f34112a)).e());
        C17542s.g(H02);
        return H02.intValue();
    }

    private final void p(E.b<T> bVar, b bVar2) {
        int f10 = f(bVar.h());
        int m10 = m();
        int i10 = c.f34116a[bVar.f().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int min = Math.min(l(), f10);
                int i11 = f10 - min;
                this.f34112a.addAll(0, bVar.h());
                this.f34113b = n() + f10;
                this.f34114c = bVar.j();
                bVar2.c(l() - min, min);
                bVar2.a(0, i11);
                int m11 = (m() - m10) - i11;
                if (m11 > 0) {
                    bVar2.a(0, m11);
                } else if (m11 < 0) {
                    bVar2.b(0, -m11);
                }
            } else if (i10 == 3) {
                int min2 = Math.min(k(), f10);
                int l10 = l() + n();
                int i12 = f10 - min2;
                List<a0<T>> list = this.f34112a;
                list.addAll(list.size(), bVar.h());
                this.f34113b = n() + f10;
                this.f34115d = bVar.i();
                bVar2.c(l10, min2);
                bVar2.a(l10 + min2, i12);
                int m12 = (m() - m10) - i12;
                if (m12 > 0) {
                    bVar2.a(m() - m12, m12);
                } else if (m12 < 0) {
                    bVar2.b(m(), -m12);
                }
            }
            bVar2.d(bVar.k(), bVar.g());
            return;
        }
        throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
    }

    public final d0.a b(int i10) {
        int i11 = 0;
        int l10 = i10 - l();
        while (l10 >= this.f34112a.get(i11).b().size() && i11 < C16877v.p(this.f34112a)) {
            l10 -= this.f34112a.get(i11).b().size();
            i11++;
        }
        return this.f34112a.get(i11).f(l10, i10 - l(), ((m() - i10) - k()) - 1, i(), j());
    }

    public final T g(int i10) {
        c(i10);
        int l10 = i10 - l();
        if (l10 < 0 || l10 >= n()) {
            return null;
        }
        return h(l10);
    }

    public T h(int i10) {
        int size = this.f34112a.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = this.f34112a.get(i11).b().size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return this.f34112a.get(i11).b().get(i10);
    }

    public int k() {
        return this.f34115d;
    }

    public int l() {
        return this.f34114c;
    }

    public int m() {
        return l() + n() + k();
    }

    public int n() {
        return this.f34113b;
    }

    public final d0.b o() {
        int n10 = n() / 2;
        return new d0.b(n10, n10, i(), j());
    }

    public final void q(E<T> e10, b bVar) {
        C17542s.j(e10, "pageEvent");
        C17542s.j(bVar, "callback");
        if (e10 instanceof E.b) {
            p((E.b) e10, bVar);
        } else if (e10 instanceof E.a) {
            d((E.a) e10, bVar);
        } else if (e10 instanceof E.c) {
            E.c cVar = (E.c) e10;
            bVar.d(cVar.d(), cVar.c());
        } else if (e10 instanceof E.d) {
            throw new IllegalStateException("Paging received an event to display a static list, while still actively loading\nfrom an existing generation of PagingData. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
    }

    public final C6445t<T> r() {
        int l10 = l();
        int k10 = k();
        ArrayList arrayList = new ArrayList();
        for (a0 b10 : this.f34112a) {
            C16877v.E(arrayList, b10.b());
        }
        return new C6445t<>(l10, k10, arrayList);
    }

    public String toString() {
        int n10 = n();
        ArrayList arrayList = new ArrayList(n10);
        for (int i10 = 0; i10 < n10; i10++) {
            arrayList.add(h(i10));
        }
        String G02 = C16877v.G0(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 63, (Object) null);
        return "[(" + l() + " placeholders), " + G02 + ", (" + k() + " placeholders)]";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public J(E.b<T> bVar) {
        this(bVar.h(), bVar.j(), bVar.i());
        C17542s.j(bVar, "insertEvent");
    }
}
