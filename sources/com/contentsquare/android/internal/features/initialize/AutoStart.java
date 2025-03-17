package com.contentsquare.android.internal.features.initialize;

import XH.C16824o;
import XH.C16825p;
import a9.C6783a1;
import a9.C6831g1;
import a9.X0;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.lifecycle.A;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import b8.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/contentsquare/android/internal/features/initialize/AutoStart;", "Landroid/content/ContentProvider;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
public class AutoStart extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public final C16824o f46830a = C16825p.b(new a(this));

    /* renamed from: b  reason: collision with root package name */
    public final b f46831b = new b(this);

    public static final class a extends C17544u implements C17631a<C6831g1> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AutoStart f46832c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AutoStart autoStart) {
            super(0);
            this.f46832c = autoStart;
        }

        public final Object invoke() {
            Context context = this.f46832c.getContext();
            if (context == null) {
                return null;
            }
            return new C6831g1(context);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/contentsquare/android/internal/features/initialize/AutoStart$b", "Landroidx/lifecycle/h;", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements C5205h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AutoStart f46833a;

        public b(AutoStart autoStart) {
            this.f46833a = autoStart;
        }

        public final void c(C5221y yVar) {
            C17542s.j(yVar, "owner");
            Context context = this.f46833a.getContext();
            if (context != null && X0.a(context)) {
                i.p(context);
            }
        }
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        C17542s.j(uri, "uri");
        return 0;
    }

    public final String getType(Uri uri) {
        C17542s.j(uri, "uri");
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        C17542s.j(uri, "uri");
        return null;
    }

    public final boolean onCreate() {
        C6831g1 g1Var = (C6831g1) this.f46830a.getValue();
        if (g1Var != null) {
            A a10 = g1Var.f42570b;
            if (a10 == null) {
                C17542s.z("registry");
                a10 = null;
            }
            if (a10 != null) {
                a10.c(this.f46831b);
            }
        }
        Context context = getContext();
        if (context == null) {
            return true;
        }
        C17542s.j(context, "context");
        if (C6783a1.f42432b != null) {
            return true;
        }
        Context applicationContext = context.getApplicationContext();
        C17542s.h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        C6783a1.f42432b = new C6783a1((Application) applicationContext);
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C17542s.j(uri, "uri");
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C17542s.j(uri, "uri");
        return 0;
    }
}
