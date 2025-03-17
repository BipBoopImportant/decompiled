package com.google.firebase.messaging;

import android.os.Bundle;
import j0.C5445a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.d  reason: case insensitive filesystem */
public final class C9546d {

    /* renamed from: a  reason: collision with root package name */
    public static final long f68410a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.d$a */
    public static final class a {
        public static C5445a<String, String> a(Bundle bundle) {
            C5445a<String, String> aVar = new C5445a<>();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals("message_type") && !next.equals("collapse_key")) {
                        aVar.put(next, str);
                    }
                }
            }
            return aVar;
        }
    }
}
