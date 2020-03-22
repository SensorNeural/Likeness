package com.vladzkv.likeness.domain

import android.content.Intent
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import moxy.viewstate.strategy.alias.Skip

/**
 * File for extensions functions
 */

fun <T> MutableCollection<T>.addAllAndClear(newValues: Collection<T>) {
    clear()
    addAll(newValues)
}

@Skip
fun Fragment.openGalleryForPickingImage(code: Int) {
    Intent(
        Intent.ACTION_PICK,
        MediaStore.Images.Media.EXTERNAL_CONTENT_URI
    ).apply {
        startActivityForResult(Intent.createChooser(this, "111"), code)
    }
}

fun AppCompatActivity.addFragment(fragment: Fragment, frameId: Int){
    supportFragmentManager.inTransaction { add(frameId, fragment) }
}
fun AppCompatActivity.replaceFragment(fragment: Fragment, frameId: Int) {
    supportFragmentManager.inTransaction{replace(frameId, fragment)}
}

inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().func().commit()
}