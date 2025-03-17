package com.google.gson.internal.sql;

import Tc.a;
import Tc.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.sql.Timestamp;
import java.util.Date;

class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: b  reason: collision with root package name */
    static final v f69176b = new v() {
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.q(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final TypeAdapter<Date> f69177a;

    /* renamed from: a */
    public Timestamp read(a aVar) {
        Date read = this.f69177a.read(aVar);
        if (read != null) {
            return new Timestamp(read.getTime());
        }
        return null;
    }

    /* renamed from: b */
    public void write(c cVar, Timestamp timestamp) {
        this.f69177a.write(cVar, timestamp);
    }

    private SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.f69177a = typeAdapter;
    }
}
