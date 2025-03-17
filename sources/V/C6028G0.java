package v;

import C.C4391e0;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.camera2.internal.compat.quirk.b;
import androidx.camera.core.impl.C5029j0;
import androidx.camera.core.impl.C5031k0;
import androidx.camera.core.impl.R0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: v.G0  reason: case insensitive filesystem */
public class C6028G0 implements C5029j0 {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f30197c;

    /* renamed from: d  reason: collision with root package name */
    private final String f30198d;

    /* renamed from: e  reason: collision with root package name */
    private final int f30199e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Integer, C5031k0> f30200f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final R0 f30201g;

    /* renamed from: v.G0$a */
    static class a {
        static EncoderProfiles a(String str, int i10) {
            return CamcorderProfile.getAll(str, i10);
        }
    }

    public C6028G0(String str, R0 r02) {
        int i10;
        boolean z10;
        this.f30198d = str;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            C4391e0.l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i10 = -1;
        }
        this.f30197c = z10;
        this.f30199e = i10;
        this.f30201g = r02;
    }

    private C5031k0 c(int i10) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f30199e, i10);
        } catch (RuntimeException e10) {
            C4391e0.m("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + i10, e10);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return F.a.a(camcorderProfile);
        }
        return null;
    }

    private C5031k0 d() {
        for (Integer intValue : C5029j0.f16927b) {
            C5031k0 b10 = b(intValue.intValue());
            if (b10 != null) {
                return b10;
            }
        }
        return null;
    }

    private C5031k0 e() {
        for (int size = C5029j0.f16927b.size() - 1; size >= 0; size--) {
            C5031k0 b10 = b(size);
            if (b10 != null) {
                return b10;
            }
        }
        return null;
    }

    private C5031k0 f(int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles a10 = a.a(this.f30198d, i10);
            if (a10 == null) {
                return null;
            }
            if (b.b(InvalidVideoProfilesQuirk.class) != null) {
                C4391e0.a("Camera2EncoderProfilesProvider", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return F.a.b(a10);
                } catch (NullPointerException e10) {
                    C4391e0.m("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e10);
                }
            }
        }
        return c(i10);
    }

    private boolean g(C5031k0 k0Var) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.f30201g.b(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List<C5031k0.c> b10 = k0Var.b();
        if (b10.isEmpty()) {
            return true;
        }
        C5031k0.c cVar = b10.get(0);
        return camcorderProfileResolutionQuirk.f().contains(new Size(cVar.k(), cVar.h()));
    }

    public boolean a(int i10) {
        return this.f30197c && b(i10) != null;
    }

    public C5031k0 b(int i10) {
        C5031k0 k0Var = null;
        if (!this.f30197c || !CamcorderProfile.hasProfile(this.f30199e, i10)) {
            return null;
        }
        if (this.f30200f.containsKey(Integer.valueOf(i10))) {
            return this.f30200f.get(Integer.valueOf(i10));
        }
        C5031k0 f10 = f(i10);
        if (f10 == null || g(f10)) {
            k0Var = f10;
        } else if (i10 == 1) {
            k0Var = d();
        } else if (i10 == 0) {
            k0Var = e();
        }
        this.f30200f.put(Integer.valueOf(i10), k0Var);
        return k0Var;
    }
}
