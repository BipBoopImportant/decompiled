package com.google.android.gms.flags.impl;

import V9.g;
import W9.b;
import W9.d;
import W9.f;
import W9.h;
import W9.j;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;

@DynamiteApi
public class FlagProviderImpl extends g {

    /* renamed from: a  reason: collision with root package name */
    private boolean f48116a = false;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f48117b;

    public boolean getBooleanFlagValue(String str, boolean z10, int i10) {
        return !this.f48116a ? z10 : b.a(this.f48117b, str, Boolean.valueOf(z10)).booleanValue();
    }

    public int getIntFlagValue(String str, int i10, int i11) {
        return !this.f48116a ? i10 : d.a(this.f48117b, str, Integer.valueOf(i10)).intValue();
    }

    public long getLongFlagValue(String str, long j10, int i10) {
        return !this.f48116a ? j10 : f.a(this.f48117b, str, Long.valueOf(j10)).longValue();
    }

    public String getStringFlagValue(String str, String str2, int i10) {
        return !this.f48116a ? str2 : h.a(this.f48117b, str, str2);
    }

    public void init(T9.b bVar) {
        Context context = (Context) T9.d.K3(bVar);
        if (!this.f48116a) {
            try {
                this.f48117b = j.a(context.createPackageContext("com.google.android.gms", 0));
                this.f48116a = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e10) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
            }
        }
    }
}
