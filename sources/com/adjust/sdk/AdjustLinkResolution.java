package com.adjust.sdk;

import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class AdjustLinkResolution {
    private static volatile ExecutorService executor = null;
    private static final String[] expectedUrlHostSuffixArray = {"adjust.com", "adj.st", "go.link"};
    private static final int maxRecursions = 10;

    public interface AdjustLinkResolutionCallback {
        void resolvedLinkCallback(Uri uri);
    }

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ URL f45878a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AdjustLinkResolutionCallback f45879b;

        public a(URL url, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
            this.f45878a = url;
            this.f45879b = adjustLinkResolutionCallback;
        }

        public final void run() {
            AdjustLinkResolution.requestAndResolve(this.f45878a, 0, this.f45879b);
        }
    }

    private AdjustLinkResolution() {
    }

    private static URL convertToHttps(URL url) {
        String externalForm;
        if (url == null || (externalForm = url.toExternalForm()) == null || !externalForm.startsWith("http:")) {
            return url;
        }
        try {
            return new URL("https:" + externalForm.substring(5));
        } catch (MalformedURLException unused) {
            return url;
        }
    }

    private static Uri convertToUri(URL url) {
        if (url == null) {
            return null;
        }
        return Uri.parse(url.toString());
    }

    private static boolean isTerminalUrl(String str) {
        return urlMatchesSuffix(str, expectedUrlHostSuffixArray);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r1 != null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void requestAndResolve(java.net.URL r4, int r5, com.adjust.sdk.AdjustLinkResolution.AdjustLinkResolutionCallback r6) {
        /*
            java.net.URL r4 = convertToHttps(r4)
            r0 = 0
            java.net.URLConnection r1 = r4.openConnection()     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r1)     // Catch:{ all -> 0x002f }
            java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch:{ all -> 0x002f }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x002f }
            r2 = 0
            r1.setInstanceFollowRedirects(r2)     // Catch:{ all -> 0x0030 }
            r1.connect()     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "Location"
            java.lang.String r2 = r1.getHeaderField(r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0026
            java.net.URL r3 = new java.net.URL     // Catch:{ all -> 0x0030 }
            r3.<init>(r2)     // Catch:{ all -> 0x0030 }
            r0 = r3
        L_0x0026:
            r1.disconnect()
        L_0x0029:
            int r5 = r5 + 1
            resolveLink(r0, r4, r5, r6)
            goto L_0x0033
        L_0x002f:
            r1 = r0
        L_0x0030:
            if (r1 == 0) goto L_0x0029
            goto L_0x0026
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.AdjustLinkResolution.requestAndResolve(java.net.URL, int, com.adjust.sdk.AdjustLinkResolution$AdjustLinkResolutionCallback):void");
    }

    public static void resolveLink(String str, String[] strArr, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        URL url;
        if (adjustLinkResolutionCallback != null) {
            if (str == null) {
                adjustLinkResolutionCallback.resolvedLinkCallback((Uri) null);
                return;
            }
            try {
                url = new URL(str);
            } catch (MalformedURLException unused) {
                url = null;
            }
            if (url == null) {
                adjustLinkResolutionCallback.resolvedLinkCallback((Uri) null);
            } else if (!urlMatchesSuffix(url.getHost(), strArr)) {
                adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri(url));
            } else {
                if (executor == null) {
                    synchronized (expectedUrlHostSuffixArray) {
                        try {
                            if (executor == null) {
                                executor = Executors.newSingleThreadExecutor();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                executor.execute(new a(url, adjustLinkResolutionCallback));
            }
        }
    }

    private static boolean urlMatchesSuffix(String str, String[] strArr) {
        if (str == null || strArr == null) {
            return false;
        }
        for (String endsWith : strArr) {
            if (str.endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }

    private static void resolveLink(URL url, URL url2, int i10, AdjustLinkResolutionCallback adjustLinkResolutionCallback) {
        Uri convertToUri;
        if (url == null) {
            convertToUri = convertToUri(url2);
        } else if (!isTerminalUrl(url.getHost()) && i10 <= 10) {
            requestAndResolve(url, i10, adjustLinkResolutionCallback);
            return;
        } else {
            convertToUri = convertToUri(url);
        }
        adjustLinkResolutionCallback.resolvedLinkCallback(convertToUri);
    }
}
