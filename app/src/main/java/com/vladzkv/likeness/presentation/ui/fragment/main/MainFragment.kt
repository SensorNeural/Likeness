package com.vladzkv.likeness.presentation.ui.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vladzkv.likeness.R
import com.vladzkv.likeness.presentation.presenter.MainFragmentPresenter
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter

class MainFragment : MvpAppCompatFragment(), MainView {

    @InjectPresenter
    lateinit var presenter: MainFragmentPresenter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = inflater.inflate(R.layout.fragment_main, container, false)
}
