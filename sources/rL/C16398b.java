package RL;

import GK.C15775C;
import GK.C15805x;
import QL.h;
import Tc.c;
import WK.C16770e;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* renamed from: RL.b  reason: case insensitive filesystem */
final class C16398b<T> implements h<T, C15775C> {

    /* renamed from: c  reason: collision with root package name */
    private static final C15805x f138057c = C15805x.e("application/json; charset=UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final Gson f138058a;

    /* renamed from: b  reason: collision with root package name */
    private final TypeAdapter<T> f138059b;

    C16398b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f138058a = gson;
        this.f138059b = typeAdapter;
    }

    /* renamed from: b */
    public C15775C a(T t10) {
        C16770e eVar = new C16770e();
        c u10 = this.f138058a.u(new OutputStreamWriter(eVar.o3(), StandardCharsets.UTF_8));
        this.f138059b.write(u10, t10);
        u10.close();
        return C15775C.c(f138057c, eVar.i0());
    }
}
