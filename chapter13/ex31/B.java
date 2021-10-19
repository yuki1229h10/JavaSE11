package chapter13.ex31;

import java.util.Map;

public class B extends A {
    public void set(Map<String, String> map) {
        set(map.values());
    }
}
