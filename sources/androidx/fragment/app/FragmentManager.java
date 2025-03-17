package androidx.fragment.app;

import I2.B;
import I2.C4640w;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C4987b;
import androidx.activity.v;
import androidx.activity.w;
import androidx.core.app.x;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.Q;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import c3.b;
import g.C5312a;
import g.C5313b;
import g.C5314c;
import g.C5318g;
import h.C5403a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import u2.C6014c;

public abstract class FragmentManager {

    /* renamed from: U  reason: collision with root package name */
    private static boolean f21806U = false;

    /* renamed from: V  reason: collision with root package name */
    static boolean f21807V = true;

    /* renamed from: A  reason: collision with root package name */
    C5187o f21808A;

    /* renamed from: B  reason: collision with root package name */
    private C5195x f21809B = null;

    /* renamed from: C  reason: collision with root package name */
    private C5195x f21810C = new d();

    /* renamed from: D  reason: collision with root package name */
    private b0 f21811D = null;

    /* renamed from: E  reason: collision with root package name */
    private b0 f21812E = new e();

    /* renamed from: F  reason: collision with root package name */
    private C5314c<Intent> f21813F;

    /* renamed from: G  reason: collision with root package name */
    private C5314c<C5318g> f21814G;

    /* renamed from: H  reason: collision with root package name */
    private C5314c<String[]> f21815H;

    /* renamed from: I  reason: collision with root package name */
    ArrayDeque<n> f21816I = new ArrayDeque<>();

    /* renamed from: J  reason: collision with root package name */
    private boolean f21817J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f21818K;

    /* renamed from: L  reason: collision with root package name */
    private boolean f21819L;

    /* renamed from: M  reason: collision with root package name */
    private boolean f21820M;

    /* renamed from: N  reason: collision with root package name */
    private boolean f21821N;

    /* renamed from: O  reason: collision with root package name */
    private ArrayList<C5173a> f21822O;

    /* renamed from: P  reason: collision with root package name */
    private ArrayList<Boolean> f21823P;

    /* renamed from: Q  reason: collision with root package name */
    private ArrayList<C5187o> f21824Q;

    /* renamed from: R  reason: collision with root package name */
    private K f21825R;

    /* renamed from: S  reason: collision with root package name */
    private b.c f21826S;

    /* renamed from: T  reason: collision with root package name */
    private Runnable f21827T = new f();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<q> f21828a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f21829b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final P f21830c = new P();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<C5173a> f21831d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<C5187o> f21832e;

    /* renamed from: f  reason: collision with root package name */
    private final A f21833f = new A(this);

    /* renamed from: g  reason: collision with root package name */
    private w f21834g;

    /* renamed from: h  reason: collision with root package name */
    C5173a f21835h = null;

    /* renamed from: i  reason: collision with root package name */
    boolean f21836i = false;

    /* renamed from: j  reason: collision with root package name */
    private final v f21837j = new b(false);

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f21838k = new AtomicInteger();

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, C5175c> f21839l = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Map<String, Bundle> f21840m = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Map<String, o> f21841n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o  reason: collision with root package name */
    ArrayList<p> f21842o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    private final B f21843p = new B(this);

    /* renamed from: q  reason: collision with root package name */
    private final CopyOnWriteArrayList<L> f21844q = new CopyOnWriteArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private final H2.a<Configuration> f21845r = new C(this);

    /* renamed from: s  reason: collision with root package name */
    private final H2.a<Integer> f21846s = new D(this);

    /* renamed from: t  reason: collision with root package name */
    private final H2.a<androidx.core.app.k> f21847t = new E(this);

    /* renamed from: u  reason: collision with root package name */
    private final H2.a<x> f21848u = new F(this);

    /* renamed from: v  reason: collision with root package name */
    private final B f21849v = new c();

    /* renamed from: w  reason: collision with root package name */
    int f21850w = -1;

    /* renamed from: x  reason: collision with root package name */
    private FragmentHostCallback<?> f21851x;

    /* renamed from: y  reason: collision with root package name */
    private C5193v f21852y;

    /* renamed from: z  reason: collision with root package name */
    private C5187o f21853z;

    class a implements C5313b<Map<String, Boolean>> {
        a() {
        }

        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            n pollFirst = FragmentManager.this.f21816I.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f21868a;
            int i11 = pollFirst.f21869b;
            C5187o i12 = FragmentManager.this.f21830c.i(str);
            if (i12 == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            i12.onRequestPermissionsResult(i11, strArr, iArr);
        }
    }

    class b extends v {
        b(boolean z10) {
            super(z10);
        }

        public void handleOnBackCancelled() {
            if (FragmentManager.U0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + FragmentManager.f21807V + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.f21807V) {
                FragmentManager.this.t();
            }
        }

        public void handleOnBackPressed() {
            if (FragmentManager.U0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + FragmentManager.f21807V + " fragment manager " + FragmentManager.this);
            }
            FragmentManager.this.Q0();
        }

