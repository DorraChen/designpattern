/**
 * @author dorra
 * @date 2021/8/11 17:58
 * @description
 */

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handle();
}



