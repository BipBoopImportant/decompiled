package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.C7370o0;

/* renamed from: com.google.android.gms.measurement.internal.c2  reason: case insensitive filesystem */
final class C7572c2 extends C7370o0 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7579d2 f50088a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7572c2(C7579d2 d2Var, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f50088a = d2Var;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e10) {
            throw e10;
        } catch (SQLiteException unused) {
            this.f50088a.f().E().a("Opening the local database failed, dropping and recreating it");
            if (!this.f50088a.zza().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f50088a.f().E().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e11) {
                this.f50088a.f().E().b("Failed to open local database. Events will bypass local storage", e11);
                return null;
            }
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C7708w.b(this.f50088a.f(), sQLiteDatabase);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C7708w.c(this.f50088a.f(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
