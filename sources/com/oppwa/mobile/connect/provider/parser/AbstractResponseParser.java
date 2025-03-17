package com.oppwa.mobile.connect.provider.parser;

import com.google.gson.Gson;
import com.google.gson.p;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

public abstract class AbstractResponseParser<T, S> implements ResponseParser<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Gson f122044a = new Gson();

    /* renamed from: b  reason: collision with root package name */
    private final Type f122045b = ((Type) Optional.ofNullable(a(getClass())).orElseThrow(new C14166g()));

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException a() {
        return new IllegalStateException("Fail to resolve the actual response type");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ p b() {
        return new p("Got null response from Json");
    }

    /* access modifiers changed from: protected */
    public abstract T a(S s10);

    public T parse(String str) {
        return Optional.ofNullable(this.f122044a.o(str, this.f122045b)).map(new C14164e(this)).orElseThrow(new C14165f());
    }

    /* access modifiers changed from: private */
    public Type a(Class<?> cls) {
        if (cls.getGenericSuperclass() instanceof ParameterizedType) {
            return (Type) Optional.ofNullable((ParameterizedType) cls.getGenericSuperclass()).map(new C14160a()).filter(new C14161b()).map(new C14162c()).orElse((Object) null);
        }
        return (Type) Optional.ofNullable(cls.getSuperclass()).map(new C14163d(this)).orElse((Object) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Type b(Type[] typeArr) {
        return typeArr[1];
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Type[] typeArr) {
        return typeArr.length == 2;
    }
}
