package com.vladzkv.likeness.presentation.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vladzkv.likeness.domain.addAllAndClear
import com.vladzkv.likeness.domain.entity.ProjectEntity

/**
 * Created by kirill on 20.03.2020.
 */
class DataAdapter : RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    private val array: MutableList<ProjectEntity> = mutableListOf()
    lateinit var callback: OnItemClick

    fun attachData(newValues: Collection<ProjectEntity>) {
        array.addAllAndClear(newValues = newValues)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = array.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onViewAttachedToWindow(holder: ViewHolder) {
        holder.itemView.setOnClickListener { callback.onClickItem(array[holder.adapterPosition]) }
        super.onViewAttachedToWindow(holder)
    }
    
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            TODO("Not yet implemented")
        }
    }
}