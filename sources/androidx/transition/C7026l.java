package androidx.transition;

import I2.C4600b0;
import Y2.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import j0.C5445a;
import j0.C5468y;
import j0.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.transition.l  reason: case insensitive filesystem */
public abstract class C7026l implements Cloneable {

    /* renamed from: M  reason: collision with root package name */
    private static final Animator[] f44690M = new Animator[0];

    /* renamed from: N  reason: collision with root package name */
    private static final int[] f44691N = {2, 1, 3, 4};

    /* renamed from: O  reason: collision with root package name */
    private static final C7020f f44692O = new a();

    /* renamed from: P  reason: collision with root package name */
    private static ThreadLocal<C5445a<Animator, d>> f44693P = new ThreadLocal<>();

    /* renamed from: A  reason: collision with root package name */
    private boolean f44694A = false;

    /* renamed from: B  reason: collision with root package name */
    boolean f44695B = false;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public C7026l f44696C = null;

    /* renamed from: D  reason: collision with root package name */
    private ArrayList<h> f44697D = null;

    /* renamed from: E  reason: collision with root package name */
    ArrayList<Animator> f44698E = new ArrayList<>();

    /* renamed from: F  reason: collision with root package name */
    u f44699F;

    /* renamed from: G  reason: collision with root package name */
    private e f44700G;

    /* renamed from: H  reason: collision with root package name */
    private C5445a<String, String> f44701H;

    /* renamed from: I  reason: collision with root package name */
    private C7020f f44702I = f44692O;

    /* renamed from: J  reason: collision with root package name */
    long f44703J;

    /* renamed from: K  reason: collision with root package name */
    g f44704K;

    /* renamed from: L  reason: collision with root package name */
    long f44705L;

    /* renamed from: a  reason: collision with root package name */
    private String f44706a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    private long f44707b = -1;

    /* renamed from: c  reason: collision with root package name */
    long f44708c = -1;

    /* renamed from: d  reason: collision with root package name */
    private TimeInterpolator f44709d = null;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<Integer> f44710e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    ArrayList<View> f44711f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<String> f44712g = null;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<Class<?>> f44713h = null;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<Integer> f44714i = null;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<View> f44715j = null;

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<Class<?>> f44716k = null;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<String> f44717l = null;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<Integer> f44718m = null;

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<View> f44719n = null;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<Class<?>> f44720o = null;

    /* renamed from: p  reason: collision with root package name */
    private z f44721p = new z();

    /* renamed from: q  reason: collision with root package name */
    private z f44722q = new z();

    /* renamed from: r  reason: collision with root package name */
    w f44723r = null;

    /* renamed from: s  reason: collision with root package name */
    private int[] f44724s = f44691N;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<y> f44725t;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<y> f44726u;

    /* renamed from: v  reason: collision with root package name */
    private h[] f44727v;

    /* renamed from: w  reason: collision with root package name */
    boolean f44728w = false;

    /* renamed from: x  reason: collision with root package name */
    ArrayList<Animator> f44729x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    private Animator[] f44730y = f44690M;

    /* renamed from: z  reason: collision with root package name */
    int f44731z = 0;

    /* renamed from: androidx.transition.l$a */
    class a extends C7020f {
        a() {
        }

        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* renamed from: androidx.transition.l$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5445a f44732a;

        b(C5445a aVar) {
            this.f44732a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f44732a.remove(animator);
            C7026l.this.f44729x.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C7026l.this.f44729x.add(animator);
        }
    }

    /* renamed from: androidx.transition.l$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            C7026l.this.y();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.l$d */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        View f44735a;

        /* renamed from: b  reason: collision with root package name */
        String f44736b;

        /* renamed from: c  reason: collision with root package name */
        y f44737c;

        /* renamed from: d  reason: collision with root package name */
        WindowId f44738d;

        /* renamed from: e  reason: collision with root package name */
        C7026l f44739e;

        /* renamed from: f  reason: collision with root package name */
        Animator f44740f;

