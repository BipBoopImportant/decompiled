package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import com.sugarcube.app.base.data.source.CatalogRepository;
import d9.M;
import h2.C5415e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p2.d;
import p2.e;
import p2.f;
import p2.h;
import p2.k;
import p2.l;
import q2.b;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: y  reason: collision with root package name */
    private static g f20156y;

    /* renamed from: a  reason: collision with root package name */
    SparseArray<View> f20157a = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<ConstraintHelper> f20158b = new ArrayList<>(4);

    /* renamed from: c  reason: collision with root package name */
    protected f f20159c = new f();

    /* renamed from: d  reason: collision with root package name */
    private int f20160d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f20161e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f20162f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    private int f20163g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f20164h = true;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f20165i = 257;

    /* renamed from: j  reason: collision with root package name */
    private c f20166j = null;

    /* renamed from: k  reason: collision with root package name */
    protected b f20167k = null;

    /* renamed from: l  reason: collision with root package name */
    private int f20168l = -1;

    /* renamed from: m  reason: collision with root package name */
    private HashMap<String, Integer> f20169m = new HashMap<>();

    /* renamed from: n  reason: collision with root package name */
    private int f20170n = -1;

    /* renamed from: o  reason: collision with root package name */
    private int f20171o = -1;

    /* renamed from: p  reason: collision with root package name */
    int f20172p = -1;

    /* renamed from: q  reason: collision with root package name */
    int f20173q = -1;

    /* renamed from: r  reason: collision with root package name */
    int f20174r = 0;

    /* renamed from: s  reason: collision with root package name */
    int f20175s = 0;

    /* renamed from: t  reason: collision with root package name */
    private SparseArray<e> f20176t = new SparseArray<>();

    /* renamed from: u  reason: collision with root package name */
    c f20177u = new c(this);

    /* renamed from: v  reason: collision with root package name */
    private int f20178v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f20179w = 0;

    /* renamed from: x  reason: collision with root package name */
    private ArrayList<d> f20180x;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20181a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                p2.e$b[] r0 = p2.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20181a = r0
                p2.e$b r1 = p2.e.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20181a     // Catch:{ NoSuchFieldError -> 0x001d }
                p2.e$b r1 = p2.e.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20181a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p2.e$b r1 = p2.e.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20181a     // Catch:{ NoSuchFieldError -> 0x0033 }
                p2.e$b r1 = p2.e.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<clinit>():void");
        }
    }

    class c implements b.C0446b {

        /* renamed from: a  reason: collision with root package name */
        ConstraintLayout f20258a;

        /* renamed from: b  reason: collision with root package name */
        int f20259b;

        /* renamed from: c  reason: collision with root package name */
        int f20260c;

        /* renamed from: d  reason: collision with root package name */
        int f20261d;

        /* renamed from: e  reason: collision with root package name */
        int f20262e;

        /* renamed from: f  reason: collision with root package name */
        int f20263f;

        /* renamed from: g  reason: collision with root package name */
        int f20264g;

        c(ConstraintLayout constraintLayout) {
            this.f20258a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            return View.MeasureSpec.getMode(i11) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i12 == View.MeasureSpec.getSize(i11);
        }

        @SuppressLint({"WrongCall"})
        public final void a(e eVar, b.a aVar) {
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            e eVar2 = eVar;
            b.a aVar2 = aVar;
            if (eVar2 != null) {
                if (eVar.X() == 8 && !eVar.l0()) {
                    aVar2.f27767e = 0;
                    aVar2.f27768f = 0;
                    aVar2.f27769g = 0;
                } else if (eVar.L() != null) {
                    C5415e unused = ConstraintLayout.this.getClass();
                    e.b bVar = aVar2.f27763a;
                    e.b bVar2 = aVar2.f27764b;
                    int i17 = aVar2.f27765c;
                    int i18 = aVar2.f27766d;
                    int i19 = this.f20259b + this.f20260c;
                    int i20 = this.f20261d;
                    View view = (View) eVar.s();
                    int[] iArr = a.f20181a;
                    int i21 = iArr[bVar.ordinal()];
                    if (i21 == 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec(i17, CatalogRepository.FETCH_FLAG_SDB);
                    } else if (i21 == 2) {
                        i10 = ViewGroup.getChildMeasureSpec(this.f20263f, i20, -2);
                    } else if (i21 == 3) {
                        i10 = ViewGroup.getChildMeasureSpec(this.f20263f, i20 + eVar.B(), -1);
                    } else if (i21 != 4) {
                        i10 = 0;
                    } else {
                        i10 = ViewGroup.getChildMeasureSpec(this.f20263f, i20, -2);
                        boolean z10 = eVar2.f27484w == 1;
                        int i22 = aVar2.f27772j;
                        if (i22 == b.a.f27761l || i22 == b.a.f27762m) {
                            boolean z11 = view.getMeasuredHeight() == eVar.x();
                            if (aVar2.f27772j == b.a.f27762m || !z10 || ((z10 && z11) || (view instanceof Placeholder) || eVar.p0())) {
                                i10 = View.MeasureSpec.makeMeasureSpec(eVar.Y(), CatalogRepository.FETCH_FLAG_SDB);
                            }
                        }
                    }
                    int i23 = iArr[bVar2.ordinal()];
                    if (i23 == 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec(i18, CatalogRepository.FETCH_FLAG_SDB);
                    } else if (i23 == 2) {
                        i11 = ViewGroup.getChildMeasureSpec(this.f20264g, i19, -2);
                    } else if (i23 == 3) {
                        i11 = ViewGroup.getChildMeasureSpec(this.f20264g, i19 + eVar.W(), -1);
                    } else if (i23 != 4) {
                        i11 = 0;
                    } else {
                        i11 = ViewGroup.getChildMeasureSpec(this.f20264g, i19, -2);
                        boolean z12 = eVar2.f27486x == 1;
                        int i24 = aVar2.f27772j;
                        if (i24 == b.a.f27761l || i24 == b.a.f27762m) {
                            boolean z13 = view.getMeasuredWidth() == eVar.Y();
                            if (aVar2.f27772j == b.a.f27762m || !z12 || ((z12 && z13) || (view instanceof Placeholder) || eVar.q0())) {
                                i11 = View.MeasureSpec.makeMeasureSpec(eVar.x(), CatalogRepository.FETCH_FLAG_SDB);
                            }
                        }
                    }
                    f fVar = (f) eVar.L();
                    if (fVar == null || !k.b(ConstraintLayout.this.f20165i, 256) || view.getMeasuredWidth() != eVar.Y() || view.getMeasuredWidth() >= fVar.Y() || view.getMeasuredHeight() != eVar.x() || view.getMeasuredHeight() >= fVar.x() || view.getBaseline() != eVar.p() || eVar.o0() || !d(eVar.C(), i10, eVar.Y()) || !d(eVar.D(), i11, eVar.x())) {
                        e.b bVar3 = e.b.MATCH_CONSTRAINT;
                        boolean z14 = bVar == bVar3;
                        boolean z15 = bVar2 == bVar3;
                        e.b bVar4 = e.b.MATCH_PARENT;
                        boolean z16 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
                        boolean z17 = bVar == bVar4 || bVar == e.b.FIXED;
                        boolean z18 = z14 && eVar2.f27447d0 > 0.0f;
                        boolean z19 = z15 && eVar2.f27447d0 > 0.0f;
                        if (view != null) {
                            b bVar5 = (b) view.getLayoutParams();
                            int i25 = aVar2.f27772j;
                            if (i25 == b.a.f27761l || i25 == b.a.f27762m || !z14 || eVar2.f27484w != 0 || !z15 || eVar2.f27486x != 0) {
                                if (!(view instanceof VirtualLayout) || !(eVar2 instanceof l)) {
                                    view.measure(i10, i11);
                                } else {
                                    ((VirtualLayout) view).t((l) eVar2, i10, i11);
                                }
                                eVar2.Z0(i10, i11);
                                int measuredWidth = view.getMeasuredWidth();
                                int measuredHeight = view.getMeasuredHeight();
                                i13 = view.getBaseline();
                                int i26 = eVar2.f27490z;
                                i12 = i26 > 0 ? Math.max(i26, measuredWidth) : measuredWidth;
                                int i27 = eVar2.f27404A;
                                if (i27 > 0) {
                                    i12 = Math.min(i27, i12);
                                }
                                int i28 = eVar2.f27408C;
                                if (i28 > 0) {
                                    i14 = Math.max(i28, measuredHeight);
                                    i16 = i10;
                                } else {
                                    i16 = i10;
                                    i14 = measuredHeight;
                                }
                                int i29 = eVar2.f27410D;
                                if (i29 > 0) {
                                    i14 = Math.min(i29, i14);
                                }
                                int i30 = i11;
                                if (!k.b(ConstraintLayout.this.f20165i, 1)) {
                                    if (z18 && z16) {
                                        i12 = (int) ((((float) i14) * eVar2.f27447d0) + 0.5f);
                                    } else if (z19 && z17) {
                                        i14 = (int) ((((float) i12) / eVar2.f27447d0) + 0.5f);
                                    }
                                }
                                if (!(measuredWidth == i12 && measuredHeight == i14)) {
                                    int makeMeasureSpec = measuredWidth != i12 ? View.MeasureSpec.makeMeasureSpec(i12, CatalogRepository.FETCH_FLAG_SDB) : i16;
                                    int makeMeasureSpec2 = measuredHeight != i14 ? View.MeasureSpec.makeMeasureSpec(i14, CatalogRepository.FETCH_FLAG_SDB) : i30;
                                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                                    eVar2.Z0(makeMeasureSpec, makeMeasureSpec2);
                                    i12 = view.getMeasuredWidth();
                                    i14 = view.getMeasuredHeight();
                                    i13 = view.getBaseline();
                                }
                                i15 = -1;
                            } else {
                                i15 = -1;
                                i14 = 0;
                                i13 = 0;
                                i12 = 0;
                            }
                            boolean z20 = i13 != i15;
                            aVar2.f27771i = (i12 == aVar2.f27765c && i14 == aVar2.f27766d) ? false : true;
                            if (bVar5.f20221g0) {
                                z20 = true;
                            }
                            if (!(!z20 || i13 == -1 || eVar.p() == i13)) {
                                aVar2.f27771i = true;
                            }
                            aVar2.f27767e = i12;
                            aVar2.f27768f = i14;
                            aVar2.f27770h = z20;
                            aVar2.f27769g = i13;
                            C5415e unused2 = ConstraintLayout.this.getClass();
                            return;
                        }
                        return;
                    }
                    aVar2.f27767e = eVar.Y();
                    aVar2.f27768f = eVar.x();
                    aVar2.f27769g = eVar.p();
                }
            }
        }

        public final void b() {
            int childCount = this.f20258a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f20258a.getChildAt(i10);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).a(this.f20258a);
                }
            }
            int size = this.f20258a.f20158b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((ConstraintHelper) this.f20258a.f20158b.get(i11)).p(this.f20258a);
                }
            }
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f20259b = i12;
            this.f20260c = i13;
            this.f20261d = i14;
            this.f20262e = i15;
            this.f20263f = i10;
            this.f20264g = i11;
        }
    }

    public interface d {
        boolean a(int i10, int i11, int i12, View view, b bVar);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s(attributeSet, 0, 0);
    }

    private void B(e eVar, b bVar, SparseArray<e> sparseArray, int i10, d.a aVar) {
        View view = this.f20157a.get(i10);
        e eVar2 = sparseArray.get(i10);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof b)) {
            bVar.f20221g0 = true;
            d.a aVar2 = d.a.BASELINE;
            if (aVar == aVar2) {
                b bVar2 = (b) view.getLayoutParams();
                bVar2.f20221g0 = true;
                bVar2.f20251v0.O0(true);
            }
            eVar.o(aVar2).b(eVar2.o(aVar), bVar.f20185D, bVar.f20184C, true);
            eVar.O0(true);
            eVar.o(d.a.TOP).q();
            eVar.o(d.a.BOTTOM).q();
        }
    }

    private boolean C() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            } else if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            y();
        }
        return z10;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static g getSharedValues() {
        if (f20156y == null) {
            f20156y = new g();
        }
        return f20156y;
    }

    private e p(int i10) {
        if (i10 == 0) {
            return this.f20159c;
        }
        View view = this.f20157a.get(i10);
        if (view == null && (view = findViewById(i10)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f20159c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f20251v0;
    }

    private void s(AttributeSet attributeSet, int i10, int i11) {
        this.f20159c.F0(this);
        this.f20159c.b2(this.f20177u);
        this.f20157a.put(getId(), this);
        this.f20166j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f20616V0, i10, i11);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == f.f20702f1) {
                    this.f20160d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f20160d);
                } else if (index == f.f20711g1) {
                    this.f20161e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f20161e);
                } else if (index == f.f20684d1) {
                    this.f20162f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f20162f);
                } else if (index == f.f20693e1) {
                    this.f20163g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f20163g);
                } else if (index == f.f20562O2) {
                    this.f20165i = obtainStyledAttributes.getInt(index, this.f20165i);
                } else if (index == f.f20521J1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            v(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f20167k = null;
                        }
                    }
                } else if (index == f.f20774n1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar = new c();
                        this.f20166j = cVar;
                        cVar.n(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f20166j = null;
                    }
                    this.f20168l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f20159c.c2(this.f20165i);
    }

    private void u() {
        this.f20164h = true;
        this.f20170n = -1;
        this.f20171o = -1;
        this.f20172p = -1;
        this.f20173q = -1;
        this.f20174r = 0;
        this.f20175s = 0;
    }

    private void y() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            e r10 = r(getChildAt(i10));
            if (r10 != null) {
                r10.v0();
            }
        }
        if (isInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    z(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    p(childAt.getId()).G0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f20168l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2.getId() == this.f20168l && (childAt2 instanceof Constraints)) {
                    this.f20166j = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        c cVar = this.f20166j;
        if (cVar != null) {
            cVar.d(this, true);
        }
        this.f20159c.z1();
        int size = this.f20158b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                this.f20158b.get(i13).r(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).b(this);
            }
        }
        this.f20176t.clear();
        this.f20176t.put(0, this.f20159c);
        this.f20176t.put(getId(), this.f20159c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            this.f20176t.put(childAt4.getId(), r(childAt4));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt5 = getChildAt(i16);
            e r11 = r(childAt5);
            if (r11 != null) {
                this.f20159c.a(r11);
                e(isInEditMode, childAt5, r11, (b) childAt5.getLayoutParams(), this.f20176t);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void A(f fVar, int i10, int i11, int i12, int i13) {
        e.b bVar;
        c cVar = this.f20177u;
        int i14 = cVar.f20262e;
        int i15 = cVar.f20261d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i10 != Integer.MIN_VALUE) {
            if (i10 == 0) {
                bVar = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i11 = Math.max(0, this.f20160d);
                }
            } else if (i10 != 1073741824) {
                bVar = bVar2;
            } else {
                i11 = Math.min(this.f20162f - i15, i11);
                bVar = bVar2;
            }
            i11 = 0;
        } else {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f20160d);
            }
        }
        if (i12 != Integer.MIN_VALUE) {
            if (i12 == 0) {
                bVar2 = e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i13 = Math.max(0, this.f20161e);
                }
            } else if (i12 == 1073741824) {
                i13 = Math.min(this.f20163g - i14, i13);
            }
            i13 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f20161e);
            }
        }
        if (!(i11 == fVar.Y() && i13 == fVar.x())) {
            fVar.T1();
        }
        fVar.q1(0);
        fVar.r1(0);
        fVar.b1(this.f20162f - i15);
        fVar.a1(this.f20163g - i14);
        fVar.e1(0);
        fVar.d1(0);
        fVar.T0(bVar);
        fVar.o1(i11);
        fVar.k1(bVar2);
        fVar.P0(i13);
        fVar.e1(this.f20160d - i15);
        fVar.d1(this.f20161e - i14);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f20158b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f20158b.get(i10).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i12 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i13 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = (float) i12;
                        float f11 = (float) i13;
                        float f12 = (float) (i12 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f13 = f11;
                        float f14 = f11;
                        float f15 = f12;
                        float f16 = f10;
                        Paint paint2 = paint;
                        canvas2.drawLine(f10, f13, f15, f14, paint);
                        float parseInt4 = (float) (i13 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f17 = f12;
                        float f18 = parseInt4;
                        canvas2.drawLine(f17, f14, f15, f18, paint);
                        float f19 = parseInt4;
                        float f20 = f16;
                        canvas2.drawLine(f17, f19, f20, f18, paint);
                        float f21 = f16;
                        canvas2.drawLine(f21, f19, f20, f14, paint);
                        paint.setColor(-16711936);
                        float f22 = f12;
                        Paint paint3 = paint;
                        canvas2.drawLine(f21, f14, f22, parseInt4, paint);
                        canvas2.drawLine(f21, parseInt4, f22, f14, paint);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void e(boolean z10, View view, e eVar, b bVar, SparseArray<e> sparseArray) {
        int i10;
        e eVar2;
        e eVar3;
        e eVar4;
        e eVar5;
        View view2 = view;
        e eVar6 = eVar;
        b bVar2 = bVar;
        SparseArray<e> sparseArray2 = sparseArray;
        bVar.a();
        bVar2.f20253w0 = false;
        eVar6.n1(view.getVisibility());
        if (bVar2.f20227j0) {
            eVar6.X0(true);
            eVar6.n1(8);
        }
        eVar6.F0(view2);
        if (view2 instanceof ConstraintHelper) {
            ((ConstraintHelper) view2).n(eVar6, this.f20159c.V1());
        }
        if (bVar2.f20223h0) {
            h hVar = (h) eVar6;
            int i11 = bVar2.f20245s0;
            int i12 = bVar2.f20247t0;
            float f10 = bVar2.f20249u0;
            if (f10 != -1.0f) {
                hVar.D1(f10);
            } else if (i11 != -1) {
                hVar.B1(i11);
            } else if (i12 != -1) {
                hVar.C1(i12);
            }
        } else {
            int i13 = bVar2.f20231l0;
            int i14 = bVar2.f20233m0;
            int i15 = bVar2.f20235n0;
            int i16 = bVar2.f20237o0;
            int i17 = bVar2.f20239p0;
            int i18 = bVar2.f20241q0;
            float f11 = bVar2.f20243r0;
            int i19 = bVar2.f20238p;
            if (i19 != -1) {
                e eVar7 = sparseArray2.get(i19);
                if (eVar7 != null) {
                    eVar6.l(eVar7, bVar2.f20242r, bVar2.f20240q);
                }
            } else {
                if (i13 != -1) {
                    e eVar8 = sparseArray2.get(i13);
                    if (eVar8 != null) {
                        d.a aVar = d.a.LEFT;
                        eVar.g0(aVar, eVar8, aVar, bVar2.leftMargin, i17);
                    }
                } else if (!(i14 == -1 || (eVar5 = sparseArray2.get(i14)) == null)) {
                    eVar.g0(d.a.LEFT, eVar5, d.a.RIGHT, bVar2.leftMargin, i17);
                }
                if (i15 != -1) {
                    e eVar9 = sparseArray2.get(i15);
                    if (eVar9 != null) {
                        eVar.g0(d.a.RIGHT, eVar9, d.a.LEFT, bVar2.rightMargin, i18);
                    }
                } else if (!(i16 == -1 || (eVar4 = sparseArray2.get(i16)) == null)) {
                    d.a aVar2 = d.a.RIGHT;
                    eVar.g0(aVar2, eVar4, aVar2, bVar2.rightMargin, i18);
                }
                int i20 = bVar2.f20224i;
                if (i20 != -1) {
                    e eVar10 = sparseArray2.get(i20);
                    if (eVar10 != null) {
                        d.a aVar3 = d.a.TOP;
                        eVar.g0(aVar3, eVar10, aVar3, bVar2.topMargin, bVar2.f20254x);
                    }
                } else {
                    int i21 = bVar2.f20226j;
                    if (!(i21 == -1 || (eVar3 = sparseArray2.get(i21)) == null)) {
                        eVar.g0(d.a.TOP, eVar3, d.a.BOTTOM, bVar2.topMargin, bVar2.f20254x);
                    }
                }
                int i22 = bVar2.f20228k;
                if (i22 != -1) {
                    e eVar11 = sparseArray2.get(i22);
                    if (eVar11 != null) {
                        eVar.g0(d.a.BOTTOM, eVar11, d.a.TOP, bVar2.bottomMargin, bVar2.f20256z);
                    }
                } else {
                    int i23 = bVar2.f20230l;
                    if (!(i23 == -1 || (eVar2 = sparseArray2.get(i23)) == null)) {
                        d.a aVar4 = d.a.BOTTOM;
                        eVar.g0(aVar4, eVar2, aVar4, bVar2.bottomMargin, bVar2.f20256z);
                    }
                }
                int i24 = bVar2.f20232m;
                if (i24 != -1) {
                    B(eVar, bVar, sparseArray, i24, d.a.BASELINE);
                } else {
                    int i25 = bVar2.f20234n;
                    if (i25 != -1) {
                        B(eVar, bVar, sparseArray, i25, d.a.TOP);
                    } else {
                        int i26 = bVar2.f20236o;
                        if (i26 != -1) {
                            B(eVar, bVar, sparseArray, i26, d.a.BOTTOM);
                        }
                    }
                }
                if (f11 >= 0.0f) {
                    eVar6.Q0(f11);
                }
                float f12 = bVar2.f20189H;
                if (f12 >= 0.0f) {
                    eVar6.h1(f12);
                }
            }
            if (z10 && !((i10 = bVar2.f20205X) == -1 && bVar2.f20206Y == -1)) {
                eVar6.f1(i10, bVar2.f20206Y);
            }
            if (bVar2.f20217e0) {
                eVar6.T0(e.b.FIXED);
                eVar6.o1(bVar2.width);
                if (bVar2.width == -2) {
                    eVar6.T0(e.b.WRAP_CONTENT);
                }
            } else if (bVar2.width == -1) {
                if (bVar2.f20209a0) {
                    eVar6.T0(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar6.T0(e.b.MATCH_PARENT);
                }
                eVar6.o(d.a.LEFT).f27400g = bVar2.leftMargin;
                eVar6.o(d.a.RIGHT).f27400g = bVar2.rightMargin;
            } else {
                eVar6.T0(e.b.MATCH_CONSTRAINT);
                eVar6.o1(0);
            }
            if (bVar2.f20219f0) {
                eVar6.k1(e.b.FIXED);
                eVar6.P0(bVar2.height);
                if (bVar2.height == -2) {
                    eVar6.k1(e.b.WRAP_CONTENT);
                }
            } else if (bVar2.height == -1) {
                if (bVar2.f20211b0) {
                    eVar6.k1(e.b.MATCH_CONSTRAINT);
                } else {
                    eVar6.k1(e.b.MATCH_PARENT);
                }
                eVar6.o(d.a.TOP).f27400g = bVar2.topMargin;
                eVar6.o(d.a.BOTTOM).f27400g = bVar2.bottomMargin;
            } else {
                eVar6.k1(e.b.MATCH_CONSTRAINT);
                eVar6.P0(0);
            }
            eVar6.H0(bVar2.f20190I);
            eVar6.V0(bVar2.f20193L);
            eVar6.m1(bVar2.f20194M);
            eVar6.R0(bVar2.f20195N);
            eVar6.i1(bVar2.f20196O);
            eVar6.p1(bVar2.f20215d0);
            eVar6.U0(bVar2.f20197P, bVar2.f20199R, bVar2.f20201T, bVar2.f20203V);
            eVar6.l1(bVar2.f20198Q, bVar2.f20200S, bVar2.f20202U, bVar2.f20204W);
        }
    }

    /* access modifiers changed from: protected */
    public boolean f(int i10, int i11) {
        boolean z10 = false;
        if (this.f20180x == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        Iterator<d> it = this.f20180x.iterator();
        while (it.hasNext()) {
            d next = it.next();
            Iterator<e> it2 = this.f20159c.w1().iterator();
            while (it2.hasNext()) {
                View view = (View) it2.next().s();
                z10 |= next.a(size, size2, view.getId(), view, (b) view.getLayoutParams());
            }
        }
        return z10;
    }

    public void forceLayout() {
        u();
        super.forceLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public int getMaxHeight() {
        return this.f20163g;
    }

    public int getMaxWidth() {
        return this.f20162f;
    }

    public int getMinHeight() {
        return this.f20161e;
    }

    public int getMinWidth() {
        return this.f20160d;
    }

    public int getOptimizationLevel() {
        return this.f20159c.P1();
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        if (this.f20159c.f27468o == null) {
            int id3 = getId();
            if (id3 != -1) {
                this.f20159c.f27468o = getContext().getResources().getResourceEntryName(id3);
            } else {
                this.f20159c.f27468o = "parent";
            }
        }
        if (this.f20159c.t() == null) {
            f fVar = this.f20159c;
            fVar.G0(fVar.f27468o);
            Log.v("ConstraintLayout", " setDebugName " + this.f20159c.t());
        }
        Iterator<e> it = this.f20159c.w1().iterator();
        while (it.hasNext()) {
            e next = it.next();
            View view = (View) next.s();
            if (view != null) {
                if (next.f27468o == null && (id2 = view.getId()) != -1) {
                    next.f27468o = getContext().getResources().getResourceEntryName(id2);
                }
                if (next.t() == null) {
                    next.G0(next.f27468o);
                    Log.v("ConstraintLayout", " setDebugName " + next.t());
                }
            }
        }
        this.f20159c.P(sb2);
        return sb2.toString();
    }

    /* renamed from: h */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object l(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f20169m;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f20169m.get(str);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            e eVar = bVar.f20251v0;
            if ((childAt.getVisibility() != 8 || bVar.f20223h0 || bVar.f20225i0 || bVar.f20229k0 || isInEditMode) && !bVar.f20227j0) {
                int Z10 = eVar.Z();
                int a02 = eVar.a0();
                int Y10 = eVar.Y() + Z10;
                int x10 = eVar.x() + a02;
                childAt.layout(Z10, a02, Y10, x10);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(Z10, a02, Y10, x10);
                }
            }
        }
        int size = this.f20158b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                this.f20158b.get(i15).o(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean f10 = this.f20164h | f(i10, i11);
        this.f20164h = f10;
        if (!f10) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                } else if (getChildAt(i12).isLayoutRequested()) {
                    this.f20164h = true;
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.f20178v = i10;
        this.f20179w = i11;
        this.f20159c.e2(t());
        if (this.f20164h) {
            this.f20164h = false;
            if (C()) {
                this.f20159c.g2();
            }
        }
        this.f20159c.N1((C5415e) null);
        x(this.f20159c, this.f20165i, i10, i11);
        w(i10, i11, this.f20159c.Y(), this.f20159c.x(), this.f20159c.W1(), this.f20159c.U1());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e r10 = r(view);
        if ((view instanceof Guideline) && !(r10 instanceof h)) {
            b bVar = (b) view.getLayoutParams();
            h hVar = new h();
            bVar.f20251v0 = hVar;
            bVar.f20223h0 = true;
            hVar.E1(bVar.f20207Z);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.s();
            ((b) view.getLayoutParams()).f20225i0 = true;
            if (!this.f20158b.contains(constraintHelper)) {
                this.f20158b.add(constraintHelper);
            }
        }
        this.f20157a.put(view.getId(), view);
        this.f20164h = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f20157a.remove(view.getId());
        this.f20159c.y1(r(view));
        this.f20158b.remove(view);
        this.f20164h = true;
    }

    public View q(int i10) {
        return this.f20157a.get(i10);
    }

    public final e r(View view) {
        if (view == this) {
            return this.f20159c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f20251v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f20251v0;
        }
        return null;
    }

    public void requestLayout() {
        u();
        super.requestLayout();
    }

    public void setConstraintSet(c cVar) {
        this.f20166j = cVar;
    }

    public void setId(int i10) {
        this.f20157a.remove(getId());
        super.setId(i10);
        this.f20157a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 != this.f20163g) {
            this.f20163g = i10;
            requestLayout();
        }
    }

    public void setMaxWidth(int i10) {
        if (i10 != this.f20162f) {
            this.f20162f = i10;
            requestLayout();
        }
    }

    public void setMinHeight(int i10) {
        if (i10 != this.f20161e) {
            this.f20161e = i10;
            requestLayout();
        }
    }

    public void setMinWidth(int i10) {
        if (i10 != this.f20160d) {
            this.f20160d = i10;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(d dVar) {
        b bVar = this.f20167k;
        if (bVar != null) {
            bVar.c(dVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f20165i = i10;
        this.f20159c.c2(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean t() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    /* access modifiers changed from: protected */
    public void v(int i10) {
        this.f20167k = new b(getContext(), this, i10);
    }

    /* access modifiers changed from: protected */
    public void w(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f20177u;
        int i14 = cVar.f20262e;
        int resolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f20261d, i10, 0);
        int min = Math.min(this.f20162f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f20163g, View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215);
        if (z10) {
            min |= 16777216;
        }
        if (z11) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f20170n = min;
        this.f20171o = min2;
    }

    /* access modifiers changed from: protected */
    public void x(f fVar, int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i13 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f20177u.c(i11, i12, max, max2, paddingWidth, i13);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? t() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i14 = size - paddingWidth;
        int i15 = size2 - i13;
        A(fVar, mode, i14, mode2, i15);
        fVar.X1(i10, mode, i14, mode2, i15, this.f20170n, this.f20171o, max5, max);
    }

    public void z(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f20169m == null) {
                this.f20169m = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f20169m.put(str, num);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        s(attributeSet, i10, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        s(attributeSet, i10, i11);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A  reason: collision with root package name */
        public int f20182A = Integer.MIN_VALUE;

        /* renamed from: B  reason: collision with root package name */
        public int f20183B = Integer.MIN_VALUE;

        /* renamed from: C  reason: collision with root package name */
        public int f20184C = Integer.MIN_VALUE;

        /* renamed from: D  reason: collision with root package name */
        public int f20185D = 0;

        /* renamed from: E  reason: collision with root package name */
        boolean f20186E = true;

        /* renamed from: F  reason: collision with root package name */
        boolean f20187F = true;

        /* renamed from: G  reason: collision with root package name */
        public float f20188G = 0.5f;

        /* renamed from: H  reason: collision with root package name */
        public float f20189H = 0.5f;

        /* renamed from: I  reason: collision with root package name */
        public String f20190I = null;

        /* renamed from: J  reason: collision with root package name */
        float f20191J = 0.0f;

        /* renamed from: K  reason: collision with root package name */
        int f20192K = 1;

        /* renamed from: L  reason: collision with root package name */
        public float f20193L = -1.0f;

        /* renamed from: M  reason: collision with root package name */
        public float f20194M = -1.0f;

        /* renamed from: N  reason: collision with root package name */
        public int f20195N = 0;

        /* renamed from: O  reason: collision with root package name */
        public int f20196O = 0;

        /* renamed from: P  reason: collision with root package name */
        public int f20197P = 0;

        /* renamed from: Q  reason: collision with root package name */
        public int f20198Q = 0;

        /* renamed from: R  reason: collision with root package name */
        public int f20199R = 0;

        /* renamed from: S  reason: collision with root package name */
        public int f20200S = 0;

        /* renamed from: T  reason: collision with root package name */
        public int f20201T = 0;

        /* renamed from: U  reason: collision with root package name */
        public int f20202U = 0;

        /* renamed from: V  reason: collision with root package name */
        public float f20203V = 1.0f;

        /* renamed from: W  reason: collision with root package name */
        public float f20204W = 1.0f;

        /* renamed from: X  reason: collision with root package name */
        public int f20205X = -1;

        /* renamed from: Y  reason: collision with root package name */
        public int f20206Y = -1;

        /* renamed from: Z  reason: collision with root package name */
        public int f20207Z = -1;

        /* renamed from: a  reason: collision with root package name */
        public int f20208a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f20209a0 = false;

        /* renamed from: b  reason: collision with root package name */
        public int f20210b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f20211b0 = false;

        /* renamed from: c  reason: collision with root package name */
        public float f20212c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public String f20213c0 = null;

        /* renamed from: d  reason: collision with root package name */
        public boolean f20214d = true;

        /* renamed from: d0  reason: collision with root package name */
        public int f20215d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f20216e = -1;

        /* renamed from: e0  reason: collision with root package name */
        boolean f20217e0 = true;

        /* renamed from: f  reason: collision with root package name */
        public int f20218f = -1;

        /* renamed from: f0  reason: collision with root package name */
        boolean f20219f0 = true;

        /* renamed from: g  reason: collision with root package name */
        public int f20220g = -1;

        /* renamed from: g0  reason: collision with root package name */
        boolean f20221g0 = false;

        /* renamed from: h  reason: collision with root package name */
        public int f20222h = -1;

        /* renamed from: h0  reason: collision with root package name */
        boolean f20223h0 = false;

        /* renamed from: i  reason: collision with root package name */
        public int f20224i = -1;

        /* renamed from: i0  reason: collision with root package name */
        boolean f20225i0 = false;

        /* renamed from: j  reason: collision with root package name */
        public int f20226j = -1;

        /* renamed from: j0  reason: collision with root package name */
        boolean f20227j0 = false;

        /* renamed from: k  reason: collision with root package name */
        public int f20228k = -1;

        /* renamed from: k0  reason: collision with root package name */
        boolean f20229k0 = false;

        /* renamed from: l  reason: collision with root package name */
        public int f20230l = -1;

        /* renamed from: l0  reason: collision with root package name */
        int f20231l0 = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f20232m = -1;

        /* renamed from: m0  reason: collision with root package name */
        int f20233m0 = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f20234n = -1;

        /* renamed from: n0  reason: collision with root package name */
        int f20235n0 = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f20236o = -1;

        /* renamed from: o0  reason: collision with root package name */
        int f20237o0 = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f20238p = -1;

        /* renamed from: p0  reason: collision with root package name */
        int f20239p0 = Integer.MIN_VALUE;

        /* renamed from: q  reason: collision with root package name */
        public int f20240q = 0;

        /* renamed from: q0  reason: collision with root package name */
        int f20241q0 = Integer.MIN_VALUE;

        /* renamed from: r  reason: collision with root package name */
        public float f20242r = 0.0f;

        /* renamed from: r0  reason: collision with root package name */
        float f20243r0 = 0.5f;

        /* renamed from: s  reason: collision with root package name */
        public int f20244s = -1;

        /* renamed from: s0  reason: collision with root package name */
        int f20245s0;

        /* renamed from: t  reason: collision with root package name */
        public int f20246t = -1;

        /* renamed from: t0  reason: collision with root package name */
        int f20247t0;

        /* renamed from: u  reason: collision with root package name */
        public int f20248u = -1;

        /* renamed from: u0  reason: collision with root package name */
        float f20249u0;

        /* renamed from: v  reason: collision with root package name */
        public int f20250v = -1;

        /* renamed from: v0  reason: collision with root package name */
        e f20251v0 = new e();

        /* renamed from: w  reason: collision with root package name */
        public int f20252w = Integer.MIN_VALUE;

        /* renamed from: w0  reason: collision with root package name */
        public boolean f20253w0 = false;

        /* renamed from: x  reason: collision with root package name */
        public int f20254x = Integer.MIN_VALUE;

        /* renamed from: y  reason: collision with root package name */
        public int f20255y = Integer.MIN_VALUE;

        /* renamed from: z  reason: collision with root package name */
        public int f20256z = Integer.MIN_VALUE;

        private static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f20257a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f20257a = sparseIntArray;
                sparseIntArray.append(f.f20883z2, 64);
                sparseIntArray.append(f.f20676c2, 65);
                sparseIntArray.append(f.f20757l2, 8);
                sparseIntArray.append(f.f20766m2, 9);
                sparseIntArray.append(f.f20784o2, 10);
                sparseIntArray.append(f.f20793p2, 11);
                sparseIntArray.append(f.f20847v2, 12);
                sparseIntArray.append(f.f20838u2, 13);
                sparseIntArray.append(f.f20593S1, 14);
                sparseIntArray.append(f.f20585R1, 15);
                sparseIntArray.append(f.f20553N1, 16);
                sparseIntArray.append(f.f20569P1, 52);
                sparseIntArray.append(f.f20561O1, 53);
                sparseIntArray.append(f.f20601T1, 2);
                sparseIntArray.append(f.f20617V1, 3);
                sparseIntArray.append(f.f20609U1, 4);
                sparseIntArray.append(f.f20482E2, 49);
                sparseIntArray.append(f.f20490F2, 50);
                sparseIntArray.append(f.f20649Z1, 5);
                sparseIntArray.append(f.f20658a2, 6);
                sparseIntArray.append(f.f20667b2, 7);
                sparseIntArray.append(f.f20513I1, 67);
                sparseIntArray.append(f.f20624W0, 1);
                sparseIntArray.append(f.f20802q2, 17);
                sparseIntArray.append(f.f20811r2, 18);
                sparseIntArray.append(f.f20641Y1, 19);
                sparseIntArray.append(f.f20633X1, 20);
                sparseIntArray.append(f.f20522J2, 21);
                sparseIntArray.append(f.f20546M2, 22);
                sparseIntArray.append(f.f20530K2, 23);
                sparseIntArray.append(f.f20506H2, 24);
                sparseIntArray.append(f.f20538L2, 25);
                sparseIntArray.append(f.f20514I2, 26);
                sparseIntArray.append(f.f20498G2, 55);
                sparseIntArray.append(f.f20554N2, 54);
                sparseIntArray.append(f.f20721h2, 29);
                sparseIntArray.append(f.f20856w2, 30);
                sparseIntArray.append(f.f20625W1, 44);
                sparseIntArray.append(f.f20739j2, 45);
                sparseIntArray.append(f.f20874y2, 46);
                sparseIntArray.append(f.f20730i2, 47);
                sparseIntArray.append(f.f20865x2, 48);
                sparseIntArray.append(f.f20537L1, 27);
                sparseIntArray.append(f.f20529K1, 28);
                sparseIntArray.append(f.f20447A2, 31);
                sparseIntArray.append(f.f20685d2, 32);
                sparseIntArray.append(f.f20465C2, 33);
                sparseIntArray.append(f.f20456B2, 34);
                sparseIntArray.append(f.f20474D2, 35);
                sparseIntArray.append(f.f20703f2, 36);
                sparseIntArray.append(f.f20694e2, 37);
                sparseIntArray.append(f.f20712g2, 38);
                sparseIntArray.append(f.f20748k2, 39);
                sparseIntArray.append(f.f20829t2, 40);
                sparseIntArray.append(f.f20775n2, 41);
                sparseIntArray.append(f.f20577Q1, 42);
                sparseIntArray.append(f.f20545M1, 43);
                sparseIntArray.append(f.f20820s2, 51);
                sparseIntArray.append(f.f20570P2, 66);
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.leftMargin = marginLayoutParams.leftMargin;
                this.rightMargin = marginLayoutParams.rightMargin;
                this.topMargin = marginLayoutParams.topMargin;
                this.bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.f20208a = bVar.f20208a;
                this.f20210b = bVar.f20210b;
                this.f20212c = bVar.f20212c;
                this.f20214d = bVar.f20214d;
                this.f20216e = bVar.f20216e;
                this.f20218f = bVar.f20218f;
                this.f20220g = bVar.f20220g;
                this.f20222h = bVar.f20222h;
                this.f20224i = bVar.f20224i;
                this.f20226j = bVar.f20226j;
                this.f20228k = bVar.f20228k;
                this.f20230l = bVar.f20230l;
                this.f20232m = bVar.f20232m;
                this.f20234n = bVar.f20234n;
                this.f20236o = bVar.f20236o;
                this.f20238p = bVar.f20238p;
                this.f20240q = bVar.f20240q;
                this.f20242r = bVar.f20242r;
                this.f20244s = bVar.f20244s;
                this.f20246t = bVar.f20246t;
                this.f20248u = bVar.f20248u;
                this.f20250v = bVar.f20250v;
                this.f20252w = bVar.f20252w;
                this.f20254x = bVar.f20254x;
                this.f20255y = bVar.f20255y;
                this.f20256z = bVar.f20256z;
                this.f20182A = bVar.f20182A;
                this.f20183B = bVar.f20183B;
                this.f20184C = bVar.f20184C;
                this.f20185D = bVar.f20185D;
                this.f20188G = bVar.f20188G;
                this.f20189H = bVar.f20189H;
                this.f20190I = bVar.f20190I;
                this.f20191J = bVar.f20191J;
                this.f20192K = bVar.f20192K;
                this.f20193L = bVar.f20193L;
                this.f20194M = bVar.f20194M;
                this.f20195N = bVar.f20195N;
                this.f20196O = bVar.f20196O;
                this.f20209a0 = bVar.f20209a0;
                this.f20211b0 = bVar.f20211b0;
                this.f20197P = bVar.f20197P;
                this.f20198Q = bVar.f20198Q;
                this.f20199R = bVar.f20199R;
                this.f20201T = bVar.f20201T;
                this.f20200S = bVar.f20200S;
                this.f20202U = bVar.f20202U;
                this.f20203V = bVar.f20203V;
                this.f20204W = bVar.f20204W;
                this.f20205X = bVar.f20205X;
                this.f20206Y = bVar.f20206Y;
                this.f20207Z = bVar.f20207Z;
                this.f20217e0 = bVar.f20217e0;
                this.f20219f0 = bVar.f20219f0;
                this.f20221g0 = bVar.f20221g0;
                this.f20223h0 = bVar.f20223h0;
                this.f20231l0 = bVar.f20231l0;
                this.f20233m0 = bVar.f20233m0;
                this.f20235n0 = bVar.f20235n0;
                this.f20237o0 = bVar.f20237o0;
                this.f20239p0 = bVar.f20239p0;
                this.f20241q0 = bVar.f20241q0;
                this.f20243r0 = bVar.f20243r0;
                this.f20213c0 = bVar.f20213c0;
                this.f20215d0 = bVar.f20215d0;
                this.f20251v0 = bVar.f20251v0;
                this.f20186E = bVar.f20186E;
                this.f20187F = bVar.f20187F;
            }
        }

        public void a() {
            this.f20223h0 = false;
            this.f20217e0 = true;
            this.f20219f0 = true;
            int i10 = this.width;
            if (i10 == -2 && this.f20209a0) {
                this.f20217e0 = false;
                if (this.f20197P == 0) {
                    this.f20197P = 1;
                }
            }
            int i11 = this.height;
            if (i11 == -2 && this.f20211b0) {
                this.f20219f0 = false;
                if (this.f20198Q == 0) {
                    this.f20198Q = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f20217e0 = false;
                if (i10 == 0 && this.f20197P == 1) {
                    this.width = -2;
                    this.f20209a0 = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f20219f0 = false;
                if (i11 == 0 && this.f20198Q == 1) {
                    this.height = -2;
                    this.f20211b0 = true;
                }
            }
            if (this.f20212c != -1.0f || this.f20208a != -1 || this.f20210b != -1) {
                this.f20223h0 = true;
                this.f20217e0 = true;
                this.f20219f0 = true;
                if (!(this.f20251v0 instanceof h)) {
                    this.f20251v0 = new h();
                }
                ((h) this.f20251v0).E1(this.f20207Z);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f20235n0 = r4
                r10.f20237o0 = r4
                r10.f20231l0 = r4
                r10.f20233m0 = r4
                int r5 = r10.f20252w
                r10.f20239p0 = r5
                int r5 = r10.f20255y
                r10.f20241q0 = r5
                float r5 = r10.f20188G
                r10.f20243r0 = r5
                int r6 = r10.f20208a
                r10.f20245s0 = r6
                int r7 = r10.f20210b
                r10.f20247t0 = r7
                float r8 = r10.f20212c
                r10.f20249u0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0094
                int r11 = r10.f20244s
                if (r11 == r4) goto L_0x003f
                r10.f20235n0 = r11
            L_0x003d:
                r2 = r3
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f20246t
                if (r11 == r4) goto L_0x0046
                r10.f20237o0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f20248u
                if (r11 == r4) goto L_0x004d
                r10.f20233m0 = r11
                r2 = r3
            L_0x004d:
                int r11 = r10.f20250v
                if (r11 == r4) goto L_0x0054
                r10.f20231l0 = r11
                r2 = r3
            L_0x0054:
                int r11 = r10.f20182A
                if (r11 == r9) goto L_0x005a
                r10.f20241q0 = r11
            L_0x005a:
                int r11 = r10.f20183B
                if (r11 == r9) goto L_0x0060
                r10.f20239p0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f20243r0 = r2
            L_0x0068:
                boolean r2 = r10.f20223h0
                if (r2 == 0) goto L_0x00b8
                int r2 = r10.f20207Z
                if (r2 != r3) goto L_0x00b8
                boolean r2 = r10.f20214d
                if (r2 == 0) goto L_0x00b8
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f20249u0 = r11
                r10.f20245s0 = r4
                r10.f20247t0 = r4
                goto L_0x00b8
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f20247t0 = r6
                r10.f20245s0 = r4
                r10.f20249u0 = r2
                goto L_0x00b8
            L_0x008b:
                if (r7 == r4) goto L_0x00b8
                r10.f20245s0 = r7
                r10.f20247t0 = r4
                r10.f20249u0 = r2
                goto L_0x00b8
            L_0x0094:
                int r11 = r10.f20244s
                if (r11 == r4) goto L_0x009a
                r10.f20233m0 = r11
            L_0x009a:
                int r11 = r10.f20246t
                if (r11 == r4) goto L_0x00a0
                r10.f20231l0 = r11
            L_0x00a0:
                int r11 = r10.f20248u
                if (r11 == r4) goto L_0x00a6
                r10.f20235n0 = r11
            L_0x00a6:
                int r11 = r10.f20250v
                if (r11 == r4) goto L_0x00ac
                r10.f20237o0 = r11
            L_0x00ac:
                int r11 = r10.f20182A
                if (r11 == r9) goto L_0x00b2
                r10.f20239p0 = r11
            L_0x00b2:
                int r11 = r10.f20183B
                if (r11 == r9) goto L_0x00b8
                r10.f20241q0 = r11
            L_0x00b8:
                int r11 = r10.f20248u
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f20250v
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f20246t
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f20244s
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f20220g
                if (r11 == r4) goto L_0x00d7
                r10.f20235n0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
                goto L_0x00e5
            L_0x00d7:
                int r11 = r10.f20222h
                if (r11 == r4) goto L_0x00e5
                r10.f20237o0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
            L_0x00e5:
                int r11 = r10.f20216e
                if (r11 == r4) goto L_0x00f4
                r10.f20231l0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
                goto L_0x0102
            L_0x00f4:
                int r11 = r10.f20218f
                if (r11 == r4) goto L_0x0102
                r10.f20233m0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f20616V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = a.f20257a.get(index);
                switch (i11) {
                    case 1:
                        this.f20207Z = obtainStyledAttributes.getInt(index, this.f20207Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f20238p);
                        this.f20238p = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f20238p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f20240q = obtainStyledAttributes.getDimensionPixelSize(index, this.f20240q);
                        break;
                    case 4:
                        float f10 = obtainStyledAttributes.getFloat(index, this.f20242r) % 360.0f;
                        this.f20242r = f10;
                        if (f10 >= 0.0f) {
                            break;
                        } else {
                            this.f20242r = (360.0f - f10) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f20208a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f20208a);
                        break;
                    case 6:
                        this.f20210b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f20210b);
                        break;
                    case 7:
                        this.f20212c = obtainStyledAttributes.getFloat(index, this.f20212c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f20216e);
                        this.f20216e = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f20216e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f20218f);
                        this.f20218f = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f20218f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f20220g);
                        this.f20220g = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f20220g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f20222h);
                        this.f20222h = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f20222h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f20224i);
                        this.f20224i = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f20224i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f20226j);
                        this.f20226j = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f20226j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f20228k);
                        this.f20228k = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f20228k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f20230l);
                        this.f20230l = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f20230l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f20232m);
                        this.f20232m = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f20232m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f20244s);
                        this.f20244s = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f20244s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f20246t);
                        this.f20246t = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f20246t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f20248u);
                        this.f20248u = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f20248u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f20250v);
                        this.f20250v = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f20250v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f20252w = obtainStyledAttributes.getDimensionPixelSize(index, this.f20252w);
                        break;
                    case 22:
                        this.f20254x = obtainStyledAttributes.getDimensionPixelSize(index, this.f20254x);
                        break;
                    case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                        this.f20255y = obtainStyledAttributes.getDimensionPixelSize(index, this.f20255y);
                        break;
                    case BuildConfig.MIN_SDK_VERSION /*24*/:
                        this.f20256z = obtainStyledAttributes.getDimensionPixelSize(index, this.f20256z);
                        break;
                    case 25:
                        this.f20182A = obtainStyledAttributes.getDimensionPixelSize(index, this.f20182A);
                        break;
                    case 26:
                        this.f20183B = obtainStyledAttributes.getDimensionPixelSize(index, this.f20183B);
                        break;
                    case 27:
                        this.f20209a0 = obtainStyledAttributes.getBoolean(index, this.f20209a0);
                        break;
                    case 28:
                        this.f20211b0 = obtainStyledAttributes.getBoolean(index, this.f20211b0);
                        break;
                    case 29:
                        this.f20188G = obtainStyledAttributes.getFloat(index, this.f20188G);
                        break;
                    case 30:
                        this.f20189H = obtainStyledAttributes.getFloat(index, this.f20189H);
                        break;
                    case 31:
                        int i12 = obtainStyledAttributes.getInt(index, 0);
                        this.f20197P = i12;
                        if (i12 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i13 = obtainStyledAttributes.getInt(index, 0);
                        this.f20198Q = i13;
                        if (i13 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case BuildConfig.TARGET_SDK_VERSION /*33*/:
                        try {
                            this.f20199R = obtainStyledAttributes.getDimensionPixelSize(index, this.f20199R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f20199R) != -2) {
                                break;
                            } else {
                                this.f20199R = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f20201T = obtainStyledAttributes.getDimensionPixelSize(index, this.f20201T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f20201T) != -2) {
                                break;
                            } else {
                                this.f20201T = -2;
                                break;
                            }
                        }
                    case ImageFormat.YUV_420_888 /*35*/:
                        this.f20203V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f20203V));
                        this.f20197P = 2;
                        break;
                    case 36:
                        try {
                            this.f20200S = obtainStyledAttributes.getDimensionPixelSize(index, this.f20200S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f20200S) != -2) {
                                break;
                            } else {
                                this.f20200S = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f20202U = obtainStyledAttributes.getDimensionPixelSize(index, this.f20202U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f20202U) != -2) {
                                break;
                            } else {
                                this.f20202U = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f20204W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f20204W));
                        this.f20198Q = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                c.s(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f20193L = obtainStyledAttributes.getFloat(index, this.f20193L);
                                break;
                            case 46:
                                this.f20194M = obtainStyledAttributes.getFloat(index, this.f20194M);
                                break;
                            case 47:
                                this.f20195N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f20196O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f20205X = obtainStyledAttributes.getDimensionPixelOffset(index, this.f20205X);
                                break;
                            case 50:
                                this.f20206Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f20206Y);
                                break;
                            case 51:
                                this.f20213c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f20234n);
                                this.f20234n = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f20234n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f20236o);
                                this.f20236o = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f20236o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.f20185D = obtainStyledAttributes.getDimensionPixelSize(index, this.f20185D);
                                break;
                            case 55:
                                this.f20184C = obtainStyledAttributes.getDimensionPixelSize(index, this.f20184C);
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        c.q(this, obtainStyledAttributes, index, 0);
                                        this.f20186E = true;
                                        break;
                                    case 65:
                                        c.q(this, obtainStyledAttributes, index, 1);
                                        this.f20187F = true;
                                        break;
                                    case 66:
                                        this.f20215d0 = obtainStyledAttributes.getInt(index, this.f20215d0);
                                        break;
                                    case 67:
                                        this.f20214d = obtainStyledAttributes.getBoolean(index, this.f20214d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public b(int i10, int i11) {
            super(i10, i11);
        }
    }
}
