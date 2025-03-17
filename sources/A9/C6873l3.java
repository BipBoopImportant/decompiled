package a9;

import j0.C5444A;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.l3  reason: case insensitive filesystem */
public final class C6873l3 {

    /* renamed from: a  reason: collision with root package name */
    public final a f42681a = new a();

    /* renamed from: a9.l3$a */
    public static final class a extends C5444A<String, Boolean> {
        public a() {
            super(131072);
        }

        public final int j(Object obj, Object obj2) {
            String str = (String) obj;
            ((Boolean) obj2).booleanValue();
            C17542s.j(str, "key");
            return (str.length() * 2) + 16;
        }
    }
}
