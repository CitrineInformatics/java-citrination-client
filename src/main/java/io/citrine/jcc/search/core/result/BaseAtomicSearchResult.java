package io.citrine.jcc.search.core.result;

/**
 * Created by maxhutch on 2/13/17.
 */
public class BaseAtomicSearchResult<T> {


    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    private T result;

    private boolean isSuccess;
}
