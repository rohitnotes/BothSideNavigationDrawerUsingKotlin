package both.side.navigation.drawer.using.kotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_favorite.view.*

class FavoriteAdapter(private val itemList: List<String>) : RecyclerView.Adapter<FavoriteAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteAdapter.ViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_favorite, parent,
            false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int
    {
        return itemList.size
    }

    override fun onBindViewHolder(holder: FavoriteAdapter.ViewHolder, position: Int)
    {
        holder.bind()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind()
        {
            val favorite = itemList.get(adapterPosition)
            itemView.tvFavorite.text = favorite
        }
    }
}