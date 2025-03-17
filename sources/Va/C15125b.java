package vA;

import IC.C13023e;
import IC.C13026h;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;
import oA.C14867a;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0014\u0010\rj\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"LvA/b;", "", "LIC/e;", "title", "", "icon", "LvA/d;", "uiMode", "description", "<init>", "(Ljava/lang/String;ILIC/e;ILvA/d;LIC/e;)V", "LIC/e;", "n", "()LIC/e;", "I", "m", "()I", "LvA/d;", "v", "()LvA/d;", "b", "Light", "Dark", "System", "settings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vA.b  reason: case insensitive filesystem */
public enum C15125b {
    Light(C13026h.a(C14867a.f129968b), C18146a.f148200Q0, C15127d.Day, (int) null, 8, (C13023e) null),
    Dark(C13026h.a(C14867a.f129967a), C18146a.f148322Y2, C15127d.Night, (int) null, 8, (C13023e) null),
    System(C13026h.a(C14867a.f129969c), C18146a.f148072H7, C15127d.Auto, C13026h.a(C14867a.f129970d));
    
    private final C13023e description;
    private final int icon;
    private final C13023e title;
    private final C15127d uiMode;

    static {
        C15125b[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C15125b(C13023e eVar, int i10, C15127d dVar, C13023e eVar2) {
        this.title = eVar;
        this.icon = i10;
        this.uiMode = dVar;
        this.description = eVar2;
    }

    public static C17220a<C15125b> j() {
        return $ENTRIES;
    }

    public final C13023e b() {
        return this.description;
    }

    public final int m() {
        return this.icon;
    }

    public final C13023e n() {
        return this.title;
    }

    public final C15127d v() {
        return this.uiMode;
    }
}
