package noah;

import clojure.lang.IFn;
import clojure.lang.RT;
import clojure.lang.Symbol;

/**
 * @Description TODO
 * @Author Noah
 * @Date 2018-9-12
 * @Version V1.0
 */
public class InvokeClojureByJava {

    private static IFn requireFn = RT.var("clojure.core", "require");

    static {
        requireFn.invoke(Symbol.intern("tt.core"));
    }

    public static void main(String[] args) {
        new InvokeClojureByJava().countDown(10000);
        RT.var("tt.core", "foo").invoke("clojure");
    }

    public void countDown(long num) {
        RT.var("tt.core", "countdown").invoke(num);
    }

}
