package com.example.daisymemo.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.realm.Realm


class ListViewModel : ViewModel() {
    private val realm: Realm by lazy {
        Realm.getDefaultInstance()
    }

    private val memoDao: MemoDao by lazy {
        MemoDao(realm)
    }

    val memoLiveData: RealmLiveData<MemoData> by lazy {
        RealmLiveData<MemoData> (memoDao.getAllMemos())
    }

    override fun onCleared() {
        super.onCleared()
        realm.close()
    }
}