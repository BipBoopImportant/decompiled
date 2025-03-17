package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import xa.C8971l;

@Deprecated
public final class zzd extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private int f50654a;

    /* renamed from: b  reason: collision with root package name */
    private d f50655b;

    /* renamed from: c  reason: collision with root package name */
    boolean f50656c;

    /* access modifiers changed from: private */
    public final void b(C8971l lVar) {
        if (!this.f50656c) {
            this.f50656c = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (lVar != null) {
                a.i(activity, this.f50654a, lVar);
            } else {
                a.h(activity, this.f50654a, 0, new Intent());
            }
        }
    }

    private final void c() {
        d dVar = this.f50655b;
        if (dVar != null) {
            dVar.b(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50654a = getArguments().getInt("requestCode");
        if (a.f50604b != getArguments().getLong("initializationElapsedRealtime")) {
            this.f50655b = null;
        } else {
            this.f50655b = (d) d.f50629e.get(getArguments().getInt("resolveCallId"));
        }
        boolean z10 = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z10 = true;
        }
        this.f50656c = z10;
    }

    public final void onPause() {
        super.onPause();
        c();
    }

    public final void onResume() {
        super.onResume();
        d dVar = this.f50655b;
        if (dVar != null) {
            dVar.c(this);
            return;
        }
        if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
        }
        b((C8971l) null);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.f50656c);
        c();
    }
}
