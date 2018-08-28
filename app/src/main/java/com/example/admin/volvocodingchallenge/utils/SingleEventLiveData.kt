package com.example.admin.volvocodingchallenge.utils

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer


/**
 * LiveData used to trigger single events. Rather than dispatching an event every single time an observer is in a STARTED or RESUMED state, events are dispatched
 * only when they're triggered.
 *
 * @param <T> The type of data emitted
</T> */

class SingleEventLiveData<T> : MutableLiveData<T>() {


    override fun observe(owner: LifecycleOwner, observer: Observer<T>) {

        super.observe(owner, Observer { t ->

            if (t == null) {
                return@Observer
            }

            observer.onChanged(t)
            setValue(null)
        })
    }

}