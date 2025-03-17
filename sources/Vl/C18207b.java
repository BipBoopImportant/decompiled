package vL;

import HJ.C15854t;
import XH.s;
import YH.C16877v;
import iL.C17397b;
import iL.C17398c;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;
import nI.C17631a;
import nI.C17642l;
import uI.C18055d;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\n\u0010\u0017\u001a\u00060\u0001j\u0002`\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001e\"\u0004\b\u0000\u0010\u001c\"\u0004\b\u0001\u0010\u001d¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LvL/b;", "", "<init>", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "(Ljava/lang/Exception;)Ljava/lang/String;", "LuI/d;", "kClass", "d", "(LuI/d;)Ljava/lang/String;", "c", "()Ljava/lang/String;", "LXH/s;", "b", "()LXH/s;", "LiL/c;", "a", "()LiL/c;", "R", "Lorg/koin/mp/Lockable;", "lock", "Lkotlin/Function0;", "block", "g", "(Ljava/lang/Object;LnI/a;)Ljava/lang/Object;", "K", "V", "", "f", "()Ljava/util/Map;", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vL.b  reason: case insensitive filesystem */
public final class C18207b {

    /* renamed from: a  reason: collision with root package name */
    public static final C18207b f149085a = new C18207b();

    private C18207b() {
    }

    public final C17398c a() {
        return C17397b.f143527a;
    }

    public final s b() {
        return s.SYNCHRONIZED;
    }

    public final String c() {
        String uuid = UUID.randomUUID().toString();
        C17542s.i(uuid, "toString(...)");
        return uuid;
    }

    public final String d(C18055d<?> dVar) {
        C17542s.j(dVar, "kClass");
        String name = C17603a.b(dVar).getName();
        C17542s.i(name, "getName(...)");
        return name;
    }

    public final String e(Exception exc) {
        C17542s.j(exc, "e");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(exc);
        sb2.append("\n\t");
        StackTraceElement[] stackTrace = exc.getStackTrace();
        C17542s.i(stackTrace, "getStackTrace(...)");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            C17542s.i(className, "getClassName(...)");
            if (C15854t.d0(className, "sun.reflect", false, 2, (Object) null)) {
                break;
            }
            arrayList.add(stackTraceElement);
        }
        sb2.append(C16877v.G0(arrayList, "\n\t", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null));
        return sb2.toString();
    }

    public final <K, V> Map<K, V> f() {
        return new ConcurrentHashMap();
    }

    public final <R> R g(Object obj, C17631a<? extends R> aVar) {
        R invoke;
        C17542s.j(obj, "lock");
        C17542s.j(aVar, "block");
        synchronized (obj) {
            invoke = aVar.invoke();
        }
        return invoke;
    }
}
