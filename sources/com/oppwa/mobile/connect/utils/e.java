package com.oppwa.mobile.connect.utils;

import com.oppwa.mobile.connect.provider.Connect;
import java.io.File;
import java.util.List;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LogSender f122199a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f122200b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Connect.ProviderMode f122201c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ File f122202d;

    public /* synthetic */ e(LogSender logSender, List list, Connect.ProviderMode providerMode, File file) {
        this.f122199a = logSender;
        this.f122200b = list;
        this.f122201c = providerMode;
        this.f122202d = file;
    }

    public final void run() {
        this.f122199a.a(this.f122200b, this.f122201c, this.f122202d);
    }
}
