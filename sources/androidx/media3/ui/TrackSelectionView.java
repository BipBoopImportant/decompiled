package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kb.C9967v;
import q3.C5807s;
import q3.K;
import q3.L;
import q3.N;
import t3.C5950a;
import w4.C8910B;
import w4.C8915e;
import w4.E;
import w4.z;

public class TrackSelectionView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f43301a;

    /* renamed from: b  reason: collision with root package name */
    private final LayoutInflater f43302b;

    /* renamed from: c  reason: collision with root package name */
    private final CheckedTextView f43303c;

    /* renamed from: d  reason: collision with root package name */
    private final CheckedTextView f43304d;

    /* renamed from: e  reason: collision with root package name */
    private final b f43305e;

    /* renamed from: f  reason: collision with root package name */
    private final List<N.a> f43306f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<K, L> f43307g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f43308h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f43309i;

    /* renamed from: j  reason: collision with root package name */
    private E f43310j;

    /* renamed from: k  reason: collision with root package name */
    private CheckedTextView[][] f43311k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f43312l;

    /* renamed from: m  reason: collision with root package name */
    private Comparator<c> f43313m;

    private class b implements View.OnClickListener {
        private b() {
        }

        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final N.a f43315a;

        /* renamed from: b  reason: collision with root package name */
        public final int f43316b;

        public c(N.a aVar, int i10) {
            this.f43315a = aVar;
            this.f43316b = i10;
        }

        public C5807s a() {
            return this.f43315a.b(this.f43316b);
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map<K, L> b(Map<K, L> map, List<N.a> list, boolean z10) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            L l10 = map.get(list.get(i10).a());
            if (l10 != null && (z10 || hashMap.isEmpty())) {
                hashMap.put(l10.f27950a, l10);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public void c(View view) {
        if (view == this.f43303c) {
            e();
        } else if (view == this.f43304d) {
            d();
        } else {
            f(view);
        }
        i();
    }

    private void d() {
        this.f43312l = false;
        this.f43307g.clear();
    }

    private void e() {
        this.f43312l = true;
        this.f43307g.clear();
    }

    private void f(View view) {
        boolean z10 = false;
        this.f43312l = false;
        c cVar = (c) C5950a.e(view.getTag());
        K a10 = cVar.f43315a.a();
        int i10 = cVar.f43316b;
        L l10 = this.f43307g.get(a10);
        if (l10 == null) {
            if (!this.f43309i && this.f43307g.size() > 0) {
                this.f43307g.clear();
            }
            this.f43307g.put(a10, new L(a10, C9967v.F(Integer.valueOf(i10))));
            return;
        }
        ArrayList arrayList = new ArrayList(l10.f27951b);
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean g10 = g(cVar.f43315a);
        if (g10 || h()) {
            z10 = true;
        }
        if (isChecked && z10) {
            arrayList.remove(Integer.valueOf(i10));
            if (arrayList.isEmpty()) {
                this.f43307g.remove(a10);
            } else {
                this.f43307g.put(a10, new L(a10, arrayList));
            }
        } else if (isChecked) {
        } else {
            if (g10) {
                arrayList.add(Integer.valueOf(i10));
                this.f43307g.put(a10, new L(a10, arrayList));
                return;
            }
            this.f43307g.put(a10, new L(a10, C9967v.F(Integer.valueOf(i10))));
        }
    }

    private boolean g(N.a aVar) {
        return this.f43308h && aVar.d();
    }

    private boolean h() {
        return this.f43309i && this.f43306f.size() > 1;
    }

    private void i() {
        this.f43303c.setChecked(this.f43312l);
        this.f43304d.setChecked(!this.f43312l && this.f43307g.size() == 0);
        for (int i10 = 0; i10 < this.f43311k.length; i10++) {
            L l10 = this.f43307g.get(this.f43306f.get(i10).a());
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f43311k[i10];
                if (i11 >= checkedTextViewArr.length) {
                    break;
                }
                if (l10 != null) {
                    this.f43311k[i10][i11].setChecked(l10.f27951b.contains(Integer.valueOf(((c) C5950a.e(checkedTextViewArr[i11].getTag())).f43316b)));
                } else {
                    checkedTextViewArr[i11].setChecked(false);
                }
                i11++;
            }
        }
    }

    private void j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f43306f.isEmpty()) {
            this.f43303c.setEnabled(false);
            this.f43304d.setEnabled(false);
            return;
        }
        this.f43303c.setEnabled(true);
        this.f43304d.setEnabled(true);
        this.f43311k = new CheckedTextView[this.f43306f.size()][];
        boolean h10 = h();
        for (int i10 = 0; i10 < this.f43306f.size(); i10++) {
            N.a aVar = this.f43306f.get(i10);
            boolean g10 = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f43311k;
            int i11 = aVar.f28058a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            c[] cVarArr = new c[i11];
            for (int i12 = 0; i12 < aVar.f28058a; i12++) {
                cVarArr[i12] = new c(aVar, i12);
            }
            Comparator<c> comparator = this.f43313m;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                if (i13 == 0) {
                    addView(this.f43302b.inflate(z.f57177a, this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f43302b.inflate((g10 || h10) ? 17367056 : 17367055, this, false);
                checkedTextView.setBackgroundResource(this.f43301a);
                checkedTextView.setText(this.f43310j.a(cVarArr[i13].a()));
                checkedTextView.setTag(cVarArr[i13]);
                if (aVar.h(i13)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f43305e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f43311k[i10][i13] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public boolean getIsDisabled() {
        return this.f43312l;
    }

    public Map<K, L> getOverrides() {
        return this.f43307g;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f43308h != z10) {
            this.f43308h = z10;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f43309i != z10) {
            this.f43309i = z10;
            if (!z10 && this.f43307g.size() > 1) {
                Map<K, L> b10 = b(this.f43307g, this.f43306f, false);
                this.f43307g.clear();
                this.f43307g.putAll(b10);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f43303c.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(E e10) {
        this.f43310j = (E) C5950a.e(e10);
        j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f43301a = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f43302b = from;
        b bVar = new b();
        this.f43305e = bVar;
        this.f43310j = new C8915e(getResources());
        this.f43306f = new ArrayList();
        this.f43307g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.f43303c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(C8910B.f57010x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(z.f57177a, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.f43304d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(C8910B.f57009w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
