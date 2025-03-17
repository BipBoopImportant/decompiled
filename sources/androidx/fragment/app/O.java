package androidx.fragment.app;

import I2.C4600b0;
import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.a0;
import androidx.lifecycle.k0;

class O {

    /* renamed from: a  reason: collision with root package name */
    private final B f21915a;

    /* renamed from: b  reason: collision with root package name */
    private final P f21916b;

    /* renamed from: c  reason: collision with root package name */
    private final C5187o f21917c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f21918d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f21919e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f21920a;

        a(View view) {
            this.f21920a = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f21920a.removeOnAttachStateChangeListener(this);
            C4600b0.l0(this.f21920a);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21922a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.r$b[] r0 = androidx.lifecycle.r.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21922a = r0
                androidx.lifecycle.r$b r1 = androidx.lifecycle.r.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21922a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.r$b r1 = androidx.lifecycle.r.b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21922a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.r$b r1 = androidx.lifecycle.r.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21922a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.r$b r1 = androidx.lifecycle.r.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.O.b.<clinit>():void");
        }
    }

    O(B b10, P p10, C5187o oVar) {
        this.f21915a = b10;
        this.f21916b = p10;
        this.f21917c = oVar;
    }

    private boolean l(View view) {
        if (view == this.f21917c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f21917c.mView) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f21917c);
        }
        Bundle bundle = this.f21917c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f21917c.performActivityCreated(bundle2);
        this.f21915a.a(this.f21917c, bundle2, false);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        C5187o t02 = FragmentManager.t0(this.f21917c.mContainer);
        C5187o parentFragment = this.f21917c.getParentFragment();
        if (t02 != null && !t02.equals(parentFragment)) {
            C5187o oVar = this.f21917c;
            c3.b.o(oVar, t02, oVar.mContainerId);
        }
        int j10 = this.f21916b.j(this.f21917c);
        C5187o oVar2 = this.f21917c;
        oVar2.mContainer.addView(oVar2.mView, j10);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f21917c);
        }
        C5187o oVar = this.f21917c;
        C5187o oVar2 = oVar.mTarget;
        O o10 = null;
        if (oVar2 != null) {
            O n10 = this.f21916b.n(oVar2.mWho);
            if (n10 != null) {
                C5187o oVar3 = this.f21917c;
                oVar3.mTargetWho = oVar3.mTarget.mWho;
                oVar3.mTarget = null;
                o10 = n10;
            } else {
                throw new IllegalStateException("Fragment " + this.f21917c + " declared target fragment " + this.f21917c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = oVar.mTargetWho;
            if (str != null && (o10 = this.f21916b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f21917c + " declared target fragment " + this.f21917c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (o10 != null) {
            o10.m();
        }
        C5187o oVar4 = this.f21917c;
        oVar4.mHost = oVar4.mFragmentManager.H0();
        C5187o oVar5 = this.f21917c;
        oVar5.mParentFragment = oVar5.mFragmentManager.K0();
        this.f21915a.g(this.f21917c, false);
        this.f21917c.performAttach();
        this.f21915a.b(this.f21917c, false);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        C5187o oVar = this.f21917c;
        if (oVar.mFragmentManager == null) {
            return oVar.mState;
        }
        int i10 = this.f21919e;
        int i11 = b.f21922a[oVar.mMaxState.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? i11 != 3 ? i11 != 4 ? Math.min(i10, -1) : Math.min(i10, 0) : Math.min(i10, 1) : Math.min(i10, 5);
        }
        C5187o oVar2 = this.f21917c;
        if (oVar2.mFromLayout) {
            if (oVar2.mInLayout) {
                i10 = Math.max(this.f21919e, 2);
                View view = this.f21917c.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f21919e < 4 ? Math.min(i10, oVar2.mState) : Math.min(i10, 1);
            }
        }
        C5187o oVar3 = this.f21917c;
        if (oVar3.mInDynamicContainer && oVar3.mContainer == null) {
            i10 = Math.min(i10, 4);
        }
        if (!this.f21917c.mAdded) {
            i10 = Math.min(i10, 1);
        }
        C5187o oVar4 = this.f21917c;
        ViewGroup viewGroup = oVar4.mContainer;
        a0.d.a s10 = viewGroup != null ? a0.u(viewGroup, oVar4.getParentFragmentManager()).s(this) : null;
        if (s10 == a0.d.a.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (s10 == a0.d.a.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            C5187o oVar5 = this.f21917c;
            if (oVar5.mRemoving) {
                i10 = oVar5.isInBackStack() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        C5187o oVar6 = this.f21917c;
        if (oVar6.mDeferStart && oVar6.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        if (this.f21917c.mTransitioning) {
            i10 = Math.max(i10, 3);
        }
        if (FragmentManager.U0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f21917c);
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f21917c);
        }
        Bundle bundle = this.f21917c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        C5187o oVar = this.f21917c;
        if (!oVar.mIsCreated) {
            this.f21915a.h(oVar, bundle2, false);
            this.f21917c.performCreate(bundle2);
            this.f21915a.c(this.f21917c, bundle2, false);
            return;
        }
        oVar.mState = 1;
        oVar.restoreChildFragmentState();
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String str;
        if (!this.f21917c.mFromLayout) {
            if (FragmentManager.U0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f21917c);
            }
            Bundle bundle = this.f21917c.mSavedFragmentState;
            ViewGroup viewGroup = null;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater performGetLayoutInflater = this.f21917c.performGetLayoutInflater(bundle2);
            C5187o oVar = this.f21917c;
            ViewGroup viewGroup2 = oVar.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i10 = oVar.mContainerId;
                if (i10 != 0) {
                    if (i10 != -1) {
                        viewGroup = (ViewGroup) oVar.mFragmentManager.B0().c(this.f21917c.mContainerId);
                        if (viewGroup == null) {
                            C5187o oVar2 = this.f21917c;
                            if (!oVar2.mRestored && !oVar2.mInDynamicContainer) {
                                try {
                                    str = oVar2.getResources().getResourceName(this.f21917c.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f21917c.mContainerId) + " (" + str + ") for fragment " + this.f21917c);
                            }
                        } else if (!(viewGroup instanceof FragmentContainerView)) {
                            c3.b.n(this.f21917c, viewGroup);
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f21917c + " for a container view with no id");
                    }
                }
            }
            C5187o oVar3 = this.f21917c;
            oVar3.mContainer = viewGroup;
            oVar3.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
            if (this.f21917c.mView != null) {
                if (FragmentManager.U0(3)) {
                    Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f21917c);
                }
                this.f21917c.mView.setSaveFromParentEnabled(false);
                C5187o oVar4 = this.f21917c;
                oVar4.mView.setTag(b3.b.f22951a, oVar4);
                if (viewGroup != null) {
                    b();
                }
                C5187o oVar5 = this.f21917c;
                if (oVar5.mHidden) {
                    oVar5.mView.setVisibility(8);
                }
                if (this.f21917c.mView.isAttachedToWindow()) {
                    C4600b0.l0(this.f21917c.mView);
                } else {
                    View view = this.f21917c.mView;
                    view.addOnAttachStateChangeListener(new a(view));
                }
                this.f21917c.performViewCreated();
                B b10 = this.f21915a;
                C5187o oVar6 = this.f21917c;
                b10.m(oVar6, oVar6.mView, bundle2, false);
                int visibility = this.f21917c.mView.getVisibility();
                this.f21917c.setPostOnViewCreatedAlpha(this.f21917c.mView.getAlpha());
                C5187o oVar7 = this.f21917c;
                if (oVar7.mContainer != null && visibility == 0) {
                    View findFocus = oVar7.mView.findFocus();
                    if (findFocus != null) {
                        this.f21917c.setFocusedView(findFocus);
                        if (FragmentManager.U0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f21917c);
                        }
                    }
                    this.f21917c.mView.setAlpha(0.0f);
                }
            }
            this.f21917c.mState = 2;
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        C5187o f10;
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f21917c);
        }
        C5187o oVar = this.f21917c;
        boolean z10 = true;
        boolean z11 = oVar.mRemoving && !oVar.isInBackStack();
        if (z11) {
            C5187o oVar2 = this.f21917c;
            if (!oVar2.mBeingSaved) {
                this.f21916b.B(oVar2.mWho, (Bundle) null);
            }
        }
        if (z11 || this.f21916b.p().K(this.f21917c)) {
            FragmentHostCallback<?> fragmentHostCallback = this.f21917c.mHost;
            if (fragmentHostCallback instanceof k0) {
                z10 = this.f21916b.p().H();
            } else if (fragmentHostCallback.f() instanceof Activity) {
                z10 = true ^ ((Activity) fragmentHostCallback.f()).isChangingConfigurations();
            }
            if ((z11 && !this.f21917c.mBeingSaved) || z10) {
                this.f21916b.p().i(this.f21917c, false);
            }
            this.f21917c.performDestroy();
            this.f21915a.d(this.f21917c, false);
            for (O next : this.f21916b.k()) {
                if (next != null) {
                    C5187o k10 = next.k();
                    if (this.f21917c.mWho.equals(k10.mTargetWho)) {
                        k10.mTarget = this.f21917c;
                        k10.mTargetWho = null;
                    }
                }
            }
            C5187o oVar3 = this.f21917c;
            String str = oVar3.mTargetWho;
            if (str != null) {
                oVar3.mTarget = this.f21916b.f(str);
            }
            this.f21916b.s(this);
            return;
        }
        String str2 = this.f21917c.mTargetWho;
        if (!(str2 == null || (f10 = this.f21916b.f(str2)) == null || !f10.mRetainInstance)) {
            this.f21917c.mTarget = f10;
        }
        this.f21917c.mState = 0;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        View view;
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f21917c);
        }
        C5187o oVar = this.f21917c;
        ViewGroup viewGroup = oVar.mContainer;
        if (!(viewGroup == null || (view = oVar.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f21917c.performDestroyView();
        this.f21915a.n(this.f21917c, false);
        C5187o oVar2 = this.f21917c;
        oVar2.mContainer = null;
        oVar2.mView = null;
        oVar2.mViewLifecycleOwner = null;
        oVar2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f21917c.mInLayout = false;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f21917c);
        }
        this.f21917c.performDetach();
        this.f21915a.e(this.f21917c, false);
        C5187o oVar = this.f21917c;
        oVar.mState = -1;
        oVar.mHost = null;
        oVar.mParentFragment = null;
        oVar.mFragmentManager = null;
        if ((oVar.mRemoving && !oVar.isInBackStack()) || this.f21916b.p().K(this.f21917c)) {
            if (FragmentManager.U0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f21917c);
            }
            this.f21917c.initState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        C5187o oVar = this.f21917c;
        if (oVar.mFromLayout && oVar.mInLayout && !oVar.mPerformedCreateView) {
            if (FragmentManager.U0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f21917c);
            }
            Bundle bundle = this.f21917c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            C5187o oVar2 = this.f21917c;
            oVar2.performCreateView(oVar2.performGetLayoutInflater(bundle2), (ViewGroup) null, bundle2);
            View view = this.f21917c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                C5187o oVar3 = this.f21917c;
                oVar3.mView.setTag(b3.b.f22951a, oVar3);
                C5187o oVar4 = this.f21917c;
                if (oVar4.mHidden) {
                    oVar4.mView.setVisibility(8);
                }
                this.f21917c.performViewCreated();
                B b10 = this.f21915a;
                C5187o oVar5 = this.f21917c;
                b10.m(oVar5, oVar5.mView, bundle2, false);
                this.f21917c.mState = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C5187o k() {
        return this.f21917c;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f21918d) {
            try {
                this.f21918d = true;
                boolean z10 = false;
                while (true) {
                    int d10 = d();
                    C5187o oVar = this.f21917c;
                    int i10 = oVar.mState;
                    if (d10 != i10) {
                        if (d10 <= i10) {
                            switch (i10 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    if (oVar.mBeingSaved && this.f21916b.q(oVar.mWho) == null) {
                                        this.f21916b.B(this.f21917c.mWho, r());
                                    }
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f21917c.mState = 1;
                                    break;
                                case 2:
                                    oVar.mInLayout = false;
                                    oVar.mState = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.U0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f21917c);
                                    }
                                    C5187o oVar2 = this.f21917c;
                                    if (oVar2.mBeingSaved) {
                                        this.f21916b.B(oVar2.mWho, r());
                                    } else if (oVar2.mView != null && oVar2.mSavedViewState == null) {
                                        s();
                                    }
                                    C5187o oVar3 = this.f21917c;
                                    if (!(oVar3.mView == null || (viewGroup2 = oVar3.mContainer) == null)) {
                                        a0.u(viewGroup2, oVar3.getParentFragmentManager()).l(this);
                                    }
                                    this.f21917c.mState = 3;
                                    break;
                                case 4:
                                    v();
                                    break;
                                case 5:
                                    oVar.mState = 5;
                                    break;
                                case 6:
                                    n();
                                    break;
                            }
                        } else {
                            switch (i10 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(oVar.mView == null || (viewGroup3 = oVar.mContainer) == null)) {
                                        a0.u(viewGroup3, oVar.getParentFragmentManager()).j(a0.d.b.j(this.f21917c.mView.getVisibility()), this);
                                    }
                                    this.f21917c.mState = 4;
                                    break;
                                case 5:
                                    u();
                                    break;
                                case 6:
                                    oVar.mState = 6;
                                    break;
                                case 7:
                                    p();
                                    break;
                            }
                        }
                        z10 = true;
                    } else {
                        if (!z10 && i10 == -1 && oVar.mRemoving && !oVar.isInBackStack() && !this.f21917c.mBeingSaved) {
                            if (FragmentManager.U0(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f21917c);
                            }
                            this.f21916b.p().i(this.f21917c, true);
                            this.f21916b.s(this);
                            if (FragmentManager.U0(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.f21917c);
                            }
                            this.f21917c.initState();
                        }
                        C5187o oVar4 = this.f21917c;
                        if (oVar4.mHiddenChanged) {
                            if (!(oVar4.mView == null || (viewGroup = oVar4.mContainer) == null)) {
                                a0 u10 = a0.u(viewGroup, oVar4.getParentFragmentManager());
                                if (this.f21917c.mHidden) {
                                    u10.k(this);
                                } else {
                                    u10.m(this);
                                }
                            }
                            C5187o oVar5 = this.f21917c;
                            FragmentManager fragmentManager = oVar5.mFragmentManager;
                            if (fragmentManager != null) {
                                fragmentManager.S0(oVar5);
                            }
                            C5187o oVar6 = this.f21917c;
                            oVar6.mHiddenChanged = false;
                            oVar6.onHiddenChanged(oVar6.mHidden);
                            this.f21917c.mChildFragmentManager.P();
                        }
                        this.f21918d = false;
                        return;
                    }
                }
            } catch (Throwable th2) {
                this.f21918d = false;
                throw th2;
            }
        } else if (FragmentManager.U0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f21917c);
        }
        this.f21917c.performPause();
        this.f21915a.f(this.f21917c, false);
    }

    /* access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f21917c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (this.f21917c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                this.f21917c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
            }
            try {
                C5187o oVar = this.f21917c;
                oVar.mSavedViewState = oVar.mSavedFragmentState.getSparseParcelableArray("viewState");
                C5187o oVar2 = this.f21917c;
                oVar2.mSavedViewRegistryState = oVar2.mSavedFragmentState.getBundle("viewRegistryState");
                N n10 = (N) this.f21917c.mSavedFragmentState.getParcelable("state");
                if (n10 != null) {
                    C5187o oVar3 = this.f21917c;
                    oVar3.mTargetWho = n10.f21912m;
                    oVar3.mTargetRequestCode = n10.f21913n;
                    Boolean bool = oVar3.mSavedUserVisibleHint;
                    if (bool != null) {
                        oVar3.mUserVisibleHint = bool.booleanValue();
                        this.f21917c.mSavedUserVisibleHint = null;
                    } else {
                        oVar3.mUserVisibleHint = n10.f21914o;
                    }
                }
                C5187o oVar4 = this.f21917c;
                if (!oVar4.mUserVisibleHint) {
                    oVar4.mDeferStart = true;
                }
            } catch (BadParcelableException e10) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f21917c);
        }
        View focusedView = this.f21917c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.U0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f21917c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f21917c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f21917c.setFocusedView((View) null);
        this.f21917c.performResume();
        this.f21915a.i(this.f21917c, false);
        this.f21916b.B(this.f21917c.mWho, (Bundle) null);
        C5187o oVar = this.f21917c;
        oVar.mSavedFragmentState = null;
        oVar.mSavedViewState = null;
        oVar.mSavedViewRegistryState = null;
    }

    /* access modifiers changed from: package-private */
    public C5187o.n q() {
        if (this.f21917c.mState > -1) {
            return new C5187o.n(r());
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        C5187o oVar = this.f21917c;
        if (oVar.mState == -1 && (bundle = oVar.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new N(this.f21917c));
        if (this.f21917c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f21917c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f21915a.j(this.f21917c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f21917c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle J12 = this.f21917c.mChildFragmentManager.c1();
            if (!J12.isEmpty()) {
                bundle2.putBundle("childFragmentManager", J12);
            }
            if (this.f21917c.mView != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.f21917c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f21917c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f21917c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (this.f21917c.mView != null) {
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + this.f21917c + " with view " + this.f21917c.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f21917c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f21917c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f21917c.mViewLifecycleOwner.e(bundle);
            if (!bundle.isEmpty()) {
                this.f21917c.mSavedViewRegistryState = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i10) {
        this.f21919e = i10;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f21917c);
        }
        this.f21917c.performStart();
        this.f21915a.k(this.f21917c, false);
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f21917c);
        }
        this.f21917c.performStop();
        this.f21915a.l(this.f21917c, false);
    }

    O(B b10, P p10, ClassLoader classLoader, C5195x xVar, Bundle bundle) {
        this.f21915a = b10;
        this.f21916b = p10;
        C5187o a10 = ((N) bundle.getParcelable("state")).a(xVar, classLoader);
        this.f21917c = a10;
        a10.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a10.setArguments(bundle2);
        if (FragmentManager.U0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    O(B b10, P p10, C5187o oVar, Bundle bundle) {
        this.f21915a = b10;
        this.f21916b = p10;
        this.f21917c = oVar;
        oVar.mSavedViewState = null;
        oVar.mSavedViewRegistryState = null;
        oVar.mBackStackNesting = 0;
        oVar.mInLayout = false;
        oVar.mAdded = false;
        C5187o oVar2 = oVar.mTarget;
        oVar.mTargetWho = oVar2 != null ? oVar2.mWho : null;
        oVar.mTarget = null;
        oVar.mSavedFragmentState = bundle;
        oVar.mArguments = bundle.getBundle("arguments");
    }
}
