package z;

import C.C4391e0;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.core.impl.R0;

/* renamed from: z.A  reason: case insensitive filesystem */
public class C6262A {

    /* renamed from: a  reason: collision with root package name */
    private final TorchFlashRequiredFor3aUpdateQuirk f32311a;

    public C6262A(R0 r02) {
        this.f32311a = (TorchFlashRequiredFor3aUpdateQuirk) r02.b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public boolean a() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.f32311a;
        boolean z10 = torchFlashRequiredFor3aUpdateQuirk != null && torchFlashRequiredFor3aUpdateQuirk.i();
        C4391e0.a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z10);
        return z10;
    }
}
