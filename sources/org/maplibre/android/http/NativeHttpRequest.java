package org.maplibre.android.http;

import DL.C15585c;
import DL.C15587e;
import androidx.annotation.Keep;
import java.util.concurrent.locks.ReentrantLock;
import org.maplibre.android.MapLibre;
import org.maplibre.android.http.a;

@Keep
public class NativeHttpRequest implements C15587e {
    private final C15585c httpRequest;
    /* access modifiers changed from: private */
    public final ReentrantLock lock = new ReentrantLock();
    /* access modifiers changed from: private */
    @Keep
    public long nativePtr;

    class a implements a.C4247a {
        a() {
        }

        public void a(byte[] bArr) {
            if (bArr != null) {
                NativeHttpRequest.this.lock.lock();
                if (NativeHttpRequest.this.nativePtr != 0) {
                    NativeHttpRequest.this.nativeOnResponse(200, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, bArr);
                }
                NativeHttpRequest.this.lock.unlock();
            }
        }
    }

    @Keep
    private NativeHttpRequest(long j10, String str, String str2, String str3, boolean z10) {
        C15585c a10 = MapLibre.getModuleProvider().a();
        this.httpRequest = a10;
        this.nativePtr = j10;
        if (str.startsWith("local://")) {
            executeLocalRequest(str);
        } else {
            a10.a(this, j10, str, str2, str3, z10);
        }
    }

    private void executeLocalRequest(String str) {
        new a(new a()).execute(new String[]{str});
    }

    @Keep
    private native void nativeOnFailure(int i10, String str);

    /* access modifiers changed from: private */
    @Keep
    public native void nativeOnResponse(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr);

    public void cancel() {
        this.httpRequest.b();
        this.lock.lock();
        this.nativePtr = 0;
        this.lock.unlock();
    }

    public void handleFailure(int i10, String str) {
        this.lock.lock();
        if (this.nativePtr != 0) {
            nativeOnFailure(i10, str);
        }
        this.lock.unlock();
    }

    public void onResponse(int i10, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
        this.lock.lock();
        if (this.nativePtr != 0) {
            nativeOnResponse(i10, str, str2, str3, str4, str5, str6, bArr);
        }
        this.lock.unlock();
    }
}
