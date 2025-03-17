package j1;

import XH.C16807N;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lj1/i;", "", "<init>", "()V", "", "id", "", "value", "LXH/N;", "b", "(ILjava/lang/String;)LXH/N;", "", "Lj1/h;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j1.i  reason: case insensitive filesystem */
public final class C5478i {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, C5477h> f24680a = new LinkedHashMap();

    public final Map<Integer, C5477h> a() {
        return this.f24680a;
    }

    public final C16807N b(int i10, String str) {
        C17642l<String, C16807N> c10;
        C5477h hVar = this.f24680a.get(Integer.valueOf(i10));
        if (hVar == null || (c10 = hVar.c()) == null) {
            return null;
        }
        c10.invoke(str);
        return C16807N.f139792a;
    }
}
