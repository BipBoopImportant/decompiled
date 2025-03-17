package com.google.android.gms.common.api.internal;

import H9.C6534h;
import H9.C6535i;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class zzd extends C5187o implements C6535i {

    /* renamed from: E  reason: collision with root package name */
    private static final WeakHashMap f48042E = new WeakHashMap();

    /* renamed from: D  reason: collision with root package name */
    private final f f48043D = new f();

    public static zzd q(C5191t tVar) {
        zzd zzd;
        WeakHashMap weakHashMap = f48042E;
        WeakReference weakReference = (WeakReference) weakHashMap.get(tVar);
        if (weakReference != null && (zzd = (zzd) weakReference.get()) != null) {
            return zzd;
        }
        try {
            zzd zzd2 = (zzd) tVar.getSupportFragmentManager().q0("SLifecycleFragmentImpl");
            if (zzd2 == null || zzd2.isRemoving()) {
                zzd2 = new zzd();
                tVar.getSupportFragmentManager().s().f(zzd2, "SLifecycleFragmentImpl").k();
            }
            weakHashMap.put(tVar, new WeakReference(zzd2));
            return zzd2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    public final Activity b0() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f48043D.e(str, fileDescriptor, printWriter, strArr);
    }

    public final <T extends C6534h> T e(String str, Class<T> cls) {
        return this.f48043D.c(str, cls);
    }

    public final void h(String str, C6534h hVar) {
        this.f48043D.d(str, hVar);
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f48043D.f(i10, i11, intent);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f48043D.g(bundle);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f48043D.h();
    }

    public final void onResume() {
        super.onResume();
        this.f48043D.i();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f48043D.j(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.f48043D.k();
    }

    public final void onStop() {
        super.onStop();
        this.f48043D.l();
    }
}
