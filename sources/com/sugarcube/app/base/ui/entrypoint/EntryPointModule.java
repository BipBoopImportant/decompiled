package com.sugarcube.app.base.ui.entrypoint;

import HF.C13011f;
import UE.C13734b;
import ZE.C13908a;
import com.sugarcube.app.base.external.entrypoint.EntryPointModelUseCase;
import com.sugarcube.app.base.external.entrypoint.GetEntryPointUseCase;
import com.sugarcube.app.base.external.entrypoint.GetMembershipListsCardUseCase;
import com.sugarcube.app.base.external.entrypoint.TrackEntryPointUseCase;
import com.sugarcube.app.base.external.membership.GetMembershipActionListUseCase;
import kotlin.Metadata;
import vF.C15142a;
import vF.C15143b;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/sugarcube/app/base/ui/entrypoint/EntryPointModule;", "", "LvF/a;", "useCase", "Lcom/sugarcube/app/base/external/entrypoint/GetEntryPointUseCase;", "bindGetEntryPointUseCase", "(LvF/a;)Lcom/sugarcube/app/base/external/entrypoint/GetEntryPointUseCase;", "LUE/b;", "impl", "Lcom/sugarcube/app/base/external/entrypoint/EntryPointModelUseCase;", "bindEntryPointModelUseCase", "(LUE/b;)Lcom/sugarcube/app/base/external/entrypoint/EntryPointModelUseCase;", "LvF/b;", "Lcom/sugarcube/app/base/external/entrypoint/TrackEntryPointUseCase;", "bindTrackEntryPointUseCase", "(LvF/b;)Lcom/sugarcube/app/base/external/entrypoint/TrackEntryPointUseCase;", "LHF/f;", "Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase;", "bindGetMembershipListsCardUseCase", "(LHF/f;)Lcom/sugarcube/app/base/external/entrypoint/GetMembershipListsCardUseCase;", "LZE/a;", "Lcom/sugarcube/app/base/external/membership/GetMembershipActionListUseCase;", "bindGetMembershipActionListUseCase", "(LZE/a;)Lcom/sugarcube/app/base/external/membership/GetMembershipActionListUseCase;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface EntryPointModule {
    EntryPointModelUseCase bindEntryPointModelUseCase(C13734b bVar);

    GetEntryPointUseCase bindGetEntryPointUseCase(C15142a aVar);

    GetMembershipActionListUseCase bindGetMembershipActionListUseCase(C13908a aVar);

    GetMembershipListsCardUseCase bindGetMembershipListsCardUseCase(C13011f fVar);

    TrackEntryPointUseCase bindTrackEntryPointUseCase(C15143b bVar);
}
