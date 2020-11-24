package com.tech387.architecture.util.list_item

import androidx.recyclerview.widget.DiffUtil
import com.tech387.architecture.util.list_item.ListItem

class ListItemDiffCallback(
    private val oldItems: List<ListItem>,
    private val newItems: List<ListItem>) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldItems.size
    }

    override fun getNewListSize(): Int {
        return newItems.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItems[oldItemPosition].areItemsTheSame(newItems[newItemPosition])
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldItems[oldItemPosition].areContentsTheSame(newItems[newItemPosition])
    }
}