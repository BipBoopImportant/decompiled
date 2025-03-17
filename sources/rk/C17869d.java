package rK;

import A1.B;
import A1.C4349p;
import A1.C4352t;
import A1.C4353u;
import XH.t;
import android.view.KeyEvent;
import c2.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.saket.telephoto.zoomable.g;
import o1.C5667g;
import y1.C6253a;
import y1.C6256d;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n*\u00020\tH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"LrK/d;", "Lme/saket/telephoto/zoomable/g;", "<init>", "()V", "Ly1/b;", "", "e", "(Landroid/view/KeyEvent;)Z", "f", "LA1/p;", "Lo1/g;", "c", "(LA1/p;)J", "d", "event", "Lme/saket/telephoto/zoomable/g$b;", "b", "(Landroid/view/KeyEvent;)Lme/saket/telephoto/zoomable/g$b;", "a", "(LA1/p;)Lme/saket/telephoto/zoomable/g$b;", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rK.d  reason: case insensitive filesystem */
public final class C17869d implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final C17869d f146745b = new C17869d();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rK.d$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f146746a = new int[g.b.c.values().length];

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f146747b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0019 */
        static {
            /*
                me.saket.telephoto.zoomable.g$b$c[] r0 = me.saket.telephoto.zoomable.g.b.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f146746a = r0
                rK.p[] r0 = rK.p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                rK.p r1 = rK.p.Android     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                rK.p r1 = rK.p.Desktop     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f146747b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rK.C17869d.a.<clinit>():void");
        }
    }

    private C17869d() {
    }

    private final long c(C4349p pVar) {
        List<B> c10 = pVar.c();
        C5667g d10 = C5667g.d(C5667g.f26701b.c());
        int size = c10.size();
        for (int i10 = 0; i10 < size; i10++) {
            d10 = C5667g.d(C5667g.r(d10.v(), c10.get(i10).m()));
        }
        return d10.v();
    }

    private final long d(C4349p pVar) {
        if (C4352t.i(pVar.g(), C4352t.f4431a.f())) {
            long c10 = C5667g.f26701b.c();
            List<B> c11 = pVar.c();
            int size = c11.size();
            float f10 = 0.0f;
            for (int i10 = 0; i10 < size; i10++) {
                c10 = C5667g.r(c10, c11.get(i10).h());
                f10 += 1.0f;
            }
            return f10 == 0.0f ? C5667g.f26701b.b() : C5667g.h(c10, f10);
        }
        throw new IllegalStateException("Check failed.");
    }

    private final boolean e(KeyEvent keyEvent) {
        boolean z10;
        if (C6253a.t(C6256d.a(keyEvent), C6253a.f32108b.h())) {
            int i10 = a.f146747b[s.a(p.Companion).ordinal()];
            if (i10 == 1) {
                z10 = C6256d.e(keyEvent);
            } else if (i10 == 2) {
                z10 = C6256d.f(keyEvent);
            } else {
                throw new t();
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    private final boolean f(KeyEvent keyEvent) {
        boolean z10;
        if (C6253a.t(C6256d.a(keyEvent), C6253a.f32108b.j())) {
            int i10 = a.f146747b[s.a(p.Companion).ordinal()];
            if (i10 == 1) {
                z10 = C6256d.e(keyEvent);
            } else if (i10 == 2) {
                z10 = C6256d.f(keyEvent);
            } else {
                throw new t();
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public g.b a(C4349p pVar) {
        float n10;
        int i10;
        C17542s.j(pVar, "event");
        if (!C4353u.b(pVar.e()) || n10 == 0.0f) {
            return null;
        }
        return new g.b.d(i10 < 0 ? g.b.e.In : g.b.e.Out, Math.abs((n10 = C5667g.n(c(pVar)))) * 1.2f, d(pVar), (DefaultConstructorMarker) null);
    }

    public g.b b(KeyEvent keyEvent) {
        C17542s.j(keyEvent, "event");
        long a10 = C6256d.a(keyEvent);
        C6253a.C0496a aVar = C6253a.f32108b;
        if (C6253a.t(a10, aVar.o()) || e(keyEvent)) {
            return new g.b.d(g.b.e.In, 0.0f, 0, 6, (DefaultConstructorMarker) null);
        }
        if (C6253a.t(C6256d.a(keyEvent), aVar.p()) || f(keyEvent)) {
            return new g.b.d(g.b.e.Out, 0.0f, 0, 6, (DefaultConstructorMarker) null);
        }
        long a11 = C6256d.a(keyEvent);
        g.b.c cVar = C6253a.t(a11, aVar.f()) ? g.b.c.Up : C6253a.t(a11, aVar.c()) ? g.b.c.Down : C6253a.t(a11, aVar.d()) ? g.b.c.Left : C6253a.t(a11, aVar.e()) ? g.b.c.Right : null;
        if ((cVar == null ? -1 : a.f146746a[cVar.ordinal()]) == -1) {
            return null;
        }
        return new g.b.C3527b(cVar, h.B(g.b.f144595a.a() * (C6256d.d(keyEvent) ? 10.0f : 1.0f)), (DefaultConstructorMarker) null);
    }
}
