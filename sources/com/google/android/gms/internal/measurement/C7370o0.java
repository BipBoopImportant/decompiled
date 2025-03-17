package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: com.google.android.gms.internal.measurement.o0  reason: case insensitive filesystem */
public abstract class C7370o0 extends SQLiteOpenHelper {
    public C7370o0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        this(context, str, (SQLiteDatabase.CursorFactory) null, 1, C7401s0.f49060a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C7370o0(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10, C7401s0 s0Var) {
        super(context, (str == null || C7335k0.a().d(str, s0Var, C7386q0.SQLITE_OPEN_HELPER_TYPE).equals("")) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
