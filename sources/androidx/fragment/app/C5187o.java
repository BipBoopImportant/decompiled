package androidx.fragment.app;

import I2.C4636u;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.A;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.r;
import g.C5313b;
import g.C5314c;
import g.C5316e;
import g.C5317f;
import h.C5403a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q.C5759a;

/* renamed from: androidx.fragment.app.o  reason: case insensitive filesystem */
public class C5187o implements ComponentCallbacks, View.OnCreateContextMenuListener, C5221y, k0, C5212o, P4.f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    i0.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    FragmentHostCallback<?> mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    A mLifecycleRegistry;
    r.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<m> mOnPreAttachedListeners;
    C5187o mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final m mSavedStateAttachListener;
    P4.e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    C5187o mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    V mViewLifecycleOwner;
    K<C5221y> mViewLifecycleOwnerLiveData;
    String mWho;

    /* renamed from: androidx.fragment.app.o$a */
    class a extends C5314c<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicReference f22060a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5403a f22061b;

        a(AtomicReference atomicReference, C5403a aVar) {
            this.f22060a = atomicReference;
            this.f22061b = aVar;
        }

        public void b(I i10, androidx.core.app.d dVar) {
            C5314c cVar = (C5314c) this.f22060a.get();
            if (cVar != null) {
                cVar.b(i10, dVar);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        public void c() {
            C5314c cVar = (C5314c) this.f22060a.getAndSet((Object) null);
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$b */
    class b implements Runnable {
        b() {
        }

        public void run() {
            C5187o.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.o$c */
    class c extends m {
        c() {
            super((b) null);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            C5187o.this.mSavedStateRegistryController.c();
            X.c(C5187o.this);
            Bundle bundle = C5187o.this.mSavedFragmentState;
            C5187o.this.mSavedStateRegistryController.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* renamed from: androidx.fragment.app.o$d */
    class d implements Runnable {
        d() {
        }

        public void run() {
            C5187o.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.o$e */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f22066a;

        e(a0 a0Var) {
            this.f22066a = a0Var;
        }

        public void run() {
            if (this.f22066a.y()) {
                this.f22066a.n();
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$f */
    class f extends C5193v {
        f() {
        }

        public View c(int i10) {
            View view = C5187o.this.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + C5187o.this + " does not have a view");
        }

        public boolean d() {
            return C5187o.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.o$g */
    class g implements C5218v {
        g() {
        }

        public void e(C5221y yVar, r.a aVar) {
            View view;
            if (aVar == r.a.ON_STOP && (view = C5187o.this.mView) != null) {
                view.cancelPendingInputEvents();
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$h */
    class h implements C5759a<Void, C5316e> {
        h() {
        }

        /* renamed from: a */
        public C5316e apply(Void voidR) {
            C5187o oVar = C5187o.this;
            FragmentHostCallback<?> fragmentHostCallback = oVar.mHost;
            return fragmentHostCallback instanceof C5317f ? ((C5317f) fragmentHostCallback).getActivityResultRegistry() : oVar.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.o$i */
    class i implements C5759a<Void, C5316e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5316e f22071a;

        i(C5316e eVar) {
            this.f22071a = eVar;
        }

        /* renamed from: a */
        public C5316e apply(Void voidR) {
            return this.f22071a;
        }
    }

    /* renamed from: androidx.fragment.app.o$j */
    class j extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5759a f22073a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicReference f22074b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5403a f22075c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5313b f22076d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C5759a aVar, AtomicReference atomicReference, C5403a aVar2, C5313b bVar) {
            super((b) null);
            this.f22073a = aVar;
            this.f22074b = atomicReference;
            this.f22075c = aVar2;
            this.f22076d = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f22074b.set(((C5316e) this.f22073a.apply(null)).l(C5187o.this.generateActivityResultKey(), C5187o.this, this.f22075c, this.f22076d));
        }
    }

    /* renamed from: androidx.fragment.app.o$k */
    static class k {

        /* renamed from: a  reason: collision with root package name */
        View f22078a;

        /* renamed from: b  reason: collision with root package name */
        boolean f22079b;

        /* renamed from: c  reason: collision with root package name */
        int f22080c;

        /* renamed from: d  reason: collision with root package name */
        int f22081d;

        /* renamed from: e  reason: collision with root package name */
        int f22082e;

        /* renamed from: f  reason: collision with root package name */
        int f22083f;

        /* renamed from: g  reason: collision with root package name */
        int f22084g;

        /* renamed from: h  reason: collision with root package name */
        ArrayList<String> f22085h;

        /* renamed from: i  reason: collision with root package name */
        ArrayList<String> f22086i;

        /* renamed from: j  reason: collision with root package name */
        Object f22087j = null;

        /* renamed from: k  reason: collision with root package name */
        Object f22088k;

        /* renamed from: l  reason: collision with root package name */
        Object f22089l;

        /* renamed from: m  reason: collision with root package name */
        Object f22090m;

        /* renamed from: n  reason: collision with root package name */
        Object f22091n;

        /* renamed from: o  reason: collision with root package name */
        Object f22092o;

        /* renamed from: p  reason: collision with root package name */
        Boolean f22093p;

        /* renamed from: q  reason: collision with root package name */
        Boolean f22094q;

        /* renamed from: r  reason: collision with root package name */
        androidx.core.app.A f22095r;

        /* renamed from: s  reason: collision with root package name */
        androidx.core.app.A f22096s;

        /* renamed from: t  reason: collision with root package name */
        float f22097t;

        /* renamed from: u  reason: collision with root package name */
        View f22098u;

        /* renamed from: v  reason: collision with root package name */
        boolean f22099v;

        k() {
            Object obj = C5187o.USE_DEFAULT_TRANSITION;
            this.f22088k = obj;
            this.f22089l = null;
            this.f22090m = obj;
            this.f22091n = null;
            this.f22092o = obj;
            this.f22095r = null;
            this.f22096s = null;
            this.f22097t = 1.0f;
            this.f22098u = null;
        }
    }

    /* renamed from: androidx.fragment.app.o$l */
    public static class l extends RuntimeException {
        public l(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.o$m */
    private static abstract class m {
        private m() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* synthetic */ m(b bVar) {
            this();
        }
    }

    public C5187o() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new I();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = r.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new K<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    private k ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new k();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        r.b bVar = this.mMaxState;
        return (bVar == r.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new A(this);
        this.mSavedStateRegistryController = P4.e.a(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
    }

    @Deprecated
    public static C5187o instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$performCreateView$0() {
        this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    private <I, O> C5314c<I> prepareCallInternal(C5403a<I, O> aVar, C5759a<Void, C5316e> aVar2, C5313b<O> bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new j(aVar2, atomicReference, aVar, bVar));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f22099v = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            a0 u10 = a0.u(viewGroup, fragmentManager);
            u10.z();
            if (z10) {
                this.mHost.h().post(new e(u10));
            } else {
                u10.n();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C5193v createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        C5187o targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.d0(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public C5187o findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.r0(str);
    }

    /* access modifiers changed from: package-private */
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final C5191t getActivity() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return (C5191t) fragmentHostCallback.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f22094q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f22093p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f22078a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.f();
    }

    public l3.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && FragmentManager.U0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        l3.d dVar = new l3.d();
        if (application != null) {
            dVar.c(i0.a.f22296h, application);
        }
        dVar.c(X.f22221a, this);
        dVar.c(X.f22222b, this);
        if (getArguments() != null) {
            dVar.c(X.f22223c, getArguments());
        }
        return dVar;
    }

    public i0.c getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.U0(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new a0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: package-private */
    public int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f22080c;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f22087j;
    }

    /* access modifiers changed from: package-private */
    public androidx.core.app.A getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f22095r;
    }

    /* access modifiers changed from: package-private */
    public int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f22081d;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f22089l;
    }

    /* access modifiers changed from: package-private */
    public androidx.core.app.A getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f22096s;
    }

    /* access modifiers changed from: package-private */
    public View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f22098u;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.j();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    public r getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    /* access modifiers changed from: package-private */
    public int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f22084g;
    }

    public final C5187o getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* access modifiers changed from: package-private */
    public boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f22079b;
    }

    /* access modifiers changed from: package-private */
    public int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f22082e;
    }

    /* access modifiers changed from: package-private */
    public int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f22083f;
    }

    /* access modifiers changed from: package-private */
    public float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f22097t;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f22090m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        c3.b.h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f22088k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    public final P4.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f22091n;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f22092o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f22085h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> getSharedElementSourceNames() {
        /*
            r1 = this;
            androidx.fragment.app.o$k r0 = r1.mAnimationInfo
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f22085h
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C5187o.getSharedElementSourceNames():java.util.ArrayList");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f22086i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> getSharedElementTargetNames() {
        /*
            r1 = this;
            androidx.fragment.app.o$k r0 = r1.mAnimationInfo
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f22086i
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C5187o.getSharedElementTargetNames():java.util.ArrayList");
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final C5187o getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        c3.b.i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public C5221y getViewLifecycleOwner() {
        V v10 = this.mViewLifecycleOwner;
        if (v10 != null) {
            return v10;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public F<C5221y> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public j0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (getMinimumMaxLifecycleState() != r.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.P0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new I();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.mFragmentManager;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isHidden() {
        /*
            r2 = this;
            boolean r0 = r2.mHidden
            if (r0 != 0) goto L_0x0013
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L_0x0011
            androidx.fragment.app.o r1 = r2.mParentFragment
            boolean r0 = r0.X0(r1)
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C5187o.isHidden():boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.mFragmentManager;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isMenuVisible() {
        /*
            r2 = this;
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.o r1 = r2.mParentFragment
            boolean r0 = r0.Y0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C5187o.isMenuVisible():boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f22099v;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.b1();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.mView;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isVisible() {
        /*
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C5187o.isVisible():boolean");
    }

    /* access modifiers changed from: package-private */
    public void noteStateNotSaved() {
        this.mChildFragmentManager.m1();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (FragmentManager.U0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        Activity e10 = fragmentHostCallback == null ? null : fragmentHostCallback.e();
        if (e10 != null) {
            this.mCalled = false;
            onAttach(e10);
        }
    }

    @Deprecated
    public void onAttachFragment(C5187o oVar) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (!this.mChildFragmentManager.a1(1)) {
            this.mChildFragmentManager.I();
        }
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z10) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        Activity e10 = fragmentHostCallback == null ? null : fragmentHostCallback.e();
        if (e10 != null) {
            this.mCalled = false;
            onInflate(e10, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    /* access modifiers changed from: package-private */
    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.E();
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public void performAttach() {
        Iterator<m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.q(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.O(this);
            this.mChildFragmentManager.F();
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* access modifiers changed from: package-private */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: package-private */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.H(menuItem);
    }

    /* access modifiers changed from: package-private */
    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.c(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.l(r.a.ON_CREATE);
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.J(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new V(this, getViewModelStore(), new C5186n(this));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            if (FragmentManager.U0(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
            }
            l0.b(this.mView, this.mViewLifecycleOwner);
            m0.b(this.mView, this.mViewLifecycleOwner);
            P4.g.b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.c()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroy() {
        this.mChildFragmentManager.K();
        this.mLifecycleRegistry.l(r.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new c0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroyView() {
        this.mChildFragmentManager.L();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().d().b(r.b.CREATED)) {
            this.mViewLifecycleOwner.a(r.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.b(this).d();
            this.mPerformedCreateView = false;
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new c0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.T0()) {
            this.mChildFragmentManager.K();
            this.mChildFragmentManager = new I();
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    /* access modifiers changed from: package-private */
    public void performLowMemory() {
        onLowMemory();
    }

    /* access modifiers changed from: package-private */
    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    /* access modifiers changed from: package-private */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.Q(menuItem);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.R(menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void performPause() {
        this.mChildFragmentManager.T();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(r.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.l(r.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new c0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    /* access modifiers changed from: package-private */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.V(menu);
    }

    /* access modifiers changed from: package-private */
    public void performPrimaryNavigationFragmentChanged() {
        boolean Z02 = this.mFragmentManager.Z0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != Z02) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(Z02);
            onPrimaryNavigationFragmentChanged(Z02);
            this.mChildFragmentManager.W();
        }
    }

    /* access modifiers changed from: package-private */
    public void performResume() {
        this.mChildFragmentManager.m1();
        this.mChildFragmentManager.h0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            A a10 = this.mLifecycleRegistry;
            r.a aVar = r.a.ON_RESUME;
            a10.l(aVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(aVar);
            }
            this.mChildFragmentManager.X();
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: package-private */
    public void performStart() {
        this.mChildFragmentManager.m1();
        this.mChildFragmentManager.h0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            A a10 = this.mLifecycleRegistry;
            r.a aVar = r.a.ON_START;
            a10.l(aVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(aVar);
            }
            this.mChildFragmentManager.Y();
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    public void performStop() {
        this.mChildFragmentManager.a0();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(r.a.ON_STOP);
        }
        this.mLifecycleRegistry.l(r.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new c0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.b0();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f22099v = true;
    }

    public final <I, O> C5314c<I> registerForActivityResult(C5403a<I, O> aVar, C5313b<O> bVar) {
        return prepareCallInternal(aVar, new h(), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost != null) {
            getParentFragmentManager().i1(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final C5191t requireActivity() {
        C5191t activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final C5187o requireParentFragment() {
        C5187o parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* access modifiers changed from: package-private */
    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.mChildFragmentManager.H1(bundle);
            this.mChildFragmentManager.I();
        }
    }

    /* access modifiers changed from: package-private */
    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new c0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.a(r.a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f22094q = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f22093p = Boolean.valueOf(z10);
    }

    /* access modifiers changed from: package-private */
    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo != null || i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
            ensureAnimationInfo().f22080c = i10;
            ensureAnimationInfo().f22081d = i11;
            ensureAnimationInfo().f22082e = i12;
            ensureAnimationInfo().f22083f = i13;
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(androidx.core.app.A a10) {
        ensureAnimationInfo().f22095r = a10;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f22087j = obj;
    }

    public void setExitSharedElementCallback(androidx.core.app.A a10) {
        ensureAnimationInfo().f22096s = a10;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f22089l = obj;
    }

    /* access modifiers changed from: package-private */
    public void setFocusedView(View view) {
        ensureAnimationInfo().f22098u = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (isAdded() && !isHidden()) {
                this.mHost.p();
            }
        }
    }

    public void setInitialSavedState(n nVar) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (nVar == null || (bundle = nVar.f22100a) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setNextTransition(int i10) {
        if (this.mAnimationInfo != null || i10 != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f22084g = i10;
        }
    }

    /* access modifiers changed from: package-private */
    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().f22079b = z10;
        }
    }

    /* access modifiers changed from: package-private */
    public void setPostOnViewCreatedAlpha(float f10) {
        ensureAnimationInfo().f22097t = f10;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f22090m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        c3.b.k(this);
        this.mRetainInstance = z10;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            fragmentManager.o(this);
        } else {
            fragmentManager.D1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f22088k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f22091n = obj;
    }

    /* access modifiers changed from: package-private */
    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        k kVar = this.mAnimationInfo;
        kVar.f22085h = arrayList;
        kVar.f22086i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f22092o = obj;
    }

    @Deprecated
    public void setTargetFragment(C5187o oVar, int i10) {
        if (oVar != null) {
            c3.b.l(this, oVar, i10);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = oVar != null ? oVar.mFragmentManager : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            C5187o oVar2 = oVar;
            while (oVar2 != null) {
                if (!oVar2.equals(this)) {
                    oVar2 = oVar2.getTargetFragment(false);
                } else {
                    throw new IllegalArgumentException("Setting " + oVar + " as the target of " + this + " would create a target cycle");
                }
            }
            if (oVar == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || oVar.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = oVar;
            } else {
                this.mTargetWho = oVar.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i10;
            return;
        }
        throw new IllegalArgumentException("Fragment " + oVar + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        c3.b.m(this, z10);
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.o1(fragmentManager.C(this));
        }
        this.mUserVisibleHint = z10;
        this.mDeferStart = this.mState < 5 && !z10;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            return fragmentHostCallback.m(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        startActivityForResult(intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (this.mHost != null) {
            if (FragmentManager.U0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(this);
                sb2.append(" received the following in startIntentSenderForResult() requestCode: ");
                int i14 = i10;
                sb2.append(i10);
                sb2.append(" IntentSender: ");
                IntentSender intentSender2 = intentSender;
                sb2.append(intentSender);
                sb2.append(" fillInIntent: ");
                Intent intent2 = intent;
                sb2.append(intent);
                sb2.append(" options: ");
                sb2.append(bundle);
                Log.v("FragmentManager", sb2.toString());
            } else {
                IntentSender intentSender3 = intentSender;
                int i15 = i10;
                Intent intent3 = intent;
                Bundle bundle2 = bundle;
            }
            getParentFragmentManager().k1(this, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f22099v) {
            if (this.mHost == null) {
                ensureAnimationInfo().f22099v = false;
            } else if (Looper.myLooper() != this.mHost.h().getLooper()) {
                this.mHost.h().postAtFrontOfQueue(new d());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* renamed from: androidx.fragment.app.o$n */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        final Bundle f22100a;

        /* renamed from: androidx.fragment.app.o$n$a */
        class a implements Parcelable.ClassLoaderCreator<n> {
            a() {
            }

            /* renamed from: a */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }

            /* renamed from: c */
            public n[] newArray(int i10) {
                return new n[i10];
            }
        }

        n(Bundle bundle) {
            this.f22100a = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f22100a);
        }

        n(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f22100a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    private C5187o getTargetFragment(boolean z10) {
        String str;
        if (z10) {
            c3.b.j(this);
        }
        C5187o oVar = this.mTarget;
        if (oVar != null) {
            return oVar;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.m0(str);
    }

    @Deprecated
    public static C5187o instantiate(Context context, String str, Bundle bundle) {
        try {
            C5187o oVar = (C5187o) C5195x.loadFragmentClass(context.getClassLoader(), str).getConstructor((Class[]) null).newInstance((Object[]) null);
            if (bundle != null) {
                bundle.setClassLoader(oVar.getClass().getClassLoader());
                oVar.setArguments(bundle);
            }
            return oVar;
        } catch (InstantiationException e10) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (IllegalAccessException e11) {
            throw new l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        ensureAnimationInfo().f22099v = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.H0().h();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> C5314c<I> registerForActivityResult(C5403a<I, O> aVar, C5316e eVar, C5313b<O> bVar) {
        return prepareCallInternal(aVar, new i(eVar), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            fragmentHostCallback.n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().j1(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            LayoutInflater k10 = fragmentHostCallback.k();
            C4636u.a(k10, this.mChildFragmentManager.I0());
            return k10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public C5187o(int i10) {
        this();
        this.mContentLayoutId = i10;
    }
}
