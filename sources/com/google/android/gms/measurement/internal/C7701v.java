package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.C7427v2;
import com.google.android.gms.internal.measurement.L4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.v  reason: case insensitive filesystem */
public final class C7701v {

    /* renamed from: a  reason: collision with root package name */
    private final String f50440a;

    /* renamed from: b  reason: collision with root package name */
    private long f50441b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7660p f50442c;

    public C7701v(C7660p pVar, String str) {
        this.f50442c = pVar;
        C6620s.f(str);
        this.f50440a = str;
        this.f50441b = -1;
    }

    public final List<C7687t> a() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = this.f50442c.z().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f50440a, String.valueOf(this.f50441b)}, (String) null, (String) null, "rowid", "1000");
            if (!cursor.moveToFirst()) {
                List<C7687t> emptyList = Collections.emptyList();
                cursor.close();
                return emptyList;
            }
            do {
                boolean z10 = false;
                long j10 = cursor.getLong(0);
                long j11 = cursor.getLong(3);
                if (cursor.getLong(5) == 1) {
                    z10 = true;
                }
                byte[] blob = cursor.getBlob(4);
                if (j10 > this.f50441b) {
                    this.f50441b = j10;
                }
                try {
                    C7427v2.a aVar = (C7427v2.a) N5.E(C7427v2.V(), blob);
                    String string = cursor.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    aVar.K(string).M(cursor.getLong(2));
                    arrayList.add(new C7687t(j10, j11, z10, (C7427v2) ((L4) aVar.s())));
                } catch (IOException e10) {
                    this.f50442c.f().E().c("Data loss. Failed to merge raw event. appId", C7607h2.t(this.f50440a), e10);
                }
            } while (cursor.moveToNext());
            cursor.close();
            return arrayList;
        } catch (SQLiteException e11) {
            this.f50442c.f().E().c("Data loss. Error querying raw events batch. appId", C7607h2.t(this.f50440a), e11);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public C7701v(C7660p pVar, String str, long j10) {
        this.f50442c = pVar;
        C6620s.f(str);
        this.f50440a = str;
        this.f50441b = pVar.G("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1);
    }
}
