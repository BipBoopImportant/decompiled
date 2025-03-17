package com.google.firebase.messaging;

import R9.b;
import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class b0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f68397a;

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f68398b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseMessaging f68399c;
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: d  reason: collision with root package name */
    ExecutorService f68400d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("firebase-iid-executor"));

    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private b0 f68401a;

        public a(b0 b0Var) {
            this.f68401a = b0Var;
        }

        public void a() {
            if (b0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f68401a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            b0 b0Var = this.f68401a;
            if (b0Var != null && b0Var.d()) {
                if (b0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f68401a.f68399c.o(this.f68401a, 0);
                this.f68401a.b().unregisterReceiver(this);
                this.f68401a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public b0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f68399c = firebaseMessaging;
        this.f68397a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f68398b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* access modifiers changed from: package-private */
    public Context b() {
        return this.f68399c.p();
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        try {
            if (this.f68399c.m() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e10) {
            if (D.i(e10.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e10.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (X.b().e(b())) {
            this.f68398b.acquire();
        }
        try {
            this.f68399c.L(true);
            if (!this.f68399c.A()) {
                this.f68399c.L(false);
                if (X.b().e(b())) {
                    this.f68398b.release();
                }
            } else if (!X.b().d(b()) || d()) {
                if (e()) {
                    this.f68399c.L(false);
                } else {
                    this.f68399c.P(this.f68397a);
                }
                if (!X.b().e(b())) {
                    return;
                }
                this.f68398b.release();
            } else {
                new a(this).a();
                if (X.b().e(b())) {
                    this.f68398b.release();
                }
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
            this.f68399c.L(false);
            if (!X.b().e(b())) {
            }
        } catch (Throwable th2) {
            if (X.b().e(b())) {
                this.f68398b.release();
            }
            throw th2;
        }
    }
}
