package f0;

import C.U;
import java.util.Objects;

/* renamed from: f0.a  reason: case insensitive filesystem */
public class C5298a {

    /* renamed from: a  reason: collision with root package name */
    private final C0372a f23237a;

    /* renamed from: b  reason: collision with root package name */
    private final U.i f23238b;

    /* renamed from: f0.a$a  reason: collision with other inner class name */
    public enum C0372a {
        PREVIEW_VIEW,
        SCREEN_FLASH_VIEW
    }

    public C5298a(C0372a aVar, U.i iVar) {
        this.f23237a = aVar;
        this.f23238b = iVar;
    }

    public C0372a a() {
        return this.f23237a;
    }

    public U.i b() {
        return this.f23238b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5298a)) {
            return false;
        }
        C5298a aVar = (C5298a) obj;
        return this.f23237a == aVar.f23237a && Objects.equals(this.f23238b, aVar.f23238b);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f23237a, this.f23238b});
    }
}
