package dA;

import Zj.d;
import fA.C14438a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tw.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LdA/a;", "", "a", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dA.a  reason: case insensitive filesystem */
public abstract class C14330a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3080a f126167a = new C3080a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LdA/a$a;", "", "<init>", "()V", "LZj/d;", "secureStorageFactory", "LZj/h;", "b", "(LZj/d;)LZj/h;", "Ltw/h;", "networkService", "LfA/a;", "a", "(Ltw/h;)LfA/a;", "", "STORAGE_FILE_NAME", "Ljava/lang/String;", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dA.a$a  reason: collision with other inner class name */
    public static final class C3080a {
        public /* synthetic */ C3080a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C14438a a(h hVar) {
            C17542s.j(hVar, "networkService");
            return (C14438a) hVar.b(C14438a.class);
        }

        public final Zj.h b(d dVar) {
            C17542s.j(dVar, "secureStorageFactory");
            return dVar.a("guest_token");
        }

        private C3080a() {
        }
    }
}
