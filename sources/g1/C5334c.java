package g1;

import U0.C0;
import XH.C16796C;
import XH.C16807N;
import XH.C16820k;
import XH.v;
import YH.C16870n;
import YH.C16877v;
import g1.C5343l;
import j0.O;
import j0.a0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\t\b\u0017\u0018\u0000 52\u00020\u0001:\u0001dBE\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ?\u0010\u0012\u001a\u00020\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ%\u0010\u0018\u001a\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\bH\u0010¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\bH\u0010¢\u0006\u0004\b\u001f\u0010\u000eJ\u000f\u0010 \u001a\u00020\bH\u0010¢\u0006\u0004\b \u0010\u000eJ5\u0010&\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00022\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0018\u00010\"2\u0006\u0010%\u001a\u00020\u0004H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0000¢\u0006\u0004\b(\u0010\u000eJ\u0017\u0010)\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b+\u0010*J\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0004H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0010¢\u0006\u0004\b5\u00106R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0004¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\"\u0010A\u001a\u00020\u00028\u0010@\u0010X\u000e¢\u0006\u0012\n\u0004\b=\u0010&\u001a\u0004\b>\u0010?\"\u0004\b@\u0010*R:\u0010I\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010B2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010B8\u0010@VX\u000e¢\u0006\u0012\n\u0004\b>\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR*\u0010P\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010J8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b<\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010V\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u00102R\"\u0010[\u001a\u00020,8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010/R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&R\"\u0010b\u001a\u00020\\8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020\\8VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010_¨\u0006e"}, d2 = {"Lg1/c;", "Lg1/k;", "", "id", "Lg1/n;", "invalid", "Lkotlin/Function1;", "", "LXH/N;", "readObserver", "writeObserver", "<init>", "(ILg1/n;LnI/l;LnI/l;)V", "R", "()V", "S", "A", "N", "Q", "(LnI/l;LnI/l;)Lg1/c;", "Lg1/l;", "C", "()Lg1/l;", "d", "x", "(LnI/l;)Lg1/k;", "snapshot", "m", "(Lg1/k;)V", "n", "o", "c", "r", "snapshotId", "", "Lg1/I;", "optimisticMerges", "invalidSnapshots", "I", "(ILjava/util/Map;Lg1/n;)Lg1/l;", "B", "J", "(I)V", "L", "", "handles", "M", "([I)V", "snapshots", "K", "(Lg1/n;)V", "Lg1/G;", "state", "p", "(Lg1/G;)V", "g", "LnI/l;", "H", "()LnI/l;", "h", "k", "i", "j", "()I", "w", "writeCount", "Lj0/O;", "<set-?>", "Lj0/O;", "E", "()Lj0/O;", "P", "(Lj0/O;)V", "modified", "", "Ljava/util/List;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "merged", "l", "Lg1/n;", "F", "()Lg1/n;", "setPreviousIds$runtime_release", "previousIds", "[I", "G", "()[I", "setPreviousPinnedSnapshots$runtime_release", "previousPinnedSnapshots", "", "Z", "D", "()Z", "O", "(Z)V", "applied", "readOnly", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.c  reason: case insensitive filesystem */
public class C5334c extends C5342k {

    /* renamed from: p  reason: collision with root package name */
    private static final a f23374p = new a((DefaultConstructorMarker) null);

    /* renamed from: q  reason: collision with root package name */
    public static final int f23375q = 8;

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f23376r = new int[0];

    /* renamed from: g  reason: collision with root package name */
    private final C17642l<Object, C16807N> f23377g;

    /* renamed from: h  reason: collision with root package name */
    private final C17642l<Object, C16807N> f23378h;

    /* renamed from: i  reason: collision with root package name */
    private int f23379i;

    /* renamed from: j  reason: collision with root package name */
    private O<C5326G> f23380j;

    /* renamed from: k  reason: collision with root package name */
    private List<? extends C5326G> f23381k;

    /* renamed from: l  reason: collision with root package name */
    private C5345n f23382l = C5345n.f23408e.a();

    /* renamed from: m  reason: collision with root package name */
    private int[] f23383m = f23376r;

    /* renamed from: n  reason: collision with root package name */
    private int f23384n = 1;

    /* renamed from: o  reason: collision with root package name */
    private boolean f23385o;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg1/c$a;", "", "<init>", "()V", "", "EmptyIntArray", "[I", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g1.c$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C5334c(int i10, C5345n nVar, C17642l<Object, C16807N> lVar, C17642l<Object, C16807N> lVar2) {
        super(i10, nVar, (DefaultConstructorMarker) null);
        this.f23377g = lVar;
        this.f23378h = lVar2;
    }

    private final void A() {
        O<C5326G> E10 = E();
        if (E10 != null) {
            R();
            P((O<C5326G>) null);
            int f10 = f();
            Object[] objArr = E10.f24576b;
            long[] jArr = E10.f24575a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                for (C5328I m10 = ((C5326G) objArr[(i10 << 3) + i12]).m(); m10 != null; m10 = m10.e()) {
                                    if (m10.f() == f10 || C16877v.l0(this.f23382l, Integer.valueOf(m10.f()))) {
                                        m10.h(0);
                                    }
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        b();
    }

    private final void N() {
        for (int Y10 : this.f23383m) {
            C5347p.Y(Y10);
        }
    }

    private final void R() {
        if (this.f23385o) {
            C0.b("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void S() {
        if (!(!this.f23385o || this.f23400d >= 0)) {
            C0.b("Unsupported operation on a disposed or applied snapshot");
        }
    }

    public final void B() {
        J(f());
        C16807N n10 = C16807N.f139792a;
        if (!D() && !e()) {
            int f10 = f();
            synchronized (C5347p.I()) {
                int i10 = C5347p.f23424e;
                C5347p.f23424e = i10 + 1;
                u(i10);
                C5347p.f23423d = C5347p.f23423d.B(f());
            }
            v(C5347p.z(g(), f10 + 1, f()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b2, code lost:
        r1.f23385o = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b4, code lost:
        if (r4 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        r7 = W0.e.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c1, code lost:
        if (r7.isEmpty() != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c3, code lost:
        r8 = r5.size();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c8, code lost:
        if (r9 >= r8) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ca, code lost:
        ((nI.p) r5.get(r9)).invoke(r7, r1);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d5, code lost:
        if (r2 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        if (r2.e() == false) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dd, code lost:
        r7 = W0.e.a(r2);
        r8 = r5.size();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e6, code lost:
        if (r9 >= r8) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e8, code lost:
        ((nI.p) r5.get(r9)).invoke(r7, r1);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f3, code lost:
        r5 = g1.C5347p.I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r();
        g1.C5347p.C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0108, code lost:
        if (r4 == null) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r15 = r4.f24576b;
        r4 = r4.f24575a;
        r6 = r4.length - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0111, code lost:
        if (r6 < 0) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0113, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0114, code lost:
        r0 = r4[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        if (((((~r0) << 7) & r0) & -9187201950435737472L) == -9187201950435737472L) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011e, code lost:
        r7 = 8 - ((~(r3 - r6)) >>> 31);
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0126, code lost:
        if (r8 >= r7) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012e, code lost:
        if ((r0 & 255) >= 128) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0130, code lost:
        g1.C5347p.U((g1.C5326G) r15[(r3 << 3) + r8]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013d, code lost:
        r1 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0141, code lost:
        r0 = r0 >> 8;
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0149, code lost:
        if (r7 != 8) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014e, code lost:
        if (r3 == r6) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0150, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0153, code lost:
        if (r2 == null) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0155, code lost:
        r0 = r2.f24576b;
        r1 = r2.f24575a;
        r2 = r1.length - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015c, code lost:
        if (r2 < 0) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015e, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r6 = r1[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0168, code lost:
        if (((((~r6) << 7) & r6) & -9187201950435737472L) == -9187201950435737472L) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016a, code lost:
        r4 = 8 - ((~(r3 - r2)) >>> 31);
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0172, code lost:
        if (r8 >= r4) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017c, code lost:
        if ((r6 & 255) >= 128) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017e, code lost:
        g1.C5347p.U((g1.C5326G) r0[(r3 << 3) + r8]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0188, code lost:
        r6 = r6 >> 8;
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x018c, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0191, code lost:
        if (r4 != 8) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0194, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0199, code lost:
        if (r3 == r2) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019b, code lost:
        r3 = r3 + r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x019d, code lost:
        r1 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r0 = r1.f23381k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a1, code lost:
        if (r0 == null) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a3, code lost:
        r2 = r0.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a8, code lost:
        if (r6 >= r2) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01aa, code lost:
        g1.C5347p.U((g1.C5326G) r0.get(r6));
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b8, code lost:
        r1.f23381k = null;
        r0 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01bd, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c0, code lost:
        return g1.C5343l.b.f23402a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01c1, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g1.C5343l C() {
        /*
            r21 = this;
            r1 = r21
            r0 = 1
            j0.O r2 = r21.E()
            r3 = 0
            if (r2 == 0) goto L_0x002f
            java.util.concurrent.atomic.AtomicReference r4 = g1.C5347p.f23429j
            java.lang.Object r4 = r4.get()
            g1.c r4 = (g1.C5334c) r4
            g1.n r5 = g1.C5347p.f23423d
            java.util.concurrent.atomic.AtomicReference r6 = g1.C5347p.f23429j
            java.lang.Object r6 = r6.get()
            g1.a r6 = (g1.C5332a) r6
            int r6 = r6.f()
            g1.n r5 = r5.s(r6)
            java.util.Map r4 = g1.C5347p.R(r4, r1, r5)
            goto L_0x0030
        L_0x002f:
            r4 = r3
        L_0x0030:
            java.util.List r5 = YH.C16877v.n()
            java.lang.Object r6 = g1.C5347p.I()
            monitor-enter(r6)
            g1.C5347p.g0(r21)     // Catch:{ all -> 0x0086 }
            if (r2 == 0) goto L_0x0089
            int r7 = r2.c()     // Catch:{ all -> 0x0086 }
            if (r7 != 0) goto L_0x0045
            goto L_0x0089
        L_0x0045:
            java.util.concurrent.atomic.AtomicReference r5 = g1.C5347p.f23429j     // Catch:{ all -> 0x0086 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0086 }
            g1.a r5 = (g1.C5332a) r5     // Catch:{ all -> 0x0086 }
            int r7 = g1.C5347p.f23424e     // Catch:{ all -> 0x0086 }
            g1.n r8 = g1.C5347p.f23423d     // Catch:{ all -> 0x0086 }
            int r9 = r5.f()     // Catch:{ all -> 0x0086 }
            g1.n r8 = r8.s(r9)     // Catch:{ all -> 0x0086 }
            g1.l r4 = r1.I(r7, r4, r8)     // Catch:{ all -> 0x0086 }
            g1.l$b r7 = g1.C5343l.b.f23402a     // Catch:{ all -> 0x0086 }
            boolean r7 = kotlin.jvm.internal.C17542s.e(r4, r7)     // Catch:{ all -> 0x0086 }
            if (r7 != 0) goto L_0x006d
            monitor-exit(r6)
            return r4
        L_0x006d:
            r21.c()     // Catch:{ all -> 0x0086 }
            nI.l r4 = g1.C5347p.f23420a     // Catch:{ all -> 0x0086 }
            java.lang.Object unused = g1.C5347p.a0(r5, r4)     // Catch:{ all -> 0x0086 }
            j0.O r4 = r5.E()     // Catch:{ all -> 0x0086 }
            r1.P(r3)     // Catch:{ all -> 0x0086 }
            r5.P(r3)     // Catch:{ all -> 0x0086 }
            java.util.List r5 = g1.C5347p.f23427h     // Catch:{ all -> 0x0086 }
            goto L_0x00af
        L_0x0086:
            r0 = move-exception
            goto L_0x01c3
        L_0x0089:
            r21.c()     // Catch:{ all -> 0x0086 }
            java.util.concurrent.atomic.AtomicReference r4 = g1.C5347p.f23429j     // Catch:{ all -> 0x0086 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0086 }
            g1.a r4 = (g1.C5332a) r4     // Catch:{ all -> 0x0086 }
            nI.l r7 = g1.C5347p.f23420a     // Catch:{ all -> 0x0086 }
            java.lang.Object unused = g1.C5347p.a0(r4, r7)     // Catch:{ all -> 0x0086 }
            j0.O r4 = r4.E()     // Catch:{ all -> 0x0086 }
            if (r4 == 0) goto L_0x00ae
            boolean r7 = r4.e()     // Catch:{ all -> 0x0086 }
            if (r7 == 0) goto L_0x00ae
            java.util.List r5 = g1.C5347p.f23427h     // Catch:{ all -> 0x0086 }
            goto L_0x00af
        L_0x00ae:
            r4 = r3
        L_0x00af:
            XH.N r7 = XH.C16807N.f139792a     // Catch:{ all -> 0x0086 }
            monitor-exit(r6)
            r1.f23385o = r0
            if (r4 == 0) goto L_0x00d5
            java.util.Set r7 = W0.e.a(r4)
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x00d5
            int r8 = r5.size()
            r9 = 0
        L_0x00c8:
            if (r9 >= r8) goto L_0x00d5
            java.lang.Object r10 = r5.get(r9)
            nI.p r10 = (nI.p) r10
            r10.invoke(r7, r1)
            int r9 = r9 + r0
            goto L_0x00c8
        L_0x00d5:
            if (r2 == 0) goto L_0x00f3
            boolean r7 = r2.e()
            if (r7 == 0) goto L_0x00f3
            java.util.Set r7 = W0.e.a(r2)
            int r8 = r5.size()
            r9 = 0
        L_0x00e6:
            if (r9 >= r8) goto L_0x00f3
            java.lang.Object r10 = r5.get(r9)
            nI.p r10 = (nI.p) r10
            r10.invoke(r7, r1)
            int r9 = r9 + r0
            goto L_0x00e6
        L_0x00f3:
            java.lang.Object r5 = g1.C5347p.I()
            monitor-enter(r5)
            r21.r()     // Catch:{ all -> 0x01b6 }
            g1.C5347p.C()     // Catch:{ all -> 0x01b6 }
            r9 = 255(0xff, double:1.26E-321)
            r11 = 7
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r14 = 8
            if (r4 == 0) goto L_0x0153
            java.lang.Object[] r15 = r4.f24576b     // Catch:{ all -> 0x013c }
            long[] r4 = r4.f24575a     // Catch:{ all -> 0x013c }
            int r6 = r4.length     // Catch:{ all -> 0x013c }
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0153
            r3 = 0
        L_0x0114:
            r0 = r4[r3]     // Catch:{ all -> 0x013c }
            long r7 = ~r0     // Catch:{ all -> 0x013c }
            long r7 = r7 << r11
            long r7 = r7 & r0
            long r7 = r7 & r12
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 == 0) goto L_0x014c
            int r7 = r3 - r6
            int r7 = ~r7     // Catch:{ all -> 0x013c }
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = 0
        L_0x0126:
            if (r8 >= r7) goto L_0x0147
            long r19 = r0 & r9
            r17 = 128(0x80, double:6.32E-322)
            int r19 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x0141
            int r19 = r3 << 3
            int r19 = r19 + r8
            r19 = r15[r19]     // Catch:{ all -> 0x013c }
            g1.G r19 = (g1.C5326G) r19     // Catch:{ all -> 0x013c }
            g1.C5347p.U(r19)     // Catch:{ all -> 0x013c }
            goto L_0x0141
        L_0x013c:
            r0 = move-exception
            r1 = r21
            goto L_0x01c1
        L_0x0141:
            long r0 = r0 >> r14
            r16 = 1
            int r8 = r8 + 1
            goto L_0x0126
        L_0x0147:
            r16 = 1
            if (r7 != r14) goto L_0x0153
            goto L_0x014e
        L_0x014c:
            r16 = 1
        L_0x014e:
            if (r3 == r6) goto L_0x0153
            int r3 = r3 + 1
            goto L_0x0114
        L_0x0153:
            if (r2 == 0) goto L_0x019d
            java.lang.Object[] r0 = r2.f24576b     // Catch:{ all -> 0x013c }
            long[] r1 = r2.f24575a     // Catch:{ all -> 0x013c }
            int r2 = r1.length     // Catch:{ all -> 0x013c }
            int r2 = r2 + -2
            if (r2 < 0) goto L_0x019d
            r3 = 0
        L_0x015f:
            r6 = r1[r3]     // Catch:{ all -> 0x013c }
            long r9 = ~r6     // Catch:{ all -> 0x013c }
            long r8 = r9 << r11
            long r8 = r8 & r6
            long r8 = r8 & r12
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x0194
            int r4 = r3 - r2
            int r4 = ~r4     // Catch:{ all -> 0x013c }
            int r4 = r4 >>> 31
            int r4 = 8 - r4
            r8 = 0
        L_0x0172:
            if (r8 >= r4) goto L_0x018c
            r9 = 255(0xff, double:1.26E-321)
            long r19 = r6 & r9
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x0188
            int r15 = r3 << 3
            int r15 = r15 + r8
            r15 = r0[r15]     // Catch:{ all -> 0x013c }
            g1.G r15 = (g1.C5326G) r15     // Catch:{ all -> 0x013c }
            g1.C5347p.U(r15)     // Catch:{ all -> 0x013c }
        L_0x0188:
            long r6 = r6 >> r14
            r15 = 1
            int r8 = r8 + r15
            goto L_0x0172
        L_0x018c:
            r9 = 255(0xff, double:1.26E-321)
            r15 = 1
            r17 = 128(0x80, double:6.32E-322)
            if (r4 != r14) goto L_0x019d
            goto L_0x0199
        L_0x0194:
            r9 = 255(0xff, double:1.26E-321)
            r15 = 1
            r17 = 128(0x80, double:6.32E-322)
        L_0x0199:
            if (r3 == r2) goto L_0x019d
            int r3 = r3 + r15
            goto L_0x015f
        L_0x019d:
            r1 = r21
            java.util.List<? extends g1.G> r0 = r1.f23381k     // Catch:{ all -> 0x01b6 }
            if (r0 == 0) goto L_0x01b8
            int r2 = r0.size()     // Catch:{ all -> 0x01b6 }
            r6 = 0
        L_0x01a8:
            if (r6 >= r2) goto L_0x01b8
            java.lang.Object r3 = r0.get(r6)     // Catch:{ all -> 0x01b6 }
            g1.G r3 = (g1.C5326G) r3     // Catch:{ all -> 0x01b6 }
            g1.C5347p.U(r3)     // Catch:{ all -> 0x01b6 }
            r3 = 1
            int r6 = r6 + r3
            goto L_0x01a8
        L_0x01b6:
            r0 = move-exception
            goto L_0x01c1
        L_0x01b8:
            r0 = 0
            r1.f23381k = r0     // Catch:{ all -> 0x01b6 }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x01b6 }
            monitor-exit(r5)
            g1.l$b r0 = g1.C5343l.b.f23402a
            return r0
        L_0x01c1:
            monitor-exit(r5)
            throw r0
        L_0x01c3:
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C5334c.C():g1.l");
    }

    public final boolean D() {
        return this.f23385o;
    }

    public O<C5326G> E() {
        return this.f23380j;
    }

    public final C5345n F() {
        return this.f23382l;
    }

    public final int[] G() {
        return this.f23383m;
    }

    /* renamed from: H */
    public C17642l<Object, C16807N> h() {
        return this.f23377g;
    }

    public final C5343l I(int i10, Map<C5328I, ? extends C5328I> map, C5345n nVar) {
        O<C5326G> o10;
        List<? extends C5326G> list;
        C5345n nVar2;
        long[] jArr;
        Object[] objArr;
        int i11;
        C5345n nVar3;
        O<C5326G> o11;
        long[] jArr2;
        Object[] objArr2;
        int i12;
        C5328I q10;
        C5328I i13;
        Map<C5328I, ? extends C5328I> map2 = map;
        C5345n A10 = g().B(f()).A(this.f23382l);
        O<C5326G> E10 = E();
        C17542s.g(E10);
        Object[] objArr3 = E10.f24576b;
        long[] jArr3 = E10.f24575a;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        if (length >= 0) {
            list = null;
            int i14 = 0;
            while (true) {
                long j10 = jArr3[i14];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j10 & 255) < 128) {
                            C5326G g10 = (C5326G) objArr3[(i14 << 3) + i17];
                            C5328I m10 = g10.m();
                            o11 = E10;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            C5328I q11 = C5347p.W(m10, i10, nVar);
                            if (q11 == null || (q10 = C5347p.W(m10, f(), A10)) == null) {
                                nVar3 = A10;
                            } else {
                                nVar3 = A10;
                                if (q10.f() != 1 && !C17542s.e(q11, q10)) {
                                    C5328I q12 = C5347p.W(m10, f(), g());
                                    if (q12 != null) {
                                        if (map2 == null || (i13 = (C5328I) map2.get(q11)) == null) {
                                            i13 = g10.i(q10, q11, q12);
                                        }
                                        if (i13 == null) {
                                            return new C5343l.a(this);
                                        }
                                        if (!C17542s.e(i13, q12)) {
                                            if (C17542s.e(i13, q11)) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(C16796C.a(g10, q11.d()));
                                                if (list == null) {
                                                    list = new ArrayList<>();
                                                }
                                                list.add(g10);
                                            } else {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(!C17542s.e(i13, q10) ? C16796C.a(g10, i13) : C16796C.a(g10, q10.d()));
                                            }
                                        }
                                    } else {
                                        Void unused = C5347p.V();
                                        throw new C16820k();
                                    }
                                }
                            }
                            i12 = 8;
                        } else {
                            nVar3 = A10;
                            o11 = E10;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i12 = i15;
                        }
                        j10 >>= i12;
                        i17++;
                        i15 = i12;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        E10 = o11;
                        A10 = nVar3;
                    }
                    nVar2 = A10;
                    o10 = E10;
                    objArr = objArr3;
                    jArr = jArr3;
                    i11 = 1;
                    if (i16 != i15) {
                        break;
                    }
                } else {
                    nVar2 = A10;
                    o10 = E10;
                    objArr = objArr3;
                    jArr = jArr3;
                    i11 = 1;
                }
                if (i14 == length) {
                    break;
                }
                i14 += i11;
                objArr3 = objArr;
                jArr3 = jArr;
                E10 = o10;
                A10 = nVar2;
            }
        } else {
            o10 = E10;
            list = null;
        }
        if (arrayList != null) {
            B();
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                v vVar = (v) arrayList.get(i18);
                C5326G g11 = (C5326G) vVar.a();
                C5328I i19 = (C5328I) vVar.b();
                i19.h(f());
                synchronized (C5347p.I()) {
                    i19.g(g11.m());
                    g11.p(i19);
                    C16807N n10 = C16807N.f139792a;
                }
            }
        }
        if (list != null) {
            int size2 = list.size();
            for (int i20 = 0; i20 < size2; i20++) {
                o10.x((C5326G) list.get(i20));
            }
            List<? extends C5326G> list2 = this.f23381k;
            if (list2 != null) {
                list = C16877v.V0(list2, list);
            }
            this.f23381k = list;
        }
        return C5343l.b.f23402a;
    }

    public final void J(int i10) {
        synchronized (C5347p.I()) {
            this.f23382l = this.f23382l.B(i10);
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final void K(C5345n nVar) {
        synchronized (C5347p.I()) {
            this.f23382l = this.f23382l.A(nVar);
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final void L(int i10) {
        if (i10 >= 0) {
            this.f23383m = C16870n.D(this.f23383m, i10);
        }
    }

    public final void M(int[] iArr) {
        if (iArr.length != 0) {
            int[] iArr2 = this.f23383m;
            if (iArr2.length != 0) {
                iArr = C16870n.E(iArr2, iArr);
            }
            this.f23383m = iArr;
        }
    }

    public final void O(boolean z10) {
        this.f23385o = z10;
    }

    public void P(O<C5326G> o10) {
        this.f23380j = o10;
    }

    public C5334c Q(C17642l<Object, C16807N> lVar, C17642l<Object, C16807N> lVar2) {
        C5335d dVar;
        z();
        S();
        J(f());
        synchronized (C5347p.I()) {
            int i10 = C5347p.f23424e;
            C5347p.f23424e = i10 + 1;
            C5347p.f23423d = C5347p.f23423d.B(i10);
            C5345n g10 = g();
            v(g10.B(i10));
            dVar = new C5335d(i10, C5347p.z(g10, f() + 1, i10), C5347p.L(lVar, h(), false, 4, (Object) null), C5347p.M(lVar2, k()), this);
        }
        if (!D() && !e()) {
            int f10 = f();
            synchronized (C5347p.I()) {
                int i11 = C5347p.f23424e;
                C5347p.f23424e = i11 + 1;
                u(i11);
                C5347p.f23423d = C5347p.f23423d.B(f());
                C16807N n10 = C16807N.f139792a;
            }
            v(C5347p.z(g(), f10 + 1, f()));
        }
        return dVar;
    }

    public void c() {
        C5347p.f23423d = C5347p.f23423d.s(f()).q(this.f23382l);
    }

    public void d() {
        if (!e()) {
            super.d();
            n(this);
        }
    }

    public boolean i() {
        return false;
    }

    public int j() {
        return this.f23379i;
    }

    public C17642l<Object, C16807N> k() {
        return this.f23378h;
    }

    public void m(C5342k kVar) {
        this.f23384n++;
    }

    public void n(C5342k kVar) {
        if (!(this.f23384n > 0)) {
            C0.a("no pending nested snapshots");
        }
        int i10 = this.f23384n - 1;
        this.f23384n = i10;
        if (i10 == 0 && !this.f23385o) {
            A();
        }
    }

    public void o() {
        if (!this.f23385o && !e()) {
            B();
        }
    }

    public void p(C5326G g10) {
        O<C5326G> E10 = E();
        if (E10 == null) {
            E10 = a0.a();
            P(E10);
        }
        E10.h(g10);
    }

    public void r() {
        N();
        super.r();
    }

    public void w(int i10) {
        this.f23379i = i10;
    }

    public C5342k x(C17642l<Object, C16807N> lVar) {
        C5336e eVar;
        z();
        S();
        int f10 = f();
        J(f());
        synchronized (C5347p.I()) {
            int i10 = C5347p.f23424e;
            C5347p.f23424e = i10 + 1;
            C5347p.f23423d = C5347p.f23423d.B(i10);
            eVar = new C5336e(i10, C5347p.z(g(), f10 + 1, i10), C5347p.L(lVar, h(), false, 4, (Object) null), this);
        }
        if (!D() && !e()) {
            int f11 = f();
            synchronized (C5347p.I()) {
                int i11 = C5347p.f23424e;
                C5347p.f23424e = i11 + 1;
                u(i11);
                C5347p.f23423d = C5347p.f23423d.B(f());
                C16807N n10 = C16807N.f139792a;
            }
            v(C5347p.z(g(), f11 + 1, f()));
        }
        return eVar;
    }
}
