package RL;

import GK.C15777E;
import QL.h;
import Tc.a;
import Tc.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.j;

/* renamed from: RL.c  reason: case insensitive filesystem */
final class C16399c<T> implements h<C15777E, T> {

    /* renamed from: a  reason: collision with root package name */
    private final Gson f138060a;

    /* renamed from: b  reason: collision with root package name */
    private final TypeAdapter<T> f138061b;

    C16399c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f138060a = gson;
        this.f138061b = typeAdapter;
    }

    /* renamed from: b */
    public T a(C15777E e10) {
        a t10 = this.f138060a.t(e10.e());
        try {
            T read = this.f138061b.read(t10);
            if (t10.F() == b.END_DOCUMENT) {
                return read;
            }
            throw new j("JSON document was not fully consumed.");
        } finally {
            e10.close();
        }
    }
}
