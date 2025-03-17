package UI;

import UI.C16583d;
import nI.C17642l;

/* renamed from: UI.a  reason: case insensitive filesystem */
class C16580a implements C17642l {

    /* renamed from: a  reason: collision with root package name */
    private final C16583d f139006a;

    /* renamed from: b  reason: collision with root package name */
    private final C16583d.a f139007b;

    public C16580a(C16583d dVar, C16583d.a aVar) {
        this.f139006a = dVar;
        this.f139007b = aVar;
    }

    public Object invoke(Object obj) {
        return Boolean.valueOf(C16583d.i(this.f139006a, this.f139007b, obj));
    }
}
