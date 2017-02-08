package mapview.mailrutest.nitrobubbles.com.mapviewexample.ui.views.mapview

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import mapview.mailrutest.nitrobubbles.com.mapviewexample.R
import mapview.mailrutest.nitrobubbles.com.mapviewexample.core.DEFAULT_LAT
import mapview.mailrutest.nitrobubbles.com.mapviewexample.core.DEFAULT_LNG

/**
 * Created by konstantinaksenov on 08.02.17.
 */

class TileView : ImageView {
    private lateinit var tileId: Pair<Int, Int>

    @JvmOverloads
    constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0, defStyleRes: Int = 0) : super(context, attrs, defStyleAttr, defStyleRes) {
        layoutParams = ViewGroup.LayoutParams(context.resources.getDimension(R.dimen.default_tile_weight).toInt(), context.resources.getDimension(R.dimen.default_tile_height).toInt())
    }

    fun setTilePosition(x: Int, y: Int): TileView {
        tileId = Pair(x, y)
        Picasso.with(context).load("http://b.tile.opencyclemap.org/cycle/16/${DEFAULT_LAT + x}/${DEFAULT_LNG + y}.png").into(this)
        return this
    }

    override fun hashCode(): Int {
        tileId.let {
            return it.first * 31 + it.second
        }
    }

    override fun equals(other: Any?): Boolean {
        when (other) {
            is TileView -> {
                return other.tileId.first == this.tileId.first && other.tileId.second == this.tileId.second
            }
        }
        return false
    }
}