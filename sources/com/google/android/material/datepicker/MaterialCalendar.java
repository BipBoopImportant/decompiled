package com.google.android.material.datepicker;

import Ea.C9070d;
import Ea.C9072f;
import Ea.C9073g;
import Ea.C9074h;
import Ea.C9076j;
import I2.C4597a;
import I2.C4600b0;
import J2.t;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

public final class MaterialCalendar<S> extends u<S> {

    /* renamed from: R  reason: collision with root package name */
    static final Object f66486R = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: S  reason: collision with root package name */
    static final Object f66487S = "NAVIGATION_PREV_TAG";

    /* renamed from: T  reason: collision with root package name */
    static final Object f66488T = "NAVIGATION_NEXT_TAG";

    /* renamed from: U  reason: collision with root package name */
    static final Object f66489U = "SELECTOR_TOGGLE_TAG";

    /* renamed from: E  reason: collision with root package name */
    private int f66490E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public i<S> f66491F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public a f66492G;

    /* renamed from: H  reason: collision with root package name */
    private m f66493H;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public q f66494I;

    /* renamed from: J  reason: collision with root package name */
    private l f66495J;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public c f66496K;
    /* access modifiers changed from: private */

    /* renamed from: L  reason: collision with root package name */
    public RecyclerView f66497L;
    /* access modifiers changed from: private */

    /* renamed from: M  reason: collision with root package name */
    public RecyclerView f66498M;

    /* renamed from: N  reason: collision with root package name */
    private View f66499N;

    /* renamed from: O  reason: collision with root package name */
    private View f66500O;

    /* renamed from: P  reason: collision with root package name */
    private View f66501P;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public View f66502Q;

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f66503a;

        a(s sVar) {
            this.f66503a = sVar;
        }

