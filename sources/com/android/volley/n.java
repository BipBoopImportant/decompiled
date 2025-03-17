package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.b;
import com.android.volley.p;
import com.android.volley.v;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

public abstract class n<T> implements Comparable<n<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private b.a mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private p.a mErrorListener;
    /* access modifiers changed from: private */
    public final v.a mEventLog;
    private final Object mLock;
    private final int mMethod;
    private b mRequestCompleteListener;
    private o mRequestQueue;
    private boolean mResponseDelivered;
    private r mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f46231a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f46232b;

        a(String str, long j10) {
            this.f46231a = str;
            this.f46232b = j10;
        }

        public void run() {
            n.this.mEventLog.a(this.f46231a, this.f46232b);
            n.this.mEventLog.b(n.this.toString());
        }
    }

    interface b {
        void a(n<?> nVar, p<?> pVar);

        void b(n<?> nVar);
    }

    public enum c {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    @Deprecated
    public n(String str, p.a aVar) {
        this(-1, str, aVar);
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry next : map.entrySet()) {
                if (next.getKey() == null || next.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", new Object[]{next.getKey(), next.getValue()}));
                }
                sb2.append(URLEncoder.encode((String) next.getKey(), str));
                sb2.append('=');
                sb2.append(URLEncoder.encode((String) next.getValue(), str));
                sb2.append('&');
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Encoding not supported: " + str, e10);
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void addMarker(String str) {
        if (v.a.f46288c) {
            this.mEventLog.a(str, Thread.currentThread().getId());
        }
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    public void deliverError(u uVar) {
        p.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        if (aVar != null) {
            aVar.onErrorResponse(uVar);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void deliverResponse(T t10);

    /* access modifiers changed from: package-private */
    public void finish(String str) {
        o oVar = this.mRequestQueue;
        if (oVar != null) {
            oVar.c(this);
        }
        if (v.a.f46288c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id2));
                return;
            }
            this.mEventLog.a(str, id2);
            this.mEventLog.b(toString());
        }
    }

    public byte[] getBody() {
        Map<String, String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return encodeParameters(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public b.a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + '-' + url;
    }

    public p.a getErrorListener() {
        p.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        return aVar;
    }

    public Map<String, String> getHeaders() {
        return Collections.emptyMap();
    }

    public int getMethod() {
        return this.mMethod;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> getParams() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getParamsEncoding() {
        return "UTF-8";
    }

    @Deprecated
    public byte[] getPostBody() {
        Map<String, String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return encodeParameters(postParams, getPostParamsEncoding());
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public Map<String, String> getPostParams() {
        return getParams();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public c getPriority() {
        return c.NORMAL;
    }

    public r getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().c();
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z10;
        synchronized (this.mLock) {
            z10 = this.mResponseDelivered;
        }
        return z10;
    }

    public boolean isCanceled() {
        boolean z10;
        synchronized (this.mLock) {
            z10 = this.mCanceled;
        }
        return z10;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyListenerResponseNotUsable() {
        b bVar;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            bVar.b(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyListenerResponseReceived(p<?> pVar) {
        b bVar;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            bVar.a(this, pVar);
        }
    }

    /* access modifiers changed from: protected */
    public u parseNetworkError(u uVar) {
        return uVar;
    }

    /* access modifiers changed from: protected */
    public abstract p<T> parseNetworkResponse(k kVar);

    /* access modifiers changed from: package-private */
    public void sendEvent(int i10) {
        o oVar = this.mRequestQueue;
        if (oVar != null) {
            oVar.e(this, i10);
        }
    }

    public n<?> setCacheEntry(b.a aVar) {
        this.mCacheEntry = aVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void setNetworkRequestCompleteListener(b bVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = bVar;
        }
    }

    public n<?> setRequestQueue(o oVar) {
        this.mRequestQueue = oVar;
        return this;
    }

    public n<?> setRetryPolicy(r rVar) {
        this.mRetryPolicy = rVar;
        return this;
    }

    public final n<?> setSequence(int i10) {
        this.mSequence = Integer.valueOf(i10);
        return this;
    }

    public final n<?> setShouldCache(boolean z10) {
        this.mShouldCache = z10;
        return this;
    }

    public final n<?> setShouldRetryConnectionErrors(boolean z10) {
        this.mShouldRetryConnectionErrors = z10;
        return this;
    }

    public final n<?> setShouldRetryServerErrors(boolean z10) {
        this.mShouldRetryServerErrors = z10;
        return this;
    }

    public n<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isCanceled() ? "[X] " : "[ ] ");
        sb2.append(getUrl());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(getPriority());
        sb2.append(" ");
        sb2.append(this.mSequence);
        return sb2.toString();
    }

    public n(int i10, String str, p.a aVar) {
        this.mEventLog = v.a.f46288c ? new v.a() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i10;
        this.mUrl = str;
        this.mErrorListener = aVar;
        setRetryPolicy(new e());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    public int compareTo(n<T> nVar) {
        c priority = getPriority();
        c priority2 = nVar.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - nVar.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }
}
