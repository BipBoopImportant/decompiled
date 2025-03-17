package c0;

import C.C4391e0;
import H2.i;
import a0.k0;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.compat.quirk.a;
import java.util.HashSet;
import java.util.Set;

public class d implements k0 {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f22973a;

    /* renamed from: b  reason: collision with root package name */
    private final Range<Integer> f22974b;

    /* renamed from: c  reason: collision with root package name */
    private final Range<Integer> f22975c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Size> f22976d;

    private d(k0 k0Var) {
        HashSet hashSet = new HashSet();
        this.f22976d = hashSet;
        this.f22973a = k0Var;
        int f10 = k0Var.f();
        this.f22974b = Range.create(Integer.valueOf(f10), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) f10))) * f10));
        int c10 = k0Var.c();
        this.f22975c = Range.create(Integer.valueOf(c10), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) c10))) * c10));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.f());
    }

    private void k(Size size) {
        this.f22976d.add(size);
    }

    public static k0 l(k0 k0Var, Size size) {
        if (!(k0Var instanceof d)) {
            if (a.b(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !k0Var.e(size.getWidth(), size.getHeight())) {
                    C4391e0.l("VideoEncoderInfoWrapper", String.format("Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s", new Object[]{size, k0Var.i(), k0Var.j()}));
                }
            }
            k0Var = new d(k0Var);
        }
        if (size != null && (k0Var instanceof d)) {
            ((d) k0Var).k(size);
        }
        return k0Var;
    }

    public boolean a() {
        return this.f22973a.a();
    }

    public Range<Integer> b(int i10) {
        boolean z10 = this.f22975c.contains(Integer.valueOf(i10)) && i10 % this.f22973a.c() == 0;
        i.b(z10, "Not supported height: " + i10 + " which is not in " + this.f22975c + " or can not be divided by alignment " + this.f22973a.c());
        return this.f22974b;
    }

    public int c() {
        return this.f22973a.c();
    }

    public boolean d(int i10, int i11) {
        if (this.f22973a.d(i10, i11)) {
            return true;
        }
        for (Size next : this.f22976d) {
            if (next.getWidth() == i10 && next.getHeight() == i11) {
                return true;
            }
        }
        return this.f22974b.contains(Integer.valueOf(i10)) && this.f22975c.contains(Integer.valueOf(i11)) && i10 % this.f22973a.f() == 0 && i11 % this.f22973a.c() == 0;
    }

    public int f() {
        return this.f22973a.f();
    }

    public Range<Integer> g() {
        return this.f22973a.g();
    }

    public Range<Integer> h(int i10) {
        boolean z10 = this.f22974b.contains(Integer.valueOf(i10)) && i10 % this.f22973a.f() == 0;
        i.b(z10, "Not supported width: " + i10 + " which is not in " + this.f22974b + " or can not be divided by alignment " + this.f22973a.f());
        return this.f22975c;
    }

    public Range<Integer> i() {
        return this.f22974b;
    }

    public Range<Integer> j() {
        return this.f22975c;
    }
}
