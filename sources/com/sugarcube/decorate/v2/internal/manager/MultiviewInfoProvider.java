package com.sugarcube.decorate.v2.internal.manager;

import dI.C17164e;
import java.util.List;
import kG.C17497c;
import kotlin.Metadata;
import mG.C17596a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ \u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/MultiviewInfoProvider;", "", "LkG/c;", "metadata", "", "LmG/a;", "getMultiviewInformation", "(LkG/c;LdI/e;)Ljava/lang/Object;", "updateMultiviewInformation", "(LdI/e;)Ljava/lang/Object;", "", "useSideViews", "(ZLdI/e;)Ljava/lang/Object;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface MultiviewInfoProvider {
    Object getMultiviewInformation(C17497c cVar, C17164e<? super List<C17596a>> eVar);

    Object updateMultiviewInformation(C17164e<? super List<C17596a>> eVar);

    Object updateMultiviewInformation(boolean z10, C17164e<? super List<C17596a>> eVar);
}
