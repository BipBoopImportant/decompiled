package com.sugarcube.app.base.di;

import GK.C15776D;
import GK.C15804w;
import OE.q;
import QJ.C16311i0;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.S;
import QJ.b1;
import TE.C13686a;
import UE.C13733a;
import android.content.Context;
import android.content.res.Resources;
import com.squareup.picasso.t;
import com.sugarcube.app.base.data.database.DaoEntitiesKt;
import com.sugarcube.app.base.data.database.ScenesDatabase;
import com.sugarcube.app.base.network.SmartaApiClient;
import com.sugarcube.core.network.api.SmartaApiService;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b'\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/app/base/di/AppModule;", "", "a", "AppScope", "IODispatcher", "BaseDir", "CacheDir", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AppModule {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123073a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/sugarcube/app/base/di/AppModule$AppScope;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AppScope {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/sugarcube/app/base/di/AppModule$BaseDir;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface BaseDir {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/sugarcube/app/base/di/AppModule$CacheDir;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface CacheDir {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/sugarcube/app/base/di/AppModule$IODispatcher;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface IODispatcher {
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001b\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0017\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/sugarcube/app/base/di/AppModule$a;", "", "<init>", "()V", "LUE/a;", "e", "()LUE/a;", "Landroid/content/Context;", "context", "Lcom/sugarcube/app/base/data/database/ScenesDatabase;", "k", "(Landroid/content/Context;)Lcom/sugarcube/app/base/data/database/ScenesDatabase;", "LOE/q;", "sugarcube", "Lcom/squareup/picasso/t;", "i", "(LOE/q;)Lcom/squareup/picasso/t;", "LQJ/Q;", "b", "()LQJ/Q;", "LQJ/M;", "f", "()LQJ/M;", "appContext", "Ljava/io/File;", "c", "(Landroid/content/Context;)Ljava/io/File;", "d", "Landroid/content/res/Resources;", "j", "(Landroid/content/Context;)Landroid/content/res/Resources;", "Lcom/sugarcube/app/base/network/SmartaApiClient;", "apiClient", "Lcom/sugarcube/core/network/api/SmartaApiService;", "l", "(Lcom/sugarcube/app/base/network/SmartaApiClient;)Lcom/sugarcube/core/network/api/SmartaApiService;", "LGK/w;", "g", "()LGK/w;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final C15776D h(C15804w.a aVar) {
            C17542s.j(aVar, "chain");
            return aVar.b(aVar.t());
        }

        @AppScope
        public final Q b() {
            return S.a(b1.b((F0) null, 1, (Object) null));
        }

        @BaseDir
        public final File c(Context context) {
            C17542s.j(context, "appContext");
            File filesDir = context.getFilesDir();
            if (!filesDir.exists()) {
                filesDir.mkdirs();
            }
            C17542s.i(filesDir, "apply(...)");
            return filesDir;
        }

        @CacheDir
        public final File d(Context context) {
            C17542s.j(context, "appContext");
            File cacheDir = context.getCacheDir();
            if (!cacheDir.exists()) {
                cacheDir.mkdirs();
            }
            C17542s.i(cacheDir, "apply(...)");
            return cacheDir;
        }

        public final C13733a e() {
            return C13733a.f117059a;
        }

        @IODispatcher
        public final M f() {
            return C16311i0.b();
        }

        public final C15804w g() {
            return new C13686a();
        }

        public final t i(q qVar) {
            C17542s.j(qVar, "sugarcube");
            return qVar.c();
        }

        public final Resources j(Context context) {
            C17542s.j(context, "appContext");
            Resources resources = context.getResources();
            C17542s.i(resources, "getResources(...)");
            return resources;
        }

        public final ScenesDatabase k(Context context) {
            C17542s.j(context, "context");
            return DaoEntitiesKt.getDatabase(context);
        }

        public final SmartaApiService l(SmartaApiClient smartaApiClient) {
            C17542s.j(smartaApiClient, "apiClient");
            return smartaApiClient.createService();
        }

        private a() {
        }
    }
}
