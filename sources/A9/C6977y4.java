package a9;

import com.contentsquare.android.sdk.C7153u;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

/* renamed from: a9.y4  reason: case insensitive filesystem */
public final class C6977y4 extends C17544u implements C17642l<C7153u, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f42977c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6977y4(int i10) {
        super(1);
        this.f42977c = i10;
    }

    public final Object invoke(Object obj) {
        C7153u uVar = (C7153u) obj;
        C17542s.j(uVar, "jsonView");
        return Boolean.valueOf(uVar.f47644f.getInt("y") < this.f42977c);
    }
}
