package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.D;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kb.C9967v;
import q3.C5807s;
import q3.E;
import q3.J;
import q3.K;
import q3.L;
import q3.M;
import q3.N;
import t3.C;
import t3.C5950a;
import t3.N;
import w2.C6214h;
import w4.C8909A;
import w4.C8910B;
import w4.C8915e;
import w4.s;
import w4.u;
import w4.v;
import w4.w;
import w4.x;
import w4.y;
import w4.z;

public class PlayerControlView extends FrameLayout {

    /* renamed from: a1  reason: collision with root package name */
    private static final float[] f43156a1 = {0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final View f43157A;

    /* renamed from: A0  reason: collision with root package name */
    private final String f43158A0;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final View f43159B;
    /* access modifiers changed from: private */

    /* renamed from: B0  reason: collision with root package name */
    public final Drawable f43160B0;

    /* renamed from: C  reason: collision with root package name */
    private final TextView f43161C;
    /* access modifiers changed from: private */

    /* renamed from: C0  reason: collision with root package name */
    public final Drawable f43162C0;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final TextView f43163D;
    /* access modifiers changed from: private */

    /* renamed from: D0  reason: collision with root package name */
    public final String f43164D0;

    /* renamed from: E  reason: collision with root package name */
    private final D f43165E;
    /* access modifiers changed from: private */

    /* renamed from: E0  reason: collision with root package name */
    public final String f43166E0;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final StringBuilder f43167F;

    /* renamed from: F0  reason: collision with root package name */
    private final Drawable f43168F0;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public final Formatter f43169G;

    /* renamed from: G0  reason: collision with root package name */
    private final Drawable f43170G0;

    /* renamed from: H  reason: collision with root package name */
    private final J.b f43171H;

    /* renamed from: H0  reason: collision with root package name */
    private final String f43172H0;

    /* renamed from: I  reason: collision with root package name */
    private final J.c f43173I;

    /* renamed from: I0  reason: collision with root package name */
    private final String f43174I0;

    /* renamed from: J  reason: collision with root package name */
    private final Runnable f43175J;
    /* access modifiers changed from: private */

    /* renamed from: J0  reason: collision with root package name */
    public E f43176J0;

    /* renamed from: K  reason: collision with root package name */
    private final Drawable f43177K;

    /* renamed from: K0  reason: collision with root package name */
    private d f43178K0;

    /* renamed from: L  reason: collision with root package name */
    private final Drawable f43179L;

    /* renamed from: L0  reason: collision with root package name */
    private boolean f43180L0;

    /* renamed from: M  reason: collision with root package name */
    private final Drawable f43181M;

    /* renamed from: M0  reason: collision with root package name */
    private boolean f43182M0;

    /* renamed from: N  reason: collision with root package name */
    private final Drawable f43183N;

    /* renamed from: N0  reason: collision with root package name */
    private boolean f43184N0;

    /* renamed from: O  reason: collision with root package name */
    private final Drawable f43185O;
    /* access modifiers changed from: private */

    /* renamed from: O0  reason: collision with root package name */
    public boolean f43186O0 = true;

    /* renamed from: P  reason: collision with root package name */
    private final String f43187P;

    /* renamed from: P0  reason: collision with root package name */
    private boolean f43188P0;

    /* renamed from: Q  reason: collision with root package name */
    private final String f43189Q;
    /* access modifiers changed from: private */

    /* renamed from: Q0  reason: collision with root package name */
    public boolean f43190Q0;

    /* renamed from: R  reason: collision with root package name */
    private final String f43191R;

    /* renamed from: R0  reason: collision with root package name */
    private int f43192R0 = 5000;

    /* renamed from: S  reason: collision with root package name */
    private final Drawable f43193S;

    /* renamed from: S0  reason: collision with root package name */
    private int f43194S0 = 200;

    /* renamed from: T  reason: collision with root package name */
    private final Drawable f43195T;
    /* access modifiers changed from: private */

    /* renamed from: T0  reason: collision with root package name */
    public int f43196T0 = 0;

    /* renamed from: U  reason: collision with root package name */
    private final float f43197U;

    /* renamed from: U0  reason: collision with root package name */
    private long[] f43198U0;

    /* renamed from: V0  reason: collision with root package name */
    private boolean[] f43199V0;

    /* renamed from: W0  reason: collision with root package name */
    private long[] f43200W0;

    /* renamed from: X0  reason: collision with root package name */
    private boolean[] f43201X0;

    /* renamed from: Y0  reason: collision with root package name */
    private long f43202Y0;
    /* access modifiers changed from: private */

    /* renamed from: Z0  reason: collision with root package name */
    public boolean f43203Z0;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final t f43204a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f43205b;

    /* renamed from: c  reason: collision with root package name */
    private final c f43206c;

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f43207d;

    /* renamed from: e  reason: collision with root package name */
    private final RecyclerView f43208e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final h f43209f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final e f43210g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final j f43211h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final b f43212i;

    /* renamed from: j  reason: collision with root package name */
    private final w4.E f43213j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final PopupWindow f43214k;

    /* renamed from: l  reason: collision with root package name */
    private final int f43215l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f43216m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f43217n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f43218o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final View f43219p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final View f43220q;

    /* renamed from: r  reason: collision with root package name */
    private final TextView f43221r;

    /* renamed from: s  reason: collision with root package name */
    private final TextView f43222s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f43223t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f43224u;

    /* renamed from: v  reason: collision with root package name */
    private final ImageView f43225v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f43226w;

    /* renamed from: x  reason: collision with root package name */
    private final ImageView f43227x;

    /* renamed from: y  reason: collision with root package name */
    private final ImageView f43228y;

    /* renamed from: y0  reason: collision with root package name */
    private final float f43229y0;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final View f43230z;

    /* renamed from: z0  reason: collision with root package name */
    private final String f43231z0;

    private final class b extends l {
        private b() {
            super();
        }

        private boolean k(M m10) {
            for (int i10 = 0; i10 < this.f43252h.size(); i10++) {
                if (m10.f27985A.containsKey(this.f43252h.get(i10).f43249a.a())) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void m(View view) {
            if (PlayerControlView.this.f43176J0 != null && PlayerControlView.this.f43176J0.w(29)) {
                ((E) N.i(PlayerControlView.this.f43176J0)).X(PlayerControlView.this.f43176J0.C().a().D(1).N(1, false).C());
                PlayerControlView.this.f43209f.f(1, PlayerControlView.this.getResources().getString(C8910B.f57009w));
                PlayerControlView.this.f43214k.dismiss();
            }
        }

        public void g(i iVar) {
            iVar.f43246e.setText(C8910B.f57009w);
            iVar.f43247f.setVisibility(k(((E) C5950a.e(PlayerControlView.this.f43176J0)).C()) ? 4 : 0);
            iVar.itemView.setOnClickListener(new C6993b(this));
        }

        public void i(String str) {
            PlayerControlView.this.f43209f.f(1, str);
        }

        public void l(List<k> list) {
            this.f43252h = list;
            M C10 = ((E) C5950a.e(PlayerControlView.this.f43176J0)).C();
            if (list.isEmpty()) {
                PlayerControlView.this.f43209f.f(1, PlayerControlView.this.getResources().getString(C8910B.f57010x));
            } else if (!k(C10)) {
                PlayerControlView.this.f43209f.f(1, PlayerControlView.this.getResources().getString(C8910B.f57009w));
            } else {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    k kVar = list.get(i10);
                    if (kVar.a()) {
                        PlayerControlView.this.f43209f.f(1, kVar.f43251c);
                        return;
                    }
                }
            }
        }
    }

    private final class c implements E.d, D.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        public void C(D d10, long j10) {
            boolean unused = PlayerControlView.this.f43190Q0 = true;
            if (PlayerControlView.this.f43163D != null) {
                PlayerControlView.this.f43163D.setText(N.m0(PlayerControlView.this.f43167F, PlayerControlView.this.f43169G, j10));
            }
            PlayerControlView.this.f43204a.V();
        }

        public void G(D d10, long j10) {
            if (PlayerControlView.this.f43163D != null) {
                PlayerControlView.this.f43163D.setText(N.m0(PlayerControlView.this.f43167F, PlayerControlView.this.f43169G, j10));
            }
        }

        public void K(D d10, long j10, boolean z10) {
            boolean unused = PlayerControlView.this.f43190Q0 = false;
            if (!z10 && PlayerControlView.this.f43176J0 != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.l0(playerControlView.f43176J0, j10);
            }
            PlayerControlView.this.f43204a.W();
        }

        public void d0(E e10, E.c cVar) {
            if (cVar.a(4, 5, 13)) {
                PlayerControlView.this.v0();
            }
            if (cVar.a(4, 5, 7, 13)) {
                PlayerControlView.this.x0();
            }
            if (cVar.a(8, 13)) {
                PlayerControlView.this.y0();
            }
            if (cVar.a(9, 13)) {
                PlayerControlView.this.C0();
            }
            if (cVar.a(8, 9, 11, 0, 16, 17, 13)) {
                PlayerControlView.this.u0();
            }
            if (cVar.a(11, 0, 13)) {
                PlayerControlView.this.D0();
            }
            if (cVar.a(12, 13)) {
                PlayerControlView.this.w0();
            }
            if (cVar.a(2, 13)) {
                PlayerControlView.this.E0();
            }
        }

        public void onClick(View view) {
            E j10 = PlayerControlView.this.f43176J0;
            if (j10 != null) {
                PlayerControlView.this.f43204a.W();
                if (PlayerControlView.this.f43217n == view) {
                    if (j10.w(9)) {
                        j10.D();
                    }
                } else if (PlayerControlView.this.f43216m == view) {
                    if (j10.w(7)) {
                        j10.o();
                    }
                } else if (PlayerControlView.this.f43219p == view) {
                    if (j10.V() != 4 && j10.w(12)) {
                        j10.e0();
                    }
                } else if (PlayerControlView.this.f43220q == view) {
                    if (j10.w(11)) {
                        j10.f0();
                    }
                } else if (PlayerControlView.this.f43218o == view) {
                    N.v0(j10, PlayerControlView.this.f43186O0);
                } else if (PlayerControlView.this.f43223t == view) {
                    if (j10.w(15)) {
                        j10.Z(C.a(j10.b0(), PlayerControlView.this.f43196T0));
                    }
                } else if (PlayerControlView.this.f43224u == view) {
                    if (j10.w(14)) {
                        j10.I(!j10.c0());
                    }
                } else if (PlayerControlView.this.f43230z == view) {
                    PlayerControlView.this.f43204a.V();
                    PlayerControlView playerControlView = PlayerControlView.this;
                    playerControlView.V(playerControlView.f43209f, PlayerControlView.this.f43230z);
                } else if (PlayerControlView.this.f43157A == view) {
                    PlayerControlView.this.f43204a.V();
                    PlayerControlView playerControlView2 = PlayerControlView.this;
                    playerControlView2.V(playerControlView2.f43210g, PlayerControlView.this.f43157A);
                } else if (PlayerControlView.this.f43159B == view) {
                    PlayerControlView.this.f43204a.V();
                    PlayerControlView playerControlView3 = PlayerControlView.this;
                    playerControlView3.V(playerControlView3.f43212i, PlayerControlView.this.f43159B);
                } else if (PlayerControlView.this.f43226w == view) {
                    PlayerControlView.this.f43204a.V();
                    PlayerControlView playerControlView4 = PlayerControlView.this;
                    playerControlView4.V(playerControlView4.f43211h, PlayerControlView.this.f43226w);
                }
            }
        }

        public void onDismiss() {
            if (PlayerControlView.this.f43203Z0) {
                PlayerControlView.this.f43204a.W();
            }
        }
    }

    @Deprecated
    public interface d {
        void G(boolean z10);
    }

    private final class e extends RecyclerView.h<i> {

        /* renamed from: h  reason: collision with root package name */
        private final String[] f43234h;

        /* renamed from: i  reason: collision with root package name */
        private final float[] f43235i;

        /* renamed from: j  reason: collision with root package name */
        private int f43236j;

        public e(String[] strArr, float[] fArr) {
            this.f43234h = strArr;
            this.f43235i = fArr;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void e(int i10, View view) {
            if (i10 != this.f43236j) {
                PlayerControlView.this.setPlaybackSpeed(this.f43235i[i10]);
            }
            PlayerControlView.this.f43214k.dismiss();
        }

        public String d() {
            return this.f43234h[this.f43236j];
        }

        /* renamed from: f */
        public void onBindViewHolder(i iVar, int i10) {
            String[] strArr = this.f43234h;
            if (i10 < strArr.length) {
                iVar.f43246e.setText(strArr[i10]);
            }
            if (i10 == this.f43236j) {
                iVar.itemView.setSelected(true);
                iVar.f43247f.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f43247f.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new C6994c(this, i10));
        }

        /* renamed from: g */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(z.f57182f, viewGroup, false));
        }

        public int getItemCount() {
            return this.f43234h.length;
        }

        public void h(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.f43235i;
                if (i10 < fArr.length) {
                    float abs = Math.abs(f10 - fArr[i10]);
                    if (abs < f11) {
                        i11 = i10;
                        f11 = abs;
                    }
                    i10++;
                } else {
                    this.f43236j = i11;
                    return;
                }
            }
        }
    }

    public interface f {
    }

    private final class g extends RecyclerView.G {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final TextView f43238e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final TextView f43239f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final ImageView f43240g;

        public g(View view) {
            super(view);
            if (N.f29462a < 26) {
                view.setFocusable(true);
            }
            this.f43238e = (TextView) view.findViewById(x.f57170v);
            this.f43239f = (TextView) view.findViewById(x.f57143Q);
            this.f43240g = (ImageView) view.findViewById(x.f57168t);
            view.setOnClickListener(new C6995d(this));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void g(View view) {
            PlayerControlView.this.i0(getBindingAdapterPosition());
        }
    }

    private class h extends RecyclerView.h<g> {

        /* renamed from: h  reason: collision with root package name */
        private final String[] f43242h;

        /* renamed from: i  reason: collision with root package name */
        private final String[] f43243i;

        /* renamed from: j  reason: collision with root package name */
        private final Drawable[] f43244j;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f43242h = strArr;
            this.f43243i = new String[strArr.length];
            this.f43244j = drawableArr;
        }

        private boolean g(int i10) {
            if (PlayerControlView.this.f43176J0 == null) {
                return false;
            }
            if (i10 == 0) {
                return PlayerControlView.this.f43176J0.w(13);
            }
            if (i10 != 1) {
                return true;
            }
            return PlayerControlView.this.f43176J0.w(30) && PlayerControlView.this.f43176J0.w(29);
        }

        public boolean c() {
            return g(1) || g(0);
        }

        /* renamed from: d */
        public void onBindViewHolder(g gVar, int i10) {
            if (g(i10)) {
                gVar.itemView.setLayoutParams(new RecyclerView.r(-1, -2));
            } else {
                gVar.itemView.setLayoutParams(new RecyclerView.r(0, 0));
            }
            gVar.f43238e.setText(this.f43242h[i10]);
            if (this.f43243i[i10] == null) {
                gVar.f43239f.setVisibility(8);
            } else {
                gVar.f43239f.setText(this.f43243i[i10]);
            }
            if (this.f43244j[i10] == null) {
                gVar.f43240g.setVisibility(8);
            } else {
                gVar.f43240g.setImageDrawable(this.f43244j[i10]);
            }
        }

        /* renamed from: e */
        public g onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new g(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(z.f57181e, viewGroup, false));
        }

        public void f(int i10, String str) {
            this.f43243i[i10] = str;
        }

        public int getItemCount() {
            return this.f43242h.length;
        }

        public long getItemId(int i10) {
            return (long) i10;
        }
    }

    private static class i extends RecyclerView.G {

        /* renamed from: e  reason: collision with root package name */
        public final TextView f43246e;

        /* renamed from: f  reason: collision with root package name */
        public final View f43247f;

        public i(View view) {
            super(view);
            if (N.f29462a < 26) {
                view.setFocusable(true);
            }
            this.f43246e = (TextView) view.findViewById(x.f57146T);
            this.f43247f = view.findViewById(x.f57156h);
        }
    }

    private final class j extends l {
        private j() {
            super();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l(View view) {
            if (PlayerControlView.this.f43176J0 != null && PlayerControlView.this.f43176J0.w(29)) {
                PlayerControlView.this.f43176J0.X(PlayerControlView.this.f43176J0.C().a().D(3).H(-3).J((String) null).M(0).C());
                PlayerControlView.this.f43214k.dismiss();
            }
        }

        /* renamed from: f */
        public void onBindViewHolder(i iVar, int i10) {
            super.onBindViewHolder(iVar, i10);
            if (i10 > 0) {
                iVar.f43247f.setVisibility(this.f43252h.get(i10 + -1).a() ? 0 : 4);
            }
        }

        public void g(i iVar) {
            boolean z10;
            iVar.f43246e.setText(C8910B.f57010x);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= this.f43252h.size()) {
                    z10 = true;
                    break;
                } else if (this.f43252h.get(i11).a()) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            View view = iVar.f43247f;
            if (!z10) {
                i10 = 4;
            }
            view.setVisibility(i10);
            iVar.itemView.setOnClickListener(new e(this));
        }

        public void i(String str) {
        }

        public void k(List<k> list) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                } else if (list.get(i10).a()) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (PlayerControlView.this.f43226w != null) {
                ImageView D10 = PlayerControlView.this.f43226w;
                PlayerControlView playerControlView = PlayerControlView.this;
                D10.setImageDrawable(z10 ? playerControlView.f43160B0 : playerControlView.f43162C0);
                PlayerControlView.this.f43226w.setContentDescription(z10 ? PlayerControlView.this.f43164D0 : PlayerControlView.this.f43166E0);
            }
            this.f43252h = list;
        }
    }

    private static final class k {

        /* renamed from: a  reason: collision with root package name */
        public final N.a f43249a;

        /* renamed from: b  reason: collision with root package name */
        public final int f43250b;

        /* renamed from: c  reason: collision with root package name */
        public final String f43251c;

        public k(q3.N n10, int i10, int i11, String str) {
            this.f43249a = n10.a().get(i10);
            this.f43250b = i11;
            this.f43251c = str;
        }

        public boolean a() {
            return this.f43249a.g(this.f43250b);
        }
    }

    private abstract class l extends RecyclerView.h<i> {

        /* renamed from: h  reason: collision with root package name */
        protected List<k> f43252h = new ArrayList();

        protected l() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void e(E e10, K k10, k kVar, View view) {
            if (e10.w(29)) {
                e10.X(e10.C().a().I(new L(k10, C9967v.F(Integer.valueOf(kVar.f43250b)))).N(kVar.f43249a.c(), false).C());
                i(kVar.f43251c);
                PlayerControlView.this.f43214k.dismiss();
            }
        }

        /* access modifiers changed from: protected */
        public void d() {
            this.f43252h = Collections.emptyList();
        }

        /* renamed from: f */
        public void onBindViewHolder(i iVar, int i10) {
            E j10 = PlayerControlView.this.f43176J0;
            if (j10 != null) {
                if (i10 == 0) {
                    g(iVar);
                    return;
                }
                boolean z10 = true;
                k kVar = this.f43252h.get(i10 - 1);
                K a10 = kVar.f43249a.a();
                int i11 = 0;
                if (j10.C().f27985A.get(a10) == null || !kVar.a()) {
                    z10 = false;
                }
                iVar.f43246e.setText(kVar.f43251c);
                View view = iVar.f43247f;
                if (!z10) {
                    i11 = 4;
                }
                view.setVisibility(i11);
                iVar.itemView.setOnClickListener(new f(this, j10, a10, kVar));
            }
        }

        /* access modifiers changed from: protected */
        public abstract void g(i iVar);

        public int getItemCount() {
            if (this.f43252h.isEmpty()) {
                return 0;
            }
            return this.f43252h.size() + 1;
        }

        /* renamed from: h */
        public i onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(z.f57182f, viewGroup, false));
        }

        /* access modifiers changed from: protected */
        public abstract void i(String str);
    }

    @Deprecated
    public interface m {
        void C(int i10);
    }

    static {
        q3.x.a("media3.ui");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayerControlView(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i21;
        int i22;
        PlayerControlView playerControlView;
        int i23;
        int i24;
        int i25;
        int i26;
        ImageView imageView;
        c cVar;
        int i27;
        boolean z18;
        boolean z19;
        boolean z20;
        int i28;
        int i29;
        int i30;
        PlayerControlView playerControlView2;
        ImageView imageView2;
        boolean z21;
        Context context2 = context;
        AttributeSet attributeSet3 = attributeSet2;
        int i31 = z.f57178b;
        int i32 = v.f57113g;
        int i33 = v.f57112f;
        int i34 = v.f57111e;
        int i35 = v.f57120n;
        int i36 = v.f57114h;
        int i37 = v.f57121o;
        int i38 = v.f57110d;
        int i39 = v.f57109c;
        int i40 = v.f57116j;
        int i41 = v.f57117k;
        int i42 = v.f57115i;
        int i43 = v.f57119m;
        int i44 = v.f57118l;
        int i45 = v.f57124r;
        int i46 = v.f57123q;
        int i47 = v.f57125s;
        if (attributeSet3 != null) {
            int i48 = i42;
            int i49 = i43;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, w4.D.f57082y, i10, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(w4.D.f57014A, i31);
                int resourceId2 = obtainStyledAttributes.getResourceId(w4.D.f57020G, i32);
                int resourceId3 = obtainStyledAttributes.getResourceId(w4.D.f57019F, i33);
                int resourceId4 = obtainStyledAttributes.getResourceId(w4.D.f57018E, i34);
                i35 = obtainStyledAttributes.getResourceId(w4.D.f57015B, i35);
                int resourceId5 = obtainStyledAttributes.getResourceId(w4.D.f57021H, i36);
                int resourceId6 = obtainStyledAttributes.getResourceId(w4.D.f57026M, i37);
                int resourceId7 = obtainStyledAttributes.getResourceId(w4.D.f57017D, i38);
                int resourceId8 = obtainStyledAttributes.getResourceId(w4.D.f57016C, i39);
                int resourceId9 = obtainStyledAttributes.getResourceId(w4.D.f57023J, i40);
                int resourceId10 = obtainStyledAttributes.getResourceId(w4.D.f57024K, i41);
                int resourceId11 = obtainStyledAttributes.getResourceId(w4.D.f57022I, i48);
                int resourceId12 = obtainStyledAttributes.getResourceId(w4.D.f57036W, i49);
                int i50 = resourceId;
                int resourceId13 = obtainStyledAttributes.getResourceId(w4.D.f57035V, i44);
                int resourceId14 = obtainStyledAttributes.getResourceId(w4.D.f57038Y, i45);
                int resourceId15 = obtainStyledAttributes.getResourceId(w4.D.f57037X, i46);
                int resourceId16 = obtainStyledAttributes.getResourceId(w4.D.f57041a0, i47);
                int i51 = resourceId4;
                playerControlView = this;
                try {
                    playerControlView.f43192R0 = obtainStyledAttributes.getInt(w4.D.f57033T, playerControlView.f43192R0);
                    playerControlView.f43196T0 = X(obtainStyledAttributes, playerControlView.f43196T0);
                    boolean z22 = obtainStyledAttributes.getBoolean(w4.D.f57030Q, true);
                    boolean z23 = obtainStyledAttributes.getBoolean(w4.D.f57027N, true);
                    boolean z24 = obtainStyledAttributes.getBoolean(w4.D.f57029P, true);
                    boolean z25 = obtainStyledAttributes.getBoolean(w4.D.f57028O, true);
                    boolean z26 = obtainStyledAttributes.getBoolean(w4.D.f57031R, false);
                    boolean z27 = obtainStyledAttributes.getBoolean(w4.D.f57032S, false);
                    boolean z28 = obtainStyledAttributes.getBoolean(w4.D.f57034U, false);
                    playerControlView.setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(w4.D.f57039Z, playerControlView.f43194S0));
                    boolean z29 = obtainStyledAttributes.getBoolean(w4.D.f57083z, true);
                    obtainStyledAttributes.recycle();
                    i25 = resourceId13;
                    i24 = i50;
                    z10 = z29;
                    i11 = resourceId6;
                    i17 = resourceId7;
                    i16 = resourceId8;
                    i15 = resourceId9;
                    i14 = resourceId10;
                    i13 = resourceId11;
                    i12 = resourceId12;
                    i21 = resourceId15;
                    i26 = resourceId16;
                    z17 = z22;
                    z16 = z23;
                    z15 = z24;
                    z14 = z25;
                    z13 = z26;
                    z12 = z27;
                    z11 = z28;
                    i20 = resourceId2;
                    i19 = resourceId3;
                    i23 = resourceId5;
                    i22 = resourceId14;
                    i18 = i51;
                } catch (Throwable th2) {
                    th = th2;
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i26 = i47;
            int i52 = i46;
            int i53 = i45;
            i18 = i34;
            playerControlView = this;
            int i54 = i31;
            int i55 = i44;
            i11 = i37;
            i17 = i38;
            i16 = i39;
            i15 = i40;
            i14 = i41;
            i13 = i42;
            i12 = i43;
            i21 = i52;
            z17 = true;
            z16 = true;
            z15 = true;
            z14 = true;
            z13 = false;
            z12 = false;
            z11 = false;
            z10 = true;
            i20 = i32;
            i19 = i33;
            i23 = i36;
            i22 = i53;
            int i56 = i55;
            i24 = i54;
            i25 = i56;
        }
        LayoutInflater.from(context).inflate(i24, playerControlView);
        playerControlView.setDescendantFocusability(262144);
        c cVar2 = new c();
        playerControlView.f43206c = cVar2;
        playerControlView.f43207d = new CopyOnWriteArrayList<>();
        playerControlView.f43171H = new J.b();
        playerControlView.f43173I = new J.c();
        StringBuilder sb2 = new StringBuilder();
        playerControlView.f43167F = sb2;
        int i57 = i23;
        playerControlView.f43169G = new Formatter(sb2, Locale.getDefault());
        playerControlView.f43198U0 = new long[0];
        playerControlView.f43199V0 = new boolean[0];
        playerControlView.f43200W0 = new long[0];
        playerControlView.f43201X0 = new boolean[0];
        playerControlView.f43175J = new w4.f(playerControlView);
        playerControlView.f43161C = (TextView) playerControlView.findViewById(x.f57161m);
        playerControlView.f43163D = (TextView) playerControlView.findViewById(x.f57133G);
        ImageView imageView3 = (ImageView) playerControlView.findViewById(x.f57144R);
        playerControlView.f43226w = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(cVar2);
        }
        ImageView imageView4 = (ImageView) playerControlView.findViewById(x.f57167s);
        playerControlView.f43227x = imageView4;
        b0(imageView4, new w4.g(playerControlView));
        ImageView imageView5 = (ImageView) playerControlView.findViewById(x.f57172x);
        playerControlView.f43228y = imageView5;
        b0(imageView5, new w4.g(playerControlView));
        View findViewById = playerControlView.findViewById(x.f57140N);
        playerControlView.f43230z = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(cVar2);
        }
        View findViewById2 = playerControlView.findViewById(x.f57132F);
        playerControlView.f43157A = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(cVar2);
        }
        View findViewById3 = playerControlView.findViewById(x.f57151c);
        playerControlView.f43159B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(cVar2);
        }
        D d10 = (D) playerControlView.findViewById(x.f57135I);
        View findViewById4 = playerControlView.findViewById(x.f57136J);
        if (d10 != null) {
            playerControlView.f43165E = d10;
            i27 = i11;
            cVar = cVar2;
            playerControlView2 = playerControlView;
            imageView = imageView3;
            z18 = z14;
            i28 = i57;
            z19 = z15;
            i29 = i18;
            z20 = z17;
            i30 = i35;
        } else if (findViewById4 != null) {
            DefaultTimeBar defaultTimeBar = r2;
            i27 = i11;
            cVar = cVar2;
            View view = findViewById4;
            z18 = z14;
            i28 = i57;
            imageView = imageView3;
            z19 = z15;
            i29 = i18;
            z20 = z17;
            i30 = i35;
            DefaultTimeBar defaultTimeBar2 = new DefaultTimeBar(context, (AttributeSet) null, 0, attributeSet2, w4.C.f57013a);
            DefaultTimeBar defaultTimeBar3 = defaultTimeBar;
            defaultTimeBar3.setId(x.f57135I);
            defaultTimeBar3.setLayoutParams(view.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            View view2 = view;
            int indexOfChild = viewGroup.indexOfChild(view2);
            viewGroup.removeView(view2);
            viewGroup.addView(defaultTimeBar3, indexOfChild);
            playerControlView2 = this;
            playerControlView2.f43165E = defaultTimeBar3;
        } else {
            i27 = i11;
            cVar = cVar2;
            playerControlView2 = playerControlView;
            imageView = imageView3;
            z18 = z14;
            i28 = i57;
            z19 = z15;
            i29 = i18;
            z20 = z17;
            i30 = i35;
            playerControlView2.f43165E = null;
        }
        D d11 = playerControlView2.f43165E;
        c cVar3 = cVar;
        if (d11 != null) {
            d11.a(cVar3);
        }
        Resources resources = context.getResources();
        playerControlView2.f43205b = resources;
        ImageView imageView6 = (ImageView) playerControlView2.findViewById(x.f57131E);
        playerControlView2.f43218o = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(cVar3);
        }
        ImageView imageView7 = (ImageView) playerControlView2.findViewById(x.f57134H);
        playerControlView2.f43216m = imageView7;
        Context context3 = context;
        if (imageView7 != null) {
            imageView7.setImageDrawable(t3.N.X(context3, resources, i28));
            imageView7.setOnClickListener(cVar3);
        }
        ImageView imageView8 = (ImageView) playerControlView2.findViewById(x.f57173y);
        playerControlView2.f43217n = imageView8;
        if (imageView8 != null) {
            imageView8.setImageDrawable(t3.N.X(context3, resources, i29));
            imageView8.setOnClickListener(cVar3);
        }
        Typeface g10 = C6214h.g(context3, w.f57126a);
        ImageView imageView9 = (ImageView) playerControlView2.findViewById(x.f57138L);
        ImageView imageView10 = imageView8;
        TextView textView = (TextView) playerControlView2.findViewById(x.f57139M);
        if (imageView9 != null) {
            imageView2 = imageView7;
            imageView9.setImageDrawable(t3.N.X(context3, resources, i27));
            playerControlView2.f43220q = imageView9;
            playerControlView2.f43222s = null;
        } else {
            imageView2 = imageView7;
            if (textView != null) {
                textView.setTypeface(g10);
                playerControlView2.f43222s = textView;
                playerControlView2.f43220q = textView;
            } else {
                playerControlView2.f43222s = null;
                playerControlView2.f43220q = null;
            }
        }
        View view3 = playerControlView2.f43220q;
        if (view3 != null) {
            view3.setOnClickListener(cVar3);
        }
        ImageView imageView11 = (ImageView) playerControlView2.findViewById(x.f57165q);
        TextView textView2 = (TextView) playerControlView2.findViewById(x.f57166r);
        if (imageView11 != null) {
            imageView11.setImageDrawable(t3.N.X(context3, resources, i30));
            playerControlView2.f43219p = imageView11;
            playerControlView2.f43221r = null;
        } else if (textView2 != null) {
            textView2.setTypeface(g10);
            playerControlView2.f43221r = textView2;
            playerControlView2.f43219p = textView2;
        } else {
            playerControlView2.f43221r = null;
            playerControlView2.f43219p = null;
        }
        View view4 = playerControlView2.f43219p;
        if (view4 != null) {
            view4.setOnClickListener(cVar3);
        }
        ImageView imageView12 = (ImageView) playerControlView2.findViewById(x.f57137K);
        playerControlView2.f43223t = imageView12;
        if (imageView12 != null) {
            imageView12.setOnClickListener(cVar3);
        }
        ImageView imageView13 = (ImageView) playerControlView2.findViewById(x.f57141O);
        playerControlView2.f43224u = imageView13;
        if (imageView13 != null) {
            imageView13.setOnClickListener(cVar3);
        }
        playerControlView2.f43197U = ((float) resources.getInteger(y.f57176b)) / 100.0f;
        playerControlView2.f43229y0 = ((float) resources.getInteger(y.f57175a)) / 100.0f;
        ImageView imageView14 = (ImageView) playerControlView2.findViewById(x.f57148V);
        playerControlView2.f43225v = imageView14;
        if (imageView14 != null) {
            imageView14.setImageDrawable(t3.N.X(context3, resources, i26));
            playerControlView2.p0(false, imageView14);
        }
        t tVar = new t(playerControlView2);
        playerControlView2.f43204a = tVar;
        tVar.X(z10);
        ImageView imageView15 = imageView12;
        h hVar = new h(new String[]{resources.getString(C8910B.f56994h), resources.getString(C8910B.f57011y)}, new Drawable[]{t3.N.X(context3, resources, v.f57122p), t3.N.X(context3, resources, v.f57108b)});
        playerControlView2.f43209f = hVar;
        playerControlView2.f43215l = resources.getDimensionPixelSize(u.f57103a);
        ImageView imageView16 = imageView14;
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(z.f57180d, (ViewGroup) null);
        playerControlView2.f43208e = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow(recyclerView, -2, -2, true);
        playerControlView2.f43214k = popupWindow;
        if (t3.N.f29462a < 23) {
            z21 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z21 = false;
        }
        popupWindow.setOnDismissListener(cVar3);
        playerControlView2.f43203Z0 = true;
        playerControlView2.f43213j = new C8915e(getResources());
        playerControlView2.f43160B0 = t3.N.X(context3, resources, i22);
        playerControlView2.f43162C0 = t3.N.X(context3, resources, i21);
        playerControlView2.f43164D0 = resources.getString(C8910B.f56988b);
        playerControlView2.f43166E0 = resources.getString(C8910B.f56987a);
        playerControlView2.f43211h = new j();
        playerControlView2.f43212i = new b();
        playerControlView2.f43210g = new e(resources.getStringArray(s.f57101a), f43156a1);
        playerControlView2.f43177K = t3.N.X(context3, resources, i20);
        playerControlView2.f43179L = t3.N.X(context3, resources, i19);
        playerControlView2.f43168F0 = t3.N.X(context3, resources, i17);
        playerControlView2.f43170G0 = t3.N.X(context3, resources, i16);
        playerControlView2.f43181M = t3.N.X(context3, resources, i15);
        playerControlView2.f43183N = t3.N.X(context3, resources, i14);
        playerControlView2.f43185O = t3.N.X(context3, resources, i13);
        playerControlView2.f43193S = t3.N.X(context3, resources, i12);
        playerControlView2.f43195T = t3.N.X(context3, resources, i25);
        playerControlView2.f43172H0 = resources.getString(C8910B.f56990d);
        playerControlView2.f43174I0 = resources.getString(C8910B.f56989c);
        playerControlView2.f43187P = resources.getString(C8910B.f56996j);
        playerControlView2.f43189Q = resources.getString(C8910B.f56997k);
        playerControlView2.f43191R = resources.getString(C8910B.f56995i);
        playerControlView2.f43231z0 = resources.getString(C8910B.f57000n);
        playerControlView2.f43158A0 = resources.getString(C8910B.f56999m);
        tVar.Y((ViewGroup) playerControlView2.findViewById(x.f57153e), true);
        tVar.Y(playerControlView2.f43219p, z16);
        tVar.Y(playerControlView2.f43220q, z20);
        tVar.Y(imageView2, z19);
        tVar.Y(imageView10, z18);
        tVar.Y(imageView13, z13);
        tVar.Y(imageView, z12);
        tVar.Y(imageView16, z11);
        tVar.Y(imageView15, playerControlView2.f43196T0 != 0 ? true : z21);
        playerControlView2.addOnLayoutChangeListener(new w4.h(playerControlView2));
    }

    private void A0() {
        p0(this.f43209f.c(), this.f43230z);
    }

    private void B0() {
        this.f43208e.measure(0, 0);
        this.f43214k.setWidth(Math.min(this.f43208e.getMeasuredWidth(), getWidth() - (this.f43215l * 2)));
        this.f43214k.setHeight(Math.min(getHeight() - (this.f43215l * 2), this.f43208e.getMeasuredHeight()));
    }

    /* access modifiers changed from: private */
    public void C0() {
        ImageView imageView;
        if (e0() && this.f43182M0 && (imageView = this.f43224u) != null) {
            E e10 = this.f43176J0;
            if (!this.f43204a.A(imageView)) {
                p0(false, this.f43224u);
            } else if (e10 == null || !e10.w(14)) {
                p0(false, this.f43224u);
                this.f43224u.setImageDrawable(this.f43195T);
                this.f43224u.setContentDescription(this.f43158A0);
            } else {
                p0(true, this.f43224u);
                this.f43224u.setImageDrawable(e10.c0() ? this.f43193S : this.f43195T);
                this.f43224u.setContentDescription(e10.c0() ? this.f43231z0 : this.f43158A0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void D0() {
        int i10;
        long j10;
        J.c cVar;
        E e10 = this.f43176J0;
        if (e10 != null) {
            boolean z10 = true;
            this.f43188P0 = this.f43184N0 && T(e10, this.f43173I);
            this.f43202Y0 = 0;
            J z11 = e10.w(17) ? e10.z() : J.f27893a;
            if (!z11.q()) {
                int Y10 = e10.Y();
                boolean z12 = this.f43188P0;
                int i11 = z12 ? 0 : Y10;
                int p10 = z12 ? z11.p() - 1 : Y10;
                long j11 = 0;
                i10 = 0;
                while (true) {
                    if (i11 > p10) {
                        break;
                    }
                    if (i11 == Y10) {
                        this.f43202Y0 = t3.N.q1(j11);
                    }
                    z11.n(i11, this.f43173I);
                    J.c cVar2 = this.f43173I;
                    if (cVar2.f27937m == -9223372036854775807L) {
                        C5950a.g(this.f43188P0 ^ z10);
                        break;
                    }
                    int i12 = cVar2.f27938n;
                    while (true) {
                        cVar = this.f43173I;
                        if (i12 > cVar.f27939o) {
                            break;
                        }
                        z11.f(i12, this.f43171H);
                        int c10 = this.f43171H.c();
                        for (int o10 = this.f43171H.o(); o10 < c10; o10++) {
                            long f10 = this.f43171H.f(o10);
                            if (f10 == Long.MIN_VALUE) {
                                long j12 = this.f43171H.f27905d;
                                if (j12 == -9223372036854775807L) {
                                } else {
                                    f10 = j12;
                                }
                            }
                            long n10 = f10 + this.f43171H.n();
                            if (n10 >= 0) {
                                long[] jArr = this.f43198U0;
                                if (i10 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.f43198U0 = Arrays.copyOf(jArr, length);
                                    this.f43199V0 = Arrays.copyOf(this.f43199V0, length);
                                }
                                this.f43198U0[i10] = t3.N.q1(j11 + n10);
                                this.f43199V0[i10] = this.f43171H.p(o10);
                                i10++;
                            }
                        }
                        i12++;
                    }
                    j11 += cVar.f27937m;
                    i11++;
                    z10 = true;
                }
                j10 = j11;
            } else {
                if (e10.w(16)) {
                    long K10 = e10.K();
                    if (K10 != -9223372036854775807L) {
                        j10 = t3.N.P0(K10);
                        i10 = 0;
                    }
                }
                j10 = 0;
                i10 = 0;
            }
            long q12 = t3.N.q1(j10);
            TextView textView = this.f43161C;
            if (textView != null) {
                textView.setText(t3.N.m0(this.f43167F, this.f43169G, q12));
            }
            D d10 = this.f43165E;
            if (d10 != null) {
                d10.setDuration(q12);
                int length2 = this.f43200W0.length;
                int i13 = i10 + length2;
                long[] jArr2 = this.f43198U0;
                if (i13 > jArr2.length) {
                    this.f43198U0 = Arrays.copyOf(jArr2, i13);
                    this.f43199V0 = Arrays.copyOf(this.f43199V0, i13);
                }
                System.arraycopy(this.f43200W0, 0, this.f43198U0, i10, length2);
                System.arraycopy(this.f43201X0, 0, this.f43199V0, i10, length2);
                this.f43165E.b(this.f43198U0, this.f43199V0, i13);
            }
            x0();
        }
    }

    /* access modifiers changed from: private */
    public void E0() {
        a0();
        p0(this.f43211h.getItemCount() > 0, this.f43226w);
        A0();
    }

    private static boolean T(E e10, J.c cVar) {
        J z10;
        int p10;
        if (!e10.w(17) || (p10 = z10.p()) <= 1 || p10 > 100) {
            return false;
        }
        for (int i10 = 0; i10 < p10; i10++) {
            if ((z10 = e10.z()).n(i10, cVar).f27937m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void V(RecyclerView.h<?> hVar, View view) {
        this.f43208e.setAdapter(hVar);
        B0();
        this.f43203Z0 = false;
        this.f43214k.dismiss();
        this.f43203Z0 = true;
        this.f43214k.showAsDropDown(view, (getWidth() - this.f43214k.getWidth()) - this.f43215l, (-this.f43214k.getHeight()) - this.f43215l);
    }

    private C9967v<k> W(q3.N n10, int i10) {
        C9967v.a aVar = new C9967v.a();
        C9967v<N.a> a10 = n10.a();
        for (int i11 = 0; i11 < a10.size(); i11++) {
            N.a aVar2 = a10.get(i11);
            if (aVar2.c() == i10) {
                for (int i12 = 0; i12 < aVar2.f28058a; i12++) {
                    if (aVar2.h(i12)) {
                        C5807s b10 = aVar2.b(i12);
                        if ((b10.f28234e & 2) == 0) {
                            aVar.a(new k(n10, i11, i12, this.f43213j.a(b10)));
                        }
                    }
                }
            }
        }
        return aVar.k();
    }

    private static int X(TypedArray typedArray, int i10) {
        return typedArray.getInt(w4.D.f57025L, i10);
    }

    private void a0() {
        this.f43211h.d();
        this.f43212i.d();
        E e10 = this.f43176J0;
        if (e10 != null && e10.w(30) && this.f43176J0.w(29)) {
            q3.N r10 = this.f43176J0.r();
            this.f43212i.l(W(r10, 1));
            if (this.f43204a.A(this.f43226w)) {
                this.f43211h.k(W(r10, 3));
            } else {
                this.f43211h.k(C9967v.E());
            }
        }
    }

    private static void b0(View view, View.OnClickListener onClickListener) {
        if (view != null) {
            view.setVisibility(8);
            view.setOnClickListener(onClickListener);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean d0(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    /* access modifiers changed from: private */
    public void g0(View view) {
        t0(!this.f43180L0);
    }

    /* access modifiers changed from: private */
    public void h0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.f43214k.isShowing()) {
            B0();
            this.f43214k.update(view, (getWidth() - this.f43214k.getWidth()) - this.f43215l, (-this.f43214k.getHeight()) - this.f43215l, -1, -1);
        }
    }

    /* access modifiers changed from: private */
    public void i0(int i10) {
        if (i10 == 0) {
            V(this.f43210g, (View) C5950a.e(this.f43230z));
        } else if (i10 == 1) {
            V(this.f43212i, (View) C5950a.e(this.f43230z));
        } else {
            this.f43214k.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void l0(E e10, long j10) {
        if (this.f43188P0) {
            if (e10.w(17) && e10.w(10)) {
                J z10 = e10.z();
                int p10 = z10.p();
                int i10 = 0;
                while (true) {
                    long d10 = z10.n(i10, this.f43173I).d();
                    if (j10 < d10) {
                        break;
                    } else if (i10 == p10 - 1) {
                        j10 = d10;
                        break;
                    } else {
                        j10 -= d10;
                        i10++;
                    }
                }
                e10.F(i10, j10);
            }
        } else if (e10.w(5)) {
            e10.R(j10);
        }
        x0();
    }

    private boolean m0() {
        E e10 = this.f43176J0;
        return e10 != null && e10.w(1) && (!this.f43176J0.w(17) || !this.f43176J0.z().q());
    }

    private void p0(boolean z10, View view) {
        if (view != null) {
            view.setEnabled(z10);
            view.setAlpha(z10 ? this.f43197U : this.f43229y0);
        }
    }

    private void q0() {
        E e10 = this.f43176J0;
        int S10 = (int) ((e10 != null ? e10.S() : 15000) / 1000);
        TextView textView = this.f43221r;
        if (textView != null) {
            textView.setText(String.valueOf(S10));
        }
        View view = this.f43219p;
        if (view != null) {
            view.setContentDescription(this.f43205b.getQuantityString(C8909A.f56980a, S10, new Object[]{Integer.valueOf(S10)}));
        }
    }

    private void r0(ImageView imageView, boolean z10) {
        if (imageView != null) {
            if (z10) {
                imageView.setImageDrawable(this.f43168F0);
                imageView.setContentDescription(this.f43172H0);
                return;
            }
            imageView.setImageDrawable(this.f43170G0);
            imageView.setContentDescription(this.f43174I0);
        }
    }

    private static void s0(View view, boolean z10) {
        if (view != null) {
            if (z10) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        E e10 = this.f43176J0;
        if (e10 != null && e10.w(13)) {
            E e11 = this.f43176J0;
            e11.g(e11.e().b(f10));
        }
    }

    /* access modifiers changed from: private */
    public void u0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (e0() && this.f43182M0) {
            E e10 = this.f43176J0;
            if (e10 != null) {
                z13 = (!this.f43184N0 || !T(e10, this.f43173I)) ? e10.w(5) : e10.w(10);
                z12 = e10.w(7);
                z11 = e10.w(11);
                z10 = e10.w(12);
                z14 = e10.w(9);
            } else {
                z13 = false;
                z14 = false;
                z12 = false;
                z11 = false;
                z10 = false;
            }
            if (z11) {
                z0();
            }
            if (z10) {
                q0();
            }
            p0(z12, this.f43216m);
            p0(z11, this.f43220q);
            p0(z10, this.f43219p);
            p0(z14, this.f43217n);
            D d10 = this.f43165E;
            if (d10 != null) {
                d10.setEnabled(z13);
            }
        }
    }

    /* access modifiers changed from: private */
    public void v0() {
        if (e0() && this.f43182M0 && this.f43218o != null) {
            boolean e12 = t3.N.e1(this.f43176J0, this.f43186O0);
            Drawable drawable = e12 ? this.f43177K : this.f43179L;
            int i10 = e12 ? C8910B.f56993g : C8910B.f56992f;
            this.f43218o.setImageDrawable(drawable);
            this.f43218o.setContentDescription(this.f43205b.getString(i10));
            p0(m0(), this.f43218o);
        }
    }

    /* access modifiers changed from: private */
    public void w0() {
        E e10 = this.f43176J0;
        if (e10 != null) {
            this.f43210g.h(e10.e().f27859a);
            this.f43209f.f(0, this.f43210g.d());
            A0();
        }
    }

    /* access modifiers changed from: private */
    public void x0() {
        long j10;
        long j11;
        if (e0() && this.f43182M0) {
            E e10 = this.f43176J0;
            if (e10 == null || !e10.w(16)) {
                j11 = 0;
                j10 = 0;
            } else {
                j11 = this.f43202Y0 + e10.T();
                j10 = this.f43202Y0 + e10.d0();
            }
            TextView textView = this.f43163D;
            if (textView != null && !this.f43190Q0) {
                textView.setText(t3.N.m0(this.f43167F, this.f43169G, j11));
            }
            D d10 = this.f43165E;
            if (d10 != null) {
                d10.setPosition(j11);
                this.f43165E.setBufferedPosition(j10);
            }
            removeCallbacks(this.f43175J);
            int V10 = e10 == null ? 1 : e10.V();
            long j12 = 1000;
            if (e10 != null && e10.W()) {
                D d11 = this.f43165E;
                long min = Math.min(d11 != null ? d11.getPreferredUpdateDelay() : 1000, 1000 - (j11 % 1000));
                float f10 = e10.e().f27859a;
                if (f10 > 0.0f) {
                    j12 = (long) (((float) min) / f10);
                }
                postDelayed(this.f43175J, t3.N.q(j12, (long) this.f43194S0, 1000));
            } else if (V10 != 4 && V10 != 1) {
                postDelayed(this.f43175J, 1000);
            }
        }
    }

    /* access modifiers changed from: private */
    public void y0() {
        ImageView imageView;
        if (e0() && this.f43182M0 && (imageView = this.f43223t) != null) {
            if (this.f43196T0 == 0) {
                p0(false, imageView);
                return;
            }
            E e10 = this.f43176J0;
            if (e10 == null || !e10.w(15)) {
                p0(false, this.f43223t);
                this.f43223t.setImageDrawable(this.f43181M);
                this.f43223t.setContentDescription(this.f43187P);
                return;
            }
            p0(true, this.f43223t);
            int b02 = e10.b0();
            if (b02 == 0) {
                this.f43223t.setImageDrawable(this.f43181M);
                this.f43223t.setContentDescription(this.f43187P);
            } else if (b02 == 1) {
                this.f43223t.setImageDrawable(this.f43183N);
                this.f43223t.setContentDescription(this.f43189Q);
            } else if (b02 == 2) {
                this.f43223t.setImageDrawable(this.f43185O);
                this.f43223t.setContentDescription(this.f43191R);
            }
        }
    }

    private void z0() {
        E e10 = this.f43176J0;
        int i02 = (int) ((e10 != null ? e10.i0() : 5000) / 1000);
        TextView textView = this.f43222s;
        if (textView != null) {
            textView.setText(String.valueOf(i02));
        }
        View view = this.f43220q;
        if (view != null) {
            view.setContentDescription(this.f43205b.getQuantityString(C8909A.f56981b, i02, new Object[]{Integer.valueOf(i02)}));
        }
    }

    @Deprecated
    public void S(m mVar) {
        C5950a.e(mVar);
        this.f43207d.add(mVar);
    }

    public boolean U(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        E e10 = this.f43176J0;
        if (e10 == null || !d0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (e10.V() == 4 || !e10.w(12)) {
                return true;
            }
            e10.e0();
            return true;
        } else if (keyCode == 89 && e10.w(11)) {
            e10.f0();
            return true;
        } else if (keyEvent.getRepeatCount() != 0) {
            return true;
        } else {
            if (keyCode == 79 || keyCode == 85) {
                t3.N.v0(e10, this.f43186O0);
                return true;
            } else if (keyCode != 87) {
                if (keyCode != 88) {
                    if (keyCode == 126) {
                        t3.N.u0(e10);
                        return true;
                    } else if (keyCode != 127) {
                        return true;
                    } else {
                        t3.N.t0(e10);
                        return true;
                    }
                } else if (!e10.w(7)) {
                    return true;
                } else {
                    e10.o();
                    return true;
                }
            } else if (!e10.w(9)) {
                return true;
            } else {
                e10.D();
                return true;
            }
        }
    }

    public void Y() {
        this.f43204a.C();
    }

    public void Z() {
        this.f43204a.F();
    }

    public boolean c0() {
        return this.f43204a.I();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return U(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean e0() {
        return getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        Iterator<m> it = this.f43207d.iterator();
        while (it.hasNext()) {
            it.next().C(getVisibility());
        }
    }

    public E getPlayer() {
        return this.f43176J0;
    }

    public int getRepeatToggleModes() {
        return this.f43196T0;
    }

    public boolean getShowShuffleButton() {
        return this.f43204a.A(this.f43224u);
    }

    public boolean getShowSubtitleButton() {
        return this.f43204a.A(this.f43226w);
    }

    public int getShowTimeoutMs() {
        return this.f43192R0;
    }

    public boolean getShowVrButton() {
        return this.f43204a.A(this.f43225v);
    }

    @Deprecated
    public void j0(m mVar) {
        this.f43207d.remove(mVar);
    }

    /* access modifiers changed from: package-private */
    public void k0() {
        ImageView imageView = this.f43218o;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void n0() {
        this.f43204a.b0();
    }

    /* access modifiers changed from: package-private */
    public void o0() {
        v0();
        u0();
        y0();
        C0();
        E0();
        w0();
        D0();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43204a.O();
        this.f43182M0 = true;
        if (c0()) {
            this.f43204a.W();
        }
        o0();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43204a.P();
        this.f43182M0 = false;
        removeCallbacks(this.f43175J);
        this.f43204a.V();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f43204a.Q(z10, i10, i11, i12, i13);
    }

    public void setAnimationEnabled(boolean z10) {
        this.f43204a.X(z10);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(d dVar) {
        this.f43178K0 = dVar;
        boolean z10 = false;
        s0(this.f43227x, dVar != null);
        ImageView imageView = this.f43228y;
        if (dVar != null) {
            z10 = true;
        }
        s0(imageView, z10);
    }

    public void setPlayer(E e10) {
        boolean z10 = false;
        C5950a.g(Looper.myLooper() == Looper.getMainLooper());
        if (e10 == null || e10.B() == Looper.getMainLooper()) {
            z10 = true;
        }
        C5950a.a(z10);
        E e11 = this.f43176J0;
        if (e11 != e10) {
            if (e11 != null) {
                e11.A(this.f43206c);
            }
            this.f43176J0 = e10;
            if (e10 != null) {
                e10.u(this.f43206c);
            }
            o0();
        }
    }

    public void setProgressUpdateListener(f fVar) {
    }

    public void setRepeatToggleModes(int i10) {
        this.f43196T0 = i10;
        E e10 = this.f43176J0;
        boolean z10 = false;
        if (e10 != null && e10.w(15)) {
            int b02 = this.f43176J0.b0();
            if (i10 == 0 && b02 != 0) {
                this.f43176J0.Z(0);
            } else if (i10 == 1 && b02 == 2) {
                this.f43176J0.Z(1);
            } else if (i10 == 2 && b02 == 1) {
                this.f43176J0.Z(2);
            }
        }
        t tVar = this.f43204a;
        ImageView imageView = this.f43223t;
        if (i10 != 0) {
            z10 = true;
        }
        tVar.Y(imageView, z10);
        y0();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f43204a.Y(this.f43219p, z10);
        u0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f43184N0 = z10;
        D0();
    }

    public void setShowNextButton(boolean z10) {
        this.f43204a.Y(this.f43217n, z10);
        u0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.f43186O0 = z10;
        v0();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f43204a.Y(this.f43216m, z10);
        u0();
    }

    public void setShowRewindButton(boolean z10) {
        this.f43204a.Y(this.f43220q, z10);
        u0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f43204a.Y(this.f43224u, z10);
        C0();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f43204a.Y(this.f43226w, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f43192R0 = i10;
        if (c0()) {
            this.f43204a.W();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f43204a.Y(this.f43225v, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f43194S0 = t3.N.p(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f43225v;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            p0(onClickListener != null, this.f43225v);
        }
    }

    public void t0(boolean z10) {
        if (this.f43180L0 != z10) {
            this.f43180L0 = z10;
            r0(this.f43227x, z10);
            r0(this.f43228y, z10);
            d dVar = this.f43178K0;
            if (dVar != null) {
                dVar.G(z10);
            }
        }
    }
}
