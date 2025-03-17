package com.google.android.gms.common.data;

import K9.C6620s;
import L9.c;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
public final class DataHolder extends L9.a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();

    /* renamed from: k  reason: collision with root package name */
    private static final a f48055k = new a(new String[0], (String) null);

    /* renamed from: a  reason: collision with root package name */
    final int f48056a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f48057b;

    /* renamed from: c  reason: collision with root package name */
    Bundle f48058c;

    /* renamed from: d  reason: collision with root package name */
    private final CursorWindow[] f48059d;

    /* renamed from: e  reason: collision with root package name */
    private final int f48060e;

    /* renamed from: f  reason: collision with root package name */
    private final Bundle f48061f;

    /* renamed from: g  reason: collision with root package name */
    int[] f48062g;

    /* renamed from: h  reason: collision with root package name */
    int f48063h;

    /* renamed from: i  reason: collision with root package name */
    boolean f48064i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f48065j = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f48066a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList f48067b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final HashMap f48068c = new HashMap();

        /* synthetic */ a(String[] strArr, String str, I9.a aVar) {
            this.f48066a = (String[]) C6620s.l(strArr);
        }
    }

    DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f48056a = i10;
        this.f48057b = strArr;
        this.f48059d = cursorWindowArr;
        this.f48060e = i11;
        this.f48061f = bundle;
    }

    public int B() {
        return this.f48060e;
    }

    public final void F() {
        this.f48058c = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f48057b;
            if (i11 >= strArr.length) {
                break;
            }
            this.f48058c.putInt(strArr[i11], i11);
            i11++;
        }
        this.f48062g = new int[this.f48059d.length];
        int i12 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f48059d;
            if (i10 < cursorWindowArr.length) {
                this.f48062g[i10] = i12;
                i12 += this.f48059d[i10].getNumRows() - (i12 - cursorWindowArr[i10].getStartPosition());
                i10++;
            } else {
                this.f48063h = i12;
                return;
            }
        }
    }

    public void close() {
        synchronized (this) {
            try {
                if (!this.f48064i) {
                    this.f48064i = true;
                    int i10 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f48059d;
                        if (i10 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i10].close();
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (this.f48065j && this.f48059d.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + obj + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.f48064i;
        }
        return z10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String[] strArr = this.f48057b;
        int a10 = c.a(parcel);
        c.v(parcel, 1, strArr, false);
        c.x(parcel, 2, this.f48059d, i10, false);
        c.n(parcel, 3, B());
        c.e(parcel, 4, x(), false);
        c.n(parcel, 1000, this.f48056a);
        c.b(parcel, a10);
        if ((i10 & 1) != 0) {
            close();
        }
    }

    public Bundle x() {
        return this.f48061f;
    }
}
