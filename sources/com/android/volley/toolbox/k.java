package com.android.volley.toolbox;

import com.android.volley.n;
import com.android.volley.p;
import com.android.volley.v;
import java.io.UnsupportedEncodingException;

public abstract class k<T> extends n<T> {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", new Object[]{PROTOCOL_CHARSET});
    private p.b<T> mListener;
    private final Object mLock;
    private final String mRequestBody;

    @Deprecated
    public k(String str, String str2, p.b<T> bVar, p.a aVar) {
        this(-1, str, str2, bVar, aVar);
    }

    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    /* access modifiers changed from: protected */
    public void deliverResponse(T t10) {
        p.b<T> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(t10);
        }
    }

    public byte[] getBody() {
        try {
            String str = this.mRequestBody;
            if (str == null) {
                return null;
            }
            return str.getBytes(PROTOCOL_CHARSET);
        } catch (UnsupportedEncodingException unused) {
            v.f("Unsupported Encoding while trying to get the bytes of %s using %s", this.mRequestBody, PROTOCOL_CHARSET);
            return null;
        }
    }

    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    /* access modifiers changed from: protected */
    public abstract p<T> parseNetworkResponse(com.android.volley.k kVar);

    public k(int i10, String str, String str2, p.b<T> bVar, p.a aVar) {
        super(i10, str, aVar);
        this.mLock = new Object();
        this.mListener = bVar;
        this.mRequestBody = str2;
    }
}
