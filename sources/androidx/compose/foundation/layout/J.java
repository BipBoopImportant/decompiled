package androidx.compose.foundation.layout;

import XH.C16807N;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001e\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a&\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\n\u001a*\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\n\u001a>\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0004\u001a\u001e\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0004\u001a\u001e\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0004\u001a&\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\n\u001a*\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\n\u001a>\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0017\u001a\u001d\u0010 \u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010\u0004\u001a\u001d\u0010!\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b!\u0010\u0004\u001a\u001d\u0010\"\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\"\u0010\u0004\u001a'\u0010'\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(\u001a'\u0010*\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020)2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b*\u0010+\u001a'\u0010-\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020,2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b-\u0010.\u001a*\u0010/\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\n\"\u0014\u00102\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00101\"\u0014\u00104\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00101\"\u0014\u00105\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u00101\"\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u0010:\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u00108\"\u0014\u0010<\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u00108\"\u0014\u0010=\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u00108\"\u0014\u0010?\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u00108\"\u0014\u0010@\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Landroidx/compose/ui/d;", "Lc2/h;", "width", "y", "(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;", "height", "i", "size", "t", "v", "(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;", "Lc2/k;", "u", "(Landroidx/compose/ui/d;J)Landroidx/compose/ui/d;", "min", "max", "z", "j", "minWidth", "minHeight", "maxWidth", "maxHeight", "w", "(Landroidx/compose/ui/d;FFFF)Landroidx/compose/ui/d;", "s", "l", "o", "p", "m", "q", "", "fraction", "g", "c", "e", "Li1/c$b;", "align", "", "unbounded", "F", "(Landroidx/compose/ui/d;Li1/c$b;Z)Landroidx/compose/ui/d;", "Li1/c$c;", "B", "(Landroidx/compose/ui/d;Li1/c$c;Z)Landroidx/compose/ui/d;", "Li1/c;", "D", "(Landroidx/compose/ui/d;Li1/c;Z)Landroidx/compose/ui/d;", "a", "Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxWidth", "b", "FillWholeMaxHeight", "FillWholeMaxSize", "Landroidx/compose/foundation/layout/WrapContentElement;", "d", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentWidthCenter", "WrapContentWidthStart", "f", "WrapContentHeightCenter", "WrapContentHeightTop", "h", "WrapContentSizeCenter", "WrapContentSizeTopStart", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class J {

    /* renamed from: a  reason: collision with root package name */
    private static final FillElement f17965a;

    /* renamed from: b  reason: collision with root package name */
    private static final FillElement f17966b;

    /* renamed from: c  reason: collision with root package name */
    private static final FillElement f17967c;

    /* renamed from: d  reason: collision with root package name */
    private static final WrapContentElement f17968d;

    /* renamed from: e  reason: collision with root package name */
    private static final WrapContentElement f17969e;

    /* renamed from: f  reason: collision with root package name */
    private static final WrapContentElement f17970f;

    /* renamed from: g  reason: collision with root package name */
    private static final WrapContentElement f17971g;

    /* renamed from: h  reason: collision with root package name */
    private static final WrapContentElement f17972h;

    /* renamed from: i  reason: collision with root package name */
    private static final WrapContentElement f17973i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17974c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(float f10) {
            super(1);
            this.f17974c = f10;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("height");
            v0Var.c(c2.h.m(this.f17974c));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17975c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f17976d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(float f10, float f11) {
            super(1);
            this.f17975c = f10;
            this.f17976d = f11;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("heightIn");
            v0Var.a().c("min", c2.h.m(this.f17975c));
            v0Var.a().c("max", c2.h.m(this.f17976d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17977c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(float f10) {
            super(1);
            this.f17977c = f10;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("requiredHeight");
            v0Var.c(c2.h.m(this.f17977c));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class d extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17978c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f17979d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(float f10, float f11) {
            super(1);
            this.f17978c = f10;
            this.f17979d = f11;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("requiredHeightIn");
            v0Var.a().c("min", c2.h.m(this.f17978c));
            v0Var.a().c("max", c2.h.m(this.f17979d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class e extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17980c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(float f10) {
            super(1);
            this.f17980c = f10;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("requiredSize");
            v0Var.c(c2.h.m(this.f17980c));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class f extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17981c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f17982d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(float f10, float f11) {
            super(1);
            this.f17981c = f10;
            this.f17982d = f11;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("requiredSize");
            v0Var.a().c("width", c2.h.m(this.f17981c));
            v0Var.a().c("height", c2.h.m(this.f17982d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class g extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17983c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f17984d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f17985e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f17986f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(float f10, float f11, float f12, float f13) {
            super(1);
            this.f17983c = f10;
            this.f17984d = f11;
            this.f17985e = f12;
            this.f17986f = f13;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("requiredSizeIn");
            v0Var.a().c("minWidth", c2.h.m(this.f17983c));
            v0Var.a().c("minHeight", c2.h.m(this.f17984d));
            v0Var.a().c("maxWidth", c2.h.m(this.f17985e));
            v0Var.a().c("maxHeight", c2.h.m(this.f17986f));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class h extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17987c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(float f10) {
            super(1);
            this.f17987c = f10;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("requiredWidth");
            v0Var.c(c2.h.m(this.f17987c));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class i extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17988c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(float f10) {
            super(1);
            this.f17988c = f10;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("size");
            v0Var.c(c2.h.m(this.f17988c));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class j extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17989c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f17990d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(float f10, float f11) {
            super(1);
            this.f17989c = f10;
            this.f17990d = f11;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("size");
            v0Var.a().c("width", c2.h.m(this.f17989c));
            v0Var.a().c("height", c2.h.m(this.f17990d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class k extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17991c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f17992d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f17993e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f17994f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(float f10, float f11, float f12, float f13) {
            super(1);
            this.f17991c = f10;
            this.f17992d = f11;
            this.f17993e = f12;
            this.f17994f = f13;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("sizeIn");
            v0Var.a().c("minWidth", c2.h.m(this.f17991c));
            v0Var.a().c("minHeight", c2.h.m(this.f17992d));
            v0Var.a().c("maxWidth", c2.h.m(this.f17993e));
            v0Var.a().c("maxHeight", c2.h.m(this.f17994f));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class l extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17995c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(float f10) {
            super(1);
            this.f17995c = f10;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("width");
            v0Var.c(c2.h.m(this.f17995c));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class m extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f17996c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f17997d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(float f10, float f11) {
            super(1);
            this.f17996c = f10;
            this.f17997d = f11;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("widthIn");
            v0Var.a().c("min", c2.h.m(this.f17996c));
            v0Var.a().c("max", c2.h.m(this.f17997d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    static {
        FillElement.a aVar = FillElement.f17944g;
        f17965a = aVar.c(1.0f);
        f17966b = aVar.a(1.0f);
        f17967c = aVar.b(1.0f);
        WrapContentElement.a aVar2 = WrapContentElement.f18044i;
        C5437c.a aVar3 = C5437c.f24302a;
        f17968d = aVar2.c(aVar3.g(), false);
        f17969e = aVar2.c(aVar3.k(), false);
        f17970f = aVar2.a(aVar3.i(), false);
        f17971g = aVar2.a(aVar3.l(), false);
        f17972h = aVar2.b(aVar3.e(), false);
        f17973i = aVar2.b(aVar3.o(), false);
    }

    public static /* synthetic */ androidx.compose.ui.d A(androidx.compose.ui.d dVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = c2.h.f23031b.c();
        }
        if ((i10 & 2) != 0) {
            f11 = c2.h.f23031b.c();
        }
        return z(dVar, f10, f11);
    }

    public static final androidx.compose.ui.d B(androidx.compose.ui.d dVar, C5437c.C0386c cVar, boolean z10) {
        C5437c.a aVar = C5437c.f24302a;
        return dVar.s((!C17542s.e(cVar, aVar.i()) || z10) ? (!C17542s.e(cVar, aVar.l()) || z10) ? WrapContentElement.f18044i.a(cVar, z10) : f17971g : f17970f);
    }

    public static /* synthetic */ androidx.compose.ui.d C(androidx.compose.ui.d dVar, C5437c.C0386c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = C5437c.f24302a.i();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return B(dVar, cVar, z10);
    }

    public static final androidx.compose.ui.d D(androidx.compose.ui.d dVar, C5437c cVar, boolean z10) {
        C5437c.a aVar = C5437c.f24302a;
        return dVar.s((!C17542s.e(cVar, aVar.e()) || z10) ? (!C17542s.e(cVar, aVar.o()) || z10) ? WrapContentElement.f18044i.b(cVar, z10) : f17973i : f17972h);
    }

    public static /* synthetic */ androidx.compose.ui.d E(androidx.compose.ui.d dVar, C5437c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = C5437c.f24302a.e();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return D(dVar, cVar, z10);
    }

    public static final androidx.compose.ui.d F(androidx.compose.ui.d dVar, C5437c.b bVar, boolean z10) {
        C5437c.a aVar = C5437c.f24302a;
        return dVar.s((!C17542s.e(bVar, aVar.g()) || z10) ? (!C17542s.e(bVar, aVar.k()) || z10) ? WrapContentElement.f18044i.c(bVar, z10) : f17969e : f17968d);
    }

    public static /* synthetic */ androidx.compose.ui.d G(androidx.compose.ui.d dVar, C5437c.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = C5437c.f24302a.g();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return F(dVar, bVar, z10);
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.s(new UnspecifiedConstraintsElement(f10, f11, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = c2.h.f23031b.c();
        }
        if ((i10 & 2) != 0) {
            f11 = c2.h.f23031b.c();
        }
        return a(dVar, f10, f11);
    }

    public static final androidx.compose.ui.d c(androidx.compose.ui.d dVar, float f10) {
        return dVar.s(f10 == 1.0f ? f17966b : FillElement.f17944g.a(f10));
    }

    public static /* synthetic */ androidx.compose.ui.d d(androidx.compose.ui.d dVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return c(dVar, f10);
    }

    public static final androidx.compose.ui.d e(androidx.compose.ui.d dVar, float f10) {
        return dVar.s(f10 == 1.0f ? f17967c : FillElement.f17944g.b(f10));
    }

    public static /* synthetic */ androidx.compose.ui.d f(androidx.compose.ui.d dVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return e(dVar, f10);
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, float f10) {
        return dVar.s(f10 == 1.0f ? f17965a : FillElement.f17944g.c(f10));
    }

    public static /* synthetic */ androidx.compose.ui.d h(androidx.compose.ui.d dVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return g(dVar, f10);
    }

    public static final androidx.compose.ui.d i(androidx.compose.ui.d dVar, float f10) {
        return dVar.s(new SizeElement(0.0f, f10, 0.0f, f10, true, C5133t0.b() ? new a(f10) : C5133t0.a(), 5, (DefaultConstructorMarker) null));
    }

    public static final androidx.compose.ui.d j(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.s(new SizeElement(0.0f, f10, 0.0f, f11, true, C5133t0.b() ? new b(f10, f11) : C5133t0.a(), 5, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ androidx.compose.ui.d k(androidx.compose.ui.d dVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = c2.h.f23031b.c();
        }
        if ((i10 & 2) != 0) {
            f11 = c2.h.f23031b.c();
        }
        return j(dVar, f10, f11);
    }

    public static final androidx.compose.ui.d l(androidx.compose.ui.d dVar, float f10) {
        return dVar.s(new SizeElement(0.0f, f10, 0.0f, f10, false, C5133t0.b() ? new c(f10) : C5133t0.a(), 5, (DefaultConstructorMarker) null));
    }

    public static final androidx.compose.ui.d m(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.s(new SizeElement(0.0f, f10, 0.0f, f11, false, C5133t0.b() ? new d(f10, f11) : C5133t0.a(), 5, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ androidx.compose.ui.d n(androidx.compose.ui.d dVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = c2.h.f23031b.c();
        }
        if ((i10 & 2) != 0) {
            f11 = c2.h.f23031b.c();
        }
        return m(dVar, f10, f11);
    }

    public static final androidx.compose.ui.d o(androidx.compose.ui.d dVar, float f10) {
        return dVar.s(new SizeElement(f10, f10, f10, f10, false, C5133t0.b() ? new e(f10) : C5133t0.a(), (DefaultConstructorMarker) null));
    }

    public static final androidx.compose.ui.d p(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.s(new SizeElement(f10, f11, f10, f11, false, C5133t0.b() ? new f(f10, f11) : C5133t0.a(), (DefaultConstructorMarker) null));
    }

    public static final androidx.compose.ui.d q(androidx.compose.ui.d dVar, float f10, float f11, float f12, float f13) {
        return dVar.s(new SizeElement(f10, f11, f12, f13, false, C5133t0.b() ? new g(f10, f11, f12, f13) : C5133t0.a(), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ androidx.compose.ui.d r(androidx.compose.ui.d dVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = c2.h.f23031b.c();
        }
        if ((i10 & 2) != 0) {
            f11 = c2.h.f23031b.c();
        }
        if ((i10 & 4) != 0) {
            f12 = c2.h.f23031b.c();
        }
        if ((i10 & 8) != 0) {
            f13 = c2.h.f23031b.c();
        }
        return q(dVar, f10, f11, f12, f13);
    }

    public static final androidx.compose.ui.d s(androidx.compose.ui.d dVar, float f10) {
        return dVar.s(new SizeElement(f10, 0.0f, f10, 0.0f, false, C5133t0.b() ? new h(f10) : C5133t0.a(), 10, (DefaultConstructorMarker) null));
    }

    public static final androidx.compose.ui.d t(androidx.compose.ui.d dVar, float f10) {
        return dVar.s(new SizeElement(f10, f10, f10, f10, true, C5133t0.b() ? new i(f10) : C5133t0.a(), (DefaultConstructorMarker) null));
    }

    public static final androidx.compose.ui.d u(androidx.compose.ui.d dVar, long j10) {
        return v(dVar, c2.k.h(j10), c2.k.g(j10));
    }

    public static final androidx.compose.ui.d v(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.s(new SizeElement(f10, f11, f10, f11, true, C5133t0.b() ? new j(f10, f11) : C5133t0.a(), (DefaultConstructorMarker) null));
    }

    public static final androidx.compose.ui.d w(androidx.compose.ui.d dVar, float f10, float f11, float f12, float f13) {
        return dVar.s(new SizeElement(f10, f11, f12, f13, true, C5133t0.b() ? new k(f10, f11, f12, f13) : C5133t0.a(), (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ androidx.compose.ui.d x(androidx.compose.ui.d dVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = c2.h.f23031b.c();
        }
        if ((i10 & 2) != 0) {
            f11 = c2.h.f23031b.c();
        }
        if ((i10 & 4) != 0) {
            f12 = c2.h.f23031b.c();
        }
        if ((i10 & 8) != 0) {
            f13 = c2.h.f23031b.c();
        }
        return w(dVar, f10, f11, f12, f13);
    }

    public static final androidx.compose.ui.d y(androidx.compose.ui.d dVar, float f10) {
        return dVar.s(new SizeElement(f10, 0.0f, f10, 0.0f, true, C5133t0.b() ? new l(f10) : C5133t0.a(), 10, (DefaultConstructorMarker) null));
    }

    public static final androidx.compose.ui.d z(androidx.compose.ui.d dVar, float f10, float f11) {
        return dVar.s(new SizeElement(f10, 0.0f, f11, 0.0f, true, C5133t0.b() ? new m(f10, f11) : C5133t0.a(), 10, (DefaultConstructorMarker) null));
    }
}
