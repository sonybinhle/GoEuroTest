package wrapper;

public abstract class AbstractWrapper<T> implements IWrapper {

	protected T obj;

	public AbstractWrapper() {
	}

	public AbstractWrapper(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return (T) this.obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}
