package androidx.fragment.app;

import I2.B;
import I2.C4640w;
import P4.f;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.j;
import androidx.activity.w;
import androidx.activity.z;
import androidx.core.app.C5147b;
import androidx.core.app.k;
import androidx.core.app.t;
import androidx.core.app.u;
import androidx.core.app.x;
import androidx.lifecycle.A;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import g.C5316e;
import g.C5317f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import u2.C6014c;
import u2.d;

/* renamed from: androidx.fragment.app.t  reason: case insensitive filesystem */
public class C5191t extends j implements C5147b.f {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final A mFragmentLifecycleRegistry = new A(this);
    final C5194w mFragments = C5194w.b(new a());
    boolean mResumed;
    boolean mStopped = true;

    /* renamed from: androidx.fragment.app.t$a */
    class a extends FragmentHostCallback<C5191t> implements C6014c, d, t, u, k0, z, C5317f, f, L, C4640w {
        public a() {
            super(C5191t.this);
        }

        public void a(FragmentManager fragmentManager, C5187o oVar) {
            C5191t.this.onAttachFragment(oVar);
        }

        public void addMenuProvider(B b10) {
            C5191t.this.addMenuProvider(b10);
        }

        public void addOnConfigurationChangedListener(H2.a<Configuration> aVar) {
            C5191t.this.addOnConfigurationChangedListener(aVar);
        }

        public void addOnMultiWindowModeChangedListener(H2.a<k> aVar) {
            C5191t.this.addOnMultiWindowModeChangedListener(aVar);
        }

        public void addOnPictureInPictureModeChangedListener(H2.a<x> aVar) {
            C5191t.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        public void addOnTrimMemoryListener(H2.a<Integer> aVar) {
            C5191t.this.addOnTrimMemoryListener(aVar);
        }

        public View c(int i10) {
            return C5191t.this.findViewById(i10);
        }

        public boolean d() {
            Window window = C5191t.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public C5316e getActivityResultRegistry() {
            return C5191t.this.getActivityResultRegistry();
        }

        public r getLifecycle() {
            return C5191t.this.mFragmentLifecycleRegistry;
        }

        public w getOnBackPressedDispatcher() {
            return C5191t.this.getOnBackPressedDispatcher();
        }

        public P4.d getSavedStateRegistry() {
            return C5191t.this.getSavedStateRegistry();
        }

        public j0 getViewModelStore() {
            return C5191t.this.getViewModelStore();
        }

        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            C5191t.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        public LayoutInflater k() {
            return C5191t.this.getLayoutInflater().cloneInContext(C5191t.this);
        }

        public boolean m(String str) {
            return C5147b.A(C5191t.this, str);
        }

        public void p() {
            q();
        }

        public void q() {
            C5191t.this.invalidateMenu();
        }

        /* renamed from: r */
        public C5191t j() {
            return C5191t.this;
        }

        public void removeMenuProvider(B b10) {
            C5191t.this.removeMenuProvider(b10);
        }

        public void removeOnConfigurationChangedListener(H2.a<Configuration> aVar) {
            C5191t.this.removeOnConfigurationChangedListener(aVar);
        }

        public void removeOnMultiWindowModeChangedListener(H2.a<k> aVar) {
            C5191t.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        public void removeOnPictureInPictureModeChangedListener(H2.a<x> aVar) {
            C5191t.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        public void removeOnTrimMemoryListener(H2.a<Integer> aVar) {
            C5191t.this.removeOnTrimMemoryListener(aVar);
        }

        public void addMenuProvider(B b10, C5221y yVar, r.b bVar) {
            C5191t.this.addMenuProvider(b10, yVar, bVar);
        }
    }

    public C5191t() {
        init();
    }

    private void init() {
        getSavedStateRegistry().h(LIFECYCLE_TAG, new C5188p(this));
        addOnConfigurationChangedListener(new C5189q(this));
        addOnNewIntentListener(new r(this));
        addOnContextAvailableListener(new C5190s(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.l(r.a.ON_STOP);
        return new Bundle();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.m();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.m();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(Context context) {
        this.mFragments.a((C5187o) null);
    }

    private static boolean markState(FragmentManager fragmentManager, r.b bVar) {
        boolean z10 = false;
        for (C5187o next : fragmentManager.G0()) {
            if (next != null) {
                if (next.getHost() != null) {
                    z10 |= markState(next.getChildFragmentManager(), bVar);
                }
                V v10 = next.mViewLifecycleOwner;
                if (v10 != null && v10.getLifecycle().d().b(r.b.STARTED)) {
                    next.mViewLifecycleOwner.f(bVar);
                    z10 = true;
                }
                if (next.mLifecycleRegistry.d().b(r.b.STARTED)) {
                    next.mLifecycleRegistry.q(bVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().d0(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    /* access modifiers changed from: package-private */
    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), r.b.CREATED));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(C5187o oVar) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.l(r.a.ON_CREATE);
        this.mFragments.e();
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.l(r.a.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.l(r.a.ON_PAUSE);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.l(r.a.ON_RESUME);
        this.mFragments.h();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.l(r.a.ON_START);
        this.mFragments.i();
    }

    public void onStateNotSaved() {
        this.mFragments.m();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.l(r.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.A a10) {
        C5147b.y(this, a10);
    }

    public void setExitSharedElementCallback(androidx.core.app.A a10) {
        C5147b.z(this, a10);
    }

    public void startActivityFromFragment(C5187o oVar, Intent intent, int i10) {
        startActivityFromFragment(oVar, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(C5187o oVar, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 == -1) {
            C5147b.C(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            oVar.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C5147b.s(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        C5147b.u(this);
    }

    public void supportStartPostponedEnterTransition() {
        C5147b.D(this);
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    public void startActivityFromFragment(C5187o oVar, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            C5147b.B(this, intent, -1, bundle);
        } else {
            oVar.startActivityForResult(intent, i10, bundle);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public C5191t(int i10) {
        super(i10);
        init();
    }
}
