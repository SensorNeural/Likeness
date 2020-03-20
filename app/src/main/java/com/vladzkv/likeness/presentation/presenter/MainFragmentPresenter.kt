package com.vladzkv.likeness.presentation.presenter

import com.vladzkv.likeness.presentation.ui.fragment.main.MainView
import moxy.InjectViewState
import moxy.MvpPresenter

/**
 * Created by kirill on 20.03.2020.
 */
@InjectViewState
class MainFragmentPresenter : MvpPresenter<MainView>() {
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
    }
}