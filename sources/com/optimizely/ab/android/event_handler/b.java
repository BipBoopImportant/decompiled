package com.optimizely.ab.android.event_handler;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import org.slf4j.Logger;
import yE.C15299b;

class b {

    /* renamed from: c  reason: collision with root package name */
    public static int f122282c = 10000;

    /* renamed from: d  reason: collision with root package name */
    public static int f122283d = 60000;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C15299b f122284a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Logger f122285b;

    class a implements C15299b.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122286a;

        a(a aVar) {
            this.f122286a = aVar;
        }

        /* renamed from: a */
        public Boolean execute() {
            HttpURLConnection httpURLConnection = null;
            try {
                b.this.f122285b.info("Dispatching event: {}", (Object) this.f122286a);
                httpURLConnection = b.this.f122284a.b(this.f122286a.b());
                if (httpURLConnection == null) {
                    Boolean bool = Boolean.FALSE;
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                        } catch (Exception e10) {
                            b.this.f122285b.error("Unable to close connection", (Throwable) e10);
                        }
                    }
                    return bool;
                }
                httpURLConnection.setConnectTimeout(b.f122282c);
                httpURLConnection.setReadTimeout(b.f122283d);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(this.f122286a.a().getBytes());
                outputStream.flush();
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    Logger a10 = b.this.f122285b;
                    a10.error("Unexpected response from event endpoint, status: " + responseCode);
                    Boolean bool2 = Boolean.FALSE;
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception e11) {
                        b.this.f122285b.error("Unable to close connection", (Throwable) e11);
                    }
                    return bool2;
                }
                new BufferedInputStream(httpURLConnection.getInputStream()).close();
                b.this.f122285b.info("Successfully dispatched event: {}", (Object) this.f122286a);
                Boolean bool3 = Boolean.TRUE;
                try {
                    httpURLConnection.disconnect();
                } catch (Exception e12) {
                    b.this.f122285b.error("Unable to close connection", (Throwable) e12);
                }
                return bool3;
            } catch (Exception e13) {
                b.this.f122285b.error("Unable to send event: {}", (Object) this.f122286a, (Object) e13);
                Boolean bool4 = Boolean.FALSE;
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception e14) {
                        b.this.f122285b.error("Unable to close connection", (Throwable) e14);
                    }
                }
                return bool4;
            } catch (Throwable th2) {
                if (httpURLConnection != null) {
                    try {
                        httpURLConnection.disconnect();
                    } catch (Exception e15) {
                        b.this.f122285b.error("Unable to close connection", (Throwable) e15);
                    }
                }
                throw th2;
            }
        }
    }

    b(C15299b bVar, Logger logger) {
        this.f122284a = bVar;
        this.f122285b = logger;
    }

    /* access modifiers changed from: package-private */
    public boolean c(a aVar) {
        Boolean bool = (Boolean) this.f122284a.a(new a(aVar), 2, 5);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        this.f122285b.debug("SendEvent completed: {}", (Object) aVar);
        return bool.booleanValue();
    }
}
