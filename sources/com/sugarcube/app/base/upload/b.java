package com.sugarcube.app.base.upload;

import WH.C16729a;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import nH.C17624c;
import nH.C17627f;

public final class b implements C17624c<IUploaderV2> {
    public static IUploaderV2 a(ConfigRepository configRepository, C16729a<g> aVar) {
        return (IUploaderV2) C17627f.d(UploadModule.Companion.b(configRepository, aVar));
    }
}
