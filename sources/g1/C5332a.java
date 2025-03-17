package g1;

import XH.C16807N;
import XH.C16820k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0010\u001a\u00020\u00012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\fH\u0010¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, d2 = {"Lg1/a;", "Lg1/c;", "", "id", "Lg1/n;", "invalid", "<init>", "(ILg1/n;)V", "Lkotlin/Function1;", "", "LXH/N;", "readObserver", "Lg1/k;", "x", "(LnI/l;)Lg1/k;", "writeObserver", "Q", "(LnI/l;LnI/l;)Lg1/c;", "o", "()V", "snapshot", "", "U", "(Lg1/k;)Ljava/lang/Void;", "T", "Lg1/l;", "C", "()Lg1/l;", "d", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.a  reason: case insensitive filesystem */
public final class C5332a extends C5334c {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "LXH/N;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g1.a$a  reason: collision with other inner class name */
    static final class C0379a extends C17544u implements C17642l<Object, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<C17642l<Object, C16807N>> f23370c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0379a(List<? extends C17642l<Object, C16807N>> list) {
            super(1);
            this.f23370c = list;
        }

        public final void a(Object obj) {
            List<C17642l<Object, C16807N>> list = this.f23370c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).invoke(obj);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/n;", "invalid", "Lg1/c;", "a", "(Lg1/n;)Lg1/c;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g1.a$b */
    static final class b extends C17544u implements C17642l<C5345n, C5334c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Object, C16807N> f23371c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Object, C16807N> f23372d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C17642l<Object, C16807N> lVar, C17642l<Object, C16807N> lVar2) {
            super(1);
            this.f23371c = lVar;
            this.f23372d = lVar2;
        }

        /* renamed from: a */
        public final C5334c invoke(C5345n nVar) {
            int i10;
            synchronized (C5347p.I()) {
                i10 = C5347p.f23424e;
                C5347p.f23424e = i10 + 1;
            }
            return new C5334c(i10, nVar, this.f23371c, this.f23372d);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg1/n;", "invalid", "Lg1/h;", "a", "(Lg1/n;)Lg1/h;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g1.a$c */
    static final class c extends C17544u implements C17642l<C5345n, C5339h> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Object, C16807N> f23373c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C17642l<Object, C16807N> lVar) {
            super(1);
            this.f23373c = lVar;
        }

        /* renamed from: a */
        public final C5339h invoke(C5345n nVar) {
            int i10;
            synchronized (C5347p.I()) {
                i10 = C5347p.f23424e;
                C5347p.f23424e = i10 + 1;
            }
            return new C5339h(i10, nVar, this.f23373c);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5332a(int r4, g1.C5345n r5) {
        /*
            r3 = this;
            java.lang.Object r0 = g1.C5347p.I()
            monitor-enter(r0)
            java.util.List r1 = g1.C5347p.f23428i     // Catch:{ all -> 0x0017 }
            java.lang.Object r2 = YH.C16877v.d1(r1)     // Catch:{ all -> 0x0017 }
            nI.l r2 = (nI.C17642l) r2     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x0019
            g1.a$a r2 = new g1.a$a     // Catch:{ all -> 0x0017 }
            r2.<init>(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x0019
        L_0x0017:
            r4 = move-exception
            goto L_0x001f
        L_0x0019:
            monitor-exit(r0)
            r0 = 0
            r3.<init>(r4, r5, r0, r2)
            return
        L_0x001f:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C5332a.<init>(int, g1.n):void");
    }

    public C5343l C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    public C5334c Q(C17642l<Object, C16807N> lVar, C17642l<Object, C16807N> lVar2) {
        return (C5334c) C5347p.b0(new b(lVar, lVar2));
    }

    /* renamed from: T */
    public Void m(C5342k kVar) {
        C5356y.b();
        throw new C16820k();
    }

    /* renamed from: U */
    public Void n(C5342k kVar) {
        C5356y.b();
        throw new C16820k();
    }

    public void d() {
        synchronized (C5347p.I()) {
            q();
            C16807N n10 = C16807N.f139792a;
        }
    }

    public void o() {
        C5347p.B();
    }

    public C5342k x(C17642l<Object, C16807N> lVar) {
        return C5347p.b0(new c(lVar));
    }
}
