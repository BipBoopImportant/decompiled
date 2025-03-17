package com.google.android.gms.common.api.internal;

import H9.C6534h;
import H9.C6535i;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class zza extends Fragment implements C6535i {

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap f48040b = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    private final f f48041a = new f();

    public static zza a(Activity activity) {
        zza zza;
        WeakHashMap weakHashMap = f48040b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zza = (zza) weakReference.get()) != null) {
            return zza;
        }
        try {
            zza zza2 = (zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zza2 == null || zza2.isRemoving()) {
                zza2 = new zza();
                activity.getFragmentManager().beginTransaction().add(zza2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zza2));
            return zza2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    public final Activity b0() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f48041a.e(str, fileDescriptor, printWriter, strArr);
    }

    public final <T extends C6534h> T e(String str, Class<T> cls) {
        return this.f48041a.c(str, cls);
    }

    public final void h(String str, C6534h hVar) {
        this.f48041a.d(str, hVar);
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f48041a.f(i10, i11, intent);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f48041a.g(bundle);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f48041a.h();
    }

    public final void onResume() {
        super.onResume();
        this.f48041a.i();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f48041a.j(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.f48041a.k();
    }

    public final void onStop() {
        super.onStop();
        this.f48041a.l();
    }
}
