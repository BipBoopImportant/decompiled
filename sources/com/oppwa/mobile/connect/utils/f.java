package com.oppwa.mobile.connect.utils;

import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.utils.LogSender;
import java.io.File;
import java.util.List;
import java.util.function.Consumer;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LogSender.CompleteListener f122203a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f122204b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Connect.ProviderMode f122205c;

    public /* synthetic */ f(LogSender.CompleteListener completeListener, List list, Connect.ProviderMode providerMode) {
        this.f122203a = completeListener;
        this.f122204b = list;
        this.f122205c = providerMode;
    }

    public final void accept(Object obj) {
        Logger.a(this.f122203a, this.f122204b, this.f122205c, (File) obj);
    }
}
