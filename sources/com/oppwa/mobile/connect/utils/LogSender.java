package com.oppwa.mobile.connect.utils;

import android.util.Log;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.HttpUtils;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LogSender {

    /* renamed from: a  reason: collision with root package name */
    private CompleteListener f122161a;

    @FunctionalInterface
    public interface CompleteListener {
        void onComplete();
    }

    LogSender() {
    }

    /* access modifiers changed from: package-private */
    public void b(List<c> list, Connect.ProviderMode providerMode, File file) {
        new Thread(new e(this, list, providerMode, file)).start();
    }

    public void a(CompleteListener completeListener) {
        this.f122161a = completeListener;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list, Connect.ProviderMode providerMode, File file) {
        try {
            HttpUtils.makeRequest(providerMode, String.format("/v1/checkouts/%s/logs", new Object[]{((c) list.get(0)).a()}), a((List<c>) list), (String) null);
            if (!file.delete()) {
                String str = Logger.f122162a;
                Log.e(str, "Cannot delete the log file: " + file);
            }
        } catch (Exception e10) {
            if (e10.getMessage() != null && !e10.getMessage().contains("200.300.404")) {
                Log.e(Logger.f122162a, "Error: ", e10);
            }
        }
        CompleteListener completeListener = this.f122161a;
        if (completeListener != null) {
            completeListener.onComplete();
        }
    }

    private Map<String, String> a(List<c> list) {
        HashMap hashMap = new HashMap();
        int i10 = 0;
        for (c next : list) {
            hashMap.put("messages[" + i10 + "].logger", "mSDK");
            hashMap.put("messages[" + i10 + "].timestamp", next.d());
            hashMap.put("messages[" + i10 + "].message", next.c());
            hashMap.put("messages[" + i10 + "].level", next.b());
            i10++;
        }
        return hashMap;
    }
}
