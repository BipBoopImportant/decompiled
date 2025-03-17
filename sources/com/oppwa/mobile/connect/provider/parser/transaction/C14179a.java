package com.oppwa.mobile.connect.provider.parser.transaction;

import com.google.gson.Gson;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.model.response.transaction.TransactionResponse;
import com.oppwa.mobile.connect.provider.parser.C14160a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* renamed from: com.oppwa.mobile.connect.provider.parser.transaction.a  reason: case insensitive filesystem */
abstract class C14179a<T extends TransactionResponse> implements TransactionResponseParser {

    /* renamed from: a  reason: collision with root package name */
    private final Gson f122083a = new Gson();

    /* renamed from: b  reason: collision with root package name */
    private final Type f122084b = ((Type) Optional.ofNullable(a(getClass())).orElseThrow(new i()));

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException a() {
        return new IllegalStateException("Fail to resolve the response type");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Type b(Type[] typeArr) {
        return typeArr[0];
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t10, Transaction transaction);

    public void parse(String str, Transaction transaction) {
        Optional.ofNullable((TransactionResponse) this.f122083a.o(str, this.f122084b)).ifPresent(new m(this, transaction));
    }

    /* access modifiers changed from: private */
    public Type a(Class<?> cls) {
        if (cls.getGenericSuperclass() instanceof ParameterizedType) {
            return (Type) Optional.ofNullable((ParameterizedType) cls.getGenericSuperclass()).map(new C14160a()).filter(new j()).map(new k()).orElse((Object) null);
        }
        return (Type) Optional.ofNullable(cls.getSuperclass()).map(new l(this)).orElse((Object) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Type[] typeArr) {
        return typeArr.length > 0;
    }
}
