package kc;

public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        private a(int i10) {
            this.code = i10;
        }

        public int b() {
            return this.code;
        }
    }

    a b(String str);
}
