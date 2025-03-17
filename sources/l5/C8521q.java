package l5;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: l5.q  reason: case insensitive filesystem */
public final /* synthetic */ class C8521q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C8523t f54727a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f54728b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f54729c;

    public /* synthetic */ C8521q(C8523t tVar, ArrayList arrayList, String str) {
        this.f54727a = tVar;
        this.f54728b = arrayList;
        this.f54729c = str;
    }

    public final Object call() {
        return this.f54727a.m(this.f54728b, this.f54729c);
    }
}
