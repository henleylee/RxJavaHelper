package com.liyunlong.rxhelper.rxjava;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Disposable辅助类
 *
 * @author liyunlong
 * @date 2017/3/7 17:34
 */
public class DisposableHelper {

    CompositeDisposable compositeDisposable;

    public DisposableHelper() {
        this.compositeDisposable = new CompositeDisposable();
    }

    public void dispose() {
        compositeDisposable.dispose();
    }

    public boolean isDisposed() {
        return compositeDisposable.isDisposed();
    }

    public boolean addDisposable(Disposable disposable) {
        return compositeDisposable.add(disposable);
    }

    public boolean addAllDisposable(Disposable... disposables) {
        return compositeDisposable.addAll(disposables);
    }

    public boolean remove(Disposable disposable) {
        return compositeDisposable.remove(disposable);
    }

    public boolean delete(Disposable disposable) {
        return compositeDisposable.delete(disposable);
    }

    public void clear() {
        compositeDisposable.clear();
    }

    public static boolean isDisposed(Disposable disposable) {
        return disposable != null && disposable.isDisposed();
    }

    public static void dispose(Disposable disposable) {
        if (isDisposed(disposable)) {
            disposable.dispose();
        }
    }
}