        d(View view, String str, C7026l lVar, WindowId windowId, y yVar, Animator animator) {
            this.f44735a = view;
            this.f44736b = str;
            this.f44737c = yVar;
            this.f44738d = windowId;
            this.f44739e = lVar;
            this.f44740f = animator;
        }
    }

    /* renamed from: androidx.transition.l$e */
    public static abstract class e {
        public abstract Rect a(C7026l lVar);
    }

    /* renamed from: androidx.transition.l$f */
    private static class f {
        static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }
    }

    /* renamed from: androidx.transition.l$g */
    class g extends s implements v, b.r {

        /* renamed from: a  reason: collision with root package name */
        private long f44741a = -1;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<H2.a<v>> f44742b = null;

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<H2.a<v>> f44743c = null;

        /* renamed from: d  reason: collision with root package name */
        private boolean f44744d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f44745e;

        /* renamed from: f  reason: collision with root package name */
        private Y2.e f44746f;

        /* renamed from: g  reason: collision with root package name */
        private H2.a<v>[] f44747g = null;

        /* renamed from: h  reason: collision with root package name */
        private final B f44748h = new B();

        /* renamed from: i  reason: collision with root package name */
        private Runnable f44749i;

        g() {
        }

        private void o() {
            ArrayList<H2.a<v>> arrayList = this.f44743c;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = this.f44743c.size();
                if (this.f44747g == null) {
                    this.f44747g = new H2.a[size];
                }
                H2.a<v>[] aVarArr = (H2.a[]) this.f44743c.toArray(this.f44747g);
                this.f44747g = null;
                for (int i10 = 0; i10 < size; i10++) {
                    aVarArr[i10].accept(this);
                    aVarArr[i10] = null;
                }
                this.f44747g = aVarArr;
            }
        }

        private void p() {
            if (this.f44746f == null) {
                this.f44748h.a(AnimationUtils.currentAnimationTimeMillis(), (float) this.f44741a);
                this.f44746f = new Y2.e(new Y2.d());
                Y2.f fVar = new Y2.f();
                fVar.d(1.0f);
                fVar.f(200.0f);
                this.f44746f.v(fVar);
                this.f44746f.m((float) this.f44741a);
                this.f44746f.c(this);
                this.f44746f.n(this.f44748h.b());
                this.f44746f.i((float) (b() + 1));
                this.f44746f.j(-1.0f);
                this.f44746f.k(4.0f);
                this.f44746f.b(new C7027m(this));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(Y2.b bVar, boolean z10, float f10, float f11) {
            if (z10) {
                return;
            }
            if (f10 < 1.0f) {
                long b10 = b();
                C7026l D02 = ((w) C7026l.this).D0(0);
                C7026l a10 = D02.f44696C;
                C7026l unused = D02.f44696C = null;
                C7026l.this.p0(-1, this.f44741a);
                C7026l.this.p0(b10, -1);
                this.f44741a = b10;
                Runnable runnable = this.f44749i;
                if (runnable != null) {
                    runnable.run();
                }
                C7026l.this.f44698E.clear();
                if (a10 != null) {
                    a10.g0(i.f44752b, true);
                    return;
                }
                return;
            }
            C7026l.this.g0(i.f44752b, false);
        }

        public void a(Y2.b bVar, float f10, float f11) {
            long max = Math.max(-1, Math.min(b() + 1, Math.round((double) f10)));
            C7026l.this.p0(max, this.f44741a);
            this.f44741a = max;
            o();
        }

        public long b() {
            return C7026l.this.R();
        }

        public void c() {
            p();
            this.f44746f.s((float) (b() + 1));
        }

        public boolean f() {
            return this.f44744d;
        }

        public void h(long j10) {
            if (this.f44746f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            } else if (j10 != this.f44741a && f()) {
                if (!this.f44745e) {
                    if (j10 != 0 || this.f44741a <= 0) {
                        long b10 = b();
                        if (j10 == b10 && this.f44741a < b10) {
                            j10 = 1 + b10;
                        }
                    } else {
                        j10 = -1;
                    }
                    long j11 = this.f44741a;
                    if (j10 != j11) {
                        C7026l.this.p0(j10, j11);
                        this.f44741a = j10;
                    }
                }
                o();
                this.f44748h.a(AnimationUtils.currentAnimationTimeMillis(), (float) j10);
            }
        }

        public void k(Runnable runnable) {
            this.f44749i = runnable;
            p();
            this.f44746f.s(0.0f);
        }

        public void l(C7026l lVar) {
            this.f44745e = true;
        }

        /* access modifiers changed from: package-private */
        public void q() {
            long j10 = 0;
            if (b() == 0) {
                j10 = 1;
            }
            C7026l.this.p0(j10, this.f44741a);
            this.f44741a = j10;
        }

        public void s() {
            this.f44744d = true;
            ArrayList<H2.a<v>> arrayList = this.f44742b;
            if (arrayList != null) {
                this.f44742b = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(this);
                }
            }
            o();
        }
    }

    /* renamed from: androidx.transition.l$h */
    public interface h {
        void d(C7026l lVar);

        void e(C7026l lVar);

        void g(C7026l lVar);

        void i(C7026l lVar, boolean z10) {
            j(lVar);
        }

        void j(C7026l lVar);

        void l(C7026l lVar);

        void m(C7026l lVar, boolean z10) {
            e(lVar);
        }
    }

    /* renamed from: androidx.transition.l$i */
    interface i {

        /* renamed from: a  reason: collision with root package name */
        public static final i f44751a = new C7028n();

        /* renamed from: b  reason: collision with root package name */
        public static final i f44752b = new C7029o();

        /* renamed from: c  reason: collision with root package name */
        public static final i f44753c = new C7030p();

        /* renamed from: d  reason: collision with root package name */
        public static final i f44754d = new C7031q();

        /* renamed from: e  reason: collision with root package name */
        public static final i f44755e = new r();

        void e(h hVar, C7026l lVar, boolean z10);
    }

    private static C5445a<Animator, d> L() {
        C5445a<Animator, d> aVar = f44693P.get();
        if (aVar != null) {
            return aVar;
        }
        C5445a<Animator, d> aVar2 = new C5445a<>();
        f44693P.set(aVar2);
        return aVar2;
    }

    private static boolean Z(y yVar, y yVar2, String str) {
        Object obj = yVar.f44774a.get(str);
        Object obj2 = yVar2.f44774a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void a0(C5445a<View, y> aVar, C5445a<View, y> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && Y(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && Y(view)) {
                y yVar = aVar.get(valueAt);
                y yVar2 = aVar2.get(view);
                if (!(yVar == null || yVar2 == null)) {
                    this.f44725t.add(yVar);
                    this.f44726u.add(yVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void b0(C5445a<View, y> aVar, C5445a<View, y> aVar2) {
        y remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View h10 = aVar.h(size);
            if (h10 != null && Y(h10) && (remove = aVar2.remove(h10)) != null && Y(remove.f44775b)) {
                this.f44725t.add(aVar.k(size));
                this.f44726u.add(remove);
            }
        }
    }

    private void c0(C5445a<View, y> aVar, C5445a<View, y> aVar2, C5468y<View> yVar, C5468y<View> yVar2) {
        View d10;
        int o10 = yVar.o();
        for (int i10 = 0; i10 < o10; i10++) {
            View p10 = yVar.p(i10);
            if (p10 != null && Y(p10) && (d10 = yVar2.d(yVar.j(i10))) != null && Y(d10)) {
                y yVar3 = aVar.get(p10);
                y yVar4 = aVar2.get(d10);
                if (!(yVar3 == null || yVar4 == null)) {
                    this.f44725t.add(yVar3);
                    this.f44726u.add(yVar4);
                    aVar.remove(p10);
                    aVar2.remove(d10);
                }
            }
        }
    }

    private void d0(C5445a<View, y> aVar, C5445a<View, y> aVar2, C5445a<String, View> aVar3, C5445a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View m10 = aVar3.m(i10);
            if (m10 != null && Y(m10) && (view = aVar4.get(aVar3.h(i10))) != null && Y(view)) {
                y yVar = aVar.get(m10);
                y yVar2 = aVar2.get(view);
                if (!(yVar == null || yVar2 == null)) {
                    this.f44725t.add(yVar);
                    this.f44726u.add(yVar2);
                    aVar.remove(m10);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void e(C5445a<View, y> aVar, C5445a<View, y> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            y m10 = aVar.m(i10);
            if (Y(m10.f44775b)) {
                this.f44725t.add(m10);
                this.f44726u.add((Object) null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            y m11 = aVar2.m(i11);
            if (Y(m11.f44775b)) {
                this.f44726u.add(m11);
                this.f44725t.add((Object) null);
            }
        }
    }

    private void e0(z zVar, z zVar2) {
        C5445a aVar = new C5445a((b0) zVar.f44777a);
        C5445a aVar2 = new C5445a((b0) zVar2.f44777a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f44724s;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 == 1) {
                    b0(aVar, aVar2);
                } else if (i11 == 2) {
                    d0(aVar, aVar2, zVar.f44780d, zVar2.f44780d);
                } else if (i11 == 3) {
                    a0(aVar, aVar2, zVar.f44778b, zVar2.f44778b);
                } else if (i11 == 4) {
                    c0(aVar, aVar2, zVar.f44779c, zVar2.f44779c);
                }
                i10++;
            } else {
                e(aVar, aVar2);
                return;
            }
        }
    }

    private static void f(z zVar, View view, y yVar) {
        zVar.f44777a.put(view, yVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (zVar.f44778b.indexOfKey(id2) >= 0) {
                zVar.f44778b.put(id2, (Object) null);
            } else {
                zVar.f44778b.put(id2, view);
            }
        }
        String I10 = C4600b0.I(view);
        if (I10 != null) {
            if (zVar.f44780d.containsKey(I10)) {
                zVar.f44780d.put(I10, null);
            } else {
                zVar.f44780d.put(I10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (zVar.f44779c.e(itemIdAtPosition) >= 0) {
                    View d10 = zVar.f44779c.d(itemIdAtPosition);
                    if (d10 != null) {
                        d10.setHasTransientState(false);
                        zVar.f44779c.k(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                zVar.f44779c.k(itemIdAtPosition, view);
            }
        }
    }

    private void f0(C7026l lVar, i iVar, boolean z10) {
        C7026l lVar2 = this.f44696C;
        if (lVar2 != null) {
            lVar2.f0(lVar, iVar, z10);
        }
        ArrayList<h> arrayList = this.f44697D;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f44697D.size();
            h[] hVarArr = this.f44727v;
            if (hVarArr == null) {
                hVarArr = new h[size];
            }
            this.f44727v = null;
            h[] hVarArr2 = (h[]) this.f44697D.toArray(hVarArr);
            for (int i10 = 0; i10 < size; i10++) {
                iVar.e(hVarArr2[i10], lVar, z10);
                hVarArr2[i10] = null;
            }
            this.f44727v = hVarArr2;
        }
    }

    private void l(View view, boolean z10) {
        if (view != null) {
            int id2 = view.getId();
            ArrayList<Integer> arrayList = this.f44714i;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
                ArrayList<View> arrayList2 = this.f44715j;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f44716k;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            if (!this.f44716k.get(i10).isInstance(view)) {
                                i10++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        y yVar = new y(view);
                        if (z10) {
                            n(yVar);
                        } else {
                            k(yVar);
                        }
                        yVar.f44776c.add(this);
                        m(yVar);
                        if (z10) {
                            f(this.f44721p, view, yVar);
                        } else {
                            f(this.f44722q, view, yVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f44718m;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                            ArrayList<View> arrayList5 = this.f44719n;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f44720o;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        if (!this.f44720o.get(i11).isInstance(view)) {
                                            i11++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                    l(viewGroup.getChildAt(i12), z10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void n0(Animator animator, C5445a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            j(animator);
        }
    }

    public Rect A() {
        e eVar = this.f44700G;
        if (eVar == null) {
            return null;
        }
        return eVar.a(this);
    }

    public e C() {
        return this.f44700G;
    }

    public TimeInterpolator D() {
        return this.f44709d;
    }

    /* access modifiers changed from: package-private */
    public y E(View view, boolean z10) {
        w wVar = this.f44723r;
        if (wVar != null) {
            return wVar.E(view, z10);
        }
        ArrayList<y> arrayList = z10 ? this.f44725t : this.f44726u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            y yVar = arrayList.get(i10);
            if (yVar == null) {
                return null;
            }
            if (yVar.f44775b == view) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return null;
        }
        return (z10 ? this.f44726u : this.f44725t).get(i10);
    }

    public String G() {
        return this.f44706a;
    }

    public C7020f H() {
        return this.f44702I;
    }

    public u I() {
        return this.f44699F;
    }

    public final C7026l K() {
        w wVar = this.f44723r;
        return wVar != null ? wVar.K() : this;
    }

    public long M() {
        return this.f44707b;
    }

    public List<Integer> N() {
        return this.f44710e;
    }

    public List<String> O() {
        return this.f44712g;
    }

    public List<Class<?>> P() {
        return this.f44713h;
    }

    public List<View> Q() {
        return this.f44711f;
    }

    /* access modifiers changed from: package-private */
    public final long R() {
        return this.f44703J;
    }

    public String[] S() {
        return null;
    }

    public y T(View view, boolean z10) {
        w wVar = this.f44723r;
        if (wVar != null) {
            return wVar.T(view, z10);
        }
        return (z10 ? this.f44721p : this.f44722q).f44777a.get(view);
    }

    /* access modifiers changed from: package-private */
    public boolean V() {
        return !this.f44729x.isEmpty();
    }

    public boolean W() {
        return false;
    }

    public boolean X(y yVar, y yVar2) {
        if (yVar == null || yVar2 == null) {
            return false;
        }
        String[] S10 = S();
        if (S10 != null) {
            int length = S10.length;
            int i10 = 0;
            while (i10 < length) {
                if (!Z(yVar, yVar2, S10[i10])) {
                    i10++;
                }
            }
            return false;
        }
        for (String Z10 : yVar.f44774a.keySet()) {
            if (Z(yVar, yVar2, Z10)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean Y(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f44714i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f44715j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f44716k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f44716k.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f44717l != null && C4600b0.I(view) != null && this.f44717l.contains(C4600b0.I(view))) {
            return false;
        }
        if ((this.f44710e.size() == 0 && this.f44711f.size() == 0 && (((arrayList = this.f44713h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f44712g) == null || arrayList2.isEmpty()))) || this.f44710e.contains(Integer.valueOf(id2)) || this.f44711f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f44712g;
        if (arrayList6 != null && arrayList6.contains(C4600b0.I(view))) {
            return true;
        }
        if (this.f44713h != null) {
            for (int i11 = 0; i11 < this.f44713h.size(); i11++) {
                if (this.f44713h.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C7026l c(h hVar) {
        if (this.f44697D == null) {
            this.f44697D = new ArrayList<>();
        }
        this.f44697D.add(hVar);
        return this;
    }

    /* access modifiers changed from: protected */
    public void cancel() {
        int size = this.f44729x.size();
        Animator[] animatorArr = (Animator[]) this.f44729x.toArray(this.f44730y);
        this.f44730y = f44690M;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f44730y = animatorArr;
        g0(i.f44753c, false);
    }

    public C7026l d(View view) {
        this.f44711f.add(view);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void g0(i iVar, boolean z10) {
        f0(this, iVar, z10);
    }

    public void h0(View view) {
        if (!this.f44695B) {
            int size = this.f44729x.size();
            Animator[] animatorArr = (Animator[]) this.f44729x.toArray(this.f44730y);
            this.f44730y = f44690M;
            for (int i10 = size - 1; i10 >= 0; i10--) {
                Animator animator = animatorArr[i10];
                animatorArr[i10] = null;
                animator.pause();
            }
            this.f44730y = animatorArr;
            g0(i.f44754d, false);
            this.f44694A = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void i0(ViewGroup viewGroup) {
        d dVar;
        this.f44725t = new ArrayList<>();
        this.f44726u = new ArrayList<>();
        e0(this.f44721p, this.f44722q);
        C5445a<Animator, d> L10 = L();
        int size = L10.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator h10 = L10.h(i10);
            if (!(h10 == null || (dVar = L10.get(h10)) == null || dVar.f44735a == null || !windowId.equals(dVar.f44738d))) {
                y yVar = dVar.f44737c;
                View view = dVar.f44735a;
                y T10 = T(view, true);
                y E10 = E(view, true);
                if (T10 == null && E10 == null) {
                    E10 = this.f44722q.f44777a.get(view);
                }
                if (!(T10 == null && E10 == null) && dVar.f44739e.X(yVar, E10)) {
                    C7026l lVar = dVar.f44739e;
                    if (lVar.K().f44704K != null) {
                        h10.cancel();
                        lVar.f44729x.remove(h10);
                        L10.remove(h10);
                        if (lVar.f44729x.size() == 0) {
                            lVar.g0(i.f44753c, false);
                            if (!lVar.f44695B) {
                                lVar.f44695B = true;
                                lVar.g0(i.f44752b, false);
                            }
                        }
                    } else if (h10.isRunning() || h10.isStarted()) {
                        h10.cancel();
                    } else {
                        L10.remove(h10);
                    }
                }
            }
        }
        v(viewGroup, this.f44721p, this.f44722q, this.f44725t, this.f44726u);
        if (this.f44704K == null) {
            o0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            j0();
            this.f44704K.q();
            this.f44704K.s();
        }
    }

    /* access modifiers changed from: protected */
    public void j(Animator animator) {
        if (animator == null) {
            y();
            return;
        }
        if (z() >= 0) {
            animator.setDuration(z());
        }
        if (M() >= 0) {
            animator.setStartDelay(M() + animator.getStartDelay());
        }
        if (D() != null) {
            animator.setInterpolator(D());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* access modifiers changed from: package-private */
    public void j0() {
        C5445a<Animator, d> L10 = L();
        this.f44703J = 0;
        for (int i10 = 0; i10 < this.f44698E.size(); i10++) {
            Animator animator = this.f44698E.get(i10);
            d dVar = L10.get(animator);
            if (!(animator == null || dVar == null)) {
                if (z() >= 0) {
                    dVar.f44740f.setDuration(z());
                }
                if (M() >= 0) {
                    dVar.f44740f.setStartDelay(M() + dVar.f44740f.getStartDelay());
                }
                if (D() != null) {
                    dVar.f44740f.setInterpolator(D());
                }
                this.f44729x.add(animator);
                this.f44703J = Math.max(this.f44703J, f.a(animator));
            }
        }
        this.f44698E.clear();
    }

    public abstract void k(y yVar);

    public C7026l k0(h hVar) {
        C7026l lVar;
        ArrayList<h> arrayList = this.f44697D;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(hVar) && (lVar = this.f44696C) != null) {
            lVar.k0(hVar);
        }
        if (this.f44697D.size() == 0) {
            this.f44697D = null;
        }
        return this;
    }

    public C7026l l0(View view) {
        this.f44711f.remove(view);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void m(y yVar) {
        String[] b10;
        if (this.f44699F != null && !yVar.f44774a.isEmpty() && (b10 = this.f44699F.b()) != null) {
            for (String containsKey : b10) {
                if (!yVar.f44774a.containsKey(containsKey)) {
                    this.f44699F.a(yVar);
                    return;
                }
            }
        }
    }

    public void m0(View view) {
        if (this.f44694A) {
            if (!this.f44695B) {
                int size = this.f44729x.size();
                Animator[] animatorArr = (Animator[]) this.f44729x.toArray(this.f44730y);
                this.f44730y = f44690M;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f44730y = animatorArr;
                g0(i.f44755e, false);
            }
            this.f44694A = false;
        }
    }

    public abstract void n(y yVar);

    /* access modifiers changed from: package-private */
    public void o(ViewGroup viewGroup, boolean z10) {
        C5445a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        p(z10);
        if ((this.f44710e.size() > 0 || this.f44711f.size() > 0) && (((arrayList = this.f44712g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f44713h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f44710e.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f44710e.get(i10).intValue());
                if (findViewById != null) {
                    y yVar = new y(findViewById);
                    if (z10) {
                        n(yVar);
                    } else {
                        k(yVar);
                    }
                    yVar.f44776c.add(this);
                    m(yVar);
                    if (z10) {
                        f(this.f44721p, findViewById, yVar);
                    } else {
                        f(this.f44722q, findViewById, yVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f44711f.size(); i11++) {
                View view = this.f44711f.get(i11);
                y yVar2 = new y(view);
                if (z10) {
                    n(yVar2);
                } else {
                    k(yVar2);
                }
                yVar2.f44776c.add(this);
                m(yVar2);
                if (z10) {
                    f(this.f44721p, view, yVar2);
                } else {
                    f(this.f44722q, view, yVar2);
                }
            }
        } else {
            l(viewGroup, z10);
        }
        if (!z10 && (aVar = this.f44701H) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList3.add(this.f44721p.f44780d.remove(this.f44701H.h(i12)));
            }
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayList3.get(i13);
                if (view2 != null) {
                    this.f44721p.f44780d.put(this.f44701H.m(i13), view2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o0() {
        x0();
        C5445a<Animator, d> L10 = L();
        Iterator<Animator> it = this.f44698E.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (L10.containsKey(next)) {
                x0();
                n0(next, L10);
            }
        }
        this.f44698E.clear();
        y();
    }

    /* access modifiers changed from: package-private */
    public void p(boolean z10) {
        if (z10) {
            this.f44721p.f44777a.clear();
            this.f44721p.f44778b.clear();
            this.f44721p.f44779c.a();
            return;
        }
        this.f44722q.f44777a.clear();
        this.f44722q.f44778b.clear();
        this.f44722q.f44779c.a();
    }

    /* access modifiers changed from: package-private */
    public void p0(long j10, long j11) {
        long j12 = j10;
        long R10 = R();
        int i10 = 0;
        boolean z10 = j12 < j11;
        int i11 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
        if ((i11 < 0 && j12 >= 0) || (j11 > R10 && j12 <= R10)) {
            this.f44695B = false;
            g0(i.f44751a, z10);
        }
        Animator[] animatorArr = (Animator[]) this.f44729x.toArray(this.f44730y);
        this.f44730y = f44690M;
        for (int size = this.f44729x.size(); i10 < size; size = size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            f.b(animator, Math.min(Math.max(0, j12), f.a(animator)));
            i10++;
            i11 = i11;
        }
        int i12 = i11;
        this.f44730y = animatorArr;
        int i13 = (j12 > R10 ? 1 : (j12 == R10 ? 0 : -1));
        if ((i13 > 0 && j11 <= R10) || (j12 < 0 && i12 >= 0)) {
            if (i13 > 0) {
                this.f44695B = true;
            }
            g0(i.f44752b, z10);
        }
    }

    public C7026l q0(long j10) {
        this.f44708c = j10;
        return this;
    }

    /* renamed from: r */
    public C7026l clone() {
        try {
            C7026l lVar = (C7026l) super.clone();
            lVar.f44698E = new ArrayList<>();
            lVar.f44721p = new z();
            lVar.f44722q = new z();
            lVar.f44725t = null;
            lVar.f44726u = null;
            lVar.f44704K = null;
            lVar.f44696C = this;
            lVar.f44697D = null;
            return lVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void r0(e eVar) {
        this.f44700G = eVar;
    }

    public C7026l s0(TimeInterpolator timeInterpolator) {
        this.f44709d = timeInterpolator;
        return this;
    }

    public String toString() {
        return y0("");
    }

    public Animator u(ViewGroup viewGroup, y yVar, y yVar2) {
        return null;
    }

    public void u0(C7020f fVar) {
        if (fVar == null) {
            this.f44702I = f44692O;
        } else {
            this.f44702I = fVar;
        }
    }

    /* access modifiers changed from: package-private */
    public void v(ViewGroup viewGroup, z zVar, z zVar2, ArrayList<y> arrayList, ArrayList<y> arrayList2) {
        int i10;
        int i11;
        Animator u10;
        AnimatorSet animatorSet;
        y yVar;
        View view;
        ViewGroup viewGroup2 = viewGroup;
        C5445a<Animator, d> L10 = L();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z10 = K().f44704K != null;
        long j10 = Long.MAX_VALUE;
        int i12 = 0;
        while (i12 < size) {
            y yVar2 = arrayList.get(i12);
            y yVar3 = arrayList2.get(i12);
            if (yVar2 != null && !yVar2.f44776c.contains(this)) {
                yVar2 = null;
            }
            if (yVar3 != null && !yVar3.f44776c.contains(this)) {
                yVar3 = null;
            }
            if (!(yVar2 == null && yVar3 == null) && ((yVar2 == null || yVar3 == null || X(yVar2, yVar3)) && (u10 = u(viewGroup2, yVar2, yVar3)) != null)) {
                if (yVar3 != null) {
                    view = yVar3.f44775b;
                    String[] S10 = S();
                    Animator animator = u10;
                    if (S10 != null && S10.length > 0) {
                        yVar = new y(view);
                        i11 = size;
                        y yVar4 = zVar2.f44777a.get(view);
                        if (yVar4 != null) {
                            int i13 = 0;
                            while (i13 < S10.length) {
                                Map<String, Object> map = yVar.f44774a;
                                int i14 = i12;
                                String str = S10[i13];
                                map.put(str, yVar4.f44774a.get(str));
                                i13++;
                                i12 = i14;
                                S10 = S10;
                            }
                        }
                        i10 = i12;
                        int size2 = L10.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                break;
                            }
                            d dVar = L10.get(L10.h(i15));
                            if (dVar.f44737c != null && dVar.f44735a == view && dVar.f44736b.equals(G()) && dVar.f44737c.equals(yVar)) {
                                animator = null;
                                break;
                            }
                            i15++;
                        }
                    } else {
                        i11 = size;
                        i10 = i12;
                        yVar = null;
                    }
                    animatorSet = animator;
                } else {
                    i11 = size;
                    i10 = i12;
                    view = yVar2.f44775b;
                    animatorSet = u10;
                    yVar = null;
                }
                if (animatorSet != null) {
                    u uVar = this.f44699F;
                    if (uVar != null) {
                        long c10 = uVar.c(viewGroup2, this, yVar2, yVar3);
                        sparseIntArray.put(this.f44698E.size(), (int) c10);
                        j10 = Math.min(c10, j10);
                    }
                    long j11 = j10;
                    d dVar2 = new d(view, G(), this, viewGroup.getWindowId(), yVar, animatorSet);
                    if (z10) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.play(animatorSet);
                        animatorSet = animatorSet2;
                    }
                    L10.put(animatorSet, dVar2);
                    this.f44698E.add(animatorSet);
                    j10 = j11;
                }
            } else {
                i11 = size;
                i10 = i12;
            }
            i12 = i10 + 1;
            size = i11;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                d dVar3 = L10.get(this.f44698E.get(sparseIntArray.keyAt(i16)));
                dVar3.f44740f.setStartDelay((((long) sparseIntArray.valueAt(i16)) - j10) + dVar3.f44740f.getStartDelay());
            }
        }
    }

    public void v0(u uVar) {
        this.f44699F = uVar;
    }

    /* access modifiers changed from: package-private */
    public v w() {
        g gVar = new g();
        this.f44704K = gVar;
        c(gVar);
        return this.f44704K;
    }

    public C7026l w0(long j10) {
        this.f44707b = j10;
        return this;
    }

    /* access modifiers changed from: protected */
    public void x0() {
        if (this.f44731z == 0) {
            g0(i.f44751a, false);
            this.f44695B = false;
        }
        this.f44731z++;
    }

    /* access modifiers changed from: protected */
    public void y() {
        int i10 = this.f44731z - 1;
        this.f44731z = i10;
        if (i10 == 0) {
            g0(i.f44752b, false);
            for (int i11 = 0; i11 < this.f44721p.f44779c.o(); i11++) {
                View p10 = this.f44721p.f44779c.p(i11);
                if (p10 != null) {
                    p10.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f44722q.f44779c.o(); i12++) {
                View p11 = this.f44722q.f44779c.p(i12);
                if (p11 != null) {
                    p11.setHasTransientState(false);
                }
            }
            this.f44695B = true;
        }
    }

    /* access modifiers changed from: package-private */
    public String y0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f44708c != -1) {
            sb2.append("dur(");
            sb2.append(this.f44708c);
            sb2.append(") ");
        }
        if (this.f44707b != -1) {
            sb2.append("dly(");
            sb2.append(this.f44707b);
            sb2.append(") ");
        }
        if (this.f44709d != null) {
            sb2.append("interp(");
            sb2.append(this.f44709d);
            sb2.append(") ");
        }
        if (this.f44710e.size() > 0 || this.f44711f.size() > 0) {
            sb2.append("tgts(");
            if (this.f44710e.size() > 0) {
                for (int i10 = 0; i10 < this.f44710e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f44710e.get(i10));
                }
            }
            if (this.f44711f.size() > 0) {
                for (int i11 = 0; i11 < this.f44711f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f44711f.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public long z() {
        return this.f44708c;
    }
}
