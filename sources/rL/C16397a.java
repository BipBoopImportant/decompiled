package RL;

import GK.C15775C;
import GK.C15777E;
import QL.h;
import QL.y;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: RL.a  reason: case insensitive filesystem */
public final class C16397a extends h.a {

    /* renamed from: a  reason: collision with root package name */
    private final Gson f138056a;

    private C16397a(Gson gson) {
        this.f138056a = gson;
    }

    public static C16397a f(Gson gson) {
        if (gson != null) {
            return new C16397a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    public h<?, C15775C> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        return new C16398b(this.f138056a, this.f138056a.p(TypeToken.get(type)));
    }

    public h<C15777E, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        return new C16399c(this.f138056a, this.f138056a.p(TypeToken.get(type)));
    }
}
