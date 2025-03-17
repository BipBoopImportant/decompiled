package QL;

import GK.C15775C;
import GK.C15777E;
import QL.h;
import VL.w;
import XH.C16807N;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: QL.b  reason: case insensitive filesystem */
final class C16359b extends h.a {

    /* renamed from: QL.b$a */
    static final class a implements h<C15777E, C15777E> {

        /* renamed from: a  reason: collision with root package name */
        static final a f137732a = new a();

        a() {
        }

        /* renamed from: b */
        public C15777E a(C15777E e10) {
            try {
                return C16357C.a(e10);
            } finally {
                e10.close();
            }
        }
    }

    /* renamed from: QL.b$b  reason: collision with other inner class name */
    static final class C3374b implements h<C15775C, C15775C> {

        /* renamed from: a  reason: collision with root package name */
        static final C3374b f137733a = new C3374b();

        C3374b() {
        }

        /* renamed from: b */
        public C15775C a(C15775C c10) {
            return c10;
        }
    }

    /* renamed from: QL.b$c */
    static final class c implements h<C15777E, C15777E> {

        /* renamed from: a  reason: collision with root package name */
        static final c f137734a = new c();

        c() {
        }

        /* renamed from: b */
        public C15777E a(C15777E e10) {
            return e10;
        }
    }

    /* renamed from: QL.b$d */
    static final class d implements h<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        static final d f137735a = new d();

        d() {
        }

        /* renamed from: b */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: QL.b$e */
    static final class e implements h<C15777E, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        static final e f137736a = new e();

        e() {
        }

        /* renamed from: b */
        public C16807N a(C15777E e10) {
            e10.close();
            return C16807N.f139792a;
        }
    }

    /* renamed from: QL.b$f */
    static final class f implements h<C15777E, Void> {

        /* renamed from: a  reason: collision with root package name */
        static final f f137737a = new f();

        f() {
        }

        /* renamed from: b */
        public Void a(C15777E e10) {
            e10.close();
            return null;
        }
    }

    C16359b() {
    }

    public h<?, C15775C> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, y yVar) {
        if (C15775C.class.isAssignableFrom(C16357C.h(type))) {
            return C3374b.f137733a;
        }
        return null;
    }

    public h<C15777E, ?> d(Type type, Annotation[] annotationArr, y yVar) {
        if (type == C15777E.class) {
            return C16357C.l(annotationArr, w.class) ? c.f137734a : a.f137732a;
        }
        if (type == Void.class) {
            return f.f137737a;
        }
        if (C16357C.m(type)) {
            return e.f137736a;
        }
        return null;
    }
}
