package com.auth0.android.jwt;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Map;

public class JWT implements Parcelable {
    public static final Parcelable.Creator<JWT> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f46299a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f46300b;

    /* renamed from: c  reason: collision with root package name */
    private e f46301c;

    /* renamed from: d  reason: collision with root package name */
    private String f46302d;

    static class a implements Parcelable.Creator<JWT> {
        a() {
        }

        /* renamed from: a */
        public JWT createFromParcel(Parcel parcel) {
            return new JWT(parcel.readString());
        }

        /* renamed from: b */
        public JWT[] newArray(int i10) {
            return new JWT[i10];
        }
    }

    public JWT(String str) {
        b(str);
        this.f46299a = str;
    }

    private String a(String str) {
        try {
            return new String(Base64.decode(str, 11), Charset.defaultCharset());
        } catch (IllegalArgumentException e10) {
            throw new d("Received bytes didn't correspond to a valid Base64 encoded string.", e10);
        }
    }

    private void b(String str) {
        String[] f10 = f(str);
        this.f46300b = (Map) e(a(f10[0]), new TypeToken<Map<String, String>>() {
        }.getType());
        this.f46301c = (e) e(a(f10[1]), e.class);
        this.f46302d = f10[2];
    }

    static Gson d() {
        return new f().d(e.class, new JWTDeserializer()).b();
    }

    private <T> T e(String str, Type type) {
        try {
            return d().o(str, type);
        } catch (Exception e10) {
            throw new d("The token's payload had an invalid JSON format.", e10);
        }
    }

    private String[] f(String str) {
        String[] split = str.split("\\.");
        if (split.length == 2 && str.endsWith(".")) {
            split = new String[]{split[0], split[1], ""};
        }
        if (split.length == 3) {
            return split;
        }
        throw new d(String.format("The token was expected to have 3 parts, but got %s.", new Object[]{Integer.valueOf(split.length)}));
    }

    public b c(String str) {
        return this.f46301c.a(str);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f46299a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f46299a);
    }
}