        public void onClick(View view) {
            int B22 = MaterialCalendar.this.D0().B2() - 1;
            if (B22 >= 0) {
                MaterialCalendar.this.G0(this.f66503a.d(B22));
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f66505a;

        b(int i10) {
            this.f66505a = i10;
        }

        public void run() {
            MaterialCalendar.this.f66498M.F1(this.f66505a);
        }
    }

    class c extends C4597a {
        c() {
        }

        public void g(View view, t tVar) {
            super.g(view, tVar);
            tVar.k0((Object) null);
        }
    }

    class d extends w {

        /* renamed from: I  reason: collision with root package name */
        final /* synthetic */ int f66508I;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f66508I = i11;
        }

        /* access modifiers changed from: protected */
        public void m2(RecyclerView.C c10, int[] iArr) {
            if (this.f66508I == 0) {
                iArr[0] = MaterialCalendar.this.f66498M.getWidth();
                iArr[1] = MaterialCalendar.this.f66498M.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.f66498M.getHeight();
            iArr[1] = MaterialCalendar.this.f66498M.getHeight();
        }
    }

    class e implements m {
        e() {
        }

        public void a(long j10) {
            if (MaterialCalendar.this.f66492G.g().W0(j10)) {
                MaterialCalendar.this.f66491F.n3(j10);
                Iterator<t<S>> it = MaterialCalendar.this.f66658D.iterator();
                while (it.hasNext()) {
                    it.next().b(MaterialCalendar.this.f66491F.W2());
                }
                MaterialCalendar.this.f66498M.getAdapter().notifyDataSetChanged();
                if (MaterialCalendar.this.f66497L != null) {
                    MaterialCalendar.this.f66497L.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    class f extends C4597a {
        f() {
        }

        public void g(View view, t tVar) {
            super.g(view, tVar);
            tVar.L0(false);
        }
    }

    class g extends RecyclerView.p {

        /* renamed from: a  reason: collision with root package name */
        private final Calendar f66512a = y.m();

        /* renamed from: b  reason: collision with root package name */
        private final Calendar f66513b = y.m();

        g() {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10) {
            if ((recyclerView.getAdapter() instanceof z) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                z zVar = (z) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (H2.d next : MaterialCalendar.this.f66491F.L1()) {
                    F f10 = next.f7052a;
                    if (!(f10 == null || next.f7053b == null)) {
                        this.f66512a.setTimeInMillis(((Long) f10).longValue());
                        this.f66513b.setTimeInMillis(((Long) next.f7053b).longValue());
                        int e10 = zVar.e(this.f66512a.get(1));
                        int e11 = zVar.e(this.f66513b.get(1));
                        View e02 = gridLayoutManager.e0(e10);
                        View e03 = gridLayoutManager.e0(e11);
                        int H32 = e10 / gridLayoutManager.H3();
                        int H33 = e11 / gridLayoutManager.H3();
                        int i10 = H32;
                        while (i10 <= H33) {
                            View e04 = gridLayoutManager.e0(gridLayoutManager.H3() * i10);
                            if (e04 != null) {
                                canvas.drawRect((float) ((i10 != H32 || e02 == null) ? 0 : e02.getLeft() + (e02.getWidth() / 2)), (float) (e04.getTop() + MaterialCalendar.this.f66496K.f66608d.c()), (float) ((i10 != H33 || e03 == null) ? recyclerView.getWidth() : e03.getLeft() + (e03.getWidth() / 2)), (float) (e04.getBottom() - MaterialCalendar.this.f66496K.f66608d.b()), MaterialCalendar.this.f66496K.f66612h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    class h extends C4597a {
        h() {
        }

        public void g(View view, t tVar) {
            super.g(view, tVar);
            tVar.w0(MaterialCalendar.this.f66502Q.getVisibility() == 0 ? MaterialCalendar.this.getString(C9076j.f59555L) : MaterialCalendar.this.getString(C9076j.f59553J));
        }
    }

    class i extends RecyclerView.v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f66516a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialButton f66517b;

        i(s sVar, MaterialButton materialButton) {
            this.f66516a = sVar;
            this.f66517b = materialButton;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f66517b.getText());
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
            int y22 = i10 < 0 ? MaterialCalendar.this.D0().y2() : MaterialCalendar.this.D0().B2();
            q unused = MaterialCalendar.this.f66494I = this.f66516a.d(y22);
            this.f66517b.setText(this.f66516a.e(y22));
        }
    }

    class j implements View.OnClickListener {
        j() {
        }

        public void onClick(View view) {
            MaterialCalendar.this.J0();
        }
    }

    class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f66520a;

        k(s sVar) {
            this.f66520a = sVar;
        }

        public void onClick(View view) {
            int y22 = MaterialCalendar.this.D0().y2() + 1;
            if (y22 < MaterialCalendar.this.f66498M.getAdapter().getItemCount()) {
                MaterialCalendar.this.G0(this.f66520a.d(y22));
            }
        }
    }

    enum l {
        DAY,
        YEAR
    }

    interface m {
        void a(long j10);
    }

    static int B0(Context context) {
        return context.getResources().getDimensionPixelSize(C9070d.f59405d0);
    }

    private static int C0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C9070d.f59419k0) + resources.getDimensionPixelOffset(C9070d.f59421l0) + resources.getDimensionPixelOffset(C9070d.f59417j0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C9070d.f59409f0);
        int i10 = r.f66641g;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C9070d.f59405d0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(C9070d.f59415i0)) + resources.getDimensionPixelOffset(C9070d.f59401b0);
    }

    public static <T> MaterialCalendar<T> E0(i<T> iVar, int i10, a aVar, m mVar) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", iVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", mVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.k());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    private void F0(int i10) {
        this.f66498M.post(new b(i10));
    }

    private void I0() {
        C4600b0.p0(this.f66498M, new f());
    }

    private void v0(View view, s sVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C9072f.f59502t);
        materialButton.setTag(f66489U);
        C4600b0.p0(materialButton, new h());
        View findViewById = view.findViewById(C9072f.f59504v);
        this.f66499N = findViewById;
        findViewById.setTag(f66487S);
        View findViewById2 = view.findViewById(C9072f.f59503u);
        this.f66500O = findViewById2;
        findViewById2.setTag(f66488T);
        this.f66501P = view.findViewById(C9072f.f59461D);
        this.f66502Q = view.findViewById(C9072f.f59507y);
        H0(l.DAY);
        materialButton.setText(this.f66494I.C());
        this.f66498M.n(new i(sVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f66500O.setOnClickListener(new k(sVar));
        this.f66499N.setOnClickListener(new a(sVar));
    }

    private RecyclerView.p w0() {
        return new g();
    }

    public i<S> A0() {
        return this.f66491F;
    }

    /* access modifiers changed from: package-private */
    public LinearLayoutManager D0() {
        return (LinearLayoutManager) this.f66498M.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    public void G0(q qVar) {
        s sVar = (s) this.f66498M.getAdapter();
        int f10 = sVar.f(qVar);
        int f11 = f10 - sVar.f(this.f66494I);
        boolean z10 = false;
        boolean z11 = Math.abs(f11) > 3;
        if (f11 > 0) {
            z10 = true;
        }
        this.f66494I = qVar;
        if (z11 && z10) {
            this.f66498M.w1(f10 - 3);
            F0(f10);
        } else if (z11) {
            this.f66498M.w1(f10 + 3);
            F0(f10);
        } else {
            F0(f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void H0(l lVar) {
        this.f66495J = lVar;
        if (lVar == l.YEAR) {
            this.f66497L.getLayoutManager().X1(((z) this.f66497L.getAdapter()).e(this.f66494I.f66636c));
            this.f66501P.setVisibility(0);
            this.f66502Q.setVisibility(8);
            this.f66499N.setVisibility(8);
            this.f66500O.setVisibility(8);
        } else if (lVar == l.DAY) {
            this.f66501P.setVisibility(8);
            this.f66502Q.setVisibility(0);
            this.f66499N.setVisibility(0);
            this.f66500O.setVisibility(0);
            G0(this.f66494I);
        }
    }

    /* access modifiers changed from: package-private */
    public void J0() {
        l lVar = this.f66495J;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            H0(l.DAY);
        } else if (lVar == l.DAY) {
            H0(lVar2);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f66490E = bundle.getInt("THEME_RES_ID_KEY");
        this.f66491F = (i) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f66492G = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f66493H = (m) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f66494I = (q) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        n nVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f66490E);
        this.f66496K = new c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        q l10 = this.f66492G.l();
        if (MaterialDatePicker.v0(contextThemeWrapper)) {
            i11 = C9074h.f59541y;
            i10 = 1;
        } else {
            i11 = C9074h.f59539w;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        inflate.setMinimumHeight(C0(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(C9072f.f59508z);
        C4600b0.p0(gridView, new c());
        int i12 = this.f66492G.i();
        if (i12 <= 0) {
            nVar = new n();
        }
        gridView.setAdapter(nVar);
        gridView.setNumColumns(l10.f66637d);
        gridView.setEnabled(false);
        this.f66498M = (RecyclerView) inflate.findViewById(C9072f.f59460C);
        this.f66498M.setLayoutManager(new d(getContext(), i10, false, i10));
        this.f66498M.setTag(f66486R);
        s sVar = new s(contextThemeWrapper, this.f66491F, this.f66492G, this.f66493H, new e());
        this.f66498M.setAdapter(sVar);
        int integer = contextThemeWrapper.getResources().getInteger(C9073g.f59511c);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C9072f.f59461D);
        this.f66497L = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f66497L.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f66497L.setAdapter(new z(this));
            this.f66497L.j(w0());
        }
        if (inflate.findViewById(C9072f.f59502t) != null) {
            v0(inflate, sVar);
        }
        if (!MaterialDatePicker.v0(contextThemeWrapper)) {
            new u().b(this.f66498M);
        }
        this.f66498M.w1(sVar.f(this.f66494I));
        I0();
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f66490E);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f66491F);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f66492G);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f66493H);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f66494I);
    }

    public boolean q(t<S> tVar) {
        return super.q(tVar);
    }

    /* access modifiers changed from: package-private */
    public a x0() {
        return this.f66492G;
    }

    /* access modifiers changed from: package-private */
    public c y0() {
        return this.f66496K;
    }

    /* access modifiers changed from: package-private */
    public q z0() {
        return this.f66494I;
    }
}
