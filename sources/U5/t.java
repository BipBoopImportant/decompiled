package U5;

import E1.C4478k;
import T5.C;
import U0.C4889m;
import U0.C4895p;
import U5.e;
import XH.C16807N;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import nI.C17642l;
import r1.f;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a[\u0010\f\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "model", "Lkotlin/Function1;", "LU5/e$c;", "transform", "LXH/N;", "onState", "LE1/k;", "contentScale", "Lp1/E0;", "filterQuality", "LU5/e;", "a", "(Ljava/lang/Object;LnI/l;LnI/l;LE1/k;ILU0/m;II)LU5/e;", "coil-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {
    public static final e a(Object obj, C17642l<? super e.c, ? extends e.c> lVar, C17642l<? super e.c, C16807N> lVar2, C4478k kVar, int i10, C4889m mVar, int i11, int i12) {
        int i13 = i11;
        C17642l<e.c, e.c> a10 = (i12 & 2) != 0 ? e.f40189y.a() : lVar;
        C17642l<? super e.c, C16807N> lVar3 = (i12 & 4) != 0 ? null : lVar2;
        C4478k e10 = (i12 & 8) != 0 ? C4478k.f5915a.e() : kVar;
        int b10 = (i12 & 16) != 0 ? f.f28623w0.b() : i10;
        if (C4895p.J()) {
            C4895p.S(-1093003120, i13, -1, "coil3.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:76)");
        }
        C4889m mVar2 = mVar;
        int i14 = i13 & 14;
        int i15 = i13 << 3;
        e a11 = f.a(obj, C.a((Context) mVar2.Q(AndroidCompositionLocals_androidKt.g())), a10, lVar3, e10, b10, mVar2, i14 | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (i15 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        return a11;
    }
}
