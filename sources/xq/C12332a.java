package xq;

import Q4.h;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y5.C8981d;
import yq.C12499b;
import z5.C9015d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lxq/a;", "Lxq/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ly5/d;", "a", "()Ly5/d;", "Landroid/content/Context;", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xq.a  reason: case insensitive filesystem */
public final class C12332a implements C12333b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f106254a;

    public C12332a(Context context) {
        C17542s.j(context, "context");
        this.f106254a = context;
    }

    public C8981d a() {
        return new C9015d(C12499b.f107208a.a(), this.f106254a, "episod-lib.db", (h.c) null, (h.a) null, 0, false, (Long) null, 248, (DefaultConstructorMarker) null);
    }
}
