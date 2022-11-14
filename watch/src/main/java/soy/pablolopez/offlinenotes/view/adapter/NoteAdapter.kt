package soy.pablolopez.offlinenotes.view.adapter

import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_note.view.*
import soy.pablolopez.offlinenotes.R
import soy.pablolopez.offlinenotes.domain.Note
import soy.pablolopez.offlinenotes.framework.extension.inflate

class NoteAdapter(
    items: MutableList<Note>,
    listener: Listener<Note>
)
    : BaseAdapter<Note>(items, listener) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(parent.inflate(R.layout.item_note))
    }

    class Holder(itemView: View) : BaseAdapter.Holder<Note>(itemView) {
        override fun View.bindItem(item: Note) {
            initTv(item)
        }

        private fun View.initTv(item: Note) {
            tv.text = item.text
        }
    }
}
