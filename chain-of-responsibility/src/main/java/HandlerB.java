/**
 * @author dorra
 * @date 2021/8/11 17:59
 * @description
 */

public class HandlerB extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
        }
    }
}
