package com.google.firebase.messaging;

import R9.b;
import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import vc.c;

/* renamed from: com.google.firebase.messaging.n  reason: case insensitive filesystem */
class C9556n {
    @SuppressLint({"ThreadPoolCreation"})
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(str));
    }

    static Executor b() {
        return a("Firebase-Messaging-File-Io");
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new b("Firebase-Messaging-Init"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService d() {
        return vc.b.a().a(new b("Firebase-Messaging-Intent-Handle"), c.HIGH_SPEED);
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new b("Firebase-Messaging-Network-Io"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new b("Firebase-Messaging-Task"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ScheduledExecutorService g() {
        return new ScheduledThreadPoolExecutor(1, new b("Firebase-Messaging-Topics-Io"));
    }
}
