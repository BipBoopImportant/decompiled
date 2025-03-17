package com.sugarcube.app.base.external.entrypoint;

import U0.C4889m;
import XH.C16807N;
import android.net.Uri;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import kotlin.Metadata;
import nF.C14851b;
import nI.C17642l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H§\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/external/entrypoint/GetEntryPointUseCase;", "", "Lcom/sugarcube/app/base/data/analytics/OpeningSource;", "origin", "LnF/b;", "model", "Lkotlin/Function1;", "Landroid/net/Uri;", "LXH/N;", "onDeeplink", "invoke", "(Lcom/sugarcube/app/base/data/analytics/OpeningSource;LnF/b;LnI/l;LU0/m;I)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GetEntryPointUseCase {
    void invoke(OpeningSource openingSource, C14851b bVar, C17642l<? super Uri, C16807N> lVar, C4889m mVar, int i10);
}
