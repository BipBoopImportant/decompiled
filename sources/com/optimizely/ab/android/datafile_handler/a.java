package com.optimizely.ab.android.datafile_handler;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import yE.C15298a;
import yE.C15301d;

class a {

    /* renamed from: a  reason: collision with root package name */
    private final C15298a f122268a;

    /* renamed from: b  reason: collision with root package name */
    private final Logger f122269b;

    a(C15298a aVar, Logger logger) {
        this.f122268a = aVar;
        this.f122269b = logger;
    }

    private JSONObject a() {
        String c10 = this.f122268a.c("optly-background-watchers.json");
        if (c10 == null) {
            this.f122269b.info("Creating background watchers file {}.", (Object) "optly-background-watchers.json");
            c10 = "{}";
        }
        return new JSONObject(c10);
    }

    private boolean b(String str) {
        this.f122269b.info("Saving background watchers file {}.", (Object) "optly-background-watchers.json");
        boolean d10 = this.f122268a.d("optly-background-watchers.json", str);
        if (d10) {
            this.f122269b.info("Saved background watchers file {}.", (Object) "optly-background-watchers.json");
        } else {
            this.f122269b.warn("Unable to save background watchers file {}.", (Object) "optly-background-watchers.json");
        }
        return d10;
    }

    /* access modifiers changed from: package-private */
    public boolean c(C15301d dVar, boolean z10) {
        if (dVar.b().isEmpty()) {
            this.f122269b.error("Passed in an empty string for projectId");
            return false;
        }
        try {
            JSONObject a10 = a();
            if (a10 != null) {
                a10.put(dVar.b(), z10);
                return b(a10.toString());
            }
        } catch (JSONException e10) {
            this.f122269b.error("Unable to update watching state for project id", (Throwable) e10);
        }
        return false;
    }
}
