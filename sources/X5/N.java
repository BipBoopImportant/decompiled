package X5;

import WK.C16762E;
import WK.C16777l;
import X5.s;
import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LX5/s;", "Lk6/q;", "options", "", "animated", "Landroid/graphics/ImageDecoder$Source;", "b", "(LX5/s;Lk6/q;Z)Landroid/graphics/ImageDecoder$Source;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class N {
    public static final ImageDecoder.Source b(s sVar, C8450q qVar, boolean z10) {
        C16762E S22;
        if (sVar.r() == C16777l.f139691b && (S22 = sVar.S2()) != null) {
            return ImageDecoder.createSource(S22.I());
        }
        s.a j10 = sVar.j();
        if (j10 instanceof C6716a) {
            return ImageDecoder.createSource(qVar.c().getAssets(), ((C6716a) j10).a());
        }
        if (!(j10 instanceof C6720e) || Build.VERSION.SDK_INT < 29) {
            if (j10 instanceof u) {
                u uVar = (u) j10;
                if (C17542s.e(uVar.a(), qVar.c().getPackageName())) {
                    return ImageDecoder.createSource(qVar.c().getResources(), uVar.b());
                }
            }
            if (!(j10 instanceof C6719d)) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 30 || !z10 || ((C6719d) j10).a().isDirect()) {
                return ImageDecoder.createSource(((C6719d) j10).a());
            }
            return null;
        }
        try {
            AssetFileDescriptor a10 = ((C6720e) j10).a();
            Os.lseek(a10.getFileDescriptor(), a10.getStartOffset(), OsConstants.SEEK_SET);
            return ImageDecoder.createSource(new M(a10));
        } catch (ErrnoException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static final AssetFileDescriptor c(AssetFileDescriptor assetFileDescriptor) {
        return assetFileDescriptor;
    }
}
