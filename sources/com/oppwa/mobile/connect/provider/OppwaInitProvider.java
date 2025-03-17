package com.oppwa.mobile.connect.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.Optional;

public class OppwaInitProvider extends ContentProvider {
    public static Context appContext;

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException a() {
        return new IllegalStateException("Context can't be null");
    }

    public static Context requireAppContext() {
        return (Context) Optional.ofNullable(appContext).orElseThrow(new u());
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        appContext = getContext();
        Logger.init(requireAppContext());
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
