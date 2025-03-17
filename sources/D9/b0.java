package d9;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.C9575h;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.T;
import com.google.protobuf.a0;

public final class b0 extends GeneratedMessageLite<b0, a> implements T {
    public static final int ALPHA_FIELD_NUMBER = 9;
    public static final int BACKGROUND_COLOR_HEX_FIELD_NUMBER = 8;
    public static final int BITMAP_FIELD_NUMBER = 13;
    public static final int BITMAP_HASH_FIELD_NUMBER = 14;
    public static final int CLIP_CHILDREN_FIELD_NUMBER = 12;
    public static final int CONTENT_OFFSET_X_FIELD_NUMBER = 10;
    public static final int CONTENT_OFFSET_Y_FIELD_NUMBER = 11;
    public static final int CORNER_RADIUS_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final b0 DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    public static final int HTML_TEXT_FIELD_NUMBER = 17;
    public static final int INTERACTION_ENABLED_FIELD_NUMBER = 21;
    public static final int IS_BLUR_FIELD_NUMBER = 19;
    public static final int IS_VISIBLE_FIELD_NUMBER = 7;
    public static final int KEYBOARD_TYPE_FIELD_NUMBER = 18;
    private static volatile a0<b0> PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 15;
    public static final int SERIALIZED_TEXT_FIELD_NUMBER = 22;
    public static final int SHADOW_FIELD_NUMBER = 6;
    public static final int TEXT_FIELD_NUMBER = 16;
    public static final int WIDTH_FIELD_NUMBER = 3;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 20;
    private float alpha_;
    private String backgroundColorHex_ = "";
    private int bitField0_;
    private String bitmapHash_ = "";
    private C9575h bitmap_ = C9575h.f69286b;
    private boolean clipChildren_;
    private int contentOffsetX_;
    private int contentOffsetY_;
    private float cornerRadius_;
    private int height_;
    private Z htmlText_;
    private boolean interactionEnabled_;
    private boolean isBlur_;
    private boolean isVisible_;
    private String keyboardType_ = "";
    private int placeholder_;
    private Z serializedText_;
    private a0 shadow_;
    private c0 text_;
    private int width_;
    private int x_;
    private int y_;
    private float z_;

    public static final class a extends GeneratedMessageLite.a<b0, a> implements T {
        private a() {
            super(b0.DEFAULT_INSTANCE);
        }

        public a E(float f10) {
            u();
            ((b0) this.f69206b).u(f10);
            return this;
        }

        public a G(String str) {
            u();
            ((b0) this.f69206b).v(str);
            return this;
        }

        public a H(C9575h hVar) {
            u();
            ((b0) this.f69206b).w(hVar);
            return this;
        }

        public a I(String str) {
            u();
            ((b0) this.f69206b).x(str);
            return this;
        }

        public a K(boolean z10) {
            u();
            ((b0) this.f69206b).y(z10);
            return this;
        }

        public a L(int i10) {
            u();
            ((b0) this.f69206b).z(i10);
            return this;
        }

        public a M(boolean z10) {
            u();
            ((b0) this.f69206b).A(z10);
            return this;
        }

        public a N(int i10) {
            u();
            ((b0) this.f69206b).B(i10);
            return this;
        }

        public a O(int i10) {
            u();
            ((b0) this.f69206b).C(i10);
            return this;
        }

        public a P(int i10) {
            u();
            ((b0) this.f69206b).D(i10);
            return this;
        }
    }

    static {
        b0 b0Var = new b0();
        DEFAULT_INSTANCE = b0Var;
        GeneratedMessageLite.registerDefaultInstance(b0.class, b0Var);
    }

    private b0() {
    }

    /* access modifiers changed from: private */
    public void A(boolean z10) {
        this.bitField0_ |= 64;
        this.isVisible_ = z10;
    }

    /* access modifiers changed from: private */
    public void B(int i10) {
        this.bitField0_ |= 4;
        this.width_ = i10;
    }

    /* access modifiers changed from: private */
    public void C(int i10) {
        this.bitField0_ |= 1;
        this.x_ = i10;
    }

    /* access modifiers changed from: private */
    public void D(int i10) {
        this.bitField0_ |= 2;
        this.y_ = i10;
    }

    public static a t() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* access modifiers changed from: private */
    public void u(float f10) {
        this.bitField0_ |= 256;
        this.alpha_ = f10;
    }

    /* access modifiers changed from: private */
    public void v(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.backgroundColorHex_ = str;
    }

    /* access modifiers changed from: private */
    public void w(C9575h hVar) {
        hVar.getClass();
        this.bitField0_ |= RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
        this.bitmap_ = hVar;
    }

    /* access modifiers changed from: private */
    public void x(String str) {
        str.getClass();
        this.bitField0_ |= 8192;
        this.bitmapHash_ = str;
    }

    /* access modifiers changed from: private */
    public void y(boolean z10) {
        this.bitField0_ |= RecyclerView.n.FLAG_MOVED;
        this.clipChildren_ = z10;
    }

    /* access modifiers changed from: private */
    public void z(int i10) {
        this.bitField0_ |= 8;
        this.height_ = i10;
    }

    public final Object dynamicMethod(GeneratedMessageLite.f fVar, Object obj, Object obj2) {
        switch (C7777x.f50830a[fVar.ordinal()]) {
            case 1:
                return new b0();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001ဏ\u0000\u0002ဏ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ခ\u0004\u0006ဉ\u0005\u0007ဇ\u0006\bለ\u0007\tခ\b\nဏ\t\u000bဏ\n\fဇ\u000b\rည\f\u000eለ\r\u000fဌ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ለ\u0011\u0013ဇ\u0012\u0014ခ\u0013\u0015\u0007\u0016ဉ\u0014", new Object[]{"bitField0_", "x_", "y_", "width_", "height_", "cornerRadius_", "shadow_", "isVisible_", "backgroundColorHex_", "alpha_", "contentOffsetX_", "contentOffsetY_", "clipChildren_", "bitmap_", "bitmapHash_", "placeholder_", "text_", "htmlText_", "keyboardType_", "isBlur_", "z_", "interactionEnabled_", "serializedText_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a0<b0> a0Var = PARSER;
                if (a0Var == null) {
                    synchronized (b0.class) {
                        try {
                            a0Var = PARSER;
                            if (a0Var == null) {
                                a0Var = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                PARSER = a0Var;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return a0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
