package oJ;

import DI.C15558e;
import kotlin.jvm.internal.C17542s;
import uJ.C18113f0;

/* renamed from: oJ.e  reason: case insensitive filesystem */
public class C17703e implements C17705g, C17707i {

    /* renamed from: a  reason: collision with root package name */
    private final C15558e f145295a;

    /* renamed from: b  reason: collision with root package name */
    private final C17703e f145296b;

    /* renamed from: c  reason: collision with root package name */
    private final C15558e f145297c;

    public C17703e(C15558e eVar, C17703e eVar2) {
        C17542s.j(eVar, "classDescriptor");
        this.f145295a = eVar;
        this.f145296b = eVar2 == null ? this : eVar2;
        this.f145297c = eVar;
    }

    /* renamed from: c */
    public C18113f0 getType() {
        C18113f0 r10 = this.f145295a.r();
        C17542s.i(r10, "getDefaultType(...)");
        return r10;
    }

    public boolean equals(Object obj) {
        C15558e eVar = this.f145295a;
        C15558e eVar2 = null;
        C17703e eVar3 = obj instanceof C17703e ? (C17703e) obj : null;
        if (eVar3 != null) {
            eVar2 = eVar3.f145295a;
        }
        return C17542s.e(eVar, eVar2);
    }

    public int hashCode() {
        return this.f145295a.hashCode();
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }

    public final C15558e w() {
        return this.f145295a;
    }
}
