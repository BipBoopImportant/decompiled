package p6;

import android.graphics.Bitmap;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import l6.h;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\t\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lp6/a;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "Lcoil3/Bitmap;", "input", "Ll6/h;", "size", "b", "(Landroid/graphics/Bitmap;Ll6/h;LdI/e;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "cacheKey", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: p6.a  reason: case insensitive filesystem */
public abstract class C8627a {
    public abstract String a();

    public abstract Object b(Bitmap bitmap, h hVar, C17164e<? super Bitmap> eVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8627a) && C17542s.e(a(), ((C8627a) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return P.b(getClass()).f() + "(cacheKey=" + a() + ')';
    }
}