        public void handleOnBackProgressed(C4987b bVar) {
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + FragmentManager.f21807V + " fragment manager " + FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.f21835h != null) {
                for (a0 A10 : fragmentManager.B(new ArrayList(Collections.singletonList(FragmentManager.this.f21835h)), 0, 1)) {
                    A10.A(bVar);
                }
                Iterator<p> it = FragmentManager.this.f21842o.iterator();
                while (it.hasNext()) {
                    it.next().e(bVar);
                }
            }
        }

        public void handleOnBackStarted(C4987b bVar) {
            if (FragmentManager.U0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + FragmentManager.f21807V + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.f21807V) {
                FragmentManager.this.e0();
                FragmentManager.this.y1();
            }
        }
    }

    class c implements B {
        c() {
        }

        public void g(Menu menu) {
            FragmentManager.this.R(menu);
        }

        public void i(Menu menu) {
            FragmentManager.this.V(menu);
        }

        public boolean k(MenuItem menuItem) {
            return FragmentManager.this.Q(menuItem);
        }

        public void o(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.J(menu, menuInflater);
        }
    }

    class d extends C5195x {
        d() {
        }

        public C5187o instantiate(ClassLoader classLoader, String str) {
            return FragmentManager.this.H0().b(FragmentManager.this.H0().f(), str, (Bundle) null);
        }
    }

    class e implements b0 {
        e() {
        }

        public a0 a(ViewGroup viewGroup) {
            return new DefaultSpecialEffectsController(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        public void run() {
            FragmentManager.this.h0(true);
        }
    }

    class g implements C5218v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f21860a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ M f21861b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.r f21862c;

        g(String str, M m10, androidx.lifecycle.r rVar) {
            this.f21860a = str;
            this.f21861b = m10;
            this.f21862c = rVar;
        }

        public void e(C5221y yVar, r.a aVar) {
            Bundle bundle;
            if (aVar == r.a.ON_START && (bundle = (Bundle) FragmentManager.this.f21840m.get(this.f21860a)) != null) {
                this.f21861b.a(this.f21860a, bundle);
                FragmentManager.this.y(this.f21860a);
            }
            if (aVar == r.a.ON_DESTROY) {
                this.f21862c.g(this);
                FragmentManager.this.f21841n.remove(this.f21860a);
            }
        }
    }

    class h implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5187o f21864a;

        h(C5187o oVar) {
            this.f21864a = oVar;
        }

        public void a(FragmentManager fragmentManager, C5187o oVar) {
            this.f21864a.onAttachFragment(oVar);
        }
    }

    class i implements C5313b<C5312a> {
        i() {
        }

        /* renamed from: b */
        public void a(C5312a aVar) {
            n pollLast = FragmentManager.this.f21816I.pollLast();
            if (pollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollLast.f21868a;
            int i10 = pollLast.f21869b;
            C5187o i11 = FragmentManager.this.f21830c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i11.onActivityResult(i10, aVar.b(), aVar.a());
        }
    }

    class j implements C5313b<C5312a> {
        j() {
        }

        /* renamed from: b */
        public void a(C5312a aVar) {
            n pollFirst = FragmentManager.this.f21816I.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f21868a;
            int i10 = pollFirst.f21869b;
            C5187o i11 = FragmentManager.this.f21830c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i11.onActivityResult(i10, aVar.b(), aVar.a());
        }
    }

    public interface k {
        String getName();
    }

    static class l extends C5403a<C5318g, C5312a> {
        l() {
        }

        /* renamed from: a */
        public Intent createIntent(Context context, C5318g gVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a10 = gVar.a();
            if (!(a10 == null || (bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    gVar = new C5318g.a(gVar.d()).b((Intent) null).c(gVar.c(), gVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: b */
        public C5312a parseResult(int i10, Intent intent) {
            return new C5312a(i10, intent);
        }
    }

    public static abstract class m {
        @Deprecated
        public void onFragmentActivityCreated(FragmentManager fragmentManager, C5187o oVar, Bundle bundle) {
        }

        public void onFragmentAttached(FragmentManager fragmentManager, C5187o oVar, Context context) {
        }

        public void onFragmentCreated(FragmentManager fragmentManager, C5187o oVar, Bundle bundle) {
        }

        public void onFragmentDestroyed(FragmentManager fragmentManager, C5187o oVar) {
        }

        public void onFragmentDetached(FragmentManager fragmentManager, C5187o oVar) {
        }

        public void onFragmentPaused(FragmentManager fragmentManager, C5187o oVar) {
        }

        public void onFragmentPreAttached(FragmentManager fragmentManager, C5187o oVar, Context context) {
        }

        public void onFragmentPreCreated(FragmentManager fragmentManager, C5187o oVar, Bundle bundle) {
        }

        public void onFragmentResumed(FragmentManager fragmentManager, C5187o oVar) {
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager, C5187o oVar, Bundle bundle) {
        }

        public void onFragmentStarted(FragmentManager fragmentManager, C5187o oVar) {
        }

        public void onFragmentStopped(FragmentManager fragmentManager, C5187o oVar) {
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, C5187o oVar, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, C5187o oVar) {
        }
    }

    private static class o implements M {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.lifecycle.r f21870a;

        /* renamed from: b  reason: collision with root package name */
        private final M f21871b;

        /* renamed from: c  reason: collision with root package name */
        private final C5218v f21872c;

        o(androidx.lifecycle.r rVar, M m10, C5218v vVar) {
            this.f21870a = rVar;
            this.f21871b = m10;
            this.f21872c = vVar;
        }

        public void a(String str, Bundle bundle) {
            this.f21871b.a(str, bundle);
        }

        public boolean b(r.b bVar) {
            return this.f21870a.d().b(bVar);
        }

        public void c() {
            this.f21870a.g(this.f21872c);
        }
    }

    public interface p {
        void e(C4987b bVar) {
        }

        void g(C5187o oVar, boolean z10) {
        }

        void i(C5187o oVar, boolean z10) {
        }

        void l0() {
        }

        void n0();
    }

    interface q {
        boolean a(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class r implements q {

        /* renamed from: a  reason: collision with root package name */
        final String f21873a;

        /* renamed from: b  reason: collision with root package name */
        final int f21874b;

        /* renamed from: c  reason: collision with root package name */
        final int f21875c;

        r(String str, int i10, int i11) {
            this.f21873a = str;
            this.f21874b = i10;
            this.f21875c = i11;
        }

        public boolean a(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2) {
            C5187o oVar = FragmentManager.this.f21808A;
            if (oVar != null && this.f21874b < 0 && this.f21873a == null && oVar.getChildFragmentManager().s1()) {
                return false;
            }
            return FragmentManager.this.w1(arrayList, arrayList2, this.f21873a, this.f21874b, this.f21875c);
        }
    }

    class s implements q {
        s() {
        }

        public boolean a(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2) {
            boolean x12 = FragmentManager.this.x1(arrayList, arrayList2);
            if (!FragmentManager.this.f21842o.isEmpty() && arrayList.size() > 0) {
                boolean booleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet<C5187o> linkedHashSet = new LinkedHashSet<>();
                Iterator<C5173a> it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.this.v0(it.next()));
                }
                Iterator<p> it2 = FragmentManager.this.f21842o.iterator();
                while (it2.hasNext()) {
                    p next = it2.next();
                    for (C5187o i10 : linkedHashSet) {
                        next.i(i10, booleanValue);
                    }
                }
            }
            return x12;
        }
    }

    private class t implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f21878a;

        t(String str) {
            this.f21878a = str;
        }

        public boolean a(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.G1(arrayList, arrayList2, this.f21878a);
        }
    }

    private class u implements q {

        /* renamed from: a  reason: collision with root package name */
        private final String f21880a;

        u(String str) {
            this.f21880a = str;
        }

        public boolean a(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.L1(arrayList, arrayList2, this.f21880a);
        }
    }

    private Set<a0> A() {
        HashSet hashSet = new HashSet();
        for (O k10 : this.f21830c.k()) {
            ViewGroup viewGroup = k10.k().mContainer;
            if (viewGroup != null) {
                hashSet.add(a0.v(viewGroup, M0()));
            }
        }
        return hashSet;
    }

    private K A0(C5187o oVar) {
        return this.f21825R.D(oVar);
    }

    private void C1(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!arrayList.get(i10).f21944r) {
                        if (i11 != i10) {
                            k0(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (arrayList2.get(i10).booleanValue()) {
                            while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f21944r) {
                                i11++;
                            }
                        }
                        k0(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    k0(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private ViewGroup D0(C5187o oVar) {
        ViewGroup viewGroup = oVar.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (oVar.mContainerId > 0 && this.f21852y.d()) {
            View c10 = this.f21852y.c(oVar.mContainerId);
            if (c10 instanceof ViewGroup) {
                return (ViewGroup) c10;
            }
        }
        return null;
    }

    private void E1() {
        for (int i10 = 0; i10 < this.f21842o.size(); i10++) {
            this.f21842o.get(i10).n0();
        }
    }

    static int I1(int i10) {
        int i11 = 4097;
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 8194) {
            i11 = 8197;
            if (i10 == 8197) {
                return 4100;
            }
            if (i10 == 4099) {
                return 4099;
            }
            if (i10 != 4100) {
                return 0;
            }
        }
        return i11;
    }

    static C5187o O0(View view) {
        Object tag = view.getTag(b3.b.f22951a);
        if (tag instanceof C5187o) {
            return (C5187o) tag;
        }
        return null;
    }

    private void S(C5187o oVar) {
        if (oVar != null && oVar.equals(m0(oVar.mWho))) {
            oVar.performPrimaryNavigationFragmentChanged();
        }
    }

    public static boolean U0(int i10) {
        return f21806U || Log.isLoggable("FragmentManager", i10);
    }

    private void U1(C5187o oVar) {
        ViewGroup D02 = D0(oVar);
        if (D02 != null && oVar.getEnterAnim() + oVar.getExitAnim() + oVar.getPopEnterAnim() + oVar.getPopExitAnim() > 0) {
            if (D02.getTag(b3.b.f22953c) == null) {
                D02.setTag(b3.b.f22953c, oVar);
            }
            ((C5187o) D02.getTag(b3.b.f22953c)).setPopDirection(oVar.getPopDirection());
        }
    }

    private boolean V0(C5187o oVar) {
        return (oVar.mHasMenu && oVar.mMenuVisible) || oVar.mChildFragmentManager.u();
    }

    private boolean W0() {
        C5187o oVar = this.f21853z;
        if (oVar == null) {
            return true;
        }
        return oVar.isAdded() && this.f21853z.getParentFragmentManager().W0();
    }

    private void W1() {
        for (O o12 : this.f21830c.k()) {
            o1(o12);
        }
    }

    private void X1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new X("FragmentManager"));
        FragmentHostCallback<?> fragmentHostCallback = this.f21851x;
        if (fragmentHostCallback != null) {
            try {
                fragmentHostCallback.i("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
            }
        } else {
            try {
                d0("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e11) {
                Log.e("FragmentManager", "Failed dumping state", e11);
            }
        }
        throw runtimeException;
    }

    /* JADX INFO: finally extract failed */
    private void Z(int i10) {
        try {
            this.f21829b = true;
            this.f21830c.d(i10);
            l1(i10, false);
            for (a0 q10 : A()) {
                q10.q();
            }
            this.f21829b = false;
            h0(true);
        } catch (Throwable th2) {
            this.f21829b = false;
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (z0() <= 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (Z0(r4.f21853z) == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (U0(3) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        android.util.Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + r4 + " enabled state is " + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        r4.f21837j.setEnabled(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void Z1() {
        /*
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$q> r0 = r4.f21828a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$q> r1 = r4.f21828a     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0034 }
            r2 = 3
            r3 = 1
            if (r1 != 0) goto L_0x0038
            androidx.activity.v r1 = r4.f21837j     // Catch:{ all -> 0x0034 }
            r1.setEnabled(r3)     // Catch:{ all -> 0x0034 }
            boolean r1 = U0(r2)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0036
            java.lang.String r1 = "FragmentManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0034 }
            r2.<init>()     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "FragmentManager "
            r2.append(r3)     // Catch:{ all -> 0x0034 }
            r2.append(r4)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = " enabling OnBackPressedCallback, caused by non-empty pending actions"
            r2.append(r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0034 }
            android.util.Log.d(r1, r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0036
        L_0x0034:
            r1 = move-exception
            goto L_0x0073
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            int r0 = r4.z0()
            if (r0 <= 0) goto L_0x0048
            androidx.fragment.app.o r0 = r4.f21853z
            boolean r0 = r4.Z0(r0)
            if (r0 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            boolean r0 = U0(r2)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OnBackPressedCallback for FragmentManager "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " enabled state is "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L_0x006d:
            androidx.activity.v r0 = r4.f21837j
            r0.setEnabled(r3)
            return
        L_0x0073:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.Z1():void");
    }

    private void c0() {
        if (this.f21821N) {
            this.f21821N = false;
            W1();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d1() {
        Iterator<p> it = this.f21842o.iterator();
        while (it.hasNext()) {
            it.next().l0();
        }
    }

    /* access modifiers changed from: private */
    public void e0() {
        for (a0 q10 : A()) {
            q10.q();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e1(Configuration configuration) {
        if (W0()) {
            G(configuration, false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f1(Integer num) {
        if (W0() && num.intValue() == 80) {
            M(false);
        }
    }

    private void g0(boolean z10) {
        if (this.f21829b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f21851x == null) {
            if (this.f21820M) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f21851x.h().getLooper()) {
            if (!z10) {
                v();
            }
            if (this.f21822O == null) {
                this.f21822O = new ArrayList<>();
                this.f21823P = new ArrayList<>();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g1(androidx.core.app.k kVar) {
        if (W0()) {
            N(kVar.a(), false);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h1(x xVar) {
        if (W0()) {
            U(xVar.a(), false);
        }
    }

    private static void j0(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C5173a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.C(-1);
                aVar.I();
            } else {
                aVar.C(1);
                aVar.H();
            }
            i10++;
        }
    }

    private void k0(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        boolean z10 = arrayList.get(i10).f21944r;
        ArrayList<C5187o> arrayList3 = this.f21824Q;
        if (arrayList3 == null) {
            this.f21824Q = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.f21824Q.addAll(this.f21830c.o());
        C5187o L02 = L0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C5173a aVar = arrayList.get(i12);
            L02 = !arrayList2.get(i12).booleanValue() ? aVar.J(this.f21824Q, L02) : aVar.L(this.f21824Q, L02);
            z11 = z11 || aVar.f21935i;
        }
        this.f21824Q.clear();
        if (!z10 && this.f21850w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator<Q.a> it = arrayList.get(i13).f21929c.iterator();
                while (it.hasNext()) {
                    C5187o oVar = it.next().f21947b;
                    if (!(oVar == null || oVar.mFragmentManager == null)) {
                        this.f21830c.r(C(oVar));
                    }
                }
            }
        }
        j0(arrayList, arrayList2, i10, i11);
        boolean booleanValue = arrayList2.get(i11 - 1).booleanValue();
        if (z11 && !this.f21842o.isEmpty()) {
            LinkedHashSet<C5187o> linkedHashSet = new LinkedHashSet<>();
            Iterator<C5173a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(v0(it2.next()));
            }
            if (this.f21835h == null) {
                Iterator<p> it3 = this.f21842o.iterator();
                while (it3.hasNext()) {
                    p next = it3.next();
                    for (C5187o i14 : linkedHashSet) {
                        next.i(i14, booleanValue);
                    }
                }
                Iterator<p> it4 = this.f21842o.iterator();
                while (it4.hasNext()) {
                    p next2 = it4.next();
                    for (C5187o g10 : linkedHashSet) {
                        next2.g(g10, booleanValue);
                    }
                }
            }
        }
        for (int i15 = i10; i15 < i11; i15++) {
            C5173a aVar2 = arrayList.get(i15);
            if (booleanValue) {
                for (int size = aVar2.f21929c.size() - 1; size >= 0; size--) {
                    C5187o oVar2 = aVar2.f21929c.get(size).f21947b;
                    if (oVar2 != null) {
                        C(oVar2).m();
                    }
                }
            } else {
                Iterator<Q.a> it5 = aVar2.f21929c.iterator();
                while (it5.hasNext()) {
                    C5187o oVar3 = it5.next().f21947b;
                    if (oVar3 != null) {
                        C(oVar3).m();
                    }
                }
            }
        }
        l1(this.f21850w, true);
        for (a0 next3 : B(arrayList, i10, i11)) {
            next3.D(booleanValue);
            next3.z();
            next3.n();
        }
        while (i10 < i11) {
            C5173a aVar3 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && aVar3.f21996v >= 0) {
                aVar3.f21996v = -1;
            }
            aVar3.K();
            i10++;
        }
        if (z11) {
            E1();
        }
    }

    private int n0(String str, int i10, boolean z10) {
        if (this.f21831d.isEmpty()) {
            return -1;
        }
        if (str != null || i10 >= 0) {
            int size = this.f21831d.size() - 1;
            while (size >= 0) {
                C5173a aVar = this.f21831d.get(size);
                if ((str != null && str.equals(aVar.getName())) || (i10 >= 0 && i10 == aVar.f21996v)) {
                    break;
                }
                size--;
            }
            if (size < 0) {
                return size;
            }
            if (z10) {
                while (size > 0) {
                    C5173a aVar2 = this.f21831d.get(size - 1);
                    if ((str == null || !str.equals(aVar2.getName())) && (i10 < 0 || i10 != aVar2.f21996v)) {
                        return size;
                    }
                    size--;
                }
                return size;
            } else if (size == this.f21831d.size() - 1) {
                return -1;
            } else {
                return size + 1;
            }
        } else if (z10) {
            return 0;
        } else {
            return this.f21831d.size() - 1;
        }
    }

    public static <F extends C5187o> F o0(View view) {
        F t02 = t0(view);
        if (t02 != null) {
            return t02;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    public static FragmentManager s0(View view) {
        C5191t tVar;
        C5187o t02 = t0(view);
        if (t02 == null) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    tVar = null;
                    break;
                } else if (context instanceof C5191t) {
                    tVar = (C5191t) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (tVar != null) {
                return tVar.getSupportFragmentManager();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (t02.isAdded()) {
            return t02.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + t02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    static C5187o t0(View view) {
        while (view != null) {
            C5187o O02 = O0(view);
            if (O02 != null) {
                return O02;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void u0() {
        for (a0 r10 : A()) {
            r10.r();
        }
    }

    private void v() {
        if (b1()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private boolean v1(String str, int i10, int i11) {
        h0(false);
        g0(true);
        C5187o oVar = this.f21808A;
        if (oVar != null && i10 < 0 && str == null && oVar.getChildFragmentManager().s1()) {
            return true;
        }
        boolean w12 = w1(this.f21822O, this.f21823P, str, i10, i11);
        if (w12) {
            this.f21829b = true;
            try {
                C1(this.f21822O, this.f21823P);
            } finally {
                w();
            }
        }
        Z1();
        c0();
        this.f21830c.b();
        return w12;
    }

    private void w() {
        this.f21829b = false;
        this.f21823P.clear();
        this.f21822O.clear();
    }

    private boolean w0(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f21828a) {
            if (this.f21828a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f21828a.size();
                boolean z10 = false;
                for (int i10 = 0; i10 < size; i10++) {
                    z10 |= this.f21828a.get(i10).a(arrayList, arrayList2);
                }
                return z10;
            } finally {
                this.f21828a.clear();
                this.f21851x.h().removeCallbacks(this.f21827T);
            }
        }
    }

    private void x() {
        FragmentHostCallback<?> fragmentHostCallback = this.f21851x;
        if (fragmentHostCallback instanceof k0 ? this.f21830c.p().H() : fragmentHostCallback.f() instanceof Activity ? !((Activity) this.f21851x.f()).isChangingConfigurations() : true) {
            for (C5175c cVar : this.f21839l.values()) {
                for (String j10 : cVar.f22037a) {
                    this.f21830c.p().j(j10, false);
                }
            }
        }
    }

    public void A1(m mVar, boolean z10) {
        this.f21843p.o(mVar, z10);
    }

    /* access modifiers changed from: package-private */
    public Set<a0> B(ArrayList<C5173a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<Q.a> it = arrayList.get(i10).f21929c.iterator();
            while (it.hasNext()) {
                C5187o oVar = it.next().f21947b;
                if (!(oVar == null || (viewGroup = oVar.mContainer) == null)) {
                    hashSet.add(a0.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    public C5193v B0() {
        return this.f21852y;
    }

    /* access modifiers changed from: package-private */
    public void B1(C5187o oVar) {
        if (U0(2)) {
            Log.v("FragmentManager", "remove: " + oVar + " nesting=" + oVar.mBackStackNesting);
        }
        boolean isInBackStack = oVar.isInBackStack();
        if (!oVar.mDetached || !isInBackStack) {
            this.f21830c.u(oVar);
            if (V0(oVar)) {
                this.f21817J = true;
            }
            oVar.mRemoving = true;
            U1(oVar);
        }
    }

    /* access modifiers changed from: package-private */
    public O C(C5187o oVar) {
        O n10 = this.f21830c.n(oVar.mWho);
        if (n10 != null) {
            return n10;
        }
        O o10 = new O(this.f21843p, this.f21830c, oVar);
        o10.o(this.f21851x.f().getClassLoader());
        o10.t(this.f21850w);
        return o10;
    }

    public C5187o C0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        C5187o m02 = m0(string);
        if (m02 == null) {
            X1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return m02;
    }

    /* access modifiers changed from: package-private */
    public void D(C5187o oVar) {
        if (U0(2)) {
            Log.v("FragmentManager", "detach: " + oVar);
        }
        if (!oVar.mDetached) {
            oVar.mDetached = true;
            if (oVar.mAdded) {
                if (U0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + oVar);
                }
                this.f21830c.u(oVar);
                if (V0(oVar)) {
                    this.f21817J = true;
                }
                U1(oVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void D1(C5187o oVar) {
        this.f21825R.I(oVar);
    }

    /* access modifiers changed from: package-private */
    public void E() {
        this.f21818K = false;
        this.f21819L = false;
        this.f21825R.J(false);
        Z(4);
    }

    public C5195x E0() {
        C5195x xVar = this.f21809B;
        if (xVar != null) {
            return xVar;
        }
        C5187o oVar = this.f21853z;
        return oVar != null ? oVar.mFragmentManager.E0() : this.f21810C;
    }

    /* access modifiers changed from: package-private */
    public void F() {
        this.f21818K = false;
        this.f21819L = false;
        this.f21825R.J(false);
        Z(0);
    }

    /* access modifiers changed from: package-private */
    public P F0() {
        return this.f21830c;
    }

    public void F1(String str) {
        f0(new t(str), false);
    }

    /* access modifiers changed from: package-private */
    public void G(Configuration configuration, boolean z10) {
        if (z10 && (this.f21851x instanceof C6014c)) {
            X1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (C5187o next : this.f21830c.o()) {
            if (next != null) {
                next.performConfigurationChanged(configuration);
                if (z10) {
                    next.mChildFragmentManager.G(configuration, true);
                }
            }
        }
    }

    public List<C5187o> G0() {
        return this.f21830c.o();
    }

    /* access modifiers changed from: package-private */
    public boolean G1(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2, String str) {
        C5175c remove = this.f21839l.remove(str);
        if (remove == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        Iterator<C5173a> it = arrayList.iterator();
        while (it.hasNext()) {
            C5173a next = it.next();
            if (next.f21997w) {
                Iterator<Q.a> it2 = next.f21929c.iterator();
                while (it2.hasNext()) {
                    C5187o oVar = it2.next().f21947b;
                    if (oVar != null) {
                        hashMap.put(oVar.mWho, oVar);
                    }
                }
            }
        }
        Iterator<C5173a> it3 = remove.a(this, hashMap).iterator();
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!it3.hasNext()) {
                    return z10;
                }
                if (it3.next().a(arrayList, arrayList2) || z10) {
                    z10 = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean H(MenuItem menuItem) {
        if (this.f21850w < 1) {
            return false;
        }
        for (C5187o next : this.f21830c.o()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public FragmentHostCallback<?> H0() {
        return this.f21851x;
    }

    /* access modifiers changed from: package-private */
    public void H1(Parcelable parcelable) {
        O o10;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable != null) {
            Bundle bundle3 = (Bundle) parcelable;
            for (String next : bundle3.keySet()) {
                if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                    bundle2.setClassLoader(this.f21851x.f().getClassLoader());
                    this.f21840m.put(next.substring(7), bundle2);
                }
            }
            HashMap hashMap = new HashMap();
            for (String next2 : bundle3.keySet()) {
                if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                    bundle.setClassLoader(this.f21851x.f().getClassLoader());
                    hashMap.put(next2.substring(9), bundle);
                }
            }
            this.f21830c.x(hashMap);
            J j10 = (J) bundle3.getParcelable("state");
            if (j10 != null) {
                this.f21830c.v();
                Iterator<String> it = j10.f21884a.iterator();
                while (it.hasNext()) {
                    Bundle B10 = this.f21830c.B(it.next(), (Bundle) null);
                    if (B10 != null) {
                        C5187o C10 = this.f21825R.C(((N) B10.getParcelable("state")).f21901b);
                        if (C10 != null) {
                            if (U0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + C10);
                            }
                            o10 = new O(this.f21843p, this.f21830c, C10, B10);
                        } else {
                            o10 = new O(this.f21843p, this.f21830c, this.f21851x.f().getClassLoader(), E0(), B10);
                        }
                        C5187o k10 = o10.k();
                        k10.mSavedFragmentState = B10;
                        k10.mFragmentManager = this;
                        if (U0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k10.mWho + "): " + k10);
                        }
                        o10.o(this.f21851x.f().getClassLoader());
                        this.f21830c.r(o10);
                        o10.t(this.f21850w);
                    }
                }
                for (C5187o next3 : this.f21825R.F()) {
                    if (!this.f21830c.c(next3.mWho)) {
                        if (U0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next3 + " that was not found in the set of active Fragments " + j10.f21884a);
                        }
                        this.f21825R.I(next3);
                        next3.mFragmentManager = this;
                        O o11 = new O(this.f21843p, this.f21830c, next3);
                        o11.t(1);
                        o11.m();
                        next3.mRemoving = true;
                        o11.m();
                    }
                }
                this.f21830c.w(j10.f21885b);
                if (j10.f21886c != null) {
                    this.f21831d = new ArrayList<>(j10.f21886c.length);
                    int i10 = 0;
                    while (true) {
                        C5174b[] bVarArr = j10.f21886c;
                        if (i10 >= bVarArr.length) {
                            break;
                        }
                        C5173a b10 = bVarArr[i10].b(this);
                        if (U0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + b10.f21996v + "): " + b10);
                            PrintWriter printWriter = new PrintWriter(new X("FragmentManager"));
                            b10.G("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f21831d.add(b10);
                        i10++;
                    }
                } else {
                    this.f21831d = new ArrayList<>();
                }
                this.f21838k.set(j10.f21887d);
                String str = j10.f21888e;
                if (str != null) {
                    C5187o m02 = m0(str);
                    this.f21808A = m02;
                    S(m02);
                }
                ArrayList<String> arrayList = j10.f21889f;
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        this.f21839l.put(arrayList.get(i11), j10.f21890g.get(i11));
                    }
                }
                this.f21816I = new ArrayDeque<>(j10.f21891h);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void I() {
        this.f21818K = false;
        this.f21819L = false;
        this.f21825R.J(false);
        Z(1);
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 I0() {
        return this.f21833f;
    }

    /* access modifiers changed from: package-private */
    public boolean J(Menu menu, MenuInflater menuInflater) {
        if (this.f21850w < 1) {
            return false;
        }
        ArrayList<C5187o> arrayList = null;
        boolean z10 = false;
        for (C5187o next : this.f21830c.o()) {
            if (next != null && Y0(next) && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z10 = true;
            }
        }
        if (this.f21832e != null) {
            for (int i10 = 0; i10 < this.f21832e.size(); i10++) {
                C5187o oVar = this.f21832e.get(i10);
                if (arrayList == null || !arrayList.contains(oVar)) {
                    oVar.onDestroyOptionsMenu();
                }
            }
        }
        this.f21832e = arrayList;
        return z10;
    }

    /* access modifiers changed from: package-private */
    public B J0() {
        return this.f21843p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J1 */
    public Bundle c1() {
        C5174b[] bVarArr;
        Bundle bundle = new Bundle();
        u0();
        e0();
        h0(true);
        this.f21818K = true;
        this.f21825R.J(true);
        ArrayList<String> y10 = this.f21830c.y();
        HashMap<String, Bundle> m10 = this.f21830c.m();
        if (!m10.isEmpty()) {
            ArrayList<String> z10 = this.f21830c.z();
            int size = this.f21831d.size();
            if (size > 0) {
                bVarArr = new C5174b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new C5174b(this.f21831d.get(i10));
                    if (U0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f21831d.get(i10));
                    }
                }
            } else {
                bVarArr = null;
            }
            J j10 = new J();
            j10.f21884a = y10;
            j10.f21885b = z10;
            j10.f21886c = bVarArr;
            j10.f21887d = this.f21838k.get();
            C5187o oVar = this.f21808A;
            if (oVar != null) {
                j10.f21888e = oVar.mWho;
            }
            j10.f21889f.addAll(this.f21839l.keySet());
            j10.f21890g.addAll(this.f21839l.values());
            j10.f21891h = new ArrayList<>(this.f21816I);
            bundle.putParcelable("state", j10);
            for (String next : this.f21840m.keySet()) {
                bundle.putBundle("result_" + next, this.f21840m.get(next));
            }
            for (String next2 : m10.keySet()) {
                bundle.putBundle("fragment_" + next2, m10.get(next2));
            }
        } else if (U0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void K() {
        this.f21820M = true;
        h0(true);
        e0();
        x();
        Z(-1);
        FragmentHostCallback<?> fragmentHostCallback = this.f21851x;
        if (fragmentHostCallback instanceof u2.d) {
            ((u2.d) fragmentHostCallback).removeOnTrimMemoryListener(this.f21846s);
        }
        FragmentHostCallback<?> fragmentHostCallback2 = this.f21851x;
        if (fragmentHostCallback2 instanceof C6014c) {
            ((C6014c) fragmentHostCallback2).removeOnConfigurationChangedListener(this.f21845r);
        }
        FragmentHostCallback<?> fragmentHostCallback3 = this.f21851x;
        if (fragmentHostCallback3 instanceof androidx.core.app.t) {
            ((androidx.core.app.t) fragmentHostCallback3).removeOnMultiWindowModeChangedListener(this.f21847t);
        }
        FragmentHostCallback<?> fragmentHostCallback4 = this.f21851x;
        if (fragmentHostCallback4 instanceof androidx.core.app.u) {
            ((androidx.core.app.u) fragmentHostCallback4).removeOnPictureInPictureModeChangedListener(this.f21848u);
        }
        FragmentHostCallback<?> fragmentHostCallback5 = this.f21851x;
        if ((fragmentHostCallback5 instanceof C4640w) && this.f21853z == null) {
            ((C4640w) fragmentHostCallback5).removeMenuProvider(this.f21849v);
        }
        this.f21851x = null;
        this.f21852y = null;
        this.f21853z = null;
        if (this.f21834g != null) {
            this.f21837j.remove();
            this.f21834g = null;
        }
        C5314c<Intent> cVar = this.f21813F;
        if (cVar != null) {
            cVar.c();
            this.f21814G.c();
            this.f21815H.c();
        }
    }

    /* access modifiers changed from: package-private */
    public C5187o K0() {
        return this.f21853z;
    }

    public void K1(String str) {
        f0(new u(str), false);
    }

    /* access modifiers changed from: package-private */
    public void L() {
        Z(1);
    }

    public C5187o L0() {
        return this.f21808A;
    }

    /* access modifiers changed from: package-private */
    public boolean L1(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2, String str) {
        String str2;
        int i10;
        String str3 = str;
        int n02 = n0(str3, -1, true);
        if (n02 < 0) {
            return false;
        }
        for (int i11 = n02; i11 < this.f21831d.size(); i11++) {
            C5173a aVar = this.f21831d.get(i11);
            if (!aVar.f21944r) {
                X1(new IllegalArgumentException("saveBackStack(\"" + str3 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i12 = n02; i12 < this.f21831d.size(); i12++) {
            C5173a aVar2 = this.f21831d.get(i12);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<Q.a> it = aVar2.f21929c.iterator();
            while (it.hasNext()) {
                Q.a next = it.next();
                C5187o oVar = next.f21947b;
                if (oVar != null) {
                    if (!next.f21948c || (i10 = next.f21946a) == 1 || i10 == 2 || i10 == 8) {
                        hashSet.add(oVar);
                        hashSet2.add(oVar);
                    }
                    int i13 = next.f21946a;
                    if (i13 == 1 || i13 == 2) {
                        hashSet3.add(oVar);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str3);
                sb2.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    str2 = " " + hashSet2.iterator().next();
                } else {
                    str2 = "s " + hashSet2;
                }
                sb2.append(str2);
                sb2.append(" in ");
                sb2.append(aVar2);
                sb2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                X1(new IllegalArgumentException(sb2.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            C5187o oVar2 = (C5187o) arrayDeque.removeFirst();
            if (oVar2.mRetainInstance) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("saveBackStack(\"");
                sb3.append(str3);
                sb3.append("\") must not contain retained fragments. Found ");
                sb3.append(hashSet.contains(oVar2) ? "direct reference to retained " : "retained child ");
                sb3.append("fragment ");
                sb3.append(oVar2);
                X1(new IllegalArgumentException(sb3.toString()));
            }
            for (C5187o next2 : oVar2.mChildFragmentManager.x0()) {
                if (next2 != null) {
                    arrayDeque.addLast(next2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C5187o) it2.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.f21831d.size() - n02);
        for (int i14 = n02; i14 < this.f21831d.size(); i14++) {
            arrayList4.add((Object) null);
        }
        C5175c cVar = new C5175c(arrayList3, arrayList4);
        for (int size = this.f21831d.size() - 1; size >= n02; size--) {
            C5173a remove = this.f21831d.remove(size);
            C5173a aVar3 = new C5173a(remove);
            aVar3.D();
            arrayList4.set(size - n02, new C5174b(aVar3));
            remove.f21997w = true;
            arrayList.add(remove);
            arrayList2.add(Boolean.TRUE);
        }
        this.f21839l.put(str3, cVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void M(boolean z10) {
        if (z10 && (this.f21851x instanceof u2.d)) {
            X1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (C5187o next : this.f21830c.o()) {
            if (next != null) {
                next.performLowMemory();
                if (z10) {
                    next.mChildFragmentManager.M(true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public b0 M0() {
        b0 b0Var = this.f21811D;
        if (b0Var != null) {
            return b0Var;
        }
        C5187o oVar = this.f21853z;
        return oVar != null ? oVar.mFragmentManager.M0() : this.f21812E;
    }

    public C5187o.n M1(C5187o oVar) {
        O n10 = this.f21830c.n(oVar.mWho);
        if (n10 == null || !n10.k().equals(oVar)) {
            X1(new IllegalStateException("Fragment " + oVar + " is not currently in the FragmentManager"));
        }
        return n10.q();
    }

    /* access modifiers changed from: package-private */
    public void N(boolean z10, boolean z11) {
        if (z11 && (this.f21851x instanceof androidx.core.app.t)) {
            X1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (C5187o next : this.f21830c.o()) {
            if (next != null) {
                next.performMultiWindowModeChanged(z10);
                if (z11) {
                    next.mChildFragmentManager.N(z10, true);
                }
            }
        }
    }

    public b.c N0() {
        return this.f21826S;
    }

    /* access modifiers changed from: package-private */
    public void N1() {
        synchronized (this.f21828a) {
            try {
                if (this.f21828a.size() == 1) {
                    this.f21851x.h().removeCallbacks(this.f21827T);
                    this.f21851x.h().post(this.f21827T);
                    Z1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void O(C5187o oVar) {
        Iterator<L> it = this.f21844q.iterator();
        while (it.hasNext()) {
            it.next().a(this, oVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void O1(C5187o oVar, boolean z10) {
        ViewGroup D02 = D0(oVar);
        if (D02 != null && (D02 instanceof FragmentContainerView)) {
            ((FragmentContainerView) D02).setDrawDisappearingViewsLast(!z10);
        }
    }

    /* access modifiers changed from: package-private */
    public void P() {
        for (C5187o next : this.f21830c.l()) {
            if (next != null) {
                next.onHiddenChanged(next.isHidden());
                next.mChildFragmentManager.P();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public j0 P0(C5187o oVar) {
        return this.f21825R.G(oVar);
    }

    public void P1(C5195x xVar) {
        this.f21809B = xVar;
    }

    /* access modifiers changed from: package-private */
    public boolean Q(MenuItem menuItem) {
        if (this.f21850w < 1) {
            return false;
        }
        for (C5187o next : this.f21830c.o()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void Q0() {
        this.f21836i = true;
        h0(true);
        this.f21836i = false;
        if (f21807V && this.f21835h != null) {
            if (!this.f21842o.isEmpty()) {
                LinkedHashSet<C5187o> linkedHashSet = new LinkedHashSet<>(v0(this.f21835h));
                Iterator<p> it = this.f21842o.iterator();
                while (it.hasNext()) {
                    p next = it.next();
                    for (C5187o g10 : linkedHashSet) {
                        next.g(g10, true);
                    }
                }
            }
            Iterator<Q.a> it2 = this.f21835h.f21929c.iterator();
            while (it2.hasNext()) {
                C5187o oVar = it2.next().f21947b;
                if (oVar != null) {
                    oVar.mTransitioning = false;
                }
            }
            for (a0 f10 : B(new ArrayList(Collections.singletonList(this.f21835h)), 0, 1)) {
                f10.f();
            }
            Iterator<Q.a> it3 = this.f21835h.f21929c.iterator();
            while (it3.hasNext()) {
                C5187o oVar2 = it3.next().f21947b;
                if (oVar2 != null && oVar2.mContainer == null) {
                    C(oVar2).m();
                }
            }
            this.f21835h = null;
            Z1();
            if (U0(3)) {
                Log.d("FragmentManager", "Op is being set to null");
                Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f21837j.isEnabled() + " for  FragmentManager " + this);
            }
        } else if (this.f21837j.isEnabled()) {
            if (U0(3)) {
                Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
            }
            s1();
        } else {
            if (U0(3)) {
                Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
            }
            this.f21834g.l();
        }
    }

    public final void Q1(String str, Bundle bundle) {
        o oVar = this.f21841n.get(str);
        if (oVar == null || !oVar.b(r.b.STARTED)) {
            this.f21840m.put(str, bundle);
        } else {
            oVar.a(str, bundle);
        }
        if (U0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void R(Menu menu) {
        if (this.f21850w >= 1) {
            for (C5187o next : this.f21830c.o()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void R0(C5187o oVar) {
        if (U0(2)) {
            Log.v("FragmentManager", "hide: " + oVar);
        }
        if (!oVar.mHidden) {
            oVar.mHidden = true;
            oVar.mHiddenChanged = true ^ oVar.mHiddenChanged;
            U1(oVar);
        }
    }

    public final void R1(String str, C5221y yVar, M m10) {
        androidx.lifecycle.r lifecycle = yVar.getLifecycle();
        if (lifecycle.d() != r.b.DESTROYED) {
            g gVar = new g(str, m10, lifecycle);
            o put = this.f21841n.put(str, new o(lifecycle, m10, gVar));
            if (put != null) {
                put.c();
            }
            if (U0(2)) {
                Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + m10);
            }
            lifecycle.c(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void S0(C5187o oVar) {
        if (oVar.mAdded && V0(oVar)) {
            this.f21817J = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void S1(C5187o oVar, r.b bVar) {
        if (!oVar.equals(m0(oVar.mWho)) || !(oVar.mHost == null || oVar.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
        }
        oVar.mMaxState = bVar;
    }

    /* access modifiers changed from: package-private */
    public void T() {
        Z(5);
    }

    public boolean T0() {
        return this.f21820M;
    }

    /* access modifiers changed from: package-private */
    public void T1(C5187o oVar) {
        if (oVar == null || (oVar.equals(m0(oVar.mWho)) && (oVar.mHost == null || oVar.mFragmentManager == this))) {
            C5187o oVar2 = this.f21808A;
            this.f21808A = oVar;
            S(oVar2);
            S(this.f21808A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
    }

    /* access modifiers changed from: package-private */
    public void U(boolean z10, boolean z11) {
        if (z11 && (this.f21851x instanceof androidx.core.app.u)) {
            X1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (C5187o next : this.f21830c.o()) {
            if (next != null) {
                next.performPictureInPictureModeChanged(z10);
                if (z11) {
                    next.mChildFragmentManager.U(z10, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean V(Menu menu) {
        boolean z10 = false;
        if (this.f21850w < 1) {
            return false;
        }
        for (C5187o next : this.f21830c.o()) {
            if (next != null && Y0(next) && next.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void V1(C5187o oVar) {
        if (U0(2)) {
            Log.v("FragmentManager", "show: " + oVar);
        }
        if (oVar.mHidden) {
            oVar.mHidden = false;
            oVar.mHiddenChanged = !oVar.mHiddenChanged;
        }
    }

    /* access modifiers changed from: package-private */
    public void W() {
        Z1();
        S(this.f21808A);
    }

    /* access modifiers changed from: package-private */
    public void X() {
        this.f21818K = false;
        this.f21819L = false;
        this.f21825R.J(false);
        Z(7);
    }

    /* access modifiers changed from: package-private */
    public boolean X0(C5187o oVar) {
        if (oVar == null) {
            return false;
        }
        return oVar.isHidden();
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        this.f21818K = false;
        this.f21819L = false;
        this.f21825R.J(false);
        Z(5);
    }

    /* access modifiers changed from: package-private */
    public boolean Y0(C5187o oVar) {
        if (oVar == null) {
            return true;
        }
        return oVar.isMenuVisible();
    }

    public void Y1(m mVar) {
        this.f21843p.p(mVar);
    }

    /* access modifiers changed from: package-private */
    public boolean Z0(C5187o oVar) {
        if (oVar == null) {
            return true;
        }
        FragmentManager fragmentManager = oVar.mFragmentManager;
        return oVar.equals(fragmentManager.L0()) && Z0(fragmentManager.f21853z);
    }

    /* access modifiers changed from: package-private */
    public void a0() {
        this.f21819L = true;
        this.f21825R.J(true);
        Z(4);
    }

    /* access modifiers changed from: package-private */
    public boolean a1(int i10) {
        return this.f21850w >= i10;
    }

    /* access modifiers changed from: package-private */
    public void b0() {
        Z(2);
    }

    public boolean b1() {
        return this.f21818K || this.f21819L;
    }

    public void d0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f21830c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<C5187o> arrayList = this.f21832e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f21832e.get(i10).toString());
            }
        }
        int size2 = this.f21831d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                C5173a aVar = this.f21831d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.F(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f21838k.get());
        synchronized (this.f21828a) {
            try {
                int size3 = this.f21828a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(this.f21828a.get(i12));
                    }
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f21851x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f21852y);
        if (this.f21853z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f21853z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f21850w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f21818K);
        printWriter.print(" mStopped=");
        printWriter.print(this.f21819L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f21820M);
        if (this.f21817J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f21817J);
        }
    }

    /* access modifiers changed from: package-private */
    public void f0(q qVar, boolean z10) {
        if (!z10) {
            if (this.f21851x != null) {
                v();
            } else if (this.f21820M) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f21828a) {
            try {
                if (this.f21851x != null) {
                    this.f21828a.add(qVar);
                    N1();
                } else if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean h0(boolean z10) {
        C5173a aVar;
        g0(z10);
        boolean z11 = false;
        if (!this.f21836i && (aVar = this.f21835h) != null) {
            aVar.f21995u = false;
            aVar.D();
            if (U0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f21835h + " as part of execPendingActions for actions " + this.f21828a);
            }
            this.f21835h.E(false, false);
            this.f21828a.add(0, this.f21835h);
            Iterator<Q.a> it = this.f21835h.f21929c.iterator();
            while (it.hasNext()) {
                C5187o oVar = it.next().f21947b;
                if (oVar != null) {
                    oVar.mTransitioning = false;
                }
            }
            this.f21835h = null;
        }
        while (w0(this.f21822O, this.f21823P)) {
            z11 = true;
            this.f21829b = true;
            try {
                C1(this.f21822O, this.f21823P);
            } finally {
                w();
            }
        }
        Z1();
        c0();
        this.f21830c.b();
        return z11;
    }

    /* access modifiers changed from: package-private */
    public void i0(q qVar, boolean z10) {
        if (!z10 || (this.f21851x != null && !this.f21820M)) {
            g0(z10);
            C5173a aVar = this.f21835h;
            boolean z11 = false;
            if (aVar != null) {
                aVar.f21995u = false;
                aVar.D();
                if (U0(3)) {
                    Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f21835h + " as part of execSingleAction for action " + qVar);
                }
                this.f21835h.E(false, false);
                boolean a10 = this.f21835h.a(this.f21822O, this.f21823P);
                Iterator<Q.a> it = this.f21835h.f21929c.iterator();
                while (it.hasNext()) {
                    C5187o oVar = it.next().f21947b;
                    if (oVar != null) {
                        oVar.mTransitioning = false;
                    }
                }
                this.f21835h = null;
                z11 = a10;
            }
            boolean a11 = qVar.a(this.f21822O, this.f21823P);
            if (z11 || a11) {
                this.f21829b = true;
                try {
                    C1(this.f21822O, this.f21823P);
                } finally {
                    w();
                }
            }
            Z1();
            c0();
            this.f21830c.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void i1(C5187o oVar, String[] strArr, int i10) {
        if (this.f21815H != null) {
            this.f21816I.addLast(new n(oVar.mWho, i10));
            this.f21815H.a(strArr);
            return;
        }
        this.f21851x.l(oVar, strArr, i10);
    }

    /* access modifiers changed from: package-private */
    public void j1(C5187o oVar, Intent intent, int i10, Bundle bundle) {
        if (this.f21813F != null) {
            this.f21816I.addLast(new n(oVar.mWho, i10));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f21813F.a(intent);
            return;
        }
        this.f21851x.n(oVar, intent, i10, bundle);
    }

    /* access modifiers changed from: package-private */
    public void k(C5173a aVar) {
        this.f21831d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void k1(C5187o oVar, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Intent intent2;
        C5187o oVar2 = oVar;
        Bundle bundle2 = bundle;
        if (this.f21814G != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                if (U0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle2 + " were added to fillInIntent " + intent2 + " for fragment " + oVar);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            C5318g a10 = new C5318g.a(intentSender).b(intent2).c(i12, i11).a();
            int i14 = i10;
            this.f21816I.addLast(new n(oVar2.mWho, i10));
            if (U0(2)) {
                Log.v("FragmentManager", "Fragment " + oVar + "is launching an IntentSender for result ");
            }
            this.f21814G.a(a10);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i15 = i10;
        int i16 = i11;
        int i17 = i12;
        this.f21851x.o(oVar, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    /* access modifiers changed from: package-private */
    public O l(C5187o oVar) {
        String str = oVar.mPreviousWho;
        if (str != null) {
            c3.b.f(oVar, str);
        }
        if (U0(2)) {
            Log.v("FragmentManager", "add: " + oVar);
        }
        O C10 = C(oVar);
        oVar.mFragmentManager = this;
        this.f21830c.r(C10);
        if (!oVar.mDetached) {
            this.f21830c.a(oVar);
            oVar.mRemoving = false;
            if (oVar.mView == null) {
                oVar.mHiddenChanged = false;
            }
            if (V0(oVar)) {
                this.f21817J = true;
            }
        }
        return C10;
    }

    public boolean l0() {
        boolean h02 = h0(true);
        u0();
        return h02;
    }

    /* access modifiers changed from: package-private */
    public void l1(int i10, boolean z10) {
        FragmentHostCallback<?> fragmentHostCallback;
        if (this.f21851x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z10 || i10 != this.f21850w) {
            this.f21850w = i10;
            this.f21830c.t();
            W1();
            if (this.f21817J && (fragmentHostCallback = this.f21851x) != null && this.f21850w == 7) {
                fragmentHostCallback.p();
                this.f21817J = false;
            }
        }
    }

    public void m(L l10) {
        this.f21844q.add(l10);
    }

    /* access modifiers changed from: package-private */
    public C5187o m0(String str) {
        return this.f21830c.f(str);
    }

    /* access modifiers changed from: package-private */
    public void m1() {
        if (this.f21851x != null) {
            this.f21818K = false;
            this.f21819L = false;
            this.f21825R.J(false);
            for (C5187o next : this.f21830c.o()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    public void n(p pVar) {
        this.f21842o.add(pVar);
    }

    public final void n1(FragmentContainerView fragmentContainerView) {
        View view;
        for (O next : this.f21830c.k()) {
            C5187o k10 = next.k();
            if (k10.mContainerId == fragmentContainerView.getId() && (view = k10.mView) != null && view.getParent() == null) {
                k10.mContainer = fragmentContainerView;
                next.b();
                next.m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(C5187o oVar) {
        this.f21825R.h(oVar);
    }

    /* access modifiers changed from: package-private */
    public void o1(O o10) {
        C5187o k10 = o10.k();
        if (!k10.mDeferStart) {
            return;
        }
        if (this.f21829b) {
            this.f21821N = true;
            return;
        }
        k10.mDeferStart = false;
        o10.m();
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return this.f21838k.getAndIncrement();
    }

    public C5187o p0(int i10) {
        return this.f21830c.g(i10);
    }

    public void p1() {
        f0(new r((String) null, -1, 0), false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.activity.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: androidx.fragment.app.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: androidx.fragment.app.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: androidx.fragment.app.o} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(androidx.fragment.app.FragmentHostCallback<?> r4, androidx.fragment.app.C5193v r5, androidx.fragment.app.C5187o r6) {
        /*
            r3 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.f21851x
            if (r0 != 0) goto L_0x016c
            r3.f21851x = r4
            r3.f21852y = r5
            r3.f21853z = r6
            if (r6 == 0) goto L_0x0015
            androidx.fragment.app.FragmentManager$h r5 = new androidx.fragment.app.FragmentManager$h
            r5.<init>(r6)
            r3.m(r5)
            goto L_0x001f
        L_0x0015:
            boolean r5 = r4 instanceof androidx.fragment.app.L
            if (r5 == 0) goto L_0x001f
            r5 = r4
            androidx.fragment.app.L r5 = (androidx.fragment.app.L) r5
            r3.m(r5)
        L_0x001f:
            androidx.fragment.app.o r5 = r3.f21853z
            if (r5 == 0) goto L_0x0026
            r3.Z1()
        L_0x0026:
            boolean r5 = r4 instanceof androidx.activity.z
            if (r5 == 0) goto L_0x003b
            r5 = r4
            androidx.activity.z r5 = (androidx.activity.z) r5
            androidx.activity.w r0 = r5.getOnBackPressedDispatcher()
            r3.f21834g = r0
            if (r6 == 0) goto L_0x0036
            r5 = r6
        L_0x0036:
            androidx.activity.v r1 = r3.f21837j
            r0.i(r5, r1)
        L_0x003b:
            if (r6 == 0) goto L_0x0046
            androidx.fragment.app.FragmentManager r4 = r6.mFragmentManager
            androidx.fragment.app.K r4 = r4.A0(r6)
            r3.f21825R = r4
            goto L_0x005f
        L_0x0046:
            boolean r5 = r4 instanceof androidx.lifecycle.k0
            if (r5 == 0) goto L_0x0057
            androidx.lifecycle.k0 r4 = (androidx.lifecycle.k0) r4
            androidx.lifecycle.j0 r4 = r4.getViewModelStore()
            androidx.fragment.app.K r4 = androidx.fragment.app.K.E(r4)
            r3.f21825R = r4
            goto L_0x005f
        L_0x0057:
            androidx.fragment.app.K r4 = new androidx.fragment.app.K
            r5 = 0
            r4.<init>(r5)
            r3.f21825R = r4
        L_0x005f:
            androidx.fragment.app.K r4 = r3.f21825R
            boolean r5 = r3.b1()
            r4.J(r5)
            androidx.fragment.app.P r4 = r3.f21830c
            androidx.fragment.app.K r5 = r3.f21825R
            r4.A(r5)
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.f21851x
            boolean r5 = r4 instanceof P4.f
            if (r5 == 0) goto L_0x0090
            if (r6 != 0) goto L_0x0090
            P4.f r4 = (P4.f) r4
            P4.d r4 = r4.getSavedStateRegistry()
            androidx.fragment.app.G r5 = new androidx.fragment.app.G
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.h(r0, r5)
            android.os.Bundle r4 = r4.b(r0)
            if (r4 == 0) goto L_0x0090
            r3.H1(r4)
        L_0x0090:
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.f21851x
            boolean r5 = r4 instanceof g.C5317f
            if (r5 == 0) goto L_0x0128
            g.f r4 = (g.C5317f) r4
            g.e r4 = r4.getActivityResultRegistry()
            if (r6 == 0) goto L_0x00b2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.mWho
            r5.append(r0)
            java.lang.String r0 = ":"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L_0x00b4
        L_0x00b2:
            java.lang.String r5 = ""
        L_0x00b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FragmentManager:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartActivityForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            h.d r1 = new h.d
            r1.<init>()
            androidx.fragment.app.FragmentManager$i r2 = new androidx.fragment.app.FragmentManager$i
            r2.<init>()
            g.c r0 = r4.m(r0, r1, r2)
            r3.f21813F = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "StartIntentSenderForResult"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.FragmentManager$l r1 = new androidx.fragment.app.FragmentManager$l
            r1.<init>()
            androidx.fragment.app.FragmentManager$j r2 = new androidx.fragment.app.FragmentManager$j
            r2.<init>()
            g.c r0 = r4.m(r0, r1, r2)
            r3.f21814G = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "RequestPermissions"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            h.b r0 = new h.b
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>()
            g.c r4 = r4.m(r5, r0, r1)
            r3.f21815H = r4
        L_0x0128:
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.f21851x
            boolean r5 = r4 instanceof u2.C6014c
            if (r5 == 0) goto L_0x0135
            u2.c r4 = (u2.C6014c) r4
            H2.a<android.content.res.Configuration> r5 = r3.f21845r
            r4.addOnConfigurationChangedListener(r5)
        L_0x0135:
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.f21851x
            boolean r5 = r4 instanceof u2.d
            if (r5 == 0) goto L_0x0142
            u2.d r4 = (u2.d) r4
            H2.a<java.lang.Integer> r5 = r3.f21846s
            r4.addOnTrimMemoryListener(r5)
        L_0x0142:
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.f21851x
            boolean r5 = r4 instanceof androidx.core.app.t
            if (r5 == 0) goto L_0x014f
            androidx.core.app.t r4 = (androidx.core.app.t) r4
            H2.a<androidx.core.app.k> r5 = r3.f21847t
            r4.addOnMultiWindowModeChangedListener(r5)
        L_0x014f:
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.f21851x
            boolean r5 = r4 instanceof androidx.core.app.u
            if (r5 == 0) goto L_0x015c
            androidx.core.app.u r4 = (androidx.core.app.u) r4
            H2.a<androidx.core.app.x> r5 = r3.f21848u
            r4.addOnPictureInPictureModeChangedListener(r5)
        L_0x015c:
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.f21851x
            boolean r5 = r4 instanceof I2.C4640w
            if (r5 == 0) goto L_0x016b
            if (r6 != 0) goto L_0x016b
            I2.w r4 = (I2.C4640w) r4
            I2.B r5 = r3.f21849v
            r4.addMenuProvider(r5)
        L_0x016b:
            return
        L_0x016c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.q(androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.v, androidx.fragment.app.o):void");
    }

    public C5187o q0(String str) {
        return this.f21830c.h(str);
    }

    /* access modifiers changed from: package-private */
    public void q1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            f0(new r((String) null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* access modifiers changed from: package-private */
    public void r(C5187o oVar) {
        if (U0(2)) {
            Log.v("FragmentManager", "attach: " + oVar);
        }
        if (oVar.mDetached) {
            oVar.mDetached = false;
            if (!oVar.mAdded) {
                this.f21830c.a(oVar);
                if (U0(2)) {
                    Log.v("FragmentManager", "add from attach: " + oVar);
                }
                if (V0(oVar)) {
                    this.f21817J = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C5187o r0(String str) {
        return this.f21830c.i(str);
    }

    public void r1(String str, int i10) {
        f0(new r(str, -1, i10), false);
    }

    public Q s() {
        return new C5173a(this);
    }

    public boolean s1() {
        return v1((String) null, -1, 0);
    }

    /* access modifiers changed from: package-private */
    public void t() {
        if (U0(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f21835h);
        }
        C5173a aVar = this.f21835h;
        if (aVar != null) {
            aVar.f21995u = false;
            aVar.D();
            this.f21835h.w(true, new H(this));
            this.f21835h.j();
            this.f21836i = true;
            l0();
            this.f21836i = false;
            this.f21835h = null;
        }
    }

    public boolean t1(int i10, int i11) {
        if (i10 >= 0) {
            return v1((String) null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        C5187o oVar = this.f21853z;
        if (oVar != null) {
            sb2.append(oVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f21853z)));
            sb2.append("}");
        } else {
            FragmentHostCallback<?> fragmentHostCallback = this.f21851x;
            if (fragmentHostCallback != null) {
                sb2.append(fragmentHostCallback.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f21851x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean u() {
        boolean z10 = false;
        for (C5187o next : this.f21830c.l()) {
            if (next != null) {
                z10 = V0(next);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public boolean u1(String str, int i10) {
        return v1(str, -1, i10);
    }

    /* access modifiers changed from: package-private */
    public Set<C5187o> v0(C5173a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f21929c.size(); i10++) {
            C5187o oVar = aVar.f21929c.get(i10).f21947b;
            if (oVar != null && aVar.f21935i) {
                hashSet.add(oVar);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: package-private */
    public boolean w1(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int n02 = n0(str, i10, (i11 & 1) != 0);
        if (n02 < 0) {
            return false;
        }
        for (int size = this.f21831d.size() - 1; size >= n02; size--) {
            arrayList.add(this.f21831d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public List<C5187o> x0() {
        return this.f21830c.l();
    }

    /* access modifiers changed from: package-private */
    public boolean x1(ArrayList<C5173a> arrayList, ArrayList<Boolean> arrayList2) {
        if (U0(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f21828a);
        }
        if (this.f21831d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList<C5173a> arrayList3 = this.f21831d;
        C5173a aVar = arrayList3.get(arrayList3.size() - 1);
        this.f21835h = aVar;
        Iterator<Q.a> it = aVar.f21929c.iterator();
        while (it.hasNext()) {
            C5187o oVar = it.next().f21947b;
            if (oVar != null) {
                oVar.mTransitioning = true;
            }
        }
        return w1(arrayList, arrayList2, (String) null, -1, 0);
    }

    public final void y(String str) {
        this.f21840m.remove(str);
        if (U0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public k y0(int i10) {
        if (i10 != this.f21831d.size()) {
            return this.f21831d.get(i10);
        }
        C5173a aVar = this.f21835h;
        if (aVar != null) {
            return aVar;
        }
        throw new IndexOutOfBoundsException();
    }

    /* access modifiers changed from: package-private */
    public void y1() {
        f0(new s(), false);
    }

    public final void z(String str) {
        o remove = this.f21841n.remove(str);
        if (remove != null) {
            remove.c();
        }
        if (U0(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key " + str);
        }
    }

    public int z0() {
        return this.f21831d.size() + (this.f21835h != null ? 1 : 0);
    }

    public void z1(Bundle bundle, String str, C5187o oVar) {
        if (oVar.mFragmentManager != this) {
            X1(new IllegalStateException("Fragment " + oVar + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, oVar.mWho);
    }

    @SuppressLint({"BanParcelableUsage"})
    static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        String f21868a;

        /* renamed from: b  reason: collision with root package name */
        int f21869b;

        class a implements Parcelable.Creator<n> {
            a() {
            }

            /* renamed from: a */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel);
            }

            /* renamed from: b */
            public n[] newArray(int i10) {
                return new n[i10];
            }
        }

        n(String str, int i10) {
            this.f21868a = str;
            this.f21869b = i10;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f21868a);
            parcel.writeInt(this.f21869b);
        }

        n(Parcel parcel) {
            this.f21868a = parcel.readString();
            this.f21869b = parcel.readInt();
        }
    }
}
