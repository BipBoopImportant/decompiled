package vF;

import U0.C4889m;
import U0.C4895p;
import UE.C13733a;
import XH.C16807N;
import android.net.Uri;
import androidx.compose.ui.d;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import com.sugarcube.app.base.external.entrypoint.GetEntryPointUseCase;
import com.sugarcube.app.base.external.entrypoint.TrackEntryPointUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mF.m;
import nF.C14851b;
import nI.C17642l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LvF/a;", "Lcom/sugarcube/app/base/external/entrypoint/GetEntryPointUseCase;", "LUE/a;", "deeplinks", "Lcom/sugarcube/app/base/external/entrypoint/TrackEntryPointUseCase;", "trackEntryPoint", "<init>", "(LUE/a;Lcom/sugarcube/app/base/external/entrypoint/TrackEntryPointUseCase;)V", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "origin", "LnF/b;", "model", "Lkotlin/Function1;", "Landroid/net/Uri;", "LXH/N;", "onDeeplink", "invoke", "(Lcom/sugarcube/app/base/data/analytics/OpeningSource;LnF/b;LnI/l;LU0/m;I)V", "a", "LUE/a;", "b", "Lcom/sugarcube/app/base/external/entrypoint/TrackEntryPointUseCase;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vF.a  reason: case insensitive filesystem */
public final class C15142a implements GetEntryPointUseCase {

    /* renamed from: a  reason: collision with root package name */
    private final C13733a f131556a;

    /* renamed from: b  reason: collision with root package name */
    private final TrackEntryPointUseCase f131557b;

    public C15142a(C13733a aVar, TrackEntryPointUseCase trackEntryPointUseCase) {
        C17542s.j(aVar, "deeplinks");
        C17542s.j(trackEntryPointUseCase, "trackEntryPoint");
        this.f131556a = aVar;
        this.f131557b = trackEntryPointUseCase;
    }

    public void invoke(OpeningSource openingSource, C14851b bVar, C17642l<? super Uri, C16807N> lVar, C4889m mVar, int i10) {
        int i11 = i10;
        OpeningSource openingSource2 = openingSource;
        C17542s.j(openingSource, "origin");
        C14851b bVar2 = bVar;
        C17542s.j(bVar, "model");
        C17542s.j(lVar, "onDeeplink");
        mVar.W(-93134367);
        if (C4895p.J()) {
            C4895p.S(-93134367, i11, -1, "com.sugarcube.app.base.ui.entrypoint.GetEntryPointUseCaseImpl.invoke (GetEntryPointUseCaseImpl.kt:29)");
        }
        m.e(bVar, openingSource, this.f131556a, this.f131557b, (d) null, lVar, mVar, ((i11 >> 3) & 14) | ((i11 << 3) & 112) | ((i11 << 9) & ImageMetadata.JPEG_GPS_COORDINATES), 16);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
