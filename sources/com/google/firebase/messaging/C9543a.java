package com.google.firebase.messaging;

import fc.C9702c;
import fc.C9703d;
import fc.C9704e;
import gc.C9721a;
import gc.C9722b;
import ic.C9833a;
import uc.C10261a;
import uc.C10262b;

/* renamed from: com.google.firebase.messaging.a  reason: case insensitive filesystem */
public final class C9543a implements C9721a {

    /* renamed from: a  reason: collision with root package name */
    public static final C9721a f68369a = new C9543a();

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    private static final class C1179a implements C9703d<C10261a> {

        /* renamed from: a  reason: collision with root package name */
        static final C1179a f68370a = new C1179a();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f68371b = C9702c.a("projectNumber").b(C9833a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final C9702c f68372c = C9702c.a("messageId").b(C9833a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final C9702c f68373d = C9702c.a("instanceId").b(C9833a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final C9702c f68374e = C9702c.a("messageType").b(C9833a.b().c(4).a()).a();

        /* renamed from: f  reason: collision with root package name */
        private static final C9702c f68375f = C9702c.a("sdkPlatform").b(C9833a.b().c(5).a()).a();

        /* renamed from: g  reason: collision with root package name */
        private static final C9702c f68376g = C9702c.a("packageName").b(C9833a.b().c(6).a()).a();

        /* renamed from: h  reason: collision with root package name */
        private static final C9702c f68377h = C9702c.a("collapseKey").b(C9833a.b().c(7).a()).a();

        /* renamed from: i  reason: collision with root package name */
        private static final C9702c f68378i = C9702c.a("priority").b(C9833a.b().c(8).a()).a();

        /* renamed from: j  reason: collision with root package name */
        private static final C9702c f68379j = C9702c.a("ttl").b(C9833a.b().c(9).a()).a();

        /* renamed from: k  reason: collision with root package name */
        private static final C9702c f68380k = C9702c.a("topic").b(C9833a.b().c(10).a()).a();

        /* renamed from: l  reason: collision with root package name */
        private static final C9702c f68381l = C9702c.a("bulkId").b(C9833a.b().c(11).a()).a();

        /* renamed from: m  reason: collision with root package name */
        private static final C9702c f68382m = C9702c.a("event").b(C9833a.b().c(12).a()).a();

        /* renamed from: n  reason: collision with root package name */
        private static final C9702c f68383n = C9702c.a("analyticsLabel").b(C9833a.b().c(13).a()).a();

        /* renamed from: o  reason: collision with root package name */
        private static final C9702c f68384o = C9702c.a("campaignId").b(C9833a.b().c(14).a()).a();

        /* renamed from: p  reason: collision with root package name */
        private static final C9702c f68385p = C9702c.a("composerLabel").b(C9833a.b().c(15).a()).a();

        private C1179a() {
        }

        /* renamed from: b */
        public void a(C10261a aVar, C9704e eVar) {
            eVar.e(f68371b, aVar.l());
            eVar.b(f68372c, aVar.h());
            eVar.b(f68373d, aVar.g());
            eVar.b(f68374e, aVar.i());
            eVar.b(f68375f, aVar.m());
            eVar.b(f68376g, aVar.j());
            eVar.b(f68377h, aVar.d());
            eVar.d(f68378i, aVar.k());
            eVar.d(f68379j, aVar.o());
            eVar.b(f68380k, aVar.n());
            eVar.e(f68381l, aVar.b());
            eVar.b(f68382m, aVar.f());
            eVar.b(f68383n, aVar.a());
            eVar.e(f68384o, aVar.c());
            eVar.b(f68385p, aVar.e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    private static final class b implements C9703d<C10262b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f68386a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f68387b = C9702c.a("messagingClientEvent").b(C9833a.b().c(1).a()).a();

        private b() {
        }

        /* renamed from: b */
        public void a(C10262b bVar, C9704e eVar) {
            eVar.b(f68387b, bVar.a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    private static final class c implements C9703d<K> {

        /* renamed from: a  reason: collision with root package name */
        static final c f68388a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final C9702c f68389b = C9702c.d("messagingClientEventExtension");

        private c() {
        }

        /* renamed from: b */
        public void a(K k10, C9704e eVar) {
            eVar.b(f68389b, k10.b());
        }
    }

    private C9543a() {
    }

    public void a(C9722b<?> bVar) {
        bVar.a(K.class, c.f68388a);
        bVar.a(C10262b.class, b.f68386a);
        bVar.a(C10261a.class, C1179a.f68370a);
    }
}
